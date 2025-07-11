# OpenAPIClient-php

The latest GA version of the Vault REST API.


## Installation & Usage

### Requirements

PHP 8.1 and later.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');




$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = {{sessionId}}; // string
$accept = application/json; // string
$x_vault_api_client_id = {{clientId}}; // string | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.

try {
    $apiInstance->apiGet($authorization, $accept, $x_vault_api_client_id);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->apiGet: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *http://}/api/v25.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**apiGet**](docs/Api/DefaultApi.md#apiget) | **GET** /api/ | Retrieve API Versions
*DefaultApi* | [**apiMdlComponentsComponentTypeAndRecordNameFilesGet**](docs/Api/DefaultApi.md#apimdlcomponentscomponenttypeandrecordnamefilesget) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File
*DefaultApi* | [**apiMdlComponentsComponentTypeAndRecordNameGet**](docs/Api/DefaultApi.md#apimdlcomponentscomponenttypeandrecordnameget) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL)
*DefaultApi* | [**apiMdlExecuteAsyncJobIdResultsGet**](docs/Api/DefaultApi.md#apimdlexecuteasyncjobidresultsget) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results
*DefaultApi* | [**apiMdlExecuteAsyncPost**](docs/Api/DefaultApi.md#apimdlexecuteasyncpost) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously
*DefaultApi* | [**apiMdlExecutePost**](docs/Api/DefaultApi.md#apimdlexecutepost) | **POST** /api/mdl/execute | Execute MDL Script
*DefaultApi* | [**apiMdlFilesPost**](docs/Api/DefaultApi.md#apimdlfilespost) | **POST** /api/mdl/files | Upload Content File
*DefaultApi* | [**audittrailAuditTrailTypeGet**](docs/Api/DefaultApi.md#audittrailaudittrailtypeget) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details
*DefaultApi* | [**authDiscoveryPost**](docs/Api/DefaultApi.md#authdiscoverypost) | **POST** /auth/discovery | Authentication Type Discovery
*DefaultApi* | [**authOauthSessionOathOidcProfileIdPost**](docs/Api/DefaultApi.md#authoauthsessionoathoidcprofileidpost) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect
*DefaultApi* | [**authPost**](docs/Api/DefaultApi.md#authpost) | **POST** /auth | User Name and Password
*DefaultApi* | [**codeClassNameDelete**](docs/Api/DefaultApi.md#codeclassnamedelete) | **DELETE** /code/{class_name} | Delete Single Source Code File
*DefaultApi* | [**codeClassNameDisablePut**](docs/Api/DefaultApi.md#codeclassnamedisableput) | **PUT** /code/{class_name}/disable | Disable Vault Extension
*DefaultApi* | [**codeClassNameEnablePut**](docs/Api/DefaultApi.md#codeclassnameenableput) | **PUT** /code/{class_name}/enable | Enable Vault Extension
*DefaultApi* | [**codeClassNameGet**](docs/Api/DefaultApi.md#codeclassnameget) | **GET** /code/{class_name} | Retrieve Single Source Code File
*DefaultApi* | [**codeProfilerGet**](docs/Api/DefaultApi.md#codeprofilerget) | **GET** /code/profiler | Retrieve All Profiling Sessions
*DefaultApi* | [**codeProfilerPost**](docs/Api/DefaultApi.md#codeprofilerpost) | **POST** /code/profiler | Create Profiling Session
*DefaultApi* | [**codeProfilerSessionNameActionsEndPost**](docs/Api/DefaultApi.md#codeprofilersessionnameactionsendpost) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session
*DefaultApi* | [**codeProfilerSessionNameDelete**](docs/Api/DefaultApi.md#codeprofilersessionnamedelete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session
*DefaultApi* | [**codeProfilerSessionNameGet**](docs/Api/DefaultApi.md#codeprofilersessionnameget) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session
*DefaultApi* | [**codeProfilerSessionNameResultsGet**](docs/Api/DefaultApi.md#codeprofilersessionnameresultsget) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results
*DefaultApi* | [**codePut**](docs/Api/DefaultApi.md#codeput) | **PUT** /code | Add or Replace Single Source Code File
*DefaultApi* | [**compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**](docs/Api/DefaultApi.md#compositestreesedlhierarchyortemplateactionslistnodespost) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes
*DefaultApi* | [**compositesTreesEdlHierarchyOrTemplateGet**](docs/Api/DefaultApi.md#compositestreesedlhierarchyortemplateget) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes
*DefaultApi* | [**compositesTreesEdlHierarchyVParentNodeIdChildrenGet**](docs/Api/DefaultApi.md#compositestreesedlhierarchyvparentnodeidchildrenget) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node&#39;s Children
*DefaultApi* | [**compositesTreesEdlHierarchyVParentNodeIdChildrenPut**](docs/Api/DefaultApi.md#compositestreesedlhierarchyvparentnodeidchildrenput) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
*DefaultApi* | [**configurationComponentTypeAndRecordNameGet**](docs/Api/DefaultApi.md#configurationcomponenttypeandrecordnameget) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
*DefaultApi* | [**configurationComponentTypeGet**](docs/Api/DefaultApi.md#configurationcomponenttypeget) | **GET** /configuration/{component_type} | Retrieve Component Record Collection
*DefaultApi* | [**configurationObjectNameAndObjectTypeGet**](docs/Api/DefaultApi.md#configurationobjectnameandobjecttypeget) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
*DefaultApi* | [**configurationObjecttypeGet**](docs/Api/DefaultApi.md#configurationobjecttypeget) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types
*DefaultApi* | [**configurationRoleAssignmentRuleDelete**](docs/Api/DefaultApi.md#configurationroleassignmentruledelete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
*DefaultApi* | [**configurationRoleAssignmentRuleGet**](docs/Api/DefaultApi.md#configurationroleassignmentruleget) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
*DefaultApi* | [**configurationRoleAssignmentRulePost**](docs/Api/DefaultApi.md#configurationroleassignmentrulepost) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
*DefaultApi* | [**configurationRoleAssignmentRulePut**](docs/Api/DefaultApi.md#configurationroleassignmentruleput) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override)
*DefaultApi* | [**delegationLoginPost**](docs/Api/DefaultApi.md#delegationloginpost) | **POST** /delegation/login | Initiate Delegated Session
*DefaultApi* | [**delegationVaultsGet**](docs/Api/DefaultApi.md#delegationvaultsget) | **GET** /delegation/vaults | Retrieve Delegations
*DefaultApi* | [**keepAlivePost**](docs/Api/DefaultApi.md#keepalivepost) | **POST** /keep-alive | Session Keep Alive
*DefaultApi* | [**limitsGet**](docs/Api/DefaultApi.md#limitsget) | **GET** /limits | Retrieve Limits on Objects
*DefaultApi* | [**logsApiUsageGet**](docs/Api/DefaultApi.md#logsapiusageget) | **GET** /logs/api_usage | Download Daily API Usage
*DefaultApi* | [**logsCodeDebugGet**](docs/Api/DefaultApi.md#logscodedebugget) | **GET** /logs/code/debug | Retrieve All Debug Logs
*DefaultApi* | [**logsCodeDebugIdActionsResetDelete**](docs/Api/DefaultApi.md#logscodedebugidactionsresetdelete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log
*DefaultApi* | [**logsCodeDebugIdActionsResetPost**](docs/Api/DefaultApi.md#logscodedebugidactionsresetpost) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log
*DefaultApi* | [**logsCodeDebugIdFilesGet**](docs/Api/DefaultApi.md#logscodedebugidfilesget) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files
*DefaultApi* | [**logsCodeDebugIdGet**](docs/Api/DefaultApi.md#logscodedebugidget) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log
*DefaultApi* | [**logsCodeDebugPost**](docs/Api/DefaultApi.md#logscodedebugpost) | **POST** /logs/code/debug | Create Debug Log
*DefaultApi* | [**logsCodeRuntimeGet**](docs/Api/DefaultApi.md#logscoderuntimeget) | **GET** /logs/code/runtime | Download SDK Runtime Log
*DefaultApi* | [**messagesMessageTypeActionsImportPost**](docs/Api/DefaultApi.md#messagesmessagetypeactionsimportpost) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File
*DefaultApi* | [**messagesMessageTypeLanguageLangActionsExportPost**](docs/Api/DefaultApi.md#messagesmessagetypelanguagelangactionsexportpost) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File
*DefaultApi* | [**metadataAudittrailAuditTrailTypeGet**](docs/Api/DefaultApi.md#metadataaudittrailaudittrailtypeget) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata
*DefaultApi* | [**metadataAudittrailGet**](docs/Api/DefaultApi.md#metadataaudittrailget) | **GET** /metadata/audittrail | Retrieve Audit Types
*DefaultApi* | [**metadataComponentsComponentTypeGet**](docs/Api/DefaultApi.md#metadatacomponentscomponenttypeget) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata
*DefaultApi* | [**metadataComponentsGet**](docs/Api/DefaultApi.md#metadatacomponentsget) | **GET** /metadata/components | Retrieve All Component Metadata
*DefaultApi* | [**metadataObjectsBindersTemplatesBindernodesGet**](docs/Api/DefaultApi.md#metadataobjectsbinderstemplatesbindernodesget) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata
*DefaultApi* | [**metadataObjectsBindersTemplatesGet**](docs/Api/DefaultApi.md#metadataobjectsbinderstemplatesget) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata
*DefaultApi* | [**metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentsannotationsplacemarkstypesplacemarktypeget) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata
*DefaultApi* | [**metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentsannotationsreferencestypesreferencetypeget) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata
*DefaultApi* | [**metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentsannotationstypesannotationtypeget) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata
*DefaultApi* | [**metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentseventseventtypetypeseventsubtypeget) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata
*DefaultApi* | [**metadataObjectsDocumentsEventsGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentseventsget) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes
*DefaultApi* | [**metadataObjectsDocumentsLockGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentslockget) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata
*DefaultApi* | [**metadataObjectsDocumentsPropertiesFindCommonPost**](docs/Api/DefaultApi.md#metadataobjectsdocumentspropertiesfindcommonpost) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields
*DefaultApi* | [**metadataObjectsDocumentsPropertiesGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentspropertiesget) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields
*DefaultApi* | [**metadataObjectsDocumentsTemplatesGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentstemplatesget) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata
*DefaultApi* | [**metadataObjectsDocumentsTypesGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentstypesget) | **GET** /metadata/objects/documents/types | Retrieve All Document Types
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentstypestypeget) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeRelationshipsGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentstypestyperelationshipsget) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentstypestypesubtypessubtypeclassificationsclassificationget) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**](docs/Api/DefaultApi.md#metadataobjectsdocumentstypestypesubtypessubtypeget) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype
*DefaultApi* | [**metadataObjectsGroupsGet**](docs/Api/DefaultApi.md#metadataobjectsgroupsget) | **GET** /metadata/objects/groups | Retrieve Group Metadata
*DefaultApi* | [**metadataObjectsSecuritypoliciesGet**](docs/Api/DefaultApi.md#metadataobjectssecuritypoliciesget) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata
*DefaultApi* | [**metadataObjectsUsersGet**](docs/Api/DefaultApi.md#metadataobjectsusersget) | **GET** /metadata/objects/users | Retrieve User Metadata
*DefaultApi* | [**metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**](docs/Api/DefaultApi.md#metadataqueryarchiveddocumentsrelationshipsdocumentsignaturesysrget) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata
*DefaultApi* | [**metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**](docs/Api/DefaultApi.md#metadataquerydocumentsrelationshipsdocumentsignaturesysrget) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata
*DefaultApi* | [**metadataVobjectsGet**](docs/Api/DefaultApi.md#metadatavobjectsget) | **GET** /metadata/vobjects | Retrieve Object Collection
*DefaultApi* | [**metadataVobjectsObjectNameActionsCanceldeploymentPost**](docs/Api/DefaultApi.md#metadatavobjectsobjectnameactionscanceldeploymentpost) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment
*DefaultApi* | [**metadataVobjectsObjectNameFieldsObjectFieldNameGet**](docs/Api/DefaultApi.md#metadatavobjectsobjectnamefieldsobjectfieldnameget) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata
*DefaultApi* | [**metadataVobjectsObjectNameGet**](docs/Api/DefaultApi.md#metadatavobjectsobjectnameget) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata
*DefaultApi* | [**metadataVobjectsObjectNamePageLayoutsGet**](docs/Api/DefaultApi.md#metadatavobjectsobjectnamepagelayoutsget) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts
*DefaultApi* | [**metadataVobjectsObjectNamePageLayoutsLayoutNameGet**](docs/Api/DefaultApi.md#metadatavobjectsobjectnamepagelayoutslayoutnameget) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata
*DefaultApi* | [**notificationsHistoriesGet**](docs/Api/DefaultApi.md#notificationshistoriesget) | **GET** /notifications/histories | Retrieve Email Notification Histories
*DefaultApi* | [**objectWorkflowActionsActionGet**](docs/Api/DefaultApi.md#objectworkflowactionsactionget) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details
*DefaultApi* | [**objectWorkflowActionsActionPost**](docs/Api/DefaultApi.md#objectworkflowactionsactionpost) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows
*DefaultApi* | [**objectWorkflowActionsCanceltasksPost**](docs/Api/DefaultApi.md#objectworkflowactionscanceltaskspost) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks
*DefaultApi* | [**objectWorkflowActionsCancelworkflowsPost**](docs/Api/DefaultApi.md#objectworkflowactionscancelworkflowspost) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows
*DefaultApi* | [**objectWorkflowActionsGet**](docs/Api/DefaultApi.md#objectworkflowactionsget) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions
*DefaultApi* | [**objectWorkflowActionsReassigntasksPost**](docs/Api/DefaultApi.md#objectworkflowactionsreassigntaskspost) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks
*DefaultApi* | [**objectWorkflowActionsReplaceworkflowownerPost**](docs/Api/DefaultApi.md#objectworkflowactionsreplaceworkflowownerpost) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner
*DefaultApi* | [**objectsBindersActionsExportJobIdResultsGet**](docs/Api/DefaultApi.md#objectsbindersactionsexportjobidresultsget) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results
*DefaultApi* | [**objectsBindersBinderIdActionsExportPost**](docs/Api/DefaultApi.md#objectsbindersbinderidactionsexportpost) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version)
*DefaultApi* | [**objectsBindersBinderIdActionsPost**](docs/Api/DefaultApi.md#objectsbindersbinderidactionspost) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing
*DefaultApi* | [**objectsBindersBinderIdBindingRulePut**](docs/Api/DefaultApi.md#objectsbindersbinderidbindingruleput) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule
*DefaultApi* | [**objectsBindersBinderIdDelete**](docs/Api/DefaultApi.md#objectsbindersbinderiddelete) | **DELETE** /objects/binders/{binder_id} | Delete Binder
*DefaultApi* | [**objectsBindersBinderIdDocumentsNodeIdBindingRulePut**](docs/Api/DefaultApi.md#objectsbindersbinderiddocumentsnodeidbindingruleput) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule
*DefaultApi* | [**objectsBindersBinderIdDocumentsPost**](docs/Api/DefaultApi.md#objectsbindersbinderiddocumentspost) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder
*DefaultApi* | [**objectsBindersBinderIdDocumentsSectionIdDelete**](docs/Api/DefaultApi.md#objectsbindersbinderiddocumentssectioniddelete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder
*DefaultApi* | [**objectsBindersBinderIdDocumentsSectionIdPut**](docs/Api/DefaultApi.md#objectsbindersbinderiddocumentssectionidput) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder
*DefaultApi* | [**objectsBindersBinderIdGet**](docs/Api/DefaultApi.md#objectsbindersbinderidget) | **GET** /objects/binders/{binder_id} | Retrieve Binder
*DefaultApi* | [**objectsBindersBinderIdPost**](docs/Api/DefaultApi.md#objectsbindersbinderidpost) | **POST** /objects/binders/{binder_id} | Create Binder Version
*DefaultApi* | [**objectsBindersBinderIdPut**](docs/Api/DefaultApi.md#objectsbindersbinderidput) | **PUT** /objects/binders/{binder_id} | Update Binder
*DefaultApi* | [**objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**](docs/Api/DefaultApi.md#objectsbindersbinderidrolesrolenameanduserorgroupiddelete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder
*DefaultApi* | [**objectsBindersBinderIdSectionsNodeIdBindingRulePut**](docs/Api/DefaultApi.md#objectsbindersbinderidsectionsnodeidbindingruleput) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule
*DefaultApi* | [**objectsBindersBinderIdSectionsNodeIdPut**](docs/Api/DefaultApi.md#objectsbindersbinderidsectionsnodeidput) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section
*DefaultApi* | [**objectsBindersBinderIdSectionsPost**](docs/Api/DefaultApi.md#objectsbindersbinderidsectionspost) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section
*DefaultApi* | [**objectsBindersBinderIdSectionsSectionIdDelete**](docs/Api/DefaultApi.md#objectsbindersbinderidsectionssectioniddelete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section
*DefaultApi* | [**objectsBindersBinderIdSectionsSectionIdGet**](docs/Api/DefaultApi.md#objectsbindersbinderidsectionssectionidget) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections
*DefaultApi* | [**objectsBindersBinderIdVersionsGet**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsget) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionactionsexportpost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version)
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversiondelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionput) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionrelationshipspost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipiddelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipidget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**](docs/Api/DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionsectionssectionidget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section
*DefaultApi* | [**objectsBindersIdRolesGet**](docs/Api/DefaultApi.md#objectsbindersidrolesget) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles
*DefaultApi* | [**objectsBindersIdRolesPost**](docs/Api/DefaultApi.md#objectsbindersidrolespost) | **POST** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder
*DefaultApi* | [**objectsBindersIdRolesRoleNameGet**](docs/Api/DefaultApi.md#objectsbindersidrolesrolenameget) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role
*DefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](docs/Api/DefaultApi.md#objectsbindersidversionsmajorversionminorversionlifecycleactionsget) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions
*DefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](docs/Api/DefaultApi.md#objectsbindersidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria
*DefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](docs/Api/DefaultApi.md#objectsbindersidversionsmajorversionminorversionlifecycleactionsnamevput) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action
*DefaultApi* | [**objectsBindersLifecycleActionsPost**](docs/Api/DefaultApi.md#objectsbinderslifecycleactionspost) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders
*DefaultApi* | [**objectsBindersLifecycleActionsUserActionNamePut**](docs/Api/DefaultApi.md#objectsbinderslifecycleactionsuseractionnameput) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions
*DefaultApi* | [**objectsBindersPost**](docs/Api/DefaultApi.md#objectsbinderspost) | **POST** /objects/binders | Create Binder
*DefaultApi* | [**objectsBindersTemplatesGet**](docs/Api/DefaultApi.md#objectsbinderstemplatesget) | **GET** /objects/binders/templates | Retrieve Binder Template Collection
*DefaultApi* | [**objectsBindersTemplatesPost**](docs/Api/DefaultApi.md#objectsbinderstemplatespost) | **POST** /objects/binders/templates | Create Binder Template
*DefaultApi* | [**objectsBindersTemplatesPut**](docs/Api/DefaultApi.md#objectsbinderstemplatesput) | **PUT** /objects/binders/templates | Update Binder Template
*DefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesGet**](docs/Api/DefaultApi.md#objectsbinderstemplatestemplatenamebindernodesget) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes
*DefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesPost**](docs/Api/DefaultApi.md#objectsbinderstemplatestemplatenamebindernodespost) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node
*DefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesPut**](docs/Api/DefaultApi.md#objectsbinderstemplatestemplatenamebindernodesput) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes
*DefaultApi* | [**objectsBindersTemplatesTemplateNameDelete**](docs/Api/DefaultApi.md#objectsbinderstemplatestemplatenamedelete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template
*DefaultApi* | [**objectsBindersTemplatesTemplateNameGet**](docs/Api/DefaultApi.md#objectsbinderstemplatestemplatenameget) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes
*DefaultApi* | [**objectsDeletionsDocumentsGet**](docs/Api/DefaultApi.md#objectsdeletionsdocumentsget) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs
*DefaultApi* | [**objectsDeletionsVobjectsObjectNameGet**](docs/Api/DefaultApi.md#objectsdeletionsvobjectsobjectnameget) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID
*DefaultApi* | [**objectsDocumentsActionsGet**](docs/Api/DefaultApi.md#objectsdocumentsactionsget) | **GET** /objects/documents/actions | Retrieve All Document Workflows
*DefaultApi* | [**objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**](docs/Api/DefaultApi.md#objectsdocumentsactionslifecycleandstateandactionjobidresultsget) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results
*DefaultApi* | [**objectsDocumentsActionsWorkflowNameGet**](docs/Api/DefaultApi.md#objectsdocumentsactionsworkflownameget) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details
*DefaultApi* | [**objectsDocumentsActionsWorkflowNamePost**](docs/Api/DefaultApi.md#objectsdocumentsactionsworkflownamepost) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow
*DefaultApi* | [**objectsDocumentsAnnotationsBatchDelete**](docs/Api/DefaultApi.md#objectsdocumentsannotationsbatchdelete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations
*DefaultApi* | [**objectsDocumentsAnnotationsBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsannotationsbatchpost) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations
*DefaultApi* | [**objectsDocumentsAnnotationsBatchPut**](docs/Api/DefaultApi.md#objectsdocumentsannotationsbatchput) | **PUT** /objects/documents/annotations/batch | Update Annotations
*DefaultApi* | [**objectsDocumentsAnnotationsRepliesBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsannotationsrepliesbatchpost) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies
*DefaultApi* | [**objectsDocumentsAttachmentsBatchDelete**](docs/Api/DefaultApi.md#objectsdocumentsattachmentsbatchdelete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments
*DefaultApi* | [**objectsDocumentsAttachmentsBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsattachmentsbatchpost) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments
*DefaultApi* | [**objectsDocumentsAttachmentsBatchPut**](docs/Api/DefaultApi.md#objectsdocumentsattachmentsbatchput) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions
*DefaultApi* | [**objectsDocumentsBatchActionsFileextractJobIdResultsGet**](docs/Api/DefaultApi.md#objectsdocumentsbatchactionsfileextractjobidresultsget) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results
*DefaultApi* | [**objectsDocumentsBatchActionsFileextractPost**](docs/Api/DefaultApi.md#objectsdocumentsbatchactionsfileextractpost) | **POST** /objects/documents/batch/actions/fileextract | Export Documents
*DefaultApi* | [**objectsDocumentsBatchActionsReclassifyPut**](docs/Api/DefaultApi.md#objectsdocumentsbatchactionsreclassifyput) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents
*DefaultApi* | [**objectsDocumentsBatchActionsRerenderPost**](docs/Api/DefaultApi.md#objectsdocumentsbatchactionsrerenderpost) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions
*DefaultApi* | [**objectsDocumentsBatchDelete**](docs/Api/DefaultApi.md#objectsdocumentsbatchdelete) | **DELETE** /objects/documents/batch | Delete Multiple Documents
*DefaultApi* | [**objectsDocumentsBatchLockDelete**](docs/Api/DefaultApi.md#objectsdocumentsbatchlockdelete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout
*DefaultApi* | [**objectsDocumentsBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsbatchpost) | **POST** /objects/documents/batch | Create Multiple Documents
*DefaultApi* | [**objectsDocumentsBatchPut**](docs/Api/DefaultApi.md#objectsdocumentsbatchput) | **PUT** /objects/documents/batch | Update Multiple Documents
*DefaultApi* | [**objectsDocumentsDocIdAnchorsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidanchorsget) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs
*DefaultApi* | [**objectsDocumentsDocIdAnnotationsFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidannotationsfileget) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF
*DefaultApi* | [**objectsDocumentsDocIdAnnotationsFilePost**](docs/Api/DefaultApi.md#objectsdocumentsdocidannotationsfilepost) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentiddelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidfileget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdPut**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidput) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversiondelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionfileget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionpost) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsfileget) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentsget) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsPost**](docs/Api/DefaultApi.md#objectsdocumentsdocidattachmentspost) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment
*DefaultApi* | [**objectsDocumentsDocIdAudittrailGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidaudittrailget) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document
*DefaultApi* | [**objectsDocumentsDocIdDelete**](docs/Api/DefaultApi.md#objectsdocumentsdociddelete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document
*DefaultApi* | [**objectsDocumentsDocIdEventsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocideventsget) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events
*DefaultApi* | [**objectsDocumentsDocIdFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidfileget) | **GET** /objects/documents/{doc_id}/file | Download Document File
*DefaultApi* | [**objectsDocumentsDocIdGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidget) | **GET** /objects/documents/{doc_id} | Retrieve Document
*DefaultApi* | [**objectsDocumentsDocIdLockDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidlockdelete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock
*DefaultApi* | [**objectsDocumentsDocIdLockGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidlockget) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock
*DefaultApi* | [**objectsDocumentsDocIdLockPost**](docs/Api/DefaultApi.md#objectsdocumentsdocidlockpost) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock
*DefaultApi* | [**objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidmajorversionminorversionattachmentsfileget) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments
*DefaultApi* | [**objectsDocumentsDocIdPost**](docs/Api/DefaultApi.md#objectsdocumentsdocidpost) | **POST** /objects/documents/{doc_id} | Create Single Document Version
*DefaultApi* | [**objectsDocumentsDocIdPut**](docs/Api/DefaultApi.md#objectsdocumentsdocidput) | **PUT** /objects/documents/{doc_id} | Update Single Document
*DefaultApi* | [**objectsDocumentsDocIdRenditionsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidrenditionsget) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypeDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypedelete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypeGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypeget) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypePost**](docs/Api/DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypepost) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypePut**](docs/Api/DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypeput) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition
*DefaultApi* | [**objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidrolesrolenameanduserorgroupiddelete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document
*DefaultApi* | [**objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionmajorversionminorversionattachmentsget) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments
*DefaultApi* | [**objectsDocumentsDocIdVersionsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsget) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidrepliesget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsfilepost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversiondelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversiondocexportannotationstocsvget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversioneventspost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionexportvideoannotationsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionput) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipspost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipiddelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipidget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypedelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypepost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeput) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**](docs/Api/DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionthumbnailget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File
*DefaultApi* | [**objectsDocumentsGet**](docs/Api/DefaultApi.md#objectsdocumentsget) | **GET** /objects/documents | Retrieve All Documents
*DefaultApi* | [**objectsDocumentsIdRolesGet**](docs/Api/DefaultApi.md#objectsdocumentsidrolesget) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles
*DefaultApi* | [**objectsDocumentsIdRolesPost**](docs/Api/DefaultApi.md#objectsdocumentsidrolespost) | **POST** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document
*DefaultApi* | [**objectsDocumentsIdRolesRoleNameGet**](docs/Api/DefaultApi.md#objectsdocumentsidrolesrolenameget) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role
*DefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](docs/Api/DefaultApi.md#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsget) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions
*DefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](docs/Api/DefaultApi.md#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria
*DefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](docs/Api/DefaultApi.md#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnamevput) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action
*DefaultApi* | [**objectsDocumentsLifecycleActionsPost**](docs/Api/DefaultApi.md#objectsdocumentslifecycleactionspost) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents
*DefaultApi* | [**objectsDocumentsLifecycleActionsUserActionNamePut**](docs/Api/DefaultApi.md#objectsdocumentslifecycleactionsuseractionnameput) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions
*DefaultApi* | [**objectsDocumentsPost**](docs/Api/DefaultApi.md#objectsdocumentspost) | **POST** /objects/documents | Create Single Document
*DefaultApi* | [**objectsDocumentsRelationshipsBatchDelete**](docs/Api/DefaultApi.md#objectsdocumentsrelationshipsbatchdelete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships
*DefaultApi* | [**objectsDocumentsRelationshipsBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsrelationshipsbatchpost) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships
*DefaultApi* | [**objectsDocumentsRenditionsBatchDelete**](docs/Api/DefaultApi.md#objectsdocumentsrenditionsbatchdelete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions
*DefaultApi* | [**objectsDocumentsRenditionsBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsrenditionsbatchpost) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions
*DefaultApi* | [**objectsDocumentsRolesBatchDelete**](docs/Api/DefaultApi.md#objectsdocumentsrolesbatchdelete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders
*DefaultApi* | [**objectsDocumentsRolesBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsrolesbatchpost) | **POST** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
*DefaultApi* | [**objectsDocumentsTemplatesGet**](docs/Api/DefaultApi.md#objectsdocumentstemplatesget) | **GET** /objects/documents/templates | Retrieve Document Template Collection
*DefaultApi* | [**objectsDocumentsTemplatesPost**](docs/Api/DefaultApi.md#objectsdocumentstemplatespost) | **POST** /objects/documents/templates | Create Single Document Template
*DefaultApi* | [**objectsDocumentsTemplatesPut**](docs/Api/DefaultApi.md#objectsdocumentstemplatesput) | **PUT** /objects/documents/templates | Update Multiple Document Templates
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNameDelete**](docs/Api/DefaultApi.md#objectsdocumentstemplatestemplatenamedelete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNameFileGet**](docs/Api/DefaultApi.md#objectsdocumentstemplatestemplatenamefileget) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNameGet**](docs/Api/DefaultApi.md#objectsdocumentstemplatestemplatenameget) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNamePut**](docs/Api/DefaultApi.md#objectsdocumentstemplatestemplatenameput) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template
*DefaultApi* | [**objectsDocumentsTokensPost**](docs/Api/DefaultApi.md#objectsdocumentstokenspost) | **POST** /objects/documents/tokens | Document Tokens
*DefaultApi* | [**objectsDocumentsVersionsBatchActionsFileextractPost**](docs/Api/DefaultApi.md#objectsdocumentsversionsbatchactionsfileextractpost) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions
*DefaultApi* | [**objectsDocumentsVersionsBatchDelete**](docs/Api/DefaultApi.md#objectsdocumentsversionsbatchdelete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions
*DefaultApi* | [**objectsDocumentsVersionsBatchPost**](docs/Api/DefaultApi.md#objectsdocumentsversionsbatchpost) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions
*DefaultApi* | [**objectsDomainGet**](docs/Api/DefaultApi.md#objectsdomainget) | **GET** /objects/domain | Retrieve Domain Information
*DefaultApi* | [**objectsDomainsGet**](docs/Api/DefaultApi.md#objectsdomainsget) | **GET** /objects/domains | Retrieve Domains
*DefaultApi* | [**objectsEdlMatchedDocumentsBatchActionsAddPost**](docs/Api/DefaultApi.md#objectsedlmatcheddocumentsbatchactionsaddpost) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents
*DefaultApi* | [**objectsEdlMatchedDocumentsBatchActionsRemovePost**](docs/Api/DefaultApi.md#objectsedlmatcheddocumentsbatchactionsremovepost) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents
*DefaultApi* | [**objectsGroupsAutoGet**](docs/Api/DefaultApi.md#objectsgroupsautoget) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups
*DefaultApi* | [**objectsGroupsGet**](docs/Api/DefaultApi.md#objectsgroupsget) | **GET** /objects/groups | Retrieve All Groups
*DefaultApi* | [**objectsGroupsGroupIdDelete**](docs/Api/DefaultApi.md#objectsgroupsgroupiddelete) | **DELETE** /objects/groups/{group_id} | Delete Group
*DefaultApi* | [**objectsGroupsGroupIdGet**](docs/Api/DefaultApi.md#objectsgroupsgroupidget) | **GET** /objects/groups/{group_id} | Retrieve Group
*DefaultApi* | [**objectsGroupsGroupIdPut**](docs/Api/DefaultApi.md#objectsgroupsgroupidput) | **PUT** /objects/groups/{group_id} | Update Group
*DefaultApi* | [**objectsGroupsPost**](docs/Api/DefaultApi.md#objectsgroupspost) | **POST** /objects/groups | Create Group
*DefaultApi* | [**objectsLicensesGet**](docs/Api/DefaultApi.md#objectslicensesget) | **GET** /objects/licenses | Retrieve Application License Usage
*DefaultApi* | [**objectsObjectworkflowsActionsGet**](docs/Api/DefaultApi.md#objectsobjectworkflowsactionsget) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows
*DefaultApi* | [**objectsObjectworkflowsActionsWorkflowNameGet**](docs/Api/DefaultApi.md#objectsobjectworkflowsactionsworkflownameget) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details
*DefaultApi* | [**objectsObjectworkflowsActionsWorkflowNamePost**](docs/Api/DefaultApi.md#objectsobjectworkflowsactionsworkflownamepost) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow
*DefaultApi* | [**objectsObjectworkflowsGet**](docs/Api/DefaultApi.md#objectsobjectworkflowsget) | **GET** /objects/objectworkflows | Retrieve Workflows
*DefaultApi* | [**objectsObjectworkflowsTasksGet**](docs/Api/DefaultApi.md#objectsobjectworkflowstasksget) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsAcceptPost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsCancelPost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionscancelpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsCompletePost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionscompletepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsGet**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsget) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwcompletepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwmanagecontentpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwreassignpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsReassignPost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsreassignpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionstaskactionget) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsundoacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidactionsupdateduedatepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdGet**](docs/Api/DefaultApi.md#objectsobjectworkflowstaskstaskidget) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsGet**](docs/Api/DefaultApi.md#objectsobjectworkflowsworkflowidactionsget) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**](docs/Api/DefaultApi.md#objectsobjectworkflowsworkflowidactionsworkflowactionget) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**](docs/Api/DefaultApi.md#objectsobjectworkflowsworkflowidactionsworkflowactionpost) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdGet**](docs/Api/DefaultApi.md#objectsobjectworkflowsworkflowidget) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details
*DefaultApi* | [**objectsPicklistsGet**](docs/Api/DefaultApi.md#objectspicklistsget) | **GET** /objects/picklists | Retrieve All Picklists
*DefaultApi* | [**objectsPicklistsPicklistNameGet**](docs/Api/DefaultApi.md#objectspicklistspicklistnameget) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values
*DefaultApi* | [**objectsPicklistsPicklistNamePicklistValueNameDelete**](docs/Api/DefaultApi.md#objectspicklistspicklistnamepicklistvaluenamedelete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value
*DefaultApi* | [**objectsPicklistsPicklistNamePicklistValueNamePut**](docs/Api/DefaultApi.md#objectspicklistspicklistnamepicklistvaluenameput) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value
*DefaultApi* | [**objectsPicklistsPicklistNamePost**](docs/Api/DefaultApi.md#objectspicklistspicklistnamepost) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values
*DefaultApi* | [**objectsPicklistsPicklistNamePut**](docs/Api/DefaultApi.md#objectspicklistspicklistnameput) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label
*DefaultApi* | [**objectsSandboxActionsBuildproductionPost**](docs/Api/DefaultApi.md#objectssandboxactionsbuildproductionpost) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault
*DefaultApi* | [**objectsSandboxActionsPromoteproductionPost**](docs/Api/DefaultApi.md#objectssandboxactionspromoteproductionpost) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production
*DefaultApi* | [**objectsSandboxActionsRecheckusagePost**](docs/Api/DefaultApi.md#objectssandboxactionsrecheckusagepost) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit
*DefaultApi* | [**objectsSandboxBatchChangesizePost**](docs/Api/DefaultApi.md#objectssandboxbatchchangesizepost) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size
*DefaultApi* | [**objectsSandboxEntitlementsSetPost**](docs/Api/DefaultApi.md#objectssandboxentitlementssetpost) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements
*DefaultApi* | [**objectsSandboxGet**](docs/Api/DefaultApi.md#objectssandboxget) | **GET** /objects/sandbox | Retrieve Sandboxes
*DefaultApi* | [**objectsSandboxNameDelete**](docs/Api/DefaultApi.md#objectssandboxnamedelete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox
*DefaultApi* | [**objectsSandboxPost**](docs/Api/DefaultApi.md#objectssandboxpost) | **POST** /objects/sandbox | Create or Refresh Sandbox
*DefaultApi* | [**objectsSandboxSnapshotApiNameActionsUpdatePost**](docs/Api/DefaultApi.md#objectssandboxsnapshotapinameactionsupdatepost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot
*DefaultApi* | [**objectsSandboxSnapshotApiNameActionsUpgradePost**](docs/Api/DefaultApi.md#objectssandboxsnapshotapinameactionsupgradepost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot
*DefaultApi* | [**objectsSandboxSnapshotApiNameDelete**](docs/Api/DefaultApi.md#objectssandboxsnapshotapinamedelete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot
*DefaultApi* | [**objectsSandboxSnapshotGet**](docs/Api/DefaultApi.md#objectssandboxsnapshotget) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots
*DefaultApi* | [**objectsSandboxSnapshotPost**](docs/Api/DefaultApi.md#objectssandboxsnapshotpost) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot
*DefaultApi* | [**objectsSandboxVaultIdActionsRefreshPost**](docs/Api/DefaultApi.md#objectssandboxvaultidactionsrefreshpost) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot
*DefaultApi* | [**objectsSandboxVaultIdGet**](docs/Api/DefaultApi.md#objectssandboxvaultidget) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID
*DefaultApi* | [**objectsSecuritypoliciesGet**](docs/Api/DefaultApi.md#objectssecuritypoliciesget) | **GET** /objects/securitypolicies | Retrieve All Security Policies
*DefaultApi* | [**objectsSecuritypoliciesSecurityPolicyNameGet**](docs/Api/DefaultApi.md#objectssecuritypoliciessecuritypolicynameget) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy
*DefaultApi* | [**objectsUsersGet**](docs/Api/DefaultApi.md#objectsusersget) | **GET** /objects/users/ | Retrieve All Users
*DefaultApi* | [**objectsUsersIdGet**](docs/Api/DefaultApi.md#objectsusersidget) | **GET** /objects/users/{id} | Retrieve User
*DefaultApi* | [**objectsUsersIdPermissionsGet**](docs/Api/DefaultApi.md#objectsusersidpermissionsget) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions
*DefaultApi* | [**objectsUsersIdPut**](docs/Api/DefaultApi.md#objectsusersidput) | **PUT** /objects/users/{id} | Update Single User
*DefaultApi* | [**objectsUsersMeGet**](docs/Api/DefaultApi.md#objectsusersmeget) | **GET** /objects/users/me | Validate Session User
*DefaultApi* | [**objectsUsersMePasswordPost**](docs/Api/DefaultApi.md#objectsusersmepasswordpost) | **POST** /objects/users/me/password | Change My Password
*DefaultApi* | [**objectsUsersMePermissionsGet**](docs/Api/DefaultApi.md#objectsusersmepermissionsget) | **GET** /objects/users/me/permissions | Retrieve My User Permissions
*DefaultApi* | [**objectsUsersMePut**](docs/Api/DefaultApi.md#objectsusersmeput) | **PUT** /objects/users/me | Update My User
*DefaultApi* | [**objectsUsersPost**](docs/Api/DefaultApi.md#objectsuserspost) | **POST** /objects/users | Create Single User
*DefaultApi* | [**objectsUsersPut**](docs/Api/DefaultApi.md#objectsusersput) | **PUT** /objects/users | Update Multiple Users
*DefaultApi* | [**objectsUsersUserIdDelete**](docs/Api/DefaultApi.md#objectsusersuseriddelete) | **DELETE** /objects/users/{user_id} | Disable User
*DefaultApi* | [**objectsUsersUserIdVaultMembershipVaultIdPut**](docs/Api/DefaultApi.md#objectsusersuseridvaultmembershipvaultidput) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership
*DefaultApi* | [**objectsVaultActionsComparePost**](docs/Api/DefaultApi.md#objectsvaultactionscomparepost) | **POST** /objects/vault/actions/compare | Vault Compare
*DefaultApi* | [**objectsVaultActionsConfigreportPost**](docs/Api/DefaultApi.md#objectsvaultactionsconfigreportpost) | **POST** /objects/vault/actions/configreport | Vault Configuration Report
*DefaultApi* | [**queryComponentsPost**](docs/Api/DefaultApi.md#querycomponentspost) | **POST** /query/components | Component Definition Query
*DefaultApi* | [**queryNextPagePost**](docs/Api/DefaultApi.md#querynextpagepost) | **POST** /query/{next_page} | Next Page URL
*DefaultApi* | [**queryPost**](docs/Api/DefaultApi.md#querypost) | **POST** /query | Submitting a Query
*DefaultApi* | [**queryPreviousPagePost**](docs/Api/DefaultApi.md#querypreviouspagepost) | **POST** /query/{previous_page} | Previous Page URL
*DefaultApi* | [**scimV2MeGet**](docs/Api/DefaultApi.md#scimv2meget) | **GET** /scim/v2/Me | Retrieve Current User with SCIM
*DefaultApi* | [**scimV2MePut**](docs/Api/DefaultApi.md#scimv2meput) | **PUT** /scim/v2/Me | Update Current User with SCIM
*DefaultApi* | [**scimV2ResourceTypesGet**](docs/Api/DefaultApi.md#scimv2resourcetypesget) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types
*DefaultApi* | [**scimV2ResourceTypesTypeGet**](docs/Api/DefaultApi.md#scimv2resourcetypestypeget) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type
*DefaultApi* | [**scimV2SchemasGet**](docs/Api/DefaultApi.md#scimv2schemasget) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information
*DefaultApi* | [**scimV2SchemasIdGet**](docs/Api/DefaultApi.md#scimv2schemasidget) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information
*DefaultApi* | [**scimV2ServiceProviderConfigGet**](docs/Api/DefaultApi.md#scimv2serviceproviderconfigget) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider
*DefaultApi* | [**scimV2TypeGet**](docs/Api/DefaultApi.md#scimv2typeget) | **GET** /scim/v2/{type} | Retrieve SCIM Resources
*DefaultApi* | [**scimV2TypeIdGet**](docs/Api/DefaultApi.md#scimv2typeidget) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource
*DefaultApi* | [**scimV2UsersGet**](docs/Api/DefaultApi.md#scimv2usersget) | **GET** /scim/v2/Users | Retrieve All Users with SCIM
*DefaultApi* | [**scimV2UsersIdGet**](docs/Api/DefaultApi.md#scimv2usersidget) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM
*DefaultApi* | [**scimV2UsersIdPut**](docs/Api/DefaultApi.md#scimv2usersidput) | **PUT** /scim/v2/Users/{id} | Update User with SCIM
*DefaultApi* | [**scimV2UsersPost**](docs/Api/DefaultApi.md#scimv2userspost) | **POST** /scim/v2/Users | Create User with SCIM
*DefaultApi* | [**servicesCertificateCertIdGet**](docs/Api/DefaultApi.md#servicescertificatecertidget) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate
*DefaultApi* | [**servicesConfigurationModeActionsDisablePost**](docs/Api/DefaultApi.md#servicesconfigurationmodeactionsdisablepost) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode
*DefaultApi* | [**servicesConfigurationModeActionsEnablePost**](docs/Api/DefaultApi.md#servicesconfigurationmodeactionsenablepost) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode
*DefaultApi* | [**servicesDirectdataFilesGet**](docs/Api/DefaultApi.md#servicesdirectdatafilesget) | **GET** /services/directdata/files | Retrieve Available Direct Data Files
*DefaultApi* | [**servicesDirectdataFilesNameGet**](docs/Api/DefaultApi.md#servicesdirectdatafilesnameget) | **GET** /services/directdata/files/{name} | Download Direct Data File
*DefaultApi* | [**servicesFileStagingItemsContentItemGet**](docs/Api/DefaultApi.md#servicesfilestagingitemscontentitemget) | **GET** /services/file_staging/items/content/{item} | Download Item Content
*DefaultApi* | [**servicesFileStagingItemsItemDelete**](docs/Api/DefaultApi.md#servicesfilestagingitemsitemdelete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder
*DefaultApi* | [**servicesFileStagingItemsItemGet**](docs/Api/DefaultApi.md#servicesfilestagingitemsitemget) | **GET** /services/file_staging/items/{item} | List Items at a Path
*DefaultApi* | [**servicesFileStagingItemsItemPut**](docs/Api/DefaultApi.md#servicesfilestagingitemsitemput) | **PUT** /services/file_staging/items/{item} | Update Folder or File
*DefaultApi* | [**servicesFileStagingItemsPost**](docs/Api/DefaultApi.md#servicesfilestagingitemspost) | **POST** /services/file_staging/items | Create Folder or File
*DefaultApi* | [**servicesFileStagingUploadGet**](docs/Api/DefaultApi.md#servicesfilestaginguploadget) | **GET** /services/file_staging/upload/ | List Upload Sessions
*DefaultApi* | [**servicesFileStagingUploadPost**](docs/Api/DefaultApi.md#servicesfilestaginguploadpost) | **POST** /services/file_staging/upload | Create Resumable Upload Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdDelete**](docs/Api/DefaultApi.md#servicesfilestaginguploaduploadsessioniddelete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdGet**](docs/Api/DefaultApi.md#servicesfilestaginguploaduploadsessionidget) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdPartsGet**](docs/Api/DefaultApi.md#servicesfilestaginguploaduploadsessionidpartsget) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdPost**](docs/Api/DefaultApi.md#servicesfilestaginguploaduploadsessionidpost) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdPut**](docs/Api/DefaultApi.md#servicesfilestaginguploaduploadsessionidput) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session
*DefaultApi* | [**servicesJobsHistoriesGet**](docs/Api/DefaultApi.md#servicesjobshistoriesget) | **GET** /services/jobs/histories | Retrieve Job Histories
*DefaultApi* | [**servicesJobsJobIdErrorsGet**](docs/Api/DefaultApi.md#servicesjobsjobiderrorsget) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors
*DefaultApi* | [**servicesJobsJobIdGet**](docs/Api/DefaultApi.md#servicesjobsjobidget) | **GET** /services/jobs/{job_id} | Retrieve Job Status
*DefaultApi* | [**servicesJobsJobIdSummaryGet**](docs/Api/DefaultApi.md#servicesjobsjobidsummaryget) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary
*DefaultApi* | [**servicesJobsJobIdTasksGet**](docs/Api/DefaultApi.md#servicesjobsjobidtasksget) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks
*DefaultApi* | [**servicesJobsMonitorsGet**](docs/Api/DefaultApi.md#servicesjobsmonitorsget) | **GET** /services/jobs/monitors | Retrieve Job Monitors
*DefaultApi* | [**servicesJobsStartNowJobIdPost**](docs/Api/DefaultApi.md#servicesjobsstartnowjobidpost) | **POST** /services/jobs/start_now/{job_id} | Start Job
*DefaultApi* | [**servicesLoaderExtractPost**](docs/Api/DefaultApi.md#servicesloaderextractpost) | **POST** /services/loader/extract | Extract Data Files
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdFailurelogGet**](docs/Api/DefaultApi.md#servicesloaderjobidtaskstaskidfailurelogget) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdResultsGet**](docs/Api/DefaultApi.md#servicesloaderjobidtaskstaskidresultsget) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**](docs/Api/DefaultApi.md#servicesloaderjobidtaskstaskidresultsrenditionsget) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdSuccesslogGet**](docs/Api/DefaultApi.md#servicesloaderjobidtaskstaskidsuccesslogget) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results
*DefaultApi* | [**servicesLoaderLoadPost**](docs/Api/DefaultApi.md#servicesloaderloadpost) | **POST** /services/loader/load | Load Data Objects
*DefaultApi* | [**servicesPackageActionsValidatePost**](docs/Api/DefaultApi.md#servicespackageactionsvalidatepost) | **POST** /services/package/actions/validate | Validate Package
*DefaultApi* | [**servicesPackagePost**](docs/Api/DefaultApi.md#servicespackagepost) | **POST** /services/package | Export Package
*DefaultApi* | [**servicesPackagePut**](docs/Api/DefaultApi.md#servicespackageput) | **PUT** /services/package | Import Package
*DefaultApi* | [**servicesQueuesGet**](docs/Api/DefaultApi.md#servicesqueuesget) | **GET** /services/queues | Retrieve All Queues
*DefaultApi* | [**servicesQueuesQueueNameActionsDisableDeliveryPut**](docs/Api/DefaultApi.md#servicesqueuesqueuenameactionsdisabledeliveryput) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery
*DefaultApi* | [**servicesQueuesQueueNameActionsEnableDeliveryPut**](docs/Api/DefaultApi.md#servicesqueuesqueuenameactionsenabledeliveryput) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery
*DefaultApi* | [**servicesQueuesQueueNameActionsResetPut**](docs/Api/DefaultApi.md#servicesqueuesqueuenameactionsresetput) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue
*DefaultApi* | [**servicesQueuesQueueNameGet**](docs/Api/DefaultApi.md#servicesqueuesqueuenameget) | **GET** /services/queues/{queue_name} | Retrieve Queue Status
*DefaultApi* | [**servicesVobjectVaultPackageVPackageIdActionsValidatePost**](docs/Api/DefaultApi.md#servicesvobjectvaultpackagevpackageidactionsvalidatepost) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package
*DefaultApi* | [**sessionDelete**](docs/Api/DefaultApi.md#sessiondelete) | **DELETE** /session | End Session
*DefaultApi* | [**uicodeDistributionsDistributionNameCodeGet**](docs/Api/DefaultApi.md#uicodedistributionsdistributionnamecodeget) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution
*DefaultApi* | [**uicodeDistributionsDistributionNameDelete**](docs/Api/DefaultApi.md#uicodedistributionsdistributionnamedelete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution
*DefaultApi* | [**uicodeDistributionsDistributionNameGet**](docs/Api/DefaultApi.md#uicodedistributionsdistributionnameget) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata
*DefaultApi* | [**uicodeDistributionsGet**](docs/Api/DefaultApi.md#uicodedistributionsget) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata
*DefaultApi* | [**uicodeDistributionsPost**](docs/Api/DefaultApi.md#uicodedistributionspost) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution
*DefaultApi* | [**vobjectVaultPackageVPackageIdActionsDeployPost**](docs/Api/DefaultApi.md#vobjectvaultpackagevpackageidactionsdeploypost) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package
*DefaultApi* | [**vobjectVaultPackageVPackageIdActionsDeployResultsGet**](docs/Api/DefaultApi.md#vobjectvaultpackagevpackageidactionsdeployresultsget) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results
*DefaultApi* | [**vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**](docs/Api/DefaultApi.md#vobjectscascadedeleteresultsobjectnamejobstatusjobidget) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job
*DefaultApi* | [**vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**](docs/Api/DefaultApi.md#vobjectsdeepcopyresultsobjectnamejobstatusjobidget) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job
*DefaultApi* | [**vobjectsEdlItemVActionsCreateplaceholderPost**](docs/Api/DefaultApi.md#vobjectsedlitemvactionscreateplaceholderpost) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item
*DefaultApi* | [**vobjectsMergesJobIdLogGet**](docs/Api/DefaultApi.md#vobjectsmergesjobidlogget) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log
*DefaultApi* | [**vobjectsMergesJobIdResultsGet**](docs/Api/DefaultApi.md#vobjectsmergesjobidresultsget) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results
*DefaultApi* | [**vobjectsMergesJobIdStatusGet**](docs/Api/DefaultApi.md#vobjectsmergesjobidstatusget) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status
*DefaultApi* | [**vobjectsObjectNameActionsActionNamePost**](docs/Api/DefaultApi.md#vobjectsobjectnameactionsactionnamepost) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records
*DefaultApi* | [**vobjectsObjectNameActionsChangetypePost**](docs/Api/DefaultApi.md#vobjectsobjectnameactionschangetypepost) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type
*DefaultApi* | [**vobjectsObjectNameActionsMergePost**](docs/Api/DefaultApi.md#vobjectsobjectnameactionsmergepost) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge
*DefaultApi* | [**vobjectsObjectNameActionsRecalculaterollupsGet**](docs/Api/DefaultApi.md#vobjectsobjectnameactionsrecalculaterollupsget) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status
*DefaultApi* | [**vobjectsObjectNameActionsRecalculaterollupsPost**](docs/Api/DefaultApi.md#vobjectsobjectnameactionsrecalculaterollupspost) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields
*DefaultApi* | [**vobjectsObjectNameActionsUpdatecorporatecurrencyPut**](docs/Api/DefaultApi.md#vobjectsobjectnameactionsupdatecorporatecurrencyput) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields
*DefaultApi* | [**vobjectsObjectNameAttachmentsBatchDelete**](docs/Api/DefaultApi.md#vobjectsobjectnameattachmentsbatchdelete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments
*DefaultApi* | [**vobjectsObjectNameAttachmentsBatchPost**](docs/Api/DefaultApi.md#vobjectsobjectnameattachmentsbatchpost) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments
*DefaultApi* | [**vobjectsObjectNameAttachmentsBatchPut**](docs/Api/DefaultApi.md#vobjectsobjectnameattachmentsbatchput) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions
*DefaultApi* | [**vobjectsObjectNameDelete**](docs/Api/DefaultApi.md#vobjectsobjectnamedelete) | **DELETE** /vobjects/{object_name} | Delete Object Records
*DefaultApi* | [**vobjectsObjectNameIdRolesRoleNameGet**](docs/Api/DefaultApi.md#vobjectsobjectnameidrolesrolenameget) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsActionNameGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidactionsactionnameget) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsActionNamePost**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidactionsactionnamepost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidactionscascadedeletepost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidactionsdeepcopypost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidactionsget) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefilepost) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentfieldsfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentiddelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidput) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversiondelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionpost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsFileGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsPost**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentspost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAudittrailGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidaudittrailget) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdGet**](docs/Api/DefaultApi.md#vobjectsobjectnameobjectrecordidget) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record
*DefaultApi* | [**vobjectsObjectNamePost**](docs/Api/DefaultApi.md#vobjectsobjectnamepost) | **POST** /vobjects/{object_name} | Create &amp; Upsert Object Records
*DefaultApi* | [**vobjectsObjectNamePut**](docs/Api/DefaultApi.md#vobjectsobjectnameput) | **PUT** /vobjects/{object_name} | Update Object Records
*DefaultApi* | [**vobjectsObjectNameRolesDelete**](docs/Api/DefaultApi.md#vobjectsobjectnamerolesdelete) | **DELETE** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records
*DefaultApi* | [**vobjectsObjectNameRolesPost**](docs/Api/DefaultApi.md#vobjectsobjectnamerolespost) | **POST** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records
*DefaultApi* | [**vobjectsOutboundPackageVPackageIdDependenciesGet**](docs/Api/DefaultApi.md#vobjectsoutboundpackagevpackageiddependenciesget) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies

## Models

- [VobjectsObjectNameActionsMergePostRequestInner](docs/Model/VobjectsObjectNameActionsMergePostRequestInner.md)

## Authorization
All endpoints do not require authorization.
## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.0.0`
    - Generator version: `7.14.0`
- Build package: `org.openapitools.codegen.languages.PhpNextgenClientCodegen`
