# Documentation for Veeva Vault API v25.1 1.0.0 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Veeva Vault API v25.1 Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to http://}http://}/api/v25.1


### DefaultManager
Method | HTTP request | Description
------------- | ------------- | -------------
*apiGetSync* | *GET* /api/ | Retrieve API Versions.
*apiGetASync* | *GET* /api/ | Retrieve API Versions.
*apiMdlComponentsComponentTypeAndRecordNameFilesGetSync* | *GET* /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File.
*apiMdlComponentsComponentTypeAndRecordNameFilesGetASync* | *GET* /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File.
*apiMdlComponentsComponentTypeAndRecordNameGetSync* | *GET* /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL).
*apiMdlComponentsComponentTypeAndRecordNameGetASync* | *GET* /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL).
*apiMdlExecuteAsyncJobIdResultsGetSync* | *GET* /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results.
*apiMdlExecuteAsyncJobIdResultsGetASync* | *GET* /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results.
*apiMdlExecuteAsyncPostSync* | *POST* /api/mdl/execute_async | Execute MDL Script Asynchronously.
*apiMdlExecuteAsyncPostASync* | *POST* /api/mdl/execute_async | Execute MDL Script Asynchronously.
*apiMdlExecutePostSync* | *POST* /api/mdl/execute | Execute MDL Script.
*apiMdlExecutePostASync* | *POST* /api/mdl/execute | Execute MDL Script.
*apiMdlFilesPostSync* | *POST* /api/mdl/files | Upload Content File.
*apiMdlFilesPostASync* | *POST* /api/mdl/files | Upload Content File.
*audittrailAuditTrailTypeGetSync* | *GET* /audittrail/{audit_trail_type} | Retrieve Audit Details.
*audittrailAuditTrailTypeGetASync* | *GET* /audittrail/{audit_trail_type} | Retrieve Audit Details.
*authDiscoveryPostSync* | *POST* /auth/discovery | Authentication Type Discovery.
*authDiscoveryPostASync* | *POST* /auth/discovery | Authentication Type Discovery.
*authOauthSessionOathOidcProfileIdPostSync* | *POST* /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect.
*authOauthSessionOathOidcProfileIdPostASync* | *POST* /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect.
*authPostSync* | *POST* /auth | User Name and Password.
*authPostASync* | *POST* /auth | User Name and Password.
*codeClassNameDeleteSync* | *DELETE* /code/{class_name} | Delete Single Source Code File.
*codeClassNameDeleteASync* | *DELETE* /code/{class_name} | Delete Single Source Code File.
*codeClassNameDisablePutSync* | *PUT* /code/{class_name}/disable | Disable Vault Extension.
*codeClassNameDisablePutASync* | *PUT* /code/{class_name}/disable | Disable Vault Extension.
*codeClassNameEnablePutSync* | *PUT* /code/{class_name}/enable | Enable Vault Extension.
*codeClassNameEnablePutASync* | *PUT* /code/{class_name}/enable | Enable Vault Extension.
*codeClassNameGetSync* | *GET* /code/{class_name} | Retrieve Single Source Code File.
*codeClassNameGetASync* | *GET* /code/{class_name} | Retrieve Single Source Code File.
*codeProfilerGetSync* | *GET* /code/profiler | Retrieve All Profiling Sessions.
*codeProfilerGetASync* | *GET* /code/profiler | Retrieve All Profiling Sessions.
*codeProfilerPostSync* | *POST* /code/profiler | Create Profiling Session.
*codeProfilerPostASync* | *POST* /code/profiler | Create Profiling Session.
*codeProfilerSessionNameActionsEndPostSync* | *POST* /code/profiler/{session_name}/actions/end | End Profiling Session.
*codeProfilerSessionNameActionsEndPostASync* | *POST* /code/profiler/{session_name}/actions/end | End Profiling Session.
*codeProfilerSessionNameDeleteSync* | *DELETE* /code/profiler/{session_name} | Delete Profiling Session.
*codeProfilerSessionNameDeleteASync* | *DELETE* /code/profiler/{session_name} | Delete Profiling Session.
*codeProfilerSessionNameGetSync* | *GET* /code/profiler/{session_name} | Retrieve Profiling Session.
*codeProfilerSessionNameGetASync* | *GET* /code/profiler/{session_name} | Retrieve Profiling Session.
*codeProfilerSessionNameResultsGetSync* | *GET* /code/profiler/{session_name}/results | Download Profiling Session Results.
*codeProfilerSessionNameResultsGetASync* | *GET* /code/profiler/{session_name}/results | Download Profiling Session Results.
*codePutSync* | *PUT* /code | Add or Replace Single Source Code File.
*codePutASync* | *PUT* /code | Add or Replace Single Source Code File.
*compositesTreesEdlHierarchyOrTemplateActionsListnodesPostSync* | *POST* /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes.
*compositesTreesEdlHierarchyOrTemplateActionsListnodesPostASync* | *POST* /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes.
*compositesTreesEdlHierarchyOrTemplateGetSync* | *GET* /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes.
*compositesTreesEdlHierarchyOrTemplateGetASync* | *GET* /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes.
*compositesTreesEdlHierarchyVParentNodeIdChildrenGetSync* | *GET* /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node's Children.
*compositesTreesEdlHierarchyVParentNodeIdChildrenGetASync* | *GET* /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node's Children.
*compositesTreesEdlHierarchyVParentNodeIdChildrenPutSync* | *PUT* /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order.
*compositesTreesEdlHierarchyVParentNodeIdChildrenPutASync* | *PUT* /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order.
*configurationComponentTypeAndRecordNameGetSync* | *GET* /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON).
*configurationComponentTypeAndRecordNameGetASync* | *GET* /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON).
*configurationComponentTypeGetSync* | *GET* /configuration/{component_type} | Retrieve Component Record Collection.
*configurationComponentTypeGetASync* | *GET* /configuration/{component_type} | Retrieve Component Record Collection.
*configurationObjectNameAndObjectTypeGetSync* | *GET* /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object.
*configurationObjectNameAndObjectTypeGetASync* | *GET* /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object.
*configurationObjecttypeGetSync* | *GET* /configuration/Objecttype | Retrieve Details from All Object Types.
*configurationObjecttypeGetASync* | *GET* /configuration/Objecttype | Retrieve Details from All Object Types.
*configurationRoleAssignmentRuleDeleteSync* | *DELETE* /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules.
*configurationRoleAssignmentRuleDeleteASync* | *DELETE* /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules.
*configurationRoleAssignmentRuleGetSync* | *GET* /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default & Override).
*configurationRoleAssignmentRuleGetASync* | *GET* /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default & Override).
*configurationRoleAssignmentRulePostSync* | *POST* /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules.
*configurationRoleAssignmentRulePostASync* | *POST* /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules.
*configurationRoleAssignmentRulePutSync* | *PUT* /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default & Override).
*configurationRoleAssignmentRulePutASync* | *PUT* /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default & Override).
*delegationLoginPostSync* | *POST* /delegation/login | Initiate Delegated Session.
*delegationLoginPostASync* | *POST* /delegation/login | Initiate Delegated Session.
*delegationVaultsGetSync* | *GET* /delegation/vaults | Retrieve Delegations.
*delegationVaultsGetASync* | *GET* /delegation/vaults | Retrieve Delegations.
*keepAlivePostSync* | *POST* /keep-alive | Session Keep Alive.
*keepAlivePostASync* | *POST* /keep-alive | Session Keep Alive.
*limitsGetSync* | *GET* /limits | Retrieve Limits on Objects.
*limitsGetASync* | *GET* /limits | Retrieve Limits on Objects.
*logsApiUsageGetSync* | *GET* /logs/api_usage | Download Daily API Usage.
*logsApiUsageGetASync* | *GET* /logs/api_usage | Download Daily API Usage.
*logsCodeDebugGetSync* | *GET* /logs/code/debug | Retrieve All Debug Logs.
*logsCodeDebugGetASync* | *GET* /logs/code/debug | Retrieve All Debug Logs.
*logsCodeDebugIdActionsResetDeleteSync* | *DELETE* /logs/code/debug/{id}/actions/reset | Delete Debug Log.
*logsCodeDebugIdActionsResetDeleteASync* | *DELETE* /logs/code/debug/{id}/actions/reset | Delete Debug Log.
*logsCodeDebugIdActionsResetPostSync* | *POST* /logs/code/debug/{id}/actions/reset | Reset Debug Log.
*logsCodeDebugIdActionsResetPostASync* | *POST* /logs/code/debug/{id}/actions/reset | Reset Debug Log.
*logsCodeDebugIdFilesGetSync* | *GET* /logs/code/debug/{id}/files | Download Debug Log Files.
*logsCodeDebugIdFilesGetASync* | *GET* /logs/code/debug/{id}/files | Download Debug Log Files.
*logsCodeDebugIdGetSync* | *GET* /logs/code/debug/{id} | Retrieve Single Debug Log.
*logsCodeDebugIdGetASync* | *GET* /logs/code/debug/{id} | Retrieve Single Debug Log.
*logsCodeDebugPostSync* | *POST* /logs/code/debug | Create Debug Log.
*logsCodeDebugPostASync* | *POST* /logs/code/debug | Create Debug Log.
*logsCodeRuntimeGetSync* | *GET* /logs/code/runtime | Download SDK Runtime Log.
*logsCodeRuntimeGetASync* | *GET* /logs/code/runtime | Download SDK Runtime Log.
*messagesMessageTypeActionsImportPostSync* | *POST* /messages/{message_type}/actions/import | Import Bulk Translation File.
*messagesMessageTypeActionsImportPostASync* | *POST* /messages/{message_type}/actions/import | Import Bulk Translation File.
*messagesMessageTypeLanguageLangActionsExportPostSync* | *POST* /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File.
*messagesMessageTypeLanguageLangActionsExportPostASync* | *POST* /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File.
*metadataAudittrailAuditTrailTypeGetSync* | *GET* /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata.
*metadataAudittrailAuditTrailTypeGetASync* | *GET* /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata.
*metadataAudittrailGetSync* | *GET* /metadata/audittrail | Retrieve Audit Types.
*metadataAudittrailGetASync* | *GET* /metadata/audittrail | Retrieve Audit Types.
*metadataComponentsComponentTypeGetSync* | *GET* /metadata/components/{component_type} | Retrieve Component Type Metadata.
*metadataComponentsComponentTypeGetASync* | *GET* /metadata/components/{component_type} | Retrieve Component Type Metadata.
*metadataComponentsGetSync* | *GET* /metadata/components | Retrieve All Component Metadata.
*metadataComponentsGetASync* | *GET* /metadata/components | Retrieve All Component Metadata.
*metadataObjectsBindersTemplatesBindernodesGetSync* | *GET* /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata.
*metadataObjectsBindersTemplatesBindernodesGetASync* | *GET* /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata.
*metadataObjectsBindersTemplatesGetSync* | *GET* /metadata/objects/binders/templates | Retrieve Binder Template Metadata.
*metadataObjectsBindersTemplatesGetASync* | *GET* /metadata/objects/binders/templates | Retrieve Binder Template Metadata.
*metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetSync* | *GET* /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata.
*metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetASync* | *GET* /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata.
*metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetSync* | *GET* /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata.
*metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetASync* | *GET* /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata.
*metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetSync* | *GET* /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata.
*metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetASync* | *GET* /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata.
*metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetSync* | *GET* /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata.
*metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetASync* | *GET* /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata.
*metadataObjectsDocumentsEventsGetSync* | *GET* /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes.
*metadataObjectsDocumentsEventsGetASync* | *GET* /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes.
*metadataObjectsDocumentsLockGetSync* | *GET* /metadata/objects/documents/lock | Retrieve Document Lock Metadata.
*metadataObjectsDocumentsLockGetASync* | *GET* /metadata/objects/documents/lock | Retrieve Document Lock Metadata.
*metadataObjectsDocumentsPropertiesFindCommonPostSync* | *POST* /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields.
*metadataObjectsDocumentsPropertiesFindCommonPostASync* | *POST* /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields.
*metadataObjectsDocumentsPropertiesGetSync* | *GET* /metadata/objects/documents/properties | Retrieve All Document Fields.
*metadataObjectsDocumentsPropertiesGetASync* | *GET* /metadata/objects/documents/properties | Retrieve All Document Fields.
*metadataObjectsDocumentsTemplatesGetSync* | *GET* /metadata/objects/documents/templates | Retrieve Document Template Metadata.
*metadataObjectsDocumentsTemplatesGetASync* | *GET* /metadata/objects/documents/templates | Retrieve Document Template Metadata.
*metadataObjectsDocumentsTypesGetSync* | *GET* /metadata/objects/documents/types | Retrieve All Document Types.
*metadataObjectsDocumentsTypesGetASync* | *GET* /metadata/objects/documents/types | Retrieve All Document Types.
*metadataObjectsDocumentsTypesTypeGetSync* | *GET* /metadata/objects/documents/types/{type} | Retrieve Document Type.
*metadataObjectsDocumentsTypesTypeGetASync* | *GET* /metadata/objects/documents/types/{type} | Retrieve Document Type.
*metadataObjectsDocumentsTypesTypeRelationshipsGetSync* | *GET* /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships.
*metadataObjectsDocumentsTypesTypeRelationshipsGetASync* | *GET* /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships.
*metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetSync* | *GET* /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification.
*metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetASync* | *GET* /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification.
*metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetSync* | *GET* /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype.
*metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetASync* | *GET* /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype.
*metadataObjectsGroupsGetSync* | *GET* /metadata/objects/groups | Retrieve Group Metadata.
*metadataObjectsGroupsGetASync* | *GET* /metadata/objects/groups | Retrieve Group Metadata.
*metadataObjectsSecuritypoliciesGetSync* | *GET* /metadata/objects/securitypolicies | Retrieve Security Policy Metadata.
*metadataObjectsSecuritypoliciesGetASync* | *GET* /metadata/objects/securitypolicies | Retrieve Security Policy Metadata.
*metadataObjectsUsersGetSync* | *GET* /metadata/objects/users | Retrieve User Metadata.
*metadataObjectsUsersGetASync* | *GET* /metadata/objects/users | Retrieve User Metadata.
*metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetSync* | *GET* /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata.
*metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetASync* | *GET* /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata.
*metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetSync* | *GET* /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata.
*metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetASync* | *GET* /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata.
*metadataVobjectsGetSync* | *GET* /metadata/vobjects | Retrieve Object Collection.
*metadataVobjectsGetASync* | *GET* /metadata/vobjects | Retrieve Object Collection.
*metadataVobjectsObjectNameActionsCanceldeploymentPostSync* | *POST* /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment.
*metadataVobjectsObjectNameActionsCanceldeploymentPostASync* | *POST* /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment.
*metadataVobjectsObjectNameFieldsObjectFieldNameGetSync* | *GET* /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata.
*metadataVobjectsObjectNameFieldsObjectFieldNameGetASync* | *GET* /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata.
*metadataVobjectsObjectNameGetSync* | *GET* /metadata/vobjects/{object_name} | Retrieve Object Metadata.
*metadataVobjectsObjectNameGetASync* | *GET* /metadata/vobjects/{object_name} | Retrieve Object Metadata.
*metadataVobjectsObjectNamePageLayoutsGetSync* | *GET* /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts.
*metadataVobjectsObjectNamePageLayoutsGetASync* | *GET* /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts.
*metadataVobjectsObjectNamePageLayoutsLayoutNameGetSync* | *GET* /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata.
*metadataVobjectsObjectNamePageLayoutsLayoutNameGetASync* | *GET* /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata.
*notificationsHistoriesGetSync* | *GET* /notifications/histories | Retrieve Email Notification Histories.
*notificationsHistoriesGetASync* | *GET* /notifications/histories | Retrieve Email Notification Histories.
*objectWorkflowActionsActionGetSync* | *GET* /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details.
*objectWorkflowActionsActionGetASync* | *GET* /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details.
*objectWorkflowActionsActionPostSync* | *POST* /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows.
*objectWorkflowActionsActionPostASync* | *POST* /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows.
*objectWorkflowActionsCanceltasksPostSync* | *POST* /object/workflow/actions/canceltasks | Cancel Workflow Tasks.
*objectWorkflowActionsCanceltasksPostASync* | *POST* /object/workflow/actions/canceltasks | Cancel Workflow Tasks.
*objectWorkflowActionsCancelworkflowsPostSync* | *POST* /object/workflow/actions/cancelworkflows | Cancel Workflows.
*objectWorkflowActionsCancelworkflowsPostASync* | *POST* /object/workflow/actions/cancelworkflows | Cancel Workflows.
*objectWorkflowActionsGetSync* | *GET* /object/workflow/actions | Retrieve Bulk Workflow Actions.
*objectWorkflowActionsGetASync* | *GET* /object/workflow/actions | Retrieve Bulk Workflow Actions.
*objectWorkflowActionsReassigntasksPostSync* | *POST* /object/workflow/actions/reassigntasks | Reassign Workflow Tasks.
*objectWorkflowActionsReassigntasksPostASync* | *POST* /object/workflow/actions/reassigntasks | Reassign Workflow Tasks.
*objectWorkflowActionsReplaceworkflowownerPostSync* | *POST* /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner.
*objectWorkflowActionsReplaceworkflowownerPostASync* | *POST* /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner.
*objectsBindersActionsExportJobIdResultsGetSync* | *GET* /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results.
*objectsBindersActionsExportJobIdResultsGetASync* | *GET* /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results.
*objectsBindersBinderIdActionsExportPostSync* | *POST* /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version).
*objectsBindersBinderIdActionsExportPostASync* | *POST* /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version).
*objectsBindersBinderIdActionsPostSync* | *POST* /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing.
*objectsBindersBinderIdActionsPostASync* | *POST* /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing.
*objectsBindersBinderIdBindingRulePutSync* | *PUT* /objects/binders/{binder_id}/binding_rule | Update Binding Rule.
*objectsBindersBinderIdBindingRulePutASync* | *PUT* /objects/binders/{binder_id}/binding_rule | Update Binding Rule.
*objectsBindersBinderIdDeleteSync* | *DELETE* /objects/binders/{binder_id} | Delete Binder.
*objectsBindersBinderIdDeleteASync* | *DELETE* /objects/binders/{binder_id} | Delete Binder.
*objectsBindersBinderIdDocumentsNodeIdBindingRulePutSync* | *PUT* /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule.
*objectsBindersBinderIdDocumentsNodeIdBindingRulePutASync* | *PUT* /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule.
*objectsBindersBinderIdDocumentsPostSync* | *POST* /objects/binders/{binder_id}/documents | Add Document to Binder.
*objectsBindersBinderIdDocumentsPostASync* | *POST* /objects/binders/{binder_id}/documents | Add Document to Binder.
*objectsBindersBinderIdDocumentsSectionIdDeleteSync* | *DELETE* /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder.
*objectsBindersBinderIdDocumentsSectionIdDeleteASync* | *DELETE* /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder.
*objectsBindersBinderIdDocumentsSectionIdPutSync* | *PUT* /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder.
*objectsBindersBinderIdDocumentsSectionIdPutASync* | *PUT* /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder.
*objectsBindersBinderIdGetSync* | *GET* /objects/binders/{binder_id} | Retrieve Binder.
*objectsBindersBinderIdGetASync* | *GET* /objects/binders/{binder_id} | Retrieve Binder.
*objectsBindersBinderIdPostSync* | *POST* /objects/binders/{binder_id} | Create Binder Version.
*objectsBindersBinderIdPostASync* | *POST* /objects/binders/{binder_id} | Create Binder Version.
*objectsBindersBinderIdPutSync* | *PUT* /objects/binders/{binder_id} | Update Binder.
*objectsBindersBinderIdPutASync* | *PUT* /objects/binders/{binder_id} | Update Binder.
*objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteSync* | *DELETE* /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Binder.
*objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteASync* | *DELETE* /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Binder.
*objectsBindersBinderIdSectionsNodeIdBindingRulePutSync* | *PUT* /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule.
*objectsBindersBinderIdSectionsNodeIdBindingRulePutASync* | *PUT* /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule.
*objectsBindersBinderIdSectionsNodeIdPutSync* | *PUT* /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section.
*objectsBindersBinderIdSectionsNodeIdPutASync* | *PUT* /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section.
*objectsBindersBinderIdSectionsPostSync* | *POST* /objects/binders/{binder_id}/sections | Create Binder Section.
*objectsBindersBinderIdSectionsPostASync* | *POST* /objects/binders/{binder_id}/sections | Create Binder Section.
*objectsBindersBinderIdSectionsSectionIdDeleteSync* | *DELETE* /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section.
*objectsBindersBinderIdSectionsSectionIdDeleteASync* | *DELETE* /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section.
*objectsBindersBinderIdSectionsSectionIdGetSync* | *GET* /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections.
*objectsBindersBinderIdSectionsSectionIdGetASync* | *GET* /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections.
*objectsBindersBinderIdVersionsGetSync* | *GET* /objects/binders/{binder_id}/versions | Retrieve All Binder Versions.
*objectsBindersBinderIdVersionsGetASync* | *GET* /objects/binders/{binder_id}/versions | Retrieve All Binder Versions.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostSync* | *POST* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version).
*objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostASync* | *POST* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version).
*objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteSync* | *DELETE* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteASync* | *DELETE* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionGetSync* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionGetASync* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionPutSync* | *PUT* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionPutASync* | *PUT* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostSync* | *POST* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostASync* | *POST* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteSync* | *DELETE* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteASync* | *DELETE* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetSync* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetASync* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetSync* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section.
*objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetASync* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section.
*objectsBindersIdRolesGetSync* | *GET* /objects/binders/{id}/roles | Retrieve All Binder Roles.
*objectsBindersIdRolesGetASync* | *GET* /objects/binders/{id}/roles | Retrieve All Binder Roles.
*objectsBindersIdRolesPostSync* | *POST* /objects/binders/{id}/roles | Assign Users & Groups to Roles on a Single Binder.
*objectsBindersIdRolesPostASync* | *POST* /objects/binders/{id}/roles | Assign Users & Groups to Roles on a Single Binder.
*objectsBindersIdRolesRoleNameGetSync* | *GET* /objects/binders/{id}/roles/{role_name} | Retrieve Document Role.
*objectsBindersIdRolesRoleNameGetASync* | *GET* /objects/binders/{id}/roles/{role_name} | Retrieve Document Role.
*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetSync* | *GET* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions.
*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetASync* | *GET* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions.
*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetSync* | *GET* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria.
*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetASync* | *GET* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria.
*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutSync* | *PUT* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action.
*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutASync* | *PUT* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action.
*objectsBindersLifecycleActionsPostSync* | *POST* /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders.
*objectsBindersLifecycleActionsPostASync* | *POST* /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders.
*objectsBindersLifecycleActionsUserActionNamePutSync* | *PUT* /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions.
*objectsBindersLifecycleActionsUserActionNamePutASync* | *PUT* /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions.
*objectsBindersPostSync* | *POST* /objects/binders | Create Binder.
*objectsBindersPostASync* | *POST* /objects/binders | Create Binder.
*objectsBindersTemplatesGetSync* | *GET* /objects/binders/templates | Retrieve Binder Template Collection.
*objectsBindersTemplatesGetASync* | *GET* /objects/binders/templates | Retrieve Binder Template Collection.
*objectsBindersTemplatesPostSync* | *POST* /objects/binders/templates | Create Binder Template.
*objectsBindersTemplatesPostASync* | *POST* /objects/binders/templates | Create Binder Template.
*objectsBindersTemplatesPutSync* | *PUT* /objects/binders/templates | Update Binder Template.
*objectsBindersTemplatesPutASync* | *PUT* /objects/binders/templates | Update Binder Template.
*objectsBindersTemplatesTemplateNameBindernodesGetSync* | *GET* /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes.
*objectsBindersTemplatesTemplateNameBindernodesGetASync* | *GET* /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes.
*objectsBindersTemplatesTemplateNameBindernodesPostSync* | *POST* /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node.
*objectsBindersTemplatesTemplateNameBindernodesPostASync* | *POST* /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node.
*objectsBindersTemplatesTemplateNameBindernodesPutSync* | *PUT* /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes.
*objectsBindersTemplatesTemplateNameBindernodesPutASync* | *PUT* /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes.
*objectsBindersTemplatesTemplateNameDeleteSync* | *DELETE* /objects/binders/templates/{template_name} | Delete Binder Template.
*objectsBindersTemplatesTemplateNameDeleteASync* | *DELETE* /objects/binders/templates/{template_name} | Delete Binder Template.
*objectsBindersTemplatesTemplateNameGetSync* | *GET* /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes.
*objectsBindersTemplatesTemplateNameGetASync* | *GET* /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes.
*objectsDeletionsDocumentsGetSync* | *GET* /objects/deletions/documents | Retrieve Deleted Document IDs.
*objectsDeletionsDocumentsGetASync* | *GET* /objects/deletions/documents | Retrieve Deleted Document IDs.
*objectsDeletionsVobjectsObjectNameGetSync* | *GET* /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID.
*objectsDeletionsVobjectsObjectNameGetASync* | *GET* /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID.
*objectsDocumentsActionsGetSync* | *GET* /objects/documents/actions | Retrieve All Document Workflows.
*objectsDocumentsActionsGetASync* | *GET* /objects/documents/actions | Retrieve All Document Workflows.
*objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetSync* | *GET* /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results.
*objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetASync* | *GET* /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results.
*objectsDocumentsActionsWorkflowNameGetSync* | *GET* /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details.
*objectsDocumentsActionsWorkflowNameGetASync* | *GET* /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details.
*objectsDocumentsActionsWorkflowNamePostSync* | *POST* /objects/documents/actions/{workflow_name} | Initiate Document Workflow.
*objectsDocumentsActionsWorkflowNamePostASync* | *POST* /objects/documents/actions/{workflow_name} | Initiate Document Workflow.
*objectsDocumentsAnnotationsBatchDeleteSync* | *DELETE* /objects/documents/annotations/batch | Delete Annotations.
*objectsDocumentsAnnotationsBatchDeleteASync* | *DELETE* /objects/documents/annotations/batch | Delete Annotations.
*objectsDocumentsAnnotationsBatchPostSync* | *POST* /objects/documents/annotations/batch | Create Multiple Annotations.
*objectsDocumentsAnnotationsBatchPostASync* | *POST* /objects/documents/annotations/batch | Create Multiple Annotations.
*objectsDocumentsAnnotationsBatchPutSync* | *PUT* /objects/documents/annotations/batch | Update Annotations.
*objectsDocumentsAnnotationsBatchPutASync* | *PUT* /objects/documents/annotations/batch | Update Annotations.
*objectsDocumentsAnnotationsRepliesBatchPostSync* | *POST* /objects/documents/annotations/replies/batch | Add Annotation Replies.
*objectsDocumentsAnnotationsRepliesBatchPostASync* | *POST* /objects/documents/annotations/replies/batch | Add Annotation Replies.
*objectsDocumentsAttachmentsBatchDeleteSync* | *DELETE* /objects/documents/attachments/batch | Delete Multiple Document Attachments.
*objectsDocumentsAttachmentsBatchDeleteASync* | *DELETE* /objects/documents/attachments/batch | Delete Multiple Document Attachments.
*objectsDocumentsAttachmentsBatchPostSync* | *POST* /objects/documents/attachments/batch | Create Multiple Document Attachments.
*objectsDocumentsAttachmentsBatchPostASync* | *POST* /objects/documents/attachments/batch | Create Multiple Document Attachments.
*objectsDocumentsAttachmentsBatchPutSync* | *PUT* /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions.
*objectsDocumentsAttachmentsBatchPutASync* | *PUT* /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions.
*objectsDocumentsBatchActionsFileextractJobIdResultsGetSync* | *GET* /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results.
*objectsDocumentsBatchActionsFileextractJobIdResultsGetASync* | *GET* /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results.
*objectsDocumentsBatchActionsFileextractPostSync* | *POST* /objects/documents/batch/actions/fileextract | Export Documents.
*objectsDocumentsBatchActionsFileextractPostASync* | *POST* /objects/documents/batch/actions/fileextract | Export Documents.
*objectsDocumentsBatchActionsReclassifyPutSync* | *PUT* /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents.
*objectsDocumentsBatchActionsReclassifyPutASync* | *PUT* /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents.
*objectsDocumentsBatchActionsRerenderPostSync* | *POST* /objects/documents/batch/actions/rerender | Update Multiple Document Renditions.
*objectsDocumentsBatchActionsRerenderPostASync* | *POST* /objects/documents/batch/actions/rerender | Update Multiple Document Renditions.
*objectsDocumentsBatchDeleteSync* | *DELETE* /objects/documents/batch | Delete Multiple Documents.
*objectsDocumentsBatchDeleteASync* | *DELETE* /objects/documents/batch | Delete Multiple Documents.
*objectsDocumentsBatchLockDeleteSync* | *DELETE* /objects/documents/batch/lock | Undo Collaborative Authoring Checkout.
*objectsDocumentsBatchLockDeleteASync* | *DELETE* /objects/documents/batch/lock | Undo Collaborative Authoring Checkout.
*objectsDocumentsBatchPostSync* | *POST* /objects/documents/batch | Create Multiple Documents.
*objectsDocumentsBatchPostASync* | *POST* /objects/documents/batch | Create Multiple Documents.
*objectsDocumentsBatchPutSync* | *PUT* /objects/documents/batch | Update Multiple Documents.
*objectsDocumentsBatchPutASync* | *PUT* /objects/documents/batch | Update Multiple Documents.
*objectsDocumentsDocIdAnchorsGetSync* | *GET* /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs.
*objectsDocumentsDocIdAnchorsGetASync* | *GET* /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs.
*objectsDocumentsDocIdAnnotationsFileGetSync* | *GET* /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF.
*objectsDocumentsDocIdAnnotationsFileGetASync* | *GET* /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF.
*objectsDocumentsDocIdAnnotationsFilePostSync* | *POST* /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF.
*objectsDocumentsDocIdAnnotationsFilePostASync* | *POST* /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF.
*objectsDocumentsDocIdAttachmentsAttachmentIdDeleteSync* | *DELETE* /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment.
*objectsDocumentsDocIdAttachmentsAttachmentIdDeleteASync* | *DELETE* /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment.
*objectsDocumentsDocIdAttachmentsAttachmentIdFileGetSync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment.
*objectsDocumentsDocIdAttachmentsAttachmentIdFileGetASync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment.
*objectsDocumentsDocIdAttachmentsAttachmentIdGetSync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata.
*objectsDocumentsDocIdAttachmentsAttachmentIdGetASync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata.
*objectsDocumentsDocIdAttachmentsAttachmentIdPutSync* | *PUT* /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description.
*objectsDocumentsDocIdAttachmentsAttachmentIdPutASync* | *PUT* /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteSync* | *DELETE* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteASync* | *DELETE* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetASync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetSync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetASync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostSync* | *POST* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostASync* | *POST* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetSync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions.
*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetASync* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions.
*objectsDocumentsDocIdAttachmentsFileGetSync* | *GET* /objects/documents/{doc_id}/attachments/file | Download All Document Attachments.
*objectsDocumentsDocIdAttachmentsFileGetASync* | *GET* /objects/documents/{doc_id}/attachments/file | Download All Document Attachments.
*objectsDocumentsDocIdAttachmentsGetSync* | *GET* /objects/documents/{doc_id}/attachments | Retrieve Document Attachments.
*objectsDocumentsDocIdAttachmentsGetASync* | *GET* /objects/documents/{doc_id}/attachments | Retrieve Document Attachments.
*objectsDocumentsDocIdAttachmentsPostSync* | *POST* /objects/documents/{doc_id}/attachments | Create Document Attachment.
*objectsDocumentsDocIdAttachmentsPostASync* | *POST* /objects/documents/{doc_id}/attachments | Create Document Attachment.
*objectsDocumentsDocIdAudittrailGetSync* | *GET* /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document.
*objectsDocumentsDocIdAudittrailGetASync* | *GET* /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document.
*objectsDocumentsDocIdDeleteSync* | *DELETE* /objects/documents/{doc_id} | Delete Single Document.
*objectsDocumentsDocIdDeleteASync* | *DELETE* /objects/documents/{doc_id} | Delete Single Document.
*objectsDocumentsDocIdEventsGetSync* | *GET* /objects/documents/{doc_id}/events | Retrieve Document Events.
*objectsDocumentsDocIdEventsGetASync* | *GET* /objects/documents/{doc_id}/events | Retrieve Document Events.
*objectsDocumentsDocIdFileGetSync* | *GET* /objects/documents/{doc_id}/file | Download Document File.
*objectsDocumentsDocIdFileGetASync* | *GET* /objects/documents/{doc_id}/file | Download Document File.
*objectsDocumentsDocIdGetSync* | *GET* /objects/documents/{doc_id} | Retrieve Document.
*objectsDocumentsDocIdGetASync* | *GET* /objects/documents/{doc_id} | Retrieve Document.
*objectsDocumentsDocIdLockDeleteSync* | *DELETE* /objects/documents/{doc_id}/lock | Delete Document Lock.
*objectsDocumentsDocIdLockDeleteASync* | *DELETE* /objects/documents/{doc_id}/lock | Delete Document Lock.
*objectsDocumentsDocIdLockGetSync* | *GET* /objects/documents/{doc_id}/lock | Retrieve Document Lock.
*objectsDocumentsDocIdLockGetASync* | *GET* /objects/documents/{doc_id}/lock | Retrieve Document Lock.
*objectsDocumentsDocIdLockPostSync* | *POST* /objects/documents/{doc_id}/lock | Create Document Lock.
*objectsDocumentsDocIdLockPostASync* | *POST* /objects/documents/{doc_id}/lock | Create Document Lock.
*objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetSync* | *GET* /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments.
*objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetASync* | *GET* /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments.
*objectsDocumentsDocIdPostSync* | *POST* /objects/documents/{doc_id} | Create Single Document Version.
*objectsDocumentsDocIdPostASync* | *POST* /objects/documents/{doc_id} | Create Single Document Version.
*objectsDocumentsDocIdPutSync* | *PUT* /objects/documents/{doc_id} | Update Single Document.
*objectsDocumentsDocIdPutASync* | *PUT* /objects/documents/{doc_id} | Update Single Document.
*objectsDocumentsDocIdRenditionsGetSync* | *GET* /objects/documents/{doc_id}/renditions | Retrieve Document Renditions.
*objectsDocumentsDocIdRenditionsGetASync* | *GET* /objects/documents/{doc_id}/renditions | Retrieve Document Renditions.
*objectsDocumentsDocIdRenditionsRenditionTypeDeleteSync* | *DELETE* /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition.
*objectsDocumentsDocIdRenditionsRenditionTypeDeleteASync* | *DELETE* /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition.
*objectsDocumentsDocIdRenditionsRenditionTypeGetSync* | *GET* /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File.
*objectsDocumentsDocIdRenditionsRenditionTypeGetASync* | *GET* /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File.
*objectsDocumentsDocIdRenditionsRenditionTypePostSync* | *POST* /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition.
*objectsDocumentsDocIdRenditionsRenditionTypePostASync* | *POST* /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition.
*objectsDocumentsDocIdRenditionsRenditionTypePutSync* | *PUT* /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition.
*objectsDocumentsDocIdRenditionsRenditionTypePutASync* | *PUT* /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition.
*objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteSync* | *DELETE* /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Document.
*objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteASync* | *DELETE* /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Document.
*objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetSync* | *GET* /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments.
*objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetASync* | *GET* /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments.
*objectsDocumentsDocIdVersionsGetSync* | *GET* /objects/documents/{doc_id}/versions | Retrieve Document Versions.
*objectsDocumentsDocIdVersionsGetASync* | *GET* /objects/documents/{doc_id}/versions | Retrieve Document Versions.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostSync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostASync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteSync* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteASync* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostSync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostASync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutSync* | *PUT* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutASync* | *PUT* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostSync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostASync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteSync* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteASync* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteSync* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteASync* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostSync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostASync* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutSync* | *PUT* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutASync* | *PUT* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetSync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File.
*objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetASync* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File.
*objectsDocumentsGetSync* | *GET* /objects/documents | Retrieve All Documents.
*objectsDocumentsGetASync* | *GET* /objects/documents | Retrieve All Documents.
*objectsDocumentsIdRolesGetSync* | *GET* /objects/documents/{id}/roles | Retrieve All Document Roles.
*objectsDocumentsIdRolesGetASync* | *GET* /objects/documents/{id}/roles | Retrieve All Document Roles.
*objectsDocumentsIdRolesPostSync* | *POST* /objects/documents/{id}/roles | Assign Users & Groups to Roles on a Single Document.
*objectsDocumentsIdRolesPostASync* | *POST* /objects/documents/{id}/roles | Assign Users & Groups to Roles on a Single Document.
*objectsDocumentsIdRolesRoleNameGetSync* | *GET* /objects/documents/{id}/roles/{role_name} | Retrieve Document Role.
*objectsDocumentsIdRolesRoleNameGetASync* | *GET* /objects/documents/{id}/roles/{role_name} | Retrieve Document Role.
*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetSync* | *GET* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions.
*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetASync* | *GET* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions.
*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetSync* | *GET* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria.
*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetASync* | *GET* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria.
*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutSync* | *PUT* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action.
*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutASync* | *PUT* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action.
*objectsDocumentsLifecycleActionsPostSync* | *POST* /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents.
*objectsDocumentsLifecycleActionsPostASync* | *POST* /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents.
*objectsDocumentsLifecycleActionsUserActionNamePutSync* | *PUT* /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions.
*objectsDocumentsLifecycleActionsUserActionNamePutASync* | *PUT* /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions.
*objectsDocumentsPostSync* | *POST* /objects/documents | Create Single Document.
*objectsDocumentsPostASync* | *POST* /objects/documents | Create Single Document.
*objectsDocumentsRelationshipsBatchDeleteSync* | *DELETE* /objects/documents/relationships/batch | Delete Multiple Document Relationships.
*objectsDocumentsRelationshipsBatchDeleteASync* | *DELETE* /objects/documents/relationships/batch | Delete Multiple Document Relationships.
*objectsDocumentsRelationshipsBatchPostSync* | *POST* /objects/documents/relationships/batch | Create Multiple Document Relationships.
*objectsDocumentsRelationshipsBatchPostASync* | *POST* /objects/documents/relationships/batch | Create Multiple Document Relationships.
*objectsDocumentsRenditionsBatchDeleteSync* | *DELETE* /objects/documents/renditions/batch | Delete Multiple Document Renditions.
*objectsDocumentsRenditionsBatchDeleteASync* | *DELETE* /objects/documents/renditions/batch | Delete Multiple Document Renditions.
*objectsDocumentsRenditionsBatchPostSync* | *POST* /objects/documents/renditions/batch | Add Multiple Document Renditions.
*objectsDocumentsRenditionsBatchPostASync* | *POST* /objects/documents/renditions/batch | Add Multiple Document Renditions.
*objectsDocumentsRolesBatchDeleteSync* | *DELETE* /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents & Binders.
*objectsDocumentsRolesBatchDeleteASync* | *DELETE* /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents & Binders.
*objectsDocumentsRolesBatchPostSync* | *POST* /objects/documents/roles/batch | Assign Users & Groups to Roles on Multiple Documents & Binders.
*objectsDocumentsRolesBatchPostASync* | *POST* /objects/documents/roles/batch | Assign Users & Groups to Roles on Multiple Documents & Binders.
*objectsDocumentsTemplatesGetSync* | *GET* /objects/documents/templates | Retrieve Document Template Collection.
*objectsDocumentsTemplatesGetASync* | *GET* /objects/documents/templates | Retrieve Document Template Collection.
*objectsDocumentsTemplatesPostSync* | *POST* /objects/documents/templates | Create Single Document Template.
*objectsDocumentsTemplatesPostASync* | *POST* /objects/documents/templates | Create Single Document Template.
*objectsDocumentsTemplatesPutSync* | *PUT* /objects/documents/templates | Update Multiple Document Templates.
*objectsDocumentsTemplatesPutASync* | *PUT* /objects/documents/templates | Update Multiple Document Templates.
*objectsDocumentsTemplatesTemplateNameDeleteSync* | *DELETE* /objects/documents/templates/{template_name} | Delete Basic Document Template.
*objectsDocumentsTemplatesTemplateNameDeleteASync* | *DELETE* /objects/documents/templates/{template_name} | Delete Basic Document Template.
*objectsDocumentsTemplatesTemplateNameFileGetSync* | *GET* /objects/documents/templates/{template_name}/file | Download Document Template File.
*objectsDocumentsTemplatesTemplateNameFileGetASync* | *GET* /objects/documents/templates/{template_name}/file | Download Document Template File.
*objectsDocumentsTemplatesTemplateNameGetSync* | *GET* /objects/documents/templates/{template_name} | Retrieve Document Template Attributes.
*objectsDocumentsTemplatesTemplateNameGetASync* | *GET* /objects/documents/templates/{template_name} | Retrieve Document Template Attributes.
*objectsDocumentsTemplatesTemplateNamePutSync* | *PUT* /objects/documents/templates/{template_name} | Update Single Document Template.
*objectsDocumentsTemplatesTemplateNamePutASync* | *PUT* /objects/documents/templates/{template_name} | Update Single Document Template.
*objectsDocumentsTokensPostSync* | *POST* /objects/documents/tokens | Document Tokens.
*objectsDocumentsTokensPostASync* | *POST* /objects/documents/tokens | Document Tokens.
*objectsDocumentsVersionsBatchActionsFileextractPostSync* | *POST* /objects/documents/versions/batch/actions/fileextract | Export Document Versions.
*objectsDocumentsVersionsBatchActionsFileextractPostASync* | *POST* /objects/documents/versions/batch/actions/fileextract | Export Document Versions.
*objectsDocumentsVersionsBatchDeleteSync* | *DELETE* /objects/documents/versions/batch | Delete Multiple Document Versions.
*objectsDocumentsVersionsBatchDeleteASync* | *DELETE* /objects/documents/versions/batch | Delete Multiple Document Versions.
*objectsDocumentsVersionsBatchPostSync* | *POST* /objects/documents/versions/batch | Create Multiple Document Versions.
*objectsDocumentsVersionsBatchPostASync* | *POST* /objects/documents/versions/batch | Create Multiple Document Versions.
*objectsDomainGetSync* | *GET* /objects/domain | Retrieve Domain Information.
*objectsDomainGetASync* | *GET* /objects/domain | Retrieve Domain Information.
*objectsDomainsGetSync* | *GET* /objects/domains | Retrieve Domains.
*objectsDomainsGetASync* | *GET* /objects/domains | Retrieve Domains.
*objectsEdlMatchedDocumentsBatchActionsAddPostSync* | *POST* /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents.
*objectsEdlMatchedDocumentsBatchActionsAddPostASync* | *POST* /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents.
*objectsEdlMatchedDocumentsBatchActionsRemovePostSync* | *POST* /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents.
*objectsEdlMatchedDocumentsBatchActionsRemovePostASync* | *POST* /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents.
*objectsGroupsAutoGetSync* | *GET* /objects/groups/auto | Retrieve Auto Managed Groups.
*objectsGroupsAutoGetASync* | *GET* /objects/groups/auto | Retrieve Auto Managed Groups.
*objectsGroupsGetSync* | *GET* /objects/groups | Retrieve All Groups.
*objectsGroupsGetASync* | *GET* /objects/groups | Retrieve All Groups.
*objectsGroupsGroupIdDeleteSync* | *DELETE* /objects/groups/{group_id} | Delete Group.
*objectsGroupsGroupIdDeleteASync* | *DELETE* /objects/groups/{group_id} | Delete Group.
*objectsGroupsGroupIdGetSync* | *GET* /objects/groups/{group_id} | Retrieve Group.
*objectsGroupsGroupIdGetASync* | *GET* /objects/groups/{group_id} | Retrieve Group.
*objectsGroupsGroupIdPutSync* | *PUT* /objects/groups/{group_id} | Update Group.
*objectsGroupsGroupIdPutASync* | *PUT* /objects/groups/{group_id} | Update Group.
*objectsGroupsPostSync* | *POST* /objects/groups | Create Group .
*objectsGroupsPostASync* | *POST* /objects/groups | Create Group .
*objectsLicensesGetSync* | *GET* /objects/licenses | Retrieve Application License Usage.
*objectsLicensesGetASync* | *GET* /objects/licenses | Retrieve Application License Usage.
*objectsObjectworkflowsActionsGetSync* | *GET* /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows.
*objectsObjectworkflowsActionsGetASync* | *GET* /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows.
*objectsObjectworkflowsActionsWorkflowNameGetSync* | *GET* /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details.
*objectsObjectworkflowsActionsWorkflowNameGetASync* | *GET* /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details.
*objectsObjectworkflowsActionsWorkflowNamePostSync* | *POST* /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow.
*objectsObjectworkflowsActionsWorkflowNamePostASync* | *POST* /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow.
*objectsObjectworkflowsGetSync* | *GET* /objects/objectworkflows | Retrieve Workflows.
*objectsObjectworkflowsGetASync* | *GET* /objects/objectworkflows | Retrieve Workflows.
*objectsObjectworkflowsTasksGetSync* | *GET* /objects/objectworkflows/tasks | Retrieve Workflow Tasks.
*objectsObjectworkflowsTasksGetASync* | *GET* /objects/objectworkflows/tasks | Retrieve Workflow Tasks.
*objectsObjectworkflowsTasksTaskIdActionsAcceptPostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsAcceptPostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsCancelPostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsCancelPostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsCompletePostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsCompletePostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsGetSync* | *GET* /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions.
*objectsObjectworkflowsTasksTaskIdActionsGetASync* | *GET* /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions.
*objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content.
*objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content.
*objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsReassignPostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsReassignPostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task.
*objectsObjectworkflowsTasksTaskIdActionsTaskActionGetSync* | *GET* /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details.
*objectsObjectworkflowsTasksTaskIdActionsTaskActionGetASync* | *GET* /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details.
*objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance.
*objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance.
*objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostSync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date.
*objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostASync* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date.
*objectsObjectworkflowsTasksTaskIdGetSync* | *GET* /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details.
*objectsObjectworkflowsTasksTaskIdGetASync* | *GET* /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details.
*objectsObjectworkflowsWorkflowIdActionsGetSync* | *GET* /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions.
*objectsObjectworkflowsWorkflowIdActionsGetASync* | *GET* /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions.
*objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetSync* | *GET* /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details.
*objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetASync* | *GET* /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details.
*objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostSync* | *POST* /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action.
*objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostASync* | *POST* /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action.
*objectsObjectworkflowsWorkflowIdGetSync* | *GET* /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details.
*objectsObjectworkflowsWorkflowIdGetASync* | *GET* /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details.
*objectsPicklistsGetSync* | *GET* /objects/picklists | Retrieve All Picklists.
*objectsPicklistsGetASync* | *GET* /objects/picklists | Retrieve All Picklists.
*objectsPicklistsPicklistNameGetSync* | *GET* /objects/picklists/{picklist_name} | Retrieve Picklist Values.
*objectsPicklistsPicklistNameGetASync* | *GET* /objects/picklists/{picklist_name} | Retrieve Picklist Values.
*objectsPicklistsPicklistNamePicklistValueNameDeleteSync* | *DELETE* /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value.
*objectsPicklistsPicklistNamePicklistValueNameDeleteASync* | *DELETE* /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value.
*objectsPicklistsPicklistNamePicklistValueNamePutSync* | *PUT* /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value.
*objectsPicklistsPicklistNamePicklistValueNamePutASync* | *PUT* /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value.
*objectsPicklistsPicklistNamePostSync* | *POST* /objects/picklists/{picklist_name} | Create Picklist Values.
*objectsPicklistsPicklistNamePostASync* | *POST* /objects/picklists/{picklist_name} | Create Picklist Values.
*objectsPicklistsPicklistNamePutSync* | *PUT* /objects/picklists/{picklist_name} | Update Picklist Value Label.
*objectsPicklistsPicklistNamePutASync* | *PUT* /objects/picklists/{picklist_name} | Update Picklist Value Label.
*objectsSandboxActionsBuildproductionPostSync* | *POST* /objects/sandbox/actions/buildproduction | Build Production Vault.
*objectsSandboxActionsBuildproductionPostASync* | *POST* /objects/sandbox/actions/buildproduction | Build Production Vault.
*objectsSandboxActionsPromoteproductionPostSync* | *POST* /objects/sandbox/actions/promoteproduction | Promote to Production.
*objectsSandboxActionsPromoteproductionPostASync* | *POST* /objects/sandbox/actions/promoteproduction | Promote to Production.
*objectsSandboxActionsRecheckusagePostSync* | *POST* /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit.
*objectsSandboxActionsRecheckusagePostASync* | *POST* /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit.
*objectsSandboxBatchChangesizePostSync* | *POST* /objects/sandbox/batch/changesize | Change Sandbox Size.
*objectsSandboxBatchChangesizePostASync* | *POST* /objects/sandbox/batch/changesize | Change Sandbox Size.
*objectsSandboxEntitlementsSetPostSync* | *POST* /objects/sandbox/entitlements/set | Set Sandbox Entitlements.
*objectsSandboxEntitlementsSetPostASync* | *POST* /objects/sandbox/entitlements/set | Set Sandbox Entitlements.
*objectsSandboxGetSync* | *GET* /objects/sandbox | Retrieve Sandboxes.
*objectsSandboxGetASync* | *GET* /objects/sandbox | Retrieve Sandboxes.
*objectsSandboxNameDeleteSync* | *DELETE* /objects/sandbox/{name} | Delete Sandbox.
*objectsSandboxNameDeleteASync* | *DELETE* /objects/sandbox/{name} | Delete Sandbox.
*objectsSandboxPostSync* | *POST* /objects/sandbox | Create or Refresh Sandbox.
*objectsSandboxPostASync* | *POST* /objects/sandbox | Create or Refresh Sandbox.
*objectsSandboxSnapshotApiNameActionsUpdatePostSync* | *POST* /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot.
*objectsSandboxSnapshotApiNameActionsUpdatePostASync* | *POST* /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot.
*objectsSandboxSnapshotApiNameActionsUpgradePostSync* | *POST* /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot.
*objectsSandboxSnapshotApiNameActionsUpgradePostASync* | *POST* /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot.
*objectsSandboxSnapshotApiNameDeleteSync* | *DELETE* /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot.
*objectsSandboxSnapshotApiNameDeleteASync* | *DELETE* /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot.
*objectsSandboxSnapshotGetSync* | *GET* /objects/sandbox/snapshot | Retrieve Sandbox Snapshots.
*objectsSandboxSnapshotGetASync* | *GET* /objects/sandbox/snapshot | Retrieve Sandbox Snapshots.
*objectsSandboxSnapshotPostSync* | *POST* /objects/sandbox/snapshot | Create Sandbox Snapshot.
*objectsSandboxSnapshotPostASync* | *POST* /objects/sandbox/snapshot | Create Sandbox Snapshot.
*objectsSandboxVaultIdActionsRefreshPostSync* | *POST* /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot.
*objectsSandboxVaultIdActionsRefreshPostASync* | *POST* /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot.
*objectsSandboxVaultIdGetSync* | *GET* /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID.
*objectsSandboxVaultIdGetASync* | *GET* /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID.
*objectsSecuritypoliciesGetSync* | *GET* /objects/securitypolicies | Retrieve All Security Policies.
*objectsSecuritypoliciesGetASync* | *GET* /objects/securitypolicies | Retrieve All Security Policies.
*objectsSecuritypoliciesSecurityPolicyNameGetSync* | *GET* /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy.
*objectsSecuritypoliciesSecurityPolicyNameGetASync* | *GET* /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy.
*objectsUsersGetSync* | *GET* /objects/users/ | Retrieve All Users.
*objectsUsersGetASync* | *GET* /objects/users/ | Retrieve All Users.
*objectsUsersIdGetSync* | *GET* /objects/users/{id} | Retrieve User.
*objectsUsersIdGetASync* | *GET* /objects/users/{id} | Retrieve User.
*objectsUsersIdPermissionsGetSync* | *GET* /objects/users/{id}/permissions | Retrieve User Permissions.
*objectsUsersIdPermissionsGetASync* | *GET* /objects/users/{id}/permissions | Retrieve User Permissions.
*objectsUsersIdPutSync* | *PUT* /objects/users/{id} | Update Single User.
*objectsUsersIdPutASync* | *PUT* /objects/users/{id} | Update Single User.
*objectsUsersMeGetSync* | *GET* /objects/users/me | Validate Session User.
*objectsUsersMeGetASync* | *GET* /objects/users/me | Validate Session User.
*objectsUsersMePasswordPostSync* | *POST* /objects/users/me/password | Change My Password.
*objectsUsersMePasswordPostASync* | *POST* /objects/users/me/password | Change My Password.
*objectsUsersMePermissionsGetSync* | *GET* /objects/users/me/permissions | Retrieve My User Permissions.
*objectsUsersMePermissionsGetASync* | *GET* /objects/users/me/permissions | Retrieve My User Permissions.
*objectsUsersMePutSync* | *PUT* /objects/users/me | Update My User.
*objectsUsersMePutASync* | *PUT* /objects/users/me | Update My User.
*objectsUsersPostSync* | *POST* /objects/users | Create Single User.
*objectsUsersPostASync* | *POST* /objects/users | Create Single User.
*objectsUsersPutSync* | *PUT* /objects/users | Update Multiple Users.
*objectsUsersPutASync* | *PUT* /objects/users | Update Multiple Users.
*objectsUsersUserIdDeleteSync* | *DELETE* /objects/users/{user_id} | Disable User.
*objectsUsersUserIdDeleteASync* | *DELETE* /objects/users/{user_id} | Disable User.
*objectsUsersUserIdVaultMembershipVaultIdPutSync* | *PUT* /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership.
*objectsUsersUserIdVaultMembershipVaultIdPutASync* | *PUT* /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership.
*objectsVaultActionsComparePostSync* | *POST* /objects/vault/actions/compare | Vault Compare.
*objectsVaultActionsComparePostASync* | *POST* /objects/vault/actions/compare | Vault Compare.
*objectsVaultActionsConfigreportPostSync* | *POST* /objects/vault/actions/configreport | Vault Configuration Report.
*objectsVaultActionsConfigreportPostASync* | *POST* /objects/vault/actions/configreport | Vault Configuration Report.
*queryComponentsPostSync* | *POST* /query/components | Component Definition Query.
*queryComponentsPostASync* | *POST* /query/components | Component Definition Query.
*queryNextPagePostSync* | *POST* /query/{next_page} | Next Page URL.
*queryNextPagePostASync* | *POST* /query/{next_page} | Next Page URL.
*queryPostSync* | *POST* /query | Submitting a Query.
*queryPostASync* | *POST* /query | Submitting a Query.
*queryPreviousPagePostSync* | *POST* /query/{previous_page} | Previous Page URL.
*queryPreviousPagePostASync* | *POST* /query/{previous_page} | Previous Page URL.
*scimV2MeGetSync* | *GET* /scim/v2/Me | Retrieve Current User with SCIM.
*scimV2MeGetASync* | *GET* /scim/v2/Me | Retrieve Current User with SCIM.
*scimV2MePutSync* | *PUT* /scim/v2/Me | Update Current User with SCIM.
*scimV2MePutASync* | *PUT* /scim/v2/Me | Update Current User with SCIM.
*scimV2ResourceTypesGetSync* | *GET* /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types.
*scimV2ResourceTypesGetASync* | *GET* /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types.
*scimV2ResourceTypesTypeGetSync* | *GET* /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type.
*scimV2ResourceTypesTypeGetASync* | *GET* /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type.
*scimV2SchemasGetSync* | *GET* /scim/v2/Schemas | Retrieve All SCIM Schema Information.
*scimV2SchemasGetASync* | *GET* /scim/v2/Schemas | Retrieve All SCIM Schema Information.
*scimV2SchemasIdGetSync* | *GET* /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information.
*scimV2SchemasIdGetASync* | *GET* /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information.
*scimV2ServiceProviderConfigGetSync* | *GET* /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider.
*scimV2ServiceProviderConfigGetASync* | *GET* /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider.
*scimV2TypeGetSync* | *GET* /scim/v2/{type} | Retrieve SCIM Resources.
*scimV2TypeGetASync* | *GET* /scim/v2/{type} | Retrieve SCIM Resources.
*scimV2TypeIdGetSync* | *GET* /scim/v2/{type}/{id} | Retrieve Single SCIM Resource.
*scimV2TypeIdGetASync* | *GET* /scim/v2/{type}/{id} | Retrieve Single SCIM Resource.
*scimV2UsersGetSync* | *GET* /scim/v2/Users | Retrieve All Users with SCIM.
*scimV2UsersGetASync* | *GET* /scim/v2/Users | Retrieve All Users with SCIM.
*scimV2UsersIdGetSync* | *GET* /scim/v2/Users/{id} | Retrieve Single User with SCIM.
*scimV2UsersIdGetASync* | *GET* /scim/v2/Users/{id} | Retrieve Single User with SCIM.
*scimV2UsersIdPutSync* | *PUT* /scim/v2/Users/{id} | Update User with SCIM.
*scimV2UsersIdPutASync* | *PUT* /scim/v2/Users/{id} | Update User with SCIM.
*scimV2UsersPostSync* | *POST* /scim/v2/Users | Create User with SCIM.
*scimV2UsersPostASync* | *POST* /scim/v2/Users | Create User with SCIM.
*servicesCertificateCertIdGetSync* | *GET* /services/certificate/{cert_id} | Retrieve Signing Certificate.
*servicesCertificateCertIdGetASync* | *GET* /services/certificate/{cert_id} | Retrieve Signing Certificate.
*servicesConfigurationModeActionsDisablePostSync* | *POST* /services/configuration_mode/actions/disable | Disable Configuration Mode.
*servicesConfigurationModeActionsDisablePostASync* | *POST* /services/configuration_mode/actions/disable | Disable Configuration Mode.
*servicesConfigurationModeActionsEnablePostSync* | *POST* /services/configuration_mode/actions/enable | Enable Configuration Mode.
*servicesConfigurationModeActionsEnablePostASync* | *POST* /services/configuration_mode/actions/enable | Enable Configuration Mode.
*servicesDirectdataFilesGetSync* | *GET* /services/directdata/files | Retrieve Available Direct Data Files.
*servicesDirectdataFilesGetASync* | *GET* /services/directdata/files | Retrieve Available Direct Data Files.
*servicesDirectdataFilesNameGetSync* | *GET* /services/directdata/files/{name} | Download Direct Data File.
*servicesDirectdataFilesNameGetASync* | *GET* /services/directdata/files/{name} | Download Direct Data File.
*servicesFileStagingItemsContentItemGetSync* | *GET* /services/file_staging/items/content/{item} | Download Item Content.
*servicesFileStagingItemsContentItemGetASync* | *GET* /services/file_staging/items/content/{item} | Download Item Content.
*servicesFileStagingItemsItemDeleteSync* | *DELETE* /services/file_staging/items/{item} | Delete File or Folder.
*servicesFileStagingItemsItemDeleteASync* | *DELETE* /services/file_staging/items/{item} | Delete File or Folder.
*servicesFileStagingItemsItemGetSync* | *GET* /services/file_staging/items/{item} | List Items at a Path.
*servicesFileStagingItemsItemGetASync* | *GET* /services/file_staging/items/{item} | List Items at a Path.
*servicesFileStagingItemsItemPutSync* | *PUT* /services/file_staging/items/{item} | Update Folder or File.
*servicesFileStagingItemsItemPutASync* | *PUT* /services/file_staging/items/{item} | Update Folder or File.
*servicesFileStagingItemsPostSync* | *POST* /services/file_staging/items | Create Folder or File.
*servicesFileStagingItemsPostASync* | *POST* /services/file_staging/items | Create Folder or File.
*servicesFileStagingUploadGetSync* | *GET* /services/file_staging/upload/ | List Upload Sessions.
*servicesFileStagingUploadGetASync* | *GET* /services/file_staging/upload/ | List Upload Sessions.
*servicesFileStagingUploadPostSync* | *POST* /services/file_staging/upload | Create Resumable Upload Session.
*servicesFileStagingUploadPostASync* | *POST* /services/file_staging/upload | Create Resumable Upload Session.
*servicesFileStagingUploadUploadSessionIdDeleteSync* | *DELETE* /services/file_staging/upload/{upload_session_id} | Abort Upload Session.
*servicesFileStagingUploadUploadSessionIdDeleteASync* | *DELETE* /services/file_staging/upload/{upload_session_id} | Abort Upload Session.
*servicesFileStagingUploadUploadSessionIdGetSync* | *GET* /services/file_staging/upload/{upload_session_id} | Get Upload Session Details.
*servicesFileStagingUploadUploadSessionIdGetASync* | *GET* /services/file_staging/upload/{upload_session_id} | Get Upload Session Details.
*servicesFileStagingUploadUploadSessionIdPartsGetSync* | *GET* /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session.
*servicesFileStagingUploadUploadSessionIdPartsGetASync* | *GET* /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session.
*servicesFileStagingUploadUploadSessionIdPostSync* | *POST* /services/file_staging/upload/{upload_session_id} | Commit Upload Session.
*servicesFileStagingUploadUploadSessionIdPostASync* | *POST* /services/file_staging/upload/{upload_session_id} | Commit Upload Session.
*servicesFileStagingUploadUploadSessionIdPutSync* | *PUT* /services/file_staging/upload/{upload_session_id} | Upload to a Session.
*servicesFileStagingUploadUploadSessionIdPutASync* | *PUT* /services/file_staging/upload/{upload_session_id} | Upload to a Session.
*servicesJobsHistoriesGetSync* | *GET* /services/jobs/histories | Retrieve Job Histories.
*servicesJobsHistoriesGetASync* | *GET* /services/jobs/histories | Retrieve Job Histories.
*servicesJobsJobIdErrorsGetSync* | *GET* /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors.
*servicesJobsJobIdErrorsGetASync* | *GET* /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors.
*servicesJobsJobIdGetSync* | *GET* /services/jobs/{job_id} | Retrieve Job Status.
*servicesJobsJobIdGetASync* | *GET* /services/jobs/{job_id} | Retrieve Job Status.
*servicesJobsJobIdSummaryGetSync* | *GET* /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary.
*servicesJobsJobIdSummaryGetASync* | *GET* /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary.
*servicesJobsJobIdTasksGetSync* | *GET* /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks.
*servicesJobsJobIdTasksGetASync* | *GET* /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks.
*servicesJobsMonitorsGetSync* | *GET* /services/jobs/monitors | Retrieve Job Monitors.
*servicesJobsMonitorsGetASync* | *GET* /services/jobs/monitors | Retrieve Job Monitors.
*servicesJobsStartNowJobIdPostSync* | *POST* /services/jobs/start_now/{job_id} | Start Job.
*servicesJobsStartNowJobIdPostASync* | *POST* /services/jobs/start_now/{job_id} | Start Job.
*servicesLoaderExtractPostSync* | *POST* /services/loader/extract | Extract Data Files.
*servicesLoaderExtractPostASync* | *POST* /services/loader/extract | Extract Data Files.
*servicesLoaderJobIdTasksTaskIdFailurelogGetSync* | *GET* /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results.
*servicesLoaderJobIdTasksTaskIdFailurelogGetASync* | *GET* /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results.
*servicesLoaderJobIdTasksTaskIdResultsGetSync* | *GET* /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results.
*servicesLoaderJobIdTasksTaskIdResultsGetASync* | *GET* /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results.
*servicesLoaderJobIdTasksTaskIdResultsRenditionsGetSync* | *GET* /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results.
*servicesLoaderJobIdTasksTaskIdResultsRenditionsGetASync* | *GET* /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results.
*servicesLoaderJobIdTasksTaskIdSuccesslogGetSync* | *GET* /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results.
*servicesLoaderJobIdTasksTaskIdSuccesslogGetASync* | *GET* /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results.
*servicesLoaderLoadPostSync* | *POST* /services/loader/load | Load Data Objects.
*servicesLoaderLoadPostASync* | *POST* /services/loader/load | Load Data Objects.
*servicesPackageActionsValidatePostSync* | *POST* /services/package/actions/validate | Validate Package.
*servicesPackageActionsValidatePostASync* | *POST* /services/package/actions/validate | Validate Package.
*servicesPackagePostSync* | *POST* /services/package | Export Package.
*servicesPackagePostASync* | *POST* /services/package | Export Package.
*servicesPackagePutSync* | *PUT* /services/package | Import Package.
*servicesPackagePutASync* | *PUT* /services/package | Import Package.
*servicesQueuesGetSync* | *GET* /services/queues | Retrieve All Queues.
*servicesQueuesGetASync* | *GET* /services/queues | Retrieve All Queues.
*servicesQueuesQueueNameActionsDisableDeliveryPutSync* | *PUT* /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery.
*servicesQueuesQueueNameActionsDisableDeliveryPutASync* | *PUT* /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery.
*servicesQueuesQueueNameActionsEnableDeliveryPutSync* | *PUT* /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery.
*servicesQueuesQueueNameActionsEnableDeliveryPutASync* | *PUT* /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery.
*servicesQueuesQueueNameActionsResetPutSync* | *PUT* /services/queues/{queue_name}/actions/reset | Reset Queue.
*servicesQueuesQueueNameActionsResetPutASync* | *PUT* /services/queues/{queue_name}/actions/reset | Reset Queue.
*servicesQueuesQueueNameGetSync* | *GET* /services/queues/{queue_name} | Retrieve Queue Status.
*servicesQueuesQueueNameGetASync* | *GET* /services/queues/{queue_name} | Retrieve Queue Status.
*servicesVobjectVaultPackageVPackageIdActionsValidatePostSync* | *POST* /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package.
*servicesVobjectVaultPackageVPackageIdActionsValidatePostASync* | *POST* /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package.
*sessionDeleteSync* | *DELETE* /session | End Session.
*sessionDeleteASync* | *DELETE* /session | End Session.
*uicodeDistributionsDistributionNameCodeGetSync* | *GET* /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution.
*uicodeDistributionsDistributionNameCodeGetASync* | *GET* /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution.
*uicodeDistributionsDistributionNameDeleteSync* | *DELETE* /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution.
*uicodeDistributionsDistributionNameDeleteASync* | *DELETE* /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution.
*uicodeDistributionsDistributionNameGetSync* | *GET* /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata.
*uicodeDistributionsDistributionNameGetASync* | *GET* /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata.
*uicodeDistributionsGetSync* | *GET* /uicode/distributions | Retrieve All Client Code Distribution Metadata.
*uicodeDistributionsGetASync* | *GET* /uicode/distributions | Retrieve All Client Code Distribution Metadata.
*uicodeDistributionsPostSync* | *POST* /uicode/distributions | Add or Replace Single Client Code Distribution.
*uicodeDistributionsPostASync* | *POST* /uicode/distributions | Add or Replace Single Client Code Distribution.
*vobjectVaultPackageVPackageIdActionsDeployPostSync* | *POST* /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package.
*vobjectVaultPackageVPackageIdActionsDeployPostASync* | *POST* /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package.
*vobjectVaultPackageVPackageIdActionsDeployResultsGetSync* | *GET* /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results.
*vobjectVaultPackageVPackageIdActionsDeployResultsGetASync* | *GET* /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results.
*vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetSync* | *GET* /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job.
*vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetASync* | *GET* /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job.
*vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetSync* | *GET* /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job.
*vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetASync* | *GET* /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job.
*vobjectsEdlItemVActionsCreateplaceholderPostSync* | *POST* /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item.
*vobjectsEdlItemVActionsCreateplaceholderPostASync* | *POST* /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item.
*vobjectsMergesJobIdLogGetSync* | *GET* /vobjects/merges/{job_id}/log | Download Merge Records Job Log.
*vobjectsMergesJobIdLogGetASync* | *GET* /vobjects/merges/{job_id}/log | Download Merge Records Job Log.
*vobjectsMergesJobIdResultsGetSync* | *GET* /vobjects/merges/{job_id}/results | Retrieve Record Merge Results.
*vobjectsMergesJobIdResultsGetASync* | *GET* /vobjects/merges/{job_id}/results | Retrieve Record Merge Results.
*vobjectsMergesJobIdStatusGetSync* | *GET* /vobjects/merges/{job_id}/status | Retrieve Record Merge Status.
*vobjectsMergesJobIdStatusGetASync* | *GET* /vobjects/merges/{job_id}/status | Retrieve Record Merge Status.
*vobjectsObjectNameActionsActionNamePostSync* | *POST* /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records.
*vobjectsObjectNameActionsActionNamePostASync* | *POST* /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records.
*vobjectsObjectNameActionsChangetypePostSync* | *POST* /vobjects/{object_name}/actions/changetype | Change Object Type.
*vobjectsObjectNameActionsChangetypePostASync* | *POST* /vobjects/{object_name}/actions/changetype | Change Object Type.
*vobjectsObjectNameActionsMergePostSync* | *POST* /vobjects/{object_name}/actions/merge | Initiate Record Merge.
*vobjectsObjectNameActionsMergePostASync* | *POST* /vobjects/{object_name}/actions/merge | Initiate Record Merge.
*vobjectsObjectNameActionsRecalculaterollupsGetSync* | *GET* /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status.
*vobjectsObjectNameActionsRecalculaterollupsGetASync* | *GET* /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status.
*vobjectsObjectNameActionsRecalculaterollupsPostSync* | *POST* /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields.
*vobjectsObjectNameActionsRecalculaterollupsPostASync* | *POST* /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields.
*vobjectsObjectNameActionsUpdatecorporatecurrencyPutSync* | *PUT* /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields.
*vobjectsObjectNameActionsUpdatecorporatecurrencyPutASync* | *PUT* /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields.
*vobjectsObjectNameAttachmentsBatchDeleteSync* | *DELETE* /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments.
*vobjectsObjectNameAttachmentsBatchDeleteASync* | *DELETE* /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments.
*vobjectsObjectNameAttachmentsBatchPostSync* | *POST* /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments.
*vobjectsObjectNameAttachmentsBatchPostASync* | *POST* /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments.
*vobjectsObjectNameAttachmentsBatchPutSync* | *PUT* /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions.
*vobjectsObjectNameAttachmentsBatchPutASync* | *PUT* /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions.
*vobjectsObjectNameDeleteSync* | *DELETE* /vobjects/{object_name} | Delete Object Records.
*vobjectsObjectNameDeleteASync* | *DELETE* /vobjects/{object_name} | Delete Object Records.
*vobjectsObjectNameIdRolesRoleNameGetSync* | *GET* /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles.
*vobjectsObjectNameIdRolesRoleNameGetASync* | *GET* /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles.
*vobjectsObjectNameObjectRecordIdActionsActionNameGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details.
*vobjectsObjectNameObjectRecordIdActionsActionNameGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details.
*vobjectsObjectNameObjectRecordIdActionsActionNamePostSync* | *POST* /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record.
*vobjectsObjectNameObjectRecordIdActionsActionNamePostASync* | *POST* /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record.
*vobjectsObjectNameObjectRecordIdActionsCascadedeletePostSync* | *POST* /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record.
*vobjectsObjectNameObjectRecordIdActionsCascadedeletePostASync* | *POST* /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record.
*vobjectsObjectNameObjectRecordIdActionsDeepcopyPostSync* | *POST* /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record.
*vobjectsObjectNameObjectRecordIdActionsDeepcopyPostASync* | *POST* /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record.
*vobjectsObjectNameObjectRecordIdActionsGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions.
*vobjectsObjectNameObjectRecordIdActionsGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions.
*vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File.
*vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File.
*vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostSync* | *POST* /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File.
*vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostASync* | *POST* /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File.
*vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files.
*vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteSync* | *DELETE* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteASync* | *DELETE* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutSync* | *PUT* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutASync* | *PUT* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteSync* | *DELETE* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteASync* | *DELETE* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostSync* | *POST* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostASync* | *POST* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions.
*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions.
*vobjectsObjectNameObjectRecordIdAttachmentsFileGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files.
*vobjectsObjectNameObjectRecordIdAttachmentsFileGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files.
*vobjectsObjectNameObjectRecordIdAttachmentsGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments.
*vobjectsObjectNameObjectRecordIdAttachmentsGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments.
*vobjectsObjectNameObjectRecordIdAttachmentsPostSync* | *POST* /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment.
*vobjectsObjectNameObjectRecordIdAttachmentsPostASync* | *POST* /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment.
*vobjectsObjectNameObjectRecordIdAudittrailGetSync* | *GET* /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record.
*vobjectsObjectNameObjectRecordIdAudittrailGetASync* | *GET* /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record.
*vobjectsObjectNameObjectRecordIdGetSync* | *GET* /vobjects/{object_name}/{object_record_id} | Retrieve Object Record.
*vobjectsObjectNameObjectRecordIdGetASync* | *GET* /vobjects/{object_name}/{object_record_id} | Retrieve Object Record.
*vobjectsObjectNamePostSync* | *POST* /vobjects/{object_name} | Create & Upsert Object Records.
*vobjectsObjectNamePostASync* | *POST* /vobjects/{object_name} | Create & Upsert Object Records.
*vobjectsObjectNamePutSync* | *PUT* /vobjects/{object_name} | Update Object Records.
*vobjectsObjectNamePutASync* | *PUT* /vobjects/{object_name} | Update Object Records.
*vobjectsObjectNameRolesDeleteSync* | *DELETE* /vobjects/{object_name}/roles | Remove Users & Groups from Roles on Object Records.
*vobjectsObjectNameRolesDeleteASync* | *DELETE* /vobjects/{object_name}/roles | Remove Users & Groups from Roles on Object Records.
*vobjectsObjectNameRolesPostSync* | *POST* /vobjects/{object_name}/roles | Assign Users & Groups to Roles on Object Records.
*vobjectsObjectNameRolesPostASync* | *POST* /vobjects/{object_name}/roles | Assign Users & Groups to Roles on Object Records.
*vobjectsOutboundPackageVPackageIdDependenciesGetSync* | *GET* /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies.
*vobjectsOutboundPackageVPackageIdDependenciesGetASync* | *GET* /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *_vobjects__object_name__actions_merge_post_request_inner* | 

