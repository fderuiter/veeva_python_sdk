# Veeva Vault API v25.1 API Client


The latest GA version of the Vault REST API.

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASDefaultApi api = new OASDefaultApi();

Map<String, Object> params = new Map<String, Object>{
    'authorization' => {{sessionId}},
    'accept' => application/json,
    'xVaultAPIClientID' => {{clientId}}
};

try {
    // cross your fingers
    api.apiGet(params);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *http://}/api/v25.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASDefaultApi* | [**apiGet**](OASDefaultApi.md#apiGet) | **GET** /api/ | Retrieve API Versions
*OASDefaultApi* | [**apiMdlComponentsComponentTypeAndRecordNameFilesGet**](OASDefaultApi.md#apiMdlComponentsComponentTypeAndRecordNameFilesGet) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File
*OASDefaultApi* | [**apiMdlComponentsComponentTypeAndRecordNameGet**](OASDefaultApi.md#apiMdlComponentsComponentTypeAndRecordNameGet) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL)
*OASDefaultApi* | [**apiMdlExecuteAsyncJobIdResultsGet**](OASDefaultApi.md#apiMdlExecuteAsyncJobIdResultsGet) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results
*OASDefaultApi* | [**apiMdlExecuteAsyncPost**](OASDefaultApi.md#apiMdlExecuteAsyncPost) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously
*OASDefaultApi* | [**apiMdlExecutePost**](OASDefaultApi.md#apiMdlExecutePost) | **POST** /api/mdl/execute | Execute MDL Script
*OASDefaultApi* | [**apiMdlFilesPost**](OASDefaultApi.md#apiMdlFilesPost) | **POST** /api/mdl/files | Upload Content File
*OASDefaultApi* | [**audittrailAuditTrailTypeGet**](OASDefaultApi.md#audittrailAuditTrailTypeGet) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details
*OASDefaultApi* | [**authDiscoveryPost**](OASDefaultApi.md#authDiscoveryPost) | **POST** /auth/discovery | Authentication Type Discovery
*OASDefaultApi* | [**authOauthSessionOathOidcProfileIdPost**](OASDefaultApi.md#authOauthSessionOathOidcProfileIdPost) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect
*OASDefaultApi* | [**authPost**](OASDefaultApi.md#authPost) | **POST** /auth | User Name and Password
*OASDefaultApi* | [**codeClassNameDelete**](OASDefaultApi.md#codeClassNameDelete) | **DELETE** /code/{class_name} | Delete Single Source Code File
*OASDefaultApi* | [**codeClassNameDisablePut**](OASDefaultApi.md#codeClassNameDisablePut) | **PUT** /code/{class_name}/disable | Disable Vault Extension
*OASDefaultApi* | [**codeClassNameEnablePut**](OASDefaultApi.md#codeClassNameEnablePut) | **PUT** /code/{class_name}/enable | Enable Vault Extension
*OASDefaultApi* | [**codeClassNameGet**](OASDefaultApi.md#codeClassNameGet) | **GET** /code/{class_name} | Retrieve Single Source Code File
*OASDefaultApi* | [**codeProfilerGet**](OASDefaultApi.md#codeProfilerGet) | **GET** /code/profiler | Retrieve All Profiling Sessions
*OASDefaultApi* | [**codeProfilerPost**](OASDefaultApi.md#codeProfilerPost) | **POST** /code/profiler | Create Profiling Session
*OASDefaultApi* | [**codeProfilerSessionNameActionsEndPost**](OASDefaultApi.md#codeProfilerSessionNameActionsEndPost) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session
*OASDefaultApi* | [**codeProfilerSessionNameDelete**](OASDefaultApi.md#codeProfilerSessionNameDelete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session
*OASDefaultApi* | [**codeProfilerSessionNameGet**](OASDefaultApi.md#codeProfilerSessionNameGet) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session
*OASDefaultApi* | [**codeProfilerSessionNameResultsGet**](OASDefaultApi.md#codeProfilerSessionNameResultsGet) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results
*OASDefaultApi* | [**codePut**](OASDefaultApi.md#codePut) | **PUT** /code | Add or Replace Single Source Code File
*OASDefaultApi* | [**compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**](OASDefaultApi.md#compositesTreesEdlHierarchyOrTemplateActionsListnodesPost) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes
*OASDefaultApi* | [**compositesTreesEdlHierarchyOrTemplateGet**](OASDefaultApi.md#compositesTreesEdlHierarchyOrTemplateGet) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes
*OASDefaultApi* | [**compositesTreesEdlHierarchyVParentNodeIdChildrenGet**](OASDefaultApi.md#compositesTreesEdlHierarchyVParentNodeIdChildrenGet) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node\&#39;s Children
*OASDefaultApi* | [**compositesTreesEdlHierarchyVParentNodeIdChildrenPut**](OASDefaultApi.md#compositesTreesEdlHierarchyVParentNodeIdChildrenPut) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
*OASDefaultApi* | [**configurationComponentTypeAndRecordNameGet**](OASDefaultApi.md#configurationComponentTypeAndRecordNameGet) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
*OASDefaultApi* | [**configurationComponentTypeGet**](OASDefaultApi.md#configurationComponentTypeGet) | **GET** /configuration/{component_type} | Retrieve Component Record Collection
*OASDefaultApi* | [**configurationObjectNameAndObjectTypeGet**](OASDefaultApi.md#configurationObjectNameAndObjectTypeGet) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
*OASDefaultApi* | [**configurationObjecttypeGet**](OASDefaultApi.md#configurationObjecttypeGet) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types
*OASDefaultApi* | [**configurationRoleAssignmentRuleDelete**](OASDefaultApi.md#configurationRoleAssignmentRuleDelete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
*OASDefaultApi* | [**configurationRoleAssignmentRuleGet**](OASDefaultApi.md#configurationRoleAssignmentRuleGet) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
*OASDefaultApi* | [**configurationRoleAssignmentRulePost**](OASDefaultApi.md#configurationRoleAssignmentRulePost) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
*OASDefaultApi* | [**configurationRoleAssignmentRulePut**](OASDefaultApi.md#configurationRoleAssignmentRulePut) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override)
*OASDefaultApi* | [**delegationLoginPost**](OASDefaultApi.md#delegationLoginPost) | **POST** /delegation/login | Initiate Delegated Session
*OASDefaultApi* | [**delegationVaultsGet**](OASDefaultApi.md#delegationVaultsGet) | **GET** /delegation/vaults | Retrieve Delegations
*OASDefaultApi* | [**keepAlivePost**](OASDefaultApi.md#keepAlivePost) | **POST** /keep-alive | Session Keep Alive
*OASDefaultApi* | [**limitsGet**](OASDefaultApi.md#limitsGet) | **GET** /limits | Retrieve Limits on Objects
*OASDefaultApi* | [**logsApiUsageGet**](OASDefaultApi.md#logsApiUsageGet) | **GET** /logs/api_usage | Download Daily API Usage
*OASDefaultApi* | [**logsCodeDebugGet**](OASDefaultApi.md#logsCodeDebugGet) | **GET** /logs/code/debug | Retrieve All Debug Logs
*OASDefaultApi* | [**logsCodeDebugIdActionsResetDelete**](OASDefaultApi.md#logsCodeDebugIdActionsResetDelete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log
*OASDefaultApi* | [**logsCodeDebugIdActionsResetPost**](OASDefaultApi.md#logsCodeDebugIdActionsResetPost) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log
*OASDefaultApi* | [**logsCodeDebugIdFilesGet**](OASDefaultApi.md#logsCodeDebugIdFilesGet) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files
*OASDefaultApi* | [**logsCodeDebugIdGet**](OASDefaultApi.md#logsCodeDebugIdGet) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log
*OASDefaultApi* | [**logsCodeDebugPost**](OASDefaultApi.md#logsCodeDebugPost) | **POST** /logs/code/debug | Create Debug Log
*OASDefaultApi* | [**logsCodeRuntimeGet**](OASDefaultApi.md#logsCodeRuntimeGet) | **GET** /logs/code/runtime | Download SDK Runtime Log
*OASDefaultApi* | [**messagesMessageTypeActionsImportPost**](OASDefaultApi.md#messagesMessageTypeActionsImportPost) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File
*OASDefaultApi* | [**messagesMessageTypeLanguageLangActionsExportPost**](OASDefaultApi.md#messagesMessageTypeLanguageLangActionsExportPost) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File
*OASDefaultApi* | [**metadataAudittrailAuditTrailTypeGet**](OASDefaultApi.md#metadataAudittrailAuditTrailTypeGet) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata
*OASDefaultApi* | [**metadataAudittrailGet**](OASDefaultApi.md#metadataAudittrailGet) | **GET** /metadata/audittrail | Retrieve Audit Types
*OASDefaultApi* | [**metadataComponentsComponentTypeGet**](OASDefaultApi.md#metadataComponentsComponentTypeGet) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata
*OASDefaultApi* | [**metadataComponentsGet**](OASDefaultApi.md#metadataComponentsGet) | **GET** /metadata/components | Retrieve All Component Metadata
*OASDefaultApi* | [**metadataObjectsBindersTemplatesBindernodesGet**](OASDefaultApi.md#metadataObjectsBindersTemplatesBindernodesGet) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata
*OASDefaultApi* | [**metadataObjectsBindersTemplatesGet**](OASDefaultApi.md#metadataObjectsBindersTemplatesGet) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata
*OASDefaultApi* | [**metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**](OASDefaultApi.md#metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata
*OASDefaultApi* | [**metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**](OASDefaultApi.md#metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata
*OASDefaultApi* | [**metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**](OASDefaultApi.md#metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata
*OASDefaultApi* | [**metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**](OASDefaultApi.md#metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata
*OASDefaultApi* | [**metadataObjectsDocumentsEventsGet**](OASDefaultApi.md#metadataObjectsDocumentsEventsGet) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes
*OASDefaultApi* | [**metadataObjectsDocumentsLockGet**](OASDefaultApi.md#metadataObjectsDocumentsLockGet) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata
*OASDefaultApi* | [**metadataObjectsDocumentsPropertiesFindCommonPost**](OASDefaultApi.md#metadataObjectsDocumentsPropertiesFindCommonPost) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields
*OASDefaultApi* | [**metadataObjectsDocumentsPropertiesGet**](OASDefaultApi.md#metadataObjectsDocumentsPropertiesGet) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields
*OASDefaultApi* | [**metadataObjectsDocumentsTemplatesGet**](OASDefaultApi.md#metadataObjectsDocumentsTemplatesGet) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata
*OASDefaultApi* | [**metadataObjectsDocumentsTypesGet**](OASDefaultApi.md#metadataObjectsDocumentsTypesGet) | **GET** /metadata/objects/documents/types | Retrieve All Document Types
*OASDefaultApi* | [**metadataObjectsDocumentsTypesTypeGet**](OASDefaultApi.md#metadataObjectsDocumentsTypesTypeGet) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type
*OASDefaultApi* | [**metadataObjectsDocumentsTypesTypeRelationshipsGet**](OASDefaultApi.md#metadataObjectsDocumentsTypesTypeRelationshipsGet) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships
*OASDefaultApi* | [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**](OASDefaultApi.md#metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification
*OASDefaultApi* | [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**](OASDefaultApi.md#metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype
*OASDefaultApi* | [**metadataObjectsGroupsGet**](OASDefaultApi.md#metadataObjectsGroupsGet) | **GET** /metadata/objects/groups | Retrieve Group Metadata
*OASDefaultApi* | [**metadataObjectsSecuritypoliciesGet**](OASDefaultApi.md#metadataObjectsSecuritypoliciesGet) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata
*OASDefaultApi* | [**metadataObjectsUsersGet**](OASDefaultApi.md#metadataObjectsUsersGet) | **GET** /metadata/objects/users | Retrieve User Metadata
*OASDefaultApi* | [**metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**](OASDefaultApi.md#metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata
*OASDefaultApi* | [**metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**](OASDefaultApi.md#metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata
*OASDefaultApi* | [**metadataVobjectsGet**](OASDefaultApi.md#metadataVobjectsGet) | **GET** /metadata/vobjects | Retrieve Object Collection
*OASDefaultApi* | [**metadataVobjectsObjectNameActionsCanceldeploymentPost**](OASDefaultApi.md#metadataVobjectsObjectNameActionsCanceldeploymentPost) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment
*OASDefaultApi* | [**metadataVobjectsObjectNameFieldsObjectFieldNameGet**](OASDefaultApi.md#metadataVobjectsObjectNameFieldsObjectFieldNameGet) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata
*OASDefaultApi* | [**metadataVobjectsObjectNameGet**](OASDefaultApi.md#metadataVobjectsObjectNameGet) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata
*OASDefaultApi* | [**metadataVobjectsObjectNamePageLayoutsGet**](OASDefaultApi.md#metadataVobjectsObjectNamePageLayoutsGet) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts
*OASDefaultApi* | [**metadataVobjectsObjectNamePageLayoutsLayoutNameGet**](OASDefaultApi.md#metadataVobjectsObjectNamePageLayoutsLayoutNameGet) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata
*OASDefaultApi* | [**notificationsHistoriesGet**](OASDefaultApi.md#notificationsHistoriesGet) | **GET** /notifications/histories | Retrieve Email Notification Histories
*OASDefaultApi* | [**objectWorkflowActionsActionGet**](OASDefaultApi.md#objectWorkflowActionsActionGet) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details
*OASDefaultApi* | [**objectWorkflowActionsActionPost**](OASDefaultApi.md#objectWorkflowActionsActionPost) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows
*OASDefaultApi* | [**objectWorkflowActionsCanceltasksPost**](OASDefaultApi.md#objectWorkflowActionsCanceltasksPost) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks
*OASDefaultApi* | [**objectWorkflowActionsCancelworkflowsPost**](OASDefaultApi.md#objectWorkflowActionsCancelworkflowsPost) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows
*OASDefaultApi* | [**objectWorkflowActionsGet**](OASDefaultApi.md#objectWorkflowActionsGet) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions
*OASDefaultApi* | [**objectWorkflowActionsReassigntasksPost**](OASDefaultApi.md#objectWorkflowActionsReassigntasksPost) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks
*OASDefaultApi* | [**objectWorkflowActionsReplaceworkflowownerPost**](OASDefaultApi.md#objectWorkflowActionsReplaceworkflowownerPost) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner
*OASDefaultApi* | [**objectsBindersActionsExportJobIdResultsGet**](OASDefaultApi.md#objectsBindersActionsExportJobIdResultsGet) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results
*OASDefaultApi* | [**objectsBindersBinderIdActionsExportPost**](OASDefaultApi.md#objectsBindersBinderIdActionsExportPost) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version)
*OASDefaultApi* | [**objectsBindersBinderIdActionsPost**](OASDefaultApi.md#objectsBindersBinderIdActionsPost) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing
*OASDefaultApi* | [**objectsBindersBinderIdBindingRulePut**](OASDefaultApi.md#objectsBindersBinderIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule
*OASDefaultApi* | [**objectsBindersBinderIdDelete**](OASDefaultApi.md#objectsBindersBinderIdDelete) | **DELETE** /objects/binders/{binder_id} | Delete Binder
*OASDefaultApi* | [**objectsBindersBinderIdDocumentsNodeIdBindingRulePut**](OASDefaultApi.md#objectsBindersBinderIdDocumentsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule
*OASDefaultApi* | [**objectsBindersBinderIdDocumentsPost**](OASDefaultApi.md#objectsBindersBinderIdDocumentsPost) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder
*OASDefaultApi* | [**objectsBindersBinderIdDocumentsSectionIdDelete**](OASDefaultApi.md#objectsBindersBinderIdDocumentsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder
*OASDefaultApi* | [**objectsBindersBinderIdDocumentsSectionIdPut**](OASDefaultApi.md#objectsBindersBinderIdDocumentsSectionIdPut) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder
*OASDefaultApi* | [**objectsBindersBinderIdGet**](OASDefaultApi.md#objectsBindersBinderIdGet) | **GET** /objects/binders/{binder_id} | Retrieve Binder
*OASDefaultApi* | [**objectsBindersBinderIdPost**](OASDefaultApi.md#objectsBindersBinderIdPost) | **POST** /objects/binders/{binder_id} | Create Binder Version
*OASDefaultApi* | [**objectsBindersBinderIdPut**](OASDefaultApi.md#objectsBindersBinderIdPut) | **PUT** /objects/binders/{binder_id} | Update Binder
*OASDefaultApi* | [**objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**](OASDefaultApi.md#objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder
*OASDefaultApi* | [**objectsBindersBinderIdSectionsNodeIdBindingRulePut**](OASDefaultApi.md#objectsBindersBinderIdSectionsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule
*OASDefaultApi* | [**objectsBindersBinderIdSectionsNodeIdPut**](OASDefaultApi.md#objectsBindersBinderIdSectionsNodeIdPut) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section
*OASDefaultApi* | [**objectsBindersBinderIdSectionsPost**](OASDefaultApi.md#objectsBindersBinderIdSectionsPost) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section
*OASDefaultApi* | [**objectsBindersBinderIdSectionsSectionIdDelete**](OASDefaultApi.md#objectsBindersBinderIdSectionsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section
*OASDefaultApi* | [**objectsBindersBinderIdSectionsSectionIdGet**](OASDefaultApi.md#objectsBindersBinderIdSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections
*OASDefaultApi* | [**objectsBindersBinderIdVersionsGet**](OASDefaultApi.md#objectsBindersBinderIdVersionsGet) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version)
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship
*OASDefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**](OASDefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section
*OASDefaultApi* | [**objectsBindersIdRolesGet**](OASDefaultApi.md#objectsBindersIdRolesGet) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles
*OASDefaultApi* | [**objectsBindersIdRolesPost**](OASDefaultApi.md#objectsBindersIdRolesPost) | **POST** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder
*OASDefaultApi* | [**objectsBindersIdRolesRoleNameGet**](OASDefaultApi.md#objectsBindersIdRolesRoleNameGet) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role
*OASDefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](OASDefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions
*OASDefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](OASDefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria
*OASDefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](OASDefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action
*OASDefaultApi* | [**objectsBindersLifecycleActionsPost**](OASDefaultApi.md#objectsBindersLifecycleActionsPost) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders
*OASDefaultApi* | [**objectsBindersLifecycleActionsUserActionNamePut**](OASDefaultApi.md#objectsBindersLifecycleActionsUserActionNamePut) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions
*OASDefaultApi* | [**objectsBindersPost**](OASDefaultApi.md#objectsBindersPost) | **POST** /objects/binders | Create Binder
*OASDefaultApi* | [**objectsBindersTemplatesGet**](OASDefaultApi.md#objectsBindersTemplatesGet) | **GET** /objects/binders/templates | Retrieve Binder Template Collection
*OASDefaultApi* | [**objectsBindersTemplatesPost**](OASDefaultApi.md#objectsBindersTemplatesPost) | **POST** /objects/binders/templates | Create Binder Template
*OASDefaultApi* | [**objectsBindersTemplatesPut**](OASDefaultApi.md#objectsBindersTemplatesPut) | **PUT** /objects/binders/templates | Update Binder Template
*OASDefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesGet**](OASDefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesGet) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes
*OASDefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesPost**](OASDefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesPost) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node
*OASDefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesPut**](OASDefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesPut) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes
*OASDefaultApi* | [**objectsBindersTemplatesTemplateNameDelete**](OASDefaultApi.md#objectsBindersTemplatesTemplateNameDelete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template
*OASDefaultApi* | [**objectsBindersTemplatesTemplateNameGet**](OASDefaultApi.md#objectsBindersTemplatesTemplateNameGet) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes
*OASDefaultApi* | [**objectsDeletionsDocumentsGet**](OASDefaultApi.md#objectsDeletionsDocumentsGet) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs
*OASDefaultApi* | [**objectsDeletionsVobjectsObjectNameGet**](OASDefaultApi.md#objectsDeletionsVobjectsObjectNameGet) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID
*OASDefaultApi* | [**objectsDocumentsActionsGet**](OASDefaultApi.md#objectsDocumentsActionsGet) | **GET** /objects/documents/actions | Retrieve All Document Workflows
*OASDefaultApi* | [**objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**](OASDefaultApi.md#objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results
*OASDefaultApi* | [**objectsDocumentsActionsWorkflowNameGet**](OASDefaultApi.md#objectsDocumentsActionsWorkflowNameGet) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details
*OASDefaultApi* | [**objectsDocumentsActionsWorkflowNamePost**](OASDefaultApi.md#objectsDocumentsActionsWorkflowNamePost) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow
*OASDefaultApi* | [**objectsDocumentsAnnotationsBatchDelete**](OASDefaultApi.md#objectsDocumentsAnnotationsBatchDelete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations
*OASDefaultApi* | [**objectsDocumentsAnnotationsBatchPost**](OASDefaultApi.md#objectsDocumentsAnnotationsBatchPost) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations
*OASDefaultApi* | [**objectsDocumentsAnnotationsBatchPut**](OASDefaultApi.md#objectsDocumentsAnnotationsBatchPut) | **PUT** /objects/documents/annotations/batch | Update Annotations
*OASDefaultApi* | [**objectsDocumentsAnnotationsRepliesBatchPost**](OASDefaultApi.md#objectsDocumentsAnnotationsRepliesBatchPost) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies
*OASDefaultApi* | [**objectsDocumentsAttachmentsBatchDelete**](OASDefaultApi.md#objectsDocumentsAttachmentsBatchDelete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments
*OASDefaultApi* | [**objectsDocumentsAttachmentsBatchPost**](OASDefaultApi.md#objectsDocumentsAttachmentsBatchPost) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments
*OASDefaultApi* | [**objectsDocumentsAttachmentsBatchPut**](OASDefaultApi.md#objectsDocumentsAttachmentsBatchPut) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions
*OASDefaultApi* | [**objectsDocumentsBatchActionsFileextractJobIdResultsGet**](OASDefaultApi.md#objectsDocumentsBatchActionsFileextractJobIdResultsGet) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results
*OASDefaultApi* | [**objectsDocumentsBatchActionsFileextractPost**](OASDefaultApi.md#objectsDocumentsBatchActionsFileextractPost) | **POST** /objects/documents/batch/actions/fileextract | Export Documents
*OASDefaultApi* | [**objectsDocumentsBatchActionsReclassifyPut**](OASDefaultApi.md#objectsDocumentsBatchActionsReclassifyPut) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents
*OASDefaultApi* | [**objectsDocumentsBatchActionsRerenderPost**](OASDefaultApi.md#objectsDocumentsBatchActionsRerenderPost) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions
*OASDefaultApi* | [**objectsDocumentsBatchDelete**](OASDefaultApi.md#objectsDocumentsBatchDelete) | **DELETE** /objects/documents/batch | Delete Multiple Documents
*OASDefaultApi* | [**objectsDocumentsBatchLockDelete**](OASDefaultApi.md#objectsDocumentsBatchLockDelete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout
*OASDefaultApi* | [**objectsDocumentsBatchPost**](OASDefaultApi.md#objectsDocumentsBatchPost) | **POST** /objects/documents/batch | Create Multiple Documents
*OASDefaultApi* | [**objectsDocumentsBatchPut**](OASDefaultApi.md#objectsDocumentsBatchPut) | **PUT** /objects/documents/batch | Update Multiple Documents
*OASDefaultApi* | [**objectsDocumentsDocIdAnchorsGet**](OASDefaultApi.md#objectsDocumentsDocIdAnchorsGet) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs
*OASDefaultApi* | [**objectsDocumentsDocIdAnnotationsFileGet**](OASDefaultApi.md#objectsDocumentsDocIdAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF
*OASDefaultApi* | [**objectsDocumentsDocIdAnnotationsFilePost**](OASDefaultApi.md#objectsDocumentsDocIdAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdDelete**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdGet**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdPut**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdPut) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsFileGet**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsGet**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsGet) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments
*OASDefaultApi* | [**objectsDocumentsDocIdAttachmentsPost**](OASDefaultApi.md#objectsDocumentsDocIdAttachmentsPost) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment
*OASDefaultApi* | [**objectsDocumentsDocIdAudittrailGet**](OASDefaultApi.md#objectsDocumentsDocIdAudittrailGet) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document
*OASDefaultApi* | [**objectsDocumentsDocIdDelete**](OASDefaultApi.md#objectsDocumentsDocIdDelete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document
*OASDefaultApi* | [**objectsDocumentsDocIdEventsGet**](OASDefaultApi.md#objectsDocumentsDocIdEventsGet) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events
*OASDefaultApi* | [**objectsDocumentsDocIdFileGet**](OASDefaultApi.md#objectsDocumentsDocIdFileGet) | **GET** /objects/documents/{doc_id}/file | Download Document File
*OASDefaultApi* | [**objectsDocumentsDocIdGet**](OASDefaultApi.md#objectsDocumentsDocIdGet) | **GET** /objects/documents/{doc_id} | Retrieve Document
*OASDefaultApi* | [**objectsDocumentsDocIdLockDelete**](OASDefaultApi.md#objectsDocumentsDocIdLockDelete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock
*OASDefaultApi* | [**objectsDocumentsDocIdLockGet**](OASDefaultApi.md#objectsDocumentsDocIdLockGet) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock
*OASDefaultApi* | [**objectsDocumentsDocIdLockPost**](OASDefaultApi.md#objectsDocumentsDocIdLockPost) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock
*OASDefaultApi* | [**objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**](OASDefaultApi.md#objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments
*OASDefaultApi* | [**objectsDocumentsDocIdPost**](OASDefaultApi.md#objectsDocumentsDocIdPost) | **POST** /objects/documents/{doc_id} | Create Single Document Version
*OASDefaultApi* | [**objectsDocumentsDocIdPut**](OASDefaultApi.md#objectsDocumentsDocIdPut) | **PUT** /objects/documents/{doc_id} | Update Single Document
*OASDefaultApi* | [**objectsDocumentsDocIdRenditionsGet**](OASDefaultApi.md#objectsDocumentsDocIdRenditionsGet) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions
*OASDefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypeDelete**](OASDefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition
*OASDefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypeGet**](OASDefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File
*OASDefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypePost**](OASDefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition
*OASDefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypePut**](OASDefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition
*OASDefaultApi* | [**objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**](OASDefaultApi.md#objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document
*OASDefaultApi* | [**objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsGet) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition
*OASDefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**](OASDefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File
*OASDefaultApi* | [**objectsDocumentsGet**](OASDefaultApi.md#objectsDocumentsGet) | **GET** /objects/documents | Retrieve All Documents
*OASDefaultApi* | [**objectsDocumentsIdRolesGet**](OASDefaultApi.md#objectsDocumentsIdRolesGet) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles
*OASDefaultApi* | [**objectsDocumentsIdRolesPost**](OASDefaultApi.md#objectsDocumentsIdRolesPost) | **POST** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document
*OASDefaultApi* | [**objectsDocumentsIdRolesRoleNameGet**](OASDefaultApi.md#objectsDocumentsIdRolesRoleNameGet) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role
*OASDefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](OASDefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions
*OASDefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](OASDefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria
*OASDefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](OASDefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action
*OASDefaultApi* | [**objectsDocumentsLifecycleActionsPost**](OASDefaultApi.md#objectsDocumentsLifecycleActionsPost) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents
*OASDefaultApi* | [**objectsDocumentsLifecycleActionsUserActionNamePut**](OASDefaultApi.md#objectsDocumentsLifecycleActionsUserActionNamePut) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions
*OASDefaultApi* | [**objectsDocumentsPost**](OASDefaultApi.md#objectsDocumentsPost) | **POST** /objects/documents | Create Single Document
*OASDefaultApi* | [**objectsDocumentsRelationshipsBatchDelete**](OASDefaultApi.md#objectsDocumentsRelationshipsBatchDelete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships
*OASDefaultApi* | [**objectsDocumentsRelationshipsBatchPost**](OASDefaultApi.md#objectsDocumentsRelationshipsBatchPost) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships
*OASDefaultApi* | [**objectsDocumentsRenditionsBatchDelete**](OASDefaultApi.md#objectsDocumentsRenditionsBatchDelete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions
*OASDefaultApi* | [**objectsDocumentsRenditionsBatchPost**](OASDefaultApi.md#objectsDocumentsRenditionsBatchPost) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions
*OASDefaultApi* | [**objectsDocumentsRolesBatchDelete**](OASDefaultApi.md#objectsDocumentsRolesBatchDelete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders
*OASDefaultApi* | [**objectsDocumentsRolesBatchPost**](OASDefaultApi.md#objectsDocumentsRolesBatchPost) | **POST** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
*OASDefaultApi* | [**objectsDocumentsTemplatesGet**](OASDefaultApi.md#objectsDocumentsTemplatesGet) | **GET** /objects/documents/templates | Retrieve Document Template Collection
*OASDefaultApi* | [**objectsDocumentsTemplatesPost**](OASDefaultApi.md#objectsDocumentsTemplatesPost) | **POST** /objects/documents/templates | Create Single Document Template
*OASDefaultApi* | [**objectsDocumentsTemplatesPut**](OASDefaultApi.md#objectsDocumentsTemplatesPut) | **PUT** /objects/documents/templates | Update Multiple Document Templates
*OASDefaultApi* | [**objectsDocumentsTemplatesTemplateNameDelete**](OASDefaultApi.md#objectsDocumentsTemplatesTemplateNameDelete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template
*OASDefaultApi* | [**objectsDocumentsTemplatesTemplateNameFileGet**](OASDefaultApi.md#objectsDocumentsTemplatesTemplateNameFileGet) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File
*OASDefaultApi* | [**objectsDocumentsTemplatesTemplateNameGet**](OASDefaultApi.md#objectsDocumentsTemplatesTemplateNameGet) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes
*OASDefaultApi* | [**objectsDocumentsTemplatesTemplateNamePut**](OASDefaultApi.md#objectsDocumentsTemplatesTemplateNamePut) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template
*OASDefaultApi* | [**objectsDocumentsTokensPost**](OASDefaultApi.md#objectsDocumentsTokensPost) | **POST** /objects/documents/tokens | Document Tokens
*OASDefaultApi* | [**objectsDocumentsVersionsBatchActionsFileextractPost**](OASDefaultApi.md#objectsDocumentsVersionsBatchActionsFileextractPost) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions
*OASDefaultApi* | [**objectsDocumentsVersionsBatchDelete**](OASDefaultApi.md#objectsDocumentsVersionsBatchDelete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions
*OASDefaultApi* | [**objectsDocumentsVersionsBatchPost**](OASDefaultApi.md#objectsDocumentsVersionsBatchPost) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions
*OASDefaultApi* | [**objectsDomainGet**](OASDefaultApi.md#objectsDomainGet) | **GET** /objects/domain | Retrieve Domain Information
*OASDefaultApi* | [**objectsDomainsGet**](OASDefaultApi.md#objectsDomainsGet) | **GET** /objects/domains | Retrieve Domains
*OASDefaultApi* | [**objectsEdlMatchedDocumentsBatchActionsAddPost**](OASDefaultApi.md#objectsEdlMatchedDocumentsBatchActionsAddPost) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents
*OASDefaultApi* | [**objectsEdlMatchedDocumentsBatchActionsRemovePost**](OASDefaultApi.md#objectsEdlMatchedDocumentsBatchActionsRemovePost) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents
*OASDefaultApi* | [**objectsGroupsAutoGet**](OASDefaultApi.md#objectsGroupsAutoGet) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups
*OASDefaultApi* | [**objectsGroupsGet**](OASDefaultApi.md#objectsGroupsGet) | **GET** /objects/groups | Retrieve All Groups
*OASDefaultApi* | [**objectsGroupsGroupIdDelete**](OASDefaultApi.md#objectsGroupsGroupIdDelete) | **DELETE** /objects/groups/{group_id} | Delete Group
*OASDefaultApi* | [**objectsGroupsGroupIdGet**](OASDefaultApi.md#objectsGroupsGroupIdGet) | **GET** /objects/groups/{group_id} | Retrieve Group
*OASDefaultApi* | [**objectsGroupsGroupIdPut**](OASDefaultApi.md#objectsGroupsGroupIdPut) | **PUT** /objects/groups/{group_id} | Update Group
*OASDefaultApi* | [**objectsGroupsPost**](OASDefaultApi.md#objectsGroupsPost) | **POST** /objects/groups | Create Group 
*OASDefaultApi* | [**objectsLicensesGet**](OASDefaultApi.md#objectsLicensesGet) | **GET** /objects/licenses | Retrieve Application License Usage
*OASDefaultApi* | [**objectsObjectworkflowsActionsGet**](OASDefaultApi.md#objectsObjectworkflowsActionsGet) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows
*OASDefaultApi* | [**objectsObjectworkflowsActionsWorkflowNameGet**](OASDefaultApi.md#objectsObjectworkflowsActionsWorkflowNameGet) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details
*OASDefaultApi* | [**objectsObjectworkflowsActionsWorkflowNamePost**](OASDefaultApi.md#objectsObjectworkflowsActionsWorkflowNamePost) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow
*OASDefaultApi* | [**objectsObjectworkflowsGet**](OASDefaultApi.md#objectsObjectworkflowsGet) | **GET** /objects/objectworkflows | Retrieve Workflows
*OASDefaultApi* | [**objectsObjectworkflowsTasksGet**](OASDefaultApi.md#objectsObjectworkflowsTasksGet) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsAcceptPost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsAcceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsCancelPost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsCancelPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsCompletePost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsCompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsGet**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsReassignPost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsReassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsTaskActionGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date
*OASDefaultApi* | [**objectsObjectworkflowsTasksTaskIdGet**](OASDefaultApi.md#objectsObjectworkflowsTasksTaskIdGet) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details
*OASDefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsGet**](OASDefaultApi.md#objectsObjectworkflowsWorkflowIdActionsGet) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions
*OASDefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**](OASDefaultApi.md#objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details
*OASDefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**](OASDefaultApi.md#objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action
*OASDefaultApi* | [**objectsObjectworkflowsWorkflowIdGet**](OASDefaultApi.md#objectsObjectworkflowsWorkflowIdGet) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details
*OASDefaultApi* | [**objectsPicklistsGet**](OASDefaultApi.md#objectsPicklistsGet) | **GET** /objects/picklists | Retrieve All Picklists
*OASDefaultApi* | [**objectsPicklistsPicklistNameGet**](OASDefaultApi.md#objectsPicklistsPicklistNameGet) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values
*OASDefaultApi* | [**objectsPicklistsPicklistNamePicklistValueNameDelete**](OASDefaultApi.md#objectsPicklistsPicklistNamePicklistValueNameDelete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value
*OASDefaultApi* | [**objectsPicklistsPicklistNamePicklistValueNamePut**](OASDefaultApi.md#objectsPicklistsPicklistNamePicklistValueNamePut) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value
*OASDefaultApi* | [**objectsPicklistsPicklistNamePost**](OASDefaultApi.md#objectsPicklistsPicklistNamePost) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values
*OASDefaultApi* | [**objectsPicklistsPicklistNamePut**](OASDefaultApi.md#objectsPicklistsPicklistNamePut) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label
*OASDefaultApi* | [**objectsSandboxActionsBuildproductionPost**](OASDefaultApi.md#objectsSandboxActionsBuildproductionPost) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault
*OASDefaultApi* | [**objectsSandboxActionsPromoteproductionPost**](OASDefaultApi.md#objectsSandboxActionsPromoteproductionPost) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production
*OASDefaultApi* | [**objectsSandboxActionsRecheckusagePost**](OASDefaultApi.md#objectsSandboxActionsRecheckusagePost) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit
*OASDefaultApi* | [**objectsSandboxBatchChangesizePost**](OASDefaultApi.md#objectsSandboxBatchChangesizePost) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size
*OASDefaultApi* | [**objectsSandboxEntitlementsSetPost**](OASDefaultApi.md#objectsSandboxEntitlementsSetPost) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements
*OASDefaultApi* | [**objectsSandboxGet**](OASDefaultApi.md#objectsSandboxGet) | **GET** /objects/sandbox | Retrieve Sandboxes
*OASDefaultApi* | [**objectsSandboxNameDelete**](OASDefaultApi.md#objectsSandboxNameDelete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox
*OASDefaultApi* | [**objectsSandboxPost**](OASDefaultApi.md#objectsSandboxPost) | **POST** /objects/sandbox | Create or Refresh Sandbox
*OASDefaultApi* | [**objectsSandboxSnapshotApiNameActionsUpdatePost**](OASDefaultApi.md#objectsSandboxSnapshotApiNameActionsUpdatePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot
*OASDefaultApi* | [**objectsSandboxSnapshotApiNameActionsUpgradePost**](OASDefaultApi.md#objectsSandboxSnapshotApiNameActionsUpgradePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot
*OASDefaultApi* | [**objectsSandboxSnapshotApiNameDelete**](OASDefaultApi.md#objectsSandboxSnapshotApiNameDelete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot
*OASDefaultApi* | [**objectsSandboxSnapshotGet**](OASDefaultApi.md#objectsSandboxSnapshotGet) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots
*OASDefaultApi* | [**objectsSandboxSnapshotPost**](OASDefaultApi.md#objectsSandboxSnapshotPost) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot
*OASDefaultApi* | [**objectsSandboxVaultIdActionsRefreshPost**](OASDefaultApi.md#objectsSandboxVaultIdActionsRefreshPost) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot
*OASDefaultApi* | [**objectsSandboxVaultIdGet**](OASDefaultApi.md#objectsSandboxVaultIdGet) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID
*OASDefaultApi* | [**objectsSecuritypoliciesGet**](OASDefaultApi.md#objectsSecuritypoliciesGet) | **GET** /objects/securitypolicies | Retrieve All Security Policies
*OASDefaultApi* | [**objectsSecuritypoliciesSecurityPolicyNameGet**](OASDefaultApi.md#objectsSecuritypoliciesSecurityPolicyNameGet) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy
*OASDefaultApi* | [**objectsUsersGet**](OASDefaultApi.md#objectsUsersGet) | **GET** /objects/users/ | Retrieve All Users
*OASDefaultApi* | [**objectsUsersIdGet**](OASDefaultApi.md#objectsUsersIdGet) | **GET** /objects/users/{id} | Retrieve User
*OASDefaultApi* | [**objectsUsersIdPermissionsGet**](OASDefaultApi.md#objectsUsersIdPermissionsGet) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions
*OASDefaultApi* | [**objectsUsersIdPut**](OASDefaultApi.md#objectsUsersIdPut) | **PUT** /objects/users/{id} | Update Single User
*OASDefaultApi* | [**objectsUsersMeGet**](OASDefaultApi.md#objectsUsersMeGet) | **GET** /objects/users/me | Validate Session User
*OASDefaultApi* | [**objectsUsersMePasswordPost**](OASDefaultApi.md#objectsUsersMePasswordPost) | **POST** /objects/users/me/password | Change My Password
*OASDefaultApi* | [**objectsUsersMePermissionsGet**](OASDefaultApi.md#objectsUsersMePermissionsGet) | **GET** /objects/users/me/permissions | Retrieve My User Permissions
*OASDefaultApi* | [**objectsUsersMePut**](OASDefaultApi.md#objectsUsersMePut) | **PUT** /objects/users/me | Update My User
*OASDefaultApi* | [**objectsUsersPost**](OASDefaultApi.md#objectsUsersPost) | **POST** /objects/users | Create Single User
*OASDefaultApi* | [**objectsUsersPut**](OASDefaultApi.md#objectsUsersPut) | **PUT** /objects/users | Update Multiple Users
*OASDefaultApi* | [**objectsUsersUserIdDelete**](OASDefaultApi.md#objectsUsersUserIdDelete) | **DELETE** /objects/users/{user_id} | Disable User
*OASDefaultApi* | [**objectsUsersUserIdVaultMembershipVaultIdPut**](OASDefaultApi.md#objectsUsersUserIdVaultMembershipVaultIdPut) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership
*OASDefaultApi* | [**objectsVaultActionsComparePost**](OASDefaultApi.md#objectsVaultActionsComparePost) | **POST** /objects/vault/actions/compare | Vault Compare
*OASDefaultApi* | [**objectsVaultActionsConfigreportPost**](OASDefaultApi.md#objectsVaultActionsConfigreportPost) | **POST** /objects/vault/actions/configreport | Vault Configuration Report
*OASDefaultApi* | [**queryComponentsPost**](OASDefaultApi.md#queryComponentsPost) | **POST** /query/components | Component Definition Query
*OASDefaultApi* | [**queryNextPagePost**](OASDefaultApi.md#queryNextPagePost) | **POST** /query/{next_page} | Next Page URL
*OASDefaultApi* | [**queryPost**](OASDefaultApi.md#queryPost) | **POST** /query | Submitting a Query
*OASDefaultApi* | [**queryPreviousPagePost**](OASDefaultApi.md#queryPreviousPagePost) | **POST** /query/{previous_page} | Previous Page URL
*OASDefaultApi* | [**scimV2MeGet**](OASDefaultApi.md#scimV2MeGet) | **GET** /scim/v2/Me | Retrieve Current User with SCIM
*OASDefaultApi* | [**scimV2MePut**](OASDefaultApi.md#scimV2MePut) | **PUT** /scim/v2/Me | Update Current User with SCIM
*OASDefaultApi* | [**scimV2ResourceTypesGet**](OASDefaultApi.md#scimV2ResourceTypesGet) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types
*OASDefaultApi* | [**scimV2ResourceTypesTypeGet**](OASDefaultApi.md#scimV2ResourceTypesTypeGet) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type
*OASDefaultApi* | [**scimV2SchemasGet**](OASDefaultApi.md#scimV2SchemasGet) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information
*OASDefaultApi* | [**scimV2SchemasIdGet**](OASDefaultApi.md#scimV2SchemasIdGet) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information
*OASDefaultApi* | [**scimV2ServiceProviderConfigGet**](OASDefaultApi.md#scimV2ServiceProviderConfigGet) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider
*OASDefaultApi* | [**scimV2TypeGet**](OASDefaultApi.md#scimV2TypeGet) | **GET** /scim/v2/{type} | Retrieve SCIM Resources
*OASDefaultApi* | [**scimV2TypeIdGet**](OASDefaultApi.md#scimV2TypeIdGet) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource
*OASDefaultApi* | [**scimV2UsersGet**](OASDefaultApi.md#scimV2UsersGet) | **GET** /scim/v2/Users | Retrieve All Users with SCIM
*OASDefaultApi* | [**scimV2UsersIdGet**](OASDefaultApi.md#scimV2UsersIdGet) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM
*OASDefaultApi* | [**scimV2UsersIdPut**](OASDefaultApi.md#scimV2UsersIdPut) | **PUT** /scim/v2/Users/{id} | Update User with SCIM
*OASDefaultApi* | [**scimV2UsersPost**](OASDefaultApi.md#scimV2UsersPost) | **POST** /scim/v2/Users | Create User with SCIM
*OASDefaultApi* | [**servicesCertificateCertIdGet**](OASDefaultApi.md#servicesCertificateCertIdGet) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate
*OASDefaultApi* | [**servicesConfigurationModeActionsDisablePost**](OASDefaultApi.md#servicesConfigurationModeActionsDisablePost) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode
*OASDefaultApi* | [**servicesConfigurationModeActionsEnablePost**](OASDefaultApi.md#servicesConfigurationModeActionsEnablePost) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode
*OASDefaultApi* | [**servicesDirectdataFilesGet**](OASDefaultApi.md#servicesDirectdataFilesGet) | **GET** /services/directdata/files | Retrieve Available Direct Data Files
*OASDefaultApi* | [**servicesDirectdataFilesNameGet**](OASDefaultApi.md#servicesDirectdataFilesNameGet) | **GET** /services/directdata/files/{name} | Download Direct Data File
*OASDefaultApi* | [**servicesFileStagingItemsContentItemGet**](OASDefaultApi.md#servicesFileStagingItemsContentItemGet) | **GET** /services/file_staging/items/content/{item} | Download Item Content
*OASDefaultApi* | [**servicesFileStagingItemsItemDelete**](OASDefaultApi.md#servicesFileStagingItemsItemDelete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder
*OASDefaultApi* | [**servicesFileStagingItemsItemGet**](OASDefaultApi.md#servicesFileStagingItemsItemGet) | **GET** /services/file_staging/items/{item} | List Items at a Path
*OASDefaultApi* | [**servicesFileStagingItemsItemPut**](OASDefaultApi.md#servicesFileStagingItemsItemPut) | **PUT** /services/file_staging/items/{item} | Update Folder or File
*OASDefaultApi* | [**servicesFileStagingItemsPost**](OASDefaultApi.md#servicesFileStagingItemsPost) | **POST** /services/file_staging/items | Create Folder or File
*OASDefaultApi* | [**servicesFileStagingUploadGet**](OASDefaultApi.md#servicesFileStagingUploadGet) | **GET** /services/file_staging/upload/ | List Upload Sessions
*OASDefaultApi* | [**servicesFileStagingUploadPost**](OASDefaultApi.md#servicesFileStagingUploadPost) | **POST** /services/file_staging/upload | Create Resumable Upload Session
*OASDefaultApi* | [**servicesFileStagingUploadUploadSessionIdDelete**](OASDefaultApi.md#servicesFileStagingUploadUploadSessionIdDelete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session
*OASDefaultApi* | [**servicesFileStagingUploadUploadSessionIdGet**](OASDefaultApi.md#servicesFileStagingUploadUploadSessionIdGet) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details
*OASDefaultApi* | [**servicesFileStagingUploadUploadSessionIdPartsGet**](OASDefaultApi.md#servicesFileStagingUploadUploadSessionIdPartsGet) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session
*OASDefaultApi* | [**servicesFileStagingUploadUploadSessionIdPost**](OASDefaultApi.md#servicesFileStagingUploadUploadSessionIdPost) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session
*OASDefaultApi* | [**servicesFileStagingUploadUploadSessionIdPut**](OASDefaultApi.md#servicesFileStagingUploadUploadSessionIdPut) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session
*OASDefaultApi* | [**servicesJobsHistoriesGet**](OASDefaultApi.md#servicesJobsHistoriesGet) | **GET** /services/jobs/histories | Retrieve Job Histories
*OASDefaultApi* | [**servicesJobsJobIdErrorsGet**](OASDefaultApi.md#servicesJobsJobIdErrorsGet) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors
*OASDefaultApi* | [**servicesJobsJobIdGet**](OASDefaultApi.md#servicesJobsJobIdGet) | **GET** /services/jobs/{job_id} | Retrieve Job Status
*OASDefaultApi* | [**servicesJobsJobIdSummaryGet**](OASDefaultApi.md#servicesJobsJobIdSummaryGet) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary
*OASDefaultApi* | [**servicesJobsJobIdTasksGet**](OASDefaultApi.md#servicesJobsJobIdTasksGet) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks
*OASDefaultApi* | [**servicesJobsMonitorsGet**](OASDefaultApi.md#servicesJobsMonitorsGet) | **GET** /services/jobs/monitors | Retrieve Job Monitors
*OASDefaultApi* | [**servicesJobsStartNowJobIdPost**](OASDefaultApi.md#servicesJobsStartNowJobIdPost) | **POST** /services/jobs/start_now/{job_id} | Start Job
*OASDefaultApi* | [**servicesLoaderExtractPost**](OASDefaultApi.md#servicesLoaderExtractPost) | **POST** /services/loader/extract | Extract Data Files
*OASDefaultApi* | [**servicesLoaderJobIdTasksTaskIdFailurelogGet**](OASDefaultApi.md#servicesLoaderJobIdTasksTaskIdFailurelogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results
*OASDefaultApi* | [**servicesLoaderJobIdTasksTaskIdResultsGet**](OASDefaultApi.md#servicesLoaderJobIdTasksTaskIdResultsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results
*OASDefaultApi* | [**servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**](OASDefaultApi.md#servicesLoaderJobIdTasksTaskIdResultsRenditionsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results
*OASDefaultApi* | [**servicesLoaderJobIdTasksTaskIdSuccesslogGet**](OASDefaultApi.md#servicesLoaderJobIdTasksTaskIdSuccesslogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results
*OASDefaultApi* | [**servicesLoaderLoadPost**](OASDefaultApi.md#servicesLoaderLoadPost) | **POST** /services/loader/load | Load Data Objects
*OASDefaultApi* | [**servicesPackageActionsValidatePost**](OASDefaultApi.md#servicesPackageActionsValidatePost) | **POST** /services/package/actions/validate | Validate Package
*OASDefaultApi* | [**servicesPackagePost**](OASDefaultApi.md#servicesPackagePost) | **POST** /services/package | Export Package
*OASDefaultApi* | [**servicesPackagePut**](OASDefaultApi.md#servicesPackagePut) | **PUT** /services/package | Import Package
*OASDefaultApi* | [**servicesQueuesGet**](OASDefaultApi.md#servicesQueuesGet) | **GET** /services/queues | Retrieve All Queues
*OASDefaultApi* | [**servicesQueuesQueueNameActionsDisableDeliveryPut**](OASDefaultApi.md#servicesQueuesQueueNameActionsDisableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery
*OASDefaultApi* | [**servicesQueuesQueueNameActionsEnableDeliveryPut**](OASDefaultApi.md#servicesQueuesQueueNameActionsEnableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery
*OASDefaultApi* | [**servicesQueuesQueueNameActionsResetPut**](OASDefaultApi.md#servicesQueuesQueueNameActionsResetPut) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue
*OASDefaultApi* | [**servicesQueuesQueueNameGet**](OASDefaultApi.md#servicesQueuesQueueNameGet) | **GET** /services/queues/{queue_name} | Retrieve Queue Status
*OASDefaultApi* | [**servicesVobjectVaultPackageVPackageIdActionsValidatePost**](OASDefaultApi.md#servicesVobjectVaultPackageVPackageIdActionsValidatePost) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package
*OASDefaultApi* | [**sessionDelete**](OASDefaultApi.md#sessionDelete) | **DELETE** /session | End Session
*OASDefaultApi* | [**uicodeDistributionsDistributionNameCodeGet**](OASDefaultApi.md#uicodeDistributionsDistributionNameCodeGet) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution
*OASDefaultApi* | [**uicodeDistributionsDistributionNameDelete**](OASDefaultApi.md#uicodeDistributionsDistributionNameDelete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution
*OASDefaultApi* | [**uicodeDistributionsDistributionNameGet**](OASDefaultApi.md#uicodeDistributionsDistributionNameGet) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata
*OASDefaultApi* | [**uicodeDistributionsGet**](OASDefaultApi.md#uicodeDistributionsGet) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata
*OASDefaultApi* | [**uicodeDistributionsPost**](OASDefaultApi.md#uicodeDistributionsPost) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution
*OASDefaultApi* | [**vobjectVaultPackageVPackageIdActionsDeployPost**](OASDefaultApi.md#vobjectVaultPackageVPackageIdActionsDeployPost) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package
*OASDefaultApi* | [**vobjectVaultPackageVPackageIdActionsDeployResultsGet**](OASDefaultApi.md#vobjectVaultPackageVPackageIdActionsDeployResultsGet) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results
*OASDefaultApi* | [**vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**](OASDefaultApi.md#vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job
*OASDefaultApi* | [**vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**](OASDefaultApi.md#vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job
*OASDefaultApi* | [**vobjectsEdlItemVActionsCreateplaceholderPost**](OASDefaultApi.md#vobjectsEdlItemVActionsCreateplaceholderPost) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item
*OASDefaultApi* | [**vobjectsMergesJobIdLogGet**](OASDefaultApi.md#vobjectsMergesJobIdLogGet) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log
*OASDefaultApi* | [**vobjectsMergesJobIdResultsGet**](OASDefaultApi.md#vobjectsMergesJobIdResultsGet) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results
*OASDefaultApi* | [**vobjectsMergesJobIdStatusGet**](OASDefaultApi.md#vobjectsMergesJobIdStatusGet) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status
*OASDefaultApi* | [**vobjectsObjectNameActionsActionNamePost**](OASDefaultApi.md#vobjectsObjectNameActionsActionNamePost) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records
*OASDefaultApi* | [**vobjectsObjectNameActionsChangetypePost**](OASDefaultApi.md#vobjectsObjectNameActionsChangetypePost) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type
*OASDefaultApi* | [**vobjectsObjectNameActionsMergePost**](OASDefaultApi.md#vobjectsObjectNameActionsMergePost) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge
*OASDefaultApi* | [**vobjectsObjectNameActionsRecalculaterollupsGet**](OASDefaultApi.md#vobjectsObjectNameActionsRecalculaterollupsGet) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status
*OASDefaultApi* | [**vobjectsObjectNameActionsRecalculaterollupsPost**](OASDefaultApi.md#vobjectsObjectNameActionsRecalculaterollupsPost) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields
*OASDefaultApi* | [**vobjectsObjectNameActionsUpdatecorporatecurrencyPut**](OASDefaultApi.md#vobjectsObjectNameActionsUpdatecorporatecurrencyPut) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields
*OASDefaultApi* | [**vobjectsObjectNameAttachmentsBatchDelete**](OASDefaultApi.md#vobjectsObjectNameAttachmentsBatchDelete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments
*OASDefaultApi* | [**vobjectsObjectNameAttachmentsBatchPost**](OASDefaultApi.md#vobjectsObjectNameAttachmentsBatchPost) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments
*OASDefaultApi* | [**vobjectsObjectNameAttachmentsBatchPut**](OASDefaultApi.md#vobjectsObjectNameAttachmentsBatchPut) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions
*OASDefaultApi* | [**vobjectsObjectNameDelete**](OASDefaultApi.md#vobjectsObjectNameDelete) | **DELETE** /vobjects/{object_name} | Delete Object Records
*OASDefaultApi* | [**vobjectsObjectNameIdRolesRoleNameGet**](OASDefaultApi.md#vobjectsObjectNameIdRolesRoleNameGet) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsActionNameGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdActionsActionNameGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsActionNamePost**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdActionsActionNamePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdActionsCascadedeletePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdActionsDeepcopyPost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdActionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsFileGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsPost**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdAudittrailGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdAudittrailGet) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record
*OASDefaultApi* | [**vobjectsObjectNameObjectRecordIdGet**](OASDefaultApi.md#vobjectsObjectNameObjectRecordIdGet) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record
*OASDefaultApi* | [**vobjectsObjectNamePost**](OASDefaultApi.md#vobjectsObjectNamePost) | **POST** /vobjects/{object_name} | Create &amp; Upsert Object Records
*OASDefaultApi* | [**vobjectsObjectNamePut**](OASDefaultApi.md#vobjectsObjectNamePut) | **PUT** /vobjects/{object_name} | Update Object Records
*OASDefaultApi* | [**vobjectsObjectNameRolesDelete**](OASDefaultApi.md#vobjectsObjectNameRolesDelete) | **DELETE** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records
*OASDefaultApi* | [**vobjectsObjectNameRolesPost**](OASDefaultApi.md#vobjectsObjectNameRolesPost) | **POST** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records
*OASDefaultApi* | [**vobjectsOutboundPackageVPackageIdDependenciesGet**](OASDefaultApi.md#vobjectsOutboundPackageVPackageIdDependenciesGet) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies


## Documentation for Models

 - [OASVobjectsObjectNameActionsMergePos](OASVobjectsObjectNameActionsMergePos.md)


## Documentation for Authorization

Endpoints do not require authorization.


## Author



