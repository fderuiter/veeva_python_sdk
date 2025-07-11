# Veeva Vault API v25.1 - Jetbrains API Client

## General API description

The latest GA version of the Vault REST API.

* API basepath : [http://}/api/v25.1](http://}/api/v25.1)
* Version : 1.0.0

## Documentation for API Endpoints

All URIs are relative to *http://}/api/v25.1*, but will link to the `.http` file that contains the endpoint definition.
There may be multiple requests for a single endpoint, one for each example described in the OpenAPI specification.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**apiGet**](Apis/DefaultApi.http#apiget) | **GET** /api/ | Retrieve API Versions
*DefaultApi* | [**apiMdlComponentsComponentTypeAndRecordNameFilesGet**](Apis/DefaultApi.http#apimdlcomponentscomponenttypeandrecordnamefilesget) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File
*DefaultApi* | [**apiMdlComponentsComponentTypeAndRecordNameGet**](Apis/DefaultApi.http#apimdlcomponentscomponenttypeandrecordnameget) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL)
*DefaultApi* | [**apiMdlExecuteAsyncJobIdResultsGet**](Apis/DefaultApi.http#apimdlexecuteasyncjobidresultsget) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results
*DefaultApi* | [**apiMdlExecuteAsyncPost**](Apis/DefaultApi.http#apimdlexecuteasyncpost) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously
*DefaultApi* | [**apiMdlExecutePost**](Apis/DefaultApi.http#apimdlexecutepost) | **POST** /api/mdl/execute | Execute MDL Script
*DefaultApi* | [**apiMdlFilesPost**](Apis/DefaultApi.http#apimdlfilespost) | **POST** /api/mdl/files | Upload Content File
*DefaultApi* | [**audittrailAuditTrailTypeGet**](Apis/DefaultApi.http#audittrailaudittrailtypeget) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details
*DefaultApi* | [**authDiscoveryPost**](Apis/DefaultApi.http#authdiscoverypost) | **POST** /auth/discovery | Authentication Type Discovery
*DefaultApi* | [**authOauthSessionOathOidcProfileIdPost**](Apis/DefaultApi.http#authoauthsessionoathoidcprofileidpost) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect
*DefaultApi* | [**authPost**](Apis/DefaultApi.http#authpost) | **POST** /auth | User Name and Password
*DefaultApi* | [**codeClassNameDelete**](Apis/DefaultApi.http#codeclassnamedelete) | **DELETE** /code/{class_name} | Delete Single Source Code File
*DefaultApi* | [**codeClassNameDisablePut**](Apis/DefaultApi.http#codeclassnamedisableput) | **PUT** /code/{class_name}/disable | Disable Vault Extension
*DefaultApi* | [**codeClassNameEnablePut**](Apis/DefaultApi.http#codeclassnameenableput) | **PUT** /code/{class_name}/enable | Enable Vault Extension
*DefaultApi* | [**codeClassNameGet**](Apis/DefaultApi.http#codeclassnameget) | **GET** /code/{class_name} | Retrieve Single Source Code File
*DefaultApi* | [**codeProfilerGet**](Apis/DefaultApi.http#codeprofilerget) | **GET** /code/profiler | Retrieve All Profiling Sessions
*DefaultApi* | [**codeProfilerPost**](Apis/DefaultApi.http#codeprofilerpost) | **POST** /code/profiler | Create Profiling Session
*DefaultApi* | [**codeProfilerSessionNameActionsEndPost**](Apis/DefaultApi.http#codeprofilersessionnameactionsendpost) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session
*DefaultApi* | [**codeProfilerSessionNameDelete**](Apis/DefaultApi.http#codeprofilersessionnamedelete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session
*DefaultApi* | [**codeProfilerSessionNameGet**](Apis/DefaultApi.http#codeprofilersessionnameget) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session
*DefaultApi* | [**codeProfilerSessionNameResultsGet**](Apis/DefaultApi.http#codeprofilersessionnameresultsget) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results
*DefaultApi* | [**codePut**](Apis/DefaultApi.http#codeput) | **PUT** /code | Add or Replace Single Source Code File
*DefaultApi* | [**compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**](Apis/DefaultApi.http#compositestreesedlhierarchyortemplateactionslistnodespost) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes
*DefaultApi* | [**compositesTreesEdlHierarchyOrTemplateGet**](Apis/DefaultApi.http#compositestreesedlhierarchyortemplateget) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes
*DefaultApi* | [**compositesTreesEdlHierarchyVParentNodeIdChildrenGet**](Apis/DefaultApi.http#compositestreesedlhierarchyvparentnodeidchildrenget) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node's Children
*DefaultApi* | [**compositesTreesEdlHierarchyVParentNodeIdChildrenPut**](Apis/DefaultApi.http#compositestreesedlhierarchyvparentnodeidchildrenput) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
*DefaultApi* | [**configurationComponentTypeAndRecordNameGet**](Apis/DefaultApi.http#configurationcomponenttypeandrecordnameget) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
*DefaultApi* | [**configurationComponentTypeGet**](Apis/DefaultApi.http#configurationcomponenttypeget) | **GET** /configuration/{component_type} | Retrieve Component Record Collection
*DefaultApi* | [**configurationObjectNameAndObjectTypeGet**](Apis/DefaultApi.http#configurationobjectnameandobjecttypeget) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
*DefaultApi* | [**configurationObjecttypeGet**](Apis/DefaultApi.http#configurationobjecttypeget) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types
*DefaultApi* | [**configurationRoleAssignmentRuleDelete**](Apis/DefaultApi.http#configurationroleassignmentruledelete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
*DefaultApi* | [**configurationRoleAssignmentRuleGet**](Apis/DefaultApi.http#configurationroleassignmentruleget) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default & Override)
*DefaultApi* | [**configurationRoleAssignmentRulePost**](Apis/DefaultApi.http#configurationroleassignmentrulepost) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
*DefaultApi* | [**configurationRoleAssignmentRulePut**](Apis/DefaultApi.http#configurationroleassignmentruleput) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default & Override)
*DefaultApi* | [**delegationLoginPost**](Apis/DefaultApi.http#delegationloginpost) | **POST** /delegation/login | Initiate Delegated Session
*DefaultApi* | [**delegationVaultsGet**](Apis/DefaultApi.http#delegationvaultsget) | **GET** /delegation/vaults | Retrieve Delegations
*DefaultApi* | [**keepAlivePost**](Apis/DefaultApi.http#keepalivepost) | **POST** /keep-alive | Session Keep Alive
*DefaultApi* | [**limitsGet**](Apis/DefaultApi.http#limitsget) | **GET** /limits | Retrieve Limits on Objects
*DefaultApi* | [**logsApiUsageGet**](Apis/DefaultApi.http#logsapiusageget) | **GET** /logs/api_usage | Download Daily API Usage
*DefaultApi* | [**logsCodeDebugGet**](Apis/DefaultApi.http#logscodedebugget) | **GET** /logs/code/debug | Retrieve All Debug Logs
*DefaultApi* | [**logsCodeDebugIdActionsResetDelete**](Apis/DefaultApi.http#logscodedebugidactionsresetdelete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log
*DefaultApi* | [**logsCodeDebugIdActionsResetPost**](Apis/DefaultApi.http#logscodedebugidactionsresetpost) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log
*DefaultApi* | [**logsCodeDebugIdFilesGet**](Apis/DefaultApi.http#logscodedebugidfilesget) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files
*DefaultApi* | [**logsCodeDebugIdGet**](Apis/DefaultApi.http#logscodedebugidget) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log
*DefaultApi* | [**logsCodeDebugPost**](Apis/DefaultApi.http#logscodedebugpost) | **POST** /logs/code/debug | Create Debug Log
*DefaultApi* | [**logsCodeRuntimeGet**](Apis/DefaultApi.http#logscoderuntimeget) | **GET** /logs/code/runtime | Download SDK Runtime Log
*DefaultApi* | [**messagesMessageTypeActionsImportPost**](Apis/DefaultApi.http#messagesmessagetypeactionsimportpost) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File
*DefaultApi* | [**messagesMessageTypeLanguageLangActionsExportPost**](Apis/DefaultApi.http#messagesmessagetypelanguagelangactionsexportpost) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File
*DefaultApi* | [**metadataAudittrailAuditTrailTypeGet**](Apis/DefaultApi.http#metadataaudittrailaudittrailtypeget) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata
*DefaultApi* | [**metadataAudittrailGet**](Apis/DefaultApi.http#metadataaudittrailget) | **GET** /metadata/audittrail | Retrieve Audit Types
*DefaultApi* | [**metadataComponentsComponentTypeGet**](Apis/DefaultApi.http#metadatacomponentscomponenttypeget) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata
*DefaultApi* | [**metadataComponentsGet**](Apis/DefaultApi.http#metadatacomponentsget) | **GET** /metadata/components | Retrieve All Component Metadata
*DefaultApi* | [**metadataObjectsBindersTemplatesBindernodesGet**](Apis/DefaultApi.http#metadataobjectsbinderstemplatesbindernodesget) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata
*DefaultApi* | [**metadataObjectsBindersTemplatesGet**](Apis/DefaultApi.http#metadataobjectsbinderstemplatesget) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata
*DefaultApi* | [**metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**](Apis/DefaultApi.http#metadataobjectsdocumentsannotationsplacemarkstypesplacemarktypeget) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata
*DefaultApi* | [**metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**](Apis/DefaultApi.http#metadataobjectsdocumentsannotationsreferencestypesreferencetypeget) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata
*DefaultApi* | [**metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**](Apis/DefaultApi.http#metadataobjectsdocumentsannotationstypesannotationtypeget) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata
*DefaultApi* | [**metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**](Apis/DefaultApi.http#metadataobjectsdocumentseventseventtypetypeseventsubtypeget) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata
*DefaultApi* | [**metadataObjectsDocumentsEventsGet**](Apis/DefaultApi.http#metadataobjectsdocumentseventsget) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes
*DefaultApi* | [**metadataObjectsDocumentsLockGet**](Apis/DefaultApi.http#metadataobjectsdocumentslockget) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata
*DefaultApi* | [**metadataObjectsDocumentsPropertiesFindCommonPost**](Apis/DefaultApi.http#metadataobjectsdocumentspropertiesfindcommonpost) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields
*DefaultApi* | [**metadataObjectsDocumentsPropertiesGet**](Apis/DefaultApi.http#metadataobjectsdocumentspropertiesget) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields
*DefaultApi* | [**metadataObjectsDocumentsTemplatesGet**](Apis/DefaultApi.http#metadataobjectsdocumentstemplatesget) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata
*DefaultApi* | [**metadataObjectsDocumentsTypesGet**](Apis/DefaultApi.http#metadataobjectsdocumentstypesget) | **GET** /metadata/objects/documents/types | Retrieve All Document Types
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeGet**](Apis/DefaultApi.http#metadataobjectsdocumentstypestypeget) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeRelationshipsGet**](Apis/DefaultApi.http#metadataobjectsdocumentstypestyperelationshipsget) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**](Apis/DefaultApi.http#metadataobjectsdocumentstypestypesubtypessubtypeclassificationsclassificationget) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification
*DefaultApi* | [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**](Apis/DefaultApi.http#metadataobjectsdocumentstypestypesubtypessubtypeget) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype
*DefaultApi* | [**metadataObjectsGroupsGet**](Apis/DefaultApi.http#metadataobjectsgroupsget) | **GET** /metadata/objects/groups | Retrieve Group Metadata
*DefaultApi* | [**metadataObjectsSecuritypoliciesGet**](Apis/DefaultApi.http#metadataobjectssecuritypoliciesget) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata
*DefaultApi* | [**metadataObjectsUsersGet**](Apis/DefaultApi.http#metadataobjectsusersget) | **GET** /metadata/objects/users | Retrieve User Metadata
*DefaultApi* | [**metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**](Apis/DefaultApi.http#metadataqueryarchiveddocumentsrelationshipsdocumentsignaturesysrget) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata
*DefaultApi* | [**metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**](Apis/DefaultApi.http#metadataquerydocumentsrelationshipsdocumentsignaturesysrget) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata
*DefaultApi* | [**metadataVobjectsGet**](Apis/DefaultApi.http#metadatavobjectsget) | **GET** /metadata/vobjects | Retrieve Object Collection
*DefaultApi* | [**metadataVobjectsObjectNameActionsCanceldeploymentPost**](Apis/DefaultApi.http#metadatavobjectsobjectnameactionscanceldeploymentpost) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment
*DefaultApi* | [**metadataVobjectsObjectNameFieldsObjectFieldNameGet**](Apis/DefaultApi.http#metadatavobjectsobjectnamefieldsobjectfieldnameget) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata
*DefaultApi* | [**metadataVobjectsObjectNameGet**](Apis/DefaultApi.http#metadatavobjectsobjectnameget) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata
*DefaultApi* | [**metadataVobjectsObjectNamePageLayoutsGet**](Apis/DefaultApi.http#metadatavobjectsobjectnamepagelayoutsget) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts
*DefaultApi* | [**metadataVobjectsObjectNamePageLayoutsLayoutNameGet**](Apis/DefaultApi.http#metadatavobjectsobjectnamepagelayoutslayoutnameget) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata
*DefaultApi* | [**notificationsHistoriesGet**](Apis/DefaultApi.http#notificationshistoriesget) | **GET** /notifications/histories | Retrieve Email Notification Histories
*DefaultApi* | [**objectWorkflowActionsActionGet**](Apis/DefaultApi.http#objectworkflowactionsactionget) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details
*DefaultApi* | [**objectWorkflowActionsActionPost**](Apis/DefaultApi.http#objectworkflowactionsactionpost) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows
*DefaultApi* | [**objectWorkflowActionsCanceltasksPost**](Apis/DefaultApi.http#objectworkflowactionscanceltaskspost) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks
*DefaultApi* | [**objectWorkflowActionsCancelworkflowsPost**](Apis/DefaultApi.http#objectworkflowactionscancelworkflowspost) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows
*DefaultApi* | [**objectWorkflowActionsGet**](Apis/DefaultApi.http#objectworkflowactionsget) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions
*DefaultApi* | [**objectWorkflowActionsReassigntasksPost**](Apis/DefaultApi.http#objectworkflowactionsreassigntaskspost) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks
*DefaultApi* | [**objectWorkflowActionsReplaceworkflowownerPost**](Apis/DefaultApi.http#objectworkflowactionsreplaceworkflowownerpost) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner
*DefaultApi* | [**objectsBindersActionsExportJobIdResultsGet**](Apis/DefaultApi.http#objectsbindersactionsexportjobidresultsget) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results
*DefaultApi* | [**objectsBindersBinderIdActionsExportPost**](Apis/DefaultApi.http#objectsbindersbinderidactionsexportpost) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version)
*DefaultApi* | [**objectsBindersBinderIdActionsPost**](Apis/DefaultApi.http#objectsbindersbinderidactionspost) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing
*DefaultApi* | [**objectsBindersBinderIdBindingRulePut**](Apis/DefaultApi.http#objectsbindersbinderidbindingruleput) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule
*DefaultApi* | [**objectsBindersBinderIdDelete**](Apis/DefaultApi.http#objectsbindersbinderiddelete) | **DELETE** /objects/binders/{binder_id} | Delete Binder
*DefaultApi* | [**objectsBindersBinderIdDocumentsNodeIdBindingRulePut**](Apis/DefaultApi.http#objectsbindersbinderiddocumentsnodeidbindingruleput) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule
*DefaultApi* | [**objectsBindersBinderIdDocumentsPost**](Apis/DefaultApi.http#objectsbindersbinderiddocumentspost) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder
*DefaultApi* | [**objectsBindersBinderIdDocumentsSectionIdDelete**](Apis/DefaultApi.http#objectsbindersbinderiddocumentssectioniddelete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder
*DefaultApi* | [**objectsBindersBinderIdDocumentsSectionIdPut**](Apis/DefaultApi.http#objectsbindersbinderiddocumentssectionidput) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder
*DefaultApi* | [**objectsBindersBinderIdGet**](Apis/DefaultApi.http#objectsbindersbinderidget) | **GET** /objects/binders/{binder_id} | Retrieve Binder
*DefaultApi* | [**objectsBindersBinderIdPost**](Apis/DefaultApi.http#objectsbindersbinderidpost) | **POST** /objects/binders/{binder_id} | Create Binder Version
*DefaultApi* | [**objectsBindersBinderIdPut**](Apis/DefaultApi.http#objectsbindersbinderidput) | **PUT** /objects/binders/{binder_id} | Update Binder
*DefaultApi* | [**objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**](Apis/DefaultApi.http#objectsbindersbinderidrolesrolenameanduserorgroupiddelete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Binder
*DefaultApi* | [**objectsBindersBinderIdSectionsNodeIdBindingRulePut**](Apis/DefaultApi.http#objectsbindersbinderidsectionsnodeidbindingruleput) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule
*DefaultApi* | [**objectsBindersBinderIdSectionsNodeIdPut**](Apis/DefaultApi.http#objectsbindersbinderidsectionsnodeidput) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section
*DefaultApi* | [**objectsBindersBinderIdSectionsPost**](Apis/DefaultApi.http#objectsbindersbinderidsectionspost) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section
*DefaultApi* | [**objectsBindersBinderIdSectionsSectionIdDelete**](Apis/DefaultApi.http#objectsbindersbinderidsectionssectioniddelete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section
*DefaultApi* | [**objectsBindersBinderIdSectionsSectionIdGet**](Apis/DefaultApi.http#objectsbindersbinderidsectionssectionidget) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections
*DefaultApi* | [**objectsBindersBinderIdVersionsGet**](Apis/DefaultApi.http#objectsbindersbinderidversionsget) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversionactionsexportpost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version)
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversiondelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversionget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversionput) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversionrelationshipspost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipiddelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipidget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship
*DefaultApi* | [**objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**](Apis/DefaultApi.http#objectsbindersbinderidversionsmajorversionminorversionsectionssectionidget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section
*DefaultApi* | [**objectsBindersIdRolesGet**](Apis/DefaultApi.http#objectsbindersidrolesget) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles
*DefaultApi* | [**objectsBindersIdRolesPost**](Apis/DefaultApi.http#objectsbindersidrolespost) | **POST** /objects/binders/{id}/roles | Assign Users & Groups to Roles on a Single Binder
*DefaultApi* | [**objectsBindersIdRolesRoleNameGet**](Apis/DefaultApi.http#objectsbindersidrolesrolenameget) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role
*DefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](Apis/DefaultApi.http#objectsbindersidversionsmajorversionminorversionlifecycleactionsget) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions
*DefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](Apis/DefaultApi.http#objectsbindersidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria
*DefaultApi* | [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](Apis/DefaultApi.http#objectsbindersidversionsmajorversionminorversionlifecycleactionsnamevput) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action
*DefaultApi* | [**objectsBindersLifecycleActionsPost**](Apis/DefaultApi.http#objectsbinderslifecycleactionspost) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders
*DefaultApi* | [**objectsBindersLifecycleActionsUserActionNamePut**](Apis/DefaultApi.http#objectsbinderslifecycleactionsuseractionnameput) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions
*DefaultApi* | [**objectsBindersPost**](Apis/DefaultApi.http#objectsbinderspost) | **POST** /objects/binders | Create Binder
*DefaultApi* | [**objectsBindersTemplatesGet**](Apis/DefaultApi.http#objectsbinderstemplatesget) | **GET** /objects/binders/templates | Retrieve Binder Template Collection
*DefaultApi* | [**objectsBindersTemplatesPost**](Apis/DefaultApi.http#objectsbinderstemplatespost) | **POST** /objects/binders/templates | Create Binder Template
*DefaultApi* | [**objectsBindersTemplatesPut**](Apis/DefaultApi.http#objectsbinderstemplatesput) | **PUT** /objects/binders/templates | Update Binder Template
*DefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesGet**](Apis/DefaultApi.http#objectsbinderstemplatestemplatenamebindernodesget) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes
*DefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesPost**](Apis/DefaultApi.http#objectsbinderstemplatestemplatenamebindernodespost) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node
*DefaultApi* | [**objectsBindersTemplatesTemplateNameBindernodesPut**](Apis/DefaultApi.http#objectsbinderstemplatestemplatenamebindernodesput) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes
*DefaultApi* | [**objectsBindersTemplatesTemplateNameDelete**](Apis/DefaultApi.http#objectsbinderstemplatestemplatenamedelete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template
*DefaultApi* | [**objectsBindersTemplatesTemplateNameGet**](Apis/DefaultApi.http#objectsbinderstemplatestemplatenameget) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes
*DefaultApi* | [**objectsDeletionsDocumentsGet**](Apis/DefaultApi.http#objectsdeletionsdocumentsget) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs
*DefaultApi* | [**objectsDeletionsVobjectsObjectNameGet**](Apis/DefaultApi.http#objectsdeletionsvobjectsobjectnameget) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID
*DefaultApi* | [**objectsDocumentsActionsGet**](Apis/DefaultApi.http#objectsdocumentsactionsget) | **GET** /objects/documents/actions | Retrieve All Document Workflows
*DefaultApi* | [**objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**](Apis/DefaultApi.http#objectsdocumentsactionslifecycleandstateandactionjobidresultsget) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results
*DefaultApi* | [**objectsDocumentsActionsWorkflowNameGet**](Apis/DefaultApi.http#objectsdocumentsactionsworkflownameget) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details
*DefaultApi* | [**objectsDocumentsActionsWorkflowNamePost**](Apis/DefaultApi.http#objectsdocumentsactionsworkflownamepost) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow
*DefaultApi* | [**objectsDocumentsAnnotationsBatchDelete**](Apis/DefaultApi.http#objectsdocumentsannotationsbatchdelete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations
*DefaultApi* | [**objectsDocumentsAnnotationsBatchPost**](Apis/DefaultApi.http#objectsdocumentsannotationsbatchpost) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations
*DefaultApi* | [**objectsDocumentsAnnotationsBatchPut**](Apis/DefaultApi.http#objectsdocumentsannotationsbatchput) | **PUT** /objects/documents/annotations/batch | Update Annotations
*DefaultApi* | [**objectsDocumentsAnnotationsRepliesBatchPost**](Apis/DefaultApi.http#objectsdocumentsannotationsrepliesbatchpost) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies
*DefaultApi* | [**objectsDocumentsAttachmentsBatchDelete**](Apis/DefaultApi.http#objectsdocumentsattachmentsbatchdelete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments
*DefaultApi* | [**objectsDocumentsAttachmentsBatchPost**](Apis/DefaultApi.http#objectsdocumentsattachmentsbatchpost) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments
*DefaultApi* | [**objectsDocumentsAttachmentsBatchPut**](Apis/DefaultApi.http#objectsdocumentsattachmentsbatchput) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions
*DefaultApi* | [**objectsDocumentsBatchActionsFileextractJobIdResultsGet**](Apis/DefaultApi.http#objectsdocumentsbatchactionsfileextractjobidresultsget) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results
*DefaultApi* | [**objectsDocumentsBatchActionsFileextractPost**](Apis/DefaultApi.http#objectsdocumentsbatchactionsfileextractpost) | **POST** /objects/documents/batch/actions/fileextract | Export Documents
*DefaultApi* | [**objectsDocumentsBatchActionsReclassifyPut**](Apis/DefaultApi.http#objectsdocumentsbatchactionsreclassifyput) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents
*DefaultApi* | [**objectsDocumentsBatchActionsRerenderPost**](Apis/DefaultApi.http#objectsdocumentsbatchactionsrerenderpost) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions
*DefaultApi* | [**objectsDocumentsBatchDelete**](Apis/DefaultApi.http#objectsdocumentsbatchdelete) | **DELETE** /objects/documents/batch | Delete Multiple Documents
*DefaultApi* | [**objectsDocumentsBatchLockDelete**](Apis/DefaultApi.http#objectsdocumentsbatchlockdelete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout
*DefaultApi* | [**objectsDocumentsBatchPost**](Apis/DefaultApi.http#objectsdocumentsbatchpost) | **POST** /objects/documents/batch | Create Multiple Documents
*DefaultApi* | [**objectsDocumentsBatchPut**](Apis/DefaultApi.http#objectsdocumentsbatchput) | **PUT** /objects/documents/batch | Update Multiple Documents
*DefaultApi* | [**objectsDocumentsDocIdAnchorsGet**](Apis/DefaultApi.http#objectsdocumentsdocidanchorsget) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs
*DefaultApi* | [**objectsDocumentsDocIdAnnotationsFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidannotationsfileget) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF
*DefaultApi* | [**objectsDocumentsDocIdAnnotationsFilePost**](Apis/DefaultApi.http#objectsdocumentsdocidannotationsfilepost) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdDelete**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentiddelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidfileget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdGet**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdPut**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidput) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversiondelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionfileget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionpost) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsattachmentidversionsget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsfileget) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsGet**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentsget) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments
*DefaultApi* | [**objectsDocumentsDocIdAttachmentsPost**](Apis/DefaultApi.http#objectsdocumentsdocidattachmentspost) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment
*DefaultApi* | [**objectsDocumentsDocIdAudittrailGet**](Apis/DefaultApi.http#objectsdocumentsdocidaudittrailget) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document
*DefaultApi* | [**objectsDocumentsDocIdDelete**](Apis/DefaultApi.http#objectsdocumentsdociddelete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document
*DefaultApi* | [**objectsDocumentsDocIdEventsGet**](Apis/DefaultApi.http#objectsdocumentsdocideventsget) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events
*DefaultApi* | [**objectsDocumentsDocIdFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidfileget) | **GET** /objects/documents/{doc_id}/file | Download Document File
*DefaultApi* | [**objectsDocumentsDocIdGet**](Apis/DefaultApi.http#objectsdocumentsdocidget) | **GET** /objects/documents/{doc_id} | Retrieve Document
*DefaultApi* | [**objectsDocumentsDocIdLockDelete**](Apis/DefaultApi.http#objectsdocumentsdocidlockdelete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock
*DefaultApi* | [**objectsDocumentsDocIdLockGet**](Apis/DefaultApi.http#objectsdocumentsdocidlockget) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock
*DefaultApi* | [**objectsDocumentsDocIdLockPost**](Apis/DefaultApi.http#objectsdocumentsdocidlockpost) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock
*DefaultApi* | [**objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidmajorversionminorversionattachmentsfileget) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments
*DefaultApi* | [**objectsDocumentsDocIdPost**](Apis/DefaultApi.http#objectsdocumentsdocidpost) | **POST** /objects/documents/{doc_id} | Create Single Document Version
*DefaultApi* | [**objectsDocumentsDocIdPut**](Apis/DefaultApi.http#objectsdocumentsdocidput) | **PUT** /objects/documents/{doc_id} | Update Single Document
*DefaultApi* | [**objectsDocumentsDocIdRenditionsGet**](Apis/DefaultApi.http#objectsdocumentsdocidrenditionsget) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypeDelete**](Apis/DefaultApi.http#objectsdocumentsdocidrenditionsrenditiontypedelete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypeGet**](Apis/DefaultApi.http#objectsdocumentsdocidrenditionsrenditiontypeget) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypePost**](Apis/DefaultApi.http#objectsdocumentsdocidrenditionsrenditiontypepost) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition
*DefaultApi* | [**objectsDocumentsDocIdRenditionsRenditionTypePut**](Apis/DefaultApi.http#objectsdocumentsdocidrenditionsrenditiontypeput) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition
*DefaultApi* | [**objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**](Apis/DefaultApi.http#objectsdocumentsdocidrolesrolenameanduserorgroupiddelete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Document
*DefaultApi* | [**objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionmajorversionminorversionattachmentsget) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments
*DefaultApi* | [**objectsDocumentsDocIdVersionsGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsget) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidrepliesget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionannotationsfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionannotationsfilepost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionannotationsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversiondelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversiondocexportannotationstocsvget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversioneventspost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionexportvideoannotationsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionput) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrelationshipspost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipiddelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipidget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrenditionsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypedelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypepost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeput) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition
*DefaultApi* | [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**](Apis/DefaultApi.http#objectsdocumentsdocidversionsmajorversionminorversionthumbnailget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File
*DefaultApi* | [**objectsDocumentsGet**](Apis/DefaultApi.http#objectsdocumentsget) | **GET** /objects/documents | Retrieve All Documents
*DefaultApi* | [**objectsDocumentsIdRolesGet**](Apis/DefaultApi.http#objectsdocumentsidrolesget) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles
*DefaultApi* | [**objectsDocumentsIdRolesPost**](Apis/DefaultApi.http#objectsdocumentsidrolespost) | **POST** /objects/documents/{id}/roles | Assign Users & Groups to Roles on a Single Document
*DefaultApi* | [**objectsDocumentsIdRolesRoleNameGet**](Apis/DefaultApi.http#objectsdocumentsidrolesrolenameget) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role
*DefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](Apis/DefaultApi.http#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsget) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions
*DefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](Apis/DefaultApi.http#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria
*DefaultApi* | [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](Apis/DefaultApi.http#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnamevput) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action
*DefaultApi* | [**objectsDocumentsLifecycleActionsPost**](Apis/DefaultApi.http#objectsdocumentslifecycleactionspost) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents
*DefaultApi* | [**objectsDocumentsLifecycleActionsUserActionNamePut**](Apis/DefaultApi.http#objectsdocumentslifecycleactionsuseractionnameput) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions
*DefaultApi* | [**objectsDocumentsPost**](Apis/DefaultApi.http#objectsdocumentspost) | **POST** /objects/documents | Create Single Document
*DefaultApi* | [**objectsDocumentsRelationshipsBatchDelete**](Apis/DefaultApi.http#objectsdocumentsrelationshipsbatchdelete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships
*DefaultApi* | [**objectsDocumentsRelationshipsBatchPost**](Apis/DefaultApi.http#objectsdocumentsrelationshipsbatchpost) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships
*DefaultApi* | [**objectsDocumentsRenditionsBatchDelete**](Apis/DefaultApi.http#objectsdocumentsrenditionsbatchdelete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions
*DefaultApi* | [**objectsDocumentsRenditionsBatchPost**](Apis/DefaultApi.http#objectsdocumentsrenditionsbatchpost) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions
*DefaultApi* | [**objectsDocumentsRolesBatchDelete**](Apis/DefaultApi.http#objectsdocumentsrolesbatchdelete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents & Binders
*DefaultApi* | [**objectsDocumentsRolesBatchPost**](Apis/DefaultApi.http#objectsdocumentsrolesbatchpost) | **POST** /objects/documents/roles/batch | Assign Users & Groups to Roles on Multiple Documents & Binders
*DefaultApi* | [**objectsDocumentsTemplatesGet**](Apis/DefaultApi.http#objectsdocumentstemplatesget) | **GET** /objects/documents/templates | Retrieve Document Template Collection
*DefaultApi* | [**objectsDocumentsTemplatesPost**](Apis/DefaultApi.http#objectsdocumentstemplatespost) | **POST** /objects/documents/templates | Create Single Document Template
*DefaultApi* | [**objectsDocumentsTemplatesPut**](Apis/DefaultApi.http#objectsdocumentstemplatesput) | **PUT** /objects/documents/templates | Update Multiple Document Templates
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNameDelete**](Apis/DefaultApi.http#objectsdocumentstemplatestemplatenamedelete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNameFileGet**](Apis/DefaultApi.http#objectsdocumentstemplatestemplatenamefileget) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNameGet**](Apis/DefaultApi.http#objectsdocumentstemplatestemplatenameget) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes
*DefaultApi* | [**objectsDocumentsTemplatesTemplateNamePut**](Apis/DefaultApi.http#objectsdocumentstemplatestemplatenameput) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template
*DefaultApi* | [**objectsDocumentsTokensPost**](Apis/DefaultApi.http#objectsdocumentstokenspost) | **POST** /objects/documents/tokens | Document Tokens
*DefaultApi* | [**objectsDocumentsVersionsBatchActionsFileextractPost**](Apis/DefaultApi.http#objectsdocumentsversionsbatchactionsfileextractpost) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions
*DefaultApi* | [**objectsDocumentsVersionsBatchDelete**](Apis/DefaultApi.http#objectsdocumentsversionsbatchdelete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions
*DefaultApi* | [**objectsDocumentsVersionsBatchPost**](Apis/DefaultApi.http#objectsdocumentsversionsbatchpost) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions
*DefaultApi* | [**objectsDomainGet**](Apis/DefaultApi.http#objectsdomainget) | **GET** /objects/domain | Retrieve Domain Information
*DefaultApi* | [**objectsDomainsGet**](Apis/DefaultApi.http#objectsdomainsget) | **GET** /objects/domains | Retrieve Domains
*DefaultApi* | [**objectsEdlMatchedDocumentsBatchActionsAddPost**](Apis/DefaultApi.http#objectsedlmatcheddocumentsbatchactionsaddpost) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents
*DefaultApi* | [**objectsEdlMatchedDocumentsBatchActionsRemovePost**](Apis/DefaultApi.http#objectsedlmatcheddocumentsbatchactionsremovepost) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents
*DefaultApi* | [**objectsGroupsAutoGet**](Apis/DefaultApi.http#objectsgroupsautoget) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups
*DefaultApi* | [**objectsGroupsGet**](Apis/DefaultApi.http#objectsgroupsget) | **GET** /objects/groups | Retrieve All Groups
*DefaultApi* | [**objectsGroupsGroupIdDelete**](Apis/DefaultApi.http#objectsgroupsgroupiddelete) | **DELETE** /objects/groups/{group_id} | Delete Group
*DefaultApi* | [**objectsGroupsGroupIdGet**](Apis/DefaultApi.http#objectsgroupsgroupidget) | **GET** /objects/groups/{group_id} | Retrieve Group
*DefaultApi* | [**objectsGroupsGroupIdPut**](Apis/DefaultApi.http#objectsgroupsgroupidput) | **PUT** /objects/groups/{group_id} | Update Group
*DefaultApi* | [**objectsGroupsPost**](Apis/DefaultApi.http#objectsgroupspost) | **POST** /objects/groups | Create Group 
*DefaultApi* | [**objectsLicensesGet**](Apis/DefaultApi.http#objectslicensesget) | **GET** /objects/licenses | Retrieve Application License Usage
*DefaultApi* | [**objectsObjectworkflowsActionsGet**](Apis/DefaultApi.http#objectsobjectworkflowsactionsget) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows
*DefaultApi* | [**objectsObjectworkflowsActionsWorkflowNameGet**](Apis/DefaultApi.http#objectsobjectworkflowsactionsworkflownameget) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details
*DefaultApi* | [**objectsObjectworkflowsActionsWorkflowNamePost**](Apis/DefaultApi.http#objectsobjectworkflowsactionsworkflownamepost) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow
*DefaultApi* | [**objectsObjectworkflowsGet**](Apis/DefaultApi.http#objectsobjectworkflowsget) | **GET** /objects/objectworkflows | Retrieve Workflows
*DefaultApi* | [**objectsObjectworkflowsTasksGet**](Apis/DefaultApi.http#objectsobjectworkflowstasksget) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsAcceptPost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsCancelPost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionscancelpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsCompletePost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionscompletepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsGet**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsget) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsmdwacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsmdwcompletepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsmdwmanagecontentpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsmdwreassignpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsReassignPost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsreassignpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionstaskactionget) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsundoacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidactionsupdateduedatepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date
*DefaultApi* | [**objectsObjectworkflowsTasksTaskIdGet**](Apis/DefaultApi.http#objectsobjectworkflowstaskstaskidget) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsGet**](Apis/DefaultApi.http#objectsobjectworkflowsworkflowidactionsget) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**](Apis/DefaultApi.http#objectsobjectworkflowsworkflowidactionsworkflowactionget) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**](Apis/DefaultApi.http#objectsobjectworkflowsworkflowidactionsworkflowactionpost) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action
*DefaultApi* | [**objectsObjectworkflowsWorkflowIdGet**](Apis/DefaultApi.http#objectsobjectworkflowsworkflowidget) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details
*DefaultApi* | [**objectsPicklistsGet**](Apis/DefaultApi.http#objectspicklistsget) | **GET** /objects/picklists | Retrieve All Picklists
*DefaultApi* | [**objectsPicklistsPicklistNameGet**](Apis/DefaultApi.http#objectspicklistspicklistnameget) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values
*DefaultApi* | [**objectsPicklistsPicklistNamePicklistValueNameDelete**](Apis/DefaultApi.http#objectspicklistspicklistnamepicklistvaluenamedelete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value
*DefaultApi* | [**objectsPicklistsPicklistNamePicklistValueNamePut**](Apis/DefaultApi.http#objectspicklistspicklistnamepicklistvaluenameput) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value
*DefaultApi* | [**objectsPicklistsPicklistNamePost**](Apis/DefaultApi.http#objectspicklistspicklistnamepost) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values
*DefaultApi* | [**objectsPicklistsPicklistNamePut**](Apis/DefaultApi.http#objectspicklistspicklistnameput) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label
*DefaultApi* | [**objectsSandboxActionsBuildproductionPost**](Apis/DefaultApi.http#objectssandboxactionsbuildproductionpost) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault
*DefaultApi* | [**objectsSandboxActionsPromoteproductionPost**](Apis/DefaultApi.http#objectssandboxactionspromoteproductionpost) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production
*DefaultApi* | [**objectsSandboxActionsRecheckusagePost**](Apis/DefaultApi.http#objectssandboxactionsrecheckusagepost) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit
*DefaultApi* | [**objectsSandboxBatchChangesizePost**](Apis/DefaultApi.http#objectssandboxbatchchangesizepost) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size
*DefaultApi* | [**objectsSandboxEntitlementsSetPost**](Apis/DefaultApi.http#objectssandboxentitlementssetpost) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements
*DefaultApi* | [**objectsSandboxGet**](Apis/DefaultApi.http#objectssandboxget) | **GET** /objects/sandbox | Retrieve Sandboxes
*DefaultApi* | [**objectsSandboxNameDelete**](Apis/DefaultApi.http#objectssandboxnamedelete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox
*DefaultApi* | [**objectsSandboxPost**](Apis/DefaultApi.http#objectssandboxpost) | **POST** /objects/sandbox | Create or Refresh Sandbox
*DefaultApi* | [**objectsSandboxSnapshotApiNameActionsUpdatePost**](Apis/DefaultApi.http#objectssandboxsnapshotapinameactionsupdatepost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot
*DefaultApi* | [**objectsSandboxSnapshotApiNameActionsUpgradePost**](Apis/DefaultApi.http#objectssandboxsnapshotapinameactionsupgradepost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot
*DefaultApi* | [**objectsSandboxSnapshotApiNameDelete**](Apis/DefaultApi.http#objectssandboxsnapshotapinamedelete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot
*DefaultApi* | [**objectsSandboxSnapshotGet**](Apis/DefaultApi.http#objectssandboxsnapshotget) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots
*DefaultApi* | [**objectsSandboxSnapshotPost**](Apis/DefaultApi.http#objectssandboxsnapshotpost) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot
*DefaultApi* | [**objectsSandboxVaultIdActionsRefreshPost**](Apis/DefaultApi.http#objectssandboxvaultidactionsrefreshpost) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot
*DefaultApi* | [**objectsSandboxVaultIdGet**](Apis/DefaultApi.http#objectssandboxvaultidget) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID
*DefaultApi* | [**objectsSecuritypoliciesGet**](Apis/DefaultApi.http#objectssecuritypoliciesget) | **GET** /objects/securitypolicies | Retrieve All Security Policies
*DefaultApi* | [**objectsSecuritypoliciesSecurityPolicyNameGet**](Apis/DefaultApi.http#objectssecuritypoliciessecuritypolicynameget) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy
*DefaultApi* | [**objectsUsersGet**](Apis/DefaultApi.http#objectsusersget) | **GET** /objects/users/ | Retrieve All Users
*DefaultApi* | [**objectsUsersIdGet**](Apis/DefaultApi.http#objectsusersidget) | **GET** /objects/users/{id} | Retrieve User
*DefaultApi* | [**objectsUsersIdPermissionsGet**](Apis/DefaultApi.http#objectsusersidpermissionsget) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions
*DefaultApi* | [**objectsUsersIdPut**](Apis/DefaultApi.http#objectsusersidput) | **PUT** /objects/users/{id} | Update Single User
*DefaultApi* | [**objectsUsersMeGet**](Apis/DefaultApi.http#objectsusersmeget) | **GET** /objects/users/me | Validate Session User
*DefaultApi* | [**objectsUsersMePasswordPost**](Apis/DefaultApi.http#objectsusersmepasswordpost) | **POST** /objects/users/me/password | Change My Password
*DefaultApi* | [**objectsUsersMePermissionsGet**](Apis/DefaultApi.http#objectsusersmepermissionsget) | **GET** /objects/users/me/permissions | Retrieve My User Permissions
*DefaultApi* | [**objectsUsersMePut**](Apis/DefaultApi.http#objectsusersmeput) | **PUT** /objects/users/me | Update My User
*DefaultApi* | [**objectsUsersPost**](Apis/DefaultApi.http#objectsuserspost) | **POST** /objects/users | Create Single User
*DefaultApi* | [**objectsUsersPut**](Apis/DefaultApi.http#objectsusersput) | **PUT** /objects/users | Update Multiple Users
*DefaultApi* | [**objectsUsersUserIdDelete**](Apis/DefaultApi.http#objectsusersuseriddelete) | **DELETE** /objects/users/{user_id} | Disable User
*DefaultApi* | [**objectsUsersUserIdVaultMembershipVaultIdPut**](Apis/DefaultApi.http#objectsusersuseridvaultmembershipvaultidput) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership
*DefaultApi* | [**objectsVaultActionsComparePost**](Apis/DefaultApi.http#objectsvaultactionscomparepost) | **POST** /objects/vault/actions/compare | Vault Compare
*DefaultApi* | [**objectsVaultActionsConfigreportPost**](Apis/DefaultApi.http#objectsvaultactionsconfigreportpost) | **POST** /objects/vault/actions/configreport | Vault Configuration Report
*DefaultApi* | [**queryComponentsPost**](Apis/DefaultApi.http#querycomponentspost) | **POST** /query/components | Component Definition Query
*DefaultApi* | [**queryNextPagePost**](Apis/DefaultApi.http#querynextpagepost) | **POST** /query/{next_page} | Next Page URL
*DefaultApi* | [**queryPost**](Apis/DefaultApi.http#querypost) | **POST** /query | Submitting a Query
*DefaultApi* | [**queryPreviousPagePost**](Apis/DefaultApi.http#querypreviouspagepost) | **POST** /query/{previous_page} | Previous Page URL
*DefaultApi* | [**scimV2MeGet**](Apis/DefaultApi.http#scimv2meget) | **GET** /scim/v2/Me | Retrieve Current User with SCIM
*DefaultApi* | [**scimV2MePut**](Apis/DefaultApi.http#scimv2meput) | **PUT** /scim/v2/Me | Update Current User with SCIM
*DefaultApi* | [**scimV2ResourceTypesGet**](Apis/DefaultApi.http#scimv2resourcetypesget) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types
*DefaultApi* | [**scimV2ResourceTypesTypeGet**](Apis/DefaultApi.http#scimv2resourcetypestypeget) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type
*DefaultApi* | [**scimV2SchemasGet**](Apis/DefaultApi.http#scimv2schemasget) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information
*DefaultApi* | [**scimV2SchemasIdGet**](Apis/DefaultApi.http#scimv2schemasidget) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information
*DefaultApi* | [**scimV2ServiceProviderConfigGet**](Apis/DefaultApi.http#scimv2serviceproviderconfigget) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider
*DefaultApi* | [**scimV2TypeGet**](Apis/DefaultApi.http#scimv2typeget) | **GET** /scim/v2/{type} | Retrieve SCIM Resources
*DefaultApi* | [**scimV2TypeIdGet**](Apis/DefaultApi.http#scimv2typeidget) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource
*DefaultApi* | [**scimV2UsersGet**](Apis/DefaultApi.http#scimv2usersget) | **GET** /scim/v2/Users | Retrieve All Users with SCIM
*DefaultApi* | [**scimV2UsersIdGet**](Apis/DefaultApi.http#scimv2usersidget) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM
*DefaultApi* | [**scimV2UsersIdPut**](Apis/DefaultApi.http#scimv2usersidput) | **PUT** /scim/v2/Users/{id} | Update User with SCIM
*DefaultApi* | [**scimV2UsersPost**](Apis/DefaultApi.http#scimv2userspost) | **POST** /scim/v2/Users | Create User with SCIM
*DefaultApi* | [**servicesCertificateCertIdGet**](Apis/DefaultApi.http#servicescertificatecertidget) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate
*DefaultApi* | [**servicesConfigurationModeActionsDisablePost**](Apis/DefaultApi.http#servicesconfigurationmodeactionsdisablepost) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode
*DefaultApi* | [**servicesConfigurationModeActionsEnablePost**](Apis/DefaultApi.http#servicesconfigurationmodeactionsenablepost) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode
*DefaultApi* | [**servicesDirectdataFilesGet**](Apis/DefaultApi.http#servicesdirectdatafilesget) | **GET** /services/directdata/files | Retrieve Available Direct Data Files
*DefaultApi* | [**servicesDirectdataFilesNameGet**](Apis/DefaultApi.http#servicesdirectdatafilesnameget) | **GET** /services/directdata/files/{name} | Download Direct Data File
*DefaultApi* | [**servicesFileStagingItemsContentItemGet**](Apis/DefaultApi.http#servicesfilestagingitemscontentitemget) | **GET** /services/file_staging/items/content/{item} | Download Item Content
*DefaultApi* | [**servicesFileStagingItemsItemDelete**](Apis/DefaultApi.http#servicesfilestagingitemsitemdelete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder
*DefaultApi* | [**servicesFileStagingItemsItemGet**](Apis/DefaultApi.http#servicesfilestagingitemsitemget) | **GET** /services/file_staging/items/{item} | List Items at a Path
*DefaultApi* | [**servicesFileStagingItemsItemPut**](Apis/DefaultApi.http#servicesfilestagingitemsitemput) | **PUT** /services/file_staging/items/{item} | Update Folder or File
*DefaultApi* | [**servicesFileStagingItemsPost**](Apis/DefaultApi.http#servicesfilestagingitemspost) | **POST** /services/file_staging/items | Create Folder or File
*DefaultApi* | [**servicesFileStagingUploadGet**](Apis/DefaultApi.http#servicesfilestaginguploadget) | **GET** /services/file_staging/upload/ | List Upload Sessions
*DefaultApi* | [**servicesFileStagingUploadPost**](Apis/DefaultApi.http#servicesfilestaginguploadpost) | **POST** /services/file_staging/upload | Create Resumable Upload Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdDelete**](Apis/DefaultApi.http#servicesfilestaginguploaduploadsessioniddelete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdGet**](Apis/DefaultApi.http#servicesfilestaginguploaduploadsessionidget) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdPartsGet**](Apis/DefaultApi.http#servicesfilestaginguploaduploadsessionidpartsget) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdPost**](Apis/DefaultApi.http#servicesfilestaginguploaduploadsessionidpost) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session
*DefaultApi* | [**servicesFileStagingUploadUploadSessionIdPut**](Apis/DefaultApi.http#servicesfilestaginguploaduploadsessionidput) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session
*DefaultApi* | [**servicesJobsHistoriesGet**](Apis/DefaultApi.http#servicesjobshistoriesget) | **GET** /services/jobs/histories | Retrieve Job Histories
*DefaultApi* | [**servicesJobsJobIdErrorsGet**](Apis/DefaultApi.http#servicesjobsjobiderrorsget) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors
*DefaultApi* | [**servicesJobsJobIdGet**](Apis/DefaultApi.http#servicesjobsjobidget) | **GET** /services/jobs/{job_id} | Retrieve Job Status
*DefaultApi* | [**servicesJobsJobIdSummaryGet**](Apis/DefaultApi.http#servicesjobsjobidsummaryget) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary
*DefaultApi* | [**servicesJobsJobIdTasksGet**](Apis/DefaultApi.http#servicesjobsjobidtasksget) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks
*DefaultApi* | [**servicesJobsMonitorsGet**](Apis/DefaultApi.http#servicesjobsmonitorsget) | **GET** /services/jobs/monitors | Retrieve Job Monitors
*DefaultApi* | [**servicesJobsStartNowJobIdPost**](Apis/DefaultApi.http#servicesjobsstartnowjobidpost) | **POST** /services/jobs/start_now/{job_id} | Start Job
*DefaultApi* | [**servicesLoaderExtractPost**](Apis/DefaultApi.http#servicesloaderextractpost) | **POST** /services/loader/extract | Extract Data Files
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdFailurelogGet**](Apis/DefaultApi.http#servicesloaderjobidtaskstaskidfailurelogget) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdResultsGet**](Apis/DefaultApi.http#servicesloaderjobidtaskstaskidresultsget) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**](Apis/DefaultApi.http#servicesloaderjobidtaskstaskidresultsrenditionsget) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results
*DefaultApi* | [**servicesLoaderJobIdTasksTaskIdSuccesslogGet**](Apis/DefaultApi.http#servicesloaderjobidtaskstaskidsuccesslogget) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results
*DefaultApi* | [**servicesLoaderLoadPost**](Apis/DefaultApi.http#servicesloaderloadpost) | **POST** /services/loader/load | Load Data Objects
*DefaultApi* | [**servicesPackageActionsValidatePost**](Apis/DefaultApi.http#servicespackageactionsvalidatepost) | **POST** /services/package/actions/validate | Validate Package
*DefaultApi* | [**servicesPackagePost**](Apis/DefaultApi.http#servicespackagepost) | **POST** /services/package | Export Package
*DefaultApi* | [**servicesPackagePut**](Apis/DefaultApi.http#servicespackageput) | **PUT** /services/package | Import Package
*DefaultApi* | [**servicesQueuesGet**](Apis/DefaultApi.http#servicesqueuesget) | **GET** /services/queues | Retrieve All Queues
*DefaultApi* | [**servicesQueuesQueueNameActionsDisableDeliveryPut**](Apis/DefaultApi.http#servicesqueuesqueuenameactionsdisabledeliveryput) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery
*DefaultApi* | [**servicesQueuesQueueNameActionsEnableDeliveryPut**](Apis/DefaultApi.http#servicesqueuesqueuenameactionsenabledeliveryput) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery
*DefaultApi* | [**servicesQueuesQueueNameActionsResetPut**](Apis/DefaultApi.http#servicesqueuesqueuenameactionsresetput) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue
*DefaultApi* | [**servicesQueuesQueueNameGet**](Apis/DefaultApi.http#servicesqueuesqueuenameget) | **GET** /services/queues/{queue_name} | Retrieve Queue Status
*DefaultApi* | [**servicesVobjectVaultPackageVPackageIdActionsValidatePost**](Apis/DefaultApi.http#servicesvobjectvaultpackagevpackageidactionsvalidatepost) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package
*DefaultApi* | [**sessionDelete**](Apis/DefaultApi.http#sessiondelete) | **DELETE** /session | End Session
*DefaultApi* | [**uicodeDistributionsDistributionNameCodeGet**](Apis/DefaultApi.http#uicodedistributionsdistributionnamecodeget) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution
*DefaultApi* | [**uicodeDistributionsDistributionNameDelete**](Apis/DefaultApi.http#uicodedistributionsdistributionnamedelete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution
*DefaultApi* | [**uicodeDistributionsDistributionNameGet**](Apis/DefaultApi.http#uicodedistributionsdistributionnameget) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata
*DefaultApi* | [**uicodeDistributionsGet**](Apis/DefaultApi.http#uicodedistributionsget) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata
*DefaultApi* | [**uicodeDistributionsPost**](Apis/DefaultApi.http#uicodedistributionspost) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution
*DefaultApi* | [**vobjectVaultPackageVPackageIdActionsDeployPost**](Apis/DefaultApi.http#vobjectvaultpackagevpackageidactionsdeploypost) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package
*DefaultApi* | [**vobjectVaultPackageVPackageIdActionsDeployResultsGet**](Apis/DefaultApi.http#vobjectvaultpackagevpackageidactionsdeployresultsget) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results
*DefaultApi* | [**vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**](Apis/DefaultApi.http#vobjectscascadedeleteresultsobjectnamejobstatusjobidget) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job
*DefaultApi* | [**vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**](Apis/DefaultApi.http#vobjectsdeepcopyresultsobjectnamejobstatusjobidget) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job
*DefaultApi* | [**vobjectsEdlItemVActionsCreateplaceholderPost**](Apis/DefaultApi.http#vobjectsedlitemvactionscreateplaceholderpost) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item
*DefaultApi* | [**vobjectsMergesJobIdLogGet**](Apis/DefaultApi.http#vobjectsmergesjobidlogget) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log
*DefaultApi* | [**vobjectsMergesJobIdResultsGet**](Apis/DefaultApi.http#vobjectsmergesjobidresultsget) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results
*DefaultApi* | [**vobjectsMergesJobIdStatusGet**](Apis/DefaultApi.http#vobjectsmergesjobidstatusget) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status
*DefaultApi* | [**vobjectsObjectNameActionsActionNamePost**](Apis/DefaultApi.http#vobjectsobjectnameactionsactionnamepost) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records
*DefaultApi* | [**vobjectsObjectNameActionsChangetypePost**](Apis/DefaultApi.http#vobjectsobjectnameactionschangetypepost) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type
*DefaultApi* | [**vobjectsObjectNameActionsMergePost**](Apis/DefaultApi.http#vobjectsobjectnameactionsmergepost) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge
*DefaultApi* | [**vobjectsObjectNameActionsRecalculaterollupsGet**](Apis/DefaultApi.http#vobjectsobjectnameactionsrecalculaterollupsget) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status
*DefaultApi* | [**vobjectsObjectNameActionsRecalculaterollupsPost**](Apis/DefaultApi.http#vobjectsobjectnameactionsrecalculaterollupspost) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields
*DefaultApi* | [**vobjectsObjectNameActionsUpdatecorporatecurrencyPut**](Apis/DefaultApi.http#vobjectsobjectnameactionsupdatecorporatecurrencyput) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields
*DefaultApi* | [**vobjectsObjectNameAttachmentsBatchDelete**](Apis/DefaultApi.http#vobjectsobjectnameattachmentsbatchdelete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments
*DefaultApi* | [**vobjectsObjectNameAttachmentsBatchPost**](Apis/DefaultApi.http#vobjectsobjectnameattachmentsbatchpost) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments
*DefaultApi* | [**vobjectsObjectNameAttachmentsBatchPut**](Apis/DefaultApi.http#vobjectsobjectnameattachmentsbatchput) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions
*DefaultApi* | [**vobjectsObjectNameDelete**](Apis/DefaultApi.http#vobjectsobjectnamedelete) | **DELETE** /vobjects/{object_name} | Delete Object Records
*DefaultApi* | [**vobjectsObjectNameIdRolesRoleNameGet**](Apis/DefaultApi.http#vobjectsobjectnameidrolesrolenameget) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsActionNameGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidactionsactionnameget) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsActionNamePost**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidactionsactionnamepost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidactionscascadedeletepost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidactionsdeepcopypost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdActionsGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidactionsget) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefilepost) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentfieldsfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentiddelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentidget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentidput) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversiondelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionpost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsFileGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentsget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAttachmentsPost**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidattachmentspost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdAudittrailGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidaudittrailget) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record
*DefaultApi* | [**vobjectsObjectNameObjectRecordIdGet**](Apis/DefaultApi.http#vobjectsobjectnameobjectrecordidget) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record
*DefaultApi* | [**vobjectsObjectNamePost**](Apis/DefaultApi.http#vobjectsobjectnamepost) | **POST** /vobjects/{object_name} | Create & Upsert Object Records
*DefaultApi* | [**vobjectsObjectNamePut**](Apis/DefaultApi.http#vobjectsobjectnameput) | **PUT** /vobjects/{object_name} | Update Object Records
*DefaultApi* | [**vobjectsObjectNameRolesDelete**](Apis/DefaultApi.http#vobjectsobjectnamerolesdelete) | **DELETE** /vobjects/{object_name}/roles | Remove Users & Groups from Roles on Object Records
*DefaultApi* | [**vobjectsObjectNameRolesPost**](Apis/DefaultApi.http#vobjectsobjectnamerolespost) | **POST** /vobjects/{object_name}/roles | Assign Users & Groups to Roles on Object Records
*DefaultApi* | [**vobjectsOutboundPackageVPackageIdDependenciesGet**](Apis/DefaultApi.http#vobjectsoutboundpackagevpackageiddependenciesget) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies


## Usage

### Prerequisites

You need [IntelliJ](https://www.jetbrains.com/idea/) to be able to run those queries. More information can be found [here](https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html).
You may have some luck running queries using the [Code REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) as well, but your mileage may vary.

### Variables and Environment files

* Generally speaking, you want queries to be specific using custom variables. All variables in the `.http` files have the `` format.
* You can create [public or private environment files](https://www.jetbrains.com/help/idea/exploring-http-syntax.html#environment-variables) to dynamically replace the variables at runtime.

_Note: don't commit private environment files! They typically will contain sensitive information like API Keys._

### Customizations

If you have control over the generation of the files here, there are two main things you can do

* Select elements to replace as variables during generation. The process is case-sensitive. For example, API_KEY -> 
    * For this, run the generation with the `bodyVariables` property, followed by a "-" separated list of variables
    * Example: `--additional-properties bodyVariables=YOUR_MERCHANT_ACCOUNT-YOUR_COMPANY_ACCOUNT-YOUR_BALANCE_PLATFORM`
* Add custom headers to _all_ requests. This can be useful for example if your specifications are missing [security schemes](https://github.com/github/rest-api-description/issues/237).
    * For this, run the generation with the `customHeaders` property, followed by a "&" separated list of variables
    * Example : `--additional-properties=customHeaders="Cookie:X-API-KEY="&"Accept-Encoding=gzip"`

_This client was generated by the [jetbrains-http-client](https://openapi-generator.tech/docs/generators/jetbrains-http-client) generator of OpenAPI Generator_