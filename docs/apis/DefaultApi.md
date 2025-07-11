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


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="apiGet"></a>
# **apiGet**
```java
Mono<Void> DefaultApi.apiGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve API Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiMdlComponentsComponentTypeAndRecordNameFilesGet"></a>
# **apiMdlComponentsComponentTypeAndRecordNameFilesGet**
```java
Mono<Void> DefaultApi.apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName_authorizationacceptxVaultAPIClientID)
```

Retrieve Content File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypeAndRecordName** | `String`| The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiMdlComponentsComponentTypeAndRecordNameGet"></a>
# **apiMdlComponentsComponentTypeAndRecordNameGet**
```java
Mono<Void> DefaultApi.apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName_authorizationacceptxVaultAPIClientID)
```

Retrieve Component Record (MDL)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypeAndRecordName** | `String`| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiMdlExecuteAsyncJobIdResultsGet"></a>
# **apiMdlExecuteAsyncJobIdResultsGet**
```java
Mono<Void> DefaultApi.apiMdlExecuteAsyncJobIdResultsGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Asynchronous MDL Script Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiMdlExecuteAsyncPost"></a>
# **apiMdlExecuteAsyncPost**
```java
Mono<Void> DefaultApi.apiMdlExecuteAsyncPost(_authorizationacceptxVaultAPIClientID)
```

Execute MDL Script Asynchronously

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiMdlExecutePost"></a>
# **apiMdlExecutePost**
```java
Mono<Void> DefaultApi.apiMdlExecutePost(_authorizationacceptxVaultAPIClientID)
```

Execute MDL Script

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiMdlFilesPost"></a>
# **apiMdlFilesPost**
```java
Mono<Void> DefaultApi.apiMdlFilesPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Upload Content File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="audittrailAuditTrailTypeGet"></a>
# **audittrailAuditTrailTypeGet**
```java
Mono<Void> DefaultApi.audittrailAuditTrailTypeGet(auditTrailTypestartDateendDateallDatesformatResultlimitoffsetobjectsevents_authorizationacceptxVaultAPIClientID)
```

Retrieve Audit Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **auditTrailType** | `String`| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. | |
| **startDate** | `String`| Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional parameter] |
| **endDate** | `String`| Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional parameter] |
| **allDates** | `String`| Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [optional parameter] |
| **formatResult** | `String`| To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [optional parameter] |
| **limit** | `String`| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional parameter] |
| **offset** | `String`| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional parameter] |
| **objects** | `String`| This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects. | [optional parameter] |
| **events** | `String`| This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="authDiscoveryPost"></a>
# **authDiscoveryPost**
```java
Mono<Void> DefaultApi.authDiscoveryPost(acceptxVaultAPIClientID)
```

Authentication Type Discovery

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="authOauthSessionOathOidcProfileIdPost"></a>
# **authOauthSessionOathOidcProfileIdPost**
```java
Mono<Void> DefaultApi.authOauthSessionOathOidcProfileIdPost(oathOidcProfileId_authorizationacceptxVaultAPIClientID)
```

OAuth 2.0 / OpenID Connect

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oathOidcProfileId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="authPost"></a>
# **authPost**
```java
Mono<Void> DefaultApi.authPost(contentTypeacceptxVaultAPIClientID)
```

User Name and Password

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeClassNameDelete"></a>
# **codeClassNameDelete**
```java
Mono<Void> DefaultApi.codeClassNameDelete(className_authorizationacceptxVaultAPIClientID)
```

Delete Single Source Code File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | `String`| The fully qualified class name of your file. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeClassNameDisablePut"></a>
# **codeClassNameDisablePut**
```java
Mono<Void> DefaultApi.codeClassNameDisablePut(className_authorizationacceptcontentTypexVaultAPIClientID)
```

Disable Vault Extension

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | `String`| The fully qualified class name of your file. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeClassNameEnablePut"></a>
# **codeClassNameEnablePut**
```java
Mono<Void> DefaultApi.codeClassNameEnablePut(className_authorizationacceptcontentTypexVaultAPIClientID)
```

Enable Vault Extension

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | `String`| The fully qualified class name of your file. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeClassNameGet"></a>
# **codeClassNameGet**
```java
Mono<Void> DefaultApi.codeClassNameGet(className_authorizationacceptxVaultAPIClientID)
```

Retrieve Single Source Code File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | `String`| The fully qualified class name of your file. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeProfilerGet"></a>
# **codeProfilerGet**
```java
Mono<Void> DefaultApi.codeProfilerGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Profiling Sessions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeProfilerPost"></a>
# **codeProfilerPost**
```java
Mono<Void> DefaultApi.codeProfilerPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Create Profiling Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeProfilerSessionNameActionsEndPost"></a>
# **codeProfilerSessionNameActionsEndPost**
```java
Mono<Void> DefaultApi.codeProfilerSessionNameActionsEndPost(sessionName_authorizationacceptxVaultAPIClientID)
```

End Profiling Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | `String`| The name of the session, for example,  baseline__c. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeProfilerSessionNameDelete"></a>
# **codeProfilerSessionNameDelete**
```java
Mono<Void> DefaultApi.codeProfilerSessionNameDelete(sessionName_authorizationacceptxVaultAPIClientID)
```

Delete Profiling Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | `String`| The name of the session, for example,  baseline__c. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeProfilerSessionNameGet"></a>
# **codeProfilerSessionNameGet**
```java
Mono<Void> DefaultApi.codeProfilerSessionNameGet(sessionName_authorizationacceptxVaultAPIClientID)
```

Retrieve Profiling Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | `String`| The name of the session, for example,  baseline__c. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codeProfilerSessionNameResultsGet"></a>
# **codeProfilerSessionNameResultsGet**
```java
Mono<Void> DefaultApi.codeProfilerSessionNameResultsGet(sessionName_authorizationacceptxVaultAPIClientID)
```

Download Profiling Session Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionName** | `String`| The name of the session, for example,  baseline__c. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codePut"></a>
# **codePut**
```java
Mono<Void> DefaultApi.codePut(_authorizationacceptcontentTypexVaultAPIClientID)
```

Add or Replace Single Source Code File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="compositesTreesEdlHierarchyOrTemplateActionsListnodesPost"></a>
# **compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**
```java
Mono<Void> DefaultApi.compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate_authorizationcontentTypeacceptxVaultAPIClientID)
```

Retrieve Specific Root Nodes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edlHierarchyOrTemplate** | `String`| Choose to retrieve either edl_hierarchy__v or edl_template__v | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="compositesTreesEdlHierarchyOrTemplateGet"></a>
# **compositesTreesEdlHierarchyOrTemplateGet**
```java
Mono<Void> DefaultApi.compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate_authorizationcontentTypeacceptxVaultAPIClientID)
```

Retrieve All Root Nodes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edlHierarchyOrTemplate** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="compositesTreesEdlHierarchyVParentNodeIdChildrenGet"></a>
# **compositesTreesEdlHierarchyVParentNodeIdChildrenGet**
```java
Mono<Void> DefaultApi.compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Retrieve a Node&#39;s Children

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parentNodeId** | `String`| The ID of a parent node in the hierarchy. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="compositesTreesEdlHierarchyVParentNodeIdChildrenPut"></a>
# **compositesTreesEdlHierarchyVParentNodeIdChildrenPut**
```java
Mono<Void> DefaultApi.compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Update Node Order

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parentNodeId** | `String`| The ID of a parent node in the hierarchy. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationComponentTypeAndRecordNameGet"></a>
# **configurationComponentTypeAndRecordNameGet**
```java
Mono<Void> DefaultApi.configurationComponentTypeAndRecordNameGet(componentTypeAndRecordNameloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Component Record (XML/JSON)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentTypeAndRecordName** | `String`| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | |
| **loc** | `String`| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationComponentTypeGet"></a>
# **configurationComponentTypeGet**
```java
Mono<Void> DefaultApi.configurationComponentTypeGet(componentType_authorizationacceptxVaultAPIClientID)
```

Retrieve Component Record Collection

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentType** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationObjectNameAndObjectTypeGet"></a>
# **configurationObjectNameAndObjectTypeGet**
```java
Mono<Void> DefaultApi.configurationObjectNameAndObjectTypeGet(objectNameAndObjectTypeloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Details from a Specific Object

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectNameAndObjectType** | `String`| The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;. | |
| **loc** | `String`| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationObjecttypeGet"></a>
# **configurationObjecttypeGet**
```java
Mono<Void> DefaultApi.configurationObjecttypeGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Details from All Object Types

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationRoleAssignmentRuleDelete"></a>
# **configurationRoleAssignmentRuleDelete**
```java
Mono<Void> DefaultApi.configurationRoleAssignmentRuleDelete(_authorizationacceptxVaultAPIClientID)
```

Delete Lifecycle Role Assignment Override Rules

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationRoleAssignmentRuleGet"></a>
# **configurationRoleAssignmentRuleGet**
```java
Mono<Void> DefaultApi.configurationRoleAssignmentRuleGet(lifecycleVroleVproductVcountryVstudyVstudyCountryV_authorizationacceptxVaultAPIClientID)
```

Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lifecycleV** | `String`| Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c | [optional parameter] |
| **roleV** | `String`| Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c | [optional parameter] |
| **productV** | `String`| Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap | [optional parameter] |
| **countryV** | `String`| Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States | [optional parameter] |
| **studyV** | `String`| In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study | [optional parameter] |
| **studyCountryV** | `String`| In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationRoleAssignmentRulePost"></a>
# **configurationRoleAssignmentRulePost**
```java
Mono<Void> DefaultApi.configurationRoleAssignmentRulePost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Lifecycle Role Assignment Override Rules

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="configurationRoleAssignmentRulePut"></a>
# **configurationRoleAssignmentRulePut**
```java
Mono<Void> DefaultApi.configurationRoleAssignmentRulePut(_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Lifecycle Role Assignment Rules (Default &amp; Override)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="delegationLoginPost"></a>
# **delegationLoginPost**
```java
Mono<Void> DefaultApi.delegationLoginPost(_authorizationacceptxVaultAPIClientID)
```

Initiate Delegated Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`| The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="delegationVaultsGet"></a>
# **delegationVaultsGet**
```java
Mono<Void> DefaultApi.delegationVaultsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Delegations

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="keepAlivePost"></a>
# **keepAlivePost**
```java
Mono<Void> DefaultApi.keepAlivePost(_authorizationacceptxVaultAPIClientID)
```

Session Keep Alive

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="limitsGet"></a>
# **limitsGet**
```java
Mono<Void> DefaultApi.limitsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Limits on Objects

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsApiUsageGet"></a>
# **logsApiUsageGet**
```java
Mono<Void> DefaultApi.logsApiUsageGet(datelogFormat_authorizationacceptxVaultAPIClientID)
```

Download Daily API Usage

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | `String`| The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [optional parameter] |
| **logFormat** | `String`| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsCodeDebugGet"></a>
# **logsCodeDebugGet**
```java
Mono<Void> DefaultApi.logsCodeDebugGet(userIdincludeInactive_authorizationacceptxVaultAPIClientID)
```

Retrieve All Debug Logs

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | `String`| Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [optional parameter] |
| **includeInactive** | `Boolean`| Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsCodeDebugIdActionsResetDelete"></a>
# **logsCodeDebugIdActionsResetDelete**
```java
Mono<Void> DefaultApi.logsCodeDebugIdActionsResetDelete(id_authorizationacceptxVaultAPIClientID)
```

Delete Debug Log

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the debug log to delete. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsCodeDebugIdActionsResetPost"></a>
# **logsCodeDebugIdActionsResetPost**
```java
Mono<Void> DefaultApi.logsCodeDebugIdActionsResetPost(id_authorizationacceptxVaultAPIClientID)
```

Reset Debug Log

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the debug log to delete. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsCodeDebugIdFilesGet"></a>
# **logsCodeDebugIdFilesGet**
```java
Mono<Void> DefaultApi.logsCodeDebugIdFilesGet(id_authorizationacceptxVaultAPIClientID)
```

Download Debug Log Files

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the debug log to download. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsCodeDebugIdGet"></a>
# **logsCodeDebugIdGet**
```java
Mono<Void> DefaultApi.logsCodeDebugIdGet(id_authorizationacceptxVaultAPIClientID)
```

Retrieve Single Debug Log

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the debug log to retrieve. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsCodeDebugPost"></a>
# **logsCodeDebugPost**
```java
Mono<Void> DefaultApi.logsCodeDebugPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Debug Log

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logsCodeRuntimeGet"></a>
# **logsCodeRuntimeGet**
```java
Mono<Void> DefaultApi.logsCodeRuntimeGet(datelogFormat_authorizationacceptxVaultAPIClientID)
```

Download SDK Runtime Log

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | `String`|  | [optional parameter] |
| **logFormat** | `String`| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="messagesMessageTypeActionsImportPost"></a>
# **messagesMessageTypeActionsImportPost**
```java
Mono<Void> DefaultApi.messagesMessageTypeActionsImportPost(messageType_authorizationacceptxVaultAPIClientID)
```

Import Bulk Translation File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageType** | `String`| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="messagesMessageTypeLanguageLangActionsExportPost"></a>
# **messagesMessageTypeLanguageLangActionsExportPost**
```java
Mono<Void> DefaultApi.messagesMessageTypeLanguageLangActionsExportPost(messageTypelang_authorizationacceptxVaultAPIClientID)
```

Export Bulk Translation File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messageType** | `String`| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | |
| **lang** | `String`| A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataAudittrailAuditTrailTypeGet"></a>
# **metadataAudittrailAuditTrailTypeGet**
```java
Mono<Void> DefaultApi.metadataAudittrailAuditTrailTypeGet(auditTrailType_authorizationacceptxVaultAPIClientID)
```

Retrieve Audit Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **auditTrailType** | `String`| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataAudittrailGet"></a>
# **metadataAudittrailGet**
```java
Mono<Void> DefaultApi.metadataAudittrailGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Audit Types

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataComponentsComponentTypeGet"></a>
# **metadataComponentsComponentTypeGet**
```java
Mono<Void> DefaultApi.metadataComponentsComponentTypeGet(componentType_authorizationacceptxVaultAPIClientID)
```

Retrieve Component Type Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **componentType** | `String`| The component type name (Picklist, Docfield, Doctype, etc.). | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataComponentsGet"></a>
# **metadataComponentsGet**
```java
Mono<Void> DefaultApi.metadataComponentsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Component Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsBindersTemplatesBindernodesGet"></a>
# **metadataObjectsBindersTemplatesBindernodesGet**
```java
Mono<Void> DefaultApi.metadataObjectsBindersTemplatesBindernodesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Template Node Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsBindersTemplatesGet"></a>
# **metadataObjectsBindersTemplatesGet**
```java
Mono<Void> DefaultApi.metadataObjectsBindersTemplatesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Template Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet"></a>
# **metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType_authorizationacceptxVaultAPIClientID)
```

Retrieve Annotation Placemark Type Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **placemarkType** | `String`| The name of the placemark type. For example, sticky__sys. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet"></a>
# **metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType_authorizationacceptxVaultAPIClientID)
```

Retrieve Annotation Reference Type Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **referenceType** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet"></a>
# **metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType_authorizationacceptxVaultAPIClientID)
```

Retrieve Annotation Type Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **annotationType** | `String`| The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet"></a>
# **metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventTypeeventSubtype_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Event SubType Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventType** | `String`| The event type. For example, distribution__v. | |
| **eventSubtype** | `String`| The event subtype. For example, approved_email__v. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsEventsGet"></a>
# **metadataObjectsDocumentsEventsGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsEventsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Event Types and Subtypes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsLockGet"></a>
# **metadataObjectsDocumentsLockGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsLockGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Lock Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsPropertiesFindCommonPost"></a>
# **metadataObjectsDocumentsPropertiesFindCommonPost**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsPropertiesFindCommonPost(contentTypeaccept_authorizationxVaultAPIClientID)
```

Retrieve Common Document Fields

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsPropertiesGet"></a>
# **metadataObjectsDocumentsPropertiesGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsPropertiesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Document Fields

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsTemplatesGet"></a>
# **metadataObjectsDocumentsTemplatesGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsTemplatesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Template Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsTypesGet"></a>
# **metadataObjectsDocumentsTypesGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsTypesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Document Types

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsTypesTypeGet"></a>
# **metadataObjectsDocumentsTypesTypeGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsTypesTypeGet(type_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Type

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| The document type. See Retrieve Document Types. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsTypesTypeRelationshipsGet"></a>
# **metadataObjectsDocumentsTypesTypeRelationshipsGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsTypesTypeRelationshipsGet(type_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Type Relationships

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| The document type. See Retrieve Document Types. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet"></a>
# **metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(typesubtypeclassification_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Classification

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| The document type. See Retrieve Document Types. | |
| **subtype** | `String`| The document subtype. See Retrieve Document Types. | |
| **classification** | `String`| The document classification. See Retrieve Document Types. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet"></a>
# **metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**
```java
Mono<Void> DefaultApi.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(typesubtype_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Subtype

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| The document type. See Retrieve Document Types. | |
| **subtype** | `String`| The document subtype. See Retrieve Document Types. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsGroupsGet"></a>
# **metadataObjectsGroupsGet**
```java
Mono<Void> DefaultApi.metadataObjectsGroupsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Group Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsSecuritypoliciesGet"></a>
# **metadataObjectsSecuritypoliciesGet**
```java
Mono<Void> DefaultApi.metadataObjectsSecuritypoliciesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Security Policy Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataObjectsUsersGet"></a>
# **metadataObjectsUsersGet**
```java
Mono<Void> DefaultApi.metadataObjectsUsersGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve User Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet"></a>
# **metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**
```java
Mono<Void> DefaultApi.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Archived Document Signature Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet"></a>
# **metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**
```java
Mono<Void> DefaultApi.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Signature Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataVobjectsGet"></a>
# **metadataVobjectsGet**
```java
Mono<Void> DefaultApi.metadataVobjectsGet(loc_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Collection

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loc** | `Boolean`| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataVobjectsObjectNameActionsCanceldeploymentPost"></a>
# **metadataVobjectsObjectNameActionsCanceldeploymentPost**
```java
Mono<Void> DefaultApi.metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName_authorizationacceptxVaultAPIClientID)
```

Cancel Raw Object Deployment

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataVobjectsObjectNameFieldsObjectFieldNameGet"></a>
# **metadataVobjectsObjectNameFieldsObjectFieldNameGet**
```java
Mono<Void> DefaultApi.metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectNameobjectFieldNameloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Field Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectFieldName** | `String`| The object field name value (id, name__v, external_id__v, etc.). | |
| **loc** | `Boolean`| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataVobjectsObjectNameGet"></a>
# **metadataVobjectsObjectNameGet**
```java
Mono<Void> DefaultApi.metadataVobjectsObjectNameGet(objectNameloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **loc** | `Boolean`| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataVobjectsObjectNamePageLayoutsGet"></a>
# **metadataVobjectsObjectNamePageLayoutsGet**
```java
Mono<Void> DefaultApi.metadataVobjectsObjectNamePageLayoutsGet(objectName_authorizationacceptxVaultAPIClientID)
```

Retrieve Page Layouts

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="metadataVobjectsObjectNamePageLayoutsLayoutNameGet"></a>
# **metadataVobjectsObjectNamePageLayoutsLayoutNameGet**
```java
Mono<Void> DefaultApi.metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectNamelayoutName_authorizationacceptxVaultAPIClientID)
```

Retrieve Page Layout Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The name of the object from which to retrieve page layout metadata. | |
| **layoutName** | `String`| The name of the page layout from which to retrieve metadata. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="notificationsHistoriesGet"></a>
# **notificationsHistoriesGet**
```java
Mono<Void> DefaultApi.notificationsHistoriesGet(startDateendDateallDatesformatResultlimitoffset_authorizationacceptxVaultAPIClientID)
```

Retrieve Email Notification Histories

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `String`| Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. | [optional parameter] |
| **endDate** | `String`| Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. | [optional parameter] |
| **allDates** | `Boolean`| Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [optional parameter] |
| **formatResult** | `String`| To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [optional parameter] |
| **limit** | `String`| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional parameter] |
| **offset** | `String`| Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectWorkflowActionsActionGet"></a>
# **objectWorkflowActionsActionGet**
```java
Mono<Void> DefaultApi.objectWorkflowActionsActionGet(action_authorizationacceptxVaultAPIClientID)
```

Retrieve Bulk Workflow Action Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectWorkflowActionsActionPost"></a>
# **objectWorkflowActionsActionPost**
```java
Mono<Void> DefaultApi.objectWorkflowActionsActionPost(action_authorizationacceptcontentTypexVaultAPIClientID)
```

Initiate Workflow Actions on Multiple Workflows

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectWorkflowActionsCanceltasksPost"></a>
# **objectWorkflowActionsCanceltasksPost**
```java
Mono<Void> DefaultApi.objectWorkflowActionsCanceltasksPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Cancel Workflow Tasks

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectWorkflowActionsCancelworkflowsPost"></a>
# **objectWorkflowActionsCancelworkflowsPost**
```java
Mono<Void> DefaultApi.objectWorkflowActionsCancelworkflowsPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Cancel Workflows

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectWorkflowActionsGet"></a>
# **objectWorkflowActionsGet**
```java
Mono<Void> DefaultApi.objectWorkflowActionsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Bulk Workflow Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectWorkflowActionsReassigntasksPost"></a>
# **objectWorkflowActionsReassigntasksPost**
```java
Mono<Void> DefaultApi.objectWorkflowActionsReassigntasksPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Reassign Workflow Tasks

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectWorkflowActionsReplaceworkflowownerPost"></a>
# **objectWorkflowActionsReplaceworkflowownerPost**
```java
Mono<Void> DefaultApi.objectWorkflowActionsReplaceworkflowownerPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Replace Workflow Owner

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersActionsExportJobIdResultsGet"></a>
# **objectsBindersActionsExportJobIdResultsGet**
```java
Mono<Void> DefaultApi.objectsBindersActionsExportJobIdResultsGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Export Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested export job. This is returned with the export binder requests above. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdActionsExportPost"></a>
# **objectsBindersBinderIdActionsExportPost**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdActionsExportPost(binderIdsourcerenditiontypedocversionattachmentsexportdocfield_authorizationacceptxVaultAPIClientID)
```

Export Binder (Latest Version)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **source** | `Boolean`| to include source content or not | [optional parameter] |
| **renditiontype** | `String`| to include viewable renditions | [optional parameter] |
| **docversion** | `String`| to include all major versions | [optional parameter] |
| **attachments** | `String`| to include all versions of attachments | [optional parameter] |
| **export** | `String`| configurable filename metadata | [optional parameter] |
| **docfield** | `Boolean`| to exclude document metadata csv | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdActionsPost"></a>
# **objectsBindersBinderIdActionsPost**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdActionsPost(binderId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Refresh Binder Auto-Filing

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdBindingRulePut"></a>
# **objectsBindersBinderIdBindingRulePut**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdBindingRulePut(binderIdcontentTypeaccept_authorizationxVaultAPIClientID)
```

Update Binding Rule

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdDelete"></a>
# **objectsBindersBinderIdDelete**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdDelete(binderId_authorizationacceptxVaultAPIClientID)
```

Delete Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdDocumentsNodeIdBindingRulePut"></a>
# **objectsBindersBinderIdDocumentsNodeIdBindingRulePut**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderIdnodeId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Update Binder Document Binding Rule

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **nodeId** | `String`| The binder node id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdDocumentsPost"></a>
# **objectsBindersBinderIdDocumentsPost**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdDocumentsPost(binderId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Add Document to Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdDocumentsSectionIdDelete"></a>
# **objectsBindersBinderIdDocumentsSectionIdDelete**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdDocumentsSectionIdDelete(binderIdsectionId_authorizationacceptxVaultAPIClientID)
```

Remove Document from Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **sectionId** | `String`| The binder node id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdDocumentsSectionIdPut"></a>
# **objectsBindersBinderIdDocumentsSectionIdPut**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdDocumentsSectionIdPut(binderIdsectionId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Move Document in Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **sectionId** | `String`| The binder node id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdGet"></a>
# **objectsBindersBinderIdGet**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdGet(binderIddepth_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **depth** | `String`| To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdPost"></a>
# **objectsBindersBinderIdPost**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdPost(binderId_authorizationacceptxVaultAPIClientID)
```

Create Binder Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdPut"></a>
# **objectsBindersBinderIdPut**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdPut(binderId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Update Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete"></a>
# **objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderIdroleNameAndUserOrGroupid_authorizationacceptxVaultAPIClientID)
```

Remove Users &amp; Groups from Roles on a Single Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The id value of the binder from which to remove roles. | |
| **roleNameAndUserOrGroup** | `String`| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | |
| **id** | `String`| The id value of the user or group to remove from the role. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdSectionsNodeIdBindingRulePut"></a>
# **objectsBindersBinderIdSectionsNodeIdBindingRulePut**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderIdnodeIdcontentTypeaccept_authorizationxVaultAPIClientID)
```

Update Binder Section Binding Rule

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **nodeId** | `String`| The binder node id field value. | |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdSectionsNodeIdPut"></a>
# **objectsBindersBinderIdSectionsNodeIdPut**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdSectionsNodeIdPut(binderIdnodeId_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Binder Section

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **nodeId** | `String`| The binder node id of the section. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdSectionsPost"></a>
# **objectsBindersBinderIdSectionsPost**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdSectionsPost(binderId_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Binder Section

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdSectionsSectionIdDelete"></a>
# **objectsBindersBinderIdSectionsSectionIdDelete**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdSectionsSectionIdDelete(binderIdsectionId_authorizationacceptcontentTypexVaultAPIClientID)
```

Delete Binder Section

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **sectionId** | `String`| The binder node id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdSectionsSectionIdGet"></a>
# **objectsBindersBinderIdSectionsSectionIdGet**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdSectionsSectionIdGet(binderIdsectionId_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Sections

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **sectionId** | `String`| The binder node id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsGet"></a>
# **objectsBindersBinderIdVersionsGet**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsGet(binderId_authorizationacceptxVaultAPIClientID)
```

Retrieve All Binder Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderIdmajorVersionminorVersionsourcerenditiontypedocversionattachmentsexportdocfield_authorizationacceptxVaultAPIClientID)
```

Export Binder (Specific Version)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **source** | `Boolean`| to include source content or not | [optional parameter] |
| **renditiontype** | `String`| to include viewable renditions | [optional parameter] |
| **docversion** | `String`| to include all major versions | [optional parameter] |
| **attachments** | `String`| to include all versions of attachments | [optional parameter] |
| **export** | `String`| configurable filename metadata | [optional parameter] |
| **docfield** | `Boolean`| to exclude document metadata csv | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Delete Binder Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionGet"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionPut"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderIdmajorVersionminorVersion_authorizationcontentTypeacceptxVaultAPIClientID)
```

Update Binder Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderIdmajorVersionminorVersion_authorizationcontentTypeacceptxVaultAPIClientID)
```

Create Binder Relationship

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderIdmajorVersionminorVersionrelationshipId_authorizationacceptxVaultAPIClientID)
```

Delete Binder Relationship

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **relationshipId** | `String`| The binder relationship id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderIdmajorVersionminorVersionrelationshipId_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Relationship

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **relationshipId** | `String`| The binder relationship id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet"></a>
# **objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**
```java
Mono<Void> DefaultApi.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderIdmajorVersionminorVersionsectionId_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Version Section

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **binderId** | `String`| The binder id field value. | |
| **majorVersion** | `String`| The binder major_version_number__v field value. | |
| **minorVersion** | `String`| The binder minor_version_number__v field value. | |
| **sectionId** | `String`| Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersIdRolesGet"></a>
# **objectsBindersIdRolesGet**
```java
Mono<Void> DefaultApi.objectsBindersIdRolesGet(id_authorizationacceptxVaultAPIClientID)
```

Retrieve All Binder Roles

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersIdRolesPost"></a>
# **objectsBindersIdRolesPost**
```java
Mono<Void> DefaultApi.objectsBindersIdRolesPost(id_authorizationacceptcontentTypexVaultAPIClientID)
```

Assign Users &amp; Groups to Roles on a Single Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersIdRolesRoleNameGet"></a>
# **objectsBindersIdRolesRoleNameGet**
```java
Mono<Void> DefaultApi.objectsBindersIdRolesRoleNameGet(idroleName_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Role

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The binder &#x60;id&#x60;. | |
| **roleName** | `String`| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet"></a>
# **objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**
```java
Mono<Void> DefaultApi.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(idmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder User Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The binder id field value from which to retrieve available user actions. | |
| **majorVersion** | `String`| The major version number of the binder. | |
| **minorVersion** | `String`| The minor version number of the binder. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet"></a>
# **objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**
```java
Mono<Void> DefaultApi.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(idmajorVersionminorVersionnameV_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Entry Criteria

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The binder id field value from which to retrieve available user actions. | |
| **majorVersion** | `String`| The major version number of the binder. | |
| **minorVersion** | `String`| The minor version number of the binder. | |
| **nameV** | `String`| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut"></a>
# **objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**
```java
Mono<Void> DefaultApi.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(idmajorVersionminorVersionnameV_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Binder User Action

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The binder id field value from which to retrieve available user actions. | |
| **majorVersion** | `String`| The major version number of the binder. | |
| **minorVersion** | `String`| The minor version number of the binder. | |
| **nameV** | `String`| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersLifecycleActionsPost"></a>
# **objectsBindersLifecycleActionsPost**
```java
Mono<Void> DefaultApi.objectsBindersLifecycleActionsPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Retrieve User Actions on Multiple Binders

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersLifecycleActionsUserActionNamePut"></a>
# **objectsBindersLifecycleActionsUserActionNamePut**
```java
Mono<Void> DefaultApi.objectsBindersLifecycleActionsUserActionNamePut(userActionName_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Bulk Binder User Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userActionName** | `String`| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersPost"></a>
# **objectsBindersPost**
```java
Mono<Void> DefaultApi.objectsBindersPost(async_authorizationcontentTypeacceptxVaultAPIClientID)
```

Create Binder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **async** | `Boolean`| When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesGet"></a>
# **objectsBindersTemplatesGet**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Template Collection

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesPost"></a>
# **objectsBindersTemplatesPost**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Binder Template

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesPut"></a>
# **objectsBindersTemplatesPut**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesPut(_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Binder Template

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesTemplateNameBindernodesGet"></a>
# **objectsBindersTemplatesTemplateNameBindernodesGet**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesTemplateNameBindernodesGet(templateName_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Template Node Attributes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The binder template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesTemplateNameBindernodesPost"></a>
# **objectsBindersTemplatesTemplateNameBindernodesPost**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesTemplateNameBindernodesPost(templateName_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Binder Template Node

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The binder template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesTemplateNameBindernodesPut"></a>
# **objectsBindersTemplatesTemplateNameBindernodesPut**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesTemplateNameBindernodesPut(templateName_authorizationacceptcontentTypexVaultAPIClientID)
```

Replace Binder Template Nodes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The binder template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesTemplateNameDelete"></a>
# **objectsBindersTemplatesTemplateNameDelete**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesTemplateNameDelete(templateName_authorizationacceptxVaultAPIClientID)
```

Delete Binder Template

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The binder template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsBindersTemplatesTemplateNameGet"></a>
# **objectsBindersTemplatesTemplateNameGet**
```java
Mono<Void> DefaultApi.objectsBindersTemplatesTemplateNameGet(templateName_authorizationacceptxVaultAPIClientID)
```

Retrieve Binder Template Attributes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The binder template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDeletionsDocumentsGet"></a>
# **objectsDeletionsDocumentsGet**
```java
Mono<Void> DefaultApi.objectsDeletionsDocumentsGet(startDateendDate_authorizationcontentTypeacceptxVaultAPIClientID)
```

Retrieve Deleted Document IDs

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `String`| Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional parameter] |
| **endDate** | `String`| Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDeletionsVobjectsObjectNameGet"></a>
# **objectsDeletionsVobjectsObjectNameGet**
```java
Mono<Void> DefaultApi.objectsDeletionsVobjectsObjectNameGet(objectName_authorizationacceptxVaultAPIClientID)
```

Retrieve Deleted Object Record ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsActionsGet"></a>
# **objectsDocumentsActionsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsActionsGet(loc_authorizationacceptxVaultAPIClientID)
```

Retrieve All Document Workflows

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loc** | `Boolean`| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet"></a>
# **objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndActionjobId_authorizationacceptxVaultAPIClientID)
```

Download Controlled Copy Job Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lifecycleAndStateAndAction** | `String`| The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link. | |
| **jobId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsActionsWorkflowNameGet"></a>
# **objectsDocumentsActionsWorkflowNameGet**
```java
Mono<Void> DefaultApi.objectsDocumentsActionsWorkflowNameGet(workflowNameloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Workflow Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | `String`| The document workflow name value. | |
| **loc** | `Boolean`| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsActionsWorkflowNamePost"></a>
# **objectsDocumentsActionsWorkflowNamePost**
```java
Mono<Void> DefaultApi.objectsDocumentsActionsWorkflowNamePost(workflowName_authorizationacceptcontentTypexVaultAPIClientID)
```

Initiate Document Workflow

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | `String`| The document workflow name value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsAnnotationsBatchDelete"></a>
# **objectsDocumentsAnnotationsBatchDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsAnnotationsBatchDelete(_authorizationacceptcontentTypexVaultAPIClientID)
```

Delete Annotations

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsAnnotationsBatchPost"></a>
# **objectsDocumentsAnnotationsBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsAnnotationsBatchPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Create Multiple Annotations

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | |
| **contentType** | `String`|  | |
| **accept** | `String`|  | |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsAnnotationsBatchPut"></a>
# **objectsDocumentsAnnotationsBatchPut**
```java
Mono<Void> DefaultApi.objectsDocumentsAnnotationsBatchPut(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Update Annotations

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsAnnotationsRepliesBatchPost"></a>
# **objectsDocumentsAnnotationsRepliesBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsAnnotationsRepliesBatchPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Add Annotation Replies

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsAttachmentsBatchDelete"></a>
# **objectsDocumentsAttachmentsBatchDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsAttachmentsBatchDelete(accept_authorizationcontentTypexVaultAPIClientID)
```

Delete Multiple Document Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsAttachmentsBatchPost"></a>
# **objectsDocumentsAttachmentsBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsAttachmentsBatchPost(accept_authorizationcontentTypexVaultAPIClientID)
```

Create Multiple Document Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsAttachmentsBatchPut"></a>
# **objectsDocumentsAttachmentsBatchPut**
```java
Mono<Void> DefaultApi.objectsDocumentsAttachmentsBatchPut(accept_authorizationcontentTypexVaultAPIClientID)
```

Update Multiple Document Attachment Descriptions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchActionsFileextractJobIdResultsGet"></a>
# **objectsDocumentsBatchActionsFileextractJobIdResultsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Export Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested export job. This is returned with the export document requests. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchActionsFileextractPost"></a>
# **objectsDocumentsBatchActionsFileextractPost**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchActionsFileextractPost(sourcerenditionsallversions_authorizationcontentTypeacceptxVaultAPIClientID)
```

Export Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **source** | `Boolean`| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional parameter] |
| **renditions** | `Boolean`| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional parameter] |
| **allversions** | `Boolean`| Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchActionsReclassifyPut"></a>
# **objectsDocumentsBatchActionsReclassifyPut**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchActionsReclassifyPut(_authorizationcontentTypeacceptxVaultAPIMigrationModexVaultAPIClientID)
```

Reclassify Multiple Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchActionsRerenderPost"></a>
# **objectsDocumentsBatchActionsRerenderPost**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchActionsRerenderPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Multiple Document Renditions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchDelete"></a>
# **objectsDocumentsBatchDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchDelete(idParam_authorizationacceptcontentTypexVaultAPIClientID)
```

Delete Multiple Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | `String`| If you’re identifying documents in your input by their external ID | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchLockDelete"></a>
# **objectsDocumentsBatchLockDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchLockDelete(_authorizationacceptcontentTypexVaultAPIClientID)
```

Undo Collaborative Authoring Checkout

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchPost"></a>
# **objectsDocumentsBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchPost(_authorizationacceptcontentTypexVaultAPIMigrationModexVaultAPIClientID)
```

Create Multiple Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsBatchPut"></a>
# **objectsDocumentsBatchPut**
```java
Mono<Void> DefaultApi.objectsDocumentsBatchPut(_authorizationacceptcontentTypexVaultAPIMigrationModexVaultAPIClientID)
```

Update Multiple Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAnchorsGet"></a>
# **objectsDocumentsDocIdAnchorsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAnchorsGet(docId_authorizationacceptxVaultAPIClientID)
```

Retrieve Anchor IDs

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAnnotationsFileGet"></a>
# **objectsDocumentsDocIdAnnotationsFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAnnotationsFileGet(docId_authorizationacceptxVaultAPIClientID)
```

Export Document Annotations to PDF

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAnnotationsFilePost"></a>
# **objectsDocumentsDocIdAnnotationsFilePost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAnnotationsFilePost(docId_authorizationacceptcontentTypexVaultAPIClientID)
```

Import Document Annotations from PDF

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdDelete"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docIdattachmentIdaccept_authorizationxVaultAPIClientID)
```

Delete Single Document Attachment

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdFileGet"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docIdattachmentIdaccept_authorizationxVaultAPIClientID)
```

Download Document Attachment

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdGet"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdGet(docIdattachmentIdaccept_authorizationxVaultAPIClientID)
```

Retrieve Document Attachment Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdPut"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdPut**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdPut(docIdattachmentIdaccept_authorizationcontentTypexVaultAPIClientID)
```

Update Document Attachment Description

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docIdattachmentIdattachmentVersionaccept_authorizationxVaultAPIClientID)
```

Delete Single Document Attachment Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`| The attachment version__v field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docIdattachmentIdattachmentVersionaccept_authorizationxVaultAPIClientID)
```

Download Document Attachment Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`| The attachment version__v field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docIdattachmentIdattachmentVersionaccept_authorizationxVaultAPIClientID)
```

Retrieve Document Attachment Version Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`| The attachment version__v field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docIdattachmentIdattachmentVersionrestoreaccept_authorizationxVaultAPIClientID)
```

Restore Document Attachment Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`| The attachment version__v field value. | |
| **restore** | `Boolean`| The parameter restore must be set to true.  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet"></a>
# **objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docIdattachmentIdaccept_authorizationxVaultAPIClientID)
```

Retrieve Document Attachment Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsFileGet"></a>
# **objectsDocumentsDocIdAttachmentsFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsFileGet(docIdaccept_authorizationxVaultAPIClientID)
```

Download All Document Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsGet"></a>
# **objectsDocumentsDocIdAttachmentsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsGet(docIdaccept_authorizationxVaultAPIClientID)
```

Retrieve Document Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAttachmentsPost"></a>
# **objectsDocumentsDocIdAttachmentsPost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAttachmentsPost(docIdaccept_authorizationcontentTypexVaultAPIClientID)
```

Create Document Attachment

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdAudittrailGet"></a>
# **objectsDocumentsDocIdAudittrailGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdAudittrailGet(docIdstartDateendDateformatResultlimitoffsetevents_authorizationacceptxVaultAPIClientID)
```

Retrieve Complete Audit History for a Single Document

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document ID for which to retrieve audit history. | |
| **startDate** | `String`| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  | [optional parameter] |
| **endDate** | `String`| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional parameter] |
| **formatResult** | `String`| To request a CSV file of your audit history, use csv.  | [optional parameter] |
| **limit** | `String`| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional parameter] |
| **offset** | `String`| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional parameter] |
| **events** | `String`| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdDelete"></a>
# **objectsDocumentsDocIdDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdDelete(docId_authorizationacceptxVaultAPIClientID)
```

Delete Single Document

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdEventsGet"></a>
# **objectsDocumentsDocIdEventsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdEventsGet(docId_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Events

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdFileGet"></a>
# **objectsDocumentsDocIdFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdFileGet(docIdlockDocumentaccept_authorizationxVaultAPIClientID)
```

Download Document File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **lockDocument** | `Boolean`| Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdGet"></a>
# **objectsDocumentsDocIdGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdGet(docId_authorizationacceptxVaultAPIClientID)
```

Retrieve Document

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdLockDelete"></a>
# **objectsDocumentsDocIdLockDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdLockDelete(docId_authorizationacceptxVaultAPIClientID)
```

Delete Document Lock

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdLockGet"></a>
# **objectsDocumentsDocIdLockGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdLockGet(docId_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Lock

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdLockPost"></a>
# **objectsDocumentsDocIdLockPost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdLockPost(docId_authorizationacceptxVaultAPIClientID)
```

Create Document Lock

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet"></a>
# **objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docIdmajorVersionminorVersionaccept_authorizationxVaultAPIClientID)
```

Download All Document Version Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdPost"></a>
# **objectsDocumentsDocIdPost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdPost(docIdsuppressRendition_authorizationcontentTypeacceptxVaultAPIClientID)
```

Create Single Document Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **suppressRendition** | `String`| Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdPut"></a>
# **objectsDocumentsDocIdPut**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdPut(docId_authorizationcontentTypeacceptxVaultAPIMigrationModexVaultAPIClientID)
```

Update Single Document

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdRenditionsGet"></a>
# **objectsDocumentsDocIdRenditionsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdRenditionsGet(docId_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Renditions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdRenditionsRenditionTypeDelete"></a>
# **objectsDocumentsDocIdRenditionsRenditionTypeDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdRenditionsRenditionTypeDelete(docIdrenditionType_authorizationacceptxVaultAPIClientID)
```

Delete Single Document Rendition

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdRenditionsRenditionTypeGet"></a>
# **objectsDocumentsDocIdRenditionsRenditionTypeGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdRenditionsRenditionTypeGet(docIdrenditionTypesteadyState_authorizationacceptxVaultAPIClientID)
```

Download Document Rendition File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **steadyState** | `String`| Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdRenditionsRenditionTypePost"></a>
# **objectsDocumentsDocIdRenditionsRenditionTypePost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdRenditionsRenditionTypePost(docIdrenditionType_authorizationacceptcontentTypexVaultAPIClientID)
```

Add Single Document Rendition

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdRenditionsRenditionTypePut"></a>
# **objectsDocumentsDocIdRenditionsRenditionTypePut**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdRenditionsRenditionTypePut(docIdrenditionType_authorizationacceptcontentTypexVaultAPIClientID)
```

Replace Document Rendition

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete"></a>
# **objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docIdroleNameAndUserOrGroupid_authorizationacceptxVaultAPIClientID)
```

Remove Users &amp; Groups from Roles on a Single Document

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The id value of the document from which to remove roles. | |
| **roleNameAndUserOrGroup** | `String`| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | |
| **id** | `String`| The id value of the user or group to remove from the role. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet"></a>
# **objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docIdmajorVersionminorVersionaccept_authorizationxVaultAPIClientID)
```

Retrieve Document Version Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsGet"></a>
# **objectsDocumentsDocIdVersionsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsGet(docId_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docIdmajorVersionminorVersionannotationId_authorizationacceptxVaultAPIClientID)
```

Read Annotations by ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **annotationId** | `String`| The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docIdmajorVersionminorVersionannotationId_authorizationacceptxVaultAPIClientID)
```

Read Replies of Parent Annotation

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **annotationId** | `String`| The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Export Document Version Annotations to PDF

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docIdmajorVersionminorVersion_authorizationacceptcontentTypexVaultAPIClientID)
```

Import Document Version Annotations from PDF

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docIdmajorVersionminorVersionlimitoffsetannotationTypespaginationId_authorizationacceptxVaultAPIClientID)
```

Read Annotations by Document Version and Type

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **limit** | `String`| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [optional parameter] |
| **offset** | `String`| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201. | [optional parameter] |
| **annotationTypes** | `String`| The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;  | [optional parameter] |
| **paginationId** | `String`| A unique identifier used to load requests with paginated results. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docIdmajorVersionminorVersionattachmentIdattachmentVersionaccept_authorizationxVaultAPIClientID)
```

Download Document Version Attachment Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **attachmentId** | `String`| The id field value of the attachment. | |
| **attachmentVersion** | `String`| The version of the attachment. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docIdmajorVersionminorVersionattachmentIdattachmentVersionaccept_authorizationxVaultAPIClientID)
```

Retrieve Document Version Attachment Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **attachmentId** | `String`| The id of the document attachment to retrieve. | |
| **attachmentVersion** | `String`| Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Delete Single Document Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Version Notes as CSV

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docIdmajorVersionminorVersion_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Document Event

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Video Annotations

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The video document id field value. | |
| **majorVersion** | `String`| The video document major_version_number__v field value. | |
| **minorVersion** | `String`| The video document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`| This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;. | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docIdmajorVersionminorVersionaccept_authorizationxVaultAPIClientID)
```

Download Document Version File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docIdmajorVersionminorVersion_authorizationcontentTypeacceptxVaultAPIMigrationModexVaultAPIClientID)
```

Update Document Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Relationships

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docIdmajorVersionminorVersion_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Single Document Relationship

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docIdmajorVersionminorVersionrelationshipId_authorizationacceptxVaultAPIClientID)
```

Delete Single Document Relationship

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **relationshipId** | `String`| The relationship id field value. See Retrieve Document Relationships. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docIdmajorVersionminorVersionrelationshipId_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Relationship

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **relationshipId** | `String`| The relationship id field value. See Retrieve Document Relationships. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docIdmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Version Renditions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docIdmajorVersionminorVersionrenditionType_authorizationacceptxVaultAPIClientID)
```

Delete Document Version Rendition

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docIdmajorVersionminorVersionrenditionType_authorizationacceptxVaultAPIClientID)
```

Download Document Version Rendition File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docIdmajorVersionminorVersionrenditionType_authorizationacceptcontentTypexVaultAPIClientID)
```

Upload Document Version Rendition

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docIdmajorVersionminorVersionrenditionType_authorizationacceptcontentTypexVaultAPIClientID)
```

Replace Document Version Rendition

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **renditionType** | `String`| The document rendition type. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet"></a>
# **objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**
```java
Mono<Void> DefaultApi.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docIdmajorVersionminorVersionaccept_authorizationxVaultAPIClientID)
```

Download Document Version Thumbnail File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **docId** | `String`| The document id field value. | |
| **majorVersion** | `String`| The document major_version_number__v field value. | |
| **minorVersion** | `String`| The document minor_version_number__v field value. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsGet"></a>
# **objectsDocumentsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsGet(namedFilterscopeversionscopesearchlimitsortstart_authorizationacceptxVaultAPIClientID)
```

Retrieve All Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **namedFilter** | `String`| Retrieves only documents which you have created. | [optional parameter] |
| **scope** | `String`| Searches only within the document content. | [optional parameter] |
| **versionscope** | `String`| Retrieves all document versions, rather than only the latest version. | [optional parameter] |
| **search** | `String`| Search for documents based on a {keyword} in searchable document fields. | [optional parameter] |
| **limit** | `String`| See VQL documentation for more information. | [optional parameter] |
| **sort** | `String`| See VQL documentation for more information. | [optional parameter] |
| **start** | `String`| See VQL documentation for more information. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsIdRolesGet"></a>
# **objectsDocumentsIdRolesGet**
```java
Mono<Void> DefaultApi.objectsDocumentsIdRolesGet(id_authorizationacceptxVaultAPIClientID)
```

Retrieve All Document Roles

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsIdRolesPost"></a>
# **objectsDocumentsIdRolesPost**
```java
Mono<Void> DefaultApi.objectsDocumentsIdRolesPost(id_authorizationacceptcontentTypexVaultAPIClientID)
```

Assign Users &amp; Groups to Roles on a Single Document

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsIdRolesRoleNameGet"></a>
# **objectsDocumentsIdRolesRoleNameGet**
```java
Mono<Void> DefaultApi.objectsDocumentsIdRolesRoleNameGet(idroleName_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Role

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The document &#x60;id&#x60;. | |
| **roleName** | `String`| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet"></a>
# **objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(idmajorVersionminorVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Document User Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The document id field value from which to retrieve available user actions. | |
| **majorVersion** | `String`| The major version number of the document. | |
| **minorVersion** | `String`| The minor version number of the document. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet"></a>
# **objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**
```java
Mono<Void> DefaultApi.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(idmajorVersionminorVersionnameV_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Entry Criteria

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The document id field value from which to retrieve available user actions. | |
| **majorVersion** | `String`| The major version number of the document. | |
| **minorVersion** | `String`| The minor version number of the document. | |
| **nameV** | `String`| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut"></a>
# **objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**
```java
Mono<Void> DefaultApi.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(idmajorVersionminorVersionnameV_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Document User Action

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The document id field value from which to retrieve available user actions. | |
| **majorVersion** | `String`| The major version number of the document. | |
| **minorVersion** | `String`| The minor version number of the document. | |
| **nameV** | `String`| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsLifecycleActionsPost"></a>
# **objectsDocumentsLifecycleActionsPost**
```java
Mono<Void> DefaultApi.objectsDocumentsLifecycleActionsPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Retrieve User Actions on Multiple Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsLifecycleActionsUserActionNamePut"></a>
# **objectsDocumentsLifecycleActionsUserActionNamePut**
```java
Mono<Void> DefaultApi.objectsDocumentsLifecycleActionsUserActionNamePut(userActionName_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Bulk Document User Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userActionName** | `String`| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsPost"></a>
# **objectsDocumentsPost**
```java
Mono<Void> DefaultApi.objectsDocumentsPost(_authorizationacceptxVaultAPIMigrationModexVaultAPIClientID)
```

Create Single Document

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsRelationshipsBatchDelete"></a>
# **objectsDocumentsRelationshipsBatchDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsRelationshipsBatchDelete(_authorizationacceptcontentTypexVaultAPIClientID)
```

Delete Multiple Document Relationships

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsRelationshipsBatchPost"></a>
# **objectsDocumentsRelationshipsBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsRelationshipsBatchPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Multiple Document Relationships

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsRenditionsBatchDelete"></a>
# **objectsDocumentsRenditionsBatchDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsRenditionsBatchDelete(_authorizationacceptcontentTypexVaultAPIClientID)
```

Delete Multiple Document Renditions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsRenditionsBatchPost"></a>
# **objectsDocumentsRenditionsBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsRenditionsBatchPost(idParamlargeSizeAsset_authorizationacceptcontentTypexVaultAPIMigrationModexVaultAPIClientID)
```

Add Multiple Document Renditions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | `String`| If you’re identifying documents in your input by their external ID | [optional parameter] |
| **largeSizeAsset** | `String`| If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsRolesBatchDelete"></a>
# **objectsDocumentsRolesBatchDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsRolesBatchDelete(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Remove Users and Groups from Roles on Multiple Documents &amp; Binders

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsRolesBatchPost"></a>
# **objectsDocumentsRolesBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsRolesBatchPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTemplatesGet"></a>
# **objectsDocumentsTemplatesGet**
```java
Mono<Void> DefaultApi.objectsDocumentsTemplatesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Template Collection

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTemplatesPost"></a>
# **objectsDocumentsTemplatesPost**
```java
Mono<Void> DefaultApi.objectsDocumentsTemplatesPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Create Single Document Template

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTemplatesPut"></a>
# **objectsDocumentsTemplatesPut**
```java
Mono<Void> DefaultApi.objectsDocumentsTemplatesPut(_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Multiple Document Templates

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTemplatesTemplateNameDelete"></a>
# **objectsDocumentsTemplatesTemplateNameDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsTemplatesTemplateNameDelete(templateName_authorizationacceptxVaultAPIClientID)
```

Delete Basic Document Template

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The document template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTemplatesTemplateNameFileGet"></a>
# **objectsDocumentsTemplatesTemplateNameFileGet**
```java
Mono<Void> DefaultApi.objectsDocumentsTemplatesTemplateNameFileGet(templateName_authorizationacceptxVaultAPIClientID)
```

Download Document Template File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The document template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTemplatesTemplateNameGet"></a>
# **objectsDocumentsTemplatesTemplateNameGet**
```java
Mono<Void> DefaultApi.objectsDocumentsTemplatesTemplateNameGet(templateName_authorizationacceptxVaultAPIClientID)
```

Retrieve Document Template Attributes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The document template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTemplatesTemplateNamePut"></a>
# **objectsDocumentsTemplatesTemplateNamePut**
```java
Mono<Void> DefaultApi.objectsDocumentsTemplatesTemplateNamePut(templateName_authorizationacceptxVaultAPIClientID)
```

Update Single Document Template

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateName** | `String`| The document template name__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsTokensPost"></a>
# **objectsDocumentsTokensPost**
```java
Mono<Void> DefaultApi.objectsDocumentsTokensPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Document Tokens

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsVersionsBatchActionsFileextractPost"></a>
# **objectsDocumentsVersionsBatchActionsFileextractPost**
```java
Mono<Void> DefaultApi.objectsDocumentsVersionsBatchActionsFileextractPost(sourcerenditions_authorizationcontentTypeacceptxVaultAPIClientID)
```

Export Document Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **source** | `Boolean`| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional parameter] |
| **renditions** | `Boolean`| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsVersionsBatchDelete"></a>
# **objectsDocumentsVersionsBatchDelete**
```java
Mono<Void> DefaultApi.objectsDocumentsVersionsBatchDelete(idParam_authorizationcontentTypeacceptxVaultAPIClientID)
```

Delete Multiple Document Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | `String`| If you’re identifying documents in your input by their external ID | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDocumentsVersionsBatchPost"></a>
# **objectsDocumentsVersionsBatchPost**
```java
Mono<Void> DefaultApi.objectsDocumentsVersionsBatchPost(idParam_authorizationacceptcontentTypexVaultAPIMigrationModexVaultAPIClientID)
```

Create Multiple Document Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idParam** | `String`| If you’re identifying documents in your input by their external ID | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIMigrationMode** | `String`| Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDomainGet"></a>
# **objectsDomainGet**
```java
Mono<Void> DefaultApi.objectsDomainGet(includeApplication_authorizationacceptcontentTypexVaultAPIClientID)
```

Retrieve Domain Information

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeApplication** | `Boolean`| To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsDomainsGet"></a>
# **objectsDomainsGet**
```java
Mono<Void> DefaultApi.objectsDomainsGet(_authorizationacceptcontentTypexVaultAPIClientID)
```

Retrieve Domains

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsEdlMatchedDocumentsBatchActionsAddPost"></a>
# **objectsEdlMatchedDocumentsBatchActionsAddPost**
```java
Mono<Void> DefaultApi.objectsEdlMatchedDocumentsBatchActionsAddPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Add EDL Matched Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsEdlMatchedDocumentsBatchActionsRemovePost"></a>
# **objectsEdlMatchedDocumentsBatchActionsRemovePost**
```java
Mono<Void> DefaultApi.objectsEdlMatchedDocumentsBatchActionsRemovePost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Remove EDL Matched Documents

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsGroupsAutoGet"></a>
# **objectsGroupsAutoGet**
```java
Mono<Void> DefaultApi.objectsGroupsAutoGet(limitoffset_authorizationacceptxVaultAPIClientID)
```

Retrieve Auto Managed Groups

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `String`| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  | [optional parameter] |
| **offset** | `String`| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsGroupsGet"></a>
# **objectsGroupsGet**
```java
Mono<Void> DefaultApi.objectsGroupsGet(includeImplied_authorizationacceptxVaultAPIClientID)
```

Retrieve All Groups

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeImplied** | `String`| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsGroupsGroupIdDelete"></a>
# **objectsGroupsGroupIdDelete**
```java
Mono<Void> DefaultApi.objectsGroupsGroupIdDelete(groupId_authorizationacceptxVaultAPIClientID)
```

Delete Group

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | `String`| The group id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsGroupsGroupIdGet"></a>
# **objectsGroupsGroupIdGet**
```java
Mono<Void> DefaultApi.objectsGroupsGroupIdGet(groupIdincludeImplied_authorizationacceptxVaultAPIClientID)
```

Retrieve Group

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | `String`| The group id field value. | |
| **includeImplied** | `Boolean`| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsGroupsGroupIdPut"></a>
# **objectsGroupsGroupIdPut**
```java
Mono<Void> DefaultApi.objectsGroupsGroupIdPut(groupId_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Group

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | `String`| The group id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsGroupsPost"></a>
# **objectsGroupsPost**
```java
Mono<Void> DefaultApi.objectsGroupsPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Group 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsLicensesGet"></a>
# **objectsLicensesGet**
```java
Mono<Void> DefaultApi.objectsLicensesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Application License Usage

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsActionsGet"></a>
# **objectsObjectworkflowsActionsGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsActionsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Multi-Record Workflows

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsActionsWorkflowNameGet"></a>
# **objectsObjectworkflowsActionsWorkflowNameGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsActionsWorkflowNameGet(workflowName_authorizationxVaultAPIClientID)
```

Retrieve Multi-Record Workflow Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsActionsWorkflowNamePost"></a>
# **objectsObjectworkflowsActionsWorkflowNamePost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsActionsWorkflowNamePost(workflowName_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Multi-Record Workflow

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowName** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsGet"></a>
# **objectsObjectworkflowsGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsGet(objectVrecordIdVparticipantstatusVoffsetpageSizeloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflows

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectV** | `String`| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional parameter] |
| **recordIdV** | `String`| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional parameter] |
| **participant** | `String`| To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional parameter] |
| **statusV** | `String`| To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v | [optional parameter] |
| **offset** | `String`| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional parameter] |
| **pageSize** | `String`| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional parameter] |
| **loc** | `String`| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksGet"></a>
# **objectsObjectworkflowsTasksGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksGet(objectVrecordIdVassigneeVstatusVoffsetpageSizeloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflow Tasks

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectV** | `String`| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional parameter] |
| **recordIdV** | `String`| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional parameter] |
| **assigneeV** | `String`| To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional parameter] |
| **statusV** | `String`| To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.  | [optional parameter] |
| **offset** | `String`| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional parameter] |
| **pageSize** | `String`| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional parameter] |
| **loc** | `String`| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsAcceptPost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsAcceptPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Accept Single Record Workflow Task

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsCancelPost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsCancelPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Cancel Workflow Task

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsCompletePost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsCompletePost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Complete Single Record Workflow Task

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsGet"></a>
# **objectsObjectworkflowsTasksTaskIdActionsGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsGet(taskId_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflow Task Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Accept Multi-item Workflow Task

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Complete Multi-item Workflow Task

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Manage Multi-Item Workflow Content

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Reassign Multi-item Workflow Task

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The id of the task to reassign. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsReassignPost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsReassignPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Reassign Single Record Workflow Task

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The id of the task to reassign. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsTaskActionGet"></a>
# **objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskIdtaskActionloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflow Task Action Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **taskAction** | `String`| The name of the task action retrieved from Retrieve Workflow Task Actions. | |
| **loc** | `String`| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Undo Workflow Task Acceptance

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost"></a>
# **objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Workflow Task Due Date

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The id of the task. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsTasksTaskIdGet"></a>
# **objectsObjectworkflowsTasksTaskIdGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsTasksTaskIdGet(taskIdloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflow Task Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | `String`| The task id field value. | |
| **loc** | `Boolean`| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsWorkflowIdActionsGet"></a>
# **objectsObjectworkflowsWorkflowIdActionsGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsWorkflowIdActionsGet(workflowIdloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflow Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | `String`| The workflow id field value. | |
| **loc** | `String`| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet"></a>
# **objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowIdworkflowAction_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflow Action Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | `String`| The workflow id field value. | |
| **workflowAction** | `String`| The workflow action name retrieved from Retrieve Workflow Actions. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost"></a>
# **objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowIdworkflowActiondocumentsSys_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Workflow Action

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | `String`| The workflow id field value. | |
| **workflowAction** | `String`| The workflow action name retrieved from Retrieve Workflow Actions. | |
| **documentsSys** | `String`| Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsObjectworkflowsWorkflowIdGet"></a>
# **objectsObjectworkflowsWorkflowIdGet**
```java
Mono<Void> DefaultApi.objectsObjectworkflowsWorkflowIdGet(workflowIdloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Workflow Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workflowId** | `String`| The workflow id field value. | |
| **loc** | `Boolean`| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsPicklistsGet"></a>
# **objectsPicklistsGet**
```java
Mono<Void> DefaultApi.objectsPicklistsGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Picklists

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsPicklistsPicklistNameGet"></a>
# **objectsPicklistsPicklistNameGet**
```java
Mono<Void> DefaultApi.objectsPicklistsPicklistNameGet(picklistName_authorizationacceptxVaultAPIClientID)
```

Retrieve Picklist Values

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | `String`| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsPicklistsPicklistNamePicklistValueNameDelete"></a>
# **objectsPicklistsPicklistNamePicklistValueNameDelete**
```java
Mono<Void> DefaultApi.objectsPicklistsPicklistNamePicklistValueNameDelete(picklistNamepicklistValueName_authorizationacceptxVaultAPIClientID)
```

Inactivate Picklist Value

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | `String`| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **picklistValueName** | `String`| The picklist value name field value (north_america__c, south_america__c, etc.) | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsPicklistsPicklistNamePicklistValueNamePut"></a>
# **objectsPicklistsPicklistNamePicklistValueNamePut**
```java
Mono<Void> DefaultApi.objectsPicklistsPicklistNamePicklistValueNamePut(picklistNamepicklistValueName_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Picklist Value

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | `String`| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **picklistValueName** | `String`| The picklist value name field value (north_america__c, south_america__c, etc.) | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsPicklistsPicklistNamePost"></a>
# **objectsPicklistsPicklistNamePost**
```java
Mono<Void> DefaultApi.objectsPicklistsPicklistNamePost(picklistName_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Picklist Values

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | `String`| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsPicklistsPicklistNamePut"></a>
# **objectsPicklistsPicklistNamePut**
```java
Mono<Void> DefaultApi.objectsPicklistsPicklistNamePut(picklistName_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Picklist Value Label

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **picklistName** | `String`| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxActionsBuildproductionPost"></a>
# **objectsSandboxActionsBuildproductionPost**
```java
Mono<Void> DefaultApi.objectsSandboxActionsBuildproductionPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Build Production Vault

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxActionsPromoteproductionPost"></a>
# **objectsSandboxActionsPromoteproductionPost**
```java
Mono<Void> DefaultApi.objectsSandboxActionsPromoteproductionPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Promote to Production

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxActionsRecheckusagePost"></a>
# **objectsSandboxActionsRecheckusagePost**
```java
Mono<Void> DefaultApi.objectsSandboxActionsRecheckusagePost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Recheck Sandbox Usage Limit

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxBatchChangesizePost"></a>
# **objectsSandboxBatchChangesizePost**
```java
Mono<Void> DefaultApi.objectsSandboxBatchChangesizePost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Change Sandbox Size

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxEntitlementsSetPost"></a>
# **objectsSandboxEntitlementsSetPost**
```java
Mono<Void> DefaultApi.objectsSandboxEntitlementsSetPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Set Sandbox Entitlements

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxGet"></a>
# **objectsSandboxGet**
```java
Mono<Void> DefaultApi.objectsSandboxGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Sandboxes

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxNameDelete"></a>
# **objectsSandboxNameDelete**
```java
Mono<Void> DefaultApi.objectsSandboxNameDelete(name_authorizationacceptxVaultAPIClientID)
```

Delete Sandbox

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | `String`| The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxPost"></a>
# **objectsSandboxPost**
```java
Mono<Void> DefaultApi.objectsSandboxPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create or Refresh Sandbox

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxSnapshotApiNameActionsUpdatePost"></a>
# **objectsSandboxSnapshotApiNameActionsUpdatePost**
```java
Mono<Void> DefaultApi.objectsSandboxSnapshotApiNameActionsUpdatePost(apiName_authorizationacceptxVaultAPIClientID)
```

Update Sandbox Snapshot

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiName** | `String`| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxSnapshotApiNameActionsUpgradePost"></a>
# **objectsSandboxSnapshotApiNameActionsUpgradePost**
```java
Mono<Void> DefaultApi.objectsSandboxSnapshotApiNameActionsUpgradePost(apiName_authorizationacceptxVaultAPIClientID)
```

Upgrade Sandbox Snapshot

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiName** | `String`| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxSnapshotApiNameDelete"></a>
# **objectsSandboxSnapshotApiNameDelete**
```java
Mono<Void> DefaultApi.objectsSandboxSnapshotApiNameDelete(apiName_authorizationacceptxVaultAPIClientID)
```

Delete Sandbox Snapshot

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiName** | `String`| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxSnapshotGet"></a>
# **objectsSandboxSnapshotGet**
```java
Mono<Void> DefaultApi.objectsSandboxSnapshotGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve Sandbox Snapshots

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxSnapshotPost"></a>
# **objectsSandboxSnapshotPost**
```java
Mono<Void> DefaultApi.objectsSandboxSnapshotPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Sandbox Snapshot

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxVaultIdActionsRefreshPost"></a>
# **objectsSandboxVaultIdActionsRefreshPost**
```java
Mono<Void> DefaultApi.objectsSandboxVaultIdActionsRefreshPost(vaultId_authorizationacceptcontentTypexVaultAPIClientID)
```

Refresh Sandbox from Snapshot

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vaultId** | `String`| The Vault ID of the sandbox to be refreshed. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSandboxVaultIdGet"></a>
# **objectsSandboxVaultIdGet**
```java
Mono<Void> DefaultApi.objectsSandboxVaultIdGet(vaultId_authorizationacceptxVaultAPIClientID)
```

Retrieve Sandbox Details by ID

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vaultId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSecuritypoliciesGet"></a>
# **objectsSecuritypoliciesGet**
```java
Mono<Void> DefaultApi.objectsSecuritypoliciesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Security Policies

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsSecuritypoliciesSecurityPolicyNameGet"></a>
# **objectsSecuritypoliciesSecurityPolicyNameGet**
```java
Mono<Void> DefaultApi.objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName_authorizationacceptxVaultAPIClientID)
```

Retrieve Security Policy

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **securityPolicyName** | `String`| Security policy name__v field value (retrieved from previous request). This is typically a numeric value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersGet"></a>
# **objectsUsersGet**
```java
Mono<Void> DefaultApi.objectsUsersGet(vaultsexcludeVaultMembershipexcludeAppLicensing_authorizationacceptxVaultAPIClientID)
```

Retrieve All Users

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vaults** | `String`| Retrieve all users assigned to all Vaults in your domain. | [optional parameter] |
| **excludeVaultMembership** | `String`| Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [optional parameter] |
| **excludeAppLicensing** | `String`| Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersIdGet"></a>
# **objectsUsersIdGet**
```java
Mono<Void> DefaultApi.objectsUsersIdGet(idexcludeVaultMembershipexcludeAppLicensing_authorizationacceptxVaultAPIClientID)
```

Retrieve User

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The user id field value. Use the value me to get information for the currently authenticated user. | |
| **excludeVaultMembership** | `String`| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional parameter] |
| **excludeAppLicensing** | `String`| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersIdPermissionsGet"></a>
# **objectsUsersIdPermissionsGet**
```java
Mono<Void> DefaultApi.objectsUsersIdPermissionsGet(idfilter_authorizationacceptxVaultAPIClientID)
```

Retrieve User Permissions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of the user. Use the value me to retrieve information for the currently authenticated user. | |
| **filter** | `String`| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersIdPut"></a>
# **objectsUsersIdPut**
```java
Mono<Void> DefaultApi.objectsUsersIdPut(id_authorizationcontentTypexVaultAPIClientID)
```

Update Single User

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The user id field value. Use the value me to get information for the currently authenticated user. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersMeGet"></a>
# **objectsUsersMeGet**
```java
Mono<Void> DefaultApi.objectsUsersMeGet(excludeVaultMembershipexcludeAppLicensing_authorizationacceptxVaultAPIClientID)
```

Validate Session User

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **excludeVaultMembership** | `String`| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional parameter] |
| **excludeAppLicensing** | `String`| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersMePasswordPost"></a>
# **objectsUsersMePasswordPost**
```java
Mono<Void> DefaultApi.objectsUsersMePasswordPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Change My Password

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersMePermissionsGet"></a>
# **objectsUsersMePermissionsGet**
```java
Mono<Void> DefaultApi.objectsUsersMePermissionsGet(filter_authorizationacceptxVaultAPIClientID)
```

Retrieve My User Permissions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | `String`| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersMePut"></a>
# **objectsUsersMePut**
```java
Mono<Void> DefaultApi.objectsUsersMePut(_authorizationcontentTypexVaultAPIClientID)
```

Update My User

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersPost"></a>
# **objectsUsersPost**
```java
Mono<Void> DefaultApi.objectsUsersPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Single User

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersPut"></a>
# **objectsUsersPut**
```java
Mono<Void> DefaultApi.objectsUsersPut(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Update Multiple Users

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersUserIdDelete"></a>
# **objectsUsersUserIdDelete**
```java
Mono<Void> DefaultApi.objectsUsersUserIdDelete(userIddomain_authorizationacceptxVaultAPIClientID)
```

Disable User

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | `String`| The user id field value.  | |
| **domain** | `Boolean`| When true, this disables the user account in all vaults in the domain. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsUsersUserIdVaultMembershipVaultIdPut"></a>
# **objectsUsersUserIdVaultMembershipVaultIdPut**
```java
Mono<Void> DefaultApi.objectsUsersUserIdVaultMembershipVaultIdPut(userIdvaultId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Update Vault Membership

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | `String`| The user id field value. | |
| **vaultId** | `String`| The system-managed id field value assigned to each vault in the domain. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsVaultActionsComparePost"></a>
# **objectsVaultActionsComparePost**
```java
Mono<Void> DefaultApi.objectsVaultActionsComparePost(_authorizationcontentTypexVaultAPIClientID)
```

Vault Compare

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="objectsVaultActionsConfigreportPost"></a>
# **objectsVaultActionsConfigreportPost**
```java
Mono<Void> DefaultApi.objectsVaultActionsConfigreportPost(_authorizationcontentTypexVaultAPIClientID)
```

Vault Configuration Report

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="queryComponentsPost"></a>
# **queryComponentsPost**
```java
Mono<Void> DefaultApi.queryComponentsPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Component Definition Query

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="queryNextPagePost"></a>
# **queryNextPagePost**
```java
Mono<Void> DefaultApi.queryNextPagePost(nextPage_authorizationacceptxVaultAPIDescribeQuerycontentTypexVaultAPIClientID)
```

Next Page URL

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nextPage** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIDescribeQuery** | `Boolean`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="queryPost"></a>
# **queryPost**
```java
Mono<Void> DefaultApi.queryPost(_authorizationacceptxVaultAPIDescribeQuerycontentTypexVaultAPIClientID)
```

Submitting a Query

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIDescribeQuery** | `Boolean`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="queryPreviousPagePost"></a>
# **queryPreviousPagePost**
```java
Mono<Void> DefaultApi.queryPreviousPagePost(previousPage_authorizationacceptxVaultAPIDescribeQuerycontentTypexVaultAPIClientID)
```

Previous Page URL

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **previousPage** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIDescribeQuery** | `Boolean`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2MeGet"></a>
# **scimV2MeGet**
```java
Mono<Void> DefaultApi.scimV2MeGet(attributesexcludedAttributes_authorizationacceptxVaultAPIClientID)
```

Retrieve Current User with SCIM

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attributes** | `String`| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional parameter] |
| **excludedAttributes** | `String`| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2MePut"></a>
# **scimV2MePut**
```java
Mono<Void> DefaultApi.scimV2MePut(attributesexcludedAttributes_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Current User with SCIM

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attributes** | `String`| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional parameter] |
| **excludedAttributes** | `String`| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2ResourceTypesGet"></a>
# **scimV2ResourceTypesGet**
```java
Mono<Void> DefaultApi.scimV2ResourceTypesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All SCIM Resource Types

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2ResourceTypesTypeGet"></a>
# **scimV2ResourceTypesTypeGet**
```java
Mono<Void> DefaultApi.scimV2ResourceTypesTypeGet(type_authorizationacceptxVaultAPIClientID)
```

Retrieve Single SCIM Resource Type

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2SchemasGet"></a>
# **scimV2SchemasGet**
```java
Mono<Void> DefaultApi.scimV2SchemasGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All SCIM Schema Information

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2SchemasIdGet"></a>
# **scimV2SchemasIdGet**
```java
Mono<Void> DefaultApi.scimV2SchemasIdGet(id_authorizationacceptxVaultAPIClientID)
```

Retrieve Single SCIM Schema Information

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2ServiceProviderConfigGet"></a>
# **scimV2ServiceProviderConfigGet**
```java
Mono<Void> DefaultApi.scimV2ServiceProviderConfigGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve SCIM Provider

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2TypeGet"></a>
# **scimV2TypeGet**
```java
Mono<Void> DefaultApi.scimV2TypeGet(typefilterattributesexcludedAttributessortBysortOrderstartIndex_authorizationacceptxVaultAPIClientID)
```

Retrieve SCIM Resources

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | |
| **filter** | `String`| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional parameter] |
| **attributes** | `String`| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional parameter] |
| **excludedAttributes** | `String`| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional parameter] |
| **sortBy** | `String`| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional parameter] |
| **sortOrder** | `String`| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional parameter] |
| **startIndex** | `String`| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2TypeIdGet"></a>
# **scimV2TypeIdGet**
```java
Mono<Void> DefaultApi.scimV2TypeIdGet(typeidattributesexcludedAttributes_authorizationacceptxVaultAPIClientID)
```

Retrieve Single SCIM Resource

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | `String`| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | |
| **id** | `String`| The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. | |
| **attributes** | `String`| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional parameter] |
| **excludedAttributes** | `String`| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2UsersGet"></a>
# **scimV2UsersGet**
```java
Mono<Void> DefaultApi.scimV2UsersGet(filterattributesexcludedAttributessortBysortOrdercountstartIndex_authorizationacceptxVaultAPIClientID)
```

Retrieve All Users with SCIM

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | `String`| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional parameter] |
| **attributes** | `String`| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional parameter] |
| **excludedAttributes** | `String`| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional parameter] |
| **sortBy** | `String`| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional parameter] |
| **sortOrder** | `String`| Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [optional parameter] |
| **count** | `String`| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional parameter] |
| **startIndex** | `String`| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2UsersIdGet"></a>
# **scimV2UsersIdGet**
```java
Mono<Void> DefaultApi.scimV2UsersIdGet(idfilterattributesexcludedAttributes_authorizationacceptxVaultAPIClientID)
```

Retrieve Single User with SCIM

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The id of the user you wish to update. | |
| **filter** | `String`| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional parameter] |
| **attributes** | `String`| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional parameter] |
| **excludedAttributes** | `String`| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2UsersIdPut"></a>
# **scimV2UsersIdPut**
```java
Mono<Void> DefaultApi.scimV2UsersIdPut(id_authorizationacceptcontentTypexVaultAPIClientID)
```

Update User with SCIM

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| The id of the user you wish to update. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="scimV2UsersPost"></a>
# **scimV2UsersPost**
```java
Mono<Void> DefaultApi.scimV2UsersPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Create User with SCIM

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesCertificateCertIdGet"></a>
# **servicesCertificateCertIdGet**
```java
Mono<Void> DefaultApi.servicesCertificateCertIdGet(certId_authorizationacceptxVaultAPIClientID)
```

Retrieve Signing Certificate

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **certId** | `String`| The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesConfigurationModeActionsDisablePost"></a>
# **servicesConfigurationModeActionsDisablePost**
```java
Mono<Void> DefaultApi.servicesConfigurationModeActionsDisablePost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Disable Configuration Mode

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesConfigurationModeActionsEnablePost"></a>
# **servicesConfigurationModeActionsEnablePost**
```java
Mono<Void> DefaultApi.servicesConfigurationModeActionsEnablePost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Enable Configuration Mode

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesDirectdataFilesGet"></a>
# **servicesDirectdataFilesGet**
```java
Mono<Void> DefaultApi.servicesDirectdataFilesGet(extractTypestartTimestopTimeaccept_authorizationxVaultAPIClientID)
```

Retrieve Available Direct Data Files

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **extractType** | `String`| The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [optional parameter] |
| **startTime** | `Integer`| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [optional parameter] |
| **stopTime** | `Integer`| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesDirectdataFilesNameGet"></a>
# **servicesDirectdataFilesNameGet**
```java
Mono<Void> DefaultApi.servicesDirectdataFilesNameGet(nameaccept_authorizationxVaultAPIClientID)
```

Download Direct Data File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | `String`| The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingItemsContentItemGet"></a>
# **servicesFileStagingItemsContentItemGet**
```java
Mono<Void> DefaultApi.servicesFileStagingItemsContentItemGet(item_authorizationacceptrangexVaultAPIClientID)
```

Download Item Content

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | `String`| The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **range** | `String`| Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;. | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingItemsItemDelete"></a>
# **servicesFileStagingItemsItemDelete**
```java
Mono<Void> DefaultApi.servicesFileStagingItemsItemDelete(itemrecursive_authorizationacceptxVaultAPIClientID)
```

Delete File or Folder

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | `String`| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **recursive** | `String`| Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingItemsItemGet"></a>
# **servicesFileStagingItemsItemGet**
```java
Mono<Void> DefaultApi.servicesFileStagingItemsItemGet(itemrecursivelimitformatResult_authorizationacceptxVaultAPIClientID)
```

List Items at a Path

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | `String`| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **recursive** | `String`| If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [optional parameter] |
| **limit** | `String`| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional parameter] |
| **formatResult** | `String`| If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingItemsItemPut"></a>
# **servicesFileStagingItemsItemPut**
```java
Mono<Void> DefaultApi.servicesFileStagingItemsItemPut(item_authorizationacceptxVaultAPIClientID)
```

Update Folder or File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | `String`| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingItemsPost"></a>
# **servicesFileStagingItemsPost**
```java
Mono<Void> DefaultApi.servicesFileStagingItemsPost(_authorizationacceptcontentMD5xVaultAPIClientID)
```

Create Folder or File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentMD5** | `String`| Optional: The MD5 checksum of the file being uploaded. | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingUploadGet"></a>
# **servicesFileStagingUploadGet**
```java
Mono<Void> DefaultApi.servicesFileStagingUploadGet(_authorizationacceptxVaultAPIClientID)
```

List Upload Sessions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingUploadPost"></a>
# **servicesFileStagingUploadPost**
```java
Mono<Void> DefaultApi.servicesFileStagingUploadPost(_authorizationacceptxVaultAPIClientID)
```

Create Resumable Upload Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingUploadUploadSessionIdDelete"></a>
# **servicesFileStagingUploadUploadSessionIdDelete**
```java
Mono<Void> DefaultApi.servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId_authorizationacceptxVaultAPIClientID)
```

Abort Upload Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingUploadUploadSessionIdGet"></a>
# **servicesFileStagingUploadUploadSessionIdGet**
```java
Mono<Void> DefaultApi.servicesFileStagingUploadUploadSessionIdGet(uploadSessionId_authorizationacceptxVaultAPIClientID)
```

Get Upload Session Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingUploadUploadSessionIdPartsGet"></a>
# **servicesFileStagingUploadUploadSessionIdPartsGet**
```java
Mono<Void> DefaultApi.servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionIdlimit_authorizationacceptxVaultAPIClientID)
```

List File Parts Uploaded to Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | `String`|  | |
| **limit** | `String`| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingUploadUploadSessionIdPost"></a>
# **servicesFileStagingUploadUploadSessionIdPost**
```java
Mono<Void> DefaultApi.servicesFileStagingUploadUploadSessionIdPost(uploadSessionId_authorizationacceptxVaultAPIClientID)
```

Commit Upload Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesFileStagingUploadUploadSessionIdPut"></a>
# **servicesFileStagingUploadUploadSessionIdPut**
```java
Mono<Void> DefaultApi.servicesFileStagingUploadUploadSessionIdPut(uploadSessionId_authorizationacceptcontentTypexVaultAPIFilePartNumbercontentMD5xVaultAPIClientID)
```

Upload to a Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadSessionId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIFilePartNumber** | `String`| The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [optional parameter] |
| **contentMD5** | `String`| Optional: The MD5 checksum of the file part being uploaded. | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesJobsHistoriesGet"></a>
# **servicesJobsHistoriesGet**
```java
Mono<Void> DefaultApi.servicesJobsHistoriesGet(startDateendDatestatuslimitoffset_authorizationacceptxVaultAPIClientID)
```

Retrieve Job Histories

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `String`| Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional parameter] |
| **endDate** | `String`| Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional parameter] |
| **status** | `String`| Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [optional parameter] |
| **limit** | `String`| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional parameter] |
| **offset** | `String`| Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesJobsJobIdErrorsGet"></a>
# **servicesJobsJobIdErrorsGet**
```java
Mono<Void> DefaultApi.servicesJobsJobIdErrorsGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Import Bulk Translation File Job Errors

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesJobsJobIdGet"></a>
# **servicesJobsJobIdGet**
```java
Mono<Void> DefaultApi.servicesJobsJobIdGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Job Status

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The ID of the job, returned from the original job request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesJobsJobIdSummaryGet"></a>
# **servicesJobsJobIdSummaryGet**
```java
Mono<Void> DefaultApi.servicesJobsJobIdSummaryGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Import Bulk Translation File Job Summary

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesJobsJobIdTasksGet"></a>
# **servicesJobsJobIdTasksGet**
```java
Mono<Void> DefaultApi.servicesJobsJobIdTasksGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve SDK Job Tasks

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The ID of the SDK job, returned from the original job request. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesJobsMonitorsGet"></a>
# **servicesJobsMonitorsGet**
```java
Mono<Void> DefaultApi.servicesJobsMonitorsGet(startDateendDatestatuslimitoffset_authorizationacceptxVaultAPIClientID)
```

Retrieve Job Monitors

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `String`| Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional parameter] |
| **endDate** | `String`| Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional parameter] |
| **status** | `String`| Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [optional parameter] |
| **limit** | `String`| Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional parameter] |
| **offset** | `String`| Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesJobsStartNowJobIdPost"></a>
# **servicesJobsStartNowJobIdPost**
```java
Mono<Void> DefaultApi.servicesJobsStartNowJobIdPost(jobId_authorizationacceptxVaultAPIClientID)
```

Start Job

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The ID of the scheduled job instance to start. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesLoaderExtractPost"></a>
# **servicesLoaderExtractPost**
```java
Mono<Void> DefaultApi.servicesLoaderExtractPost(_authorizationacceptcontentTypexVaultAPIClientID)
```

Extract Data Files

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesLoaderJobIdTasksTaskIdFailurelogGet"></a>
# **servicesLoaderJobIdTasksTaskIdFailurelogGet**
```java
Mono<Void> DefaultApi.servicesLoaderJobIdTasksTaskIdFailurelogGet(jobIdtaskId_authorizationacceptxVaultAPIClientID)
```

Retrieve Load Failure Log Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested extract job. | |
| **taskId** | `String`| The id value of the requested extract task. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesLoaderJobIdTasksTaskIdResultsGet"></a>
# **servicesLoaderJobIdTasksTaskIdResultsGet**
```java
Mono<Void> DefaultApi.servicesLoaderJobIdTasksTaskIdResultsGet(jobIdtaskId_authorizationacceptxVaultAPIClientID)
```

Retrieve Loader Extract Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested extract job. | |
| **taskId** | `String`| The id value of the requested extract task. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesLoaderJobIdTasksTaskIdResultsRenditionsGet"></a>
# **servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**
```java
Mono<Void> DefaultApi.servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobIdtaskId_authorizationacceptxVaultAPIClientID)
```

Retrieve Loader Extract Renditions Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested extract job. | |
| **taskId** | `String`| The id value of the requested extract task. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesLoaderJobIdTasksTaskIdSuccesslogGet"></a>
# **servicesLoaderJobIdTasksTaskIdSuccesslogGet**
```java
Mono<Void> DefaultApi.servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobIdtaskId_authorizationacceptxVaultAPIClientID)
```

Retrieve Load Success Log Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The id value of the requested extract job. | |
| **taskId** | `String`| The id value of the requested extract task. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesLoaderLoadPost"></a>
# **servicesLoaderLoadPost**
```java
Mono<Void> DefaultApi.servicesLoaderLoadPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Load Data Objects

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesPackageActionsValidatePost"></a>
# **servicesPackageActionsValidatePost**
```java
Mono<Void> DefaultApi.servicesPackageActionsValidatePost(_authorizationcontentTypexVaultAPIClientID)
```

Validate Package

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesPackagePost"></a>
# **servicesPackagePost**
```java
Mono<Void> DefaultApi.servicesPackagePost(_authorizationcontentTypexVaultAPIClientID)
```

Export Package

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesPackagePut"></a>
# **servicesPackagePut**
```java
Mono<Void> DefaultApi.servicesPackagePut(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Import Package

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesQueuesGet"></a>
# **servicesQueuesGet**
```java
Mono<Void> DefaultApi.servicesQueuesGet(_authorizationacceptxVaultAPIClientID)
```

Retrieve All Queues

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesQueuesQueueNameActionsDisableDeliveryPut"></a>
# **servicesQueuesQueueNameActionsDisableDeliveryPut**
```java
Mono<Void> DefaultApi.servicesQueuesQueueNameActionsDisableDeliveryPut(queueName_authorizationacceptxVaultAPIClientID)
```

Disable Delivery

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | `String`| The name of a specific Queue. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesQueuesQueueNameActionsEnableDeliveryPut"></a>
# **servicesQueuesQueueNameActionsEnableDeliveryPut**
```java
Mono<Void> DefaultApi.servicesQueuesQueueNameActionsEnableDeliveryPut(queueName_authorizationacceptxVaultAPIClientID)
```

Enable Delivery

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | `String`| The name of a specific Queue. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesQueuesQueueNameActionsResetPut"></a>
# **servicesQueuesQueueNameActionsResetPut**
```java
Mono<Void> DefaultApi.servicesQueuesQueueNameActionsResetPut(queueName_authorizationacceptxVaultAPIClientID)
```

Reset Queue

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | `String`| The name of a specific Queue. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesQueuesQueueNameGet"></a>
# **servicesQueuesQueueNameGet**
```java
Mono<Void> DefaultApi.servicesQueuesQueueNameGet(queueName_authorizationacceptxVaultAPIClientID)
```

Retrieve Queue Status

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | `String`| The name of a specific queue. For example, queue__c. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="servicesVobjectVaultPackageVPackageIdActionsValidatePost"></a>
# **servicesVobjectVaultPackageVPackageIdActionsValidatePost**
```java
Mono<Void> DefaultApi.servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId_authorizationacceptxVaultAPIClientID)
```

Validate Imported Package

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | `String`| The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="sessionDelete"></a>
# **sessionDelete**
```java
Mono<Void> DefaultApi.sessionDelete(accept_authorizationxVaultAPIClientID)
```

End Session

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`| The Vault sessionId to end. | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="uicodeDistributionsDistributionNameCodeGet"></a>
# **uicodeDistributionsDistributionNameCodeGet**
```java
Mono<Void> DefaultApi.uicodeDistributionsDistributionNameCodeGet(distributionNameaccept_authorizationxVaultAPIClientID)
```

Download Single Client Code Distribution

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionName** | `String`| The name attribute of the client code distribution to download. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="uicodeDistributionsDistributionNameDelete"></a>
# **uicodeDistributionsDistributionNameDelete**
```java
Mono<Void> DefaultApi.uicodeDistributionsDistributionNameDelete(distributionNameaccept_authorizationxVaultAPIClientID)
```

Delete Single Client Code Distribution

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionName** | `String`| The name attribute of the client code distribution to delete. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="uicodeDistributionsDistributionNameGet"></a>
# **uicodeDistributionsDistributionNameGet**
```java
Mono<Void> DefaultApi.uicodeDistributionsDistributionNameGet(distributionNameaccept_authorizationxVaultAPIClientID)
```

Retrieve Single Client Code Distribution Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionName** | `String`| The name attribute of the client code distribution to delete. | |
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="uicodeDistributionsGet"></a>
# **uicodeDistributionsGet**
```java
Mono<Void> DefaultApi.uicodeDistributionsGet(accept_authorizationxVaultAPIClientID)
```

Retrieve All Client Code Distribution Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="uicodeDistributionsPost"></a>
# **uicodeDistributionsPost**
```java
Mono<Void> DefaultApi.uicodeDistributionsPost(accept_authorizationcontentTypexVaultAPIClientID)
```

Add or Replace Single Client Code Distribution

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectVaultPackageVPackageIdActionsDeployPost"></a>
# **vobjectVaultPackageVPackageIdActionsDeployPost**
```java
Mono<Void> DefaultApi.vobjectVaultPackageVPackageIdActionsDeployPost(packageId_authorizationcontentTypeacceptxVaultAPIClientID)
```

Deploy Package

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | `String`| The id field value of the vault_package__v object record used for deployment. See Import Package. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectVaultPackageVPackageIdActionsDeployResultsGet"></a>
# **vobjectVaultPackageVPackageIdActionsDeployResultsGet**
```java
Mono<Void> DefaultApi.vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId_authorizationacceptxVaultAPIClientID)
```

Retrieve Package Deploy Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | `String`| The id field value of the vault_package__v object record used for deployment. See Deploy Package. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet"></a>
# **vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**
```java
Mono<Void> DefaultApi.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectNamejobStatusjobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Results of Cascade Delete Job

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **jobStatus** | `String`|  | |
| **jobId** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet"></a>
# **vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**
```java
Mono<Void> DefaultApi.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectNamejobStatusjobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Results of Deep Copy Job

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **jobStatus** | `String`| The ID of the job, retrieved from the response of the job request. | |
| **jobId** | `String`| Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsEdlItemVActionsCreateplaceholderPost"></a>
# **vobjectsEdlItemVActionsCreateplaceholderPost**
```java
Mono<Void> DefaultApi.vobjectsEdlItemVActionsCreateplaceholderPost(_authorizationcontentTypeacceptxVaultAPIClientID)
```

Create a Placeholder from an EDL Item

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsMergesJobIdLogGet"></a>
# **vobjectsMergesJobIdLogGet**
```java
Mono<Void> DefaultApi.vobjectsMergesJobIdLogGet(jobId_authorizationacceptxVaultAPIClientID)
```

Download Merge Records Job Log

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsMergesJobIdResultsGet"></a>
# **vobjectsMergesJobIdResultsGet**
```java
Mono<Void> DefaultApi.vobjectsMergesJobIdResultsGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Record Merge Results

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsMergesJobIdStatusGet"></a>
# **vobjectsMergesJobIdStatusGet**
```java
Mono<Void> DefaultApi.vobjectsMergesJobIdStatusGet(jobId_authorizationacceptxVaultAPIClientID)
```

Retrieve Record Merge Status

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | `String`| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameActionsActionNamePost"></a>
# **vobjectsObjectNameActionsActionNamePost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameActionsActionNamePost(objectNameactionName_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Object Action on Multiple Records

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. | |
| **actionName** | `String`| Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameActionsChangetypePost"></a>
# **vobjectsObjectNameActionsChangetypePost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameActionsChangetypePost(objectName_authorizationcontentTypeacceptxVaultAPIClientID)
```

Change Object Type

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The name of the object. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameActionsMergePost"></a>
# **vobjectsObjectNameActionsMergePost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameActionsMergePost(objectName_authorizationcontentTypeacceptxVaultAPIClientIDvobjectsObjectNameActionsMergePostRequestInner)
```

Initiate Record Merge

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. For example, account__v. This object must have Enable Merges configured. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |
| **vobjectsObjectNameActionsMergePostRequestInner** | [**List&lt;@Valid VobjectsObjectNameActionsMergePostRequestInner&gt;**](VobjectsObjectNameActionsMergePostRequestInner.md)|  | [optional parameter] |






### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: Not defined

<a id="vobjectsObjectNameActionsRecalculaterollupsGet"></a>
# **vobjectsObjectNameActionsRecalculaterollupsGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameActionsRecalculaterollupsGet(objectName_authorizationacceptxVaultAPIClientID)
```

Retrieve Roll-up Field Recalculation Status

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The name of the object for which to check the status of a Roll-up field recalculation. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameActionsRecalculaterollupsPost"></a>
# **vobjectsObjectNameActionsRecalculaterollupsPost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameActionsRecalculaterollupsPost(objectName_authorizationacceptxVaultAPIClientID)
```

Recalculate Roll-up Fields

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The name of the object for which to check the status of a Roll-up field recalculation. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameActionsUpdatecorporatecurrencyPut"></a>
# **vobjectsObjectNameActionsUpdatecorporatecurrencyPut**
```java
Mono<Void> DefaultApi.vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Corporate Currency Fields

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameAttachmentsBatchDelete"></a>
# **vobjectsObjectNameAttachmentsBatchDelete**
```java
Mono<Void> DefaultApi.vobjectsObjectNameAttachmentsBatchDelete(objectNameidParam_authorizationacceptcontentTypexVaultAPIClientID)
```

Delete Multiple Object Record Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **idParam** | `String`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameAttachmentsBatchPost"></a>
# **vobjectsObjectNameAttachmentsBatchPost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameAttachmentsBatchPost(objectName_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Multiple Object Record Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameAttachmentsBatchPut"></a>
# **vobjectsObjectNameAttachmentsBatchPut**
```java
Mono<Void> DefaultApi.vobjectsObjectNameAttachmentsBatchPut(objectName_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Multiple Object Record Attachment Descriptions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameDelete"></a>
# **vobjectsObjectNameDelete**
```java
Mono<Void> DefaultApi.vobjectsObjectNameDelete(objectName_authorizationcontentTypeacceptxVaultAPIClientID)
```

Delete Object Records

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`| Can be text/csv or application/json | [optional parameter] |
| **accept** | `String`| Can be text/csv or application/json | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameIdRolesRoleNameGet"></a>
# **vobjectsObjectNameIdRolesRoleNameGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameIdRolesRoleNameGet(objectNameidroleName_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Record Roles

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name. | |
| **id** | `String`| The id of the document, binder, or object record. | |
| **roleName** | `String`| Optional: Include a role name to filter for a specific role. For example, owner__v. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdActionsActionNameGet"></a>
# **vobjectsObjectNameObjectRecordIdActionsActionNameGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectNameobjectRecordIdactionName_authorizationacceptxVaultAPIClientID)
```

Retrieve Object User Actions Details

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. | |
| **objectRecordId** | `String`| The object record id field value from which to retrieve user actions. | |
| **actionName** | `String`| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdActionsActionNamePost"></a>
# **vobjectsObjectNameObjectRecordIdActionsActionNamePost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectNameobjectRecordIdactionName_authorizationcontentTypeacceptxVaultAPIClientID)
```

Initiate Object Action on a Single Record

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. | |
| **objectRecordId** | `String`| The object record id field value from which to retrieve user actions. | |
| **actionName** | `String`| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdActionsCascadedeletePost"></a>
# **vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectNameobjectRecordId_authorizationacceptxVaultAPIClientID)
```

Cascade Delete Object Record

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdActionsDeepcopyPost"></a>
# **vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectNameobjectRecordId_authorizationacceptcontentTypexVaultAPIClientID)
```

Deep Copy Object Record

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdActionsGet"></a>
# **vobjectsObjectNameObjectRecordIdActionsGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdActionsGet(objectNameobjectRecordIdloc_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Record User Actions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. | |
| **objectRecordId** | `String`| The object record id field value. | |
| **loc** | `Boolean`| Optional: When true, retrieves localized (translated) strings for the label.  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectNameobjectRecordIdattachmentFieldName_authorizationacceptxVaultAPIClientID)
```

Download Attachment Field File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. For example, product__v. | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentFieldName** | `String`| The name of the Attachment field to update. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectNameobjectRecordIdattachmentFieldName_authorizationacceptxVaultAPIClientID)
```

Update Attachment Field File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. For example, product__v. | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentFieldName** | `String`| The name of the Attachment field to update. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectNameobjectRecordId_authorizationacceptxVaultAPIClientID)
```

Download All Attachment Field Files

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. For example, product__v. | |
| **objectRecordId** | `String`| The object record id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectNameobjectRecordIdattachmentId_authorizationacceptcontentTypexVaultAPIClientID)
```

Delete Object Record Attachment

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectNameobjectRecordIdattachmentId_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Record Attachment Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectNameobjectRecordIdattachmentId_authorizationacceptcontentTypexVaultAPIClientID)
```

Update Object Record Attachment Description

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectNameobjectRecordIdattachmentIdattachmentVersion_authorizationacceptxVaultAPIClientID)
```

Delete Object Record Attachment Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`| The attachment version__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectNameobjectRecordIdattachmentIdattachmentVersion_authorizationacceptxVaultAPIClientID)
```

Download Object Record Attachment File

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`|  | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectNameobjectRecordIdattachmentIdattachmentVersion_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Record Attachment Version Metadata

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`| The attachment version__v field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectNameobjectRecordIdattachmentIdattachmentVersionrestore_authorizationacceptcontentTypexVaultAPIClientID)
```

Restore Object Record Attachment Version

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **attachmentVersion** | `String`| The attachment version__v field value. | |
| **restore** | `Boolean`|  | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectNameobjectRecordIdattachmentId_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Record Attachment Versions

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **attachmentId** | `String`| The attachment id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsFileGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsFileGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectNameobjectRecordId_authorizationacceptxVaultAPIClientID)
```

Download All Object Record Attachment Files

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsGet"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsGet(objectNameobjectRecordId_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Record Attachments

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAttachmentsPost"></a>
# **vobjectsObjectNameObjectRecordIdAttachmentsPost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAttachmentsPost(objectNameobjectRecordId_authorizationacceptcontentTypexVaultAPIClientID)
```

Create Object Record Attachment

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdAudittrailGet"></a>
# **vobjectsObjectNameObjectRecordIdAudittrailGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdAudittrailGet(objectNameobjectRecordIdstartDateendDateformatResultlimitoffsetevents_authorizationacceptxVaultAPIClientID)
```

Retrieve Complete Audit History for a Single Object Record

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value. | |
| **objectRecordId** | `String`| The object record id field value from which to retrieve user actions. | |
| **startDate** | `String`| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  | [optional parameter] |
| **endDate** | `String`| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional parameter] |
| **formatResult** | `String`| To request a CSV file of your audit history, use csv.  | [optional parameter] |
| **limit** | `String`| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional parameter] |
| **offset** | `String`| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional parameter] |
| **events** | `String`| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameObjectRecordIdGet"></a>
# **vobjectsObjectNameObjectRecordIdGet**
```java
Mono<Void> DefaultApi.vobjectsObjectNameObjectRecordIdGet(objectNameobjectRecordId_authorizationacceptxVaultAPIClientID)
```

Retrieve Object Record

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **objectRecordId** | `String`| The object record id field value. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNamePost"></a>
# **vobjectsObjectNamePost**
```java
Mono<Void> DefaultApi.vobjectsObjectNamePost(objectNameidParam_authorizationcontentTypeacceptxVaultAPIMigrationModexVaultAPINoTriggersxVaultAPIClientID)
```

Create &amp; Upsert Object Records

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **idParam** | `String`| To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;. | [optional parameter] |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`| Can be text/csv or application/json | [optional parameter] |
| **accept** | `String`| Can be text/csv or application/json | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional parameter] |
| **xVaultAPINoTriggers** | `Boolean`| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNamePut"></a>
# **vobjectsObjectNamePut**
```java
Mono<Void> DefaultApi.vobjectsObjectNamePut(objectName_authorizationcontentTypeacceptxVaultAPIMigrationModexVaultAPINoTriggersxVaultAPIClientID)
```

Update Object Records

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The object name__v field value (product__v, country__v, custom_object__c, etc.). | |
| **_authorization** | `String`|  | [optional parameter] |
| **contentType** | `String`| Can be text/csv or application/json | [optional parameter] |
| **accept** | `String`| Can be text/csv or application/json | [optional parameter] |
| **xVaultAPIMigrationMode** | `Boolean`| If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional parameter] |
| **xVaultAPINoTriggers** | `Boolean`| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameRolesDelete"></a>
# **vobjectsObjectNameRolesDelete**
```java
Mono<Void> DefaultApi.vobjectsObjectNameRolesDelete(objectName_authorizationacceptcontentTypexVaultAPIClientID)
```

Remove Users &amp; Groups from Roles on Object Records

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The name of the object where you want to remove roles. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsObjectNameRolesPost"></a>
# **vobjectsObjectNameRolesPost**
```java
Mono<Void> DefaultApi.vobjectsObjectNameRolesPost(objectName_authorizationacceptcontentTypexVaultAPIClientID)
```

Assign Users &amp; Groups to Roles on Object Records

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **objectName** | `String`| The name of the object where you want to remove roles. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **contentType** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="vobjectsOutboundPackageVPackageIdDependenciesGet"></a>
# **vobjectsOutboundPackageVPackageIdDependenciesGet**
```java
Mono<Void> DefaultApi.vobjectsOutboundPackageVPackageIdDependenciesGet(packageId_authorizationacceptxVaultAPIClientID)
```

Retrieve Outbound Package Dependencies

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | `String`| The ID of the outbound_package__v record from which to retrieve dependencies. | |
| **_authorization** | `String`|  | [optional parameter] |
| **accept** | `String`|  | [optional parameter] |
| **xVaultAPIClientID** | `String`| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional parameter] |






### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: Not defined

