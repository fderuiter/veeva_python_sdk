# DefaultApi

All URIs are relative to *http://}/api/v25.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiGet**](DefaultApi.md#apiGet) | **GET** /api/ | Retrieve API Versions |
| [**apiMdlComponentsComponentTypeAndRecordNameFilesGet**](DefaultApi.md#apiMdlComponentsComponentTypeAndRecordNameFilesGet) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File |
| [**apiMdlComponentsComponentTypeAndRecordNameGet**](DefaultApi.md#apiMdlComponentsComponentTypeAndRecordNameGet) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL) |
| [**apiMdlExecuteAsyncJobIdResultsGet**](DefaultApi.md#apiMdlExecuteAsyncJobIdResultsGet) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results |
| [**apiMdlExecuteAsyncPost**](DefaultApi.md#apiMdlExecuteAsyncPost) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously |
| [**apiMdlExecutePost**](DefaultApi.md#apiMdlExecutePost) | **POST** /api/mdl/execute | Execute MDL Script |
| [**apiMdlFilesPost**](DefaultApi.md#apiMdlFilesPost) | **POST** /api/mdl/files | Upload Content File |
| [**audittrailAuditTrailTypeGet**](DefaultApi.md#audittrailAuditTrailTypeGet) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details |
| [**authDiscoveryPost**](DefaultApi.md#authDiscoveryPost) | **POST** /auth/discovery | Authentication Type Discovery |
| [**authOauthSessionOathOidcProfileIdPost**](DefaultApi.md#authOauthSessionOathOidcProfileIdPost) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect |
| [**authPost**](DefaultApi.md#authPost) | **POST** /auth | User Name and Password |
| [**codeClassNameDelete**](DefaultApi.md#codeClassNameDelete) | **DELETE** /code/{class_name} | Delete Single Source Code File |
| [**codeClassNameDisablePut**](DefaultApi.md#codeClassNameDisablePut) | **PUT** /code/{class_name}/disable | Disable Vault Extension |
| [**codeClassNameEnablePut**](DefaultApi.md#codeClassNameEnablePut) | **PUT** /code/{class_name}/enable | Enable Vault Extension |
| [**codeClassNameGet**](DefaultApi.md#codeClassNameGet) | **GET** /code/{class_name} | Retrieve Single Source Code File |
| [**codeProfilerGet**](DefaultApi.md#codeProfilerGet) | **GET** /code/profiler | Retrieve All Profiling Sessions |
| [**codeProfilerPost**](DefaultApi.md#codeProfilerPost) | **POST** /code/profiler | Create Profiling Session |
| [**codeProfilerSessionNameActionsEndPost**](DefaultApi.md#codeProfilerSessionNameActionsEndPost) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session |
| [**codeProfilerSessionNameDelete**](DefaultApi.md#codeProfilerSessionNameDelete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session |
| [**codeProfilerSessionNameGet**](DefaultApi.md#codeProfilerSessionNameGet) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session |
| [**codeProfilerSessionNameResultsGet**](DefaultApi.md#codeProfilerSessionNameResultsGet) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results |
| [**codePut**](DefaultApi.md#codePut) | **PUT** /code | Add or Replace Single Source Code File |
| [**compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**](DefaultApi.md#compositesTreesEdlHierarchyOrTemplateActionsListnodesPost) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes |
| [**compositesTreesEdlHierarchyOrTemplateGet**](DefaultApi.md#compositesTreesEdlHierarchyOrTemplateGet) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes |
| [**compositesTreesEdlHierarchyVParentNodeIdChildrenGet**](DefaultApi.md#compositesTreesEdlHierarchyVParentNodeIdChildrenGet) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node&#39;s Children |
| [**compositesTreesEdlHierarchyVParentNodeIdChildrenPut**](DefaultApi.md#compositesTreesEdlHierarchyVParentNodeIdChildrenPut) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order |
| [**configurationComponentTypeAndRecordNameGet**](DefaultApi.md#configurationComponentTypeAndRecordNameGet) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON) |
| [**configurationComponentTypeGet**](DefaultApi.md#configurationComponentTypeGet) | **GET** /configuration/{component_type} | Retrieve Component Record Collection |
| [**configurationObjectNameAndObjectTypeGet**](DefaultApi.md#configurationObjectNameAndObjectTypeGet) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object |
| [**configurationObjecttypeGet**](DefaultApi.md#configurationObjecttypeGet) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types |
| [**configurationRoleAssignmentRuleDelete**](DefaultApi.md#configurationRoleAssignmentRuleDelete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules |
| [**configurationRoleAssignmentRuleGet**](DefaultApi.md#configurationRoleAssignmentRuleGet) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override) |
| [**configurationRoleAssignmentRulePost**](DefaultApi.md#configurationRoleAssignmentRulePost) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules |
| [**configurationRoleAssignmentRulePut**](DefaultApi.md#configurationRoleAssignmentRulePut) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override) |
| [**delegationLoginPost**](DefaultApi.md#delegationLoginPost) | **POST** /delegation/login | Initiate Delegated Session |
| [**delegationVaultsGet**](DefaultApi.md#delegationVaultsGet) | **GET** /delegation/vaults | Retrieve Delegations |
| [**keepAlivePost**](DefaultApi.md#keepAlivePost) | **POST** /keep-alive | Session Keep Alive |
| [**limitsGet**](DefaultApi.md#limitsGet) | **GET** /limits | Retrieve Limits on Objects |
| [**logsApiUsageGet**](DefaultApi.md#logsApiUsageGet) | **GET** /logs/api_usage | Download Daily API Usage |
| [**logsCodeDebugGet**](DefaultApi.md#logsCodeDebugGet) | **GET** /logs/code/debug | Retrieve All Debug Logs |
| [**logsCodeDebugIdActionsResetDelete**](DefaultApi.md#logsCodeDebugIdActionsResetDelete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log |
| [**logsCodeDebugIdActionsResetPost**](DefaultApi.md#logsCodeDebugIdActionsResetPost) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log |
| [**logsCodeDebugIdFilesGet**](DefaultApi.md#logsCodeDebugIdFilesGet) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files |
| [**logsCodeDebugIdGet**](DefaultApi.md#logsCodeDebugIdGet) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log |
| [**logsCodeDebugPost**](DefaultApi.md#logsCodeDebugPost) | **POST** /logs/code/debug | Create Debug Log |
| [**logsCodeRuntimeGet**](DefaultApi.md#logsCodeRuntimeGet) | **GET** /logs/code/runtime | Download SDK Runtime Log |
| [**messagesMessageTypeActionsImportPost**](DefaultApi.md#messagesMessageTypeActionsImportPost) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File |
| [**messagesMessageTypeLanguageLangActionsExportPost**](DefaultApi.md#messagesMessageTypeLanguageLangActionsExportPost) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File |
| [**metadataAudittrailAuditTrailTypeGet**](DefaultApi.md#metadataAudittrailAuditTrailTypeGet) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata |
| [**metadataAudittrailGet**](DefaultApi.md#metadataAudittrailGet) | **GET** /metadata/audittrail | Retrieve Audit Types |
| [**metadataComponentsComponentTypeGet**](DefaultApi.md#metadataComponentsComponentTypeGet) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata |
| [**metadataComponentsGet**](DefaultApi.md#metadataComponentsGet) | **GET** /metadata/components | Retrieve All Component Metadata |
| [**metadataObjectsBindersTemplatesBindernodesGet**](DefaultApi.md#metadataObjectsBindersTemplatesBindernodesGet) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata |
| [**metadataObjectsBindersTemplatesGet**](DefaultApi.md#metadataObjectsBindersTemplatesGet) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata |
| [**metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**](DefaultApi.md#metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata |
| [**metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**](DefaultApi.md#metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata |
| [**metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**](DefaultApi.md#metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata |
| [**metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**](DefaultApi.md#metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata |
| [**metadataObjectsDocumentsEventsGet**](DefaultApi.md#metadataObjectsDocumentsEventsGet) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes |
| [**metadataObjectsDocumentsLockGet**](DefaultApi.md#metadataObjectsDocumentsLockGet) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata |
| [**metadataObjectsDocumentsPropertiesFindCommonPost**](DefaultApi.md#metadataObjectsDocumentsPropertiesFindCommonPost) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields |
| [**metadataObjectsDocumentsPropertiesGet**](DefaultApi.md#metadataObjectsDocumentsPropertiesGet) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields |
| [**metadataObjectsDocumentsTemplatesGet**](DefaultApi.md#metadataObjectsDocumentsTemplatesGet) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata |
| [**metadataObjectsDocumentsTypesGet**](DefaultApi.md#metadataObjectsDocumentsTypesGet) | **GET** /metadata/objects/documents/types | Retrieve All Document Types |
| [**metadataObjectsDocumentsTypesTypeGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeGet) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type |
| [**metadataObjectsDocumentsTypesTypeRelationshipsGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeRelationshipsGet) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships |
| [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification |
| [**metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype |
| [**metadataObjectsGroupsGet**](DefaultApi.md#metadataObjectsGroupsGet) | **GET** /metadata/objects/groups | Retrieve Group Metadata |
| [**metadataObjectsSecuritypoliciesGet**](DefaultApi.md#metadataObjectsSecuritypoliciesGet) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata |
| [**metadataObjectsUsersGet**](DefaultApi.md#metadataObjectsUsersGet) | **GET** /metadata/objects/users | Retrieve User Metadata |
| [**metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultApi.md#metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata |
| [**metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultApi.md#metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata |
| [**metadataVobjectsGet**](DefaultApi.md#metadataVobjectsGet) | **GET** /metadata/vobjects | Retrieve Object Collection |
| [**metadataVobjectsObjectNameActionsCanceldeploymentPost**](DefaultApi.md#metadataVobjectsObjectNameActionsCanceldeploymentPost) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment |
| [**metadataVobjectsObjectNameFieldsObjectFieldNameGet**](DefaultApi.md#metadataVobjectsObjectNameFieldsObjectFieldNameGet) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata |
| [**metadataVobjectsObjectNameGet**](DefaultApi.md#metadataVobjectsObjectNameGet) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata |
| [**metadataVobjectsObjectNamePageLayoutsGet**](DefaultApi.md#metadataVobjectsObjectNamePageLayoutsGet) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts |
| [**metadataVobjectsObjectNamePageLayoutsLayoutNameGet**](DefaultApi.md#metadataVobjectsObjectNamePageLayoutsLayoutNameGet) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata |
| [**notificationsHistoriesGet**](DefaultApi.md#notificationsHistoriesGet) | **GET** /notifications/histories | Retrieve Email Notification Histories |
| [**objectWorkflowActionsActionGet**](DefaultApi.md#objectWorkflowActionsActionGet) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details |
| [**objectWorkflowActionsActionPost**](DefaultApi.md#objectWorkflowActionsActionPost) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows |
| [**objectWorkflowActionsCanceltasksPost**](DefaultApi.md#objectWorkflowActionsCanceltasksPost) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks |
| [**objectWorkflowActionsCancelworkflowsPost**](DefaultApi.md#objectWorkflowActionsCancelworkflowsPost) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows |
| [**objectWorkflowActionsGet**](DefaultApi.md#objectWorkflowActionsGet) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions |
| [**objectWorkflowActionsReassigntasksPost**](DefaultApi.md#objectWorkflowActionsReassigntasksPost) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks |
| [**objectWorkflowActionsReplaceworkflowownerPost**](DefaultApi.md#objectWorkflowActionsReplaceworkflowownerPost) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner |
| [**objectsBindersActionsExportJobIdResultsGet**](DefaultApi.md#objectsBindersActionsExportJobIdResultsGet) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results |
| [**objectsBindersBinderIdActionsExportPost**](DefaultApi.md#objectsBindersBinderIdActionsExportPost) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version) |
| [**objectsBindersBinderIdActionsPost**](DefaultApi.md#objectsBindersBinderIdActionsPost) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing |
| [**objectsBindersBinderIdBindingRulePut**](DefaultApi.md#objectsBindersBinderIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule |
| [**objectsBindersBinderIdDelete**](DefaultApi.md#objectsBindersBinderIdDelete) | **DELETE** /objects/binders/{binder_id} | Delete Binder |
| [**objectsBindersBinderIdDocumentsNodeIdBindingRulePut**](DefaultApi.md#objectsBindersBinderIdDocumentsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule |
| [**objectsBindersBinderIdDocumentsPost**](DefaultApi.md#objectsBindersBinderIdDocumentsPost) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder |
| [**objectsBindersBinderIdDocumentsSectionIdDelete**](DefaultApi.md#objectsBindersBinderIdDocumentsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder |
| [**objectsBindersBinderIdDocumentsSectionIdPut**](DefaultApi.md#objectsBindersBinderIdDocumentsSectionIdPut) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder |
| [**objectsBindersBinderIdGet**](DefaultApi.md#objectsBindersBinderIdGet) | **GET** /objects/binders/{binder_id} | Retrieve Binder |
| [**objectsBindersBinderIdPost**](DefaultApi.md#objectsBindersBinderIdPost) | **POST** /objects/binders/{binder_id} | Create Binder Version |
| [**objectsBindersBinderIdPut**](DefaultApi.md#objectsBindersBinderIdPut) | **PUT** /objects/binders/{binder_id} | Update Binder |
| [**objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultApi.md#objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder |
| [**objectsBindersBinderIdSectionsNodeIdBindingRulePut**](DefaultApi.md#objectsBindersBinderIdSectionsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule |
| [**objectsBindersBinderIdSectionsNodeIdPut**](DefaultApi.md#objectsBindersBinderIdSectionsNodeIdPut) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section |
| [**objectsBindersBinderIdSectionsPost**](DefaultApi.md#objectsBindersBinderIdSectionsPost) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section |
| [**objectsBindersBinderIdSectionsSectionIdDelete**](DefaultApi.md#objectsBindersBinderIdSectionsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section |
| [**objectsBindersBinderIdSectionsSectionIdGet**](DefaultApi.md#objectsBindersBinderIdSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections |
| [**objectsBindersBinderIdVersionsGet**](DefaultApi.md#objectsBindersBinderIdVersionsGet) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version) |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship |
| [**objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section |
| [**objectsBindersIdRolesGet**](DefaultApi.md#objectsBindersIdRolesGet) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles |
| [**objectsBindersIdRolesPost**](DefaultApi.md#objectsBindersIdRolesPost) | **POST** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder |
| [**objectsBindersIdRolesRoleNameGet**](DefaultApi.md#objectsBindersIdRolesRoleNameGet) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role |
| [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions |
| [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria |
| [**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action |
| [**objectsBindersLifecycleActionsPost**](DefaultApi.md#objectsBindersLifecycleActionsPost) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders |
| [**objectsBindersLifecycleActionsUserActionNamePut**](DefaultApi.md#objectsBindersLifecycleActionsUserActionNamePut) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions |
| [**objectsBindersPost**](DefaultApi.md#objectsBindersPost) | **POST** /objects/binders | Create Binder |
| [**objectsBindersTemplatesGet**](DefaultApi.md#objectsBindersTemplatesGet) | **GET** /objects/binders/templates | Retrieve Binder Template Collection |
| [**objectsBindersTemplatesPost**](DefaultApi.md#objectsBindersTemplatesPost) | **POST** /objects/binders/templates | Create Binder Template |
| [**objectsBindersTemplatesPut**](DefaultApi.md#objectsBindersTemplatesPut) | **PUT** /objects/binders/templates | Update Binder Template |
| [**objectsBindersTemplatesTemplateNameBindernodesGet**](DefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesGet) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes |
| [**objectsBindersTemplatesTemplateNameBindernodesPost**](DefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesPost) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node |
| [**objectsBindersTemplatesTemplateNameBindernodesPut**](DefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesPut) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes |
| [**objectsBindersTemplatesTemplateNameDelete**](DefaultApi.md#objectsBindersTemplatesTemplateNameDelete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template |
| [**objectsBindersTemplatesTemplateNameGet**](DefaultApi.md#objectsBindersTemplatesTemplateNameGet) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes |
| [**objectsDeletionsDocumentsGet**](DefaultApi.md#objectsDeletionsDocumentsGet) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs |
| [**objectsDeletionsVobjectsObjectNameGet**](DefaultApi.md#objectsDeletionsVobjectsObjectNameGet) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID |
| [**objectsDocumentsActionsGet**](DefaultApi.md#objectsDocumentsActionsGet) | **GET** /objects/documents/actions | Retrieve All Document Workflows |
| [**objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**](DefaultApi.md#objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results |
| [**objectsDocumentsActionsWorkflowNameGet**](DefaultApi.md#objectsDocumentsActionsWorkflowNameGet) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details |
| [**objectsDocumentsActionsWorkflowNamePost**](DefaultApi.md#objectsDocumentsActionsWorkflowNamePost) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow |
| [**objectsDocumentsAnnotationsBatchDelete**](DefaultApi.md#objectsDocumentsAnnotationsBatchDelete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations |
| [**objectsDocumentsAnnotationsBatchPost**](DefaultApi.md#objectsDocumentsAnnotationsBatchPost) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations |
| [**objectsDocumentsAnnotationsBatchPut**](DefaultApi.md#objectsDocumentsAnnotationsBatchPut) | **PUT** /objects/documents/annotations/batch | Update Annotations |
| [**objectsDocumentsAnnotationsRepliesBatchPost**](DefaultApi.md#objectsDocumentsAnnotationsRepliesBatchPost) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies |
| [**objectsDocumentsAttachmentsBatchDelete**](DefaultApi.md#objectsDocumentsAttachmentsBatchDelete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments |
| [**objectsDocumentsAttachmentsBatchPost**](DefaultApi.md#objectsDocumentsAttachmentsBatchPost) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments |
| [**objectsDocumentsAttachmentsBatchPut**](DefaultApi.md#objectsDocumentsAttachmentsBatchPut) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions |
| [**objectsDocumentsBatchActionsFileextractJobIdResultsGet**](DefaultApi.md#objectsDocumentsBatchActionsFileextractJobIdResultsGet) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results |
| [**objectsDocumentsBatchActionsFileextractPost**](DefaultApi.md#objectsDocumentsBatchActionsFileextractPost) | **POST** /objects/documents/batch/actions/fileextract | Export Documents |
| [**objectsDocumentsBatchActionsReclassifyPut**](DefaultApi.md#objectsDocumentsBatchActionsReclassifyPut) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents |
| [**objectsDocumentsBatchActionsRerenderPost**](DefaultApi.md#objectsDocumentsBatchActionsRerenderPost) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions |
| [**objectsDocumentsBatchDelete**](DefaultApi.md#objectsDocumentsBatchDelete) | **DELETE** /objects/documents/batch | Delete Multiple Documents |
| [**objectsDocumentsBatchLockDelete**](DefaultApi.md#objectsDocumentsBatchLockDelete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout |
| [**objectsDocumentsBatchPost**](DefaultApi.md#objectsDocumentsBatchPost) | **POST** /objects/documents/batch | Create Multiple Documents |
| [**objectsDocumentsBatchPut**](DefaultApi.md#objectsDocumentsBatchPut) | **PUT** /objects/documents/batch | Update Multiple Documents |
| [**objectsDocumentsDocIdAnchorsGet**](DefaultApi.md#objectsDocumentsDocIdAnchorsGet) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs |
| [**objectsDocumentsDocIdAnnotationsFileGet**](DefaultApi.md#objectsDocumentsDocIdAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF |
| [**objectsDocumentsDocIdAnnotationsFilePost**](DefaultApi.md#objectsDocumentsDocIdAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdDelete**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdPut**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdPut) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version |
| [**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions |
| [**objectsDocumentsDocIdAttachmentsFileGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments |
| [**objectsDocumentsDocIdAttachmentsGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsGet) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments |
| [**objectsDocumentsDocIdAttachmentsPost**](DefaultApi.md#objectsDocumentsDocIdAttachmentsPost) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment |
| [**objectsDocumentsDocIdAudittrailGet**](DefaultApi.md#objectsDocumentsDocIdAudittrailGet) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document |
| [**objectsDocumentsDocIdDelete**](DefaultApi.md#objectsDocumentsDocIdDelete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document |
| [**objectsDocumentsDocIdEventsGet**](DefaultApi.md#objectsDocumentsDocIdEventsGet) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events |
| [**objectsDocumentsDocIdFileGet**](DefaultApi.md#objectsDocumentsDocIdFileGet) | **GET** /objects/documents/{doc_id}/file | Download Document File |
| [**objectsDocumentsDocIdGet**](DefaultApi.md#objectsDocumentsDocIdGet) | **GET** /objects/documents/{doc_id} | Retrieve Document |
| [**objectsDocumentsDocIdLockDelete**](DefaultApi.md#objectsDocumentsDocIdLockDelete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock |
| [**objectsDocumentsDocIdLockGet**](DefaultApi.md#objectsDocumentsDocIdLockGet) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock |
| [**objectsDocumentsDocIdLockPost**](DefaultApi.md#objectsDocumentsDocIdLockPost) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock |
| [**objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**](DefaultApi.md#objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments |
| [**objectsDocumentsDocIdPost**](DefaultApi.md#objectsDocumentsDocIdPost) | **POST** /objects/documents/{doc_id} | Create Single Document Version |
| [**objectsDocumentsDocIdPut**](DefaultApi.md#objectsDocumentsDocIdPut) | **PUT** /objects/documents/{doc_id} | Update Single Document |
| [**objectsDocumentsDocIdRenditionsGet**](DefaultApi.md#objectsDocumentsDocIdRenditionsGet) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions |
| [**objectsDocumentsDocIdRenditionsRenditionTypeDelete**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition |
| [**objectsDocumentsDocIdRenditionsRenditionTypeGet**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File |
| [**objectsDocumentsDocIdRenditionsRenditionTypePost**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition |
| [**objectsDocumentsDocIdRenditionsRenditionTypePut**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition |
| [**objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultApi.md#objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document |
| [**objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**](DefaultApi.md#objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments |
| [**objectsDocumentsDocIdVersionsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsGet) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition |
| [**objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File |
| [**objectsDocumentsGet**](DefaultApi.md#objectsDocumentsGet) | **GET** /objects/documents | Retrieve All Documents |
| [**objectsDocumentsIdRolesGet**](DefaultApi.md#objectsDocumentsIdRolesGet) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles |
| [**objectsDocumentsIdRolesPost**](DefaultApi.md#objectsDocumentsIdRolesPost) | **POST** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document |
| [**objectsDocumentsIdRolesRoleNameGet**](DefaultApi.md#objectsDocumentsIdRolesRoleNameGet) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role |
| [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions |
| [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria |
| [**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action |
| [**objectsDocumentsLifecycleActionsPost**](DefaultApi.md#objectsDocumentsLifecycleActionsPost) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents |
| [**objectsDocumentsLifecycleActionsUserActionNamePut**](DefaultApi.md#objectsDocumentsLifecycleActionsUserActionNamePut) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions |
| [**objectsDocumentsPost**](DefaultApi.md#objectsDocumentsPost) | **POST** /objects/documents | Create Single Document |
| [**objectsDocumentsRelationshipsBatchDelete**](DefaultApi.md#objectsDocumentsRelationshipsBatchDelete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships |
| [**objectsDocumentsRelationshipsBatchPost**](DefaultApi.md#objectsDocumentsRelationshipsBatchPost) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships |
| [**objectsDocumentsRenditionsBatchDelete**](DefaultApi.md#objectsDocumentsRenditionsBatchDelete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions |
| [**objectsDocumentsRenditionsBatchPost**](DefaultApi.md#objectsDocumentsRenditionsBatchPost) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions |
| [**objectsDocumentsRolesBatchDelete**](DefaultApi.md#objectsDocumentsRolesBatchDelete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders |
| [**objectsDocumentsRolesBatchPost**](DefaultApi.md#objectsDocumentsRolesBatchPost) | **POST** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders |
| [**objectsDocumentsTemplatesGet**](DefaultApi.md#objectsDocumentsTemplatesGet) | **GET** /objects/documents/templates | Retrieve Document Template Collection |
| [**objectsDocumentsTemplatesPost**](DefaultApi.md#objectsDocumentsTemplatesPost) | **POST** /objects/documents/templates | Create Single Document Template |
| [**objectsDocumentsTemplatesPut**](DefaultApi.md#objectsDocumentsTemplatesPut) | **PUT** /objects/documents/templates | Update Multiple Document Templates |
| [**objectsDocumentsTemplatesTemplateNameDelete**](DefaultApi.md#objectsDocumentsTemplatesTemplateNameDelete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template |
| [**objectsDocumentsTemplatesTemplateNameFileGet**](DefaultApi.md#objectsDocumentsTemplatesTemplateNameFileGet) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File |
| [**objectsDocumentsTemplatesTemplateNameGet**](DefaultApi.md#objectsDocumentsTemplatesTemplateNameGet) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes |
| [**objectsDocumentsTemplatesTemplateNamePut**](DefaultApi.md#objectsDocumentsTemplatesTemplateNamePut) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template |
| [**objectsDocumentsTokensPost**](DefaultApi.md#objectsDocumentsTokensPost) | **POST** /objects/documents/tokens | Document Tokens |
| [**objectsDocumentsVersionsBatchActionsFileextractPost**](DefaultApi.md#objectsDocumentsVersionsBatchActionsFileextractPost) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions |
| [**objectsDocumentsVersionsBatchDelete**](DefaultApi.md#objectsDocumentsVersionsBatchDelete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions |
| [**objectsDocumentsVersionsBatchPost**](DefaultApi.md#objectsDocumentsVersionsBatchPost) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions |
| [**objectsDomainGet**](DefaultApi.md#objectsDomainGet) | **GET** /objects/domain | Retrieve Domain Information |
| [**objectsDomainsGet**](DefaultApi.md#objectsDomainsGet) | **GET** /objects/domains | Retrieve Domains |
| [**objectsEdlMatchedDocumentsBatchActionsAddPost**](DefaultApi.md#objectsEdlMatchedDocumentsBatchActionsAddPost) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents |
| [**objectsEdlMatchedDocumentsBatchActionsRemovePost**](DefaultApi.md#objectsEdlMatchedDocumentsBatchActionsRemovePost) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents |
| [**objectsGroupsAutoGet**](DefaultApi.md#objectsGroupsAutoGet) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups |
| [**objectsGroupsGet**](DefaultApi.md#objectsGroupsGet) | **GET** /objects/groups | Retrieve All Groups |
| [**objectsGroupsGroupIdDelete**](DefaultApi.md#objectsGroupsGroupIdDelete) | **DELETE** /objects/groups/{group_id} | Delete Group |
| [**objectsGroupsGroupIdGet**](DefaultApi.md#objectsGroupsGroupIdGet) | **GET** /objects/groups/{group_id} | Retrieve Group |
| [**objectsGroupsGroupIdPut**](DefaultApi.md#objectsGroupsGroupIdPut) | **PUT** /objects/groups/{group_id} | Update Group |
| [**objectsGroupsPost**](DefaultApi.md#objectsGroupsPost) | **POST** /objects/groups | Create Group  |
| [**objectsLicensesGet**](DefaultApi.md#objectsLicensesGet) | **GET** /objects/licenses | Retrieve Application License Usage |
| [**objectsObjectworkflowsActionsGet**](DefaultApi.md#objectsObjectworkflowsActionsGet) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows |
| [**objectsObjectworkflowsActionsWorkflowNameGet**](DefaultApi.md#objectsObjectworkflowsActionsWorkflowNameGet) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details |
| [**objectsObjectworkflowsActionsWorkflowNamePost**](DefaultApi.md#objectsObjectworkflowsActionsWorkflowNamePost) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow |
| [**objectsObjectworkflowsGet**](DefaultApi.md#objectsObjectworkflowsGet) | **GET** /objects/objectworkflows | Retrieve Workflows |
| [**objectsObjectworkflowsTasksGet**](DefaultApi.md#objectsObjectworkflowsTasksGet) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks |
| [**objectsObjectworkflowsTasksTaskIdActionsAcceptPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsAcceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task |
| [**objectsObjectworkflowsTasksTaskIdActionsCancelPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsCancelPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task |
| [**objectsObjectworkflowsTasksTaskIdActionsCompletePost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsCompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task |
| [**objectsObjectworkflowsTasksTaskIdActionsGet**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions |
| [**objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task |
| [**objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task |
| [**objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content |
| [**objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task |
| [**objectsObjectworkflowsTasksTaskIdActionsReassignPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsReassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task |
| [**objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsTaskActionGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details |
| [**objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance |
| [**objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date |
| [**objectsObjectworkflowsTasksTaskIdGet**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdGet) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details |
| [**objectsObjectworkflowsWorkflowIdActionsGet**](DefaultApi.md#objectsObjectworkflowsWorkflowIdActionsGet) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions |
| [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**](DefaultApi.md#objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details |
| [**objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**](DefaultApi.md#objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action |
| [**objectsObjectworkflowsWorkflowIdGet**](DefaultApi.md#objectsObjectworkflowsWorkflowIdGet) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details |
| [**objectsPicklistsGet**](DefaultApi.md#objectsPicklistsGet) | **GET** /objects/picklists | Retrieve All Picklists |
| [**objectsPicklistsPicklistNameGet**](DefaultApi.md#objectsPicklistsPicklistNameGet) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values |
| [**objectsPicklistsPicklistNamePicklistValueNameDelete**](DefaultApi.md#objectsPicklistsPicklistNamePicklistValueNameDelete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value |
| [**objectsPicklistsPicklistNamePicklistValueNamePut**](DefaultApi.md#objectsPicklistsPicklistNamePicklistValueNamePut) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value |
| [**objectsPicklistsPicklistNamePost**](DefaultApi.md#objectsPicklistsPicklistNamePost) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values |
| [**objectsPicklistsPicklistNamePut**](DefaultApi.md#objectsPicklistsPicklistNamePut) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label |
| [**objectsSandboxActionsBuildproductionPost**](DefaultApi.md#objectsSandboxActionsBuildproductionPost) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault |
| [**objectsSandboxActionsPromoteproductionPost**](DefaultApi.md#objectsSandboxActionsPromoteproductionPost) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production |
| [**objectsSandboxActionsRecheckusagePost**](DefaultApi.md#objectsSandboxActionsRecheckusagePost) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit |
| [**objectsSandboxBatchChangesizePost**](DefaultApi.md#objectsSandboxBatchChangesizePost) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size |
| [**objectsSandboxEntitlementsSetPost**](DefaultApi.md#objectsSandboxEntitlementsSetPost) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements |
| [**objectsSandboxGet**](DefaultApi.md#objectsSandboxGet) | **GET** /objects/sandbox | Retrieve Sandboxes |
| [**objectsSandboxNameDelete**](DefaultApi.md#objectsSandboxNameDelete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox |
| [**objectsSandboxPost**](DefaultApi.md#objectsSandboxPost) | **POST** /objects/sandbox | Create or Refresh Sandbox |
| [**objectsSandboxSnapshotApiNameActionsUpdatePost**](DefaultApi.md#objectsSandboxSnapshotApiNameActionsUpdatePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot |
| [**objectsSandboxSnapshotApiNameActionsUpgradePost**](DefaultApi.md#objectsSandboxSnapshotApiNameActionsUpgradePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot |
| [**objectsSandboxSnapshotApiNameDelete**](DefaultApi.md#objectsSandboxSnapshotApiNameDelete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot |
| [**objectsSandboxSnapshotGet**](DefaultApi.md#objectsSandboxSnapshotGet) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots |
| [**objectsSandboxSnapshotPost**](DefaultApi.md#objectsSandboxSnapshotPost) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot |
| [**objectsSandboxVaultIdActionsRefreshPost**](DefaultApi.md#objectsSandboxVaultIdActionsRefreshPost) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot |
| [**objectsSandboxVaultIdGet**](DefaultApi.md#objectsSandboxVaultIdGet) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID |
| [**objectsSecuritypoliciesGet**](DefaultApi.md#objectsSecuritypoliciesGet) | **GET** /objects/securitypolicies | Retrieve All Security Policies |
| [**objectsSecuritypoliciesSecurityPolicyNameGet**](DefaultApi.md#objectsSecuritypoliciesSecurityPolicyNameGet) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy |
| [**objectsUsersGet**](DefaultApi.md#objectsUsersGet) | **GET** /objects/users/ | Retrieve All Users |
| [**objectsUsersIdGet**](DefaultApi.md#objectsUsersIdGet) | **GET** /objects/users/{id} | Retrieve User |
| [**objectsUsersIdPermissionsGet**](DefaultApi.md#objectsUsersIdPermissionsGet) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions |
| [**objectsUsersIdPut**](DefaultApi.md#objectsUsersIdPut) | **PUT** /objects/users/{id} | Update Single User |
| [**objectsUsersMeGet**](DefaultApi.md#objectsUsersMeGet) | **GET** /objects/users/me | Validate Session User |
| [**objectsUsersMePasswordPost**](DefaultApi.md#objectsUsersMePasswordPost) | **POST** /objects/users/me/password | Change My Password |
| [**objectsUsersMePermissionsGet**](DefaultApi.md#objectsUsersMePermissionsGet) | **GET** /objects/users/me/permissions | Retrieve My User Permissions |
| [**objectsUsersMePut**](DefaultApi.md#objectsUsersMePut) | **PUT** /objects/users/me | Update My User |
| [**objectsUsersPost**](DefaultApi.md#objectsUsersPost) | **POST** /objects/users | Create Single User |
| [**objectsUsersPut**](DefaultApi.md#objectsUsersPut) | **PUT** /objects/users | Update Multiple Users |
| [**objectsUsersUserIdDelete**](DefaultApi.md#objectsUsersUserIdDelete) | **DELETE** /objects/users/{user_id} | Disable User |
| [**objectsUsersUserIdVaultMembershipVaultIdPut**](DefaultApi.md#objectsUsersUserIdVaultMembershipVaultIdPut) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership |
| [**objectsVaultActionsComparePost**](DefaultApi.md#objectsVaultActionsComparePost) | **POST** /objects/vault/actions/compare | Vault Compare |
| [**objectsVaultActionsConfigreportPost**](DefaultApi.md#objectsVaultActionsConfigreportPost) | **POST** /objects/vault/actions/configreport | Vault Configuration Report |
| [**queryComponentsPost**](DefaultApi.md#queryComponentsPost) | **POST** /query/components | Component Definition Query |
| [**queryNextPagePost**](DefaultApi.md#queryNextPagePost) | **POST** /query/{next_page} | Next Page URL |
| [**queryPost**](DefaultApi.md#queryPost) | **POST** /query | Submitting a Query |
| [**queryPreviousPagePost**](DefaultApi.md#queryPreviousPagePost) | **POST** /query/{previous_page} | Previous Page URL |
| [**scimV2MeGet**](DefaultApi.md#scimV2MeGet) | **GET** /scim/v2/Me | Retrieve Current User with SCIM |
| [**scimV2MePut**](DefaultApi.md#scimV2MePut) | **PUT** /scim/v2/Me | Update Current User with SCIM |
| [**scimV2ResourceTypesGet**](DefaultApi.md#scimV2ResourceTypesGet) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types |
| [**scimV2ResourceTypesTypeGet**](DefaultApi.md#scimV2ResourceTypesTypeGet) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type |
| [**scimV2SchemasGet**](DefaultApi.md#scimV2SchemasGet) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information |
| [**scimV2SchemasIdGet**](DefaultApi.md#scimV2SchemasIdGet) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information |
| [**scimV2ServiceProviderConfigGet**](DefaultApi.md#scimV2ServiceProviderConfigGet) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider |
| [**scimV2TypeGet**](DefaultApi.md#scimV2TypeGet) | **GET** /scim/v2/{type} | Retrieve SCIM Resources |
| [**scimV2TypeIdGet**](DefaultApi.md#scimV2TypeIdGet) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource |
| [**scimV2UsersGet**](DefaultApi.md#scimV2UsersGet) | **GET** /scim/v2/Users | Retrieve All Users with SCIM |
| [**scimV2UsersIdGet**](DefaultApi.md#scimV2UsersIdGet) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM |
| [**scimV2UsersIdPut**](DefaultApi.md#scimV2UsersIdPut) | **PUT** /scim/v2/Users/{id} | Update User with SCIM |
| [**scimV2UsersPost**](DefaultApi.md#scimV2UsersPost) | **POST** /scim/v2/Users | Create User with SCIM |
| [**servicesCertificateCertIdGet**](DefaultApi.md#servicesCertificateCertIdGet) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate |
| [**servicesConfigurationModeActionsDisablePost**](DefaultApi.md#servicesConfigurationModeActionsDisablePost) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode |
| [**servicesConfigurationModeActionsEnablePost**](DefaultApi.md#servicesConfigurationModeActionsEnablePost) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode |
| [**servicesDirectdataFilesGet**](DefaultApi.md#servicesDirectdataFilesGet) | **GET** /services/directdata/files | Retrieve Available Direct Data Files |
| [**servicesDirectdataFilesNameGet**](DefaultApi.md#servicesDirectdataFilesNameGet) | **GET** /services/directdata/files/{name} | Download Direct Data File |
| [**servicesFileStagingItemsContentItemGet**](DefaultApi.md#servicesFileStagingItemsContentItemGet) | **GET** /services/file_staging/items/content/{item} | Download Item Content |
| [**servicesFileStagingItemsItemDelete**](DefaultApi.md#servicesFileStagingItemsItemDelete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder |
| [**servicesFileStagingItemsItemGet**](DefaultApi.md#servicesFileStagingItemsItemGet) | **GET** /services/file_staging/items/{item} | List Items at a Path |
| [**servicesFileStagingItemsItemPut**](DefaultApi.md#servicesFileStagingItemsItemPut) | **PUT** /services/file_staging/items/{item} | Update Folder or File |
| [**servicesFileStagingItemsPost**](DefaultApi.md#servicesFileStagingItemsPost) | **POST** /services/file_staging/items | Create Folder or File |
| [**servicesFileStagingUploadGet**](DefaultApi.md#servicesFileStagingUploadGet) | **GET** /services/file_staging/upload/ | List Upload Sessions |
| [**servicesFileStagingUploadPost**](DefaultApi.md#servicesFileStagingUploadPost) | **POST** /services/file_staging/upload | Create Resumable Upload Session |
| [**servicesFileStagingUploadUploadSessionIdDelete**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdDelete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session |
| [**servicesFileStagingUploadUploadSessionIdGet**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdGet) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details |
| [**servicesFileStagingUploadUploadSessionIdPartsGet**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdPartsGet) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session |
| [**servicesFileStagingUploadUploadSessionIdPost**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdPost) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session |
| [**servicesFileStagingUploadUploadSessionIdPut**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdPut) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session |
| [**servicesJobsHistoriesGet**](DefaultApi.md#servicesJobsHistoriesGet) | **GET** /services/jobs/histories | Retrieve Job Histories |
| [**servicesJobsJobIdErrorsGet**](DefaultApi.md#servicesJobsJobIdErrorsGet) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors |
| [**servicesJobsJobIdGet**](DefaultApi.md#servicesJobsJobIdGet) | **GET** /services/jobs/{job_id} | Retrieve Job Status |
| [**servicesJobsJobIdSummaryGet**](DefaultApi.md#servicesJobsJobIdSummaryGet) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary |
| [**servicesJobsJobIdTasksGet**](DefaultApi.md#servicesJobsJobIdTasksGet) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks |
| [**servicesJobsMonitorsGet**](DefaultApi.md#servicesJobsMonitorsGet) | **GET** /services/jobs/monitors | Retrieve Job Monitors |
| [**servicesJobsStartNowJobIdPost**](DefaultApi.md#servicesJobsStartNowJobIdPost) | **POST** /services/jobs/start_now/{job_id} | Start Job |
| [**servicesLoaderExtractPost**](DefaultApi.md#servicesLoaderExtractPost) | **POST** /services/loader/extract | Extract Data Files |
| [**servicesLoaderJobIdTasksTaskIdFailurelogGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdFailurelogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results |
| [**servicesLoaderJobIdTasksTaskIdResultsGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdResultsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results |
| [**servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdResultsRenditionsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results |
| [**servicesLoaderJobIdTasksTaskIdSuccesslogGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdSuccesslogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results |
| [**servicesLoaderLoadPost**](DefaultApi.md#servicesLoaderLoadPost) | **POST** /services/loader/load | Load Data Objects |
| [**servicesPackageActionsValidatePost**](DefaultApi.md#servicesPackageActionsValidatePost) | **POST** /services/package/actions/validate | Validate Package |
| [**servicesPackagePost**](DefaultApi.md#servicesPackagePost) | **POST** /services/package | Export Package |
| [**servicesPackagePut**](DefaultApi.md#servicesPackagePut) | **PUT** /services/package | Import Package |
| [**servicesQueuesGet**](DefaultApi.md#servicesQueuesGet) | **GET** /services/queues | Retrieve All Queues |
| [**servicesQueuesQueueNameActionsDisableDeliveryPut**](DefaultApi.md#servicesQueuesQueueNameActionsDisableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery |
| [**servicesQueuesQueueNameActionsEnableDeliveryPut**](DefaultApi.md#servicesQueuesQueueNameActionsEnableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery |
| [**servicesQueuesQueueNameActionsResetPut**](DefaultApi.md#servicesQueuesQueueNameActionsResetPut) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue |
| [**servicesQueuesQueueNameGet**](DefaultApi.md#servicesQueuesQueueNameGet) | **GET** /services/queues/{queue_name} | Retrieve Queue Status |
| [**servicesVobjectVaultPackageVPackageIdActionsValidatePost**](DefaultApi.md#servicesVobjectVaultPackageVPackageIdActionsValidatePost) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package |
| [**sessionDelete**](DefaultApi.md#sessionDelete) | **DELETE** /session | End Session |
| [**uicodeDistributionsDistributionNameCodeGet**](DefaultApi.md#uicodeDistributionsDistributionNameCodeGet) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution |
| [**uicodeDistributionsDistributionNameDelete**](DefaultApi.md#uicodeDistributionsDistributionNameDelete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution |
| [**uicodeDistributionsDistributionNameGet**](DefaultApi.md#uicodeDistributionsDistributionNameGet) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata |
| [**uicodeDistributionsGet**](DefaultApi.md#uicodeDistributionsGet) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata |
| [**uicodeDistributionsPost**](DefaultApi.md#uicodeDistributionsPost) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution |
| [**vobjectVaultPackageVPackageIdActionsDeployPost**](DefaultApi.md#vobjectVaultPackageVPackageIdActionsDeployPost) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package |
| [**vobjectVaultPackageVPackageIdActionsDeployResultsGet**](DefaultApi.md#vobjectVaultPackageVPackageIdActionsDeployResultsGet) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results |
| [**vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**](DefaultApi.md#vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job |
| [**vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**](DefaultApi.md#vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job |
| [**vobjectsEdlItemVActionsCreateplaceholderPost**](DefaultApi.md#vobjectsEdlItemVActionsCreateplaceholderPost) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item |
| [**vobjectsMergesJobIdLogGet**](DefaultApi.md#vobjectsMergesJobIdLogGet) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log |
| [**vobjectsMergesJobIdResultsGet**](DefaultApi.md#vobjectsMergesJobIdResultsGet) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results |
| [**vobjectsMergesJobIdStatusGet**](DefaultApi.md#vobjectsMergesJobIdStatusGet) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status |
| [**vobjectsObjectNameActionsActionNamePost**](DefaultApi.md#vobjectsObjectNameActionsActionNamePost) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records |
| [**vobjectsObjectNameActionsChangetypePost**](DefaultApi.md#vobjectsObjectNameActionsChangetypePost) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type |
| [**vobjectsObjectNameActionsMergePost**](DefaultApi.md#vobjectsObjectNameActionsMergePost) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge |
| [**vobjectsObjectNameActionsRecalculaterollupsGet**](DefaultApi.md#vobjectsObjectNameActionsRecalculaterollupsGet) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status |
| [**vobjectsObjectNameActionsRecalculaterollupsPost**](DefaultApi.md#vobjectsObjectNameActionsRecalculaterollupsPost) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields |
| [**vobjectsObjectNameActionsUpdatecorporatecurrencyPut**](DefaultApi.md#vobjectsObjectNameActionsUpdatecorporatecurrencyPut) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields |
| [**vobjectsObjectNameAttachmentsBatchDelete**](DefaultApi.md#vobjectsObjectNameAttachmentsBatchDelete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments |
| [**vobjectsObjectNameAttachmentsBatchPost**](DefaultApi.md#vobjectsObjectNameAttachmentsBatchPost) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments |
| [**vobjectsObjectNameAttachmentsBatchPut**](DefaultApi.md#vobjectsObjectNameAttachmentsBatchPut) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions |
| [**vobjectsObjectNameDelete**](DefaultApi.md#vobjectsObjectNameDelete) | **DELETE** /vobjects/{object_name} | Delete Object Records |
| [**vobjectsObjectNameIdRolesRoleNameGet**](DefaultApi.md#vobjectsObjectNameIdRolesRoleNameGet) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles |
| [**vobjectsObjectNameObjectRecordIdActionsActionNameGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsActionNameGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details |
| [**vobjectsObjectNameObjectRecordIdActionsActionNamePost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsActionNamePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record |
| [**vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsCascadedeletePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record |
| [**vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsDeepcopyPost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record |
| [**vobjectsObjectNameObjectRecordIdActionsGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions |
| [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File |
| [**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File |
| [**vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version |
| [**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions |
| [**vobjectsObjectNameObjectRecordIdAttachmentsFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files |
| [**vobjectsObjectNameObjectRecordIdAttachmentsGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments |
| [**vobjectsObjectNameObjectRecordIdAttachmentsPost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment |
| [**vobjectsObjectNameObjectRecordIdAudittrailGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAudittrailGet) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record |
| [**vobjectsObjectNameObjectRecordIdGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdGet) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record |
| [**vobjectsObjectNamePost**](DefaultApi.md#vobjectsObjectNamePost) | **POST** /vobjects/{object_name} | Create &amp; Upsert Object Records |
| [**vobjectsObjectNamePut**](DefaultApi.md#vobjectsObjectNamePut) | **PUT** /vobjects/{object_name} | Update Object Records |
| [**vobjectsObjectNameRolesDelete**](DefaultApi.md#vobjectsObjectNameRolesDelete) | **DELETE** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records |
| [**vobjectsObjectNameRolesPost**](DefaultApi.md#vobjectsObjectNameRolesPost) | **POST** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records |
| [**vobjectsOutboundPackageVPackageIdDependenciesGet**](DefaultApi.md#vobjectsOutboundPackageVPackageIdDependenciesGet) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies |



## apiGet

> void apiGet(authorization, accept, xVaultAPIClientID)

Retrieve API Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiMdlComponentsComponentTypeAndRecordNameFilesGet

> void apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName, authorization, accept, xVaultAPIClientID)

Retrieve Content File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypeAndRecordName** | **String**| The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiMdlComponentsComponentTypeAndRecordNameGet

> void apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName, authorization, accept, xVaultAPIClientID)

Retrieve Component Record (MDL)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypeAndRecordName** | **String**| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiMdlExecuteAsyncJobIdResultsGet

> void apiMdlExecuteAsyncJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Asynchronous MDL Script Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiMdlExecuteAsyncPost

> void apiMdlExecuteAsyncPost(authorization, accept, xVaultAPIClientID)

Execute MDL Script Asynchronously

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiMdlExecutePost

> void apiMdlExecutePost(authorization, accept, xVaultAPIClientID)

Execute MDL Script

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiMdlFilesPost

> void apiMdlFilesPost(authorization, accept, contentType, xVaultAPIClientID)

Upload Content File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## audittrailAuditTrailTypeGet

> void audittrailAuditTrailTypeGet(auditTrailType, startDate, endDate, allDates, formatResult, limit, offset, objects, events, authorization, accept, xVaultAPIClientID)

Retrieve Audit Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **auditTrailType** | **String**| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. | |
| **startDate** | **String**| Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] |
| **endDate** | **String**| Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] |
| **allDates** | **String**| Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [optional] |
| **formatResult** | **String**| To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [optional] |
| **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] |
| **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] |
| **objects** | **String**| This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects. | [optional] |
| **events** | **String**| This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## authDiscoveryPost

> void authDiscoveryPost(accept, xVaultAPIClientID)

Authentication Type Discovery

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## authOauthSessionOathOidcProfileIdPost

> void authOauthSessionOathOidcProfileIdPost(oathOidcProfileId, authorization, accept, xVaultAPIClientID)

OAuth 2.0 / OpenID Connect

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oathOidcProfileId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## authPost

> void authPost(contentType, accept, xVaultAPIClientID)

User Name and Password

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeClassNameDelete

> void codeClassNameDelete(className, authorization, accept, xVaultAPIClientID)

Delete Single Source Code File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**| The fully qualified class name of your file. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeClassNameDisablePut

> void codeClassNameDisablePut(className, authorization, accept, contentType, xVaultAPIClientID)

Disable Vault Extension

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**| The fully qualified class name of your file. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeClassNameEnablePut

> void codeClassNameEnablePut(className, authorization, accept, contentType, xVaultAPIClientID)

Enable Vault Extension

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**| The fully qualified class name of your file. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeClassNameGet

> void codeClassNameGet(className, authorization, accept, xVaultAPIClientID)

Retrieve Single Source Code File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**| The fully qualified class name of your file. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeProfilerGet

> void codeProfilerGet(authorization, accept, xVaultAPIClientID)

Retrieve All Profiling Sessions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeProfilerPost

> void codeProfilerPost(authorization, contentType, accept, xVaultAPIClientID)

Create Profiling Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeProfilerSessionNameActionsEndPost

> void codeProfilerSessionNameActionsEndPost(sessionName, authorization, accept, xVaultAPIClientID)

End Profiling Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | **String**| The name of the session, for example,  baseline__c. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeProfilerSessionNameDelete

> void codeProfilerSessionNameDelete(sessionName, authorization, accept, xVaultAPIClientID)

Delete Profiling Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | **String**| The name of the session, for example,  baseline__c. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeProfilerSessionNameGet

> void codeProfilerSessionNameGet(sessionName, authorization, accept, xVaultAPIClientID)

Retrieve Profiling Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | **String**| The name of the session, for example,  baseline__c. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codeProfilerSessionNameResultsGet

> void codeProfilerSessionNameResultsGet(sessionName, authorization, accept, xVaultAPIClientID)

Download Profiling Session Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | **String**| The name of the session, for example,  baseline__c. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## codePut

> void codePut(authorization, accept, contentType, xVaultAPIClientID)

Add or Replace Single Source Code File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## compositesTreesEdlHierarchyOrTemplateActionsListnodesPost

> void compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate, authorization, contentType, accept, xVaultAPIClientID)

Retrieve Specific Root Nodes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edlHierarchyOrTemplate** | **String**| Choose to retrieve either edl_hierarchy__v or edl_template__v | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## compositesTreesEdlHierarchyOrTemplateGet

> void compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate, authorization, contentType, accept, xVaultAPIClientID)

Retrieve All Root Nodes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edlHierarchyOrTemplate** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## compositesTreesEdlHierarchyVParentNodeIdChildrenGet

> void compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId, authorization, contentType, accept, xVaultAPIClientID)

Retrieve a Node&#39;s Children

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parentNodeId** | **String**| The ID of a parent node in the hierarchy. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## compositesTreesEdlHierarchyVParentNodeIdChildrenPut

> void compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId, authorization, contentType, accept, xVaultAPIClientID)

Update Node Order

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parentNodeId** | **String**| The ID of a parent node in the hierarchy. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationComponentTypeAndRecordNameGet

> void configurationComponentTypeAndRecordNameGet(componentTypeAndRecordName, loc, authorization, accept, xVaultAPIClientID)

Retrieve Component Record (XML/JSON)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypeAndRecordName** | **String**| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | |
| **loc** | **String**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationComponentTypeGet

> void configurationComponentTypeGet(componentType, authorization, accept, xVaultAPIClientID)

Retrieve Component Record Collection

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentType** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationObjectNameAndObjectTypeGet

> void configurationObjectNameAndObjectTypeGet(objectNameAndObjectType, loc, authorization, accept, xVaultAPIClientID)

Retrieve Details from a Specific Object

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectNameAndObjectType** | **String**| The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;. | |
| **loc** | **String**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationObjecttypeGet

> void configurationObjecttypeGet(authorization, accept, xVaultAPIClientID)

Retrieve Details from All Object Types

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationRoleAssignmentRuleDelete

> void configurationRoleAssignmentRuleDelete(authorization, accept, xVaultAPIClientID)

Delete Lifecycle Role Assignment Override Rules

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationRoleAssignmentRuleGet

> void configurationRoleAssignmentRuleGet(lifecycleV, roleV, productV, countryV, studyV, studyCountryV, authorization, accept, xVaultAPIClientID)

Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lifecycleV** | **String**| Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c | [optional] |
| **roleV** | **String**| Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c | [optional] |
| **productV** | **String**| Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap | [optional] |
| **countryV** | **String**| Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States | [optional] |
| **studyV** | **String**| In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study | [optional] |
| **studyCountryV** | **String**| In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationRoleAssignmentRulePost

> void configurationRoleAssignmentRulePost(authorization, accept, contentType, xVaultAPIClientID)

Create Lifecycle Role Assignment Override Rules

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## configurationRoleAssignmentRulePut

> void configurationRoleAssignmentRulePut(authorization, accept, contentType, xVaultAPIClientID)

Update Lifecycle Role Assignment Rules (Default &amp; Override)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## delegationLoginPost

> void delegationLoginPost(authorization, accept, xVaultAPIClientID)

Initiate Delegated Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## delegationVaultsGet

> void delegationVaultsGet(authorization, accept, xVaultAPIClientID)

Retrieve Delegations

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## keepAlivePost

> void keepAlivePost(authorization, accept, xVaultAPIClientID)

Session Keep Alive

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## limitsGet

> void limitsGet(authorization, accept, xVaultAPIClientID)

Retrieve Limits on Objects

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsApiUsageGet

> void logsApiUsageGet(date, logFormat, authorization, accept, xVaultAPIClientID)

Download Daily API Usage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **String**| The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [optional] |
| **logFormat** | **String**| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsCodeDebugGet

> void logsCodeDebugGet(userId, includeInactive, authorization, accept, xVaultAPIClientID)

Retrieve All Debug Logs

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [optional] |
| **includeInactive** | **Boolean**| Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsCodeDebugIdActionsResetDelete

> void logsCodeDebugIdActionsResetDelete(id, authorization, accept, xVaultAPIClientID)

Delete Debug Log

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the debug log to delete. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsCodeDebugIdActionsResetPost

> void logsCodeDebugIdActionsResetPost(id, authorization, accept, xVaultAPIClientID)

Reset Debug Log

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the debug log to delete. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsCodeDebugIdFilesGet

> void logsCodeDebugIdFilesGet(id, authorization, accept, xVaultAPIClientID)

Download Debug Log Files

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the debug log to download. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsCodeDebugIdGet

> void logsCodeDebugIdGet(id, authorization, accept, xVaultAPIClientID)

Retrieve Single Debug Log

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the debug log to retrieve. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsCodeDebugPost

> void logsCodeDebugPost(authorization, accept, contentType, xVaultAPIClientID)

Create Debug Log

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## logsCodeRuntimeGet

> void logsCodeRuntimeGet(date, logFormat, authorization, accept, xVaultAPIClientID)

Download SDK Runtime Log

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **String**|  | [optional] |
| **logFormat** | **String**| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## messagesMessageTypeActionsImportPost

> void messagesMessageTypeActionsImportPost(messageType, authorization, accept, xVaultAPIClientID)

Import Bulk Translation File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageType** | **String**| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## messagesMessageTypeLanguageLangActionsExportPost

> void messagesMessageTypeLanguageLangActionsExportPost(messageType, lang, authorization, accept, xVaultAPIClientID)

Export Bulk Translation File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageType** | **String**| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | |
| **lang** | **String**| A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataAudittrailAuditTrailTypeGet

> void metadataAudittrailAuditTrailTypeGet(auditTrailType, authorization, accept, xVaultAPIClientID)

Retrieve Audit Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **auditTrailType** | **String**| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataAudittrailGet

> void metadataAudittrailGet(authorization, accept, xVaultAPIClientID)

Retrieve Audit Types

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataComponentsComponentTypeGet

> void metadataComponentsComponentTypeGet(componentType, authorization, accept, xVaultAPIClientID)

Retrieve Component Type Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentType** | **String**| The component type name (Picklist, Docfield, Doctype, etc.). | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataComponentsGet

> void metadataComponentsGet(authorization, accept, xVaultAPIClientID)

Retrieve All Component Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsBindersTemplatesBindernodesGet

> void metadataObjectsBindersTemplatesBindernodesGet(authorization, accept, xVaultAPIClientID)

Retrieve Binder Template Node Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsBindersTemplatesGet

> void metadataObjectsBindersTemplatesGet(authorization, accept, xVaultAPIClientID)

Retrieve Binder Template Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet

> void metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType, authorization, accept, xVaultAPIClientID)

Retrieve Annotation Placemark Type Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **placemarkType** | **String**| The name of the placemark type. For example, sticky__sys. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet

> void metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType, authorization, accept, xVaultAPIClientID)

Retrieve Annotation Reference Type Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **referenceType** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet

> void metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType, authorization, accept, xVaultAPIClientID)

Retrieve Annotation Type Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **annotationType** | **String**| The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet

> void metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventType, eventSubtype, authorization, accept, xVaultAPIClientID)

Retrieve Document Event SubType Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventType** | **String**| The event type. For example, distribution__v. | |
| **eventSubtype** | **String**| The event subtype. For example, approved_email__v. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsEventsGet

> void metadataObjectsDocumentsEventsGet(authorization, accept, xVaultAPIClientID)

Retrieve Document Event Types and Subtypes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsLockGet

> void metadataObjectsDocumentsLockGet(authorization, accept, xVaultAPIClientID)

Retrieve Document Lock Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsPropertiesFindCommonPost

> void metadataObjectsDocumentsPropertiesFindCommonPost(contentType, accept, authorization, xVaultAPIClientID)

Retrieve Common Document Fields

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsPropertiesGet

> void metadataObjectsDocumentsPropertiesGet(authorization, accept, xVaultAPIClientID)

Retrieve All Document Fields

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsTemplatesGet

> void metadataObjectsDocumentsTemplatesGet(authorization, accept, xVaultAPIClientID)

Retrieve Document Template Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsTypesGet

> void metadataObjectsDocumentsTypesGet(authorization, accept, xVaultAPIClientID)

Retrieve All Document Types

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsTypesTypeGet

> void metadataObjectsDocumentsTypesTypeGet(type, authorization, accept, xVaultAPIClientID)

Retrieve Document Type

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| The document type. See Retrieve Document Types. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsTypesTypeRelationshipsGet

> void metadataObjectsDocumentsTypesTypeRelationshipsGet(type, authorization, accept, xVaultAPIClientID)

Retrieve Document Type Relationships

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| The document type. See Retrieve Document Types. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet

> void metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(type, subtype, classification, authorization, accept, xVaultAPIClientID)

Retrieve Document Classification

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| The document type. See Retrieve Document Types. | |
| **subtype** | **String**| The document subtype. See Retrieve Document Types. | |
| **classification** | **String**| The document classification. See Retrieve Document Types. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet

> void metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(type, subtype, authorization, accept, xVaultAPIClientID)

Retrieve Document Subtype

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| The document type. See Retrieve Document Types. | |
| **subtype** | **String**| The document subtype. See Retrieve Document Types. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsGroupsGet

> void metadataObjectsGroupsGet(authorization, accept, xVaultAPIClientID)

Retrieve Group Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsSecuritypoliciesGet

> void metadataObjectsSecuritypoliciesGet(authorization, accept, xVaultAPIClientID)

Retrieve Security Policy Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataObjectsUsersGet

> void metadataObjectsUsersGet(authorization, accept, xVaultAPIClientID)

Retrieve User Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet

> void metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(authorization, accept, xVaultAPIClientID)

Retrieve Archived Document Signature Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet

> void metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(authorization, accept, xVaultAPIClientID)

Retrieve Document Signature Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataVobjectsGet

> void metadataVobjectsGet(loc, authorization, accept, xVaultAPIClientID)

Retrieve Object Collection

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loc** | **Boolean**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataVobjectsObjectNameActionsCanceldeploymentPost

> void metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName, authorization, accept, xVaultAPIClientID)

Cancel Raw Object Deployment

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataVobjectsObjectNameFieldsObjectFieldNameGet

> void metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectName, objectFieldName, loc, authorization, accept, xVaultAPIClientID)

Retrieve Object Field Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectFieldName** | **String**| The object field name value (id, name__v, external_id__v, etc.). | |
| **loc** | **Boolean**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataVobjectsObjectNameGet

> void metadataVobjectsObjectNameGet(objectName, loc, authorization, accept, xVaultAPIClientID)

Retrieve Object Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **loc** | **Boolean**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataVobjectsObjectNamePageLayoutsGet

> void metadataVobjectsObjectNamePageLayoutsGet(objectName, authorization, accept, xVaultAPIClientID)

Retrieve Page Layouts

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## metadataVobjectsObjectNamePageLayoutsLayoutNameGet

> void metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectName, layoutName, authorization, accept, xVaultAPIClientID)

Retrieve Page Layout Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The name of the object from which to retrieve page layout metadata. | |
| **layoutName** | **String**| The name of the page layout from which to retrieve metadata. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## notificationsHistoriesGet

> void notificationsHistoriesGet(startDate, endDate, allDates, formatResult, limit, offset, authorization, accept, xVaultAPIClientID)

Retrieve Email Notification Histories

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **String**| Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. | [optional] |
| **endDate** | **String**| Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. | [optional] |
| **allDates** | **Boolean**| Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [optional] |
| **formatResult** | **String**| To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [optional] |
| **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] |
| **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectWorkflowActionsActionGet

> void objectWorkflowActionsActionGet(action, authorization, accept, xVaultAPIClientID)

Retrieve Bulk Workflow Action Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectWorkflowActionsActionPost

> void objectWorkflowActionsActionPost(action, authorization, accept, contentType, xVaultAPIClientID)

Initiate Workflow Actions on Multiple Workflows

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectWorkflowActionsCanceltasksPost

> void objectWorkflowActionsCanceltasksPost(authorization, accept, contentType, xVaultAPIClientID)

Cancel Workflow Tasks

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectWorkflowActionsCancelworkflowsPost

> void objectWorkflowActionsCancelworkflowsPost(authorization, accept, contentType, xVaultAPIClientID)

Cancel Workflows

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectWorkflowActionsGet

> void objectWorkflowActionsGet(authorization, accept, xVaultAPIClientID)

Retrieve Bulk Workflow Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectWorkflowActionsReassigntasksPost

> void objectWorkflowActionsReassigntasksPost(authorization, accept, contentType, xVaultAPIClientID)

Reassign Workflow Tasks

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectWorkflowActionsReplaceworkflowownerPost

> void objectWorkflowActionsReplaceworkflowownerPost(authorization, accept, contentType, xVaultAPIClientID)

Replace Workflow Owner

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersActionsExportJobIdResultsGet

> void objectsBindersActionsExportJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Binder Export Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested export job. This is returned with the export binder requests above. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdActionsExportPost

> void objectsBindersBinderIdActionsExportPost(binderId, source, renditiontype, docversion, attachments, export, docfield, authorization, accept, xVaultAPIClientID)

Export Binder (Latest Version)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **source** | **Boolean**| to include source content or not | [optional] |
| **renditiontype** | **String**| to include viewable renditions | [optional] |
| **docversion** | **String**| to include all major versions | [optional] |
| **attachments** | **String**| to include all versions of attachments | [optional] |
| **export** | **String**| configurable filename metadata | [optional] |
| **docfield** | **Boolean**| to exclude document metadata csv | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdActionsPost

> void objectsBindersBinderIdActionsPost(binderId, authorization, contentType, accept, xVaultAPIClientID)

Refresh Binder Auto-Filing

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdBindingRulePut

> void objectsBindersBinderIdBindingRulePut(binderId, contentType, accept, authorization, xVaultAPIClientID)

Update Binding Rule

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdDelete

> void objectsBindersBinderIdDelete(binderId, authorization, accept, xVaultAPIClientID)

Delete Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdDocumentsNodeIdBindingRulePut

> void objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderId, nodeId, authorization, contentType, accept, xVaultAPIClientID)

Update Binder Document Binding Rule

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **nodeId** | **String**| The binder node id field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdDocumentsPost

> void objectsBindersBinderIdDocumentsPost(binderId, authorization, contentType, accept, xVaultAPIClientID)

Add Document to Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdDocumentsSectionIdDelete

> void objectsBindersBinderIdDocumentsSectionIdDelete(binderId, sectionId, authorization, accept, xVaultAPIClientID)

Remove Document from Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **sectionId** | **String**| The binder node id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdDocumentsSectionIdPut

> void objectsBindersBinderIdDocumentsSectionIdPut(binderId, sectionId, authorization, contentType, accept, xVaultAPIClientID)

Move Document in Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **sectionId** | **String**| The binder node id field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdGet

> void objectsBindersBinderIdGet(binderId, depth, authorization, accept, xVaultAPIClientID)

Retrieve Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **depth** | **String**| To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdPost

> void objectsBindersBinderIdPost(binderId, authorization, accept, xVaultAPIClientID)

Create Binder Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdPut

> void objectsBindersBinderIdPut(binderId, authorization, contentType, accept, xVaultAPIClientID)

Update Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete

> void objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderId, roleNameAndUserOrGroup, id, authorization, accept, xVaultAPIClientID)

Remove Users &amp; Groups from Roles on a Single Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The id value of the binder from which to remove roles. | |
| **roleNameAndUserOrGroup** | **String**| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | |
| **id** | **String**| The id value of the user or group to remove from the role. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdSectionsNodeIdBindingRulePut

> void objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderId, nodeId, contentType, accept, authorization, xVaultAPIClientID)

Update Binder Section Binding Rule

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **nodeId** | **String**| The binder node id field value. | |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdSectionsNodeIdPut

> void objectsBindersBinderIdSectionsNodeIdPut(binderId, nodeId, authorization, accept, contentType, xVaultAPIClientID)

Update Binder Section

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **nodeId** | **String**| The binder node id of the section. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdSectionsPost

> void objectsBindersBinderIdSectionsPost(binderId, authorization, accept, contentType, xVaultAPIClientID)

Create Binder Section

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdSectionsSectionIdDelete

> void objectsBindersBinderIdSectionsSectionIdDelete(binderId, sectionId, authorization, accept, contentType, xVaultAPIClientID)

Delete Binder Section

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **sectionId** | **String**| The binder node id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdSectionsSectionIdGet

> void objectsBindersBinderIdSectionsSectionIdGet(binderId, sectionId, authorization, accept, xVaultAPIClientID)

Retrieve Binder Sections

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **sectionId** | **String**| The binder node id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsGet

> void objectsBindersBinderIdVersionsGet(binderId, authorization, accept, xVaultAPIClientID)

Retrieve All Binder Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderId, majorVersion, minorVersion, source, renditiontype, docversion, attachments, export, docfield, authorization, accept, xVaultAPIClientID)

Export Binder (Specific Version)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **source** | **Boolean**| to include source content or not | [optional] |
| **renditiontype** | **String**| to include viewable renditions | [optional] |
| **docversion** | **String**| to include all major versions | [optional] |
| **attachments** | **String**| to include all versions of attachments | [optional] |
| **export** | **String**| configurable filename metadata | [optional] |
| **docfield** | **Boolean**| to exclude document metadata csv | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Delete Binder Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionGet

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Binder Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionPut

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIClientID)

Update Binder Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIClientID)

Create Binder Relationship

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID)

Delete Binder Relationship

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **relationshipId** | **String**| The binder relationship id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID)

Retrieve Binder Relationship

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **relationshipId** | **String**| The binder relationship id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet

> void objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderId, majorVersion, minorVersion, sectionId, authorization, accept, xVaultAPIClientID)

Retrieve Binder Version Section

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | **String**| The binder id field value. | |
| **majorVersion** | **String**| The binder major_version_number__v field value. | |
| **minorVersion** | **String**| The binder minor_version_number__v field value. | |
| **sectionId** | **String**| Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersIdRolesGet

> void objectsBindersIdRolesGet(id, authorization, accept, xVaultAPIClientID)

Retrieve All Binder Roles

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersIdRolesPost

> void objectsBindersIdRolesPost(id, authorization, accept, contentType, xVaultAPIClientID)

Assign Users &amp; Groups to Roles on a Single Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersIdRolesRoleNameGet

> void objectsBindersIdRolesRoleNameGet(id, roleName, authorization, accept, xVaultAPIClientID)

Retrieve Document Role

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The binder &#x60;id&#x60;. | |
| **roleName** | **String**| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet

> void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Binder User Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The binder id field value from which to retrieve available user actions. | |
| **majorVersion** | **String**| The major version number of the binder. | |
| **minorVersion** | **String**| The minor version number of the binder. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet

> void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, authorization, accept, xVaultAPIClientID)

Retrieve Binder Entry Criteria

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The binder id field value from which to retrieve available user actions. | |
| **majorVersion** | **String**| The major version number of the binder. | |
| **minorVersion** | **String**| The minor version number of the binder. | |
| **nameV** | **String**| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut

> void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, authorization, contentType, accept, xVaultAPIClientID)

Initiate Binder User Action

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The binder id field value from which to retrieve available user actions. | |
| **majorVersion** | **String**| The major version number of the binder. | |
| **minorVersion** | **String**| The minor version number of the binder. | |
| **nameV** | **String**| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersLifecycleActionsPost

> void objectsBindersLifecycleActionsPost(authorization, accept, contentType, xVaultAPIClientID)

Retrieve User Actions on Multiple Binders

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersLifecycleActionsUserActionNamePut

> void objectsBindersLifecycleActionsUserActionNamePut(userActionName, authorization, contentType, accept, xVaultAPIClientID)

Initiate Bulk Binder User Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userActionName** | **String**| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersPost

> void objectsBindersPost(async, authorization, contentType, accept, xVaultAPIClientID)

Create Binder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **async** | **Boolean**| When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesGet

> void objectsBindersTemplatesGet(authorization, accept, xVaultAPIClientID)

Retrieve Binder Template Collection

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesPost

> void objectsBindersTemplatesPost(authorization, accept, contentType, xVaultAPIClientID)

Create Binder Template

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesPut

> void objectsBindersTemplatesPut(authorization, accept, contentType, xVaultAPIClientID)

Update Binder Template

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesTemplateNameBindernodesGet

> void objectsBindersTemplatesTemplateNameBindernodesGet(templateName, authorization, accept, xVaultAPIClientID)

Retrieve Binder Template Node Attributes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The binder template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesTemplateNameBindernodesPost

> void objectsBindersTemplatesTemplateNameBindernodesPost(templateName, authorization, accept, contentType, xVaultAPIClientID)

Create Binder Template Node

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The binder template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesTemplateNameBindernodesPut

> void objectsBindersTemplatesTemplateNameBindernodesPut(templateName, authorization, accept, contentType, xVaultAPIClientID)

Replace Binder Template Nodes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The binder template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesTemplateNameDelete

> void objectsBindersTemplatesTemplateNameDelete(templateName, authorization, accept, xVaultAPIClientID)

Delete Binder Template

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The binder template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsBindersTemplatesTemplateNameGet

> void objectsBindersTemplatesTemplateNameGet(templateName, authorization, accept, xVaultAPIClientID)

Retrieve Binder Template Attributes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The binder template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDeletionsDocumentsGet

> void objectsDeletionsDocumentsGet(startDate, endDate, authorization, contentType, accept, xVaultAPIClientID)

Retrieve Deleted Document IDs

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **String**| Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional] |
| **endDate** | **String**| Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDeletionsVobjectsObjectNameGet

> void objectsDeletionsVobjectsObjectNameGet(objectName, authorization, accept, xVaultAPIClientID)

Retrieve Deleted Object Record ID

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsActionsGet

> void objectsDocumentsActionsGet(loc, authorization, accept, xVaultAPIClientID)

Retrieve All Document Workflows

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet

> void objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndAction, jobId, authorization, accept, xVaultAPIClientID)

Download Controlled Copy Job Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lifecycleAndStateAndAction** | **String**| The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link. | |
| **jobId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsActionsWorkflowNameGet

> void objectsDocumentsActionsWorkflowNameGet(workflowName, loc, authorization, accept, xVaultAPIClientID)

Retrieve Document Workflow Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | **String**| The document workflow name value. | |
| **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsActionsWorkflowNamePost

> void objectsDocumentsActionsWorkflowNamePost(workflowName, authorization, accept, contentType, xVaultAPIClientID)

Initiate Document Workflow

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | **String**| The document workflow name value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsAnnotationsBatchDelete

> void objectsDocumentsAnnotationsBatchDelete(authorization, accept, contentType, xVaultAPIClientID)

Delete Annotations

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsAnnotationsBatchPost

> void objectsDocumentsAnnotationsBatchPost(authorization, contentType, accept, xVaultAPIClientID)

Create Multiple Annotations

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | |
| **contentType** | **String**|  | |
| **accept** | **String**|  | |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsAnnotationsBatchPut

> void objectsDocumentsAnnotationsBatchPut(authorization, contentType, accept, xVaultAPIClientID)

Update Annotations

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsAnnotationsRepliesBatchPost

> void objectsDocumentsAnnotationsRepliesBatchPost(authorization, contentType, accept, xVaultAPIClientID)

Add Annotation Replies

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsAttachmentsBatchDelete

> void objectsDocumentsAttachmentsBatchDelete(accept, authorization, contentType, xVaultAPIClientID)

Delete Multiple Document Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsAttachmentsBatchPost

> void objectsDocumentsAttachmentsBatchPost(accept, authorization, contentType, xVaultAPIClientID)

Create Multiple Document Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsAttachmentsBatchPut

> void objectsDocumentsAttachmentsBatchPut(accept, authorization, contentType, xVaultAPIClientID)

Update Multiple Document Attachment Descriptions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchActionsFileextractJobIdResultsGet

> void objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Document Export Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested export job. This is returned with the export document requests. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchActionsFileextractPost

> void objectsDocumentsBatchActionsFileextractPost(source, renditions, allversions, authorization, contentType, accept, xVaultAPIClientID)

Export Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **source** | **Boolean**| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] |
| **renditions** | **Boolean**| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] |
| **allversions** | **Boolean**| Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false. | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchActionsReclassifyPut

> void objectsDocumentsBatchActionsReclassifyPut(authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID)

Reclassify Multiple Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchActionsRerenderPost

> void objectsDocumentsBatchActionsRerenderPost(authorization, accept, contentType, xVaultAPIClientID)

Update Multiple Document Renditions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchDelete

> void objectsDocumentsBatchDelete(idParam, authorization, accept, contentType, xVaultAPIClientID)

Delete Multiple Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchLockDelete

> void objectsDocumentsBatchLockDelete(authorization, accept, contentType, xVaultAPIClientID)

Undo Collaborative Authoring Checkout

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchPost

> void objectsDocumentsBatchPost(authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID)

Create Multiple Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsBatchPut

> void objectsDocumentsBatchPut(authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID)

Update Multiple Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAnchorsGet

> void objectsDocumentsDocIdAnchorsGet(docId, authorization, accept, xVaultAPIClientID)

Retrieve Anchor IDs

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAnnotationsFileGet

> void objectsDocumentsDocIdAnnotationsFileGet(docId, authorization, accept, xVaultAPIClientID)

Export Document Annotations to PDF

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAnnotationsFilePost

> void objectsDocumentsDocIdAnnotationsFilePost(docId, authorization, accept, contentType, xVaultAPIClientID)

Import Document Annotations from PDF

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdDelete

> void objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docId, attachmentId, accept, authorization, xVaultAPIClientID)

Delete Single Document Attachment

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdFileGet

> void objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docId, attachmentId, accept, authorization, xVaultAPIClientID)

Download Document Attachment

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdGet

> void objectsDocumentsDocIdAttachmentsAttachmentIdGet(docId, attachmentId, accept, authorization, xVaultAPIClientID)

Retrieve Document Attachment Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdPut

> void objectsDocumentsDocIdAttachmentsAttachmentIdPut(docId, attachmentId, accept, authorization, contentType, xVaultAPIClientID)

Update Document Attachment Description

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete

> void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID)

Delete Single Document Attachment Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**| The attachment version__v field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

> void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID)

Download Document Attachment Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**| The attachment version__v field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet

> void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID)

Retrieve Document Attachment Version Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**| The attachment version__v field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost

> void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docId, attachmentId, attachmentVersion, restore, accept, authorization, xVaultAPIClientID)

Restore Document Attachment Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**| The attachment version__v field value. | |
| **restore** | **Boolean**| The parameter restore must be set to true.  | [optional] |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet

> void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docId, attachmentId, accept, authorization, xVaultAPIClientID)

Retrieve Document Attachment Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsFileGet

> void objectsDocumentsDocIdAttachmentsFileGet(docId, accept, authorization, xVaultAPIClientID)

Download All Document Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsGet

> void objectsDocumentsDocIdAttachmentsGet(docId, accept, authorization, xVaultAPIClientID)

Retrieve Document Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAttachmentsPost

> void objectsDocumentsDocIdAttachmentsPost(docId, accept, authorization, contentType, xVaultAPIClientID)

Create Document Attachment

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdAudittrailGet

> void objectsDocumentsDocIdAudittrailGet(docId, startDate, endDate, formatResult, limit, offset, events, authorization, accept, xVaultAPIClientID)

Retrieve Complete Audit History for a Single Document

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document ID for which to retrieve audit history. | |
| **startDate** | **String**| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  | [optional] |
| **endDate** | **String**| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] |
| **formatResult** | **String**| To request a CSV file of your audit history, use csv.  | [optional] |
| **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] |
| **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] |
| **events** | **String**| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdDelete

> void objectsDocumentsDocIdDelete(docId, authorization, accept, xVaultAPIClientID)

Delete Single Document

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdEventsGet

> void objectsDocumentsDocIdEventsGet(docId, authorization, accept, xVaultAPIClientID)

Retrieve Document Events

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdFileGet

> void objectsDocumentsDocIdFileGet(docId, lockDocument, accept, authorization, xVaultAPIClientID)

Download Document File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **lockDocument** | **Boolean**| Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [optional] |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdGet

> void objectsDocumentsDocIdGet(docId, authorization, accept, xVaultAPIClientID)

Retrieve Document

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdLockDelete

> void objectsDocumentsDocIdLockDelete(docId, authorization, accept, xVaultAPIClientID)

Delete Document Lock

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdLockGet

> void objectsDocumentsDocIdLockGet(docId, authorization, accept, xVaultAPIClientID)

Retrieve Document Lock

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdLockPost

> void objectsDocumentsDocIdLockPost(docId, authorization, accept, xVaultAPIClientID)

Create Document Lock

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet

> void objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID)

Download All Document Version Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdPost

> void objectsDocumentsDocIdPost(docId, suppressRendition, authorization, contentType, accept, xVaultAPIClientID)

Create Single Document Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **suppressRendition** | **String**| Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdPut

> void objectsDocumentsDocIdPut(docId, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID)

Update Single Document

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdRenditionsGet

> void objectsDocumentsDocIdRenditionsGet(docId, authorization, accept, xVaultAPIClientID)

Retrieve Document Renditions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdRenditionsRenditionTypeDelete

> void objectsDocumentsDocIdRenditionsRenditionTypeDelete(docId, renditionType, authorization, accept, xVaultAPIClientID)

Delete Single Document Rendition

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdRenditionsRenditionTypeGet

> void objectsDocumentsDocIdRenditionsRenditionTypeGet(docId, renditionType, steadyState, authorization, accept, xVaultAPIClientID)

Download Document Rendition File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **steadyState** | **String**| Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdRenditionsRenditionTypePost

> void objectsDocumentsDocIdRenditionsRenditionTypePost(docId, renditionType, authorization, accept, contentType, xVaultAPIClientID)

Add Single Document Rendition

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdRenditionsRenditionTypePut

> void objectsDocumentsDocIdRenditionsRenditionTypePut(docId, renditionType, authorization, accept, contentType, xVaultAPIClientID)

Replace Document Rendition

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete

> void objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docId, roleNameAndUserOrGroup, id, authorization, accept, xVaultAPIClientID)

Remove Users &amp; Groups from Roles on a Single Document

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The id value of the document from which to remove roles. | |
| **roleNameAndUserOrGroup** | **String**| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | |
| **id** | **String**| The id value of the user or group to remove from the role. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet

> void objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID)

Retrieve Document Version Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsGet

> void objectsDocumentsDocIdVersionsGet(docId, authorization, accept, xVaultAPIClientID)

Retrieve Document Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docId, majorVersion, minorVersion, annotationId, authorization, accept, xVaultAPIClientID)

Read Annotations by ID

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **annotationId** | **String**| The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docId, majorVersion, minorVersion, annotationId, authorization, accept, xVaultAPIClientID)

Read Replies of Parent Annotation

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **annotationId** | **String**| The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Export Document Version Annotations to PDF

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID)

Import Document Version Annotations from PDF

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docId, majorVersion, minorVersion, limit, offset, annotationTypes, paginationId, authorization, accept, xVaultAPIClientID)

Read Annotations by Document Version and Type

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **limit** | **String**| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [optional] |
| **offset** | **String**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201. | [optional] |
| **annotationTypes** | **String**| The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;  | [optional] |
| **paginationId** | **String**| A unique identifier used to load requests with paginated results. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID)

Download Document Version Attachment Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **attachmentId** | **String**| The id field value of the attachment. | |
| **attachmentVersion** | **String**| The version of the attachment. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID)

Retrieve Document Version Attachment Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **attachmentId** | **String**| The id of the document attachment to retrieve. | |
| **attachmentVersion** | **String**| Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Delete Single Document Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Document Version Notes as CSV

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID)

Create Document Event

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Video Annotations

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The video document id field value. | |
| **majorVersion** | **String**| The video document major_version_number__v field value. | |
| **minorVersion** | **String**| The video document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**| This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;. | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID)

Download Document Version File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Document Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID)

Update Document Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Document Relationships

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID)

Create Single Document Relationship

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID)

Delete Single Document Relationship

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **relationshipId** | **String**| The relationship id field value. See Retrieve Document Relationships. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID)

Retrieve Document Relationship

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **relationshipId** | **String**| The relationship id field value. See Retrieve Document Relationships. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Document Version Renditions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docId, majorVersion, minorVersion, renditionType, authorization, accept, xVaultAPIClientID)

Delete Document Version Rendition

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docId, majorVersion, minorVersion, renditionType, authorization, accept, xVaultAPIClientID)

Download Document Version Rendition File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docId, majorVersion, minorVersion, renditionType, authorization, accept, contentType, xVaultAPIClientID)

Upload Document Version Rendition

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docId, majorVersion, minorVersion, renditionType, authorization, accept, contentType, xVaultAPIClientID)

Replace Document Version Rendition

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **renditionType** | **String**| The document rendition type. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet

> void objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID)

Download Document Version Thumbnail File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | **String**| The document id field value. | |
| **majorVersion** | **String**| The document major_version_number__v field value. | |
| **minorVersion** | **String**| The document minor_version_number__v field value. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsGet

> void objectsDocumentsGet(namedFilter, scope, versionscope, search, limit, sort, start, authorization, accept, xVaultAPIClientID)

Retrieve All Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **namedFilter** | **String**| Retrieves only documents which you have created. | [optional] |
| **scope** | **String**| Searches only within the document content. | [optional] |
| **versionscope** | **String**| Retrieves all document versions, rather than only the latest version. | [optional] |
| **search** | **String**| Search for documents based on a {keyword} in searchable document fields. | [optional] |
| **limit** | **String**| See VQL documentation for more information. | [optional] |
| **sort** | **String**| See VQL documentation for more information. | [optional] |
| **start** | **String**| See VQL documentation for more information. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsIdRolesGet

> void objectsDocumentsIdRolesGet(id, authorization, accept, xVaultAPIClientID)

Retrieve All Document Roles

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsIdRolesPost

> void objectsDocumentsIdRolesPost(id, authorization, accept, contentType, xVaultAPIClientID)

Assign Users &amp; Groups to Roles on a Single Document

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsIdRolesRoleNameGet

> void objectsDocumentsIdRolesRoleNameGet(id, roleName, authorization, accept, xVaultAPIClientID)

Retrieve Document Role

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The document &#x60;id&#x60;. | |
| **roleName** | **String**| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet

> void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID)

Retrieve Document User Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The document id field value from which to retrieve available user actions. | |
| **majorVersion** | **String**| The major version number of the document. | |
| **minorVersion** | **String**| The minor version number of the document. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet

> void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, authorization, accept, xVaultAPIClientID)

Retrieve Document Entry Criteria

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The document id field value from which to retrieve available user actions. | |
| **majorVersion** | **String**| The major version number of the document. | |
| **minorVersion** | **String**| The minor version number of the document. | |
| **nameV** | **String**| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut

> void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, authorization, contentType, accept, xVaultAPIClientID)

Initiate Document User Action

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The document id field value from which to retrieve available user actions. | |
| **majorVersion** | **String**| The major version number of the document. | |
| **minorVersion** | **String**| The minor version number of the document. | |
| **nameV** | **String**| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsLifecycleActionsPost

> void objectsDocumentsLifecycleActionsPost(authorization, accept, contentType, xVaultAPIClientID)

Retrieve User Actions on Multiple Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsLifecycleActionsUserActionNamePut

> void objectsDocumentsLifecycleActionsUserActionNamePut(userActionName, authorization, contentType, accept, xVaultAPIClientID)

Initiate Bulk Document User Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userActionName** | **String**| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsPost

> void objectsDocumentsPost(authorization, accept, xVaultAPIMigrationMode, xVaultAPIClientID)

Create Single Document

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsRelationshipsBatchDelete

> void objectsDocumentsRelationshipsBatchDelete(authorization, accept, contentType, xVaultAPIClientID)

Delete Multiple Document Relationships

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsRelationshipsBatchPost

> void objectsDocumentsRelationshipsBatchPost(authorization, accept, contentType, xVaultAPIClientID)

Create Multiple Document Relationships

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsRenditionsBatchDelete

> void objectsDocumentsRenditionsBatchDelete(authorization, accept, contentType, xVaultAPIClientID)

Delete Multiple Document Renditions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsRenditionsBatchPost

> void objectsDocumentsRenditionsBatchPost(idParam, largeSizeAsset, authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID)

Add Multiple Document Renditions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] |
| **largeSizeAsset** | **String**| If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsRolesBatchDelete

> void objectsDocumentsRolesBatchDelete(authorization, contentType, accept, xVaultAPIClientID)

Remove Users and Groups from Roles on Multiple Documents &amp; Binders

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsRolesBatchPost

> void objectsDocumentsRolesBatchPost(authorization, accept, contentType, xVaultAPIClientID)

Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTemplatesGet

> void objectsDocumentsTemplatesGet(authorization, accept, xVaultAPIClientID)

Retrieve Document Template Collection

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTemplatesPost

> void objectsDocumentsTemplatesPost(authorization, contentType, accept, xVaultAPIClientID)

Create Single Document Template

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTemplatesPut

> void objectsDocumentsTemplatesPut(authorization, accept, contentType, xVaultAPIClientID)

Update Multiple Document Templates

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTemplatesTemplateNameDelete

> void objectsDocumentsTemplatesTemplateNameDelete(templateName, authorization, accept, xVaultAPIClientID)

Delete Basic Document Template

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The document template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTemplatesTemplateNameFileGet

> void objectsDocumentsTemplatesTemplateNameFileGet(templateName, authorization, accept, xVaultAPIClientID)

Download Document Template File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The document template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTemplatesTemplateNameGet

> void objectsDocumentsTemplatesTemplateNameGet(templateName, authorization, accept, xVaultAPIClientID)

Retrieve Document Template Attributes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The document template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTemplatesTemplateNamePut

> void objectsDocumentsTemplatesTemplateNamePut(templateName, authorization, accept, xVaultAPIClientID)

Update Single Document Template

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | **String**| The document template name__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsTokensPost

> void objectsDocumentsTokensPost(authorization, contentType, accept, xVaultAPIClientID)

Document Tokens

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsVersionsBatchActionsFileextractPost

> void objectsDocumentsVersionsBatchActionsFileextractPost(source, renditions, authorization, contentType, accept, xVaultAPIClientID)

Export Document Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **source** | **Boolean**| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] |
| **renditions** | **Boolean**| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsVersionsBatchDelete

> void objectsDocumentsVersionsBatchDelete(idParam, authorization, contentType, accept, xVaultAPIClientID)

Delete Multiple Document Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDocumentsVersionsBatchPost

> void objectsDocumentsVersionsBatchPost(idParam, authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID)

Create Multiple Document Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIMigrationMode** | **String**| Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDomainGet

> void objectsDomainGet(includeApplication, authorization, accept, contentType, xVaultAPIClientID)

Retrieve Domain Information

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeApplication** | **Boolean**| To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsDomainsGet

> void objectsDomainsGet(authorization, accept, contentType, xVaultAPIClientID)

Retrieve Domains

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsEdlMatchedDocumentsBatchActionsAddPost

> void objectsEdlMatchedDocumentsBatchActionsAddPost(authorization, contentType, accept, xVaultAPIClientID)

Add EDL Matched Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsEdlMatchedDocumentsBatchActionsRemovePost

> void objectsEdlMatchedDocumentsBatchActionsRemovePost(authorization, contentType, accept, xVaultAPIClientID)

Remove EDL Matched Documents

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsGroupsAutoGet

> void objectsGroupsAutoGet(limit, offset, authorization, accept, xVaultAPIClientID)

Retrieve Auto Managed Groups

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **String**| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  | [optional] |
| **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsGroupsGet

> void objectsGroupsGet(includeImplied, authorization, accept, xVaultAPIClientID)

Retrieve All Groups

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeImplied** | **String**| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsGroupsGroupIdDelete

> void objectsGroupsGroupIdDelete(groupId, authorization, accept, xVaultAPIClientID)

Delete Group

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| The group id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsGroupsGroupIdGet

> void objectsGroupsGroupIdGet(groupId, includeImplied, authorization, accept, xVaultAPIClientID)

Retrieve Group

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| The group id field value. | |
| **includeImplied** | **Boolean**| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsGroupsGroupIdPut

> void objectsGroupsGroupIdPut(groupId, authorization, accept, contentType, xVaultAPIClientID)

Update Group

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| The group id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsGroupsPost

> void objectsGroupsPost(authorization, accept, contentType, xVaultAPIClientID)

Create Group 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsLicensesGet

> void objectsLicensesGet(authorization, accept, xVaultAPIClientID)

Retrieve Application License Usage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsActionsGet

> void objectsObjectworkflowsActionsGet(authorization, accept, xVaultAPIClientID)

Retrieve All Multi-Record Workflows

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsActionsWorkflowNameGet

> void objectsObjectworkflowsActionsWorkflowNameGet(workflowName, authorization, xVaultAPIClientID)

Retrieve Multi-Record Workflow Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsActionsWorkflowNamePost

> void objectsObjectworkflowsActionsWorkflowNamePost(workflowName, authorization, contentType, accept, xVaultAPIClientID)

Initiate Multi-Record Workflow

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsGet

> void objectsObjectworkflowsGet(objectV, recordIdV, participant, statusV, offset, pageSize, loc, authorization, accept, xVaultAPIClientID)

Retrieve Workflows

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectV** | **String**| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] |
| **recordIdV** | **String**| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] |
| **participant** | **String**| To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] |
| **statusV** | **String**| To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v | [optional] |
| **offset** | **String**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] |
| **pageSize** | **String**| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] |
| **loc** | **String**| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksGet

> void objectsObjectworkflowsTasksGet(objectV, recordIdV, assigneeV, statusV, offset, pageSize, loc, authorization, accept, xVaultAPIClientID)

Retrieve Workflow Tasks

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectV** | **String**| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] |
| **recordIdV** | **String**| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] |
| **assigneeV** | **String**| To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] |
| **statusV** | **String**| To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.  | [optional] |
| **offset** | **String**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] |
| **pageSize** | **String**| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] |
| **loc** | **String**| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsAcceptPost

> void objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Accept Single Record Workflow Task

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsCancelPost

> void objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Cancel Workflow Task

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsCompletePost

> void objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Complete Single Record Workflow Task

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsGet

> void objectsObjectworkflowsTasksTaskIdActionsGet(taskId, authorization, accept, xVaultAPIClientID)

Retrieve Workflow Task Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost

> void objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Accept Multi-item Workflow Task

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost

> void objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Complete Multi-item Workflow Task

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost

> void objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Manage Multi-Item Workflow Content

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost

> void objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Reassign Multi-item Workflow Task

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The id of the task to reassign. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsReassignPost

> void objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Reassign Single Record Workflow Task

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The id of the task to reassign. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsTaskActionGet

> void objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskId, taskAction, loc, authorization, accept, xVaultAPIClientID)

Retrieve Workflow Task Action Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **taskAction** | **String**| The name of the task action retrieved from Retrieve Workflow Task Actions. | |
| **loc** | **String**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost

> void objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Undo Workflow Task Acceptance

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost

> void objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId, authorization, accept, contentType, xVaultAPIClientID)

Update Workflow Task Due Date

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The id of the task. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsTasksTaskIdGet

> void objectsObjectworkflowsTasksTaskIdGet(taskId, loc, authorization, accept, xVaultAPIClientID)

Retrieve Workflow Task Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| The task id field value. | |
| **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsWorkflowIdActionsGet

> void objectsObjectworkflowsWorkflowIdActionsGet(workflowId, loc, authorization, accept, xVaultAPIClientID)

Retrieve Workflow Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | **String**| The workflow id field value. | |
| **loc** | **String**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet

> void objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowId, workflowAction, authorization, accept, xVaultAPIClientID)

Retrieve Workflow Action Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | **String**| The workflow id field value. | |
| **workflowAction** | **String**| The workflow action name retrieved from Retrieve Workflow Actions. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost

> void objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowId, workflowAction, documentsSys, authorization, contentType, accept, xVaultAPIClientID)

Initiate Workflow Action

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | **String**| The workflow id field value. | |
| **workflowAction** | **String**| The workflow action name retrieved from Retrieve Workflow Actions. | |
| **documentsSys** | **String**| Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsObjectworkflowsWorkflowIdGet

> void objectsObjectworkflowsWorkflowIdGet(workflowId, loc, authorization, accept, xVaultAPIClientID)

Retrieve Workflow Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | **String**| The workflow id field value. | |
| **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsPicklistsGet

> void objectsPicklistsGet(authorization, accept, xVaultAPIClientID)

Retrieve All Picklists

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsPicklistsPicklistNameGet

> void objectsPicklistsPicklistNameGet(picklistName, authorization, accept, xVaultAPIClientID)

Retrieve Picklist Values

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsPicklistsPicklistNamePicklistValueNameDelete

> void objectsPicklistsPicklistNamePicklistValueNameDelete(picklistName, picklistValueName, authorization, accept, xVaultAPIClientID)

Inactivate Picklist Value

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **picklistValueName** | **String**| The picklist value name field value (north_america__c, south_america__c, etc.) | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsPicklistsPicklistNamePicklistValueNamePut

> void objectsPicklistsPicklistNamePicklistValueNamePut(picklistName, picklistValueName, authorization, accept, contentType, xVaultAPIClientID)

Update Picklist Value

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **picklistValueName** | **String**| The picklist value name field value (north_america__c, south_america__c, etc.) | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsPicklistsPicklistNamePost

> void objectsPicklistsPicklistNamePost(picklistName, authorization, accept, contentType, xVaultAPIClientID)

Create Picklist Values

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsPicklistsPicklistNamePut

> void objectsPicklistsPicklistNamePut(picklistName, authorization, accept, contentType, xVaultAPIClientID)

Update Picklist Value Label

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxActionsBuildproductionPost

> void objectsSandboxActionsBuildproductionPost(authorization, accept, contentType, xVaultAPIClientID)

Build Production Vault

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxActionsPromoteproductionPost

> void objectsSandboxActionsPromoteproductionPost(authorization, accept, contentType, xVaultAPIClientID)

Promote to Production

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxActionsRecheckusagePost

> void objectsSandboxActionsRecheckusagePost(authorization, accept, contentType, xVaultAPIClientID)

Recheck Sandbox Usage Limit

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxBatchChangesizePost

> void objectsSandboxBatchChangesizePost(authorization, accept, contentType, xVaultAPIClientID)

Change Sandbox Size

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxEntitlementsSetPost

> void objectsSandboxEntitlementsSetPost(authorization, accept, contentType, xVaultAPIClientID)

Set Sandbox Entitlements

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxGet

> void objectsSandboxGet(authorization, accept, xVaultAPIClientID)

Retrieve Sandboxes

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxNameDelete

> void objectsSandboxNameDelete(name, authorization, accept, xVaultAPIClientID)

Delete Sandbox

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxPost

> void objectsSandboxPost(authorization, accept, contentType, xVaultAPIClientID)

Create or Refresh Sandbox

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxSnapshotApiNameActionsUpdatePost

> void objectsSandboxSnapshotApiNameActionsUpdatePost(apiName, authorization, accept, xVaultAPIClientID)

Update Sandbox Snapshot

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiName** | **String**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxSnapshotApiNameActionsUpgradePost

> void objectsSandboxSnapshotApiNameActionsUpgradePost(apiName, authorization, accept, xVaultAPIClientID)

Upgrade Sandbox Snapshot

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiName** | **String**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxSnapshotApiNameDelete

> void objectsSandboxSnapshotApiNameDelete(apiName, authorization, accept, xVaultAPIClientID)

Delete Sandbox Snapshot

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiName** | **String**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxSnapshotGet

> void objectsSandboxSnapshotGet(authorization, accept, xVaultAPIClientID)

Retrieve Sandbox Snapshots

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxSnapshotPost

> void objectsSandboxSnapshotPost(authorization, accept, contentType, xVaultAPIClientID)

Create Sandbox Snapshot

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxVaultIdActionsRefreshPost

> void objectsSandboxVaultIdActionsRefreshPost(vaultId, authorization, accept, contentType, xVaultAPIClientID)

Refresh Sandbox from Snapshot

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vaultId** | **String**| The Vault ID of the sandbox to be refreshed. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSandboxVaultIdGet

> void objectsSandboxVaultIdGet(vaultId, authorization, accept, xVaultAPIClientID)

Retrieve Sandbox Details by ID

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vaultId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSecuritypoliciesGet

> void objectsSecuritypoliciesGet(authorization, accept, xVaultAPIClientID)

Retrieve All Security Policies

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsSecuritypoliciesSecurityPolicyNameGet

> void objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName, authorization, accept, xVaultAPIClientID)

Retrieve Security Policy

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **securityPolicyName** | **String**| Security policy name__v field value (retrieved from previous request). This is typically a numeric value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersGet

> void objectsUsersGet(vaults, excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID)

Retrieve All Users

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vaults** | **String**| Retrieve all users assigned to all Vaults in your domain. | [optional] |
| **excludeVaultMembership** | **String**| Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [optional] |
| **excludeAppLicensing** | **String**| Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersIdGet

> void objectsUsersIdGet(id, excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID)

Retrieve User

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The user id field value. Use the value me to get information for the currently authenticated user. | |
| **excludeVaultMembership** | **String**| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] |
| **excludeAppLicensing** | **String**| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersIdPermissionsGet

> void objectsUsersIdPermissionsGet(id, filter, authorization, accept, xVaultAPIClientID)

Retrieve User Permissions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the user. Use the value me to retrieve information for the currently authenticated user. | |
| **filter** | **String**| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersIdPut

> void objectsUsersIdPut(id, authorization, contentType, xVaultAPIClientID)

Update Single User

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The user id field value. Use the value me to get information for the currently authenticated user. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersMeGet

> void objectsUsersMeGet(excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID)

Validate Session User

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **excludeVaultMembership** | **String**| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] |
| **excludeAppLicensing** | **String**| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersMePasswordPost

> void objectsUsersMePasswordPost(authorization, contentType, accept, xVaultAPIClientID)

Change My Password

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersMePermissionsGet

> void objectsUsersMePermissionsGet(filter, authorization, accept, xVaultAPIClientID)

Retrieve My User Permissions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | **String**| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersMePut

> void objectsUsersMePut(authorization, contentType, xVaultAPIClientID)

Update My User

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersPost

> void objectsUsersPost(authorization, accept, contentType, xVaultAPIClientID)

Create Single User

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersPut

> void objectsUsersPut(authorization, contentType, accept, xVaultAPIClientID)

Update Multiple Users

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersUserIdDelete

> void objectsUsersUserIdDelete(userId, domain, authorization, accept, xVaultAPIClientID)

Disable User

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The user id field value.  | |
| **domain** | **Boolean**| When true, this disables the user account in all vaults in the domain. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsUsersUserIdVaultMembershipVaultIdPut

> void objectsUsersUserIdVaultMembershipVaultIdPut(userId, vaultId, authorization, contentType, accept, xVaultAPIClientID)

Update Vault Membership

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The user id field value. | |
| **vaultId** | **String**| The system-managed id field value assigned to each vault in the domain. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsVaultActionsComparePost

> void objectsVaultActionsComparePost(authorization, contentType, xVaultAPIClientID)

Vault Compare

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## objectsVaultActionsConfigreportPost

> void objectsVaultActionsConfigreportPost(authorization, contentType, xVaultAPIClientID)

Vault Configuration Report

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## queryComponentsPost

> void queryComponentsPost(authorization, accept, contentType, xVaultAPIClientID)

Component Definition Query

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## queryNextPagePost

> void queryNextPagePost(nextPage, authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID)

Next Page URL

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nextPage** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIDescribeQuery** | **Boolean**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## queryPost

> void queryPost(authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID)

Submitting a Query

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIDescribeQuery** | **Boolean**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## queryPreviousPagePost

> void queryPreviousPagePost(previousPage, authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID)

Previous Page URL

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **previousPage** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIDescribeQuery** | **Boolean**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2MeGet

> void scimV2MeGet(attributes, excludedAttributes, authorization, accept, xVaultAPIClientID)

Retrieve Current User with SCIM

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] |
| **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2MePut

> void scimV2MePut(attributes, excludedAttributes, authorization, accept, contentType, xVaultAPIClientID)

Update Current User with SCIM

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] |
| **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2ResourceTypesGet

> void scimV2ResourceTypesGet(authorization, accept, xVaultAPIClientID)

Retrieve All SCIM Resource Types

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2ResourceTypesTypeGet

> void scimV2ResourceTypesTypeGet(type, authorization, accept, xVaultAPIClientID)

Retrieve Single SCIM Resource Type

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2SchemasGet

> void scimV2SchemasGet(authorization, accept, xVaultAPIClientID)

Retrieve All SCIM Schema Information

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2SchemasIdGet

> void scimV2SchemasIdGet(id, authorization, accept, xVaultAPIClientID)

Retrieve Single SCIM Schema Information

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2ServiceProviderConfigGet

> void scimV2ServiceProviderConfigGet(authorization, accept, xVaultAPIClientID)

Retrieve SCIM Provider

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2TypeGet

> void scimV2TypeGet(type, filter, attributes, excludedAttributes, sortBy, sortOrder, startIndex, authorization, accept, xVaultAPIClientID)

Retrieve SCIM Resources

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | |
| **filter** | **String**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] |
| **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] |
| **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] |
| **sortBy** | **String**| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] |
| **sortOrder** | **String**| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] |
| **startIndex** | **String**| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2TypeIdGet

> void scimV2TypeIdGet(type, id, attributes, excludedAttributes, authorization, accept, xVaultAPIClientID)

Retrieve Single SCIM Resource

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | |
| **id** | **String**| The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. | |
| **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] |
| **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2UsersGet

> void scimV2UsersGet(filter, attributes, excludedAttributes, sortBy, sortOrder, count, startIndex, authorization, accept, xVaultAPIClientID)

Retrieve All Users with SCIM

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | **String**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] |
| **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] |
| **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] |
| **sortBy** | **String**| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] |
| **sortOrder** | **String**| Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [optional] |
| **count** | **String**| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] |
| **startIndex** | **String**| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2UsersIdGet

> void scimV2UsersIdGet(id, filter, attributes, excludedAttributes, authorization, accept, xVaultAPIClientID)

Retrieve Single User with SCIM

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The id of the user you wish to update. | |
| **filter** | **String**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] |
| **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] |
| **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2UsersIdPut

> void scimV2UsersIdPut(id, authorization, accept, contentType, xVaultAPIClientID)

Update User with SCIM

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The id of the user you wish to update. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## scimV2UsersPost

> void scimV2UsersPost(authorization, accept, contentType, xVaultAPIClientID)

Create User with SCIM

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesCertificateCertIdGet

> void servicesCertificateCertIdGet(certId, authorization, accept, xVaultAPIClientID)

Retrieve Signing Certificate

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **certId** | **String**| The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesConfigurationModeActionsDisablePost

> void servicesConfigurationModeActionsDisablePost(authorization, accept, contentType, xVaultAPIClientID)

Disable Configuration Mode

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesConfigurationModeActionsEnablePost

> void servicesConfigurationModeActionsEnablePost(authorization, accept, contentType, xVaultAPIClientID)

Enable Configuration Mode

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesDirectdataFilesGet

> void servicesDirectdataFilesGet(extractType, startTime, stopTime, accept, authorization, xVaultAPIClientID)

Retrieve Available Direct Data Files

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **extractType** | **String**| The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [optional] |
| **startTime** | **Integer**| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [optional] |
| **stopTime** | **Integer**| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [optional] |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesDirectdataFilesNameGet

> void servicesDirectdataFilesNameGet(name, accept, authorization, xVaultAPIClientID)

Download Direct Data File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingItemsContentItemGet

> void servicesFileStagingItemsContentItemGet(item, authorization, accept, range, xVaultAPIClientID)

Download Item Content

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | **String**| The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **range** | **String**| Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;. | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingItemsItemDelete

> void servicesFileStagingItemsItemDelete(item, recursive, authorization, accept, xVaultAPIClientID)

Delete File or Folder

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | **String**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **recursive** | **String**| Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingItemsItemGet

> void servicesFileStagingItemsItemGet(item, recursive, limit, formatResult, authorization, accept, xVaultAPIClientID)

List Items at a Path

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | **String**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **recursive** | **String**| If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [optional] |
| **limit** | **String**| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] |
| **formatResult** | **String**| If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingItemsItemPut

> void servicesFileStagingItemsItemPut(item, authorization, accept, xVaultAPIClientID)

Update Folder or File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | **String**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingItemsPost

> void servicesFileStagingItemsPost(authorization, accept, contentMD5, xVaultAPIClientID)

Create Folder or File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentMD5** | **String**| Optional: The MD5 checksum of the file being uploaded. | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingUploadGet

> void servicesFileStagingUploadGet(authorization, accept, xVaultAPIClientID)

List Upload Sessions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingUploadPost

> void servicesFileStagingUploadPost(authorization, accept, xVaultAPIClientID)

Create Resumable Upload Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingUploadUploadSessionIdDelete

> void servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId, authorization, accept, xVaultAPIClientID)

Abort Upload Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingUploadUploadSessionIdGet

> void servicesFileStagingUploadUploadSessionIdGet(uploadSessionId, authorization, accept, xVaultAPIClientID)

Get Upload Session Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingUploadUploadSessionIdPartsGet

> void servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionId, limit, authorization, accept, xVaultAPIClientID)

List File Parts Uploaded to Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | **String**|  | |
| **limit** | **String**| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingUploadUploadSessionIdPost

> void servicesFileStagingUploadUploadSessionIdPost(uploadSessionId, authorization, accept, xVaultAPIClientID)

Commit Upload Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesFileStagingUploadUploadSessionIdPut

> void servicesFileStagingUploadUploadSessionIdPut(uploadSessionId, authorization, accept, contentType, xVaultAPIFilePartNumber, contentMD5, xVaultAPIClientID)

Upload to a Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIFilePartNumber** | **String**| The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [optional] |
| **contentMD5** | **String**| Optional: The MD5 checksum of the file part being uploaded. | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesJobsHistoriesGet

> void servicesJobsHistoriesGet(startDate, endDate, status, limit, offset, authorization, accept, xVaultAPIClientID)

Retrieve Job Histories

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **String**| Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] |
| **endDate** | **String**| Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] |
| **status** | **String**| Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [optional] |
| **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] |
| **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesJobsJobIdErrorsGet

> void servicesJobsJobIdErrorsGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Import Bulk Translation File Job Errors

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesJobsJobIdGet

> void servicesJobsJobIdGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Job Status

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The ID of the job, returned from the original job request. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesJobsJobIdSummaryGet

> void servicesJobsJobIdSummaryGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Import Bulk Translation File Job Summary

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesJobsJobIdTasksGet

> void servicesJobsJobIdTasksGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve SDK Job Tasks

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The ID of the SDK job, returned from the original job request. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesJobsMonitorsGet

> void servicesJobsMonitorsGet(startDate, endDate, status, limit, offset, authorization, accept, xVaultAPIClientID)

Retrieve Job Monitors

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **String**| Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] |
| **endDate** | **String**| Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] |
| **status** | **String**| Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [optional] |
| **limit** | **String**| Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] |
| **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesJobsStartNowJobIdPost

> void servicesJobsStartNowJobIdPost(jobId, authorization, accept, xVaultAPIClientID)

Start Job

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The ID of the scheduled job instance to start. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesLoaderExtractPost

> void servicesLoaderExtractPost(authorization, accept, contentType, xVaultAPIClientID)

Extract Data Files

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesLoaderJobIdTasksTaskIdFailurelogGet

> void servicesLoaderJobIdTasksTaskIdFailurelogGet(jobId, taskId, authorization, accept, xVaultAPIClientID)

Retrieve Load Failure Log Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested extract job. | |
| **taskId** | **String**| The id value of the requested extract task. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesLoaderJobIdTasksTaskIdResultsGet

> void servicesLoaderJobIdTasksTaskIdResultsGet(jobId, taskId, authorization, accept, xVaultAPIClientID)

Retrieve Loader Extract Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested extract job. | |
| **taskId** | **String**| The id value of the requested extract task. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesLoaderJobIdTasksTaskIdResultsRenditionsGet

> void servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobId, taskId, authorization, accept, xVaultAPIClientID)

Retrieve Loader Extract Renditions Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested extract job. | |
| **taskId** | **String**| The id value of the requested extract task. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesLoaderJobIdTasksTaskIdSuccesslogGet

> void servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobId, taskId, authorization, accept, xVaultAPIClientID)

Retrieve Load Success Log Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The id value of the requested extract job. | |
| **taskId** | **String**| The id value of the requested extract task. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesLoaderLoadPost

> void servicesLoaderLoadPost(authorization, contentType, accept, xVaultAPIClientID)

Load Data Objects

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesPackageActionsValidatePost

> void servicesPackageActionsValidatePost(authorization, contentType, xVaultAPIClientID)

Validate Package

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesPackagePost

> void servicesPackagePost(authorization, contentType, xVaultAPIClientID)

Export Package

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesPackagePut

> void servicesPackagePut(authorization, contentType, accept, xVaultAPIClientID)

Import Package

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesQueuesGet

> void servicesQueuesGet(authorization, accept, xVaultAPIClientID)

Retrieve All Queues

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesQueuesQueueNameActionsDisableDeliveryPut

> void servicesQueuesQueueNameActionsDisableDeliveryPut(queueName, authorization, accept, xVaultAPIClientID)

Disable Delivery

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String**| The name of a specific Queue. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesQueuesQueueNameActionsEnableDeliveryPut

> void servicesQueuesQueueNameActionsEnableDeliveryPut(queueName, authorization, accept, xVaultAPIClientID)

Enable Delivery

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String**| The name of a specific Queue. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesQueuesQueueNameActionsResetPut

> void servicesQueuesQueueNameActionsResetPut(queueName, authorization, accept, xVaultAPIClientID)

Reset Queue

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String**| The name of a specific Queue. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesQueuesQueueNameGet

> void servicesQueuesQueueNameGet(queueName, authorization, accept, xVaultAPIClientID)

Retrieve Queue Status

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String**| The name of a specific queue. For example, queue__c. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## servicesVobjectVaultPackageVPackageIdActionsValidatePost

> void servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId, authorization, accept, xVaultAPIClientID)

Validate Imported Package

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**| The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## sessionDelete

> void sessionDelete(accept, authorization, xVaultAPIClientID)

End Session

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **authorization** | **String**| The Vault sessionId to end. | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## uicodeDistributionsDistributionNameCodeGet

> void uicodeDistributionsDistributionNameCodeGet(distributionName, accept, authorization, xVaultAPIClientID)

Download Single Client Code Distribution

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionName** | **String**| The name attribute of the client code distribution to download. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## uicodeDistributionsDistributionNameDelete

> void uicodeDistributionsDistributionNameDelete(distributionName, accept, authorization, xVaultAPIClientID)

Delete Single Client Code Distribution

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionName** | **String**| The name attribute of the client code distribution to delete. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## uicodeDistributionsDistributionNameGet

> void uicodeDistributionsDistributionNameGet(distributionName, accept, authorization, xVaultAPIClientID)

Retrieve Single Client Code Distribution Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionName** | **String**| The name attribute of the client code distribution to delete. | |
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## uicodeDistributionsGet

> void uicodeDistributionsGet(accept, authorization, xVaultAPIClientID)

Retrieve All Client Code Distribution Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## uicodeDistributionsPost

> void uicodeDistributionsPost(accept, authorization, contentType, xVaultAPIClientID)

Add or Replace Single Client Code Distribution

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectVaultPackageVPackageIdActionsDeployPost

> void vobjectVaultPackageVPackageIdActionsDeployPost(packageId, authorization, contentType, accept, xVaultAPIClientID)

Deploy Package

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**| The id field value of the vault_package__v object record used for deployment. See Import Package. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectVaultPackageVPackageIdActionsDeployResultsGet

> void vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId, authorization, accept, xVaultAPIClientID)

Retrieve Package Deploy Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**| The id field value of the vault_package__v object record used for deployment. See Deploy Package. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet

> void vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, authorization, accept, xVaultAPIClientID)

Retrieve Results of Cascade Delete Job

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **jobStatus** | **String**|  | |
| **jobId** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet

> void vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, authorization, accept, xVaultAPIClientID)

Retrieve Results of Deep Copy Job

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **jobStatus** | **String**| The ID of the job, retrieved from the response of the job request. | |
| **jobId** | **String**| Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsEdlItemVActionsCreateplaceholderPost

> void vobjectsEdlItemVActionsCreateplaceholderPost(authorization, contentType, accept, xVaultAPIClientID)

Create a Placeholder from an EDL Item

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsMergesJobIdLogGet

> void vobjectsMergesJobIdLogGet(jobId, authorization, accept, xVaultAPIClientID)

Download Merge Records Job Log

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsMergesJobIdResultsGet

> void vobjectsMergesJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Record Merge Results

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsMergesJobIdStatusGet

> void vobjectsMergesJobIdStatusGet(jobId, authorization, accept, xVaultAPIClientID)

Retrieve Record Merge Status

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameActionsActionNamePost

> void vobjectsObjectNameActionsActionNamePost(objectName, actionName, authorization, contentType, accept, xVaultAPIClientID)

Initiate Object Action on Multiple Records

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. | |
| **actionName** | **String**| Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameActionsChangetypePost

> void vobjectsObjectNameActionsChangetypePost(objectName, authorization, contentType, accept, xVaultAPIClientID)

Change Object Type

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The name of the object. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameActionsMergePost

> void vobjectsObjectNameActionsMergePost(objectName, authorization, contentType, accept, xVaultAPIClientID, vobjectsObjectNameActionsMergePostRequestInner)

Initiate Record Merge

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. For example, account__v. This object must have Enable Merges configured. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |
| **vobjectsObjectNameActionsMergePostRequestInner** | [**List&lt;VobjectsObjectNameActionsMergePostRequestInner&gt;**](VobjectsObjectNameActionsMergePostRequestInner.md)|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameActionsRecalculaterollupsGet

> void vobjectsObjectNameActionsRecalculaterollupsGet(objectName, authorization, accept, xVaultAPIClientID)

Retrieve Roll-up Field Recalculation Status

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The name of the object for which to check the status of a Roll-up field recalculation. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameActionsRecalculaterollupsPost

> void vobjectsObjectNameActionsRecalculaterollupsPost(objectName, authorization, accept, xVaultAPIClientID)

Recalculate Roll-up Fields

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The name of the object for which to check the status of a Roll-up field recalculation. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameActionsUpdatecorporatecurrencyPut

> void vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName, authorization, accept, contentType, xVaultAPIClientID)

Update Corporate Currency Fields

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameAttachmentsBatchDelete

> void vobjectsObjectNameAttachmentsBatchDelete(objectName, idParam, authorization, accept, contentType, xVaultAPIClientID)

Delete Multiple Object Record Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **idParam** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameAttachmentsBatchPost

> void vobjectsObjectNameAttachmentsBatchPost(objectName, authorization, accept, contentType, xVaultAPIClientID)

Create Multiple Object Record Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameAttachmentsBatchPut

> void vobjectsObjectNameAttachmentsBatchPut(objectName, authorization, accept, contentType, xVaultAPIClientID)

Update Multiple Object Record Attachment Descriptions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameDelete

> void vobjectsObjectNameDelete(objectName, authorization, contentType, accept, xVaultAPIClientID)

Delete Object Records

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**| Can be text/csv or application/json | [optional] |
| **accept** | **String**| Can be text/csv or application/json | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameIdRolesRoleNameGet

> void vobjectsObjectNameIdRolesRoleNameGet(objectName, id, roleName, authorization, accept, xVaultAPIClientID)

Retrieve Object Record Roles

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name. | |
| **id** | **String**| The id of the document, binder, or object record. | |
| **roleName** | **String**| Optional: Include a role name to filter for a specific role. For example, owner__v. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdActionsActionNameGet

> void vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectName, objectRecordId, actionName, authorization, accept, xVaultAPIClientID)

Retrieve Object User Actions Details

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. | |
| **objectRecordId** | **String**| The object record id field value from which to retrieve user actions. | |
| **actionName** | **String**| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdActionsActionNamePost

> void vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectName, objectRecordId, actionName, authorization, contentType, accept, xVaultAPIClientID)

Initiate Object Action on a Single Record

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. | |
| **objectRecordId** | **String**| The object record id field value from which to retrieve user actions. | |
| **actionName** | **String**| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdActionsCascadedeletePost

> void vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectName, objectRecordId, authorization, accept, xVaultAPIClientID)

Cascade Delete Object Record

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdActionsDeepcopyPost

> void vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectName, objectRecordId, authorization, accept, contentType, xVaultAPIClientID)

Deep Copy Object Record

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdActionsGet

> void vobjectsObjectNameObjectRecordIdActionsGet(objectName, objectRecordId, loc, authorization, accept, xVaultAPIClientID)

Retrieve Object Record User Actions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. | |
| **objectRecordId** | **String**| The object record id field value. | |
| **loc** | **Boolean**| Optional: When true, retrieves localized (translated) strings for the label.  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet

> void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectName, objectRecordId, attachmentFieldName, authorization, accept, xVaultAPIClientID)

Download Attachment Field File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. For example, product__v. | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentFieldName** | **String**| The name of the Attachment field to update. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost

> void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectName, objectRecordId, attachmentFieldName, authorization, accept, xVaultAPIClientID)

Update Attachment Field File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. For example, product__v. | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentFieldName** | **String**| The name of the Attachment field to update. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet

> void vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID)

Download All Attachment Field Files

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. For example, product__v. | |
| **objectRecordId** | **String**| The object record id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectName, objectRecordId, attachmentId, authorization, accept, contentType, xVaultAPIClientID)

Delete Object Record Attachment

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectName, objectRecordId, attachmentId, authorization, accept, xVaultAPIClientID)

Retrieve Object Record Attachment Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectName, objectRecordId, attachmentId, authorization, accept, contentType, xVaultAPIClientID)

Update Object Record Attachment Description

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID)

Delete Object Record Attachment Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**| The attachment version__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID)

Download Object Record Attachment File

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID)

Retrieve Object Record Attachment Version Metadata

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**| The attachment version__v field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectName, objectRecordId, attachmentId, attachmentVersion, restore, authorization, accept, contentType, xVaultAPIClientID)

Restore Object Record Attachment Version

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **attachmentVersion** | **String**| The attachment version__v field value. | |
| **restore** | **Boolean**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet

> void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectName, objectRecordId, attachmentId, authorization, accept, xVaultAPIClientID)

Retrieve Object Record Attachment Versions

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **attachmentId** | **String**| The attachment id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsFileGet

> void vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID)

Download All Object Record Attachment Files

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsGet

> void vobjectsObjectNameObjectRecordIdAttachmentsGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID)

Retrieve Object Record Attachments

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAttachmentsPost

> void vobjectsObjectNameObjectRecordIdAttachmentsPost(objectName, objectRecordId, authorization, accept, contentType, xVaultAPIClientID)

Create Object Record Attachment

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdAudittrailGet

> void vobjectsObjectNameObjectRecordIdAudittrailGet(objectName, objectRecordId, startDate, endDate, formatResult, limit, offset, events, authorization, accept, xVaultAPIClientID)

Retrieve Complete Audit History for a Single Object Record

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value. | |
| **objectRecordId** | **String**| The object record id field value from which to retrieve user actions. | |
| **startDate** | **String**| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  | [optional] |
| **endDate** | **String**| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] |
| **formatResult** | **String**| To request a CSV file of your audit history, use csv.  | [optional] |
| **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] |
| **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] |
| **events** | **String**| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events. | [optional] |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameObjectRecordIdGet

> void vobjectsObjectNameObjectRecordIdGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID)

Retrieve Object Record

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | **String**| The object record id field value. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNamePost

> void vobjectsObjectNamePost(objectName, idParam, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID)

Create &amp; Upsert Object Records

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **idParam** | **String**| To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;. | [optional] |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**| Can be text/csv or application/json | [optional] |
| **accept** | **String**| Can be text/csv or application/json | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] |
| **xVaultAPINoTriggers** | **Boolean**| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNamePut

> void vobjectsObjectNamePut(objectName, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID)

Update Object Records

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **authorization** | **String**|  | [optional] |
| **contentType** | **String**| Can be text/csv or application/json | [optional] |
| **accept** | **String**| Can be text/csv or application/json | [optional] |
| **xVaultAPIMigrationMode** | **Boolean**| If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] |
| **xVaultAPINoTriggers** | **Boolean**| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameRolesDelete

> void vobjectsObjectNameRolesDelete(objectName, authorization, accept, contentType, xVaultAPIClientID)

Remove Users &amp; Groups from Roles on Object Records

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The name of the object where you want to remove roles. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsObjectNameRolesPost

> void vobjectsObjectNameRolesPost(objectName, authorization, accept, contentType, xVaultAPIClientID)

Assign Users &amp; Groups to Roles on Object Records

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | **String**| The name of the object where you want to remove roles. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## vobjectsOutboundPackageVPackageIdDependenciesGet

> void vobjectsOutboundPackageVPackageIdDependenciesGet(packageId, authorization, accept, xVaultAPIClientID)

Retrieve Outbound Package Dependencies

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**| The ID of the outbound_package__v record from which to retrieve dependencies. | |
| **authorization** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |
| **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

