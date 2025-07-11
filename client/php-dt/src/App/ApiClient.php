<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * Veeva Vault API v25.1
 * The latest GA version of the Vault REST API.
 * The version of the OpenAPI document: 1.0.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region apiGet
    /**
     * Retrieve API Versions
     * @param \App\DTO\ApiGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function apiGetRaw(
        \App\DTO\ApiGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve API Versions
     * @param \App\DTO\ApiGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function apiGet(
        \App\DTO\ApiGETParameterData $parameters
    ): array
    {
        $response = $this->apiGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve API Versions
     * @param \App\DTO\ApiGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function apiGetResult(
        \App\DTO\ApiGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->apiGet($parameters));
    }
    //endregion

    //region apiMdlComponentsComponentTypeAndRecordNameFilesGet
    /**
     * Retrieve Content File
     * @param \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameFilesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function apiMdlComponentsComponentTypeAndRecordNameFilesGetRaw(
        \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameFilesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/mdl/components/{component_type_and_record_name}/files', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Content File
     * @param \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameFilesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function apiMdlComponentsComponentTypeAndRecordNameFilesGet(
        \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameFilesGETParameterData $parameters
    ): array
    {
        $response = $this->apiMdlComponentsComponentTypeAndRecordNameFilesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Content File
     * @param \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameFilesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function apiMdlComponentsComponentTypeAndRecordNameFilesGetResult(
        \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameFilesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->apiMdlComponentsComponentTypeAndRecordNameFilesGet($parameters));
    }
    //endregion

    //region apiMdlComponentsComponentTypeAndRecordNameGet
    /**
     * Retrieve Component Record (MDL)
     * @param \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function apiMdlComponentsComponentTypeAndRecordNameGetRaw(
        \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/mdl/components/{component_type_and_record_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Component Record (MDL)
     * @param \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function apiMdlComponentsComponentTypeAndRecordNameGet(
        \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameGETParameterData $parameters
    ): array
    {
        $response = $this->apiMdlComponentsComponentTypeAndRecordNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Component Record (MDL)
     * @param \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function apiMdlComponentsComponentTypeAndRecordNameGetResult(
        \App\DTO\ApiMdlComponentsComponentTypeAndRecordNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->apiMdlComponentsComponentTypeAndRecordNameGet($parameters));
    }
    //endregion

    //region apiMdlExecuteAsyncJobIdResultsGet
    /**
     * Retrieve Asynchronous MDL Script Results
     * @param \App\DTO\ApiMdlExecuteAsyncJobIdResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function apiMdlExecuteAsyncJobIdResultsGetRaw(
        \App\DTO\ApiMdlExecuteAsyncJobIdResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/mdl/execute_async/{job_id}/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Asynchronous MDL Script Results
     * @param \App\DTO\ApiMdlExecuteAsyncJobIdResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function apiMdlExecuteAsyncJobIdResultsGet(
        \App\DTO\ApiMdlExecuteAsyncJobIdResultsGETParameterData $parameters
    ): array
    {
        $response = $this->apiMdlExecuteAsyncJobIdResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Asynchronous MDL Script Results
     * @param \App\DTO\ApiMdlExecuteAsyncJobIdResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function apiMdlExecuteAsyncJobIdResultsGetResult(
        \App\DTO\ApiMdlExecuteAsyncJobIdResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->apiMdlExecuteAsyncJobIdResultsGet($parameters));
    }
    //endregion

    //region apiMdlExecuteAsyncPost
    /**
     * Execute MDL Script Asynchronously
     * @param \App\DTO\ApiMdlExecuteAsyncPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function apiMdlExecuteAsyncPostRaw(
        \App\DTO\ApiMdlExecuteAsyncPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/api/mdl/execute_async', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Execute MDL Script Asynchronously
     * @param \App\DTO\ApiMdlExecuteAsyncPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function apiMdlExecuteAsyncPost(
        \App\DTO\ApiMdlExecuteAsyncPOSTParameterData $parameters
    ): array
    {
        $response = $this->apiMdlExecuteAsyncPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Execute MDL Script Asynchronously
     * @param \App\DTO\ApiMdlExecuteAsyncPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function apiMdlExecuteAsyncPostResult(
        \App\DTO\ApiMdlExecuteAsyncPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->apiMdlExecuteAsyncPost($parameters));
    }
    //endregion

    //region apiMdlExecutePost
    /**
     * Execute MDL Script
     * @param \App\DTO\ApiMdlExecutePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function apiMdlExecutePostRaw(
        \App\DTO\ApiMdlExecutePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/api/mdl/execute', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Execute MDL Script
     * @param \App\DTO\ApiMdlExecutePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function apiMdlExecutePost(
        \App\DTO\ApiMdlExecutePOSTParameterData $parameters
    ): array
    {
        $response = $this->apiMdlExecutePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Execute MDL Script
     * @param \App\DTO\ApiMdlExecutePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function apiMdlExecutePostResult(
        \App\DTO\ApiMdlExecutePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->apiMdlExecutePost($parameters));
    }
    //endregion

    //region apiMdlFilesPost
    /**
     * Upload Content File
     * @param \App\DTO\ApiMdlFilesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function apiMdlFilesPostRaw(
        \App\DTO\ApiMdlFilesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/api/mdl/files', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Upload Content File
     * @param \App\DTO\ApiMdlFilesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function apiMdlFilesPost(
        \App\DTO\ApiMdlFilesPOSTParameterData $parameters
    ): array
    {
        $response = $this->apiMdlFilesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Upload Content File
     * @param \App\DTO\ApiMdlFilesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function apiMdlFilesPostResult(
        \App\DTO\ApiMdlFilesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->apiMdlFilesPost($parameters));
    }
    //endregion

    //region audittrailAuditTrailTypeGet
    /**
     * Retrieve Audit Details
     * @param \App\DTO\AudittrailAuditTrailTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audittrailAuditTrailTypeGetRaw(
        \App\DTO\AudittrailAuditTrailTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/audittrail/{audit_trail_type}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Audit Details
     * @param \App\DTO\AudittrailAuditTrailTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audittrailAuditTrailTypeGet(
        \App\DTO\AudittrailAuditTrailTypeGETParameterData $parameters
    ): array
    {
        $response = $this->audittrailAuditTrailTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Audit Details
     * @param \App\DTO\AudittrailAuditTrailTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audittrailAuditTrailTypeGetResult(
        \App\DTO\AudittrailAuditTrailTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->audittrailAuditTrailTypeGet($parameters));
    }
    //endregion

    //region authDiscoveryPost
    /**
     * Authentication Type Discovery
     * @param \App\DTO\AuthDiscoveryPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function authDiscoveryPostRaw(
        \App\DTO\AuthDiscoveryPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/auth/discovery', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Authentication Type Discovery
     * @param \App\DTO\AuthDiscoveryPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function authDiscoveryPost(
        \App\DTO\AuthDiscoveryPOSTParameterData $parameters
    ): array
    {
        $response = $this->authDiscoveryPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Authentication Type Discovery
     * @param \App\DTO\AuthDiscoveryPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function authDiscoveryPostResult(
        \App\DTO\AuthDiscoveryPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->authDiscoveryPost($parameters));
    }
    //endregion

    //region authOauthSessionOathOidcProfileIdPost
    /**
     * OAuth 2.0 / OpenID Connect
     * @param \App\DTO\AuthOauthSessionOathOidcProfileIdPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function authOauthSessionOathOidcProfileIdPostRaw(
        \App\DTO\AuthOauthSessionOathOidcProfileIdPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/auth/oauth/session/{oath_oidc_profile_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * OAuth 2.0 / OpenID Connect
     * @param \App\DTO\AuthOauthSessionOathOidcProfileIdPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function authOauthSessionOathOidcProfileIdPost(
        \App\DTO\AuthOauthSessionOathOidcProfileIdPOSTParameterData $parameters
    ): array
    {
        $response = $this->authOauthSessionOathOidcProfileIdPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * OAuth 2.0 / OpenID Connect
     * @param \App\DTO\AuthOauthSessionOathOidcProfileIdPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function authOauthSessionOathOidcProfileIdPostResult(
        \App\DTO\AuthOauthSessionOathOidcProfileIdPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->authOauthSessionOathOidcProfileIdPost($parameters));
    }
    //endregion

    //region authPost
    /**
     * User Name and Password
     * @param \App\DTO\AuthPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function authPostRaw(
        \App\DTO\AuthPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/auth', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * User Name and Password
     * @param \App\DTO\AuthPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function authPost(
        \App\DTO\AuthPOSTParameterData $parameters
    ): array
    {
        $response = $this->authPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * User Name and Password
     * @param \App\DTO\AuthPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function authPostResult(
        \App\DTO\AuthPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->authPost($parameters));
    }
    //endregion

    //region codeClassNameDelete
    /**
     * Delete Single Source Code File
     * @param \App\DTO\CodeClassNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeClassNameDeleteRaw(
        \App\DTO\CodeClassNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/code/{class_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Source Code File
     * @param \App\DTO\CodeClassNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeClassNameDelete(
        \App\DTO\CodeClassNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->codeClassNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Source Code File
     * @param \App\DTO\CodeClassNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeClassNameDeleteResult(
        \App\DTO\CodeClassNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeClassNameDelete($parameters));
    }
    //endregion

    //region codeClassNameDisablePut
    /**
     * Disable Vault Extension
     * @param \App\DTO\CodeClassNameDisablePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeClassNameDisablePutRaw(
        \App\DTO\CodeClassNameDisablePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/code/{class_name}/disable', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Disable Vault Extension
     * @param \App\DTO\CodeClassNameDisablePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeClassNameDisablePut(
        \App\DTO\CodeClassNameDisablePUTParameterData $parameters
    ): array
    {
        $response = $this->codeClassNameDisablePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Disable Vault Extension
     * @param \App\DTO\CodeClassNameDisablePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeClassNameDisablePutResult(
        \App\DTO\CodeClassNameDisablePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeClassNameDisablePut($parameters));
    }
    //endregion

    //region codeClassNameEnablePut
    /**
     * Enable Vault Extension
     * @param \App\DTO\CodeClassNameEnablePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeClassNameEnablePutRaw(
        \App\DTO\CodeClassNameEnablePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/code/{class_name}/enable', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Enable Vault Extension
     * @param \App\DTO\CodeClassNameEnablePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeClassNameEnablePut(
        \App\DTO\CodeClassNameEnablePUTParameterData $parameters
    ): array
    {
        $response = $this->codeClassNameEnablePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Enable Vault Extension
     * @param \App\DTO\CodeClassNameEnablePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeClassNameEnablePutResult(
        \App\DTO\CodeClassNameEnablePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeClassNameEnablePut($parameters));
    }
    //endregion

    //region codeClassNameGet
    /**
     * Retrieve Single Source Code File
     * @param \App\DTO\CodeClassNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeClassNameGetRaw(
        \App\DTO\CodeClassNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/code/{class_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Single Source Code File
     * @param \App\DTO\CodeClassNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeClassNameGet(
        \App\DTO\CodeClassNameGETParameterData $parameters
    ): array
    {
        $response = $this->codeClassNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Single Source Code File
     * @param \App\DTO\CodeClassNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeClassNameGetResult(
        \App\DTO\CodeClassNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeClassNameGet($parameters));
    }
    //endregion

    //region codeProfilerGet
    /**
     * Retrieve All Profiling Sessions
     * @param \App\DTO\CodeProfilerGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeProfilerGetRaw(
        \App\DTO\CodeProfilerGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/code/profiler', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Profiling Sessions
     * @param \App\DTO\CodeProfilerGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeProfilerGet(
        \App\DTO\CodeProfilerGETParameterData $parameters
    ): array
    {
        $response = $this->codeProfilerGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Profiling Sessions
     * @param \App\DTO\CodeProfilerGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeProfilerGetResult(
        \App\DTO\CodeProfilerGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeProfilerGet($parameters));
    }
    //endregion

    //region codeProfilerPost
    /**
     * Create Profiling Session
     * @param \App\DTO\CodeProfilerPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeProfilerPostRaw(
        \App\DTO\CodeProfilerPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/code/profiler', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Profiling Session
     * @param \App\DTO\CodeProfilerPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeProfilerPost(
        \App\DTO\CodeProfilerPOSTParameterData $parameters
    ): array
    {
        $response = $this->codeProfilerPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Profiling Session
     * @param \App\DTO\CodeProfilerPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeProfilerPostResult(
        \App\DTO\CodeProfilerPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeProfilerPost($parameters));
    }
    //endregion

    //region codeProfilerSessionNameActionsEndPost
    /**
     * End Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameActionsEndPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeProfilerSessionNameActionsEndPostRaw(
        \App\DTO\CodeProfilerSessionNameActionsEndPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/code/profiler/{session_name}/actions/end', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * End Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameActionsEndPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeProfilerSessionNameActionsEndPost(
        \App\DTO\CodeProfilerSessionNameActionsEndPOSTParameterData $parameters
    ): array
    {
        $response = $this->codeProfilerSessionNameActionsEndPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * End Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameActionsEndPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeProfilerSessionNameActionsEndPostResult(
        \App\DTO\CodeProfilerSessionNameActionsEndPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeProfilerSessionNameActionsEndPost($parameters));
    }
    //endregion

    //region codeProfilerSessionNameDelete
    /**
     * Delete Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeProfilerSessionNameDeleteRaw(
        \App\DTO\CodeProfilerSessionNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/code/profiler/{session_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeProfilerSessionNameDelete(
        \App\DTO\CodeProfilerSessionNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->codeProfilerSessionNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeProfilerSessionNameDeleteResult(
        \App\DTO\CodeProfilerSessionNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeProfilerSessionNameDelete($parameters));
    }
    //endregion

    //region codeProfilerSessionNameGet
    /**
     * Retrieve Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeProfilerSessionNameGetRaw(
        \App\DTO\CodeProfilerSessionNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/code/profiler/{session_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeProfilerSessionNameGet(
        \App\DTO\CodeProfilerSessionNameGETParameterData $parameters
    ): array
    {
        $response = $this->codeProfilerSessionNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Profiling Session
     * @param \App\DTO\CodeProfilerSessionNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeProfilerSessionNameGetResult(
        \App\DTO\CodeProfilerSessionNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeProfilerSessionNameGet($parameters));
    }
    //endregion

    //region codeProfilerSessionNameResultsGet
    /**
     * Download Profiling Session Results
     * @param \App\DTO\CodeProfilerSessionNameResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codeProfilerSessionNameResultsGetRaw(
        \App\DTO\CodeProfilerSessionNameResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/code/profiler/{session_name}/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Profiling Session Results
     * @param \App\DTO\CodeProfilerSessionNameResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codeProfilerSessionNameResultsGet(
        \App\DTO\CodeProfilerSessionNameResultsGETParameterData $parameters
    ): array
    {
        $response = $this->codeProfilerSessionNameResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Profiling Session Results
     * @param \App\DTO\CodeProfilerSessionNameResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codeProfilerSessionNameResultsGetResult(
        \App\DTO\CodeProfilerSessionNameResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codeProfilerSessionNameResultsGet($parameters));
    }
    //endregion

    //region codePut
    /**
     * Add or Replace Single Source Code File
     * @param \App\DTO\CodePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function codePutRaw(
        \App\DTO\CodePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/code', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Add or Replace Single Source Code File
     * @param \App\DTO\CodePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function codePut(
        \App\DTO\CodePUTParameterData $parameters
    ): array
    {
        $response = $this->codePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Add or Replace Single Source Code File
     * @param \App\DTO\CodePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function codePutResult(
        \App\DTO\CodePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->codePut($parameters));
    }
    //endregion

    //region compositesTreesEdlHierarchyOrTemplateActionsListnodesPost
    /**
     * Retrieve Specific Root Nodes
     * @param \App\DTO\CompositesTreesEdlHierarchyOrTemplateActionsListnodesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function compositesTreesEdlHierarchyOrTemplateActionsListnodesPostRaw(
        \App\DTO\CompositesTreesEdlHierarchyOrTemplateActionsListnodesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/composites/trees/{edl_hierarchy_or_template}/actions/listnodes', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Specific Root Nodes
     * @param \App\DTO\CompositesTreesEdlHierarchyOrTemplateActionsListnodesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(
        \App\DTO\CompositesTreesEdlHierarchyOrTemplateActionsListnodesPOSTParameterData $parameters
    ): array
    {
        $response = $this->compositesTreesEdlHierarchyOrTemplateActionsListnodesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Specific Root Nodes
     * @param \App\DTO\CompositesTreesEdlHierarchyOrTemplateActionsListnodesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function compositesTreesEdlHierarchyOrTemplateActionsListnodesPostResult(
        \App\DTO\CompositesTreesEdlHierarchyOrTemplateActionsListnodesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->compositesTreesEdlHierarchyOrTemplateActionsListnodesPost($parameters));
    }
    //endregion

    //region compositesTreesEdlHierarchyOrTemplateGet
    /**
     * Retrieve All Root Nodes
     * @param \App\DTO\CompositesTreesEdlHierarchyOrTemplateGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function compositesTreesEdlHierarchyOrTemplateGetRaw(
        \App\DTO\CompositesTreesEdlHierarchyOrTemplateGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/composites/trees/{edl_hierarchy_or_template}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Root Nodes
     * @param \App\DTO\CompositesTreesEdlHierarchyOrTemplateGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function compositesTreesEdlHierarchyOrTemplateGet(
        \App\DTO\CompositesTreesEdlHierarchyOrTemplateGETParameterData $parameters
    ): array
    {
        $response = $this->compositesTreesEdlHierarchyOrTemplateGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Root Nodes
     * @param \App\DTO\CompositesTreesEdlHierarchyOrTemplateGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function compositesTreesEdlHierarchyOrTemplateGetResult(
        \App\DTO\CompositesTreesEdlHierarchyOrTemplateGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->compositesTreesEdlHierarchyOrTemplateGet($parameters));
    }
    //endregion

    //region compositesTreesEdlHierarchyVParentNodeIdChildrenGet
    /**
     * Retrieve a Node's Children
     * @param \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function compositesTreesEdlHierarchyVParentNodeIdChildrenGetRaw(
        \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/composites/trees/edl_hierarchy__v/{parent_node_id}/children', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve a Node's Children
     * @param \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function compositesTreesEdlHierarchyVParentNodeIdChildrenGet(
        \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenGETParameterData $parameters
    ): array
    {
        $response = $this->compositesTreesEdlHierarchyVParentNodeIdChildrenGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve a Node's Children
     * @param \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function compositesTreesEdlHierarchyVParentNodeIdChildrenGetResult(
        \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->compositesTreesEdlHierarchyVParentNodeIdChildrenGet($parameters));
    }
    //endregion

    //region compositesTreesEdlHierarchyVParentNodeIdChildrenPut
    /**
     * Update Node Order
     * @param \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function compositesTreesEdlHierarchyVParentNodeIdChildrenPutRaw(
        \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/composites/trees/edl_hierarchy__v/{parent_node_id}/children', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Node Order
     * @param \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function compositesTreesEdlHierarchyVParentNodeIdChildrenPut(
        \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenPUTParameterData $parameters
    ): array
    {
        $response = $this->compositesTreesEdlHierarchyVParentNodeIdChildrenPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Node Order
     * @param \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function compositesTreesEdlHierarchyVParentNodeIdChildrenPutResult(
        \App\DTO\CompositesTreesEdlHierarchyVParentNodeIdChildrenPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->compositesTreesEdlHierarchyVParentNodeIdChildrenPut($parameters));
    }
    //endregion

    //region configurationComponentTypeAndRecordNameGet
    /**
     * Retrieve Component Record (XML/JSON)
     * @param \App\DTO\ConfigurationComponentTypeAndRecordNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationComponentTypeAndRecordNameGetRaw(
        \App\DTO\ConfigurationComponentTypeAndRecordNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/configuration/{component_type_and_record_name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Component Record (XML/JSON)
     * @param \App\DTO\ConfigurationComponentTypeAndRecordNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationComponentTypeAndRecordNameGet(
        \App\DTO\ConfigurationComponentTypeAndRecordNameGETParameterData $parameters
    ): array
    {
        $response = $this->configurationComponentTypeAndRecordNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Component Record (XML/JSON)
     * @param \App\DTO\ConfigurationComponentTypeAndRecordNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationComponentTypeAndRecordNameGetResult(
        \App\DTO\ConfigurationComponentTypeAndRecordNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationComponentTypeAndRecordNameGet($parameters));
    }
    //endregion

    //region configurationComponentTypeGet
    /**
     * Retrieve Component Record Collection
     * @param \App\DTO\ConfigurationComponentTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationComponentTypeGetRaw(
        \App\DTO\ConfigurationComponentTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/configuration/{component_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Component Record Collection
     * @param \App\DTO\ConfigurationComponentTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationComponentTypeGet(
        \App\DTO\ConfigurationComponentTypeGETParameterData $parameters
    ): array
    {
        $response = $this->configurationComponentTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Component Record Collection
     * @param \App\DTO\ConfigurationComponentTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationComponentTypeGetResult(
        \App\DTO\ConfigurationComponentTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationComponentTypeGet($parameters));
    }
    //endregion

    //region configurationObjectNameAndObjectTypeGet
    /**
     * Retrieve Details from a Specific Object
     * @param \App\DTO\ConfigurationObjectNameAndObjectTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationObjectNameAndObjectTypeGetRaw(
        \App\DTO\ConfigurationObjectNameAndObjectTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/configuration/{object_name_and_object_type}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Details from a Specific Object
     * @param \App\DTO\ConfigurationObjectNameAndObjectTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationObjectNameAndObjectTypeGet(
        \App\DTO\ConfigurationObjectNameAndObjectTypeGETParameterData $parameters
    ): array
    {
        $response = $this->configurationObjectNameAndObjectTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Details from a Specific Object
     * @param \App\DTO\ConfigurationObjectNameAndObjectTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationObjectNameAndObjectTypeGetResult(
        \App\DTO\ConfigurationObjectNameAndObjectTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationObjectNameAndObjectTypeGet($parameters));
    }
    //endregion

    //region configurationObjecttypeGet
    /**
     * Retrieve Details from All Object Types
     * @param \App\DTO\ConfigurationObjecttypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationObjecttypeGetRaw(
        \App\DTO\ConfigurationObjecttypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/configuration/Objecttype', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Details from All Object Types
     * @param \App\DTO\ConfigurationObjecttypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationObjecttypeGet(
        \App\DTO\ConfigurationObjecttypeGETParameterData $parameters
    ): array
    {
        $response = $this->configurationObjecttypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Details from All Object Types
     * @param \App\DTO\ConfigurationObjecttypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationObjecttypeGetResult(
        \App\DTO\ConfigurationObjecttypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationObjecttypeGet($parameters));
    }
    //endregion

    //region configurationRoleAssignmentRuleDelete
    /**
     * Delete Lifecycle Role Assignment Override Rules
     * @param \App\DTO\ConfigurationRoleAssignmentRuleDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationRoleAssignmentRuleDeleteRaw(
        \App\DTO\ConfigurationRoleAssignmentRuleDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/configuration/role_assignment_rule', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Lifecycle Role Assignment Override Rules
     * @param \App\DTO\ConfigurationRoleAssignmentRuleDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationRoleAssignmentRuleDelete(
        \App\DTO\ConfigurationRoleAssignmentRuleDELETEParameterData $parameters
    ): array
    {
        $response = $this->configurationRoleAssignmentRuleDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Lifecycle Role Assignment Override Rules
     * @param \App\DTO\ConfigurationRoleAssignmentRuleDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationRoleAssignmentRuleDeleteResult(
        \App\DTO\ConfigurationRoleAssignmentRuleDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationRoleAssignmentRuleDelete($parameters));
    }
    //endregion

    //region configurationRoleAssignmentRuleGet
    /**
     * Retrieve Lifecycle Role Assignment Rules (Default & Override)
     * @param \App\DTO\ConfigurationRoleAssignmentRuleGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationRoleAssignmentRuleGetRaw(
        \App\DTO\ConfigurationRoleAssignmentRuleGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/configuration/role_assignment_rule', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default & Override)
     * @param \App\DTO\ConfigurationRoleAssignmentRuleGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationRoleAssignmentRuleGet(
        \App\DTO\ConfigurationRoleAssignmentRuleGETParameterData $parameters
    ): array
    {
        $response = $this->configurationRoleAssignmentRuleGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default & Override)
     * @param \App\DTO\ConfigurationRoleAssignmentRuleGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationRoleAssignmentRuleGetResult(
        \App\DTO\ConfigurationRoleAssignmentRuleGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationRoleAssignmentRuleGet($parameters));
    }
    //endregion

    //region configurationRoleAssignmentRulePost
    /**
     * Create Lifecycle Role Assignment Override Rules
     * @param \App\DTO\ConfigurationRoleAssignmentRulePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationRoleAssignmentRulePostRaw(
        \App\DTO\ConfigurationRoleAssignmentRulePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/configuration/role_assignment_rule', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Lifecycle Role Assignment Override Rules
     * @param \App\DTO\ConfigurationRoleAssignmentRulePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationRoleAssignmentRulePost(
        \App\DTO\ConfigurationRoleAssignmentRulePOSTParameterData $parameters
    ): array
    {
        $response = $this->configurationRoleAssignmentRulePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Lifecycle Role Assignment Override Rules
     * @param \App\DTO\ConfigurationRoleAssignmentRulePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationRoleAssignmentRulePostResult(
        \App\DTO\ConfigurationRoleAssignmentRulePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationRoleAssignmentRulePost($parameters));
    }
    //endregion

    //region configurationRoleAssignmentRulePut
    /**
     * Update Lifecycle Role Assignment Rules (Default & Override)
     * @param \App\DTO\ConfigurationRoleAssignmentRulePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function configurationRoleAssignmentRulePutRaw(
        \App\DTO\ConfigurationRoleAssignmentRulePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/configuration/role_assignment_rule', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Lifecycle Role Assignment Rules (Default & Override)
     * @param \App\DTO\ConfigurationRoleAssignmentRulePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function configurationRoleAssignmentRulePut(
        \App\DTO\ConfigurationRoleAssignmentRulePUTParameterData $parameters
    ): array
    {
        $response = $this->configurationRoleAssignmentRulePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Lifecycle Role Assignment Rules (Default & Override)
     * @param \App\DTO\ConfigurationRoleAssignmentRulePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function configurationRoleAssignmentRulePutResult(
        \App\DTO\ConfigurationRoleAssignmentRulePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->configurationRoleAssignmentRulePut($parameters));
    }
    //endregion

    //region delegationLoginPost
    /**
     * Initiate Delegated Session
     * @param \App\DTO\DelegationLoginPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function delegationLoginPostRaw(
        \App\DTO\DelegationLoginPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/delegation/login', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Delegated Session
     * @param \App\DTO\DelegationLoginPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function delegationLoginPost(
        \App\DTO\DelegationLoginPOSTParameterData $parameters
    ): array
    {
        $response = $this->delegationLoginPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Delegated Session
     * @param \App\DTO\DelegationLoginPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function delegationLoginPostResult(
        \App\DTO\DelegationLoginPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->delegationLoginPost($parameters));
    }
    //endregion

    //region delegationVaultsGet
    /**
     * Retrieve Delegations
     * @param \App\DTO\DelegationVaultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function delegationVaultsGetRaw(
        \App\DTO\DelegationVaultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/delegation/vaults', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Delegations
     * @param \App\DTO\DelegationVaultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function delegationVaultsGet(
        \App\DTO\DelegationVaultsGETParameterData $parameters
    ): array
    {
        $response = $this->delegationVaultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Delegations
     * @param \App\DTO\DelegationVaultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function delegationVaultsGetResult(
        \App\DTO\DelegationVaultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->delegationVaultsGet($parameters));
    }
    //endregion

    //region keepAlivePost
    /**
     * Session Keep Alive
     * @param \App\DTO\KeepAlivePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function keepAlivePostRaw(
        \App\DTO\KeepAlivePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/keep-alive', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Session Keep Alive
     * @param \App\DTO\KeepAlivePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function keepAlivePost(
        \App\DTO\KeepAlivePOSTParameterData $parameters
    ): array
    {
        $response = $this->keepAlivePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Session Keep Alive
     * @param \App\DTO\KeepAlivePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function keepAlivePostResult(
        \App\DTO\KeepAlivePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->keepAlivePost($parameters));
    }
    //endregion

    //region limitsGet
    /**
     * Retrieve Limits on Objects
     * @param \App\DTO\LimitsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function limitsGetRaw(
        \App\DTO\LimitsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/limits', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Limits on Objects
     * @param \App\DTO\LimitsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function limitsGet(
        \App\DTO\LimitsGETParameterData $parameters
    ): array
    {
        $response = $this->limitsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Limits on Objects
     * @param \App\DTO\LimitsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function limitsGetResult(
        \App\DTO\LimitsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->limitsGet($parameters));
    }
    //endregion

    //region logsApiUsageGet
    /**
     * Download Daily API Usage
     * @param \App\DTO\LogsApiUsageGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsApiUsageGetRaw(
        \App\DTO\LogsApiUsageGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/logs/api_usage', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Daily API Usage
     * @param \App\DTO\LogsApiUsageGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsApiUsageGet(
        \App\DTO\LogsApiUsageGETParameterData $parameters
    ): array
    {
        $response = $this->logsApiUsageGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Daily API Usage
     * @param \App\DTO\LogsApiUsageGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsApiUsageGetResult(
        \App\DTO\LogsApiUsageGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsApiUsageGet($parameters));
    }
    //endregion

    //region logsCodeDebugGet
    /**
     * Retrieve All Debug Logs
     * @param \App\DTO\LogsCodeDebugGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsCodeDebugGetRaw(
        \App\DTO\LogsCodeDebugGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/logs/code/debug', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Debug Logs
     * @param \App\DTO\LogsCodeDebugGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsCodeDebugGet(
        \App\DTO\LogsCodeDebugGETParameterData $parameters
    ): array
    {
        $response = $this->logsCodeDebugGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Debug Logs
     * @param \App\DTO\LogsCodeDebugGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsCodeDebugGetResult(
        \App\DTO\LogsCodeDebugGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsCodeDebugGet($parameters));
    }
    //endregion

    //region logsCodeDebugIdActionsResetDelete
    /**
     * Delete Debug Log
     * @param \App\DTO\LogsCodeDebugIdActionsResetDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsCodeDebugIdActionsResetDeleteRaw(
        \App\DTO\LogsCodeDebugIdActionsResetDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/logs/code/debug/{id}/actions/reset', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Debug Log
     * @param \App\DTO\LogsCodeDebugIdActionsResetDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsCodeDebugIdActionsResetDelete(
        \App\DTO\LogsCodeDebugIdActionsResetDELETEParameterData $parameters
    ): array
    {
        $response = $this->logsCodeDebugIdActionsResetDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Debug Log
     * @param \App\DTO\LogsCodeDebugIdActionsResetDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsCodeDebugIdActionsResetDeleteResult(
        \App\DTO\LogsCodeDebugIdActionsResetDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsCodeDebugIdActionsResetDelete($parameters));
    }
    //endregion

    //region logsCodeDebugIdActionsResetPost
    /**
     * Reset Debug Log
     * @param \App\DTO\LogsCodeDebugIdActionsResetPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsCodeDebugIdActionsResetPostRaw(
        \App\DTO\LogsCodeDebugIdActionsResetPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/logs/code/debug/{id}/actions/reset', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Reset Debug Log
     * @param \App\DTO\LogsCodeDebugIdActionsResetPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsCodeDebugIdActionsResetPost(
        \App\DTO\LogsCodeDebugIdActionsResetPOSTParameterData $parameters
    ): array
    {
        $response = $this->logsCodeDebugIdActionsResetPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Reset Debug Log
     * @param \App\DTO\LogsCodeDebugIdActionsResetPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsCodeDebugIdActionsResetPostResult(
        \App\DTO\LogsCodeDebugIdActionsResetPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsCodeDebugIdActionsResetPost($parameters));
    }
    //endregion

    //region logsCodeDebugIdFilesGet
    /**
     * Download Debug Log Files
     * @param \App\DTO\LogsCodeDebugIdFilesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsCodeDebugIdFilesGetRaw(
        \App\DTO\LogsCodeDebugIdFilesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/logs/code/debug/{id}/files', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Debug Log Files
     * @param \App\DTO\LogsCodeDebugIdFilesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsCodeDebugIdFilesGet(
        \App\DTO\LogsCodeDebugIdFilesGETParameterData $parameters
    ): array
    {
        $response = $this->logsCodeDebugIdFilesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Debug Log Files
     * @param \App\DTO\LogsCodeDebugIdFilesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsCodeDebugIdFilesGetResult(
        \App\DTO\LogsCodeDebugIdFilesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsCodeDebugIdFilesGet($parameters));
    }
    //endregion

    //region logsCodeDebugIdGet
    /**
     * Retrieve Single Debug Log
     * @param \App\DTO\LogsCodeDebugIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsCodeDebugIdGetRaw(
        \App\DTO\LogsCodeDebugIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/logs/code/debug/{id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Single Debug Log
     * @param \App\DTO\LogsCodeDebugIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsCodeDebugIdGet(
        \App\DTO\LogsCodeDebugIdGETParameterData $parameters
    ): array
    {
        $response = $this->logsCodeDebugIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Single Debug Log
     * @param \App\DTO\LogsCodeDebugIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsCodeDebugIdGetResult(
        \App\DTO\LogsCodeDebugIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsCodeDebugIdGet($parameters));
    }
    //endregion

    //region logsCodeDebugPost
    /**
     * Create Debug Log
     * @param \App\DTO\LogsCodeDebugPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsCodeDebugPostRaw(
        \App\DTO\LogsCodeDebugPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/logs/code/debug', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Debug Log
     * @param \App\DTO\LogsCodeDebugPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsCodeDebugPost(
        \App\DTO\LogsCodeDebugPOSTParameterData $parameters
    ): array
    {
        $response = $this->logsCodeDebugPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Debug Log
     * @param \App\DTO\LogsCodeDebugPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsCodeDebugPostResult(
        \App\DTO\LogsCodeDebugPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsCodeDebugPost($parameters));
    }
    //endregion

    //region logsCodeRuntimeGet
    /**
     * Download SDK Runtime Log
     * @param \App\DTO\LogsCodeRuntimeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function logsCodeRuntimeGetRaw(
        \App\DTO\LogsCodeRuntimeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/logs/code/runtime', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download SDK Runtime Log
     * @param \App\DTO\LogsCodeRuntimeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function logsCodeRuntimeGet(
        \App\DTO\LogsCodeRuntimeGETParameterData $parameters
    ): array
    {
        $response = $this->logsCodeRuntimeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download SDK Runtime Log
     * @param \App\DTO\LogsCodeRuntimeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function logsCodeRuntimeGetResult(
        \App\DTO\LogsCodeRuntimeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->logsCodeRuntimeGet($parameters));
    }
    //endregion

    //region messagesMessageTypeActionsImportPost
    /**
     * Import Bulk Translation File
     * @param \App\DTO\MessagesMessageTypeActionsImportPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function messagesMessageTypeActionsImportPostRaw(
        \App\DTO\MessagesMessageTypeActionsImportPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/messages/{message_type}/actions/import', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Import Bulk Translation File
     * @param \App\DTO\MessagesMessageTypeActionsImportPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function messagesMessageTypeActionsImportPost(
        \App\DTO\MessagesMessageTypeActionsImportPOSTParameterData $parameters
    ): array
    {
        $response = $this->messagesMessageTypeActionsImportPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Import Bulk Translation File
     * @param \App\DTO\MessagesMessageTypeActionsImportPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function messagesMessageTypeActionsImportPostResult(
        \App\DTO\MessagesMessageTypeActionsImportPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->messagesMessageTypeActionsImportPost($parameters));
    }
    //endregion

    //region messagesMessageTypeLanguageLangActionsExportPost
    /**
     * Export Bulk Translation File
     * @param \App\DTO\MessagesMessageTypeLanguageLangActionsExportPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function messagesMessageTypeLanguageLangActionsExportPostRaw(
        \App\DTO\MessagesMessageTypeLanguageLangActionsExportPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/messages/{message_type}/language/{lang}/actions/export', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Bulk Translation File
     * @param \App\DTO\MessagesMessageTypeLanguageLangActionsExportPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function messagesMessageTypeLanguageLangActionsExportPost(
        \App\DTO\MessagesMessageTypeLanguageLangActionsExportPOSTParameterData $parameters
    ): array
    {
        $response = $this->messagesMessageTypeLanguageLangActionsExportPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Bulk Translation File
     * @param \App\DTO\MessagesMessageTypeLanguageLangActionsExportPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function messagesMessageTypeLanguageLangActionsExportPostResult(
        \App\DTO\MessagesMessageTypeLanguageLangActionsExportPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->messagesMessageTypeLanguageLangActionsExportPost($parameters));
    }
    //endregion

    //region metadataAudittrailAuditTrailTypeGet
    /**
     * Retrieve Audit Metadata
     * @param \App\DTO\MetadataAudittrailAuditTrailTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataAudittrailAuditTrailTypeGetRaw(
        \App\DTO\MetadataAudittrailAuditTrailTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/audittrail/{audit_trail_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Audit Metadata
     * @param \App\DTO\MetadataAudittrailAuditTrailTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataAudittrailAuditTrailTypeGet(
        \App\DTO\MetadataAudittrailAuditTrailTypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataAudittrailAuditTrailTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Audit Metadata
     * @param \App\DTO\MetadataAudittrailAuditTrailTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataAudittrailAuditTrailTypeGetResult(
        \App\DTO\MetadataAudittrailAuditTrailTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataAudittrailAuditTrailTypeGet($parameters));
    }
    //endregion

    //region metadataAudittrailGet
    /**
     * Retrieve Audit Types
     * @param \App\DTO\MetadataAudittrailGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataAudittrailGetRaw(
        \App\DTO\MetadataAudittrailGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/audittrail', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Audit Types
     * @param \App\DTO\MetadataAudittrailGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataAudittrailGet(
        \App\DTO\MetadataAudittrailGETParameterData $parameters
    ): array
    {
        $response = $this->metadataAudittrailGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Audit Types
     * @param \App\DTO\MetadataAudittrailGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataAudittrailGetResult(
        \App\DTO\MetadataAudittrailGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataAudittrailGet($parameters));
    }
    //endregion

    //region metadataComponentsComponentTypeGet
    /**
     * Retrieve Component Type Metadata
     * @param \App\DTO\MetadataComponentsComponentTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataComponentsComponentTypeGetRaw(
        \App\DTO\MetadataComponentsComponentTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/components/{component_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Component Type Metadata
     * @param \App\DTO\MetadataComponentsComponentTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataComponentsComponentTypeGet(
        \App\DTO\MetadataComponentsComponentTypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataComponentsComponentTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Component Type Metadata
     * @param \App\DTO\MetadataComponentsComponentTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataComponentsComponentTypeGetResult(
        \App\DTO\MetadataComponentsComponentTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataComponentsComponentTypeGet($parameters));
    }
    //endregion

    //region metadataComponentsGet
    /**
     * Retrieve All Component Metadata
     * @param \App\DTO\MetadataComponentsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataComponentsGetRaw(
        \App\DTO\MetadataComponentsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/components', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Component Metadata
     * @param \App\DTO\MetadataComponentsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataComponentsGet(
        \App\DTO\MetadataComponentsGETParameterData $parameters
    ): array
    {
        $response = $this->metadataComponentsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Component Metadata
     * @param \App\DTO\MetadataComponentsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataComponentsGetResult(
        \App\DTO\MetadataComponentsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataComponentsGet($parameters));
    }
    //endregion

    //region metadataObjectsBindersTemplatesBindernodesGet
    /**
     * Retrieve Binder Template Node Metadata
     * @param \App\DTO\MetadataObjectsBindersTemplatesBindernodesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsBindersTemplatesBindernodesGetRaw(
        \App\DTO\MetadataObjectsBindersTemplatesBindernodesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/binders/templates/bindernodes', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Template Node Metadata
     * @param \App\DTO\MetadataObjectsBindersTemplatesBindernodesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsBindersTemplatesBindernodesGet(
        \App\DTO\MetadataObjectsBindersTemplatesBindernodesGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsBindersTemplatesBindernodesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Template Node Metadata
     * @param \App\DTO\MetadataObjectsBindersTemplatesBindernodesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsBindersTemplatesBindernodesGetResult(
        \App\DTO\MetadataObjectsBindersTemplatesBindernodesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsBindersTemplatesBindernodesGet($parameters));
    }
    //endregion

    //region metadataObjectsBindersTemplatesGet
    /**
     * Retrieve Binder Template Metadata
     * @param \App\DTO\MetadataObjectsBindersTemplatesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsBindersTemplatesGetRaw(
        \App\DTO\MetadataObjectsBindersTemplatesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/binders/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Template Metadata
     * @param \App\DTO\MetadataObjectsBindersTemplatesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsBindersTemplatesGet(
        \App\DTO\MetadataObjectsBindersTemplatesGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsBindersTemplatesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Template Metadata
     * @param \App\DTO\MetadataObjectsBindersTemplatesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsBindersTemplatesGetResult(
        \App\DTO\MetadataObjectsBindersTemplatesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsBindersTemplatesGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet
    /**
     * Retrieve Annotation Placemark Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetRaw(
        \App\DTO\MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/annotations/placemarks/types/{placemark_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Annotation Placemark Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(
        \App\DTO\MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Annotation Placemark Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetResult(
        \App\DTO\MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet
    /**
     * Retrieve Annotation Reference Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetRaw(
        \App\DTO\MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/annotations/references/types/{reference_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Annotation Reference Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(
        \App\DTO\MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Annotation Reference Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetResult(
        \App\DTO\MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet
    /**
     * Retrieve Annotation Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetRaw(
        \App\DTO\MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/annotations/types/{annotation_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Annotation Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(
        \App\DTO\MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Annotation Type Metadata
     * @param \App\DTO\MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetResult(
        \App\DTO\MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet
    /**
     * Retrieve Document Event SubType Metadata
     * @param \App\DTO\MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetRaw(
        \App\DTO\MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/events/{event_type}/types/{event_subtype}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Event SubType Metadata
     * @param \App\DTO\MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(
        \App\DTO\MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Event SubType Metadata
     * @param \App\DTO\MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetResult(
        \App\DTO\MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsEventsGet
    /**
     * Retrieve Document Event Types and Subtypes
     * @param \App\DTO\MetadataObjectsDocumentsEventsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsEventsGetRaw(
        \App\DTO\MetadataObjectsDocumentsEventsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/events', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Event Types and Subtypes
     * @param \App\DTO\MetadataObjectsDocumentsEventsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsEventsGet(
        \App\DTO\MetadataObjectsDocumentsEventsGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsEventsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Event Types and Subtypes
     * @param \App\DTO\MetadataObjectsDocumentsEventsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsEventsGetResult(
        \App\DTO\MetadataObjectsDocumentsEventsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsEventsGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsLockGet
    /**
     * Retrieve Document Lock Metadata
     * @param \App\DTO\MetadataObjectsDocumentsLockGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsLockGetRaw(
        \App\DTO\MetadataObjectsDocumentsLockGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/lock', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Lock Metadata
     * @param \App\DTO\MetadataObjectsDocumentsLockGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsLockGet(
        \App\DTO\MetadataObjectsDocumentsLockGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsLockGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Lock Metadata
     * @param \App\DTO\MetadataObjectsDocumentsLockGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsLockGetResult(
        \App\DTO\MetadataObjectsDocumentsLockGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsLockGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsPropertiesFindCommonPost
    /**
     * Retrieve Common Document Fields
     * @param \App\DTO\MetadataObjectsDocumentsPropertiesFindCommonPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsPropertiesFindCommonPostRaw(
        \App\DTO\MetadataObjectsDocumentsPropertiesFindCommonPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/metadata/objects/documents/properties/find_common', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Common Document Fields
     * @param \App\DTO\MetadataObjectsDocumentsPropertiesFindCommonPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsPropertiesFindCommonPost(
        \App\DTO\MetadataObjectsDocumentsPropertiesFindCommonPOSTParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsPropertiesFindCommonPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Common Document Fields
     * @param \App\DTO\MetadataObjectsDocumentsPropertiesFindCommonPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsPropertiesFindCommonPostResult(
        \App\DTO\MetadataObjectsDocumentsPropertiesFindCommonPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsPropertiesFindCommonPost($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsPropertiesGet
    /**
     * Retrieve All Document Fields
     * @param \App\DTO\MetadataObjectsDocumentsPropertiesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsPropertiesGetRaw(
        \App\DTO\MetadataObjectsDocumentsPropertiesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/properties', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Document Fields
     * @param \App\DTO\MetadataObjectsDocumentsPropertiesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsPropertiesGet(
        \App\DTO\MetadataObjectsDocumentsPropertiesGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsPropertiesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Document Fields
     * @param \App\DTO\MetadataObjectsDocumentsPropertiesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsPropertiesGetResult(
        \App\DTO\MetadataObjectsDocumentsPropertiesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsPropertiesGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsTemplatesGet
    /**
     * Retrieve Document Template Metadata
     * @param \App\DTO\MetadataObjectsDocumentsTemplatesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsTemplatesGetRaw(
        \App\DTO\MetadataObjectsDocumentsTemplatesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Template Metadata
     * @param \App\DTO\MetadataObjectsDocumentsTemplatesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsTemplatesGet(
        \App\DTO\MetadataObjectsDocumentsTemplatesGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsTemplatesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Template Metadata
     * @param \App\DTO\MetadataObjectsDocumentsTemplatesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsTemplatesGetResult(
        \App\DTO\MetadataObjectsDocumentsTemplatesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsTemplatesGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsTypesGet
    /**
     * Retrieve All Document Types
     * @param \App\DTO\MetadataObjectsDocumentsTypesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsTypesGetRaw(
        \App\DTO\MetadataObjectsDocumentsTypesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/types', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Document Types
     * @param \App\DTO\MetadataObjectsDocumentsTypesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsTypesGet(
        \App\DTO\MetadataObjectsDocumentsTypesGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsTypesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Document Types
     * @param \App\DTO\MetadataObjectsDocumentsTypesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsTypesGetResult(
        \App\DTO\MetadataObjectsDocumentsTypesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsTypesGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsTypesTypeGet
    /**
     * Retrieve Document Type
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsTypesTypeGetRaw(
        \App\DTO\MetadataObjectsDocumentsTypesTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/types/{type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Type
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsTypesTypeGet(
        \App\DTO\MetadataObjectsDocumentsTypesTypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsTypesTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Type
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsTypesTypeGetResult(
        \App\DTO\MetadataObjectsDocumentsTypesTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsTypesTypeGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsTypesTypeRelationshipsGet
    /**
     * Retrieve Document Type Relationships
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeRelationshipsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsTypesTypeRelationshipsGetRaw(
        \App\DTO\MetadataObjectsDocumentsTypesTypeRelationshipsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/types/{type}/relationships', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Type Relationships
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeRelationshipsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsTypesTypeRelationshipsGet(
        \App\DTO\MetadataObjectsDocumentsTypesTypeRelationshipsGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsTypesTypeRelationshipsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Type Relationships
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeRelationshipsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsTypesTypeRelationshipsGetResult(
        \App\DTO\MetadataObjectsDocumentsTypesTypeRelationshipsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsTypesTypeRelationshipsGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet
    /**
     * Retrieve Document Classification
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetRaw(
        \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Classification
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(
        \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Classification
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetResult(
        \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet($parameters));
    }
    //endregion

    //region metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet
    /**
     * Retrieve Document Subtype
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetRaw(
        \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/documents/types/{type}/subtypes/{subtype}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Subtype
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(
        \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Subtype
     * @param \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetResult(
        \App\DTO\MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet($parameters));
    }
    //endregion

    //region metadataObjectsGroupsGet
    /**
     * Retrieve Group Metadata
     * @param \App\DTO\MetadataObjectsGroupsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsGroupsGetRaw(
        \App\DTO\MetadataObjectsGroupsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/groups', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Group Metadata
     * @param \App\DTO\MetadataObjectsGroupsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsGroupsGet(
        \App\DTO\MetadataObjectsGroupsGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsGroupsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Group Metadata
     * @param \App\DTO\MetadataObjectsGroupsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsGroupsGetResult(
        \App\DTO\MetadataObjectsGroupsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsGroupsGet($parameters));
    }
    //endregion

    //region metadataObjectsSecuritypoliciesGet
    /**
     * Retrieve Security Policy Metadata
     * @param \App\DTO\MetadataObjectsSecuritypoliciesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsSecuritypoliciesGetRaw(
        \App\DTO\MetadataObjectsSecuritypoliciesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/securitypolicies', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Security Policy Metadata
     * @param \App\DTO\MetadataObjectsSecuritypoliciesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsSecuritypoliciesGet(
        \App\DTO\MetadataObjectsSecuritypoliciesGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsSecuritypoliciesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Security Policy Metadata
     * @param \App\DTO\MetadataObjectsSecuritypoliciesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsSecuritypoliciesGetResult(
        \App\DTO\MetadataObjectsSecuritypoliciesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsSecuritypoliciesGet($parameters));
    }
    //endregion

    //region metadataObjectsUsersGet
    /**
     * Retrieve User Metadata
     * @param \App\DTO\MetadataObjectsUsersGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataObjectsUsersGetRaw(
        \App\DTO\MetadataObjectsUsersGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/objects/users', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve User Metadata
     * @param \App\DTO\MetadataObjectsUsersGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataObjectsUsersGet(
        \App\DTO\MetadataObjectsUsersGETParameterData $parameters
    ): array
    {
        $response = $this->metadataObjectsUsersGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve User Metadata
     * @param \App\DTO\MetadataObjectsUsersGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataObjectsUsersGetResult(
        \App\DTO\MetadataObjectsUsersGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataObjectsUsersGet($parameters));
    }
    //endregion

    //region metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet
    /**
     * Retrieve Archived Document Signature Metadata
     * @param \App\DTO\MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetRaw(
        \App\DTO\MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/query/archived_documents/relationships/document_signature__sysr', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Archived Document Signature Metadata
     * @param \App\DTO\MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(
        \App\DTO\MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
    ): array
    {
        $response = $this->metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Archived Document Signature Metadata
     * @param \App\DTO\MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetResult(
        \App\DTO\MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet($parameters));
    }
    //endregion

    //region metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet
    /**
     * Retrieve Document Signature Metadata
     * @param \App\DTO\MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetRaw(
        \App\DTO\MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/query/documents/relationships/document_signature__sysr', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Signature Metadata
     * @param \App\DTO\MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(
        \App\DTO\MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
    ): array
    {
        $response = $this->metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Signature Metadata
     * @param \App\DTO\MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetResult(
        \App\DTO\MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet($parameters));
    }
    //endregion

    //region metadataVobjectsGet
    /**
     * Retrieve Object Collection
     * @param \App\DTO\MetadataVobjectsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataVobjectsGetRaw(
        \App\DTO\MetadataVobjectsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/vobjects', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Collection
     * @param \App\DTO\MetadataVobjectsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataVobjectsGet(
        \App\DTO\MetadataVobjectsGETParameterData $parameters
    ): array
    {
        $response = $this->metadataVobjectsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Collection
     * @param \App\DTO\MetadataVobjectsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataVobjectsGetResult(
        \App\DTO\MetadataVobjectsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataVobjectsGet($parameters));
    }
    //endregion

    //region metadataVobjectsObjectNameActionsCanceldeploymentPost
    /**
     * Cancel Raw Object Deployment
     * @param \App\DTO\MetadataVobjectsObjectNameActionsCanceldeploymentPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataVobjectsObjectNameActionsCanceldeploymentPostRaw(
        \App\DTO\MetadataVobjectsObjectNameActionsCanceldeploymentPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/metadata/vobjects/{object_name}/actions/canceldeployment', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancel Raw Object Deployment
     * @param \App\DTO\MetadataVobjectsObjectNameActionsCanceldeploymentPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataVobjectsObjectNameActionsCanceldeploymentPost(
        \App\DTO\MetadataVobjectsObjectNameActionsCanceldeploymentPOSTParameterData $parameters
    ): array
    {
        $response = $this->metadataVobjectsObjectNameActionsCanceldeploymentPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancel Raw Object Deployment
     * @param \App\DTO\MetadataVobjectsObjectNameActionsCanceldeploymentPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataVobjectsObjectNameActionsCanceldeploymentPostResult(
        \App\DTO\MetadataVobjectsObjectNameActionsCanceldeploymentPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataVobjectsObjectNameActionsCanceldeploymentPost($parameters));
    }
    //endregion

    //region metadataVobjectsObjectNameFieldsObjectFieldNameGet
    /**
     * Retrieve Object Field Metadata
     * @param \App\DTO\MetadataVobjectsObjectNameFieldsObjectFieldNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataVobjectsObjectNameFieldsObjectFieldNameGetRaw(
        \App\DTO\MetadataVobjectsObjectNameFieldsObjectFieldNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/vobjects/{object_name}/fields/{object_field_name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Field Metadata
     * @param \App\DTO\MetadataVobjectsObjectNameFieldsObjectFieldNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataVobjectsObjectNameFieldsObjectFieldNameGet(
        \App\DTO\MetadataVobjectsObjectNameFieldsObjectFieldNameGETParameterData $parameters
    ): array
    {
        $response = $this->metadataVobjectsObjectNameFieldsObjectFieldNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Field Metadata
     * @param \App\DTO\MetadataVobjectsObjectNameFieldsObjectFieldNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataVobjectsObjectNameFieldsObjectFieldNameGetResult(
        \App\DTO\MetadataVobjectsObjectNameFieldsObjectFieldNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataVobjectsObjectNameFieldsObjectFieldNameGet($parameters));
    }
    //endregion

    //region metadataVobjectsObjectNameGet
    /**
     * Retrieve Object Metadata
     * @param \App\DTO\MetadataVobjectsObjectNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataVobjectsObjectNameGetRaw(
        \App\DTO\MetadataVobjectsObjectNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/vobjects/{object_name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Metadata
     * @param \App\DTO\MetadataVobjectsObjectNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataVobjectsObjectNameGet(
        \App\DTO\MetadataVobjectsObjectNameGETParameterData $parameters
    ): array
    {
        $response = $this->metadataVobjectsObjectNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Metadata
     * @param \App\DTO\MetadataVobjectsObjectNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataVobjectsObjectNameGetResult(
        \App\DTO\MetadataVobjectsObjectNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataVobjectsObjectNameGet($parameters));
    }
    //endregion

    //region metadataVobjectsObjectNamePageLayoutsGet
    /**
     * Retrieve Page Layouts
     * @param \App\DTO\MetadataVobjectsObjectNamePageLayoutsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataVobjectsObjectNamePageLayoutsGetRaw(
        \App\DTO\MetadataVobjectsObjectNamePageLayoutsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/vobjects/{object_name}/page_layouts', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Page Layouts
     * @param \App\DTO\MetadataVobjectsObjectNamePageLayoutsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataVobjectsObjectNamePageLayoutsGet(
        \App\DTO\MetadataVobjectsObjectNamePageLayoutsGETParameterData $parameters
    ): array
    {
        $response = $this->metadataVobjectsObjectNamePageLayoutsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Page Layouts
     * @param \App\DTO\MetadataVobjectsObjectNamePageLayoutsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataVobjectsObjectNamePageLayoutsGetResult(
        \App\DTO\MetadataVobjectsObjectNamePageLayoutsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataVobjectsObjectNamePageLayoutsGet($parameters));
    }
    //endregion

    //region metadataVobjectsObjectNamePageLayoutsLayoutNameGet
    /**
     * Retrieve Page Layout Metadata
     * @param \App\DTO\MetadataVobjectsObjectNamePageLayoutsLayoutNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metadataVobjectsObjectNamePageLayoutsLayoutNameGetRaw(
        \App\DTO\MetadataVobjectsObjectNamePageLayoutsLayoutNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/metadata/vobjects/{object_name}/page_layouts/{layout_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Page Layout Metadata
     * @param \App\DTO\MetadataVobjectsObjectNamePageLayoutsLayoutNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metadataVobjectsObjectNamePageLayoutsLayoutNameGet(
        \App\DTO\MetadataVobjectsObjectNamePageLayoutsLayoutNameGETParameterData $parameters
    ): array
    {
        $response = $this->metadataVobjectsObjectNamePageLayoutsLayoutNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Page Layout Metadata
     * @param \App\DTO\MetadataVobjectsObjectNamePageLayoutsLayoutNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metadataVobjectsObjectNamePageLayoutsLayoutNameGetResult(
        \App\DTO\MetadataVobjectsObjectNamePageLayoutsLayoutNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->metadataVobjectsObjectNamePageLayoutsLayoutNameGet($parameters));
    }
    //endregion

    //region notificationsHistoriesGet
    /**
     * Retrieve Email Notification Histories
     * @param \App\DTO\NotificationsHistoriesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function notificationsHistoriesGetRaw(
        \App\DTO\NotificationsHistoriesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/notifications/histories', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Email Notification Histories
     * @param \App\DTO\NotificationsHistoriesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function notificationsHistoriesGet(
        \App\DTO\NotificationsHistoriesGETParameterData $parameters
    ): array
    {
        $response = $this->notificationsHistoriesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Email Notification Histories
     * @param \App\DTO\NotificationsHistoriesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function notificationsHistoriesGetResult(
        \App\DTO\NotificationsHistoriesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->notificationsHistoriesGet($parameters));
    }
    //endregion

    //region objectWorkflowActionsActionGet
    /**
     * Retrieve Bulk Workflow Action Details
     * @param \App\DTO\ObjectWorkflowActionsActionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectWorkflowActionsActionGetRaw(
        \App\DTO\ObjectWorkflowActionsActionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/object/workflow/actions/{action}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Bulk Workflow Action Details
     * @param \App\DTO\ObjectWorkflowActionsActionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectWorkflowActionsActionGet(
        \App\DTO\ObjectWorkflowActionsActionGETParameterData $parameters
    ): array
    {
        $response = $this->objectWorkflowActionsActionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Bulk Workflow Action Details
     * @param \App\DTO\ObjectWorkflowActionsActionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectWorkflowActionsActionGetResult(
        \App\DTO\ObjectWorkflowActionsActionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectWorkflowActionsActionGet($parameters));
    }
    //endregion

    //region objectWorkflowActionsActionPost
    /**
     * Initiate Workflow Actions on Multiple Workflows
     * @param \App\DTO\ObjectWorkflowActionsActionPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectWorkflowActionsActionPostRaw(
        \App\DTO\ObjectWorkflowActionsActionPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/object/workflow/actions/{action}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Workflow Actions on Multiple Workflows
     * @param \App\DTO\ObjectWorkflowActionsActionPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectWorkflowActionsActionPost(
        \App\DTO\ObjectWorkflowActionsActionPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectWorkflowActionsActionPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Workflow Actions on Multiple Workflows
     * @param \App\DTO\ObjectWorkflowActionsActionPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectWorkflowActionsActionPostResult(
        \App\DTO\ObjectWorkflowActionsActionPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectWorkflowActionsActionPost($parameters));
    }
    //endregion

    //region objectWorkflowActionsCanceltasksPost
    /**
     * Cancel Workflow Tasks
     * @param \App\DTO\ObjectWorkflowActionsCanceltasksPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectWorkflowActionsCanceltasksPostRaw(
        \App\DTO\ObjectWorkflowActionsCanceltasksPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/object/workflow/actions/canceltasks', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancel Workflow Tasks
     * @param \App\DTO\ObjectWorkflowActionsCanceltasksPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectWorkflowActionsCanceltasksPost(
        \App\DTO\ObjectWorkflowActionsCanceltasksPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectWorkflowActionsCanceltasksPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancel Workflow Tasks
     * @param \App\DTO\ObjectWorkflowActionsCanceltasksPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectWorkflowActionsCanceltasksPostResult(
        \App\DTO\ObjectWorkflowActionsCanceltasksPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectWorkflowActionsCanceltasksPost($parameters));
    }
    //endregion

    //region objectWorkflowActionsCancelworkflowsPost
    /**
     * Cancel Workflows
     * @param \App\DTO\ObjectWorkflowActionsCancelworkflowsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectWorkflowActionsCancelworkflowsPostRaw(
        \App\DTO\ObjectWorkflowActionsCancelworkflowsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/object/workflow/actions/cancelworkflows', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancel Workflows
     * @param \App\DTO\ObjectWorkflowActionsCancelworkflowsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectWorkflowActionsCancelworkflowsPost(
        \App\DTO\ObjectWorkflowActionsCancelworkflowsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectWorkflowActionsCancelworkflowsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancel Workflows
     * @param \App\DTO\ObjectWorkflowActionsCancelworkflowsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectWorkflowActionsCancelworkflowsPostResult(
        \App\DTO\ObjectWorkflowActionsCancelworkflowsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectWorkflowActionsCancelworkflowsPost($parameters));
    }
    //endregion

    //region objectWorkflowActionsGet
    /**
     * Retrieve Bulk Workflow Actions
     * @param \App\DTO\ObjectWorkflowActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectWorkflowActionsGetRaw(
        \App\DTO\ObjectWorkflowActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/object/workflow/actions', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Bulk Workflow Actions
     * @param \App\DTO\ObjectWorkflowActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectWorkflowActionsGet(
        \App\DTO\ObjectWorkflowActionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectWorkflowActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Bulk Workflow Actions
     * @param \App\DTO\ObjectWorkflowActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectWorkflowActionsGetResult(
        \App\DTO\ObjectWorkflowActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectWorkflowActionsGet($parameters));
    }
    //endregion

    //region objectWorkflowActionsReassigntasksPost
    /**
     * Reassign Workflow Tasks
     * @param \App\DTO\ObjectWorkflowActionsReassigntasksPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectWorkflowActionsReassigntasksPostRaw(
        \App\DTO\ObjectWorkflowActionsReassigntasksPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/object/workflow/actions/reassigntasks', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Reassign Workflow Tasks
     * @param \App\DTO\ObjectWorkflowActionsReassigntasksPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectWorkflowActionsReassigntasksPost(
        \App\DTO\ObjectWorkflowActionsReassigntasksPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectWorkflowActionsReassigntasksPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Reassign Workflow Tasks
     * @param \App\DTO\ObjectWorkflowActionsReassigntasksPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectWorkflowActionsReassigntasksPostResult(
        \App\DTO\ObjectWorkflowActionsReassigntasksPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectWorkflowActionsReassigntasksPost($parameters));
    }
    //endregion

    //region objectWorkflowActionsReplaceworkflowownerPost
    /**
     * Replace Workflow Owner
     * @param \App\DTO\ObjectWorkflowActionsReplaceworkflowownerPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectWorkflowActionsReplaceworkflowownerPostRaw(
        \App\DTO\ObjectWorkflowActionsReplaceworkflowownerPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/object/workflow/actions/replaceworkflowowner', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Replace Workflow Owner
     * @param \App\DTO\ObjectWorkflowActionsReplaceworkflowownerPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectWorkflowActionsReplaceworkflowownerPost(
        \App\DTO\ObjectWorkflowActionsReplaceworkflowownerPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectWorkflowActionsReplaceworkflowownerPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Replace Workflow Owner
     * @param \App\DTO\ObjectWorkflowActionsReplaceworkflowownerPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectWorkflowActionsReplaceworkflowownerPostResult(
        \App\DTO\ObjectWorkflowActionsReplaceworkflowownerPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectWorkflowActionsReplaceworkflowownerPost($parameters));
    }
    //endregion

    //region objectsBindersActionsExportJobIdResultsGet
    /**
     * Retrieve Binder Export Results
     * @param \App\DTO\ObjectsBindersActionsExportJobIdResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersActionsExportJobIdResultsGetRaw(
        \App\DTO\ObjectsBindersActionsExportJobIdResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/actions/export/{job_id}/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Export Results
     * @param \App\DTO\ObjectsBindersActionsExportJobIdResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersActionsExportJobIdResultsGet(
        \App\DTO\ObjectsBindersActionsExportJobIdResultsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersActionsExportJobIdResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Export Results
     * @param \App\DTO\ObjectsBindersActionsExportJobIdResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersActionsExportJobIdResultsGetResult(
        \App\DTO\ObjectsBindersActionsExportJobIdResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersActionsExportJobIdResultsGet($parameters));
    }
    //endregion

    //region objectsBindersBinderIdActionsExportPost
    /**
     * Export Binder (Latest Version)
     * @param \App\DTO\ObjectsBindersBinderIdActionsExportPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdActionsExportPostRaw(
        \App\DTO\ObjectsBindersBinderIdActionsExportPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{binder_id}/actions/export', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Binder (Latest Version)
     * @param \App\DTO\ObjectsBindersBinderIdActionsExportPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdActionsExportPost(
        \App\DTO\ObjectsBindersBinderIdActionsExportPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdActionsExportPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Binder (Latest Version)
     * @param \App\DTO\ObjectsBindersBinderIdActionsExportPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdActionsExportPostResult(
        \App\DTO\ObjectsBindersBinderIdActionsExportPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdActionsExportPost($parameters));
    }
    //endregion

    //region objectsBindersBinderIdActionsPost
    /**
     * Refresh Binder Auto-Filing
     * @param \App\DTO\ObjectsBindersBinderIdActionsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdActionsPostRaw(
        \App\DTO\ObjectsBindersBinderIdActionsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{binder_id}/actions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Refresh Binder Auto-Filing
     * @param \App\DTO\ObjectsBindersBinderIdActionsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdActionsPost(
        \App\DTO\ObjectsBindersBinderIdActionsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdActionsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Refresh Binder Auto-Filing
     * @param \App\DTO\ObjectsBindersBinderIdActionsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdActionsPostResult(
        \App\DTO\ObjectsBindersBinderIdActionsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdActionsPost($parameters));
    }
    //endregion

    //region objectsBindersBinderIdBindingRulePut
    /**
     * Update Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdBindingRulePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdBindingRulePutRaw(
        \App\DTO\ObjectsBindersBinderIdBindingRulePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{binder_id}/binding_rule', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdBindingRulePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdBindingRulePut(
        \App\DTO\ObjectsBindersBinderIdBindingRulePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdBindingRulePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdBindingRulePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdBindingRulePutResult(
        \App\DTO\ObjectsBindersBinderIdBindingRulePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdBindingRulePut($parameters));
    }
    //endregion

    //region objectsBindersBinderIdDelete
    /**
     * Delete Binder
     * @param \App\DTO\ObjectsBindersBinderIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdDeleteRaw(
        \App\DTO\ObjectsBindersBinderIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/binders/{binder_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Binder
     * @param \App\DTO\ObjectsBindersBinderIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdDelete(
        \App\DTO\ObjectsBindersBinderIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Binder
     * @param \App\DTO\ObjectsBindersBinderIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdDeleteResult(
        \App\DTO\ObjectsBindersBinderIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdDelete($parameters));
    }
    //endregion

    //region objectsBindersBinderIdDocumentsNodeIdBindingRulePut
    /**
     * Update Binder Document Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsNodeIdBindingRulePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdDocumentsNodeIdBindingRulePutRaw(
        \App\DTO\ObjectsBindersBinderIdDocumentsNodeIdBindingRulePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{binder_id}/documents/{node_id}/binding_rule', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Binder Document Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsNodeIdBindingRulePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdDocumentsNodeIdBindingRulePut(
        \App\DTO\ObjectsBindersBinderIdDocumentsNodeIdBindingRulePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdDocumentsNodeIdBindingRulePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Binder Document Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsNodeIdBindingRulePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdDocumentsNodeIdBindingRulePutResult(
        \App\DTO\ObjectsBindersBinderIdDocumentsNodeIdBindingRulePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdDocumentsNodeIdBindingRulePut($parameters));
    }
    //endregion

    //region objectsBindersBinderIdDocumentsPost
    /**
     * Add Document to Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdDocumentsPostRaw(
        \App\DTO\ObjectsBindersBinderIdDocumentsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{binder_id}/documents', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Add Document to Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdDocumentsPost(
        \App\DTO\ObjectsBindersBinderIdDocumentsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdDocumentsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Add Document to Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdDocumentsPostResult(
        \App\DTO\ObjectsBindersBinderIdDocumentsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdDocumentsPost($parameters));
    }
    //endregion

    //region objectsBindersBinderIdDocumentsSectionIdDelete
    /**
     * Remove Document from Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdDocumentsSectionIdDeleteRaw(
        \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/binders/{binder_id}/documents/{section_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Remove Document from Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdDocumentsSectionIdDelete(
        \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdDocumentsSectionIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Remove Document from Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdDocumentsSectionIdDeleteResult(
        \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdDocumentsSectionIdDelete($parameters));
    }
    //endregion

    //region objectsBindersBinderIdDocumentsSectionIdPut
    /**
     * Move Document in Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdDocumentsSectionIdPutRaw(
        \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{binder_id}/documents/{section_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Move Document in Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdDocumentsSectionIdPut(
        \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdDocumentsSectionIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Move Document in Binder
     * @param \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdDocumentsSectionIdPutResult(
        \App\DTO\ObjectsBindersBinderIdDocumentsSectionIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdDocumentsSectionIdPut($parameters));
    }
    //endregion

    //region objectsBindersBinderIdGet
    /**
     * Retrieve Binder
     * @param \App\DTO\ObjectsBindersBinderIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdGetRaw(
        \App\DTO\ObjectsBindersBinderIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{binder_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder
     * @param \App\DTO\ObjectsBindersBinderIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdGet(
        \App\DTO\ObjectsBindersBinderIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder
     * @param \App\DTO\ObjectsBindersBinderIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdGetResult(
        \App\DTO\ObjectsBindersBinderIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdGet($parameters));
    }
    //endregion

    //region objectsBindersBinderIdPost
    /**
     * Create Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdPostRaw(
        \App\DTO\ObjectsBindersBinderIdPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{binder_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdPost(
        \App\DTO\ObjectsBindersBinderIdPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdPostResult(
        \App\DTO\ObjectsBindersBinderIdPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdPost($parameters));
    }
    //endregion

    //region objectsBindersBinderIdPut
    /**
     * Update Binder
     * @param \App\DTO\ObjectsBindersBinderIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdPutRaw(
        \App\DTO\ObjectsBindersBinderIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{binder_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Binder
     * @param \App\DTO\ObjectsBindersBinderIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdPut(
        \App\DTO\ObjectsBindersBinderIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Binder
     * @param \App\DTO\ObjectsBindersBinderIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdPutResult(
        \App\DTO\ObjectsBindersBinderIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdPut($parameters));
    }
    //endregion

    //region objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete
    /**
     * Remove Users & Groups from Roles on a Single Binder
     * @param \App\DTO\ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteRaw(
        \App\DTO\ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Remove Users & Groups from Roles on a Single Binder
     * @param \App\DTO\ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(
        \App\DTO\ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Remove Users & Groups from Roles on a Single Binder
     * @param \App\DTO\ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteResult(
        \App\DTO\ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete($parameters));
    }
    //endregion

    //region objectsBindersBinderIdSectionsNodeIdBindingRulePut
    /**
     * Update Binder Section Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdSectionsNodeIdBindingRulePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdSectionsNodeIdBindingRulePutRaw(
        \App\DTO\ObjectsBindersBinderIdSectionsNodeIdBindingRulePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{binder_id}/sections/{node_id}/binding_rule', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Binder Section Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdSectionsNodeIdBindingRulePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdSectionsNodeIdBindingRulePut(
        \App\DTO\ObjectsBindersBinderIdSectionsNodeIdBindingRulePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdSectionsNodeIdBindingRulePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Binder Section Binding Rule
     * @param \App\DTO\ObjectsBindersBinderIdSectionsNodeIdBindingRulePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdSectionsNodeIdBindingRulePutResult(
        \App\DTO\ObjectsBindersBinderIdSectionsNodeIdBindingRulePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdSectionsNodeIdBindingRulePut($parameters));
    }
    //endregion

    //region objectsBindersBinderIdSectionsNodeIdPut
    /**
     * Update Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsNodeIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdSectionsNodeIdPutRaw(
        \App\DTO\ObjectsBindersBinderIdSectionsNodeIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{binder_id}/sections/{node_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsNodeIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdSectionsNodeIdPut(
        \App\DTO\ObjectsBindersBinderIdSectionsNodeIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdSectionsNodeIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsNodeIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdSectionsNodeIdPutResult(
        \App\DTO\ObjectsBindersBinderIdSectionsNodeIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdSectionsNodeIdPut($parameters));
    }
    //endregion

    //region objectsBindersBinderIdSectionsPost
    /**
     * Create Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdSectionsPostRaw(
        \App\DTO\ObjectsBindersBinderIdSectionsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{binder_id}/sections', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdSectionsPost(
        \App\DTO\ObjectsBindersBinderIdSectionsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdSectionsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdSectionsPostResult(
        \App\DTO\ObjectsBindersBinderIdSectionsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdSectionsPost($parameters));
    }
    //endregion

    //region objectsBindersBinderIdSectionsSectionIdDelete
    /**
     * Delete Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsSectionIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdSectionsSectionIdDeleteRaw(
        \App\DTO\ObjectsBindersBinderIdSectionsSectionIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/binders/{binder_id}/sections/{section_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsSectionIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdSectionsSectionIdDelete(
        \App\DTO\ObjectsBindersBinderIdSectionsSectionIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdSectionsSectionIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Binder Section
     * @param \App\DTO\ObjectsBindersBinderIdSectionsSectionIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdSectionsSectionIdDeleteResult(
        \App\DTO\ObjectsBindersBinderIdSectionsSectionIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdSectionsSectionIdDelete($parameters));
    }
    //endregion

    //region objectsBindersBinderIdSectionsSectionIdGet
    /**
     * Retrieve Binder Sections
     * @param \App\DTO\ObjectsBindersBinderIdSectionsSectionIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdSectionsSectionIdGetRaw(
        \App\DTO\ObjectsBindersBinderIdSectionsSectionIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{binder_id}/sections/{section_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Sections
     * @param \App\DTO\ObjectsBindersBinderIdSectionsSectionIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdSectionsSectionIdGet(
        \App\DTO\ObjectsBindersBinderIdSectionsSectionIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdSectionsSectionIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Sections
     * @param \App\DTO\ObjectsBindersBinderIdSectionsSectionIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdSectionsSectionIdGetResult(
        \App\DTO\ObjectsBindersBinderIdSectionsSectionIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdSectionsSectionIdGet($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsGet
    /**
     * Retrieve All Binder Versions
     * @param \App\DTO\ObjectsBindersBinderIdVersionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsGetRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{binder_id}/versions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Binder Versions
     * @param \App\DTO\ObjectsBindersBinderIdVersionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsGet(
        \App\DTO\ObjectsBindersBinderIdVersionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Binder Versions
     * @param \App\DTO\ObjectsBindersBinderIdVersionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsGetResult(
        \App\DTO\ObjectsBindersBinderIdVersionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsGet($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
    /**
     * Export Binder (Specific Version)
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Binder (Specific Version)
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Binder (Specific Version)
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete
    /**
     * Delete Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionGet
    /**
     * Retrieve Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionGetRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionGetResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionGet($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionPut
    /**
     * Update Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionPutRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Binder Version
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionPutResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionPut($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
    /**
     * Create Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
    /**
     * Delete Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
    /**
     * Retrieve Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Relationship
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet($parameters));
    }
    //endregion

    //region objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
    /**
     * Retrieve Binder Version Section
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetRaw(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Version Section
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Version Section
     * @param \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetResult(
        \App\DTO\ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet($parameters));
    }
    //endregion

    //region objectsBindersIdRolesGet
    /**
     * Retrieve All Binder Roles
     * @param \App\DTO\ObjectsBindersIdRolesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersIdRolesGetRaw(
        \App\DTO\ObjectsBindersIdRolesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{id}/roles', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Binder Roles
     * @param \App\DTO\ObjectsBindersIdRolesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersIdRolesGet(
        \App\DTO\ObjectsBindersIdRolesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersIdRolesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Binder Roles
     * @param \App\DTO\ObjectsBindersIdRolesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersIdRolesGetResult(
        \App\DTO\ObjectsBindersIdRolesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersIdRolesGet($parameters));
    }
    //endregion

    //region objectsBindersIdRolesPost
    /**
     * Assign Users & Groups to Roles on a Single Binder
     * @param \App\DTO\ObjectsBindersIdRolesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersIdRolesPostRaw(
        \App\DTO\ObjectsBindersIdRolesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/{id}/roles', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Assign Users & Groups to Roles on a Single Binder
     * @param \App\DTO\ObjectsBindersIdRolesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersIdRolesPost(
        \App\DTO\ObjectsBindersIdRolesPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersIdRolesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Assign Users & Groups to Roles on a Single Binder
     * @param \App\DTO\ObjectsBindersIdRolesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersIdRolesPostResult(
        \App\DTO\ObjectsBindersIdRolesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersIdRolesPost($parameters));
    }
    //endregion

    //region objectsBindersIdRolesRoleNameGet
    /**
     * Retrieve Document Role
     * @param \App\DTO\ObjectsBindersIdRolesRoleNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersIdRolesRoleNameGetRaw(
        \App\DTO\ObjectsBindersIdRolesRoleNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{id}/roles/{role_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Role
     * @param \App\DTO\ObjectsBindersIdRolesRoleNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersIdRolesRoleNameGet(
        \App\DTO\ObjectsBindersIdRolesRoleNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersIdRolesRoleNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Role
     * @param \App\DTO\ObjectsBindersIdRolesRoleNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersIdRolesRoleNameGetResult(
        \App\DTO\ObjectsBindersIdRolesRoleNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersIdRolesRoleNameGet($parameters));
    }
    //endregion

    //region objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet
    /**
     * Retrieve Binder User Actions
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetRaw(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder User Actions
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder User Actions
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetResult(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet($parameters));
    }
    //endregion

    //region objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
    /**
     * Retrieve Binder Entry Criteria
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRaw(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Entry Criteria
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Entry Criteria
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetResult(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet($parameters));
    }
    //endregion

    //region objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
    /**
     * Initiate Binder User Action
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRaw(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Binder User Action
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Binder User Action
     * @param \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutResult(
        \App\DTO\ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut($parameters));
    }
    //endregion

    //region objectsBindersLifecycleActionsPost
    /**
     * Retrieve User Actions on Multiple Binders
     * @param \App\DTO\ObjectsBindersLifecycleActionsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersLifecycleActionsPostRaw(
        \App\DTO\ObjectsBindersLifecycleActionsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/lifecycle_actions', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve User Actions on Multiple Binders
     * @param \App\DTO\ObjectsBindersLifecycleActionsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersLifecycleActionsPost(
        \App\DTO\ObjectsBindersLifecycleActionsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersLifecycleActionsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve User Actions on Multiple Binders
     * @param \App\DTO\ObjectsBindersLifecycleActionsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersLifecycleActionsPostResult(
        \App\DTO\ObjectsBindersLifecycleActionsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersLifecycleActionsPost($parameters));
    }
    //endregion

    //region objectsBindersLifecycleActionsUserActionNamePut
    /**
     * Initiate Bulk Binder User Actions
     * @param \App\DTO\ObjectsBindersLifecycleActionsUserActionNamePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersLifecycleActionsUserActionNamePutRaw(
        \App\DTO\ObjectsBindersLifecycleActionsUserActionNamePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/lifecycle_actions/{user_action_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Bulk Binder User Actions
     * @param \App\DTO\ObjectsBindersLifecycleActionsUserActionNamePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersLifecycleActionsUserActionNamePut(
        \App\DTO\ObjectsBindersLifecycleActionsUserActionNamePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersLifecycleActionsUserActionNamePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Bulk Binder User Actions
     * @param \App\DTO\ObjectsBindersLifecycleActionsUserActionNamePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersLifecycleActionsUserActionNamePutResult(
        \App\DTO\ObjectsBindersLifecycleActionsUserActionNamePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersLifecycleActionsUserActionNamePut($parameters));
    }
    //endregion

    //region objectsBindersPost
    /**
     * Create Binder
     * @param \App\DTO\ObjectsBindersPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersPostRaw(
        \App\DTO\ObjectsBindersPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Binder
     * @param \App\DTO\ObjectsBindersPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersPost(
        \App\DTO\ObjectsBindersPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Binder
     * @param \App\DTO\ObjectsBindersPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersPostResult(
        \App\DTO\ObjectsBindersPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersPost($parameters));
    }
    //endregion

    //region objectsBindersTemplatesGet
    /**
     * Retrieve Binder Template Collection
     * @param \App\DTO\ObjectsBindersTemplatesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesGetRaw(
        \App\DTO\ObjectsBindersTemplatesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Template Collection
     * @param \App\DTO\ObjectsBindersTemplatesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesGet(
        \App\DTO\ObjectsBindersTemplatesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Template Collection
     * @param \App\DTO\ObjectsBindersTemplatesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesGetResult(
        \App\DTO\ObjectsBindersTemplatesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesGet($parameters));
    }
    //endregion

    //region objectsBindersTemplatesPost
    /**
     * Create Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesPostRaw(
        \App\DTO\ObjectsBindersTemplatesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesPost(
        \App\DTO\ObjectsBindersTemplatesPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesPostResult(
        \App\DTO\ObjectsBindersTemplatesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesPost($parameters));
    }
    //endregion

    //region objectsBindersTemplatesPut
    /**
     * Update Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesPutRaw(
        \App\DTO\ObjectsBindersTemplatesPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesPut(
        \App\DTO\ObjectsBindersTemplatesPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesPutResult(
        \App\DTO\ObjectsBindersTemplatesPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesPut($parameters));
    }
    //endregion

    //region objectsBindersTemplatesTemplateNameBindernodesGet
    /**
     * Retrieve Binder Template Node Attributes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesTemplateNameBindernodesGetRaw(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/templates/{template_name}/bindernodes', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Template Node Attributes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesTemplateNameBindernodesGet(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesTemplateNameBindernodesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Template Node Attributes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesTemplateNameBindernodesGetResult(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesTemplateNameBindernodesGet($parameters));
    }
    //endregion

    //region objectsBindersTemplatesTemplateNameBindernodesPost
    /**
     * Create Binder Template Node
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesTemplateNameBindernodesPostRaw(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/binders/templates/{template_name}/bindernodes', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Binder Template Node
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesTemplateNameBindernodesPost(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesTemplateNameBindernodesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Binder Template Node
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesTemplateNameBindernodesPostResult(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesTemplateNameBindernodesPost($parameters));
    }
    //endregion

    //region objectsBindersTemplatesTemplateNameBindernodesPut
    /**
     * Replace Binder Template Nodes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesTemplateNameBindernodesPutRaw(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/binders/templates/{template_name}/bindernodes', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Replace Binder Template Nodes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesTemplateNameBindernodesPut(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesTemplateNameBindernodesPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Replace Binder Template Nodes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesTemplateNameBindernodesPutResult(
        \App\DTO\ObjectsBindersTemplatesTemplateNameBindernodesPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesTemplateNameBindernodesPut($parameters));
    }
    //endregion

    //region objectsBindersTemplatesTemplateNameDelete
    /**
     * Delete Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesTemplateNameDeleteRaw(
        \App\DTO\ObjectsBindersTemplatesTemplateNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/binders/templates/{template_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesTemplateNameDelete(
        \App\DTO\ObjectsBindersTemplatesTemplateNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesTemplateNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Binder Template
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesTemplateNameDeleteResult(
        \App\DTO\ObjectsBindersTemplatesTemplateNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesTemplateNameDelete($parameters));
    }
    //endregion

    //region objectsBindersTemplatesTemplateNameGet
    /**
     * Retrieve Binder Template Attributes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsBindersTemplatesTemplateNameGetRaw(
        \App\DTO\ObjectsBindersTemplatesTemplateNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/binders/templates/{template_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Binder Template Attributes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsBindersTemplatesTemplateNameGet(
        \App\DTO\ObjectsBindersTemplatesTemplateNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsBindersTemplatesTemplateNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Binder Template Attributes
     * @param \App\DTO\ObjectsBindersTemplatesTemplateNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsBindersTemplatesTemplateNameGetResult(
        \App\DTO\ObjectsBindersTemplatesTemplateNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsBindersTemplatesTemplateNameGet($parameters));
    }
    //endregion

    //region objectsDeletionsDocumentsGet
    /**
     * Retrieve Deleted Document IDs
     * @param \App\DTO\ObjectsDeletionsDocumentsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDeletionsDocumentsGetRaw(
        \App\DTO\ObjectsDeletionsDocumentsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/deletions/documents', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Deleted Document IDs
     * @param \App\DTO\ObjectsDeletionsDocumentsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDeletionsDocumentsGet(
        \App\DTO\ObjectsDeletionsDocumentsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDeletionsDocumentsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Deleted Document IDs
     * @param \App\DTO\ObjectsDeletionsDocumentsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDeletionsDocumentsGetResult(
        \App\DTO\ObjectsDeletionsDocumentsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDeletionsDocumentsGet($parameters));
    }
    //endregion

    //region objectsDeletionsVobjectsObjectNameGet
    /**
     * Retrieve Deleted Object Record ID
     * @param \App\DTO\ObjectsDeletionsVobjectsObjectNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDeletionsVobjectsObjectNameGetRaw(
        \App\DTO\ObjectsDeletionsVobjectsObjectNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/deletions/vobjects/{object_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Deleted Object Record ID
     * @param \App\DTO\ObjectsDeletionsVobjectsObjectNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDeletionsVobjectsObjectNameGet(
        \App\DTO\ObjectsDeletionsVobjectsObjectNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDeletionsVobjectsObjectNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Deleted Object Record ID
     * @param \App\DTO\ObjectsDeletionsVobjectsObjectNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDeletionsVobjectsObjectNameGetResult(
        \App\DTO\ObjectsDeletionsVobjectsObjectNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDeletionsVobjectsObjectNameGet($parameters));
    }
    //endregion

    //region objectsDocumentsActionsGet
    /**
     * Retrieve All Document Workflows
     * @param \App\DTO\ObjectsDocumentsActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsActionsGetRaw(
        \App\DTO\ObjectsDocumentsActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/actions', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Document Workflows
     * @param \App\DTO\ObjectsDocumentsActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsActionsGet(
        \App\DTO\ObjectsDocumentsActionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Document Workflows
     * @param \App\DTO\ObjectsDocumentsActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsActionsGetResult(
        \App\DTO\ObjectsDocumentsActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsActionsGet($parameters));
    }
    //endregion

    //region objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet
    /**
     * Download Controlled Copy Job Results
     * @param \App\DTO\ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetRaw(
        \App\DTO\ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Controlled Copy Job Results
     * @param \App\DTO\ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(
        \App\DTO\ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Controlled Copy Job Results
     * @param \App\DTO\ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetResult(
        \App\DTO\ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet($parameters));
    }
    //endregion

    //region objectsDocumentsActionsWorkflowNameGet
    /**
     * Retrieve Document Workflow Details
     * @param \App\DTO\ObjectsDocumentsActionsWorkflowNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsActionsWorkflowNameGetRaw(
        \App\DTO\ObjectsDocumentsActionsWorkflowNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/actions/{workflow_name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Workflow Details
     * @param \App\DTO\ObjectsDocumentsActionsWorkflowNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsActionsWorkflowNameGet(
        \App\DTO\ObjectsDocumentsActionsWorkflowNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsActionsWorkflowNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Workflow Details
     * @param \App\DTO\ObjectsDocumentsActionsWorkflowNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsActionsWorkflowNameGetResult(
        \App\DTO\ObjectsDocumentsActionsWorkflowNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsActionsWorkflowNameGet($parameters));
    }
    //endregion

    //region objectsDocumentsActionsWorkflowNamePost
    /**
     * Initiate Document Workflow
     * @param \App\DTO\ObjectsDocumentsActionsWorkflowNamePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsActionsWorkflowNamePostRaw(
        \App\DTO\ObjectsDocumentsActionsWorkflowNamePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/actions/{workflow_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Document Workflow
     * @param \App\DTO\ObjectsDocumentsActionsWorkflowNamePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsActionsWorkflowNamePost(
        \App\DTO\ObjectsDocumentsActionsWorkflowNamePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsActionsWorkflowNamePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Document Workflow
     * @param \App\DTO\ObjectsDocumentsActionsWorkflowNamePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsActionsWorkflowNamePostResult(
        \App\DTO\ObjectsDocumentsActionsWorkflowNamePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsActionsWorkflowNamePost($parameters));
    }
    //endregion

    //region objectsDocumentsAnnotationsBatchDelete
    /**
     * Delete Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsAnnotationsBatchDeleteRaw(
        \App\DTO\ObjectsDocumentsAnnotationsBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/annotations/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsAnnotationsBatchDelete(
        \App\DTO\ObjectsDocumentsAnnotationsBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsAnnotationsBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsAnnotationsBatchDeleteResult(
        \App\DTO\ObjectsDocumentsAnnotationsBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsAnnotationsBatchDelete($parameters));
    }
    //endregion

    //region objectsDocumentsAnnotationsBatchPost
    /**
     * Create Multiple Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsAnnotationsBatchPostRaw(
        \App\DTO\ObjectsDocumentsAnnotationsBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/annotations/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Multiple Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsAnnotationsBatchPost(
        \App\DTO\ObjectsDocumentsAnnotationsBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsAnnotationsBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Multiple Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsAnnotationsBatchPostResult(
        \App\DTO\ObjectsDocumentsAnnotationsBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsAnnotationsBatchPost($parameters));
    }
    //endregion

    //region objectsDocumentsAnnotationsBatchPut
    /**
     * Update Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsAnnotationsBatchPutRaw(
        \App\DTO\ObjectsDocumentsAnnotationsBatchPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/annotations/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsAnnotationsBatchPut(
        \App\DTO\ObjectsDocumentsAnnotationsBatchPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsAnnotationsBatchPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Annotations
     * @param \App\DTO\ObjectsDocumentsAnnotationsBatchPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsAnnotationsBatchPutResult(
        \App\DTO\ObjectsDocumentsAnnotationsBatchPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsAnnotationsBatchPut($parameters));
    }
    //endregion

    //region objectsDocumentsAnnotationsRepliesBatchPost
    /**
     * Add Annotation Replies
     * @param \App\DTO\ObjectsDocumentsAnnotationsRepliesBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsAnnotationsRepliesBatchPostRaw(
        \App\DTO\ObjectsDocumentsAnnotationsRepliesBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/annotations/replies/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Add Annotation Replies
     * @param \App\DTO\ObjectsDocumentsAnnotationsRepliesBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsAnnotationsRepliesBatchPost(
        \App\DTO\ObjectsDocumentsAnnotationsRepliesBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsAnnotationsRepliesBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Add Annotation Replies
     * @param \App\DTO\ObjectsDocumentsAnnotationsRepliesBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsAnnotationsRepliesBatchPostResult(
        \App\DTO\ObjectsDocumentsAnnotationsRepliesBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsAnnotationsRepliesBatchPost($parameters));
    }
    //endregion

    //region objectsDocumentsAttachmentsBatchDelete
    /**
     * Delete Multiple Document Attachments
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsAttachmentsBatchDeleteRaw(
        \App\DTO\ObjectsDocumentsAttachmentsBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/attachments/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Multiple Document Attachments
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsAttachmentsBatchDelete(
        \App\DTO\ObjectsDocumentsAttachmentsBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsAttachmentsBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Multiple Document Attachments
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsAttachmentsBatchDeleteResult(
        \App\DTO\ObjectsDocumentsAttachmentsBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsAttachmentsBatchDelete($parameters));
    }
    //endregion

    //region objectsDocumentsAttachmentsBatchPost
    /**
     * Create Multiple Document Attachments
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsAttachmentsBatchPostRaw(
        \App\DTO\ObjectsDocumentsAttachmentsBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/attachments/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Multiple Document Attachments
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsAttachmentsBatchPost(
        \App\DTO\ObjectsDocumentsAttachmentsBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsAttachmentsBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Multiple Document Attachments
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsAttachmentsBatchPostResult(
        \App\DTO\ObjectsDocumentsAttachmentsBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsAttachmentsBatchPost($parameters));
    }
    //endregion

    //region objectsDocumentsAttachmentsBatchPut
    /**
     * Update Multiple Document Attachment Descriptions
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsAttachmentsBatchPutRaw(
        \App\DTO\ObjectsDocumentsAttachmentsBatchPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/attachments/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Multiple Document Attachment Descriptions
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsAttachmentsBatchPut(
        \App\DTO\ObjectsDocumentsAttachmentsBatchPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsAttachmentsBatchPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Multiple Document Attachment Descriptions
     * @param \App\DTO\ObjectsDocumentsAttachmentsBatchPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsAttachmentsBatchPutResult(
        \App\DTO\ObjectsDocumentsAttachmentsBatchPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsAttachmentsBatchPut($parameters));
    }
    //endregion

    //region objectsDocumentsBatchActionsFileextractJobIdResultsGet
    /**
     * Retrieve Document Export Results
     * @param \App\DTO\ObjectsDocumentsBatchActionsFileextractJobIdResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchActionsFileextractJobIdResultsGetRaw(
        \App\DTO\ObjectsDocumentsBatchActionsFileextractJobIdResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/batch/actions/fileextract/{job_id}/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Export Results
     * @param \App\DTO\ObjectsDocumentsBatchActionsFileextractJobIdResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchActionsFileextractJobIdResultsGet(
        \App\DTO\ObjectsDocumentsBatchActionsFileextractJobIdResultsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchActionsFileextractJobIdResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Export Results
     * @param \App\DTO\ObjectsDocumentsBatchActionsFileextractJobIdResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchActionsFileextractJobIdResultsGetResult(
        \App\DTO\ObjectsDocumentsBatchActionsFileextractJobIdResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchActionsFileextractJobIdResultsGet($parameters));
    }
    //endregion

    //region objectsDocumentsBatchActionsFileextractPost
    /**
     * Export Documents
     * @param \App\DTO\ObjectsDocumentsBatchActionsFileextractPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchActionsFileextractPostRaw(
        \App\DTO\ObjectsDocumentsBatchActionsFileextractPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/batch/actions/fileextract', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Documents
     * @param \App\DTO\ObjectsDocumentsBatchActionsFileextractPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchActionsFileextractPost(
        \App\DTO\ObjectsDocumentsBatchActionsFileextractPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchActionsFileextractPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Documents
     * @param \App\DTO\ObjectsDocumentsBatchActionsFileextractPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchActionsFileextractPostResult(
        \App\DTO\ObjectsDocumentsBatchActionsFileextractPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchActionsFileextractPost($parameters));
    }
    //endregion

    //region objectsDocumentsBatchActionsReclassifyPut
    /**
     * Reclassify Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchActionsReclassifyPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchActionsReclassifyPutRaw(
        \App\DTO\ObjectsDocumentsBatchActionsReclassifyPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/batch/actions/reclassify', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Reclassify Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchActionsReclassifyPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchActionsReclassifyPut(
        \App\DTO\ObjectsDocumentsBatchActionsReclassifyPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchActionsReclassifyPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Reclassify Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchActionsReclassifyPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchActionsReclassifyPutResult(
        \App\DTO\ObjectsDocumentsBatchActionsReclassifyPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchActionsReclassifyPut($parameters));
    }
    //endregion

    //region objectsDocumentsBatchActionsRerenderPost
    /**
     * Update Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsBatchActionsRerenderPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchActionsRerenderPostRaw(
        \App\DTO\ObjectsDocumentsBatchActionsRerenderPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/batch/actions/rerender', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsBatchActionsRerenderPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchActionsRerenderPost(
        \App\DTO\ObjectsDocumentsBatchActionsRerenderPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchActionsRerenderPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsBatchActionsRerenderPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchActionsRerenderPostResult(
        \App\DTO\ObjectsDocumentsBatchActionsRerenderPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchActionsRerenderPost($parameters));
    }
    //endregion

    //region objectsDocumentsBatchDelete
    /**
     * Delete Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchDeleteRaw(
        \App\DTO\ObjectsDocumentsBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/batch', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchDelete(
        \App\DTO\ObjectsDocumentsBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchDeleteResult(
        \App\DTO\ObjectsDocumentsBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchDelete($parameters));
    }
    //endregion

    //region objectsDocumentsBatchLockDelete
    /**
     * Undo Collaborative Authoring Checkout
     * @param \App\DTO\ObjectsDocumentsBatchLockDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchLockDeleteRaw(
        \App\DTO\ObjectsDocumentsBatchLockDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/batch/lock', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Undo Collaborative Authoring Checkout
     * @param \App\DTO\ObjectsDocumentsBatchLockDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchLockDelete(
        \App\DTO\ObjectsDocumentsBatchLockDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchLockDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Undo Collaborative Authoring Checkout
     * @param \App\DTO\ObjectsDocumentsBatchLockDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchLockDeleteResult(
        \App\DTO\ObjectsDocumentsBatchLockDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchLockDelete($parameters));
    }
    //endregion

    //region objectsDocumentsBatchPost
    /**
     * Create Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchPostRaw(
        \App\DTO\ObjectsDocumentsBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchPost(
        \App\DTO\ObjectsDocumentsBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchPostResult(
        \App\DTO\ObjectsDocumentsBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchPost($parameters));
    }
    //endregion

    //region objectsDocumentsBatchPut
    /**
     * Update Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsBatchPutRaw(
        \App\DTO\ObjectsDocumentsBatchPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsBatchPut(
        \App\DTO\ObjectsDocumentsBatchPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsBatchPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Multiple Documents
     * @param \App\DTO\ObjectsDocumentsBatchPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsBatchPutResult(
        \App\DTO\ObjectsDocumentsBatchPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsBatchPut($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAnchorsGet
    /**
     * Retrieve Anchor IDs
     * @param \App\DTO\ObjectsDocumentsDocIdAnchorsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAnchorsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAnchorsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/anchors', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Anchor IDs
     * @param \App\DTO\ObjectsDocumentsDocIdAnchorsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAnchorsGet(
        \App\DTO\ObjectsDocumentsDocIdAnchorsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAnchorsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Anchor IDs
     * @param \App\DTO\ObjectsDocumentsDocIdAnchorsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAnchorsGetResult(
        \App\DTO\ObjectsDocumentsDocIdAnchorsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAnchorsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAnnotationsFileGet
    /**
     * Export Document Annotations to PDF
     * @param \App\DTO\ObjectsDocumentsDocIdAnnotationsFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAnnotationsFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAnnotationsFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/annotations/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Document Annotations to PDF
     * @param \App\DTO\ObjectsDocumentsDocIdAnnotationsFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAnnotationsFileGet(
        \App\DTO\ObjectsDocumentsDocIdAnnotationsFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAnnotationsFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Document Annotations to PDF
     * @param \App\DTO\ObjectsDocumentsDocIdAnnotationsFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAnnotationsFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdAnnotationsFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAnnotationsFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAnnotationsFilePost
    /**
     * Import Document Annotations from PDF
     * @param \App\DTO\ObjectsDocumentsDocIdAnnotationsFilePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAnnotationsFilePostRaw(
        \App\DTO\ObjectsDocumentsDocIdAnnotationsFilePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/annotations/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Import Document Annotations from PDF
     * @param \App\DTO\ObjectsDocumentsDocIdAnnotationsFilePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAnnotationsFilePost(
        \App\DTO\ObjectsDocumentsDocIdAnnotationsFilePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAnnotationsFilePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Import Document Annotations from PDF
     * @param \App\DTO\ObjectsDocumentsDocIdAnnotationsFilePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAnnotationsFilePostResult(
        \App\DTO\ObjectsDocumentsDocIdAnnotationsFilePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAnnotationsFilePost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdDelete
    /**
     * Delete Single Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/attachments/{attachment_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdDelete(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdFileGet
    /**
     * Download Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/attachments/{attachment_id}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdGet
    /**
     * Retrieve Document Attachment Metadata
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/attachments/{attachment_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Attachment Metadata
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdGet(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Attachment Metadata
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdGetResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdPut
    /**
     * Update Document Attachment Description
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdPutRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/{doc_id}/attachments/{attachment_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Document Attachment Description
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdPut(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Document Attachment Description
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdPutResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdPut($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
    /**
     * Delete Single Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
    /**
     * Download Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
    /**
     * Retrieve Document Attachment Version Metadata
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Attachment Version Metadata
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Attachment Version Metadata
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
    /**
     * Restore Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Restore Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Restore Document Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet
    /**
     * Retrieve Document Attachment Versions
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/attachments/{attachment_id}/versions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Attachment Versions
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Attachment Versions
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsFileGet
    /**
     * Download All Document Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/attachments/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download All Document Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsFileGet(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download All Document Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsGet
    /**
     * Retrieve Document Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/attachments', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsGet(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsGetResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAttachmentsPost
    /**
     * Create Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAttachmentsPostRaw(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/attachments', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAttachmentsPost(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAttachmentsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Document Attachment
     * @param \App\DTO\ObjectsDocumentsDocIdAttachmentsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAttachmentsPostResult(
        \App\DTO\ObjectsDocumentsDocIdAttachmentsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAttachmentsPost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdAudittrailGet
    /**
     * Retrieve Complete Audit History for a Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdAudittrailGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdAudittrailGetRaw(
        \App\DTO\ObjectsDocumentsDocIdAudittrailGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/audittrail', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Complete Audit History for a Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdAudittrailGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdAudittrailGet(
        \App\DTO\ObjectsDocumentsDocIdAudittrailGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdAudittrailGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Complete Audit History for a Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdAudittrailGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdAudittrailGetResult(
        \App\DTO\ObjectsDocumentsDocIdAudittrailGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdAudittrailGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdDelete
    /**
     * Delete Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdDelete(
        \App\DTO\ObjectsDocumentsDocIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdEventsGet
    /**
     * Retrieve Document Events
     * @param \App\DTO\ObjectsDocumentsDocIdEventsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdEventsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdEventsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/events', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Events
     * @param \App\DTO\ObjectsDocumentsDocIdEventsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdEventsGet(
        \App\DTO\ObjectsDocumentsDocIdEventsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdEventsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Events
     * @param \App\DTO\ObjectsDocumentsDocIdEventsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdEventsGetResult(
        \App\DTO\ObjectsDocumentsDocIdEventsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdEventsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdFileGet
    /**
     * Download Document File
     * @param \App\DTO\ObjectsDocumentsDocIdFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/file', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document File
     * @param \App\DTO\ObjectsDocumentsDocIdFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdFileGet(
        \App\DTO\ObjectsDocumentsDocIdFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document File
     * @param \App\DTO\ObjectsDocumentsDocIdFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdGet
    /**
     * Retrieve Document
     * @param \App\DTO\ObjectsDocumentsDocIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdGetRaw(
        \App\DTO\ObjectsDocumentsDocIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document
     * @param \App\DTO\ObjectsDocumentsDocIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdGet(
        \App\DTO\ObjectsDocumentsDocIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document
     * @param \App\DTO\ObjectsDocumentsDocIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdGetResult(
        \App\DTO\ObjectsDocumentsDocIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdLockDelete
    /**
     * Delete Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdLockDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdLockDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/lock', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdLockDelete(
        \App\DTO\ObjectsDocumentsDocIdLockDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdLockDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdLockDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdLockDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdLockDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdLockGet
    /**
     * Retrieve Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdLockGetRaw(
        \App\DTO\ObjectsDocumentsDocIdLockGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/lock', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdLockGet(
        \App\DTO\ObjectsDocumentsDocIdLockGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdLockGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdLockGetResult(
        \App\DTO\ObjectsDocumentsDocIdLockGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdLockGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdLockPost
    /**
     * Create Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdLockPostRaw(
        \App\DTO\ObjectsDocumentsDocIdLockPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/lock', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdLockPost(
        \App\DTO\ObjectsDocumentsDocIdLockPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdLockPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Document Lock
     * @param \App\DTO\ObjectsDocumentsDocIdLockPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdLockPostResult(
        \App\DTO\ObjectsDocumentsDocIdLockPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdLockPost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet
    /**
     * Download All Document Version Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download All Document Version Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(
        \App\DTO\ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download All Document Version Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdPost
    /**
     * Create Single Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdPostRaw(
        \App\DTO\ObjectsDocumentsDocIdPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Single Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdPost(
        \App\DTO\ObjectsDocumentsDocIdPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Single Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdPostResult(
        \App\DTO\ObjectsDocumentsDocIdPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdPost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdPut
    /**
     * Update Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdPutRaw(
        \App\DTO\ObjectsDocumentsDocIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/{doc_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdPut(
        \App\DTO\ObjectsDocumentsDocIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdPutResult(
        \App\DTO\ObjectsDocumentsDocIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdPut($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdRenditionsGet
    /**
     * Retrieve Document Renditions
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdRenditionsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdRenditionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/renditions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Renditions
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdRenditionsGet(
        \App\DTO\ObjectsDocumentsDocIdRenditionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdRenditionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Renditions
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdRenditionsGetResult(
        \App\DTO\ObjectsDocumentsDocIdRenditionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdRenditionsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdRenditionsRenditionTypeDelete
    /**
     * Delete Single Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypeDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/renditions/{rendition_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypeDelete(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdRenditionsRenditionTypeDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypeDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdRenditionsRenditionTypeDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdRenditionsRenditionTypeGet
    /**
     * Download Document Rendition File
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypeGetRaw(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/renditions/{rendition_type}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Rendition File
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypeGet(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdRenditionsRenditionTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Rendition File
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypeGetResult(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdRenditionsRenditionTypeGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdRenditionsRenditionTypePost
    /**
     * Add Single Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypePostRaw(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/renditions/{rendition_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Add Single Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypePost(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdRenditionsRenditionTypePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Add Single Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypePostResult(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdRenditionsRenditionTypePost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdRenditionsRenditionTypePut
    /**
     * Replace Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypePutRaw(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/{doc_id}/renditions/{rendition_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Replace Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypePut(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdRenditionsRenditionTypePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Replace Document Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdRenditionsRenditionTypePutResult(
        \App\DTO\ObjectsDocumentsDocIdRenditionsRenditionTypePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdRenditionsRenditionTypePut($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete
    /**
     * Remove Users & Groups from Roles on a Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Remove Users & Groups from Roles on a Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(
        \App\DTO\ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Remove Users & Groups from Roles on a Single Document
     * @param \App\DTO\ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet
    /**
     * Retrieve Document Version Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Version Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(
        \App\DTO\ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Version Attachments
     * @param \App\DTO\ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsGet
    /**
     * Retrieve Document Versions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Versions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Versions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
    /**
     * Read Annotations by ID
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Read Annotations by ID
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Read Annotations by ID
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
    /**
     * Read Replies of Parent Annotation
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Read Replies of Parent Annotation
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Read Replies of Parent Annotation
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet
    /**
     * Export Document Version Annotations to PDF
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Document Version Annotations to PDF
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Document Version Annotations to PDF
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
    /**
     * Import Document Version Annotations from PDF
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Import Document Version Annotations from PDF
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Import Document Version Annotations from PDF
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
    /**
     * Read Annotations by Document Version and Type
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Read Annotations by Document Version and Type
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Read Annotations by Document Version and Type
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
    /**
     * Download Document Version Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Version Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Version Attachment Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
    /**
     * Retrieve Document Version Attachment Versions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Version Attachment Versions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Version Attachment Versions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete
    /**
     * Delete Single Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet
    /**
     * Retrieve Document Version Notes as CSV
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Version Notes as CSV
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Version Notes as CSV
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
    /**
     * Create Document Event
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Document Event
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Document Event
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet
    /**
     * Retrieve Video Annotations
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Video Annotations
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Video Annotations
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet
    /**
     * Download Document Version File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Version File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Version File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet
    /**
     * Retrieve Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
    /**
     * Update Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Document Version
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet
    /**
     * Retrieve Document Relationships
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Relationships
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Relationships
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
    /**
     * Create Single Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Single Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Single Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
    /**
     * Delete Single Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
    /**
     * Retrieve Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Relationship
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet
    /**
     * Retrieve Document Version Renditions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Version Renditions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Version Renditions
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
    /**
     * Delete Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
    /**
     * Download Document Version Rendition File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Version Rendition File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Version Rendition File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
    /**
     * Upload Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Upload Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Upload Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
    /**
     * Replace Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Replace Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Replace Document Version Rendition
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut($parameters));
    }
    //endregion

    //region objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet
    /**
     * Download Document Version Thumbnail File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetRaw(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Version Thumbnail File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Version Thumbnail File
     * @param \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetResult(
        \App\DTO\ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet($parameters));
    }
    //endregion

    //region objectsDocumentsGet
    /**
     * Retrieve All Documents
     * @param \App\DTO\ObjectsDocumentsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsGetRaw(
        \App\DTO\ObjectsDocumentsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Documents
     * @param \App\DTO\ObjectsDocumentsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsGet(
        \App\DTO\ObjectsDocumentsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Documents
     * @param \App\DTO\ObjectsDocumentsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsGetResult(
        \App\DTO\ObjectsDocumentsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsGet($parameters));
    }
    //endregion

    //region objectsDocumentsIdRolesGet
    /**
     * Retrieve All Document Roles
     * @param \App\DTO\ObjectsDocumentsIdRolesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsIdRolesGetRaw(
        \App\DTO\ObjectsDocumentsIdRolesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{id}/roles', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Document Roles
     * @param \App\DTO\ObjectsDocumentsIdRolesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsIdRolesGet(
        \App\DTO\ObjectsDocumentsIdRolesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsIdRolesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Document Roles
     * @param \App\DTO\ObjectsDocumentsIdRolesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsIdRolesGetResult(
        \App\DTO\ObjectsDocumentsIdRolesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsIdRolesGet($parameters));
    }
    //endregion

    //region objectsDocumentsIdRolesPost
    /**
     * Assign Users & Groups to Roles on a Single Document
     * @param \App\DTO\ObjectsDocumentsIdRolesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsIdRolesPostRaw(
        \App\DTO\ObjectsDocumentsIdRolesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/{id}/roles', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Assign Users & Groups to Roles on a Single Document
     * @param \App\DTO\ObjectsDocumentsIdRolesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsIdRolesPost(
        \App\DTO\ObjectsDocumentsIdRolesPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsIdRolesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Assign Users & Groups to Roles on a Single Document
     * @param \App\DTO\ObjectsDocumentsIdRolesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsIdRolesPostResult(
        \App\DTO\ObjectsDocumentsIdRolesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsIdRolesPost($parameters));
    }
    //endregion

    //region objectsDocumentsIdRolesRoleNameGet
    /**
     * Retrieve Document Role
     * @param \App\DTO\ObjectsDocumentsIdRolesRoleNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsIdRolesRoleNameGetRaw(
        \App\DTO\ObjectsDocumentsIdRolesRoleNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{id}/roles/{role_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Role
     * @param \App\DTO\ObjectsDocumentsIdRolesRoleNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsIdRolesRoleNameGet(
        \App\DTO\ObjectsDocumentsIdRolesRoleNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsIdRolesRoleNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Role
     * @param \App\DTO\ObjectsDocumentsIdRolesRoleNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsIdRolesRoleNameGetResult(
        \App\DTO\ObjectsDocumentsIdRolesRoleNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsIdRolesRoleNameGet($parameters));
    }
    //endregion

    //region objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet
    /**
     * Retrieve Document User Actions
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetRaw(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document User Actions
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document User Actions
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetResult(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet($parameters));
    }
    //endregion

    //region objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
    /**
     * Retrieve Document Entry Criteria
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRaw(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Entry Criteria
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Entry Criteria
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetResult(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet($parameters));
    }
    //endregion

    //region objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
    /**
     * Initiate Document User Action
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRaw(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Document User Action
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Document User Action
     * @param \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutResult(
        \App\DTO\ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut($parameters));
    }
    //endregion

    //region objectsDocumentsLifecycleActionsPost
    /**
     * Retrieve User Actions on Multiple Documents
     * @param \App\DTO\ObjectsDocumentsLifecycleActionsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsLifecycleActionsPostRaw(
        \App\DTO\ObjectsDocumentsLifecycleActionsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/lifecycle_actions', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve User Actions on Multiple Documents
     * @param \App\DTO\ObjectsDocumentsLifecycleActionsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsLifecycleActionsPost(
        \App\DTO\ObjectsDocumentsLifecycleActionsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsLifecycleActionsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve User Actions on Multiple Documents
     * @param \App\DTO\ObjectsDocumentsLifecycleActionsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsLifecycleActionsPostResult(
        \App\DTO\ObjectsDocumentsLifecycleActionsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsLifecycleActionsPost($parameters));
    }
    //endregion

    //region objectsDocumentsLifecycleActionsUserActionNamePut
    /**
     * Initiate Bulk Document User Actions
     * @param \App\DTO\ObjectsDocumentsLifecycleActionsUserActionNamePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsLifecycleActionsUserActionNamePutRaw(
        \App\DTO\ObjectsDocumentsLifecycleActionsUserActionNamePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/lifecycle_actions/{user_action_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Bulk Document User Actions
     * @param \App\DTO\ObjectsDocumentsLifecycleActionsUserActionNamePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsLifecycleActionsUserActionNamePut(
        \App\DTO\ObjectsDocumentsLifecycleActionsUserActionNamePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsLifecycleActionsUserActionNamePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Bulk Document User Actions
     * @param \App\DTO\ObjectsDocumentsLifecycleActionsUserActionNamePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsLifecycleActionsUserActionNamePutResult(
        \App\DTO\ObjectsDocumentsLifecycleActionsUserActionNamePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsLifecycleActionsUserActionNamePut($parameters));
    }
    //endregion

    //region objectsDocumentsPost
    /**
     * Create Single Document
     * @param \App\DTO\ObjectsDocumentsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsPostRaw(
        \App\DTO\ObjectsDocumentsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Single Document
     * @param \App\DTO\ObjectsDocumentsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsPost(
        \App\DTO\ObjectsDocumentsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Single Document
     * @param \App\DTO\ObjectsDocumentsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsPostResult(
        \App\DTO\ObjectsDocumentsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsPost($parameters));
    }
    //endregion

    //region objectsDocumentsRelationshipsBatchDelete
    /**
     * Delete Multiple Document Relationships
     * @param \App\DTO\ObjectsDocumentsRelationshipsBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsRelationshipsBatchDeleteRaw(
        \App\DTO\ObjectsDocumentsRelationshipsBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/relationships/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Multiple Document Relationships
     * @param \App\DTO\ObjectsDocumentsRelationshipsBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsRelationshipsBatchDelete(
        \App\DTO\ObjectsDocumentsRelationshipsBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsRelationshipsBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Multiple Document Relationships
     * @param \App\DTO\ObjectsDocumentsRelationshipsBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsRelationshipsBatchDeleteResult(
        \App\DTO\ObjectsDocumentsRelationshipsBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsRelationshipsBatchDelete($parameters));
    }
    //endregion

    //region objectsDocumentsRelationshipsBatchPost
    /**
     * Create Multiple Document Relationships
     * @param \App\DTO\ObjectsDocumentsRelationshipsBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsRelationshipsBatchPostRaw(
        \App\DTO\ObjectsDocumentsRelationshipsBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/relationships/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Multiple Document Relationships
     * @param \App\DTO\ObjectsDocumentsRelationshipsBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsRelationshipsBatchPost(
        \App\DTO\ObjectsDocumentsRelationshipsBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsRelationshipsBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Multiple Document Relationships
     * @param \App\DTO\ObjectsDocumentsRelationshipsBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsRelationshipsBatchPostResult(
        \App\DTO\ObjectsDocumentsRelationshipsBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsRelationshipsBatchPost($parameters));
    }
    //endregion

    //region objectsDocumentsRenditionsBatchDelete
    /**
     * Delete Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsRenditionsBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsRenditionsBatchDeleteRaw(
        \App\DTO\ObjectsDocumentsRenditionsBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/renditions/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsRenditionsBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsRenditionsBatchDelete(
        \App\DTO\ObjectsDocumentsRenditionsBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsRenditionsBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsRenditionsBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsRenditionsBatchDeleteResult(
        \App\DTO\ObjectsDocumentsRenditionsBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsRenditionsBatchDelete($parameters));
    }
    //endregion

    //region objectsDocumentsRenditionsBatchPost
    /**
     * Add Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsRenditionsBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsRenditionsBatchPostRaw(
        \App\DTO\ObjectsDocumentsRenditionsBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/renditions/batch', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Add Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsRenditionsBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsRenditionsBatchPost(
        \App\DTO\ObjectsDocumentsRenditionsBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsRenditionsBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Add Multiple Document Renditions
     * @param \App\DTO\ObjectsDocumentsRenditionsBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsRenditionsBatchPostResult(
        \App\DTO\ObjectsDocumentsRenditionsBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsRenditionsBatchPost($parameters));
    }
    //endregion

    //region objectsDocumentsRolesBatchDelete
    /**
     * Remove Users and Groups from Roles on Multiple Documents & Binders
     * @param \App\DTO\ObjectsDocumentsRolesBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsRolesBatchDeleteRaw(
        \App\DTO\ObjectsDocumentsRolesBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/roles/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Remove Users and Groups from Roles on Multiple Documents & Binders
     * @param \App\DTO\ObjectsDocumentsRolesBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsRolesBatchDelete(
        \App\DTO\ObjectsDocumentsRolesBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsRolesBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Remove Users and Groups from Roles on Multiple Documents & Binders
     * @param \App\DTO\ObjectsDocumentsRolesBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsRolesBatchDeleteResult(
        \App\DTO\ObjectsDocumentsRolesBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsRolesBatchDelete($parameters));
    }
    //endregion

    //region objectsDocumentsRolesBatchPost
    /**
     * Assign Users & Groups to Roles on Multiple Documents & Binders
     * @param \App\DTO\ObjectsDocumentsRolesBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsRolesBatchPostRaw(
        \App\DTO\ObjectsDocumentsRolesBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/roles/batch', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Assign Users & Groups to Roles on Multiple Documents & Binders
     * @param \App\DTO\ObjectsDocumentsRolesBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsRolesBatchPost(
        \App\DTO\ObjectsDocumentsRolesBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsRolesBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Assign Users & Groups to Roles on Multiple Documents & Binders
     * @param \App\DTO\ObjectsDocumentsRolesBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsRolesBatchPostResult(
        \App\DTO\ObjectsDocumentsRolesBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsRolesBatchPost($parameters));
    }
    //endregion

    //region objectsDocumentsTemplatesGet
    /**
     * Retrieve Document Template Collection
     * @param \App\DTO\ObjectsDocumentsTemplatesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTemplatesGetRaw(
        \App\DTO\ObjectsDocumentsTemplatesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Template Collection
     * @param \App\DTO\ObjectsDocumentsTemplatesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTemplatesGet(
        \App\DTO\ObjectsDocumentsTemplatesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTemplatesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Template Collection
     * @param \App\DTO\ObjectsDocumentsTemplatesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTemplatesGetResult(
        \App\DTO\ObjectsDocumentsTemplatesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTemplatesGet($parameters));
    }
    //endregion

    //region objectsDocumentsTemplatesPost
    /**
     * Create Single Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTemplatesPostRaw(
        \App\DTO\ObjectsDocumentsTemplatesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Single Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTemplatesPost(
        \App\DTO\ObjectsDocumentsTemplatesPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTemplatesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Single Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTemplatesPostResult(
        \App\DTO\ObjectsDocumentsTemplatesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTemplatesPost($parameters));
    }
    //endregion

    //region objectsDocumentsTemplatesPut
    /**
     * Update Multiple Document Templates
     * @param \App\DTO\ObjectsDocumentsTemplatesPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTemplatesPutRaw(
        \App\DTO\ObjectsDocumentsTemplatesPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/templates', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Multiple Document Templates
     * @param \App\DTO\ObjectsDocumentsTemplatesPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTemplatesPut(
        \App\DTO\ObjectsDocumentsTemplatesPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTemplatesPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Multiple Document Templates
     * @param \App\DTO\ObjectsDocumentsTemplatesPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTemplatesPutResult(
        \App\DTO\ObjectsDocumentsTemplatesPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTemplatesPut($parameters));
    }
    //endregion

    //region objectsDocumentsTemplatesTemplateNameDelete
    /**
     * Delete Basic Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTemplatesTemplateNameDeleteRaw(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/templates/{template_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Basic Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTemplatesTemplateNameDelete(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTemplatesTemplateNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Basic Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTemplatesTemplateNameDeleteResult(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTemplatesTemplateNameDelete($parameters));
    }
    //endregion

    //region objectsDocumentsTemplatesTemplateNameFileGet
    /**
     * Download Document Template File
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTemplatesTemplateNameFileGetRaw(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/templates/{template_name}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Document Template File
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTemplatesTemplateNameFileGet(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameFileGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTemplatesTemplateNameFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Document Template File
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTemplatesTemplateNameFileGetResult(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTemplatesTemplateNameFileGet($parameters));
    }
    //endregion

    //region objectsDocumentsTemplatesTemplateNameGet
    /**
     * Retrieve Document Template Attributes
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTemplatesTemplateNameGetRaw(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/documents/templates/{template_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Document Template Attributes
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTemplatesTemplateNameGet(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTemplatesTemplateNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Document Template Attributes
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTemplatesTemplateNameGetResult(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTemplatesTemplateNameGet($parameters));
    }
    //endregion

    //region objectsDocumentsTemplatesTemplateNamePut
    /**
     * Update Single Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNamePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTemplatesTemplateNamePutRaw(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNamePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/documents/templates/{template_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Single Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNamePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTemplatesTemplateNamePut(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNamePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTemplatesTemplateNamePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Single Document Template
     * @param \App\DTO\ObjectsDocumentsTemplatesTemplateNamePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTemplatesTemplateNamePutResult(
        \App\DTO\ObjectsDocumentsTemplatesTemplateNamePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTemplatesTemplateNamePut($parameters));
    }
    //endregion

    //region objectsDocumentsTokensPost
    /**
     * Document Tokens
     * @param \App\DTO\ObjectsDocumentsTokensPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsTokensPostRaw(
        \App\DTO\ObjectsDocumentsTokensPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/tokens', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Document Tokens
     * @param \App\DTO\ObjectsDocumentsTokensPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsTokensPost(
        \App\DTO\ObjectsDocumentsTokensPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsTokensPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Document Tokens
     * @param \App\DTO\ObjectsDocumentsTokensPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsTokensPostResult(
        \App\DTO\ObjectsDocumentsTokensPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsTokensPost($parameters));
    }
    //endregion

    //region objectsDocumentsVersionsBatchActionsFileextractPost
    /**
     * Export Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchActionsFileextractPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsVersionsBatchActionsFileextractPostRaw(
        \App\DTO\ObjectsDocumentsVersionsBatchActionsFileextractPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/versions/batch/actions/fileextract', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchActionsFileextractPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsVersionsBatchActionsFileextractPost(
        \App\DTO\ObjectsDocumentsVersionsBatchActionsFileextractPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsVersionsBatchActionsFileextractPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchActionsFileextractPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsVersionsBatchActionsFileextractPostResult(
        \App\DTO\ObjectsDocumentsVersionsBatchActionsFileextractPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsVersionsBatchActionsFileextractPost($parameters));
    }
    //endregion

    //region objectsDocumentsVersionsBatchDelete
    /**
     * Delete Multiple Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsVersionsBatchDeleteRaw(
        \App\DTO\ObjectsDocumentsVersionsBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/documents/versions/batch', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Multiple Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsVersionsBatchDelete(
        \App\DTO\ObjectsDocumentsVersionsBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsVersionsBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Multiple Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsVersionsBatchDeleteResult(
        \App\DTO\ObjectsDocumentsVersionsBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsVersionsBatchDelete($parameters));
    }
    //endregion

    //region objectsDocumentsVersionsBatchPost
    /**
     * Create Multiple Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDocumentsVersionsBatchPostRaw(
        \App\DTO\ObjectsDocumentsVersionsBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/documents/versions/batch', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Multiple Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDocumentsVersionsBatchPost(
        \App\DTO\ObjectsDocumentsVersionsBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsDocumentsVersionsBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Multiple Document Versions
     * @param \App\DTO\ObjectsDocumentsVersionsBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDocumentsVersionsBatchPostResult(
        \App\DTO\ObjectsDocumentsVersionsBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDocumentsVersionsBatchPost($parameters));
    }
    //endregion

    //region objectsDomainGet
    /**
     * Retrieve Domain Information
     * @param \App\DTO\ObjectsDomainGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDomainGetRaw(
        \App\DTO\ObjectsDomainGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/domain', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Domain Information
     * @param \App\DTO\ObjectsDomainGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDomainGet(
        \App\DTO\ObjectsDomainGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDomainGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Domain Information
     * @param \App\DTO\ObjectsDomainGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDomainGetResult(
        \App\DTO\ObjectsDomainGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDomainGet($parameters));
    }
    //endregion

    //region objectsDomainsGet
    /**
     * Retrieve Domains
     * @param \App\DTO\ObjectsDomainsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsDomainsGetRaw(
        \App\DTO\ObjectsDomainsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/domains', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Domains
     * @param \App\DTO\ObjectsDomainsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsDomainsGet(
        \App\DTO\ObjectsDomainsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsDomainsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Domains
     * @param \App\DTO\ObjectsDomainsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsDomainsGetResult(
        \App\DTO\ObjectsDomainsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsDomainsGet($parameters));
    }
    //endregion

    //region objectsEdlMatchedDocumentsBatchActionsAddPost
    /**
     * Add EDL Matched Documents
     * @param \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsAddPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsEdlMatchedDocumentsBatchActionsAddPostRaw(
        \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsAddPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/edl_matched_documents/batch/actions/add', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Add EDL Matched Documents
     * @param \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsAddPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsEdlMatchedDocumentsBatchActionsAddPost(
        \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsAddPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsEdlMatchedDocumentsBatchActionsAddPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Add EDL Matched Documents
     * @param \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsAddPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsEdlMatchedDocumentsBatchActionsAddPostResult(
        \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsAddPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsEdlMatchedDocumentsBatchActionsAddPost($parameters));
    }
    //endregion

    //region objectsEdlMatchedDocumentsBatchActionsRemovePost
    /**
     * Remove EDL Matched Documents
     * @param \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsRemovePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsEdlMatchedDocumentsBatchActionsRemovePostRaw(
        \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsRemovePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/edl_matched_documents/batch/actions/remove', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Remove EDL Matched Documents
     * @param \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsRemovePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsEdlMatchedDocumentsBatchActionsRemovePost(
        \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsRemovePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsEdlMatchedDocumentsBatchActionsRemovePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Remove EDL Matched Documents
     * @param \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsRemovePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsEdlMatchedDocumentsBatchActionsRemovePostResult(
        \App\DTO\ObjectsEdlMatchedDocumentsBatchActionsRemovePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsEdlMatchedDocumentsBatchActionsRemovePost($parameters));
    }
    //endregion

    //region objectsGroupsAutoGet
    /**
     * Retrieve Auto Managed Groups
     * @param \App\DTO\ObjectsGroupsAutoGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsGroupsAutoGetRaw(
        \App\DTO\ObjectsGroupsAutoGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/groups/auto', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Auto Managed Groups
     * @param \App\DTO\ObjectsGroupsAutoGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsGroupsAutoGet(
        \App\DTO\ObjectsGroupsAutoGETParameterData $parameters
    ): array
    {
        $response = $this->objectsGroupsAutoGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Auto Managed Groups
     * @param \App\DTO\ObjectsGroupsAutoGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsGroupsAutoGetResult(
        \App\DTO\ObjectsGroupsAutoGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsGroupsAutoGet($parameters));
    }
    //endregion

    //region objectsGroupsGet
    /**
     * Retrieve All Groups
     * @param \App\DTO\ObjectsGroupsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsGroupsGetRaw(
        \App\DTO\ObjectsGroupsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/groups', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Groups
     * @param \App\DTO\ObjectsGroupsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsGroupsGet(
        \App\DTO\ObjectsGroupsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsGroupsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Groups
     * @param \App\DTO\ObjectsGroupsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsGroupsGetResult(
        \App\DTO\ObjectsGroupsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsGroupsGet($parameters));
    }
    //endregion

    //region objectsGroupsGroupIdDelete
    /**
     * Delete Group
     * @param \App\DTO\ObjectsGroupsGroupIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsGroupsGroupIdDeleteRaw(
        \App\DTO\ObjectsGroupsGroupIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/groups/{group_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Group
     * @param \App\DTO\ObjectsGroupsGroupIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsGroupsGroupIdDelete(
        \App\DTO\ObjectsGroupsGroupIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsGroupsGroupIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Group
     * @param \App\DTO\ObjectsGroupsGroupIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsGroupsGroupIdDeleteResult(
        \App\DTO\ObjectsGroupsGroupIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsGroupsGroupIdDelete($parameters));
    }
    //endregion

    //region objectsGroupsGroupIdGet
    /**
     * Retrieve Group
     * @param \App\DTO\ObjectsGroupsGroupIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsGroupsGroupIdGetRaw(
        \App\DTO\ObjectsGroupsGroupIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/groups/{group_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Group
     * @param \App\DTO\ObjectsGroupsGroupIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsGroupsGroupIdGet(
        \App\DTO\ObjectsGroupsGroupIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsGroupsGroupIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Group
     * @param \App\DTO\ObjectsGroupsGroupIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsGroupsGroupIdGetResult(
        \App\DTO\ObjectsGroupsGroupIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsGroupsGroupIdGet($parameters));
    }
    //endregion

    //region objectsGroupsGroupIdPut
    /**
     * Update Group
     * @param \App\DTO\ObjectsGroupsGroupIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsGroupsGroupIdPutRaw(
        \App\DTO\ObjectsGroupsGroupIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/groups/{group_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Group
     * @param \App\DTO\ObjectsGroupsGroupIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsGroupsGroupIdPut(
        \App\DTO\ObjectsGroupsGroupIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsGroupsGroupIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Group
     * @param \App\DTO\ObjectsGroupsGroupIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsGroupsGroupIdPutResult(
        \App\DTO\ObjectsGroupsGroupIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsGroupsGroupIdPut($parameters));
    }
    //endregion

    //region objectsGroupsPost
    /**
     * Create Group
     * @param \App\DTO\ObjectsGroupsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsGroupsPostRaw(
        \App\DTO\ObjectsGroupsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/groups', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Group
     * @param \App\DTO\ObjectsGroupsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsGroupsPost(
        \App\DTO\ObjectsGroupsPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsGroupsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Group
     * @param \App\DTO\ObjectsGroupsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsGroupsPostResult(
        \App\DTO\ObjectsGroupsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsGroupsPost($parameters));
    }
    //endregion

    //region objectsLicensesGet
    /**
     * Retrieve Application License Usage
     * @param \App\DTO\ObjectsLicensesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsLicensesGetRaw(
        \App\DTO\ObjectsLicensesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/licenses', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Application License Usage
     * @param \App\DTO\ObjectsLicensesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsLicensesGet(
        \App\DTO\ObjectsLicensesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsLicensesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Application License Usage
     * @param \App\DTO\ObjectsLicensesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsLicensesGetResult(
        \App\DTO\ObjectsLicensesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsLicensesGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsActionsGet
    /**
     * Retrieve All Multi-Record Workflows
     * @param \App\DTO\ObjectsObjectworkflowsActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsActionsGetRaw(
        \App\DTO\ObjectsObjectworkflowsActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/actions', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Multi-Record Workflows
     * @param \App\DTO\ObjectsObjectworkflowsActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsActionsGet(
        \App\DTO\ObjectsObjectworkflowsActionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Multi-Record Workflows
     * @param \App\DTO\ObjectsObjectworkflowsActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsActionsGetResult(
        \App\DTO\ObjectsObjectworkflowsActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsActionsGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsActionsWorkflowNameGet
    /**
     * Retrieve Multi-Record Workflow Details
     * @param \App\DTO\ObjectsObjectworkflowsActionsWorkflowNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsActionsWorkflowNameGetRaw(
        \App\DTO\ObjectsObjectworkflowsActionsWorkflowNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/actions/{workflow_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Multi-Record Workflow Details
     * @param \App\DTO\ObjectsObjectworkflowsActionsWorkflowNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsActionsWorkflowNameGet(
        \App\DTO\ObjectsObjectworkflowsActionsWorkflowNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsActionsWorkflowNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Multi-Record Workflow Details
     * @param \App\DTO\ObjectsObjectworkflowsActionsWorkflowNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsActionsWorkflowNameGetResult(
        \App\DTO\ObjectsObjectworkflowsActionsWorkflowNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsActionsWorkflowNameGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsActionsWorkflowNamePost
    /**
     * Initiate Multi-Record Workflow
     * @param \App\DTO\ObjectsObjectworkflowsActionsWorkflowNamePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsActionsWorkflowNamePostRaw(
        \App\DTO\ObjectsObjectworkflowsActionsWorkflowNamePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/actions/{workflow_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Multi-Record Workflow
     * @param \App\DTO\ObjectsObjectworkflowsActionsWorkflowNamePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsActionsWorkflowNamePost(
        \App\DTO\ObjectsObjectworkflowsActionsWorkflowNamePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsActionsWorkflowNamePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Multi-Record Workflow
     * @param \App\DTO\ObjectsObjectworkflowsActionsWorkflowNamePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsActionsWorkflowNamePostResult(
        \App\DTO\ObjectsObjectworkflowsActionsWorkflowNamePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsActionsWorkflowNamePost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsGet
    /**
     * Retrieve Workflows
     * @param \App\DTO\ObjectsObjectworkflowsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsGetRaw(
        \App\DTO\ObjectsObjectworkflowsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflows
     * @param \App\DTO\ObjectsObjectworkflowsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsGet(
        \App\DTO\ObjectsObjectworkflowsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflows
     * @param \App\DTO\ObjectsObjectworkflowsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsGetResult(
        \App\DTO\ObjectsObjectworkflowsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksGet
    /**
     * Retrieve Workflow Tasks
     * @param \App\DTO\ObjectsObjectworkflowsTasksGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksGetRaw(
        \App\DTO\ObjectsObjectworkflowsTasksGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/tasks', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflow Tasks
     * @param \App\DTO\ObjectsObjectworkflowsTasksGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksGet(
        \App\DTO\ObjectsObjectworkflowsTasksGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflow Tasks
     * @param \App\DTO\ObjectsObjectworkflowsTasksGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksGetResult(
        \App\DTO\ObjectsObjectworkflowsTasksGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsAcceptPost
    /**
     * Accept Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsAcceptPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsAcceptPostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsAcceptPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/accept', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Accept Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsAcceptPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsAcceptPost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsAcceptPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsAcceptPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Accept Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsAcceptPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsAcceptPostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsAcceptPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsAcceptPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsCancelPost
    /**
     * Cancel Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCancelPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsCancelPostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCancelPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/cancel', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancel Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCancelPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsCancelPost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCancelPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsCancelPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancel Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCancelPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsCancelPostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCancelPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsCancelPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsCompletePost
    /**
     * Complete Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCompletePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsCompletePostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCompletePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/complete', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Complete Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCompletePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsCompletePost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCompletePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsCompletePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Complete Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCompletePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsCompletePostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsCompletePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsCompletePost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsGet
    /**
     * Retrieve Workflow Task Actions
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsGetRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/tasks/{task_id}/actions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflow Task Actions
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsGet(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflow Task Actions
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsGetResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost
    /**
     * Accept Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/mdwaccept', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Accept Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Accept Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost
    /**
     * Complete Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Complete Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Complete Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost
    /**
     * Manage Multi-Item Workflow Content
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Manage Multi-Item Workflow Content
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Manage Multi-Item Workflow Content
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost
    /**
     * Reassign Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/mdwreassign', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Reassign Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Reassign Multi-item Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsReassignPost
    /**
     * Reassign Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsReassignPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsReassignPostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsReassignPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/reassign', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Reassign Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsReassignPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsReassignPost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsReassignPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsReassignPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Reassign Single Record Workflow Task
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsReassignPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsReassignPostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsReassignPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsReassignPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsTaskActionGet
    /**
     * Retrieve Workflow Task Action Details
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsTaskActionGetRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/tasks/{task_id}/actions/{task_action}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflow Task Action Details
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsTaskActionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflow Task Action Details
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsTaskActionGetResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsTaskActionGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost
    /**
     * Undo Workflow Task Acceptance
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/undoaccept', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Undo Workflow Task Acceptance
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Undo Workflow Task Acceptance
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost
    /**
     * Update Workflow Task Due Date
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/tasks/{task_id}/actions/updateduedate', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Workflow Task Due Date
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Workflow Task Due Date
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsTasksTaskIdGet
    /**
     * Retrieve Workflow Task Details
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsTasksTaskIdGetRaw(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/tasks/{task_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflow Task Details
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsTasksTaskIdGet(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsTasksTaskIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflow Task Details
     * @param \App\DTO\ObjectsObjectworkflowsTasksTaskIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsTasksTaskIdGetResult(
        \App\DTO\ObjectsObjectworkflowsTasksTaskIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsTasksTaskIdGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsWorkflowIdActionsGet
    /**
     * Retrieve Workflow Actions
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsWorkflowIdActionsGetRaw(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/{workflow_id}/actions', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflow Actions
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsWorkflowIdActionsGet(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsWorkflowIdActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflow Actions
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsWorkflowIdActionsGetResult(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsWorkflowIdActionsGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet
    /**
     * Retrieve Workflow Action Details
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetRaw(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/{workflow_id}/actions/{workflow_action}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflow Action Details
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflow Action Details
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetResult(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet($parameters));
    }
    //endregion

    //region objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
    /**
     * Initiate Workflow Action
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostRaw(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/objectworkflows/{workflow_id}/actions/{workflow_action}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Workflow Action
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Workflow Action
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostResult(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost($parameters));
    }
    //endregion

    //region objectsObjectworkflowsWorkflowIdGet
    /**
     * Retrieve Workflow Details
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsObjectworkflowsWorkflowIdGetRaw(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/objectworkflows/{workflow_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Workflow Details
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsObjectworkflowsWorkflowIdGet(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsObjectworkflowsWorkflowIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Workflow Details
     * @param \App\DTO\ObjectsObjectworkflowsWorkflowIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsObjectworkflowsWorkflowIdGetResult(
        \App\DTO\ObjectsObjectworkflowsWorkflowIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsObjectworkflowsWorkflowIdGet($parameters));
    }
    //endregion

    //region objectsPicklistsGet
    /**
     * Retrieve All Picklists
     * @param \App\DTO\ObjectsPicklistsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsPicklistsGetRaw(
        \App\DTO\ObjectsPicklistsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/picklists', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Picklists
     * @param \App\DTO\ObjectsPicklistsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsPicklistsGet(
        \App\DTO\ObjectsPicklistsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsPicklistsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Picklists
     * @param \App\DTO\ObjectsPicklistsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsPicklistsGetResult(
        \App\DTO\ObjectsPicklistsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsPicklistsGet($parameters));
    }
    //endregion

    //region objectsPicklistsPicklistNameGet
    /**
     * Retrieve Picklist Values
     * @param \App\DTO\ObjectsPicklistsPicklistNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsPicklistsPicklistNameGetRaw(
        \App\DTO\ObjectsPicklistsPicklistNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/picklists/{picklist_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Picklist Values
     * @param \App\DTO\ObjectsPicklistsPicklistNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsPicklistsPicklistNameGet(
        \App\DTO\ObjectsPicklistsPicklistNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsPicklistsPicklistNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Picklist Values
     * @param \App\DTO\ObjectsPicklistsPicklistNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsPicklistsPicklistNameGetResult(
        \App\DTO\ObjectsPicklistsPicklistNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsPicklistsPicklistNameGet($parameters));
    }
    //endregion

    //region objectsPicklistsPicklistNamePicklistValueNameDelete
    /**
     * Inactivate Picklist Value
     * @param \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsPicklistsPicklistNamePicklistValueNameDeleteRaw(
        \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/picklists/{picklist_name}/{picklist_value_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Inactivate Picklist Value
     * @param \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsPicklistsPicklistNamePicklistValueNameDelete(
        \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsPicklistsPicklistNamePicklistValueNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Inactivate Picklist Value
     * @param \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsPicklistsPicklistNamePicklistValueNameDeleteResult(
        \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsPicklistsPicklistNamePicklistValueNameDelete($parameters));
    }
    //endregion

    //region objectsPicklistsPicklistNamePicklistValueNamePut
    /**
     * Update Picklist Value
     * @param \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNamePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsPicklistsPicklistNamePicklistValueNamePutRaw(
        \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNamePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/picklists/{picklist_name}/{picklist_value_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Picklist Value
     * @param \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNamePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsPicklistsPicklistNamePicklistValueNamePut(
        \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNamePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsPicklistsPicklistNamePicklistValueNamePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Picklist Value
     * @param \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNamePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsPicklistsPicklistNamePicklistValueNamePutResult(
        \App\DTO\ObjectsPicklistsPicklistNamePicklistValueNamePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsPicklistsPicklistNamePicklistValueNamePut($parameters));
    }
    //endregion

    //region objectsPicklistsPicklistNamePost
    /**
     * Create Picklist Values
     * @param \App\DTO\ObjectsPicklistsPicklistNamePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsPicklistsPicklistNamePostRaw(
        \App\DTO\ObjectsPicklistsPicklistNamePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/picklists/{picklist_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Picklist Values
     * @param \App\DTO\ObjectsPicklistsPicklistNamePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsPicklistsPicklistNamePost(
        \App\DTO\ObjectsPicklistsPicklistNamePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsPicklistsPicklistNamePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Picklist Values
     * @param \App\DTO\ObjectsPicklistsPicklistNamePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsPicklistsPicklistNamePostResult(
        \App\DTO\ObjectsPicklistsPicklistNamePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsPicklistsPicklistNamePost($parameters));
    }
    //endregion

    //region objectsPicklistsPicklistNamePut
    /**
     * Update Picklist Value Label
     * @param \App\DTO\ObjectsPicklistsPicklistNamePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsPicklistsPicklistNamePutRaw(
        \App\DTO\ObjectsPicklistsPicklistNamePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/picklists/{picklist_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Picklist Value Label
     * @param \App\DTO\ObjectsPicklistsPicklistNamePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsPicklistsPicklistNamePut(
        \App\DTO\ObjectsPicklistsPicklistNamePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsPicklistsPicklistNamePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Picklist Value Label
     * @param \App\DTO\ObjectsPicklistsPicklistNamePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsPicklistsPicklistNamePutResult(
        \App\DTO\ObjectsPicklistsPicklistNamePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsPicklistsPicklistNamePut($parameters));
    }
    //endregion

    //region objectsSandboxActionsBuildproductionPost
    /**
     * Build Production Vault
     * @param \App\DTO\ObjectsSandboxActionsBuildproductionPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxActionsBuildproductionPostRaw(
        \App\DTO\ObjectsSandboxActionsBuildproductionPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/actions/buildproduction', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Build Production Vault
     * @param \App\DTO\ObjectsSandboxActionsBuildproductionPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxActionsBuildproductionPost(
        \App\DTO\ObjectsSandboxActionsBuildproductionPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxActionsBuildproductionPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Build Production Vault
     * @param \App\DTO\ObjectsSandboxActionsBuildproductionPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxActionsBuildproductionPostResult(
        \App\DTO\ObjectsSandboxActionsBuildproductionPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxActionsBuildproductionPost($parameters));
    }
    //endregion

    //region objectsSandboxActionsPromoteproductionPost
    /**
     * Promote to Production
     * @param \App\DTO\ObjectsSandboxActionsPromoteproductionPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxActionsPromoteproductionPostRaw(
        \App\DTO\ObjectsSandboxActionsPromoteproductionPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/actions/promoteproduction', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Promote to Production
     * @param \App\DTO\ObjectsSandboxActionsPromoteproductionPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxActionsPromoteproductionPost(
        \App\DTO\ObjectsSandboxActionsPromoteproductionPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxActionsPromoteproductionPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Promote to Production
     * @param \App\DTO\ObjectsSandboxActionsPromoteproductionPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxActionsPromoteproductionPostResult(
        \App\DTO\ObjectsSandboxActionsPromoteproductionPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxActionsPromoteproductionPost($parameters));
    }
    //endregion

    //region objectsSandboxActionsRecheckusagePost
    /**
     * Recheck Sandbox Usage Limit
     * @param \App\DTO\ObjectsSandboxActionsRecheckusagePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxActionsRecheckusagePostRaw(
        \App\DTO\ObjectsSandboxActionsRecheckusagePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/actions/recheckusage', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Recheck Sandbox Usage Limit
     * @param \App\DTO\ObjectsSandboxActionsRecheckusagePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxActionsRecheckusagePost(
        \App\DTO\ObjectsSandboxActionsRecheckusagePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxActionsRecheckusagePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Recheck Sandbox Usage Limit
     * @param \App\DTO\ObjectsSandboxActionsRecheckusagePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxActionsRecheckusagePostResult(
        \App\DTO\ObjectsSandboxActionsRecheckusagePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxActionsRecheckusagePost($parameters));
    }
    //endregion

    //region objectsSandboxBatchChangesizePost
    /**
     * Change Sandbox Size
     * @param \App\DTO\ObjectsSandboxBatchChangesizePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxBatchChangesizePostRaw(
        \App\DTO\ObjectsSandboxBatchChangesizePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/batch/changesize', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Change Sandbox Size
     * @param \App\DTO\ObjectsSandboxBatchChangesizePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxBatchChangesizePost(
        \App\DTO\ObjectsSandboxBatchChangesizePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxBatchChangesizePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Change Sandbox Size
     * @param \App\DTO\ObjectsSandboxBatchChangesizePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxBatchChangesizePostResult(
        \App\DTO\ObjectsSandboxBatchChangesizePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxBatchChangesizePost($parameters));
    }
    //endregion

    //region objectsSandboxEntitlementsSetPost
    /**
     * Set Sandbox Entitlements
     * @param \App\DTO\ObjectsSandboxEntitlementsSetPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxEntitlementsSetPostRaw(
        \App\DTO\ObjectsSandboxEntitlementsSetPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/entitlements/set', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Set Sandbox Entitlements
     * @param \App\DTO\ObjectsSandboxEntitlementsSetPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxEntitlementsSetPost(
        \App\DTO\ObjectsSandboxEntitlementsSetPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxEntitlementsSetPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Set Sandbox Entitlements
     * @param \App\DTO\ObjectsSandboxEntitlementsSetPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxEntitlementsSetPostResult(
        \App\DTO\ObjectsSandboxEntitlementsSetPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxEntitlementsSetPost($parameters));
    }
    //endregion

    //region objectsSandboxGet
    /**
     * Retrieve Sandboxes
     * @param \App\DTO\ObjectsSandboxGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxGetRaw(
        \App\DTO\ObjectsSandboxGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/sandbox', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Sandboxes
     * @param \App\DTO\ObjectsSandboxGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxGet(
        \App\DTO\ObjectsSandboxGETParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Sandboxes
     * @param \App\DTO\ObjectsSandboxGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxGetResult(
        \App\DTO\ObjectsSandboxGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxGet($parameters));
    }
    //endregion

    //region objectsSandboxNameDelete
    /**
     * Delete Sandbox
     * @param \App\DTO\ObjectsSandboxNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxNameDeleteRaw(
        \App\DTO\ObjectsSandboxNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/sandbox/{name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Sandbox
     * @param \App\DTO\ObjectsSandboxNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxNameDelete(
        \App\DTO\ObjectsSandboxNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Sandbox
     * @param \App\DTO\ObjectsSandboxNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxNameDeleteResult(
        \App\DTO\ObjectsSandboxNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxNameDelete($parameters));
    }
    //endregion

    //region objectsSandboxPost
    /**
     * Create or Refresh Sandbox
     * @param \App\DTO\ObjectsSandboxPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxPostRaw(
        \App\DTO\ObjectsSandboxPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create or Refresh Sandbox
     * @param \App\DTO\ObjectsSandboxPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxPost(
        \App\DTO\ObjectsSandboxPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create or Refresh Sandbox
     * @param \App\DTO\ObjectsSandboxPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxPostResult(
        \App\DTO\ObjectsSandboxPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxPost($parameters));
    }
    //endregion

    //region objectsSandboxSnapshotApiNameActionsUpdatePost
    /**
     * Update Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpdatePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxSnapshotApiNameActionsUpdatePostRaw(
        \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpdatePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/snapshot/{api_name}/actions/update', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpdatePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxSnapshotApiNameActionsUpdatePost(
        \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpdatePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxSnapshotApiNameActionsUpdatePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpdatePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxSnapshotApiNameActionsUpdatePostResult(
        \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpdatePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxSnapshotApiNameActionsUpdatePost($parameters));
    }
    //endregion

    //region objectsSandboxSnapshotApiNameActionsUpgradePost
    /**
     * Upgrade Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpgradePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxSnapshotApiNameActionsUpgradePostRaw(
        \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpgradePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/snapshot/{api_name}/actions/upgrade', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Upgrade Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpgradePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxSnapshotApiNameActionsUpgradePost(
        \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpgradePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxSnapshotApiNameActionsUpgradePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Upgrade Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpgradePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxSnapshotApiNameActionsUpgradePostResult(
        \App\DTO\ObjectsSandboxSnapshotApiNameActionsUpgradePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxSnapshotApiNameActionsUpgradePost($parameters));
    }
    //endregion

    //region objectsSandboxSnapshotApiNameDelete
    /**
     * Delete Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxSnapshotApiNameDeleteRaw(
        \App\DTO\ObjectsSandboxSnapshotApiNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/sandbox/snapshot/{api_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxSnapshotApiNameDelete(
        \App\DTO\ObjectsSandboxSnapshotApiNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxSnapshotApiNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotApiNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxSnapshotApiNameDeleteResult(
        \App\DTO\ObjectsSandboxSnapshotApiNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxSnapshotApiNameDelete($parameters));
    }
    //endregion

    //region objectsSandboxSnapshotGet
    /**
     * Retrieve Sandbox Snapshots
     * @param \App\DTO\ObjectsSandboxSnapshotGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxSnapshotGetRaw(
        \App\DTO\ObjectsSandboxSnapshotGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/sandbox/snapshot', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Sandbox Snapshots
     * @param \App\DTO\ObjectsSandboxSnapshotGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxSnapshotGet(
        \App\DTO\ObjectsSandboxSnapshotGETParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxSnapshotGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Sandbox Snapshots
     * @param \App\DTO\ObjectsSandboxSnapshotGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxSnapshotGetResult(
        \App\DTO\ObjectsSandboxSnapshotGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxSnapshotGet($parameters));
    }
    //endregion

    //region objectsSandboxSnapshotPost
    /**
     * Create Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxSnapshotPostRaw(
        \App\DTO\ObjectsSandboxSnapshotPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/snapshot', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxSnapshotPost(
        \App\DTO\ObjectsSandboxSnapshotPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxSnapshotPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Sandbox Snapshot
     * @param \App\DTO\ObjectsSandboxSnapshotPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxSnapshotPostResult(
        \App\DTO\ObjectsSandboxSnapshotPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxSnapshotPost($parameters));
    }
    //endregion

    //region objectsSandboxVaultIdActionsRefreshPost
    /**
     * Refresh Sandbox from Snapshot
     * @param \App\DTO\ObjectsSandboxVaultIdActionsRefreshPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxVaultIdActionsRefreshPostRaw(
        \App\DTO\ObjectsSandboxVaultIdActionsRefreshPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/sandbox/{vault_id}/actions/refresh', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Refresh Sandbox from Snapshot
     * @param \App\DTO\ObjectsSandboxVaultIdActionsRefreshPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxVaultIdActionsRefreshPost(
        \App\DTO\ObjectsSandboxVaultIdActionsRefreshPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxVaultIdActionsRefreshPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Refresh Sandbox from Snapshot
     * @param \App\DTO\ObjectsSandboxVaultIdActionsRefreshPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxVaultIdActionsRefreshPostResult(
        \App\DTO\ObjectsSandboxVaultIdActionsRefreshPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxVaultIdActionsRefreshPost($parameters));
    }
    //endregion

    //region objectsSandboxVaultIdGet
    /**
     * Retrieve Sandbox Details by ID
     * @param \App\DTO\ObjectsSandboxVaultIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSandboxVaultIdGetRaw(
        \App\DTO\ObjectsSandboxVaultIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/sandbox/{vault_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Sandbox Details by ID
     * @param \App\DTO\ObjectsSandboxVaultIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSandboxVaultIdGet(
        \App\DTO\ObjectsSandboxVaultIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsSandboxVaultIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Sandbox Details by ID
     * @param \App\DTO\ObjectsSandboxVaultIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSandboxVaultIdGetResult(
        \App\DTO\ObjectsSandboxVaultIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSandboxVaultIdGet($parameters));
    }
    //endregion

    //region objectsSecuritypoliciesGet
    /**
     * Retrieve All Security Policies
     * @param \App\DTO\ObjectsSecuritypoliciesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSecuritypoliciesGetRaw(
        \App\DTO\ObjectsSecuritypoliciesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/securitypolicies', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Security Policies
     * @param \App\DTO\ObjectsSecuritypoliciesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSecuritypoliciesGet(
        \App\DTO\ObjectsSecuritypoliciesGETParameterData $parameters
    ): array
    {
        $response = $this->objectsSecuritypoliciesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Security Policies
     * @param \App\DTO\ObjectsSecuritypoliciesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSecuritypoliciesGetResult(
        \App\DTO\ObjectsSecuritypoliciesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSecuritypoliciesGet($parameters));
    }
    //endregion

    //region objectsSecuritypoliciesSecurityPolicyNameGet
    /**
     * Retrieve Security Policy
     * @param \App\DTO\ObjectsSecuritypoliciesSecurityPolicyNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsSecuritypoliciesSecurityPolicyNameGetRaw(
        \App\DTO\ObjectsSecuritypoliciesSecurityPolicyNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/securitypolicies/{security_policy_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Security Policy
     * @param \App\DTO\ObjectsSecuritypoliciesSecurityPolicyNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsSecuritypoliciesSecurityPolicyNameGet(
        \App\DTO\ObjectsSecuritypoliciesSecurityPolicyNameGETParameterData $parameters
    ): array
    {
        $response = $this->objectsSecuritypoliciesSecurityPolicyNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Security Policy
     * @param \App\DTO\ObjectsSecuritypoliciesSecurityPolicyNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsSecuritypoliciesSecurityPolicyNameGetResult(
        \App\DTO\ObjectsSecuritypoliciesSecurityPolicyNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsSecuritypoliciesSecurityPolicyNameGet($parameters));
    }
    //endregion

    //region objectsUsersGet
    /**
     * Retrieve All Users
     * @param \App\DTO\ObjectsUsersGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersGetRaw(
        \App\DTO\ObjectsUsersGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/users/', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Users
     * @param \App\DTO\ObjectsUsersGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersGet(
        \App\DTO\ObjectsUsersGETParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Users
     * @param \App\DTO\ObjectsUsersGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersGetResult(
        \App\DTO\ObjectsUsersGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersGet($parameters));
    }
    //endregion

    //region objectsUsersIdGet
    /**
     * Retrieve User
     * @param \App\DTO\ObjectsUsersIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersIdGetRaw(
        \App\DTO\ObjectsUsersIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/users/{id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve User
     * @param \App\DTO\ObjectsUsersIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersIdGet(
        \App\DTO\ObjectsUsersIdGETParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve User
     * @param \App\DTO\ObjectsUsersIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersIdGetResult(
        \App\DTO\ObjectsUsersIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersIdGet($parameters));
    }
    //endregion

    //region objectsUsersIdPermissionsGet
    /**
     * Retrieve User Permissions
     * @param \App\DTO\ObjectsUsersIdPermissionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersIdPermissionsGetRaw(
        \App\DTO\ObjectsUsersIdPermissionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/users/{id}/permissions', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve User Permissions
     * @param \App\DTO\ObjectsUsersIdPermissionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersIdPermissionsGet(
        \App\DTO\ObjectsUsersIdPermissionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersIdPermissionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve User Permissions
     * @param \App\DTO\ObjectsUsersIdPermissionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersIdPermissionsGetResult(
        \App\DTO\ObjectsUsersIdPermissionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersIdPermissionsGet($parameters));
    }
    //endregion

    //region objectsUsersIdPut
    /**
     * Update Single User
     * @param \App\DTO\ObjectsUsersIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersIdPutRaw(
        \App\DTO\ObjectsUsersIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/users/{id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Single User
     * @param \App\DTO\ObjectsUsersIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersIdPut(
        \App\DTO\ObjectsUsersIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Single User
     * @param \App\DTO\ObjectsUsersIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersIdPutResult(
        \App\DTO\ObjectsUsersIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersIdPut($parameters));
    }
    //endregion

    //region objectsUsersMeGet
    /**
     * Validate Session User
     * @param \App\DTO\ObjectsUsersMeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersMeGetRaw(
        \App\DTO\ObjectsUsersMeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/users/me', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Validate Session User
     * @param \App\DTO\ObjectsUsersMeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersMeGet(
        \App\DTO\ObjectsUsersMeGETParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersMeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Validate Session User
     * @param \App\DTO\ObjectsUsersMeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersMeGetResult(
        \App\DTO\ObjectsUsersMeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersMeGet($parameters));
    }
    //endregion

    //region objectsUsersMePasswordPost
    /**
     * Change My Password
     * @param \App\DTO\ObjectsUsersMePasswordPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersMePasswordPostRaw(
        \App\DTO\ObjectsUsersMePasswordPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/users/me/password', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Change My Password
     * @param \App\DTO\ObjectsUsersMePasswordPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersMePasswordPost(
        \App\DTO\ObjectsUsersMePasswordPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersMePasswordPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Change My Password
     * @param \App\DTO\ObjectsUsersMePasswordPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersMePasswordPostResult(
        \App\DTO\ObjectsUsersMePasswordPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersMePasswordPost($parameters));
    }
    //endregion

    //region objectsUsersMePermissionsGet
    /**
     * Retrieve My User Permissions
     * @param \App\DTO\ObjectsUsersMePermissionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersMePermissionsGetRaw(
        \App\DTO\ObjectsUsersMePermissionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/objects/users/me/permissions', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve My User Permissions
     * @param \App\DTO\ObjectsUsersMePermissionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersMePermissionsGet(
        \App\DTO\ObjectsUsersMePermissionsGETParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersMePermissionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve My User Permissions
     * @param \App\DTO\ObjectsUsersMePermissionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersMePermissionsGetResult(
        \App\DTO\ObjectsUsersMePermissionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersMePermissionsGet($parameters));
    }
    //endregion

    //region objectsUsersMePut
    /**
     * Update My User
     * @param \App\DTO\ObjectsUsersMePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersMePutRaw(
        \App\DTO\ObjectsUsersMePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/users/me', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update My User
     * @param \App\DTO\ObjectsUsersMePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersMePut(
        \App\DTO\ObjectsUsersMePUTParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersMePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update My User
     * @param \App\DTO\ObjectsUsersMePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersMePutResult(
        \App\DTO\ObjectsUsersMePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersMePut($parameters));
    }
    //endregion

    //region objectsUsersPost
    /**
     * Create Single User
     * @param \App\DTO\ObjectsUsersPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersPostRaw(
        \App\DTO\ObjectsUsersPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/users', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Single User
     * @param \App\DTO\ObjectsUsersPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersPost(
        \App\DTO\ObjectsUsersPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Single User
     * @param \App\DTO\ObjectsUsersPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersPostResult(
        \App\DTO\ObjectsUsersPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersPost($parameters));
    }
    //endregion

    //region objectsUsersPut
    /**
     * Update Multiple Users
     * @param \App\DTO\ObjectsUsersPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersPutRaw(
        \App\DTO\ObjectsUsersPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/users', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Multiple Users
     * @param \App\DTO\ObjectsUsersPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersPut(
        \App\DTO\ObjectsUsersPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Multiple Users
     * @param \App\DTO\ObjectsUsersPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersPutResult(
        \App\DTO\ObjectsUsersPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersPut($parameters));
    }
    //endregion

    //region objectsUsersUserIdDelete
    /**
     * Disable User
     * @param \App\DTO\ObjectsUsersUserIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersUserIdDeleteRaw(
        \App\DTO\ObjectsUsersUserIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/objects/users/{user_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Disable User
     * @param \App\DTO\ObjectsUsersUserIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersUserIdDelete(
        \App\DTO\ObjectsUsersUserIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersUserIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Disable User
     * @param \App\DTO\ObjectsUsersUserIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersUserIdDeleteResult(
        \App\DTO\ObjectsUsersUserIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersUserIdDelete($parameters));
    }
    //endregion

    //region objectsUsersUserIdVaultMembershipVaultIdPut
    /**
     * Update Vault Membership
     * @param \App\DTO\ObjectsUsersUserIdVaultMembershipVaultIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsUsersUserIdVaultMembershipVaultIdPutRaw(
        \App\DTO\ObjectsUsersUserIdVaultMembershipVaultIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/objects/users/{user_id}/vault_membership/{vault_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Vault Membership
     * @param \App\DTO\ObjectsUsersUserIdVaultMembershipVaultIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsUsersUserIdVaultMembershipVaultIdPut(
        \App\DTO\ObjectsUsersUserIdVaultMembershipVaultIdPUTParameterData $parameters
    ): array
    {
        $response = $this->objectsUsersUserIdVaultMembershipVaultIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Vault Membership
     * @param \App\DTO\ObjectsUsersUserIdVaultMembershipVaultIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsUsersUserIdVaultMembershipVaultIdPutResult(
        \App\DTO\ObjectsUsersUserIdVaultMembershipVaultIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsUsersUserIdVaultMembershipVaultIdPut($parameters));
    }
    //endregion

    //region objectsVaultActionsComparePost
    /**
     * Vault Compare
     * @param \App\DTO\ObjectsVaultActionsComparePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsVaultActionsComparePostRaw(
        \App\DTO\ObjectsVaultActionsComparePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/vault/actions/compare', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Vault Compare
     * @param \App\DTO\ObjectsVaultActionsComparePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsVaultActionsComparePost(
        \App\DTO\ObjectsVaultActionsComparePOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsVaultActionsComparePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Vault Compare
     * @param \App\DTO\ObjectsVaultActionsComparePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsVaultActionsComparePostResult(
        \App\DTO\ObjectsVaultActionsComparePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsVaultActionsComparePost($parameters));
    }
    //endregion

    //region objectsVaultActionsConfigreportPost
    /**
     * Vault Configuration Report
     * @param \App\DTO\ObjectsVaultActionsConfigreportPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function objectsVaultActionsConfigreportPostRaw(
        \App\DTO\ObjectsVaultActionsConfigreportPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/objects/vault/actions/configreport', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Vault Configuration Report
     * @param \App\DTO\ObjectsVaultActionsConfigreportPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function objectsVaultActionsConfigreportPost(
        \App\DTO\ObjectsVaultActionsConfigreportPOSTParameterData $parameters
    ): array
    {
        $response = $this->objectsVaultActionsConfigreportPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Vault Configuration Report
     * @param \App\DTO\ObjectsVaultActionsConfigreportPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function objectsVaultActionsConfigreportPostResult(
        \App\DTO\ObjectsVaultActionsConfigreportPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->objectsVaultActionsConfigreportPost($parameters));
    }
    //endregion

    //region queryComponentsPost
    /**
     * Component Definition Query
     * @param \App\DTO\QueryComponentsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function queryComponentsPostRaw(
        \App\DTO\QueryComponentsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/query/components', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Component Definition Query
     * @param \App\DTO\QueryComponentsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function queryComponentsPost(
        \App\DTO\QueryComponentsPOSTParameterData $parameters
    ): array
    {
        $response = $this->queryComponentsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Component Definition Query
     * @param \App\DTO\QueryComponentsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function queryComponentsPostResult(
        \App\DTO\QueryComponentsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->queryComponentsPost($parameters));
    }
    //endregion

    //region queryNextPagePost
    /**
     * Next Page URL
     * @param \App\DTO\QueryNextPagePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function queryNextPagePostRaw(
        \App\DTO\QueryNextPagePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/query/{next_page}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Next Page URL
     * @param \App\DTO\QueryNextPagePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function queryNextPagePost(
        \App\DTO\QueryNextPagePOSTParameterData $parameters
    ): array
    {
        $response = $this->queryNextPagePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Next Page URL
     * @param \App\DTO\QueryNextPagePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function queryNextPagePostResult(
        \App\DTO\QueryNextPagePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->queryNextPagePost($parameters));
    }
    //endregion

    //region queryPost
    /**
     * Submitting a Query
     * @param \App\DTO\QueryPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function queryPostRaw(
        \App\DTO\QueryPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/query', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Submitting a Query
     * @param \App\DTO\QueryPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function queryPost(
        \App\DTO\QueryPOSTParameterData $parameters
    ): array
    {
        $response = $this->queryPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Submitting a Query
     * @param \App\DTO\QueryPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function queryPostResult(
        \App\DTO\QueryPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->queryPost($parameters));
    }
    //endregion

    //region queryPreviousPagePost
    /**
     * Previous Page URL
     * @param \App\DTO\QueryPreviousPagePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function queryPreviousPagePostRaw(
        \App\DTO\QueryPreviousPagePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/query/{previous_page}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Previous Page URL
     * @param \App\DTO\QueryPreviousPagePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function queryPreviousPagePost(
        \App\DTO\QueryPreviousPagePOSTParameterData $parameters
    ): array
    {
        $response = $this->queryPreviousPagePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Previous Page URL
     * @param \App\DTO\QueryPreviousPagePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function queryPreviousPagePostResult(
        \App\DTO\QueryPreviousPagePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->queryPreviousPagePost($parameters));
    }
    //endregion

    //region scimV2MeGet
    /**
     * Retrieve Current User with SCIM
     * @param \App\DTO\ScimV2MeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2MeGetRaw(
        \App\DTO\ScimV2MeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/Me', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Current User with SCIM
     * @param \App\DTO\ScimV2MeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2MeGet(
        \App\DTO\ScimV2MeGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2MeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Current User with SCIM
     * @param \App\DTO\ScimV2MeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2MeGetResult(
        \App\DTO\ScimV2MeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2MeGet($parameters));
    }
    //endregion

    //region scimV2MePut
    /**
     * Update Current User with SCIM
     * @param \App\DTO\ScimV2MePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2MePutRaw(
        \App\DTO\ScimV2MePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/scim/v2/Me', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Current User with SCIM
     * @param \App\DTO\ScimV2MePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2MePut(
        \App\DTO\ScimV2MePUTParameterData $parameters
    ): array
    {
        $response = $this->scimV2MePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Current User with SCIM
     * @param \App\DTO\ScimV2MePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2MePutResult(
        \App\DTO\ScimV2MePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2MePut($parameters));
    }
    //endregion

    //region scimV2ResourceTypesGet
    /**
     * Retrieve All SCIM Resource Types
     * @param \App\DTO\ScimV2ResourceTypesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2ResourceTypesGetRaw(
        \App\DTO\ScimV2ResourceTypesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/ResourceTypes', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All SCIM Resource Types
     * @param \App\DTO\ScimV2ResourceTypesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2ResourceTypesGet(
        \App\DTO\ScimV2ResourceTypesGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2ResourceTypesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All SCIM Resource Types
     * @param \App\DTO\ScimV2ResourceTypesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2ResourceTypesGetResult(
        \App\DTO\ScimV2ResourceTypesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2ResourceTypesGet($parameters));
    }
    //endregion

    //region scimV2ResourceTypesTypeGet
    /**
     * Retrieve Single SCIM Resource Type
     * @param \App\DTO\ScimV2ResourceTypesTypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2ResourceTypesTypeGetRaw(
        \App\DTO\ScimV2ResourceTypesTypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/ResourceTypes/{type}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Single SCIM Resource Type
     * @param \App\DTO\ScimV2ResourceTypesTypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2ResourceTypesTypeGet(
        \App\DTO\ScimV2ResourceTypesTypeGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2ResourceTypesTypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Single SCIM Resource Type
     * @param \App\DTO\ScimV2ResourceTypesTypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2ResourceTypesTypeGetResult(
        \App\DTO\ScimV2ResourceTypesTypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2ResourceTypesTypeGet($parameters));
    }
    //endregion

    //region scimV2SchemasGet
    /**
     * Retrieve All SCIM Schema Information
     * @param \App\DTO\ScimV2SchemasGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2SchemasGetRaw(
        \App\DTO\ScimV2SchemasGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/Schemas', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All SCIM Schema Information
     * @param \App\DTO\ScimV2SchemasGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2SchemasGet(
        \App\DTO\ScimV2SchemasGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2SchemasGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All SCIM Schema Information
     * @param \App\DTO\ScimV2SchemasGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2SchemasGetResult(
        \App\DTO\ScimV2SchemasGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2SchemasGet($parameters));
    }
    //endregion

    //region scimV2SchemasIdGet
    /**
     * Retrieve Single SCIM Schema Information
     * @param \App\DTO\ScimV2SchemasIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2SchemasIdGetRaw(
        \App\DTO\ScimV2SchemasIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/Schemas/{id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Single SCIM Schema Information
     * @param \App\DTO\ScimV2SchemasIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2SchemasIdGet(
        \App\DTO\ScimV2SchemasIdGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2SchemasIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Single SCIM Schema Information
     * @param \App\DTO\ScimV2SchemasIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2SchemasIdGetResult(
        \App\DTO\ScimV2SchemasIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2SchemasIdGet($parameters));
    }
    //endregion

    //region scimV2ServiceProviderConfigGet
    /**
     * Retrieve SCIM Provider
     * @param \App\DTO\ScimV2ServiceProviderConfigGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2ServiceProviderConfigGetRaw(
        \App\DTO\ScimV2ServiceProviderConfigGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/ServiceProviderConfig', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve SCIM Provider
     * @param \App\DTO\ScimV2ServiceProviderConfigGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2ServiceProviderConfigGet(
        \App\DTO\ScimV2ServiceProviderConfigGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2ServiceProviderConfigGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve SCIM Provider
     * @param \App\DTO\ScimV2ServiceProviderConfigGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2ServiceProviderConfigGetResult(
        \App\DTO\ScimV2ServiceProviderConfigGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2ServiceProviderConfigGet($parameters));
    }
    //endregion

    //region scimV2TypeGet
    /**
     * Retrieve SCIM Resources
     * @param \App\DTO\ScimV2TypeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2TypeGetRaw(
        \App\DTO\ScimV2TypeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/{type}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve SCIM Resources
     * @param \App\DTO\ScimV2TypeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2TypeGet(
        \App\DTO\ScimV2TypeGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2TypeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve SCIM Resources
     * @param \App\DTO\ScimV2TypeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2TypeGetResult(
        \App\DTO\ScimV2TypeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2TypeGet($parameters));
    }
    //endregion

    //region scimV2TypeIdGet
    /**
     * Retrieve Single SCIM Resource
     * @param \App\DTO\ScimV2TypeIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2TypeIdGetRaw(
        \App\DTO\ScimV2TypeIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/{type}/{id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Single SCIM Resource
     * @param \App\DTO\ScimV2TypeIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2TypeIdGet(
        \App\DTO\ScimV2TypeIdGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2TypeIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Single SCIM Resource
     * @param \App\DTO\ScimV2TypeIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2TypeIdGetResult(
        \App\DTO\ScimV2TypeIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2TypeIdGet($parameters));
    }
    //endregion

    //region scimV2UsersGet
    /**
     * Retrieve All Users with SCIM
     * @param \App\DTO\ScimV2UsersGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2UsersGetRaw(
        \App\DTO\ScimV2UsersGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/Users', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Users with SCIM
     * @param \App\DTO\ScimV2UsersGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2UsersGet(
        \App\DTO\ScimV2UsersGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2UsersGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Users with SCIM
     * @param \App\DTO\ScimV2UsersGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2UsersGetResult(
        \App\DTO\ScimV2UsersGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2UsersGet($parameters));
    }
    //endregion

    //region scimV2UsersIdGet
    /**
     * Retrieve Single User with SCIM
     * @param \App\DTO\ScimV2UsersIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2UsersIdGetRaw(
        \App\DTO\ScimV2UsersIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/scim/v2/Users/{id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Single User with SCIM
     * @param \App\DTO\ScimV2UsersIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2UsersIdGet(
        \App\DTO\ScimV2UsersIdGETParameterData $parameters
    ): array
    {
        $response = $this->scimV2UsersIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Single User with SCIM
     * @param \App\DTO\ScimV2UsersIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2UsersIdGetResult(
        \App\DTO\ScimV2UsersIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2UsersIdGet($parameters));
    }
    //endregion

    //region scimV2UsersIdPut
    /**
     * Update User with SCIM
     * @param \App\DTO\ScimV2UsersIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2UsersIdPutRaw(
        \App\DTO\ScimV2UsersIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/scim/v2/Users/{id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update User with SCIM
     * @param \App\DTO\ScimV2UsersIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2UsersIdPut(
        \App\DTO\ScimV2UsersIdPUTParameterData $parameters
    ): array
    {
        $response = $this->scimV2UsersIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update User with SCIM
     * @param \App\DTO\ScimV2UsersIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2UsersIdPutResult(
        \App\DTO\ScimV2UsersIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2UsersIdPut($parameters));
    }
    //endregion

    //region scimV2UsersPost
    /**
     * Create User with SCIM
     * @param \App\DTO\ScimV2UsersPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function scimV2UsersPostRaw(
        \App\DTO\ScimV2UsersPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/scim/v2/Users', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create User with SCIM
     * @param \App\DTO\ScimV2UsersPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function scimV2UsersPost(
        \App\DTO\ScimV2UsersPOSTParameterData $parameters
    ): array
    {
        $response = $this->scimV2UsersPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create User with SCIM
     * @param \App\DTO\ScimV2UsersPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function scimV2UsersPostResult(
        \App\DTO\ScimV2UsersPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->scimV2UsersPost($parameters));
    }
    //endregion

    //region servicesCertificateCertIdGet
    /**
     * Retrieve Signing Certificate
     * @param \App\DTO\ServicesCertificateCertIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesCertificateCertIdGetRaw(
        \App\DTO\ServicesCertificateCertIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/certificate/{cert_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Signing Certificate
     * @param \App\DTO\ServicesCertificateCertIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesCertificateCertIdGet(
        \App\DTO\ServicesCertificateCertIdGETParameterData $parameters
    ): array
    {
        $response = $this->servicesCertificateCertIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Signing Certificate
     * @param \App\DTO\ServicesCertificateCertIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesCertificateCertIdGetResult(
        \App\DTO\ServicesCertificateCertIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesCertificateCertIdGet($parameters));
    }
    //endregion

    //region servicesConfigurationModeActionsDisablePost
    /**
     * Disable Configuration Mode
     * @param \App\DTO\ServicesConfigurationModeActionsDisablePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesConfigurationModeActionsDisablePostRaw(
        \App\DTO\ServicesConfigurationModeActionsDisablePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/configuration_mode/actions/disable', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Disable Configuration Mode
     * @param \App\DTO\ServicesConfigurationModeActionsDisablePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesConfigurationModeActionsDisablePost(
        \App\DTO\ServicesConfigurationModeActionsDisablePOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesConfigurationModeActionsDisablePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Disable Configuration Mode
     * @param \App\DTO\ServicesConfigurationModeActionsDisablePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesConfigurationModeActionsDisablePostResult(
        \App\DTO\ServicesConfigurationModeActionsDisablePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesConfigurationModeActionsDisablePost($parameters));
    }
    //endregion

    //region servicesConfigurationModeActionsEnablePost
    /**
     * Enable Configuration Mode
     * @param \App\DTO\ServicesConfigurationModeActionsEnablePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesConfigurationModeActionsEnablePostRaw(
        \App\DTO\ServicesConfigurationModeActionsEnablePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/configuration_mode/actions/enable', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Enable Configuration Mode
     * @param \App\DTO\ServicesConfigurationModeActionsEnablePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesConfigurationModeActionsEnablePost(
        \App\DTO\ServicesConfigurationModeActionsEnablePOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesConfigurationModeActionsEnablePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Enable Configuration Mode
     * @param \App\DTO\ServicesConfigurationModeActionsEnablePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesConfigurationModeActionsEnablePostResult(
        \App\DTO\ServicesConfigurationModeActionsEnablePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesConfigurationModeActionsEnablePost($parameters));
    }
    //endregion

    //region servicesDirectdataFilesGet
    /**
     * Retrieve Available Direct Data Files
     * @param \App\DTO\ServicesDirectdataFilesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesDirectdataFilesGetRaw(
        \App\DTO\ServicesDirectdataFilesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/directdata/files', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Available Direct Data Files
     * @param \App\DTO\ServicesDirectdataFilesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesDirectdataFilesGet(
        \App\DTO\ServicesDirectdataFilesGETParameterData $parameters
    ): array
    {
        $response = $this->servicesDirectdataFilesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Available Direct Data Files
     * @param \App\DTO\ServicesDirectdataFilesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesDirectdataFilesGetResult(
        \App\DTO\ServicesDirectdataFilesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesDirectdataFilesGet($parameters));
    }
    //endregion

    //region servicesDirectdataFilesNameGet
    /**
     * Download Direct Data File
     * @param \App\DTO\ServicesDirectdataFilesNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesDirectdataFilesNameGetRaw(
        \App\DTO\ServicesDirectdataFilesNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/directdata/files/{name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Direct Data File
     * @param \App\DTO\ServicesDirectdataFilesNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesDirectdataFilesNameGet(
        \App\DTO\ServicesDirectdataFilesNameGETParameterData $parameters
    ): array
    {
        $response = $this->servicesDirectdataFilesNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Direct Data File
     * @param \App\DTO\ServicesDirectdataFilesNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesDirectdataFilesNameGetResult(
        \App\DTO\ServicesDirectdataFilesNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesDirectdataFilesNameGet($parameters));
    }
    //endregion

    //region servicesFileStagingItemsContentItemGet
    /**
     * Download Item Content
     * @param \App\DTO\ServicesFileStagingItemsContentItemGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingItemsContentItemGetRaw(
        \App\DTO\ServicesFileStagingItemsContentItemGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/file_staging/items/content/{item}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Item Content
     * @param \App\DTO\ServicesFileStagingItemsContentItemGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingItemsContentItemGet(
        \App\DTO\ServicesFileStagingItemsContentItemGETParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingItemsContentItemGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Item Content
     * @param \App\DTO\ServicesFileStagingItemsContentItemGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingItemsContentItemGetResult(
        \App\DTO\ServicesFileStagingItemsContentItemGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingItemsContentItemGet($parameters));
    }
    //endregion

    //region servicesFileStagingItemsItemDelete
    /**
     * Delete File or Folder
     * @param \App\DTO\ServicesFileStagingItemsItemDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingItemsItemDeleteRaw(
        \App\DTO\ServicesFileStagingItemsItemDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/services/file_staging/items/{item}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete File or Folder
     * @param \App\DTO\ServicesFileStagingItemsItemDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingItemsItemDelete(
        \App\DTO\ServicesFileStagingItemsItemDELETEParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingItemsItemDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete File or Folder
     * @param \App\DTO\ServicesFileStagingItemsItemDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingItemsItemDeleteResult(
        \App\DTO\ServicesFileStagingItemsItemDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingItemsItemDelete($parameters));
    }
    //endregion

    //region servicesFileStagingItemsItemGet
    /**
     * List Items at a Path
     * @param \App\DTO\ServicesFileStagingItemsItemGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingItemsItemGetRaw(
        \App\DTO\ServicesFileStagingItemsItemGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/file_staging/items/{item}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List Items at a Path
     * @param \App\DTO\ServicesFileStagingItemsItemGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingItemsItemGet(
        \App\DTO\ServicesFileStagingItemsItemGETParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingItemsItemGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List Items at a Path
     * @param \App\DTO\ServicesFileStagingItemsItemGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingItemsItemGetResult(
        \App\DTO\ServicesFileStagingItemsItemGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingItemsItemGet($parameters));
    }
    //endregion

    //region servicesFileStagingItemsItemPut
    /**
     * Update Folder or File
     * @param \App\DTO\ServicesFileStagingItemsItemPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingItemsItemPutRaw(
        \App\DTO\ServicesFileStagingItemsItemPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/services/file_staging/items/{item}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Folder or File
     * @param \App\DTO\ServicesFileStagingItemsItemPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingItemsItemPut(
        \App\DTO\ServicesFileStagingItemsItemPUTParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingItemsItemPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Folder or File
     * @param \App\DTO\ServicesFileStagingItemsItemPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingItemsItemPutResult(
        \App\DTO\ServicesFileStagingItemsItemPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingItemsItemPut($parameters));
    }
    //endregion

    //region servicesFileStagingItemsPost
    /**
     * Create Folder or File
     * @param \App\DTO\ServicesFileStagingItemsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingItemsPostRaw(
        \App\DTO\ServicesFileStagingItemsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/file_staging/items', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Folder or File
     * @param \App\DTO\ServicesFileStagingItemsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingItemsPost(
        \App\DTO\ServicesFileStagingItemsPOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingItemsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Folder or File
     * @param \App\DTO\ServicesFileStagingItemsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingItemsPostResult(
        \App\DTO\ServicesFileStagingItemsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingItemsPost($parameters));
    }
    //endregion

    //region servicesFileStagingUploadGet
    /**
     * List Upload Sessions
     * @param \App\DTO\ServicesFileStagingUploadGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingUploadGetRaw(
        \App\DTO\ServicesFileStagingUploadGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/file_staging/upload/', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List Upload Sessions
     * @param \App\DTO\ServicesFileStagingUploadGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingUploadGet(
        \App\DTO\ServicesFileStagingUploadGETParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingUploadGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List Upload Sessions
     * @param \App\DTO\ServicesFileStagingUploadGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingUploadGetResult(
        \App\DTO\ServicesFileStagingUploadGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingUploadGet($parameters));
    }
    //endregion

    //region servicesFileStagingUploadPost
    /**
     * Create Resumable Upload Session
     * @param \App\DTO\ServicesFileStagingUploadPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingUploadPostRaw(
        \App\DTO\ServicesFileStagingUploadPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/file_staging/upload', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Resumable Upload Session
     * @param \App\DTO\ServicesFileStagingUploadPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingUploadPost(
        \App\DTO\ServicesFileStagingUploadPOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingUploadPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Resumable Upload Session
     * @param \App\DTO\ServicesFileStagingUploadPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingUploadPostResult(
        \App\DTO\ServicesFileStagingUploadPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingUploadPost($parameters));
    }
    //endregion

    //region servicesFileStagingUploadUploadSessionIdDelete
    /**
     * Abort Upload Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingUploadUploadSessionIdDeleteRaw(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/services/file_staging/upload/{upload_session_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Abort Upload Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingUploadUploadSessionIdDelete(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingUploadUploadSessionIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Abort Upload Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingUploadUploadSessionIdDeleteResult(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingUploadUploadSessionIdDelete($parameters));
    }
    //endregion

    //region servicesFileStagingUploadUploadSessionIdGet
    /**
     * Get Upload Session Details
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingUploadUploadSessionIdGetRaw(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/file_staging/upload/{upload_session_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Upload Session Details
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingUploadUploadSessionIdGet(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdGETParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingUploadUploadSessionIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Upload Session Details
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingUploadUploadSessionIdGetResult(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingUploadUploadSessionIdGet($parameters));
    }
    //endregion

    //region servicesFileStagingUploadUploadSessionIdPartsGet
    /**
     * List File Parts Uploaded to Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPartsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingUploadUploadSessionIdPartsGetRaw(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPartsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/file_staging/upload/{upload_session_id}/parts', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List File Parts Uploaded to Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPartsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingUploadUploadSessionIdPartsGet(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPartsGETParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingUploadUploadSessionIdPartsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List File Parts Uploaded to Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPartsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingUploadUploadSessionIdPartsGetResult(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPartsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingUploadUploadSessionIdPartsGet($parameters));
    }
    //endregion

    //region servicesFileStagingUploadUploadSessionIdPost
    /**
     * Commit Upload Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingUploadUploadSessionIdPostRaw(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/file_staging/upload/{upload_session_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Commit Upload Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingUploadUploadSessionIdPost(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingUploadUploadSessionIdPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Commit Upload Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingUploadUploadSessionIdPostResult(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingUploadUploadSessionIdPost($parameters));
    }
    //endregion

    //region servicesFileStagingUploadUploadSessionIdPut
    /**
     * Upload to a Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesFileStagingUploadUploadSessionIdPutRaw(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/services/file_staging/upload/{upload_session_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Upload to a Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesFileStagingUploadUploadSessionIdPut(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPUTParameterData $parameters
    ): array
    {
        $response = $this->servicesFileStagingUploadUploadSessionIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Upload to a Session
     * @param \App\DTO\ServicesFileStagingUploadUploadSessionIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesFileStagingUploadUploadSessionIdPutResult(
        \App\DTO\ServicesFileStagingUploadUploadSessionIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesFileStagingUploadUploadSessionIdPut($parameters));
    }
    //endregion

    //region servicesJobsHistoriesGet
    /**
     * Retrieve Job Histories
     * @param \App\DTO\ServicesJobsHistoriesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesJobsHistoriesGetRaw(
        \App\DTO\ServicesJobsHistoriesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/jobs/histories', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Job Histories
     * @param \App\DTO\ServicesJobsHistoriesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesJobsHistoriesGet(
        \App\DTO\ServicesJobsHistoriesGETParameterData $parameters
    ): array
    {
        $response = $this->servicesJobsHistoriesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Job Histories
     * @param \App\DTO\ServicesJobsHistoriesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesJobsHistoriesGetResult(
        \App\DTO\ServicesJobsHistoriesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesJobsHistoriesGet($parameters));
    }
    //endregion

    //region servicesJobsJobIdErrorsGet
    /**
     * Retrieve Import Bulk Translation File Job Errors
     * @param \App\DTO\ServicesJobsJobIdErrorsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesJobsJobIdErrorsGetRaw(
        \App\DTO\ServicesJobsJobIdErrorsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/jobs/{job_id}/errors', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Import Bulk Translation File Job Errors
     * @param \App\DTO\ServicesJobsJobIdErrorsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesJobsJobIdErrorsGet(
        \App\DTO\ServicesJobsJobIdErrorsGETParameterData $parameters
    ): array
    {
        $response = $this->servicesJobsJobIdErrorsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Import Bulk Translation File Job Errors
     * @param \App\DTO\ServicesJobsJobIdErrorsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesJobsJobIdErrorsGetResult(
        \App\DTO\ServicesJobsJobIdErrorsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesJobsJobIdErrorsGet($parameters));
    }
    //endregion

    //region servicesJobsJobIdGet
    /**
     * Retrieve Job Status
     * @param \App\DTO\ServicesJobsJobIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesJobsJobIdGetRaw(
        \App\DTO\ServicesJobsJobIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/jobs/{job_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Job Status
     * @param \App\DTO\ServicesJobsJobIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesJobsJobIdGet(
        \App\DTO\ServicesJobsJobIdGETParameterData $parameters
    ): array
    {
        $response = $this->servicesJobsJobIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Job Status
     * @param \App\DTO\ServicesJobsJobIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesJobsJobIdGetResult(
        \App\DTO\ServicesJobsJobIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesJobsJobIdGet($parameters));
    }
    //endregion

    //region servicesJobsJobIdSummaryGet
    /**
     * Retrieve Import Bulk Translation File Job Summary
     * @param \App\DTO\ServicesJobsJobIdSummaryGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesJobsJobIdSummaryGetRaw(
        \App\DTO\ServicesJobsJobIdSummaryGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/jobs/{job_id}/summary', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Import Bulk Translation File Job Summary
     * @param \App\DTO\ServicesJobsJobIdSummaryGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesJobsJobIdSummaryGet(
        \App\DTO\ServicesJobsJobIdSummaryGETParameterData $parameters
    ): array
    {
        $response = $this->servicesJobsJobIdSummaryGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Import Bulk Translation File Job Summary
     * @param \App\DTO\ServicesJobsJobIdSummaryGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesJobsJobIdSummaryGetResult(
        \App\DTO\ServicesJobsJobIdSummaryGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesJobsJobIdSummaryGet($parameters));
    }
    //endregion

    //region servicesJobsJobIdTasksGet
    /**
     * Retrieve SDK Job Tasks
     * @param \App\DTO\ServicesJobsJobIdTasksGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesJobsJobIdTasksGetRaw(
        \App\DTO\ServicesJobsJobIdTasksGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/jobs/{job_id}/tasks', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve SDK Job Tasks
     * @param \App\DTO\ServicesJobsJobIdTasksGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesJobsJobIdTasksGet(
        \App\DTO\ServicesJobsJobIdTasksGETParameterData $parameters
    ): array
    {
        $response = $this->servicesJobsJobIdTasksGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve SDK Job Tasks
     * @param \App\DTO\ServicesJobsJobIdTasksGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesJobsJobIdTasksGetResult(
        \App\DTO\ServicesJobsJobIdTasksGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesJobsJobIdTasksGet($parameters));
    }
    //endregion

    //region servicesJobsMonitorsGet
    /**
     * Retrieve Job Monitors
     * @param \App\DTO\ServicesJobsMonitorsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesJobsMonitorsGetRaw(
        \App\DTO\ServicesJobsMonitorsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/jobs/monitors', [], $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Job Monitors
     * @param \App\DTO\ServicesJobsMonitorsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesJobsMonitorsGet(
        \App\DTO\ServicesJobsMonitorsGETParameterData $parameters
    ): array
    {
        $response = $this->servicesJobsMonitorsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Job Monitors
     * @param \App\DTO\ServicesJobsMonitorsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesJobsMonitorsGetResult(
        \App\DTO\ServicesJobsMonitorsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesJobsMonitorsGet($parameters));
    }
    //endregion

    //region servicesJobsStartNowJobIdPost
    /**
     * Start Job
     * @param \App\DTO\ServicesJobsStartNowJobIdPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesJobsStartNowJobIdPostRaw(
        \App\DTO\ServicesJobsStartNowJobIdPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/jobs/start_now/{job_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Start Job
     * @param \App\DTO\ServicesJobsStartNowJobIdPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesJobsStartNowJobIdPost(
        \App\DTO\ServicesJobsStartNowJobIdPOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesJobsStartNowJobIdPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Start Job
     * @param \App\DTO\ServicesJobsStartNowJobIdPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesJobsStartNowJobIdPostResult(
        \App\DTO\ServicesJobsStartNowJobIdPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesJobsStartNowJobIdPost($parameters));
    }
    //endregion

    //region servicesLoaderExtractPost
    /**
     * Extract Data Files
     * @param \App\DTO\ServicesLoaderExtractPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesLoaderExtractPostRaw(
        \App\DTO\ServicesLoaderExtractPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/loader/extract', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Extract Data Files
     * @param \App\DTO\ServicesLoaderExtractPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesLoaderExtractPost(
        \App\DTO\ServicesLoaderExtractPOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesLoaderExtractPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Extract Data Files
     * @param \App\DTO\ServicesLoaderExtractPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesLoaderExtractPostResult(
        \App\DTO\ServicesLoaderExtractPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesLoaderExtractPost($parameters));
    }
    //endregion

    //region servicesLoaderJobIdTasksTaskIdFailurelogGet
    /**
     * Retrieve Load Failure Log Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdFailurelogGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesLoaderJobIdTasksTaskIdFailurelogGetRaw(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdFailurelogGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/loader/{job_id}/tasks/{task_id}/failurelog', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Load Failure Log Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdFailurelogGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesLoaderJobIdTasksTaskIdFailurelogGet(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdFailurelogGETParameterData $parameters
    ): array
    {
        $response = $this->servicesLoaderJobIdTasksTaskIdFailurelogGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Load Failure Log Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdFailurelogGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesLoaderJobIdTasksTaskIdFailurelogGetResult(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdFailurelogGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesLoaderJobIdTasksTaskIdFailurelogGet($parameters));
    }
    //endregion

    //region servicesLoaderJobIdTasksTaskIdResultsGet
    /**
     * Retrieve Loader Extract Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesLoaderJobIdTasksTaskIdResultsGetRaw(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/loader/{job_id}/tasks/{task_id}/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Loader Extract Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesLoaderJobIdTasksTaskIdResultsGet(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsGETParameterData $parameters
    ): array
    {
        $response = $this->servicesLoaderJobIdTasksTaskIdResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Loader Extract Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesLoaderJobIdTasksTaskIdResultsGetResult(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesLoaderJobIdTasksTaskIdResultsGet($parameters));
    }
    //endregion

    //region servicesLoaderJobIdTasksTaskIdResultsRenditionsGet
    /**
     * Retrieve Loader Extract Renditions Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsRenditionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesLoaderJobIdTasksTaskIdResultsRenditionsGetRaw(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsRenditionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/loader/{job_id}/tasks/{task_id}/results/renditions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Loader Extract Renditions Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsRenditionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsRenditionsGETParameterData $parameters
    ): array
    {
        $response = $this->servicesLoaderJobIdTasksTaskIdResultsRenditionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Loader Extract Renditions Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsRenditionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesLoaderJobIdTasksTaskIdResultsRenditionsGetResult(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdResultsRenditionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesLoaderJobIdTasksTaskIdResultsRenditionsGet($parameters));
    }
    //endregion

    //region servicesLoaderJobIdTasksTaskIdSuccesslogGet
    /**
     * Retrieve Load Success Log Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdSuccesslogGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesLoaderJobIdTasksTaskIdSuccesslogGetRaw(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdSuccesslogGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/loader/{job_id}/tasks/{task_id}/successlog', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Load Success Log Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdSuccesslogGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesLoaderJobIdTasksTaskIdSuccesslogGet(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdSuccesslogGETParameterData $parameters
    ): array
    {
        $response = $this->servicesLoaderJobIdTasksTaskIdSuccesslogGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Load Success Log Results
     * @param \App\DTO\ServicesLoaderJobIdTasksTaskIdSuccesslogGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesLoaderJobIdTasksTaskIdSuccesslogGetResult(
        \App\DTO\ServicesLoaderJobIdTasksTaskIdSuccesslogGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesLoaderJobIdTasksTaskIdSuccesslogGet($parameters));
    }
    //endregion

    //region servicesLoaderLoadPost
    /**
     * Load Data Objects
     * @param \App\DTO\ServicesLoaderLoadPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesLoaderLoadPostRaw(
        \App\DTO\ServicesLoaderLoadPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/loader/load', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Load Data Objects
     * @param \App\DTO\ServicesLoaderLoadPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesLoaderLoadPost(
        \App\DTO\ServicesLoaderLoadPOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesLoaderLoadPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Load Data Objects
     * @param \App\DTO\ServicesLoaderLoadPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesLoaderLoadPostResult(
        \App\DTO\ServicesLoaderLoadPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesLoaderLoadPost($parameters));
    }
    //endregion

    //region servicesPackageActionsValidatePost
    /**
     * Validate Package
     * @param \App\DTO\ServicesPackageActionsValidatePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesPackageActionsValidatePostRaw(
        \App\DTO\ServicesPackageActionsValidatePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/package/actions/validate', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Validate Package
     * @param \App\DTO\ServicesPackageActionsValidatePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesPackageActionsValidatePost(
        \App\DTO\ServicesPackageActionsValidatePOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesPackageActionsValidatePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Validate Package
     * @param \App\DTO\ServicesPackageActionsValidatePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesPackageActionsValidatePostResult(
        \App\DTO\ServicesPackageActionsValidatePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesPackageActionsValidatePost($parameters));
    }
    //endregion

    //region servicesPackagePost
    /**
     * Export Package
     * @param \App\DTO\ServicesPackagePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesPackagePostRaw(
        \App\DTO\ServicesPackagePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/package', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Export Package
     * @param \App\DTO\ServicesPackagePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesPackagePost(
        \App\DTO\ServicesPackagePOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesPackagePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Export Package
     * @param \App\DTO\ServicesPackagePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesPackagePostResult(
        \App\DTO\ServicesPackagePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesPackagePost($parameters));
    }
    //endregion

    //region servicesPackagePut
    /**
     * Import Package
     * @param \App\DTO\ServicesPackagePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesPackagePutRaw(
        \App\DTO\ServicesPackagePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/services/package', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Import Package
     * @param \App\DTO\ServicesPackagePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesPackagePut(
        \App\DTO\ServicesPackagePUTParameterData $parameters
    ): array
    {
        $response = $this->servicesPackagePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Import Package
     * @param \App\DTO\ServicesPackagePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesPackagePutResult(
        \App\DTO\ServicesPackagePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesPackagePut($parameters));
    }
    //endregion

    //region servicesQueuesGet
    /**
     * Retrieve All Queues
     * @param \App\DTO\ServicesQueuesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesQueuesGetRaw(
        \App\DTO\ServicesQueuesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/queues', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Queues
     * @param \App\DTO\ServicesQueuesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesQueuesGet(
        \App\DTO\ServicesQueuesGETParameterData $parameters
    ): array
    {
        $response = $this->servicesQueuesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Queues
     * @param \App\DTO\ServicesQueuesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesQueuesGetResult(
        \App\DTO\ServicesQueuesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesQueuesGet($parameters));
    }
    //endregion

    //region servicesQueuesQueueNameActionsDisableDeliveryPut
    /**
     * Disable Delivery
     * @param \App\DTO\ServicesQueuesQueueNameActionsDisableDeliveryPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesQueuesQueueNameActionsDisableDeliveryPutRaw(
        \App\DTO\ServicesQueuesQueueNameActionsDisableDeliveryPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/services/queues/{queue_name}/actions/disable_delivery', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Disable Delivery
     * @param \App\DTO\ServicesQueuesQueueNameActionsDisableDeliveryPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesQueuesQueueNameActionsDisableDeliveryPut(
        \App\DTO\ServicesQueuesQueueNameActionsDisableDeliveryPUTParameterData $parameters
    ): array
    {
        $response = $this->servicesQueuesQueueNameActionsDisableDeliveryPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Disable Delivery
     * @param \App\DTO\ServicesQueuesQueueNameActionsDisableDeliveryPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesQueuesQueueNameActionsDisableDeliveryPutResult(
        \App\DTO\ServicesQueuesQueueNameActionsDisableDeliveryPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesQueuesQueueNameActionsDisableDeliveryPut($parameters));
    }
    //endregion

    //region servicesQueuesQueueNameActionsEnableDeliveryPut
    /**
     * Enable Delivery
     * @param \App\DTO\ServicesQueuesQueueNameActionsEnableDeliveryPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesQueuesQueueNameActionsEnableDeliveryPutRaw(
        \App\DTO\ServicesQueuesQueueNameActionsEnableDeliveryPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/services/queues/{queue_name}/actions/enable_delivery', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Enable Delivery
     * @param \App\DTO\ServicesQueuesQueueNameActionsEnableDeliveryPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesQueuesQueueNameActionsEnableDeliveryPut(
        \App\DTO\ServicesQueuesQueueNameActionsEnableDeliveryPUTParameterData $parameters
    ): array
    {
        $response = $this->servicesQueuesQueueNameActionsEnableDeliveryPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Enable Delivery
     * @param \App\DTO\ServicesQueuesQueueNameActionsEnableDeliveryPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesQueuesQueueNameActionsEnableDeliveryPutResult(
        \App\DTO\ServicesQueuesQueueNameActionsEnableDeliveryPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesQueuesQueueNameActionsEnableDeliveryPut($parameters));
    }
    //endregion

    //region servicesQueuesQueueNameActionsResetPut
    /**
     * Reset Queue
     * @param \App\DTO\ServicesQueuesQueueNameActionsResetPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesQueuesQueueNameActionsResetPutRaw(
        \App\DTO\ServicesQueuesQueueNameActionsResetPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/services/queues/{queue_name}/actions/reset', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Reset Queue
     * @param \App\DTO\ServicesQueuesQueueNameActionsResetPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesQueuesQueueNameActionsResetPut(
        \App\DTO\ServicesQueuesQueueNameActionsResetPUTParameterData $parameters
    ): array
    {
        $response = $this->servicesQueuesQueueNameActionsResetPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Reset Queue
     * @param \App\DTO\ServicesQueuesQueueNameActionsResetPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesQueuesQueueNameActionsResetPutResult(
        \App\DTO\ServicesQueuesQueueNameActionsResetPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesQueuesQueueNameActionsResetPut($parameters));
    }
    //endregion

    //region servicesQueuesQueueNameGet
    /**
     * Retrieve Queue Status
     * @param \App\DTO\ServicesQueuesQueueNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesQueuesQueueNameGetRaw(
        \App\DTO\ServicesQueuesQueueNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/services/queues/{queue_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Queue Status
     * @param \App\DTO\ServicesQueuesQueueNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesQueuesQueueNameGet(
        \App\DTO\ServicesQueuesQueueNameGETParameterData $parameters
    ): array
    {
        $response = $this->servicesQueuesQueueNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Queue Status
     * @param \App\DTO\ServicesQueuesQueueNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesQueuesQueueNameGetResult(
        \App\DTO\ServicesQueuesQueueNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesQueuesQueueNameGet($parameters));
    }
    //endregion

    //region servicesVobjectVaultPackageVPackageIdActionsValidatePost
    /**
     * Validate Imported Package
     * @param \App\DTO\ServicesVobjectVaultPackageVPackageIdActionsValidatePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function servicesVobjectVaultPackageVPackageIdActionsValidatePostRaw(
        \App\DTO\ServicesVobjectVaultPackageVPackageIdActionsValidatePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/services/vobject/vault_package__v/{package_id}/actions/validate', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Validate Imported Package
     * @param \App\DTO\ServicesVobjectVaultPackageVPackageIdActionsValidatePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function servicesVobjectVaultPackageVPackageIdActionsValidatePost(
        \App\DTO\ServicesVobjectVaultPackageVPackageIdActionsValidatePOSTParameterData $parameters
    ): array
    {
        $response = $this->servicesVobjectVaultPackageVPackageIdActionsValidatePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Validate Imported Package
     * @param \App\DTO\ServicesVobjectVaultPackageVPackageIdActionsValidatePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function servicesVobjectVaultPackageVPackageIdActionsValidatePostResult(
        \App\DTO\ServicesVobjectVaultPackageVPackageIdActionsValidatePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->servicesVobjectVaultPackageVPackageIdActionsValidatePost($parameters));
    }
    //endregion

    //region sessionDelete
    /**
     * End Session
     * @param \App\DTO\SessionDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function sessionDeleteRaw(
        \App\DTO\SessionDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/session', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * End Session
     * @param \App\DTO\SessionDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function sessionDelete(
        \App\DTO\SessionDELETEParameterData $parameters
    ): array
    {
        $response = $this->sessionDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * End Session
     * @param \App\DTO\SessionDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function sessionDeleteResult(
        \App\DTO\SessionDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->sessionDelete($parameters));
    }
    //endregion

    //region uicodeDistributionsDistributionNameCodeGet
    /**
     * Download Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsDistributionNameCodeGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function uicodeDistributionsDistributionNameCodeGetRaw(
        \App\DTO\UicodeDistributionsDistributionNameCodeGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/uicode/distributions/{distribution_name}/code', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsDistributionNameCodeGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function uicodeDistributionsDistributionNameCodeGet(
        \App\DTO\UicodeDistributionsDistributionNameCodeGETParameterData $parameters
    ): array
    {
        $response = $this->uicodeDistributionsDistributionNameCodeGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsDistributionNameCodeGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function uicodeDistributionsDistributionNameCodeGetResult(
        \App\DTO\UicodeDistributionsDistributionNameCodeGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->uicodeDistributionsDistributionNameCodeGet($parameters));
    }
    //endregion

    //region uicodeDistributionsDistributionNameDelete
    /**
     * Delete Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsDistributionNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function uicodeDistributionsDistributionNameDeleteRaw(
        \App\DTO\UicodeDistributionsDistributionNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/uicode/distributions/{distribution_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsDistributionNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function uicodeDistributionsDistributionNameDelete(
        \App\DTO\UicodeDistributionsDistributionNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->uicodeDistributionsDistributionNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsDistributionNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function uicodeDistributionsDistributionNameDeleteResult(
        \App\DTO\UicodeDistributionsDistributionNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->uicodeDistributionsDistributionNameDelete($parameters));
    }
    //endregion

    //region uicodeDistributionsDistributionNameGet
    /**
     * Retrieve Single Client Code Distribution Metadata
     * @param \App\DTO\UicodeDistributionsDistributionNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function uicodeDistributionsDistributionNameGetRaw(
        \App\DTO\UicodeDistributionsDistributionNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/uicode/distributions/{distribution_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Single Client Code Distribution Metadata
     * @param \App\DTO\UicodeDistributionsDistributionNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function uicodeDistributionsDistributionNameGet(
        \App\DTO\UicodeDistributionsDistributionNameGETParameterData $parameters
    ): array
    {
        $response = $this->uicodeDistributionsDistributionNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Single Client Code Distribution Metadata
     * @param \App\DTO\UicodeDistributionsDistributionNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function uicodeDistributionsDistributionNameGetResult(
        \App\DTO\UicodeDistributionsDistributionNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->uicodeDistributionsDistributionNameGet($parameters));
    }
    //endregion

    //region uicodeDistributionsGet
    /**
     * Retrieve All Client Code Distribution Metadata
     * @param \App\DTO\UicodeDistributionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function uicodeDistributionsGetRaw(
        \App\DTO\UicodeDistributionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/uicode/distributions', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve All Client Code Distribution Metadata
     * @param \App\DTO\UicodeDistributionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function uicodeDistributionsGet(
        \App\DTO\UicodeDistributionsGETParameterData $parameters
    ): array
    {
        $response = $this->uicodeDistributionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve All Client Code Distribution Metadata
     * @param \App\DTO\UicodeDistributionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function uicodeDistributionsGetResult(
        \App\DTO\UicodeDistributionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->uicodeDistributionsGet($parameters));
    }
    //endregion

    //region uicodeDistributionsPost
    /**
     * Add or Replace Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function uicodeDistributionsPostRaw(
        \App\DTO\UicodeDistributionsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/uicode/distributions', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Add or Replace Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function uicodeDistributionsPost(
        \App\DTO\UicodeDistributionsPOSTParameterData $parameters
    ): array
    {
        $response = $this->uicodeDistributionsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Add or Replace Single Client Code Distribution
     * @param \App\DTO\UicodeDistributionsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function uicodeDistributionsPostResult(
        \App\DTO\UicodeDistributionsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->uicodeDistributionsPost($parameters));
    }
    //endregion

    //region vobjectVaultPackageVPackageIdActionsDeployPost
    /**
     * Deploy Package
     * @param \App\DTO\VobjectVaultPackageVPackageIdActionsDeployPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectVaultPackageVPackageIdActionsDeployPostRaw(
        \App\DTO\VobjectVaultPackageVPackageIdActionsDeployPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobject/vault_package__v/{package_id}/actions/deploy', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Deploy Package
     * @param \App\DTO\VobjectVaultPackageVPackageIdActionsDeployPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectVaultPackageVPackageIdActionsDeployPost(
        \App\DTO\VobjectVaultPackageVPackageIdActionsDeployPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectVaultPackageVPackageIdActionsDeployPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Deploy Package
     * @param \App\DTO\VobjectVaultPackageVPackageIdActionsDeployPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectVaultPackageVPackageIdActionsDeployPostResult(
        \App\DTO\VobjectVaultPackageVPackageIdActionsDeployPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectVaultPackageVPackageIdActionsDeployPost($parameters));
    }
    //endregion

    //region vobjectVaultPackageVPackageIdActionsDeployResultsGet
    /**
     * Retrieve Package Deploy Results
     * @param \App\DTO\VobjectVaultPackageVPackageIdActionsDeployResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectVaultPackageVPackageIdActionsDeployResultsGetRaw(
        \App\DTO\VobjectVaultPackageVPackageIdActionsDeployResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobject/vault_package__v/{package_id}/actions/deploy/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Package Deploy Results
     * @param \App\DTO\VobjectVaultPackageVPackageIdActionsDeployResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectVaultPackageVPackageIdActionsDeployResultsGet(
        \App\DTO\VobjectVaultPackageVPackageIdActionsDeployResultsGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectVaultPackageVPackageIdActionsDeployResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Package Deploy Results
     * @param \App\DTO\VobjectVaultPackageVPackageIdActionsDeployResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectVaultPackageVPackageIdActionsDeployResultsGetResult(
        \App\DTO\VobjectVaultPackageVPackageIdActionsDeployResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectVaultPackageVPackageIdActionsDeployResultsGet($parameters));
    }
    //endregion

    //region vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet
    /**
     * Retrieve Results of Cascade Delete Job
     * @param \App\DTO\VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetRaw(
        \App\DTO\VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Results of Cascade Delete Job
     * @param \App\DTO\VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(
        \App\DTO\VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Results of Cascade Delete Job
     * @param \App\DTO\VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetResult(
        \App\DTO\VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet($parameters));
    }
    //endregion

    //region vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet
    /**
     * Retrieve Results of Deep Copy Job
     * @param \App\DTO\VobjectsDeepcopyResultsObjectNameJobStatusJobIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetRaw(
        \App\DTO\VobjectsDeepcopyResultsObjectNameJobStatusJobIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/deepcopy/results/{object_name}/{job_status}/{job_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Results of Deep Copy Job
     * @param \App\DTO\VobjectsDeepcopyResultsObjectNameJobStatusJobIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(
        \App\DTO\VobjectsDeepcopyResultsObjectNameJobStatusJobIdGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Results of Deep Copy Job
     * @param \App\DTO\VobjectsDeepcopyResultsObjectNameJobStatusJobIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetResult(
        \App\DTO\VobjectsDeepcopyResultsObjectNameJobStatusJobIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet($parameters));
    }
    //endregion

    //region vobjectsEdlItemVActionsCreateplaceholderPost
    /**
     * Create a Placeholder from an EDL Item
     * @param \App\DTO\VobjectsEdlItemVActionsCreateplaceholderPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsEdlItemVActionsCreateplaceholderPostRaw(
        \App\DTO\VobjectsEdlItemVActionsCreateplaceholderPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/edl_item__v/actions/createplaceholder', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a Placeholder from an EDL Item
     * @param \App\DTO\VobjectsEdlItemVActionsCreateplaceholderPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsEdlItemVActionsCreateplaceholderPost(
        \App\DTO\VobjectsEdlItemVActionsCreateplaceholderPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsEdlItemVActionsCreateplaceholderPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a Placeholder from an EDL Item
     * @param \App\DTO\VobjectsEdlItemVActionsCreateplaceholderPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsEdlItemVActionsCreateplaceholderPostResult(
        \App\DTO\VobjectsEdlItemVActionsCreateplaceholderPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsEdlItemVActionsCreateplaceholderPost($parameters));
    }
    //endregion

    //region vobjectsMergesJobIdLogGet
    /**
     * Download Merge Records Job Log
     * @param \App\DTO\VobjectsMergesJobIdLogGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsMergesJobIdLogGetRaw(
        \App\DTO\VobjectsMergesJobIdLogGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/merges/{job_id}/log', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Merge Records Job Log
     * @param \App\DTO\VobjectsMergesJobIdLogGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsMergesJobIdLogGet(
        \App\DTO\VobjectsMergesJobIdLogGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsMergesJobIdLogGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Merge Records Job Log
     * @param \App\DTO\VobjectsMergesJobIdLogGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsMergesJobIdLogGetResult(
        \App\DTO\VobjectsMergesJobIdLogGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsMergesJobIdLogGet($parameters));
    }
    //endregion

    //region vobjectsMergesJobIdResultsGet
    /**
     * Retrieve Record Merge Results
     * @param \App\DTO\VobjectsMergesJobIdResultsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsMergesJobIdResultsGetRaw(
        \App\DTO\VobjectsMergesJobIdResultsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/merges/{job_id}/results', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Record Merge Results
     * @param \App\DTO\VobjectsMergesJobIdResultsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsMergesJobIdResultsGet(
        \App\DTO\VobjectsMergesJobIdResultsGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsMergesJobIdResultsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Record Merge Results
     * @param \App\DTO\VobjectsMergesJobIdResultsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsMergesJobIdResultsGetResult(
        \App\DTO\VobjectsMergesJobIdResultsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsMergesJobIdResultsGet($parameters));
    }
    //endregion

    //region vobjectsMergesJobIdStatusGet
    /**
     * Retrieve Record Merge Status
     * @param \App\DTO\VobjectsMergesJobIdStatusGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsMergesJobIdStatusGetRaw(
        \App\DTO\VobjectsMergesJobIdStatusGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/merges/{job_id}/status', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Record Merge Status
     * @param \App\DTO\VobjectsMergesJobIdStatusGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsMergesJobIdStatusGet(
        \App\DTO\VobjectsMergesJobIdStatusGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsMergesJobIdStatusGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Record Merge Status
     * @param \App\DTO\VobjectsMergesJobIdStatusGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsMergesJobIdStatusGetResult(
        \App\DTO\VobjectsMergesJobIdStatusGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsMergesJobIdStatusGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameActionsActionNamePost
    /**
     * Initiate Object Action on Multiple Records
     * @param \App\DTO\VobjectsObjectNameActionsActionNamePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameActionsActionNamePostRaw(
        \App\DTO\VobjectsObjectNameActionsActionNamePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/actions/{action_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Object Action on Multiple Records
     * @param \App\DTO\VobjectsObjectNameActionsActionNamePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameActionsActionNamePost(
        \App\DTO\VobjectsObjectNameActionsActionNamePOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameActionsActionNamePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Object Action on Multiple Records
     * @param \App\DTO\VobjectsObjectNameActionsActionNamePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameActionsActionNamePostResult(
        \App\DTO\VobjectsObjectNameActionsActionNamePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameActionsActionNamePost($parameters));
    }
    //endregion

    //region vobjectsObjectNameActionsChangetypePost
    /**
     * Change Object Type
     * @param \App\DTO\VobjectsObjectNameActionsChangetypePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameActionsChangetypePostRaw(
        \App\DTO\VobjectsObjectNameActionsChangetypePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/actions/changetype', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Change Object Type
     * @param \App\DTO\VobjectsObjectNameActionsChangetypePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameActionsChangetypePost(
        \App\DTO\VobjectsObjectNameActionsChangetypePOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameActionsChangetypePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Change Object Type
     * @param \App\DTO\VobjectsObjectNameActionsChangetypePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameActionsChangetypePostResult(
        \App\DTO\VobjectsObjectNameActionsChangetypePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameActionsChangetypePost($parameters));
    }
    //endregion

    //region vobjectsObjectNameActionsMergePost
    /**
     * Initiate Record Merge
     * @param \App\DTO\VobjectsObjectNameActionsMergePOSTParameterData $parameters
     * @param \App\DTO\Collection $requestContent
     * @param string $requestMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameActionsMergePostRaw(
        \App\DTO\VobjectsObjectNameActionsMergePOSTParameterData $parameters,
        \App\DTO\Collection $requestContent,
        string $requestMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/actions/merge', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Record Merge
     * @param \App\DTO\VobjectsObjectNameActionsMergePOSTParameterData $parameters
     * @param \App\DTO\Collection $requestContent
     * @param string $requestMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameActionsMergePost(
        \App\DTO\VobjectsObjectNameActionsMergePOSTParameterData $parameters,
        \App\DTO\Collection $requestContent,
        string $requestMediaType = 'application/json'
    ): array
    {
        $response = $this->vobjectsObjectNameActionsMergePostRaw($parameters, $requestContent, $requestMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Record Merge
     * @param \App\DTO\VobjectsObjectNameActionsMergePOSTParameterData $parameters
     * @param \App\DTO\Collection $requestContent
     * @param string $requestMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameActionsMergePostResult(
        \App\DTO\VobjectsObjectNameActionsMergePOSTParameterData $parameters,
        \App\DTO\Collection $requestContent,
        string $requestMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameActionsMergePost($parameters, $requestContent, $requestMediaType));
    }
    //endregion

    //region vobjectsObjectNameActionsRecalculaterollupsGet
    /**
     * Retrieve Roll-up Field Recalculation Status
     * @param \App\DTO\VobjectsObjectNameActionsRecalculaterollupsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameActionsRecalculaterollupsGetRaw(
        \App\DTO\VobjectsObjectNameActionsRecalculaterollupsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/actions/recalculaterollups', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Roll-up Field Recalculation Status
     * @param \App\DTO\VobjectsObjectNameActionsRecalculaterollupsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameActionsRecalculaterollupsGet(
        \App\DTO\VobjectsObjectNameActionsRecalculaterollupsGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameActionsRecalculaterollupsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Roll-up Field Recalculation Status
     * @param \App\DTO\VobjectsObjectNameActionsRecalculaterollupsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameActionsRecalculaterollupsGetResult(
        \App\DTO\VobjectsObjectNameActionsRecalculaterollupsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameActionsRecalculaterollupsGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameActionsRecalculaterollupsPost
    /**
     * Recalculate Roll-up Fields
     * @param \App\DTO\VobjectsObjectNameActionsRecalculaterollupsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameActionsRecalculaterollupsPostRaw(
        \App\DTO\VobjectsObjectNameActionsRecalculaterollupsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/actions/recalculaterollups', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Recalculate Roll-up Fields
     * @param \App\DTO\VobjectsObjectNameActionsRecalculaterollupsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameActionsRecalculaterollupsPost(
        \App\DTO\VobjectsObjectNameActionsRecalculaterollupsPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameActionsRecalculaterollupsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Recalculate Roll-up Fields
     * @param \App\DTO\VobjectsObjectNameActionsRecalculaterollupsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameActionsRecalculaterollupsPostResult(
        \App\DTO\VobjectsObjectNameActionsRecalculaterollupsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameActionsRecalculaterollupsPost($parameters));
    }
    //endregion

    //region vobjectsObjectNameActionsUpdatecorporatecurrencyPut
    /**
     * Update Corporate Currency Fields
     * @param \App\DTO\VobjectsObjectNameActionsUpdatecorporatecurrencyPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameActionsUpdatecorporatecurrencyPutRaw(
        \App\DTO\VobjectsObjectNameActionsUpdatecorporatecurrencyPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/vobjects/{object_name}/actions/updatecorporatecurrency', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Corporate Currency Fields
     * @param \App\DTO\VobjectsObjectNameActionsUpdatecorporatecurrencyPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameActionsUpdatecorporatecurrencyPut(
        \App\DTO\VobjectsObjectNameActionsUpdatecorporatecurrencyPUTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameActionsUpdatecorporatecurrencyPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Corporate Currency Fields
     * @param \App\DTO\VobjectsObjectNameActionsUpdatecorporatecurrencyPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameActionsUpdatecorporatecurrencyPutResult(
        \App\DTO\VobjectsObjectNameActionsUpdatecorporatecurrencyPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameActionsUpdatecorporatecurrencyPut($parameters));
    }
    //endregion

    //region vobjectsObjectNameAttachmentsBatchDelete
    /**
     * Delete Multiple Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameAttachmentsBatchDeleteRaw(
        \App\DTO\VobjectsObjectNameAttachmentsBatchDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/vobjects/{object_name}/attachments/batch', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Multiple Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameAttachmentsBatchDelete(
        \App\DTO\VobjectsObjectNameAttachmentsBatchDELETEParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameAttachmentsBatchDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Multiple Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameAttachmentsBatchDeleteResult(
        \App\DTO\VobjectsObjectNameAttachmentsBatchDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameAttachmentsBatchDelete($parameters));
    }
    //endregion

    //region vobjectsObjectNameAttachmentsBatchPost
    /**
     * Create Multiple Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameAttachmentsBatchPostRaw(
        \App\DTO\VobjectsObjectNameAttachmentsBatchPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/attachments/batch', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Multiple Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameAttachmentsBatchPost(
        \App\DTO\VobjectsObjectNameAttachmentsBatchPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameAttachmentsBatchPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Multiple Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameAttachmentsBatchPostResult(
        \App\DTO\VobjectsObjectNameAttachmentsBatchPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameAttachmentsBatchPost($parameters));
    }
    //endregion

    //region vobjectsObjectNameAttachmentsBatchPut
    /**
     * Update Multiple Object Record Attachment Descriptions
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameAttachmentsBatchPutRaw(
        \App\DTO\VobjectsObjectNameAttachmentsBatchPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/vobjects/{object_name}/attachments/batch', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Multiple Object Record Attachment Descriptions
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameAttachmentsBatchPut(
        \App\DTO\VobjectsObjectNameAttachmentsBatchPUTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameAttachmentsBatchPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Multiple Object Record Attachment Descriptions
     * @param \App\DTO\VobjectsObjectNameAttachmentsBatchPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameAttachmentsBatchPutResult(
        \App\DTO\VobjectsObjectNameAttachmentsBatchPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameAttachmentsBatchPut($parameters));
    }
    //endregion

    //region vobjectsObjectNameDelete
    /**
     * Delete Object Records
     * @param \App\DTO\VobjectsObjectNameDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameDeleteRaw(
        \App\DTO\VobjectsObjectNameDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/vobjects/{object_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Object Records
     * @param \App\DTO\VobjectsObjectNameDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameDelete(
        \App\DTO\VobjectsObjectNameDELETEParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Object Records
     * @param \App\DTO\VobjectsObjectNameDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameDeleteResult(
        \App\DTO\VobjectsObjectNameDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameDelete($parameters));
    }
    //endregion

    //region vobjectsObjectNameIdRolesRoleNameGet
    /**
     * Retrieve Object Record Roles
     * @param \App\DTO\VobjectsObjectNameIdRolesRoleNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameIdRolesRoleNameGetRaw(
        \App\DTO\VobjectsObjectNameIdRolesRoleNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{id}/roles/{role_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Record Roles
     * @param \App\DTO\VobjectsObjectNameIdRolesRoleNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameIdRolesRoleNameGet(
        \App\DTO\VobjectsObjectNameIdRolesRoleNameGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameIdRolesRoleNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Record Roles
     * @param \App\DTO\VobjectsObjectNameIdRolesRoleNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameIdRolesRoleNameGetResult(
        \App\DTO\VobjectsObjectNameIdRolesRoleNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameIdRolesRoleNameGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdActionsActionNameGet
    /**
     * Retrieve Object User Actions Details
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNameGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdActionsActionNameGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNameGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/actions/{action_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object User Actions Details
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNameGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdActionsActionNameGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNameGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdActionsActionNameGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object User Actions Details
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNameGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdActionsActionNameGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNameGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdActionsActionNameGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdActionsActionNamePost
    /**
     * Initiate Object Action on a Single Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNamePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdActionsActionNamePostRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNamePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/{object_record_id}/actions/{action_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Initiate Object Action on a Single Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNamePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdActionsActionNamePost(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNamePOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdActionsActionNamePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Initiate Object Action on a Single Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNamePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdActionsActionNamePostResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsActionNamePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdActionsActionNamePost($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdActionsCascadedeletePost
    /**
     * Cascade Delete Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsCascadedeletePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdActionsCascadedeletePostRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsCascadedeletePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/{object_record_id}/actions/cascadedelete', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cascade Delete Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsCascadedeletePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsCascadedeletePOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdActionsCascadedeletePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cascade Delete Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsCascadedeletePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdActionsCascadedeletePostResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsCascadedeletePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdActionsCascadedeletePost($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdActionsDeepcopyPost
    /**
     * Deep Copy Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsDeepcopyPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdActionsDeepcopyPostRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsDeepcopyPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/{object_record_id}/actions/deepcopy', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Deep Copy Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsDeepcopyPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsDeepcopyPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdActionsDeepcopyPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Deep Copy Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsDeepcopyPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdActionsDeepcopyPostResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsDeepcopyPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdActionsDeepcopyPost($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdActionsGet
    /**
     * Retrieve Object Record User Actions
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdActionsGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/actions', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Record User Actions
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdActionsGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdActionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Record User Actions
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdActionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdActionsGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdActionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdActionsGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet
    /**
     * Download Attachment Field File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Attachment Field File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Attachment Field File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost
    /**
     * Update Attachment Field File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Attachment Field File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Attachment Field File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet
    /**
     * Download All Attachment Field Files
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachment_fields/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download All Attachment Field Files
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download All Attachment Field Files
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
    /**
     * Delete Object Record Attachment
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Object Record Attachment
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDELETEParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Object Record Attachment
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet
    /**
     * Retrieve Object Record Attachment Metadata
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Record Attachment Metadata
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Record Attachment Metadata
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
    /**
     * Update Object Record Attachment Description
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Object Record Attachment Description
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPUTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Object Record Attachment Description
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
    /**
     * Delete Object Record Attachment Version
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Object Record Attachment Version
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Object Record Attachment Version
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
    /**
     * Download Object Record Attachment File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download Object Record Attachment File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download Object Record Attachment File
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
    /**
     * Retrieve Object Record Attachment Version Metadata
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Record Attachment Version Metadata
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Record Attachment Version Metadata
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
    /**
     * Restore Object Record Attachment Version
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Restore Object Record Attachment Version
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Restore Object Record Attachment Version
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet
    /**
     * Retrieve Object Record Attachment Versions
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Record Attachment Versions
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Record Attachment Versions
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsFileGet
    /**
     * Download All Object Record Attachment Files
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsFileGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsFileGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsFileGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachments/file', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download All Object Record Attachment Files
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsFileGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsFileGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsFileGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsFileGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download All Object Record Attachment Files
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsFileGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsFileGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsFileGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsFileGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsGet
    /**
     * Retrieve Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/attachments', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Record Attachments
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAttachmentsPost
    /**
     * Create Object Record Attachment
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsPostRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/{object_record_id}/attachments', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Object Record Attachment
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsPost(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAttachmentsPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Object Record Attachment
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAttachmentsPostResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAttachmentsPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAttachmentsPost($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdAudittrailGet
    /**
     * Retrieve Complete Audit History for a Single Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAudittrailGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdAudittrailGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdAudittrailGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}/audittrail', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Complete Audit History for a Single Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAudittrailGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdAudittrailGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdAudittrailGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdAudittrailGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Complete Audit History for a Single Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdAudittrailGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdAudittrailGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdAudittrailGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdAudittrailGet($parameters));
    }
    //endregion

    //region vobjectsObjectNameObjectRecordIdGet
    /**
     * Retrieve Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameObjectRecordIdGetRaw(
        \App\DTO\VobjectsObjectNameObjectRecordIdGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/{object_name}/{object_record_id}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameObjectRecordIdGet(
        \App\DTO\VobjectsObjectNameObjectRecordIdGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameObjectRecordIdGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Object Record
     * @param \App\DTO\VobjectsObjectNameObjectRecordIdGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameObjectRecordIdGetResult(
        \App\DTO\VobjectsObjectNameObjectRecordIdGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameObjectRecordIdGet($parameters));
    }
    //endregion

    //region vobjectsObjectNamePost
    /**
     * Create & Upsert Object Records
     * @param \App\DTO\VobjectsObjectNamePOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNamePostRaw(
        \App\DTO\VobjectsObjectNamePOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create & Upsert Object Records
     * @param \App\DTO\VobjectsObjectNamePOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNamePost(
        \App\DTO\VobjectsObjectNamePOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNamePostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create & Upsert Object Records
     * @param \App\DTO\VobjectsObjectNamePOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNamePostResult(
        \App\DTO\VobjectsObjectNamePOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNamePost($parameters));
    }
    //endregion

    //region vobjectsObjectNamePut
    /**
     * Update Object Records
     * @param \App\DTO\VobjectsObjectNamePUTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNamePutRaw(
        \App\DTO\VobjectsObjectNamePUTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('PUT', '/vobjects/{object_name}', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Object Records
     * @param \App\DTO\VobjectsObjectNamePUTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNamePut(
        \App\DTO\VobjectsObjectNamePUTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNamePutRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Object Records
     * @param \App\DTO\VobjectsObjectNamePUTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNamePutResult(
        \App\DTO\VobjectsObjectNamePUTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNamePut($parameters));
    }
    //endregion

    //region vobjectsObjectNameRolesDelete
    /**
     * Remove Users & Groups from Roles on Object Records
     * @param \App\DTO\VobjectsObjectNameRolesDELETEParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameRolesDeleteRaw(
        \App\DTO\VobjectsObjectNameRolesDELETEParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/vobjects/{object_name}/roles', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Remove Users & Groups from Roles on Object Records
     * @param \App\DTO\VobjectsObjectNameRolesDELETEParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameRolesDelete(
        \App\DTO\VobjectsObjectNameRolesDELETEParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameRolesDeleteRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Remove Users & Groups from Roles on Object Records
     * @param \App\DTO\VobjectsObjectNameRolesDELETEParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameRolesDeleteResult(
        \App\DTO\VobjectsObjectNameRolesDELETEParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameRolesDelete($parameters));
    }
    //endregion

    //region vobjectsObjectNameRolesPost
    /**
     * Assign Users & Groups to Roles on Object Records
     * @param \App\DTO\VobjectsObjectNameRolesPOSTParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsObjectNameRolesPostRaw(
        \App\DTO\VobjectsObjectNameRolesPOSTParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vobjects/{object_name}/roles', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Assign Users & Groups to Roles on Object Records
     * @param \App\DTO\VobjectsObjectNameRolesPOSTParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsObjectNameRolesPost(
        \App\DTO\VobjectsObjectNameRolesPOSTParameterData $parameters
    ): array
    {
        $response = $this->vobjectsObjectNameRolesPostRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Assign Users & Groups to Roles on Object Records
     * @param \App\DTO\VobjectsObjectNameRolesPOSTParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsObjectNameRolesPostResult(
        \App\DTO\VobjectsObjectNameRolesPOSTParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsObjectNameRolesPost($parameters));
    }
    //endregion

    //region vobjectsOutboundPackageVPackageIdDependenciesGet
    /**
     * Retrieve Outbound Package Dependencies
     * @param \App\DTO\VobjectsOutboundPackageVPackageIdDependenciesGETParameterData $parameters
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function vobjectsOutboundPackageVPackageIdDependenciesGetRaw(
        \App\DTO\VobjectsOutboundPackageVPackageIdDependenciesGETParameterData $parameters
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vobjects/outbound_package__v/{package_id}/dependencies', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve Outbound Package Dependencies
     * @param \App\DTO\VobjectsOutboundPackageVPackageIdDependenciesGETParameterData $parameters
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function vobjectsOutboundPackageVPackageIdDependenciesGet(
        \App\DTO\VobjectsOutboundPackageVPackageIdDependenciesGETParameterData $parameters
    ): array
    {
        $response = $this->vobjectsOutboundPackageVPackageIdDependenciesGetRaw($parameters);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve Outbound Package Dependencies
     * @param \App\DTO\VobjectsOutboundPackageVPackageIdDependenciesGETParameterData $parameters
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function vobjectsOutboundPackageVPackageIdDependenciesGetResult(
        \App\DTO\VobjectsOutboundPackageVPackageIdDependenciesGETParameterData $parameters
    )
    {
        return $this->getSuccessfulContent(...$this->vobjectsOutboundPackageVPackageIdDependenciesGet($parameters));
    }
    //endregion
}

