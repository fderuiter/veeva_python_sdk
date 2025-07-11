# DefaultApi

All URIs are relative to */api/v25.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiGet**](DefaultApi.md#apiGet) | **GET** /api/ | Retrieve API Versions
[**apiMdlComponentsComponentTypeAndRecordNameFilesGet**](DefaultApi.md#apiMdlComponentsComponentTypeAndRecordNameFilesGet) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File
[**apiMdlComponentsComponentTypeAndRecordNameGet**](DefaultApi.md#apiMdlComponentsComponentTypeAndRecordNameGet) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL)
[**apiMdlExecuteAsyncJobIdResultsGet**](DefaultApi.md#apiMdlExecuteAsyncJobIdResultsGet) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results
[**apiMdlExecuteAsyncPost**](DefaultApi.md#apiMdlExecuteAsyncPost) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously
[**apiMdlExecutePost**](DefaultApi.md#apiMdlExecutePost) | **POST** /api/mdl/execute | Execute MDL Script
[**apiMdlFilesPost**](DefaultApi.md#apiMdlFilesPost) | **POST** /api/mdl/files | Upload Content File
[**audittrailAuditTrailTypeGet**](DefaultApi.md#audittrailAuditTrailTypeGet) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details
[**authDiscoveryPost**](DefaultApi.md#authDiscoveryPost) | **POST** /auth/discovery | Authentication Type Discovery
[**authOauthSessionOathOidcProfileIdPost**](DefaultApi.md#authOauthSessionOathOidcProfileIdPost) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect
[**authPost**](DefaultApi.md#authPost) | **POST** /auth | User Name and Password
[**codeClassNameDelete**](DefaultApi.md#codeClassNameDelete) | **DELETE** /code/{class_name} | Delete Single Source Code File
[**codeClassNameDisablePut**](DefaultApi.md#codeClassNameDisablePut) | **PUT** /code/{class_name}/disable | Disable Vault Extension
[**codeClassNameEnablePut**](DefaultApi.md#codeClassNameEnablePut) | **PUT** /code/{class_name}/enable | Enable Vault Extension
[**codeClassNameGet**](DefaultApi.md#codeClassNameGet) | **GET** /code/{class_name} | Retrieve Single Source Code File
[**codeProfilerGet**](DefaultApi.md#codeProfilerGet) | **GET** /code/profiler | Retrieve All Profiling Sessions
[**codeProfilerPost**](DefaultApi.md#codeProfilerPost) | **POST** /code/profiler | Create Profiling Session
[**codeProfilerSessionNameActionsEndPost**](DefaultApi.md#codeProfilerSessionNameActionsEndPost) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session
[**codeProfilerSessionNameDelete**](DefaultApi.md#codeProfilerSessionNameDelete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session
[**codeProfilerSessionNameGet**](DefaultApi.md#codeProfilerSessionNameGet) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session
[**codeProfilerSessionNameResultsGet**](DefaultApi.md#codeProfilerSessionNameResultsGet) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results
[**codePut**](DefaultApi.md#codePut) | **PUT** /code | Add or Replace Single Source Code File
[**compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**](DefaultApi.md#compositesTreesEdlHierarchyOrTemplateActionsListnodesPost) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes
[**compositesTreesEdlHierarchyOrTemplateGet**](DefaultApi.md#compositesTreesEdlHierarchyOrTemplateGet) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes
[**compositesTreesEdlHierarchyVParentNodeIdChildrenGet**](DefaultApi.md#compositesTreesEdlHierarchyVParentNodeIdChildrenGet) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node&#39;s Children
[**compositesTreesEdlHierarchyVParentNodeIdChildrenPut**](DefaultApi.md#compositesTreesEdlHierarchyVParentNodeIdChildrenPut) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
[**configurationComponentTypeAndRecordNameGet**](DefaultApi.md#configurationComponentTypeAndRecordNameGet) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
[**configurationComponentTypeGet**](DefaultApi.md#configurationComponentTypeGet) | **GET** /configuration/{component_type} | Retrieve Component Record Collection
[**configurationObjectNameAndObjectTypeGet**](DefaultApi.md#configurationObjectNameAndObjectTypeGet) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
[**configurationObjecttypeGet**](DefaultApi.md#configurationObjecttypeGet) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types
[**configurationRoleAssignmentRuleDelete**](DefaultApi.md#configurationRoleAssignmentRuleDelete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
[**configurationRoleAssignmentRuleGet**](DefaultApi.md#configurationRoleAssignmentRuleGet) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
[**configurationRoleAssignmentRulePost**](DefaultApi.md#configurationRoleAssignmentRulePost) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
[**configurationRoleAssignmentRulePut**](DefaultApi.md#configurationRoleAssignmentRulePut) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override)
[**delegationLoginPost**](DefaultApi.md#delegationLoginPost) | **POST** /delegation/login | Initiate Delegated Session
[**delegationVaultsGet**](DefaultApi.md#delegationVaultsGet) | **GET** /delegation/vaults | Retrieve Delegations
[**keepAlivePost**](DefaultApi.md#keepAlivePost) | **POST** /keep-alive | Session Keep Alive
[**limitsGet**](DefaultApi.md#limitsGet) | **GET** /limits | Retrieve Limits on Objects
[**logsApiUsageGet**](DefaultApi.md#logsApiUsageGet) | **GET** /logs/api_usage | Download Daily API Usage
[**logsCodeDebugGet**](DefaultApi.md#logsCodeDebugGet) | **GET** /logs/code/debug | Retrieve All Debug Logs
[**logsCodeDebugIdActionsResetDelete**](DefaultApi.md#logsCodeDebugIdActionsResetDelete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log
[**logsCodeDebugIdActionsResetPost**](DefaultApi.md#logsCodeDebugIdActionsResetPost) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log
[**logsCodeDebugIdFilesGet**](DefaultApi.md#logsCodeDebugIdFilesGet) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files
[**logsCodeDebugIdGet**](DefaultApi.md#logsCodeDebugIdGet) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log
[**logsCodeDebugPost**](DefaultApi.md#logsCodeDebugPost) | **POST** /logs/code/debug | Create Debug Log
[**logsCodeRuntimeGet**](DefaultApi.md#logsCodeRuntimeGet) | **GET** /logs/code/runtime | Download SDK Runtime Log
[**messagesMessageTypeActionsImportPost**](DefaultApi.md#messagesMessageTypeActionsImportPost) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File
[**messagesMessageTypeLanguageLangActionsExportPost**](DefaultApi.md#messagesMessageTypeLanguageLangActionsExportPost) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File
[**metadataAudittrailAuditTrailTypeGet**](DefaultApi.md#metadataAudittrailAuditTrailTypeGet) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata
[**metadataAudittrailGet**](DefaultApi.md#metadataAudittrailGet) | **GET** /metadata/audittrail | Retrieve Audit Types
[**metadataComponentsComponentTypeGet**](DefaultApi.md#metadataComponentsComponentTypeGet) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata
[**metadataComponentsGet**](DefaultApi.md#metadataComponentsGet) | **GET** /metadata/components | Retrieve All Component Metadata
[**metadataObjectsBindersTemplatesBindernodesGet**](DefaultApi.md#metadataObjectsBindersTemplatesBindernodesGet) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata
[**metadataObjectsBindersTemplatesGet**](DefaultApi.md#metadataObjectsBindersTemplatesGet) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata
[**metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**](DefaultApi.md#metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata
[**metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**](DefaultApi.md#metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata
[**metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**](DefaultApi.md#metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata
[**metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**](DefaultApi.md#metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata
[**metadataObjectsDocumentsEventsGet**](DefaultApi.md#metadataObjectsDocumentsEventsGet) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes
[**metadataObjectsDocumentsLockGet**](DefaultApi.md#metadataObjectsDocumentsLockGet) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata
[**metadataObjectsDocumentsPropertiesFindCommonPost**](DefaultApi.md#metadataObjectsDocumentsPropertiesFindCommonPost) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields
[**metadataObjectsDocumentsPropertiesGet**](DefaultApi.md#metadataObjectsDocumentsPropertiesGet) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields
[**metadataObjectsDocumentsTemplatesGet**](DefaultApi.md#metadataObjectsDocumentsTemplatesGet) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata
[**metadataObjectsDocumentsTypesGet**](DefaultApi.md#metadataObjectsDocumentsTypesGet) | **GET** /metadata/objects/documents/types | Retrieve All Document Types
[**metadataObjectsDocumentsTypesTypeGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeGet) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type
[**metadataObjectsDocumentsTypesTypeRelationshipsGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeRelationshipsGet) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships
[**metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification
[**metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**](DefaultApi.md#metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype
[**metadataObjectsGroupsGet**](DefaultApi.md#metadataObjectsGroupsGet) | **GET** /metadata/objects/groups | Retrieve Group Metadata
[**metadataObjectsSecuritypoliciesGet**](DefaultApi.md#metadataObjectsSecuritypoliciesGet) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata
[**metadataObjectsUsersGet**](DefaultApi.md#metadataObjectsUsersGet) | **GET** /metadata/objects/users | Retrieve User Metadata
[**metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultApi.md#metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata
[**metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultApi.md#metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata
[**metadataVobjectsGet**](DefaultApi.md#metadataVobjectsGet) | **GET** /metadata/vobjects | Retrieve Object Collection
[**metadataVobjectsObjectNameActionsCanceldeploymentPost**](DefaultApi.md#metadataVobjectsObjectNameActionsCanceldeploymentPost) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment
[**metadataVobjectsObjectNameFieldsObjectFieldNameGet**](DefaultApi.md#metadataVobjectsObjectNameFieldsObjectFieldNameGet) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata
[**metadataVobjectsObjectNameGet**](DefaultApi.md#metadataVobjectsObjectNameGet) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata
[**metadataVobjectsObjectNamePageLayoutsGet**](DefaultApi.md#metadataVobjectsObjectNamePageLayoutsGet) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts
[**metadataVobjectsObjectNamePageLayoutsLayoutNameGet**](DefaultApi.md#metadataVobjectsObjectNamePageLayoutsLayoutNameGet) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata
[**notificationsHistoriesGet**](DefaultApi.md#notificationsHistoriesGet) | **GET** /notifications/histories | Retrieve Email Notification Histories
[**objectWorkflowActionsActionGet**](DefaultApi.md#objectWorkflowActionsActionGet) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details
[**objectWorkflowActionsActionPost**](DefaultApi.md#objectWorkflowActionsActionPost) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows
[**objectWorkflowActionsCanceltasksPost**](DefaultApi.md#objectWorkflowActionsCanceltasksPost) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks
[**objectWorkflowActionsCancelworkflowsPost**](DefaultApi.md#objectWorkflowActionsCancelworkflowsPost) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows
[**objectWorkflowActionsGet**](DefaultApi.md#objectWorkflowActionsGet) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions
[**objectWorkflowActionsReassigntasksPost**](DefaultApi.md#objectWorkflowActionsReassigntasksPost) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks
[**objectWorkflowActionsReplaceworkflowownerPost**](DefaultApi.md#objectWorkflowActionsReplaceworkflowownerPost) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner
[**objectsBindersActionsExportJobIdResultsGet**](DefaultApi.md#objectsBindersActionsExportJobIdResultsGet) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results
[**objectsBindersBinderIdActionsExportPost**](DefaultApi.md#objectsBindersBinderIdActionsExportPost) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version)
[**objectsBindersBinderIdActionsPost**](DefaultApi.md#objectsBindersBinderIdActionsPost) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing
[**objectsBindersBinderIdBindingRulePut**](DefaultApi.md#objectsBindersBinderIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule
[**objectsBindersBinderIdDelete**](DefaultApi.md#objectsBindersBinderIdDelete) | **DELETE** /objects/binders/{binder_id} | Delete Binder
[**objectsBindersBinderIdDocumentsNodeIdBindingRulePut**](DefaultApi.md#objectsBindersBinderIdDocumentsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule
[**objectsBindersBinderIdDocumentsPost**](DefaultApi.md#objectsBindersBinderIdDocumentsPost) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder
[**objectsBindersBinderIdDocumentsSectionIdDelete**](DefaultApi.md#objectsBindersBinderIdDocumentsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder
[**objectsBindersBinderIdDocumentsSectionIdPut**](DefaultApi.md#objectsBindersBinderIdDocumentsSectionIdPut) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder
[**objectsBindersBinderIdGet**](DefaultApi.md#objectsBindersBinderIdGet) | **GET** /objects/binders/{binder_id} | Retrieve Binder
[**objectsBindersBinderIdPost**](DefaultApi.md#objectsBindersBinderIdPost) | **POST** /objects/binders/{binder_id} | Create Binder Version
[**objectsBindersBinderIdPut**](DefaultApi.md#objectsBindersBinderIdPut) | **PUT** /objects/binders/{binder_id} | Update Binder
[**objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultApi.md#objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder
[**objectsBindersBinderIdSectionsNodeIdBindingRulePut**](DefaultApi.md#objectsBindersBinderIdSectionsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule
[**objectsBindersBinderIdSectionsNodeIdPut**](DefaultApi.md#objectsBindersBinderIdSectionsNodeIdPut) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section
[**objectsBindersBinderIdSectionsPost**](DefaultApi.md#objectsBindersBinderIdSectionsPost) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section
[**objectsBindersBinderIdSectionsSectionIdDelete**](DefaultApi.md#objectsBindersBinderIdSectionsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section
[**objectsBindersBinderIdSectionsSectionIdGet**](DefaultApi.md#objectsBindersBinderIdSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections
[**objectsBindersBinderIdVersionsGet**](DefaultApi.md#objectsBindersBinderIdVersionsGet) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version)
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship
[**objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**](DefaultApi.md#objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section
[**objectsBindersIdRolesGet**](DefaultApi.md#objectsBindersIdRolesGet) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles
[**objectsBindersIdRolesPost**](DefaultApi.md#objectsBindersIdRolesPost) | **POST** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder
[**objectsBindersIdRolesRoleNameGet**](DefaultApi.md#objectsBindersIdRolesRoleNameGet) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role
[**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions
[**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria
[**objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultApi.md#objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action
[**objectsBindersLifecycleActionsPost**](DefaultApi.md#objectsBindersLifecycleActionsPost) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders
[**objectsBindersLifecycleActionsUserActionNamePut**](DefaultApi.md#objectsBindersLifecycleActionsUserActionNamePut) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions
[**objectsBindersPost**](DefaultApi.md#objectsBindersPost) | **POST** /objects/binders | Create Binder
[**objectsBindersTemplatesGet**](DefaultApi.md#objectsBindersTemplatesGet) | **GET** /objects/binders/templates | Retrieve Binder Template Collection
[**objectsBindersTemplatesPost**](DefaultApi.md#objectsBindersTemplatesPost) | **POST** /objects/binders/templates | Create Binder Template
[**objectsBindersTemplatesPut**](DefaultApi.md#objectsBindersTemplatesPut) | **PUT** /objects/binders/templates | Update Binder Template
[**objectsBindersTemplatesTemplateNameBindernodesGet**](DefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesGet) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes
[**objectsBindersTemplatesTemplateNameBindernodesPost**](DefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesPost) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node
[**objectsBindersTemplatesTemplateNameBindernodesPut**](DefaultApi.md#objectsBindersTemplatesTemplateNameBindernodesPut) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes
[**objectsBindersTemplatesTemplateNameDelete**](DefaultApi.md#objectsBindersTemplatesTemplateNameDelete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template
[**objectsBindersTemplatesTemplateNameGet**](DefaultApi.md#objectsBindersTemplatesTemplateNameGet) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes
[**objectsDeletionsDocumentsGet**](DefaultApi.md#objectsDeletionsDocumentsGet) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs
[**objectsDeletionsVobjectsObjectNameGet**](DefaultApi.md#objectsDeletionsVobjectsObjectNameGet) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID
[**objectsDocumentsActionsGet**](DefaultApi.md#objectsDocumentsActionsGet) | **GET** /objects/documents/actions | Retrieve All Document Workflows
[**objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**](DefaultApi.md#objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results
[**objectsDocumentsActionsWorkflowNameGet**](DefaultApi.md#objectsDocumentsActionsWorkflowNameGet) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details
[**objectsDocumentsActionsWorkflowNamePost**](DefaultApi.md#objectsDocumentsActionsWorkflowNamePost) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow
[**objectsDocumentsAnnotationsBatchDelete**](DefaultApi.md#objectsDocumentsAnnotationsBatchDelete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations
[**objectsDocumentsAnnotationsBatchPost**](DefaultApi.md#objectsDocumentsAnnotationsBatchPost) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations
[**objectsDocumentsAnnotationsBatchPut**](DefaultApi.md#objectsDocumentsAnnotationsBatchPut) | **PUT** /objects/documents/annotations/batch | Update Annotations
[**objectsDocumentsAnnotationsRepliesBatchPost**](DefaultApi.md#objectsDocumentsAnnotationsRepliesBatchPost) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies
[**objectsDocumentsAttachmentsBatchDelete**](DefaultApi.md#objectsDocumentsAttachmentsBatchDelete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments
[**objectsDocumentsAttachmentsBatchPost**](DefaultApi.md#objectsDocumentsAttachmentsBatchPost) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments
[**objectsDocumentsAttachmentsBatchPut**](DefaultApi.md#objectsDocumentsAttachmentsBatchPut) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions
[**objectsDocumentsBatchActionsFileextractJobIdResultsGet**](DefaultApi.md#objectsDocumentsBatchActionsFileextractJobIdResultsGet) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results
[**objectsDocumentsBatchActionsFileextractPost**](DefaultApi.md#objectsDocumentsBatchActionsFileextractPost) | **POST** /objects/documents/batch/actions/fileextract | Export Documents
[**objectsDocumentsBatchActionsReclassifyPut**](DefaultApi.md#objectsDocumentsBatchActionsReclassifyPut) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents
[**objectsDocumentsBatchActionsRerenderPost**](DefaultApi.md#objectsDocumentsBatchActionsRerenderPost) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions
[**objectsDocumentsBatchDelete**](DefaultApi.md#objectsDocumentsBatchDelete) | **DELETE** /objects/documents/batch | Delete Multiple Documents
[**objectsDocumentsBatchLockDelete**](DefaultApi.md#objectsDocumentsBatchLockDelete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout
[**objectsDocumentsBatchPost**](DefaultApi.md#objectsDocumentsBatchPost) | **POST** /objects/documents/batch | Create Multiple Documents
[**objectsDocumentsBatchPut**](DefaultApi.md#objectsDocumentsBatchPut) | **PUT** /objects/documents/batch | Update Multiple Documents
[**objectsDocumentsDocIdAnchorsGet**](DefaultApi.md#objectsDocumentsDocIdAnchorsGet) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs
[**objectsDocumentsDocIdAnnotationsFileGet**](DefaultApi.md#objectsDocumentsDocIdAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF
[**objectsDocumentsDocIdAnnotationsFilePost**](DefaultApi.md#objectsDocumentsDocIdAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF
[**objectsDocumentsDocIdAttachmentsAttachmentIdDelete**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment
[**objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment
[**objectsDocumentsDocIdAttachmentsAttachmentIdGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata
[**objectsDocumentsDocIdAttachmentsAttachmentIdPut**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdPut) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description
[**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version
[**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version
[**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata
[**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version
[**objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions
[**objectsDocumentsDocIdAttachmentsFileGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments
[**objectsDocumentsDocIdAttachmentsGet**](DefaultApi.md#objectsDocumentsDocIdAttachmentsGet) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments
[**objectsDocumentsDocIdAttachmentsPost**](DefaultApi.md#objectsDocumentsDocIdAttachmentsPost) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment
[**objectsDocumentsDocIdAudittrailGet**](DefaultApi.md#objectsDocumentsDocIdAudittrailGet) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document
[**objectsDocumentsDocIdDelete**](DefaultApi.md#objectsDocumentsDocIdDelete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document
[**objectsDocumentsDocIdEventsGet**](DefaultApi.md#objectsDocumentsDocIdEventsGet) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events
[**objectsDocumentsDocIdFileGet**](DefaultApi.md#objectsDocumentsDocIdFileGet) | **GET** /objects/documents/{doc_id}/file | Download Document File
[**objectsDocumentsDocIdGet**](DefaultApi.md#objectsDocumentsDocIdGet) | **GET** /objects/documents/{doc_id} | Retrieve Document
[**objectsDocumentsDocIdLockDelete**](DefaultApi.md#objectsDocumentsDocIdLockDelete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock
[**objectsDocumentsDocIdLockGet**](DefaultApi.md#objectsDocumentsDocIdLockGet) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock
[**objectsDocumentsDocIdLockPost**](DefaultApi.md#objectsDocumentsDocIdLockPost) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock
[**objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**](DefaultApi.md#objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments
[**objectsDocumentsDocIdPost**](DefaultApi.md#objectsDocumentsDocIdPost) | **POST** /objects/documents/{doc_id} | Create Single Document Version
[**objectsDocumentsDocIdPut**](DefaultApi.md#objectsDocumentsDocIdPut) | **PUT** /objects/documents/{doc_id} | Update Single Document
[**objectsDocumentsDocIdRenditionsGet**](DefaultApi.md#objectsDocumentsDocIdRenditionsGet) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions
[**objectsDocumentsDocIdRenditionsRenditionTypeDelete**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition
[**objectsDocumentsDocIdRenditionsRenditionTypeGet**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File
[**objectsDocumentsDocIdRenditionsRenditionTypePost**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition
[**objectsDocumentsDocIdRenditionsRenditionTypePut**](DefaultApi.md#objectsDocumentsDocIdRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition
[**objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultApi.md#objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document
[**objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**](DefaultApi.md#objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments
[**objectsDocumentsDocIdVersionsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsGet) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition
[**objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**](DefaultApi.md#objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File
[**objectsDocumentsGet**](DefaultApi.md#objectsDocumentsGet) | **GET** /objects/documents | Retrieve All Documents
[**objectsDocumentsIdRolesGet**](DefaultApi.md#objectsDocumentsIdRolesGet) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles
[**objectsDocumentsIdRolesPost**](DefaultApi.md#objectsDocumentsIdRolesPost) | **POST** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document
[**objectsDocumentsIdRolesRoleNameGet**](DefaultApi.md#objectsDocumentsIdRolesRoleNameGet) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role
[**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions
[**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria
[**objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultApi.md#objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action
[**objectsDocumentsLifecycleActionsPost**](DefaultApi.md#objectsDocumentsLifecycleActionsPost) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents
[**objectsDocumentsLifecycleActionsUserActionNamePut**](DefaultApi.md#objectsDocumentsLifecycleActionsUserActionNamePut) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions
[**objectsDocumentsPost**](DefaultApi.md#objectsDocumentsPost) | **POST** /objects/documents | Create Single Document
[**objectsDocumentsRelationshipsBatchDelete**](DefaultApi.md#objectsDocumentsRelationshipsBatchDelete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships
[**objectsDocumentsRelationshipsBatchPost**](DefaultApi.md#objectsDocumentsRelationshipsBatchPost) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships
[**objectsDocumentsRenditionsBatchDelete**](DefaultApi.md#objectsDocumentsRenditionsBatchDelete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions
[**objectsDocumentsRenditionsBatchPost**](DefaultApi.md#objectsDocumentsRenditionsBatchPost) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions
[**objectsDocumentsRolesBatchDelete**](DefaultApi.md#objectsDocumentsRolesBatchDelete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders
[**objectsDocumentsRolesBatchPost**](DefaultApi.md#objectsDocumentsRolesBatchPost) | **POST** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
[**objectsDocumentsTemplatesGet**](DefaultApi.md#objectsDocumentsTemplatesGet) | **GET** /objects/documents/templates | Retrieve Document Template Collection
[**objectsDocumentsTemplatesPost**](DefaultApi.md#objectsDocumentsTemplatesPost) | **POST** /objects/documents/templates | Create Single Document Template
[**objectsDocumentsTemplatesPut**](DefaultApi.md#objectsDocumentsTemplatesPut) | **PUT** /objects/documents/templates | Update Multiple Document Templates
[**objectsDocumentsTemplatesTemplateNameDelete**](DefaultApi.md#objectsDocumentsTemplatesTemplateNameDelete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template
[**objectsDocumentsTemplatesTemplateNameFileGet**](DefaultApi.md#objectsDocumentsTemplatesTemplateNameFileGet) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File
[**objectsDocumentsTemplatesTemplateNameGet**](DefaultApi.md#objectsDocumentsTemplatesTemplateNameGet) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes
[**objectsDocumentsTemplatesTemplateNamePut**](DefaultApi.md#objectsDocumentsTemplatesTemplateNamePut) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template
[**objectsDocumentsTokensPost**](DefaultApi.md#objectsDocumentsTokensPost) | **POST** /objects/documents/tokens | Document Tokens
[**objectsDocumentsVersionsBatchActionsFileextractPost**](DefaultApi.md#objectsDocumentsVersionsBatchActionsFileextractPost) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions
[**objectsDocumentsVersionsBatchDelete**](DefaultApi.md#objectsDocumentsVersionsBatchDelete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions
[**objectsDocumentsVersionsBatchPost**](DefaultApi.md#objectsDocumentsVersionsBatchPost) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions
[**objectsDomainGet**](DefaultApi.md#objectsDomainGet) | **GET** /objects/domain | Retrieve Domain Information
[**objectsDomainsGet**](DefaultApi.md#objectsDomainsGet) | **GET** /objects/domains | Retrieve Domains
[**objectsEdlMatchedDocumentsBatchActionsAddPost**](DefaultApi.md#objectsEdlMatchedDocumentsBatchActionsAddPost) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents
[**objectsEdlMatchedDocumentsBatchActionsRemovePost**](DefaultApi.md#objectsEdlMatchedDocumentsBatchActionsRemovePost) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents
[**objectsGroupsAutoGet**](DefaultApi.md#objectsGroupsAutoGet) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups
[**objectsGroupsGet**](DefaultApi.md#objectsGroupsGet) | **GET** /objects/groups | Retrieve All Groups
[**objectsGroupsGroupIdDelete**](DefaultApi.md#objectsGroupsGroupIdDelete) | **DELETE** /objects/groups/{group_id} | Delete Group
[**objectsGroupsGroupIdGet**](DefaultApi.md#objectsGroupsGroupIdGet) | **GET** /objects/groups/{group_id} | Retrieve Group
[**objectsGroupsGroupIdPut**](DefaultApi.md#objectsGroupsGroupIdPut) | **PUT** /objects/groups/{group_id} | Update Group
[**objectsGroupsPost**](DefaultApi.md#objectsGroupsPost) | **POST** /objects/groups | Create Group
[**objectsLicensesGet**](DefaultApi.md#objectsLicensesGet) | **GET** /objects/licenses | Retrieve Application License Usage
[**objectsObjectworkflowsActionsGet**](DefaultApi.md#objectsObjectworkflowsActionsGet) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows
[**objectsObjectworkflowsActionsWorkflowNameGet**](DefaultApi.md#objectsObjectworkflowsActionsWorkflowNameGet) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details
[**objectsObjectworkflowsActionsWorkflowNamePost**](DefaultApi.md#objectsObjectworkflowsActionsWorkflowNamePost) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow
[**objectsObjectworkflowsGet**](DefaultApi.md#objectsObjectworkflowsGet) | **GET** /objects/objectworkflows | Retrieve Workflows
[**objectsObjectworkflowsTasksGet**](DefaultApi.md#objectsObjectworkflowsTasksGet) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks
[**objectsObjectworkflowsTasksTaskIdActionsAcceptPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsAcceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task
[**objectsObjectworkflowsTasksTaskIdActionsCancelPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsCancelPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task
[**objectsObjectworkflowsTasksTaskIdActionsCompletePost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsCompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task
[**objectsObjectworkflowsTasksTaskIdActionsGet**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions
[**objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task
[**objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task
[**objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content
[**objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task
[**objectsObjectworkflowsTasksTaskIdActionsReassignPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsReassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task
[**objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsTaskActionGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details
[**objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance
[**objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date
[**objectsObjectworkflowsTasksTaskIdGet**](DefaultApi.md#objectsObjectworkflowsTasksTaskIdGet) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details
[**objectsObjectworkflowsWorkflowIdActionsGet**](DefaultApi.md#objectsObjectworkflowsWorkflowIdActionsGet) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions
[**objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**](DefaultApi.md#objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details
[**objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**](DefaultApi.md#objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action
[**objectsObjectworkflowsWorkflowIdGet**](DefaultApi.md#objectsObjectworkflowsWorkflowIdGet) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details
[**objectsPicklistsGet**](DefaultApi.md#objectsPicklistsGet) | **GET** /objects/picklists | Retrieve All Picklists
[**objectsPicklistsPicklistNameGet**](DefaultApi.md#objectsPicklistsPicklistNameGet) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values
[**objectsPicklistsPicklistNamePicklistValueNameDelete**](DefaultApi.md#objectsPicklistsPicklistNamePicklistValueNameDelete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value
[**objectsPicklistsPicklistNamePicklistValueNamePut**](DefaultApi.md#objectsPicklistsPicklistNamePicklistValueNamePut) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value
[**objectsPicklistsPicklistNamePost**](DefaultApi.md#objectsPicklistsPicklistNamePost) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values
[**objectsPicklistsPicklistNamePut**](DefaultApi.md#objectsPicklistsPicklistNamePut) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label
[**objectsSandboxActionsBuildproductionPost**](DefaultApi.md#objectsSandboxActionsBuildproductionPost) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault
[**objectsSandboxActionsPromoteproductionPost**](DefaultApi.md#objectsSandboxActionsPromoteproductionPost) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production
[**objectsSandboxActionsRecheckusagePost**](DefaultApi.md#objectsSandboxActionsRecheckusagePost) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit
[**objectsSandboxBatchChangesizePost**](DefaultApi.md#objectsSandboxBatchChangesizePost) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size
[**objectsSandboxEntitlementsSetPost**](DefaultApi.md#objectsSandboxEntitlementsSetPost) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements
[**objectsSandboxGet**](DefaultApi.md#objectsSandboxGet) | **GET** /objects/sandbox | Retrieve Sandboxes
[**objectsSandboxNameDelete**](DefaultApi.md#objectsSandboxNameDelete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox
[**objectsSandboxPost**](DefaultApi.md#objectsSandboxPost) | **POST** /objects/sandbox | Create or Refresh Sandbox
[**objectsSandboxSnapshotApiNameActionsUpdatePost**](DefaultApi.md#objectsSandboxSnapshotApiNameActionsUpdatePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot
[**objectsSandboxSnapshotApiNameActionsUpgradePost**](DefaultApi.md#objectsSandboxSnapshotApiNameActionsUpgradePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot
[**objectsSandboxSnapshotApiNameDelete**](DefaultApi.md#objectsSandboxSnapshotApiNameDelete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot
[**objectsSandboxSnapshotGet**](DefaultApi.md#objectsSandboxSnapshotGet) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots
[**objectsSandboxSnapshotPost**](DefaultApi.md#objectsSandboxSnapshotPost) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot
[**objectsSandboxVaultIdActionsRefreshPost**](DefaultApi.md#objectsSandboxVaultIdActionsRefreshPost) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot
[**objectsSandboxVaultIdGet**](DefaultApi.md#objectsSandboxVaultIdGet) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID
[**objectsSecuritypoliciesGet**](DefaultApi.md#objectsSecuritypoliciesGet) | **GET** /objects/securitypolicies | Retrieve All Security Policies
[**objectsSecuritypoliciesSecurityPolicyNameGet**](DefaultApi.md#objectsSecuritypoliciesSecurityPolicyNameGet) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy
[**objectsUsersGet**](DefaultApi.md#objectsUsersGet) | **GET** /objects/users/ | Retrieve All Users
[**objectsUsersIdGet**](DefaultApi.md#objectsUsersIdGet) | **GET** /objects/users/{id} | Retrieve User
[**objectsUsersIdPermissionsGet**](DefaultApi.md#objectsUsersIdPermissionsGet) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions
[**objectsUsersIdPut**](DefaultApi.md#objectsUsersIdPut) | **PUT** /objects/users/{id} | Update Single User
[**objectsUsersMeGet**](DefaultApi.md#objectsUsersMeGet) | **GET** /objects/users/me | Validate Session User
[**objectsUsersMePasswordPost**](DefaultApi.md#objectsUsersMePasswordPost) | **POST** /objects/users/me/password | Change My Password
[**objectsUsersMePermissionsGet**](DefaultApi.md#objectsUsersMePermissionsGet) | **GET** /objects/users/me/permissions | Retrieve My User Permissions
[**objectsUsersMePut**](DefaultApi.md#objectsUsersMePut) | **PUT** /objects/users/me | Update My User
[**objectsUsersPost**](DefaultApi.md#objectsUsersPost) | **POST** /objects/users | Create Single User
[**objectsUsersPut**](DefaultApi.md#objectsUsersPut) | **PUT** /objects/users | Update Multiple Users
[**objectsUsersUserIdDelete**](DefaultApi.md#objectsUsersUserIdDelete) | **DELETE** /objects/users/{user_id} | Disable User
[**objectsUsersUserIdVaultMembershipVaultIdPut**](DefaultApi.md#objectsUsersUserIdVaultMembershipVaultIdPut) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership
[**objectsVaultActionsComparePost**](DefaultApi.md#objectsVaultActionsComparePost) | **POST** /objects/vault/actions/compare | Vault Compare
[**objectsVaultActionsConfigreportPost**](DefaultApi.md#objectsVaultActionsConfigreportPost) | **POST** /objects/vault/actions/configreport | Vault Configuration Report
[**queryComponentsPost**](DefaultApi.md#queryComponentsPost) | **POST** /query/components | Component Definition Query
[**queryNextPagePost**](DefaultApi.md#queryNextPagePost) | **POST** /query/{next_page} | Next Page URL
[**queryPost**](DefaultApi.md#queryPost) | **POST** /query | Submitting a Query
[**queryPreviousPagePost**](DefaultApi.md#queryPreviousPagePost) | **POST** /query/{previous_page} | Previous Page URL
[**scimV2MeGet**](DefaultApi.md#scimV2MeGet) | **GET** /scim/v2/Me | Retrieve Current User with SCIM
[**scimV2MePut**](DefaultApi.md#scimV2MePut) | **PUT** /scim/v2/Me | Update Current User with SCIM
[**scimV2ResourceTypesGet**](DefaultApi.md#scimV2ResourceTypesGet) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types
[**scimV2ResourceTypesTypeGet**](DefaultApi.md#scimV2ResourceTypesTypeGet) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type
[**scimV2SchemasGet**](DefaultApi.md#scimV2SchemasGet) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information
[**scimV2SchemasIdGet**](DefaultApi.md#scimV2SchemasIdGet) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information
[**scimV2ServiceProviderConfigGet**](DefaultApi.md#scimV2ServiceProviderConfigGet) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider
[**scimV2TypeGet**](DefaultApi.md#scimV2TypeGet) | **GET** /scim/v2/{type} | Retrieve SCIM Resources
[**scimV2TypeIdGet**](DefaultApi.md#scimV2TypeIdGet) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource
[**scimV2UsersGet**](DefaultApi.md#scimV2UsersGet) | **GET** /scim/v2/Users | Retrieve All Users with SCIM
[**scimV2UsersIdGet**](DefaultApi.md#scimV2UsersIdGet) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM
[**scimV2UsersIdPut**](DefaultApi.md#scimV2UsersIdPut) | **PUT** /scim/v2/Users/{id} | Update User with SCIM
[**scimV2UsersPost**](DefaultApi.md#scimV2UsersPost) | **POST** /scim/v2/Users | Create User with SCIM
[**servicesCertificateCertIdGet**](DefaultApi.md#servicesCertificateCertIdGet) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate
[**servicesConfigurationModeActionsDisablePost**](DefaultApi.md#servicesConfigurationModeActionsDisablePost) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode
[**servicesConfigurationModeActionsEnablePost**](DefaultApi.md#servicesConfigurationModeActionsEnablePost) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode
[**servicesDirectdataFilesGet**](DefaultApi.md#servicesDirectdataFilesGet) | **GET** /services/directdata/files | Retrieve Available Direct Data Files
[**servicesDirectdataFilesNameGet**](DefaultApi.md#servicesDirectdataFilesNameGet) | **GET** /services/directdata/files/{name} | Download Direct Data File
[**servicesFileStagingItemsContentItemGet**](DefaultApi.md#servicesFileStagingItemsContentItemGet) | **GET** /services/file_staging/items/content/{item} | Download Item Content
[**servicesFileStagingItemsItemDelete**](DefaultApi.md#servicesFileStagingItemsItemDelete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder
[**servicesFileStagingItemsItemGet**](DefaultApi.md#servicesFileStagingItemsItemGet) | **GET** /services/file_staging/items/{item} | List Items at a Path
[**servicesFileStagingItemsItemPut**](DefaultApi.md#servicesFileStagingItemsItemPut) | **PUT** /services/file_staging/items/{item} | Update Folder or File
[**servicesFileStagingItemsPost**](DefaultApi.md#servicesFileStagingItemsPost) | **POST** /services/file_staging/items | Create Folder or File
[**servicesFileStagingUploadGet**](DefaultApi.md#servicesFileStagingUploadGet) | **GET** /services/file_staging/upload/ | List Upload Sessions
[**servicesFileStagingUploadPost**](DefaultApi.md#servicesFileStagingUploadPost) | **POST** /services/file_staging/upload | Create Resumable Upload Session
[**servicesFileStagingUploadUploadSessionIdDelete**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdDelete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session
[**servicesFileStagingUploadUploadSessionIdGet**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdGet) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details
[**servicesFileStagingUploadUploadSessionIdPartsGet**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdPartsGet) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session
[**servicesFileStagingUploadUploadSessionIdPost**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdPost) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session
[**servicesFileStagingUploadUploadSessionIdPut**](DefaultApi.md#servicesFileStagingUploadUploadSessionIdPut) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session
[**servicesJobsHistoriesGet**](DefaultApi.md#servicesJobsHistoriesGet) | **GET** /services/jobs/histories | Retrieve Job Histories
[**servicesJobsJobIdErrorsGet**](DefaultApi.md#servicesJobsJobIdErrorsGet) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors
[**servicesJobsJobIdGet**](DefaultApi.md#servicesJobsJobIdGet) | **GET** /services/jobs/{job_id} | Retrieve Job Status
[**servicesJobsJobIdSummaryGet**](DefaultApi.md#servicesJobsJobIdSummaryGet) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary
[**servicesJobsJobIdTasksGet**](DefaultApi.md#servicesJobsJobIdTasksGet) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks
[**servicesJobsMonitorsGet**](DefaultApi.md#servicesJobsMonitorsGet) | **GET** /services/jobs/monitors | Retrieve Job Monitors
[**servicesJobsStartNowJobIdPost**](DefaultApi.md#servicesJobsStartNowJobIdPost) | **POST** /services/jobs/start_now/{job_id} | Start Job
[**servicesLoaderExtractPost**](DefaultApi.md#servicesLoaderExtractPost) | **POST** /services/loader/extract | Extract Data Files
[**servicesLoaderJobIdTasksTaskIdFailurelogGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdFailurelogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results
[**servicesLoaderJobIdTasksTaskIdResultsGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdResultsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results
[**servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdResultsRenditionsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results
[**servicesLoaderJobIdTasksTaskIdSuccesslogGet**](DefaultApi.md#servicesLoaderJobIdTasksTaskIdSuccesslogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results
[**servicesLoaderLoadPost**](DefaultApi.md#servicesLoaderLoadPost) | **POST** /services/loader/load | Load Data Objects
[**servicesPackageActionsValidatePost**](DefaultApi.md#servicesPackageActionsValidatePost) | **POST** /services/package/actions/validate | Validate Package
[**servicesPackagePost**](DefaultApi.md#servicesPackagePost) | **POST** /services/package | Export Package
[**servicesPackagePut**](DefaultApi.md#servicesPackagePut) | **PUT** /services/package | Import Package
[**servicesQueuesGet**](DefaultApi.md#servicesQueuesGet) | **GET** /services/queues | Retrieve All Queues
[**servicesQueuesQueueNameActionsDisableDeliveryPut**](DefaultApi.md#servicesQueuesQueueNameActionsDisableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery
[**servicesQueuesQueueNameActionsEnableDeliveryPut**](DefaultApi.md#servicesQueuesQueueNameActionsEnableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery
[**servicesQueuesQueueNameActionsResetPut**](DefaultApi.md#servicesQueuesQueueNameActionsResetPut) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue
[**servicesQueuesQueueNameGet**](DefaultApi.md#servicesQueuesQueueNameGet) | **GET** /services/queues/{queue_name} | Retrieve Queue Status
[**servicesVobjectVaultPackageVPackageIdActionsValidatePost**](DefaultApi.md#servicesVobjectVaultPackageVPackageIdActionsValidatePost) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package
[**sessionDelete**](DefaultApi.md#sessionDelete) | **DELETE** /session | End Session
[**uicodeDistributionsDistributionNameCodeGet**](DefaultApi.md#uicodeDistributionsDistributionNameCodeGet) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution
[**uicodeDistributionsDistributionNameDelete**](DefaultApi.md#uicodeDistributionsDistributionNameDelete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution
[**uicodeDistributionsDistributionNameGet**](DefaultApi.md#uicodeDistributionsDistributionNameGet) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata
[**uicodeDistributionsGet**](DefaultApi.md#uicodeDistributionsGet) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata
[**uicodeDistributionsPost**](DefaultApi.md#uicodeDistributionsPost) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution
[**vobjectVaultPackageVPackageIdActionsDeployPost**](DefaultApi.md#vobjectVaultPackageVPackageIdActionsDeployPost) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package
[**vobjectVaultPackageVPackageIdActionsDeployResultsGet**](DefaultApi.md#vobjectVaultPackageVPackageIdActionsDeployResultsGet) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results
[**vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**](DefaultApi.md#vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job
[**vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**](DefaultApi.md#vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job
[**vobjectsEdlItemVActionsCreateplaceholderPost**](DefaultApi.md#vobjectsEdlItemVActionsCreateplaceholderPost) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item
[**vobjectsMergesJobIdLogGet**](DefaultApi.md#vobjectsMergesJobIdLogGet) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log
[**vobjectsMergesJobIdResultsGet**](DefaultApi.md#vobjectsMergesJobIdResultsGet) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results
[**vobjectsMergesJobIdStatusGet**](DefaultApi.md#vobjectsMergesJobIdStatusGet) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status
[**vobjectsObjectNameActionsActionNamePost**](DefaultApi.md#vobjectsObjectNameActionsActionNamePost) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records
[**vobjectsObjectNameActionsChangetypePost**](DefaultApi.md#vobjectsObjectNameActionsChangetypePost) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type
[**vobjectsObjectNameActionsMergePost**](DefaultApi.md#vobjectsObjectNameActionsMergePost) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge
[**vobjectsObjectNameActionsRecalculaterollupsGet**](DefaultApi.md#vobjectsObjectNameActionsRecalculaterollupsGet) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status
[**vobjectsObjectNameActionsRecalculaterollupsPost**](DefaultApi.md#vobjectsObjectNameActionsRecalculaterollupsPost) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields
[**vobjectsObjectNameActionsUpdatecorporatecurrencyPut**](DefaultApi.md#vobjectsObjectNameActionsUpdatecorporatecurrencyPut) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields
[**vobjectsObjectNameAttachmentsBatchDelete**](DefaultApi.md#vobjectsObjectNameAttachmentsBatchDelete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments
[**vobjectsObjectNameAttachmentsBatchPost**](DefaultApi.md#vobjectsObjectNameAttachmentsBatchPost) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments
[**vobjectsObjectNameAttachmentsBatchPut**](DefaultApi.md#vobjectsObjectNameAttachmentsBatchPut) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions
[**vobjectsObjectNameDelete**](DefaultApi.md#vobjectsObjectNameDelete) | **DELETE** /vobjects/{object_name} | Delete Object Records
[**vobjectsObjectNameIdRolesRoleNameGet**](DefaultApi.md#vobjectsObjectNameIdRolesRoleNameGet) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles
[**vobjectsObjectNameObjectRecordIdActionsActionNameGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsActionNameGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details
[**vobjectsObjectNameObjectRecordIdActionsActionNamePost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsActionNamePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record
[**vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsCascadedeletePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record
[**vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsDeepcopyPost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record
[**vobjectsObjectNameObjectRecordIdActionsGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdActionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions
[**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File
[**vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File
[**vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version
[**vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions
[**vobjectsObjectNameObjectRecordIdAttachmentsFileGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files
[**vobjectsObjectNameObjectRecordIdAttachmentsGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments
[**vobjectsObjectNameObjectRecordIdAttachmentsPost**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAttachmentsPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment
[**vobjectsObjectNameObjectRecordIdAudittrailGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdAudittrailGet) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record
[**vobjectsObjectNameObjectRecordIdGet**](DefaultApi.md#vobjectsObjectNameObjectRecordIdGet) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record
[**vobjectsObjectNamePost**](DefaultApi.md#vobjectsObjectNamePost) | **POST** /vobjects/{object_name} | Create &amp; Upsert Object Records
[**vobjectsObjectNamePut**](DefaultApi.md#vobjectsObjectNamePut) | **PUT** /vobjects/{object_name} | Update Object Records
[**vobjectsObjectNameRolesDelete**](DefaultApi.md#vobjectsObjectNameRolesDelete) | **DELETE** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records
[**vobjectsObjectNameRolesPost**](DefaultApi.md#vobjectsObjectNameRolesPost) | **POST** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records
[**vobjectsOutboundPackageVPackageIdDependenciesGet**](DefaultApi.md#vobjectsOutboundPackageVPackageIdDependenciesGet) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies



## apiGet

Retrieve API Versions

### Example

```bash
 apiGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## apiMdlComponentsComponentTypeAndRecordNameFilesGet

Retrieve Content File

### Example

```bash
 apiMdlComponentsComponentTypeAndRecordNameFilesGet component_type_and_record_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentTypeAndRecordName** | **string** | The component type of the record followed by the name of the record from which to retrieve the content file. The format is '{Componenttype}.{record_name}'. For example, 'Formattedoutput.my_formatted_output__c'. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## apiMdlComponentsComponentTypeAndRecordNameGet

Retrieve Component Record (MDL)

### Example

```bash
 apiMdlComponentsComponentTypeAndRecordNameGet component_type_and_record_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentTypeAndRecordName** | **string** | The component type name ('Picklist', 'Docfield', 'Doctype', etc.) followed by the name of the record from which to retrieve metadata. The format is '{Componenttype}.{record_name}'. For example, 'Picklist.color__c'. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## apiMdlExecuteAsyncJobIdResultsGet

Retrieve Asynchronous MDL Script Results

### Example

```bash
 apiMdlExecuteAsyncJobIdResultsGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## apiMdlExecuteAsyncPost

Execute MDL Script Asynchronously

### Example

```bash
 apiMdlExecuteAsyncPost Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## apiMdlExecutePost

Execute MDL Script

### Example

```bash
 apiMdlExecutePost Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## apiMdlFilesPost

Upload Content File

### Example

```bash
 apiMdlFilesPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audittrailAuditTrailTypeGet

Retrieve Audit Details

### Example

```bash
 audittrailAuditTrailTypeGet audit_trail_type=value  start_date=value  end_date=value  all_dates=value  format_result=value  limit=value  offset=value  objects=value  events=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTrailType** | **string** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. | [default to null]
 **startDate** | **string** | Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] [default to null]
 **endDate** | **string** | Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] [default to null]
 **allDates** | **string** | Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [optional] [default to null]
 **formatResult** | **string** | To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [optional] [default to null]
 **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. | [optional] [default to null]
 **objects** | **string** | This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects=product__v,country__v. If omitted, defaults to all objects. | [optional] [default to null]
 **events** | **string** | This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events=Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authDiscoveryPost

Authentication Type Discovery

### Example

```bash
 authDiscoveryPost Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authOauthSessionOathOidcProfileIdPost

OAuth 2.0 / OpenID Connect

### Example

```bash
 authOauthSessionOathOidcProfileIdPost oath_oidc_profile_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oathOidcProfileId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## authPost

User Name and Password

### Example

```bash
 authPost Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeClassNameDelete

Delete Single Source Code File

### Example

```bash
 codeClassNameDelete class_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **string** | The fully qualified class name of your file. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeClassNameDisablePut

Disable Vault Extension

### Example

```bash
 codeClassNameDisablePut class_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **string** | The fully qualified class name of your file. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeClassNameEnablePut

Enable Vault Extension

### Example

```bash
 codeClassNameEnablePut class_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **string** | The fully qualified class name of your file. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeClassNameGet

Retrieve Single Source Code File

### Example

```bash
 codeClassNameGet class_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **string** | The fully qualified class name of your file. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeProfilerGet

Retrieve All Profiling Sessions

### Example

```bash
 codeProfilerGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeProfilerPost

Create Profiling Session

### Example

```bash
 codeProfilerPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeProfilerSessionNameActionsEndPost

End Profiling Session

### Example

```bash
 codeProfilerSessionNameActionsEndPost session_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **string** | The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeProfilerSessionNameDelete

Delete Profiling Session

### Example

```bash
 codeProfilerSessionNameDelete session_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **string** | The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeProfilerSessionNameGet

Retrieve Profiling Session

### Example

```bash
 codeProfilerSessionNameGet session_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **string** | The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codeProfilerSessionNameResultsGet

Download Profiling Session Results

### Example

```bash
 codeProfilerSessionNameResultsGet session_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **string** | The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## codePut

Add or Replace Single Source Code File

### Example

```bash
 codePut Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## compositesTreesEdlHierarchyOrTemplateActionsListnodesPost

Retrieve Specific Root Nodes

### Example

```bash
 compositesTreesEdlHierarchyOrTemplateActionsListnodesPost edl_hierarchy_or_template=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edlHierarchyOrTemplate** | **string** | Choose to retrieve either edl_hierarchy__v or edl_template__v | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## compositesTreesEdlHierarchyOrTemplateGet

Retrieve All Root Nodes

### Example

```bash
 compositesTreesEdlHierarchyOrTemplateGet edl_hierarchy_or_template=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edlHierarchyOrTemplate** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## compositesTreesEdlHierarchyVParentNodeIdChildrenGet

Retrieve a Node's Children

### Example

```bash
 compositesTreesEdlHierarchyVParentNodeIdChildrenGet parent_node_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentNodeId** | **string** | The ID of a parent node in the hierarchy. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## compositesTreesEdlHierarchyVParentNodeIdChildrenPut

Update Node Order

### Example

```bash
 compositesTreesEdlHierarchyVParentNodeIdChildrenPut parent_node_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentNodeId** | **string** | The ID of a parent node in the hierarchy. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationComponentTypeAndRecordNameGet

Retrieve Component Record (XML/JSON)

### Example

```bash
 configurationComponentTypeAndRecordNameGet component_type_and_record_name=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentTypeAndRecordName** | **string** | The component type name ('Picklist', 'Docfield', 'Doctype', etc.) followed by the name of the record from which to retrieve metadata. The format is '{Componenttype}.{record_name}'. For example, 'Picklist.color__c'. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | [default to null]
 **loc** | **string** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationComponentTypeGet

Retrieve Component Record Collection

### Example

```bash
 configurationComponentTypeGet component_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationObjectNameAndObjectTypeGet

Retrieve Details from a Specific Object

### Example

```bash
 configurationObjectNameAndObjectTypeGet object_name_and_object_type=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectNameAndObjectType** | **string** | The object name followed by the object type in the format 'Objecttype.{object_name}.{object_type}'. For example, 'Objecttype.product__v.base__v'. | [default to null]
 **loc** | **string** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationObjecttypeGet

Retrieve Details from All Object Types

### Example

```bash
 configurationObjecttypeGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationRoleAssignmentRuleDelete

Delete Lifecycle Role Assignment Override Rules

### Example

```bash
 configurationRoleAssignmentRuleDelete Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationRoleAssignmentRuleGet

Retrieve Lifecycle Role Assignment Rules (Default & Override)

### Example

```bash
 configurationRoleAssignmentRuleGet  lifecycle__v=value  role__v=value  product__v=value  country__v=value  study__v=value  study_country__v=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycleV** | **string** | Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v=general_lifecycle__c | [optional] [default to null]
 **roleV** | **string** | Include the name of the role from which to retrieve information. For example: role__v=editor__c | [optional] [default to null]
 **productV** | **string** | Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v=0PR0011001 or product__v.name__v=CholeCap | [optional] [default to null]
 **countryV** | **string** | Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v=0CR0022002 or country__v.name__v=United States | [optional] [default to null]
 **studyV** | **string** | In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v=0ST0021J01 or study__v.name__v=CholeCap Study | [optional] [default to null]
 **studyCountryV** | **string** | In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v=0SC0001001 or study_country__v.name__v=Germany | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationRoleAssignmentRulePost

Create Lifecycle Role Assignment Override Rules

### Example

```bash
 configurationRoleAssignmentRulePost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configurationRoleAssignmentRulePut

Update Lifecycle Role Assignment Rules (Default & Override)

### Example

```bash
 configurationRoleAssignmentRulePut Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delegationLoginPost

Initiate Delegated Session

### Example

```bash
 delegationLoginPost Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** | The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delegationVaultsGet

Retrieve Delegations

### Example

```bash
 delegationVaultsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## keepAlivePost

Session Keep Alive

### Example

```bash
 keepAlivePost Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## limitsGet

Retrieve Limits on Objects

### Example

```bash
 limitsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsApiUsageGet

Download Daily API Usage

### Example

```bash
 logsApiUsageGet  date=value  log_format=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **string** | The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [optional] [default to null]
 **logFormat** | **string** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsCodeDebugGet

Retrieve All Debug Logs

### Example

```bash
 logsCodeDebugGet  user_id=value  include_inactive=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [optional] [default to null]
 **includeInactive** | **boolean** | Set to 'true' to include debug log sessions with a status of 'inactive__sys' in the response. If omitted, defaults to 'false' and inactive sessions are not included in the response. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsCodeDebugIdActionsResetDelete

Delete Debug Log

### Example

```bash
 logsCodeDebugIdActionsResetDelete id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the debug log to delete. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsCodeDebugIdActionsResetPost

Reset Debug Log

### Example

```bash
 logsCodeDebugIdActionsResetPost id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the debug log to delete. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsCodeDebugIdFilesGet

Download Debug Log Files

### Example

```bash
 logsCodeDebugIdFilesGet id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the debug log to download. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsCodeDebugIdGet

Retrieve Single Debug Log

### Example

```bash
 logsCodeDebugIdGet id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the debug log to retrieve. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsCodeDebugPost

Create Debug Log

### Example

```bash
 logsCodeDebugPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logsCodeRuntimeGet

Download SDK Runtime Log

### Example

```bash
 logsCodeRuntimeGet  date=value  log_format=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **string** |  | [optional] [default to null]
 **logFormat** | **string** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## messagesMessageTypeActionsImportPost

Import Bulk Translation File

### Example

```bash
 messagesMessageTypeActionsImportPost message_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageType** | **string** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## messagesMessageTypeLanguageLangActionsExportPost

Export Bulk Translation File

### Example

```bash
 messagesMessageTypeLanguageLangActionsExportPost message_type=value lang=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageType** | **string** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | [default to null]
 **lang** | **string** | A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataAudittrailAuditTrailTypeGet

Retrieve Audit Metadata

### Example

```bash
 metadataAudittrailAuditTrailTypeGet audit_trail_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTrailType** | **string** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataAudittrailGet

Retrieve Audit Types

### Example

```bash
 metadataAudittrailGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataComponentsComponentTypeGet

Retrieve Component Type Metadata

### Example

```bash
 metadataComponentsComponentTypeGet component_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **string** | The component type name (Picklist, Docfield, Doctype, etc.). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataComponentsGet

Retrieve All Component Metadata

### Example

```bash
 metadataComponentsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsBindersTemplatesBindernodesGet

Retrieve Binder Template Node Metadata

### Example

```bash
 metadataObjectsBindersTemplatesBindernodesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsBindersTemplatesGet

Retrieve Binder Template Metadata

### Example

```bash
 metadataObjectsBindersTemplatesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet

Retrieve Annotation Placemark Type Metadata

### Example

```bash
 metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet placemark_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placemarkType** | **string** | The name of the placemark type. For example, sticky__sys. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet

Retrieve Annotation Reference Type Metadata

### Example

```bash
 metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet reference_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet

Retrieve Annotation Type Metadata

### Example

```bash
 metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet annotation_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotationType** | **string** | The name of the annotation type. Valid annotation types include:
'note__sys'
'line__sys'
'document_link__sys'
'permalink_link__sys'
'anchor__sys'
'reply__sys'
'external_link__sys'

The following annotation types are only valid in Medical and PromoMats Vaults:

'suggested_link__sys'
'approved_link__sys'
'auto_link__sys'
'keyword_link__sys' | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet

Retrieve Document Event SubType Metadata

### Example

```bash
 metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet event_type=value event_subtype=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventType** | **string** | The event type. For example, distribution__v. | [default to null]
 **eventSubtype** | **string** | The event subtype. For example, approved_email__v. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsEventsGet

Retrieve Document Event Types and Subtypes

### Example

```bash
 metadataObjectsDocumentsEventsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsLockGet

Retrieve Document Lock Metadata

### Example

```bash
 metadataObjectsDocumentsLockGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsPropertiesFindCommonPost

Retrieve Common Document Fields

### Example

```bash
 metadataObjectsDocumentsPropertiesFindCommonPost Content-Type:value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsPropertiesGet

Retrieve All Document Fields

### Example

```bash
 metadataObjectsDocumentsPropertiesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsTemplatesGet

Retrieve Document Template Metadata

### Example

```bash
 metadataObjectsDocumentsTemplatesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsTypesGet

Retrieve All Document Types

### Example

```bash
 metadataObjectsDocumentsTypesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsTypesTypeGet

Retrieve Document Type

### Example

```bash
 metadataObjectsDocumentsTypesTypeGet type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The document type. See Retrieve Document Types. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsTypesTypeRelationshipsGet

Retrieve Document Type Relationships

### Example

```bash
 metadataObjectsDocumentsTypesTypeRelationshipsGet type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The document type. See Retrieve Document Types. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet

Retrieve Document Classification

### Example

```bash
 metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet type=value subtype=value classification=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The document type. See Retrieve Document Types. | [default to null]
 **subtype** | **string** | The document subtype. See Retrieve Document Types. | [default to null]
 **classification** | **string** | The document classification. See Retrieve Document Types. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet

Retrieve Document Subtype

### Example

```bash
 metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet type=value subtype=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The document type. See Retrieve Document Types. | [default to null]
 **subtype** | **string** | The document subtype. See Retrieve Document Types. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsGroupsGet

Retrieve Group Metadata

### Example

```bash
 metadataObjectsGroupsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsSecuritypoliciesGet

Retrieve Security Policy Metadata

### Example

```bash
 metadataObjectsSecuritypoliciesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataObjectsUsersGet

Retrieve User Metadata

### Example

```bash
 metadataObjectsUsersGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet

Retrieve Archived Document Signature Metadata

### Example

```bash
 metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet

Retrieve Document Signature Metadata

### Example

```bash
 metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataVobjectsGet

Retrieve Object Collection

### Example

```bash
 metadataVobjectsGet  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **boolean** | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataVobjectsObjectNameActionsCanceldeploymentPost

Cancel Raw Object Deployment

### Example

```bash
 metadataVobjectsObjectNameActionsCanceldeploymentPost object_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataVobjectsObjectNameFieldsObjectFieldNameGet

Retrieve Object Field Metadata

### Example

```bash
 metadataVobjectsObjectNameFieldsObjectFieldNameGet object_name=value object_field_name=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectFieldName** | **string** | The object field name value (id, name__v, external_id__v, etc.). | [default to null]
 **loc** | **boolean** | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataVobjectsObjectNameGet

Retrieve Object Metadata

### Example

```bash
 metadataVobjectsObjectNameGet object_name=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **loc** | **boolean** | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataVobjectsObjectNamePageLayoutsGet

Retrieve Page Layouts

### Example

```bash
 metadataVobjectsObjectNamePageLayoutsGet object_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadataVobjectsObjectNamePageLayoutsLayoutNameGet

Retrieve Page Layout Metadata

### Example

```bash
 metadataVobjectsObjectNamePageLayoutsLayoutNameGet object_name=value layout_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The name of the object from which to retrieve page layout metadata. | [default to null]
 **layoutName** | **string** | The name of the page layout from which to retrieve metadata. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notificationsHistoriesGet

Retrieve Email Notification Histories

### Example

```bash
 notificationsHistoriesGet  start_date=value  end_date=value  all_dates=value  format_result=value  limit=value  offset=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day.
If you’ve specified a start_date, you must also specify an end_date. | [optional] [default to null]
 **endDate** | **string** | Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request.
If you’ve specified an end_date, you must also specify a start_date. | [optional] [default to null]
 **allDates** | **boolean** | Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [optional] [default to null]
 **formatResult** | **string** | To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [optional] [default to null]
 **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectWorkflowActionsActionGet

Retrieve Bulk Workflow Action Details

### Example

```bash
 objectWorkflowActionsActionGet action=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectWorkflowActionsActionPost

Initiate Workflow Actions on Multiple Workflows

### Example

```bash
 objectWorkflowActionsActionPost action=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectWorkflowActionsCanceltasksPost

Cancel Workflow Tasks

### Example

```bash
 objectWorkflowActionsCanceltasksPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectWorkflowActionsCancelworkflowsPost

Cancel Workflows

### Example

```bash
 objectWorkflowActionsCancelworkflowsPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectWorkflowActionsGet

Retrieve Bulk Workflow Actions

### Example

```bash
 objectWorkflowActionsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectWorkflowActionsReassigntasksPost

Reassign Workflow Tasks

### Example

```bash
 objectWorkflowActionsReassigntasksPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectWorkflowActionsReplaceworkflowownerPost

Replace Workflow Owner

### Example

```bash
 objectWorkflowActionsReplaceworkflowownerPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersActionsExportJobIdResultsGet

Retrieve Binder Export Results

### Example

```bash
 objectsBindersActionsExportJobIdResultsGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested export job. This is returned with the export binder requests above. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdActionsExportPost

Export Binder (Latest Version)

### Example

```bash
 objectsBindersBinderIdActionsExportPost binder_id=value  source=value  renditiontype=value  docversion=value  attachments=value  export=value  docfield=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **source** | **boolean** | to include source content or not | [optional] [default to null]
 **renditiontype** | **string** | to include viewable renditions | [optional] [default to null]
 **docversion** | **string** | to include all major versions | [optional] [default to null]
 **attachments** | **string** | to include all versions of attachments | [optional] [default to null]
 **export** | **string** | configurable filename metadata | [optional] [default to null]
 **docfield** | **boolean** | to exclude document metadata csv | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdActionsPost

Refresh Binder Auto-Filing

### Example

```bash
 objectsBindersBinderIdActionsPost binder_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdBindingRulePut

Update Binding Rule

### Example

```bash
 objectsBindersBinderIdBindingRulePut binder_id=value Content-Type:value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdDelete

Delete Binder

### Example

```bash
 objectsBindersBinderIdDelete binder_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdDocumentsNodeIdBindingRulePut

Update Binder Document Binding Rule

### Example

```bash
 objectsBindersBinderIdDocumentsNodeIdBindingRulePut binder_id=value node_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **nodeId** | **string** | The binder node id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdDocumentsPost

Add Document to Binder

### Example

```bash
 objectsBindersBinderIdDocumentsPost binder_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdDocumentsSectionIdDelete

Remove Document from Binder

### Example

```bash
 objectsBindersBinderIdDocumentsSectionIdDelete binder_id=value section_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **sectionId** | **string** | The binder node id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdDocumentsSectionIdPut

Move Document in Binder

### Example

```bash
 objectsBindersBinderIdDocumentsSectionIdPut binder_id=value section_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **sectionId** | **string** | The binder node id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdGet

Retrieve Binder

### Example

```bash
 objectsBindersBinderIdGet binder_id=value  depth=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **depth** | **string** | To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdPost

Create Binder Version

### Example

```bash
 objectsBindersBinderIdPost binder_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdPut

Update Binder

### Example

```bash
 objectsBindersBinderIdPut binder_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete

Remove Users & Groups from Roles on a Single Binder

### Example

```bash
 objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete binder_id=value role_name_and_user_or_group=value id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The id value of the binder from which to remove roles. | [default to null]
 **roleNameAndUserOrGroup** | **string** | The name of the role from which to remove the user or group followed by either 'user' or 'group'. The format is '{role_name}.{user_or_group}'. For example, 'consumer__v.user'. | [default to null]
 **id** | **string** | The id value of the user or group to remove from the role. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdSectionsNodeIdBindingRulePut

Update Binder Section Binding Rule

### Example

```bash
 objectsBindersBinderIdSectionsNodeIdBindingRulePut binder_id=value node_id=value Content-Type:value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **nodeId** | **string** | The binder node id field value. | [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdSectionsNodeIdPut

Update Binder Section

### Example

```bash
 objectsBindersBinderIdSectionsNodeIdPut binder_id=value node_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **nodeId** | **string** | The binder node id of the section. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdSectionsPost

Create Binder Section

### Example

```bash
 objectsBindersBinderIdSectionsPost binder_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdSectionsSectionIdDelete

Delete Binder Section

### Example

```bash
 objectsBindersBinderIdSectionsSectionIdDelete binder_id=value section_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **sectionId** | **string** | The binder node id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdSectionsSectionIdGet

Retrieve Binder Sections

### Example

```bash
 objectsBindersBinderIdSectionsSectionIdGet binder_id=value section_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **sectionId** | **string** | The binder node id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsGet

Retrieve All Binder Versions

### Example

```bash
 objectsBindersBinderIdVersionsGet binder_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost

Export Binder (Specific Version)

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost binder_id=value major_version=value minor_version=value  source=value  renditiontype=value  docversion=value  attachments=value  export=value  docfield=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **source** | **boolean** | to include source content or not | [optional] [default to null]
 **renditiontype** | **string** | to include viewable renditions | [optional] [default to null]
 **docversion** | **string** | to include all major versions | [optional] [default to null]
 **attachments** | **string** | to include all versions of attachments | [optional] [default to null]
 **export** | **string** | configurable filename metadata | [optional] [default to null]
 **docfield** | **boolean** | to exclude document metadata csv | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete

Delete Binder Version

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete binder_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionGet

Retrieve Binder Version

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionGet binder_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionPut

Update Binder Version

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionPut binder_id=value major_version=value minor_version=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost

Create Binder Relationship

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost binder_id=value major_version=value minor_version=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete

Delete Binder Relationship

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete binder_id=value major_version=value minor_version=value relationship_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **relationshipId** | **string** | The binder relationship id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet

Retrieve Binder Relationship

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet binder_id=value major_version=value minor_version=value relationship_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **relationshipId** | **string** | The binder relationship id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet

Retrieve Binder Version Section

### Example

```bash
 objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet binder_id=value major_version=value minor_version=value section_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **string** | The binder id field value. | [default to null]
 **majorVersion** | **string** | The binder major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The binder minor_version_number__v field value. | [default to null]
 **sectionId** | **string** | Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersIdRolesGet

Retrieve All Binder Roles

### Example

```bash
 objectsBindersIdRolesGet id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersIdRolesPost

Assign Users & Groups to Roles on a Single Binder

### Example

```bash
 objectsBindersIdRolesPost id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersIdRolesRoleNameGet

Retrieve Document Role

### Example

```bash
 objectsBindersIdRolesRoleNameGet id=value role_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The binder 'id'. | [default to null]
 **roleName** | **string** | The name of the role to retrieve. For example, 'owner__v'. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet

Retrieve Binder User Actions

### Example

```bash
 objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The binder id field value from which to retrieve available user actions. | [default to null]
 **majorVersion** | **string** | The major version number of the binder. | [default to null]
 **minorVersion** | **string** | The minor version number of the binder. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet

Retrieve Binder Entry Criteria

### Example

```bash
 objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet id=value major_version=value minor_version=value name__v=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The binder id field value from which to retrieve available user actions. | [default to null]
 **majorVersion** | **string** | The major version number of the binder. | [default to null]
 **minorVersion** | **string** | The minor version number of the binder. | [default to null]
 **nameV** | **string** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut

Initiate Binder User Action

### Example

```bash
 objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut id=value major_version=value minor_version=value name__v=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The binder id field value from which to retrieve available user actions. | [default to null]
 **majorVersion** | **string** | The major version number of the binder. | [default to null]
 **minorVersion** | **string** | The minor version number of the binder. | [default to null]
 **nameV** | **string** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersLifecycleActionsPost

Retrieve User Actions on Multiple Binders

### Example

```bash
 objectsBindersLifecycleActionsPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersLifecycleActionsUserActionNamePut

Initiate Bulk Binder User Actions

### Example

```bash
 objectsBindersLifecycleActionsUserActionNamePut user_action_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userActionName** | **string** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersPost

Create Binder

### Example

```bash
 objectsBindersPost  async=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async** | **boolean** | When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async=true). This helps speed up the response time from Vault when processing large amounts of data. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesGet

Retrieve Binder Template Collection

### Example

```bash
 objectsBindersTemplatesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesPost

Create Binder Template

### Example

```bash
 objectsBindersTemplatesPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesPut

Update Binder Template

### Example

```bash
 objectsBindersTemplatesPut Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesTemplateNameBindernodesGet

Retrieve Binder Template Node Attributes

### Example

```bash
 objectsBindersTemplatesTemplateNameBindernodesGet template_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The binder template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesTemplateNameBindernodesPost

Create Binder Template Node

### Example

```bash
 objectsBindersTemplatesTemplateNameBindernodesPost template_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The binder template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesTemplateNameBindernodesPut

Replace Binder Template Nodes

### Example

```bash
 objectsBindersTemplatesTemplateNameBindernodesPut template_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The binder template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesTemplateNameDelete

Delete Binder Template

### Example

```bash
 objectsBindersTemplatesTemplateNameDelete template_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The binder template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsBindersTemplatesTemplateNameGet

Retrieve Binder Template Attributes

### Example

```bash
 objectsBindersTemplatesTemplateNameGet template_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The binder template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDeletionsDocumentsGet

Retrieve Deleted Document IDs

### Example

```bash
 objectsDeletionsDocumentsGet  start_date=value  end_date=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional] [default to null]
 **endDate** | **string** | Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDeletionsVobjectsObjectNameGet

Retrieve Deleted Object Record ID

### Example

```bash
 objectsDeletionsVobjectsObjectNameGet object_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsActionsGet

Retrieve All Document Workflows

### Example

```bash
 objectsDocumentsActionsGet  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **boolean** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet

Download Controlled Copy Job Results

### Example

```bash
 objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet lifecycle_and_state_and_action=value job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycleAndStateAndAction** | **string** | The 'name__v' values for the lifecycle, state, and action in the format '{lifecycle_name}.{state_name}.{action_name}'. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the 'href' under the 'artifacts' link. | [default to null]
 **jobId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsActionsWorkflowNameGet

Retrieve Document Workflow Details

### Example

```bash
 objectsDocumentsActionsWorkflowNameGet workflow_name=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **string** | The document workflow name value. | [default to null]
 **loc** | **boolean** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsActionsWorkflowNamePost

Initiate Document Workflow

### Example

```bash
 objectsDocumentsActionsWorkflowNamePost workflow_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **string** | The document workflow name value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsAnnotationsBatchDelete

Delete Annotations

### Example

```bash
 objectsDocumentsAnnotationsBatchDelete Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsAnnotationsBatchPost

Create Multiple Annotations

### Example

```bash
 objectsDocumentsAnnotationsBatchPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [default to null]
 **contentType** | **string** |  | [default to null]
 **accept** | **string** |  | [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsAnnotationsBatchPut

Update Annotations

### Example

```bash
 objectsDocumentsAnnotationsBatchPut Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsAnnotationsRepliesBatchPost

Add Annotation Replies

### Example

```bash
 objectsDocumentsAnnotationsRepliesBatchPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsAttachmentsBatchDelete

Delete Multiple Document Attachments

### Example

```bash
 objectsDocumentsAttachmentsBatchDelete Accept:value Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsAttachmentsBatchPost

Create Multiple Document Attachments

### Example

```bash
 objectsDocumentsAttachmentsBatchPost Accept:value Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsAttachmentsBatchPut

Update Multiple Document Attachment Descriptions

### Example

```bash
 objectsDocumentsAttachmentsBatchPut Accept:value Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchActionsFileextractJobIdResultsGet

Retrieve Document Export Results

### Example

```bash
 objectsDocumentsBatchActionsFileextractJobIdResultsGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested export job. This is returned with the export document requests. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchActionsFileextractPost

Export Documents

### Example

```bash
 objectsDocumentsBatchActionsFileextractPost  source=value  renditions=value  allversions=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **boolean** | Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true. | [optional] [default to null]
 **renditions** | **boolean** | Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false. | [optional] [default to null]
 **allversions** | **boolean** | Optional: To include all versions or latest version, include a query parameter allversions=true. If omitted, defaults to false. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchActionsReclassifyPut

Reclassify Multiple Documents

### Example

```bash
 objectsDocumentsBatchActionsReclassifyPut Authorization:value Content-Type:value Accept:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchActionsRerenderPost

Update Multiple Document Renditions

### Example

```bash
 objectsDocumentsBatchActionsRerenderPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchDelete

Delete Multiple Documents

### Example

```bash
 objectsDocumentsBatchDelete  idParam=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchLockDelete

Undo Collaborative Authoring Checkout

### Example

```bash
 objectsDocumentsBatchLockDelete Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchPost

Create Multiple Documents

### Example

```bash
 objectsDocumentsBatchPost Authorization:value Accept:value Content-Type:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsBatchPut

Update Multiple Documents

### Example

```bash
 objectsDocumentsBatchPut Authorization:value Accept:value Content-Type:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAnchorsGet

Retrieve Anchor IDs

### Example

```bash
 objectsDocumentsDocIdAnchorsGet doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAnnotationsFileGet

Export Document Annotations to PDF

### Example

```bash
 objectsDocumentsDocIdAnnotationsFileGet doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAnnotationsFilePost

Import Document Annotations from PDF

### Example

```bash
 objectsDocumentsDocIdAnnotationsFilePost doc_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdDelete

Delete Single Document Attachment

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdDelete doc_id=value attachment_id=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdFileGet

Download Document Attachment

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdFileGet doc_id=value attachment_id=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdGet

Retrieve Document Attachment Metadata

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdGet doc_id=value attachment_id=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdPut

Update Document Attachment Description

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdPut doc_id=value attachment_id=value Accept:value Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete

Delete Single Document Attachment Version

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete doc_id=value attachment_id=value attachment_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** | The attachment version__v field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

Download Document Attachment Version

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet doc_id=value attachment_id=value attachment_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** | The attachment version__v field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet

Retrieve Document Attachment Version Metadata

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet doc_id=value attachment_id=value attachment_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** | The attachment version__v field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost

Restore Document Attachment Version

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost doc_id=value attachment_id=value attachment_version=value  restore=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** | The attachment version__v field value. | [default to null]
 **restore** | **boolean** | The parameter restore must be set to true. | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet

Retrieve Document Attachment Versions

### Example

```bash
 objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet doc_id=value attachment_id=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsFileGet

Download All Document Attachments

### Example

```bash
 objectsDocumentsDocIdAttachmentsFileGet doc_id=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsGet

Retrieve Document Attachments

### Example

```bash
 objectsDocumentsDocIdAttachmentsGet doc_id=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAttachmentsPost

Create Document Attachment

### Example

```bash
 objectsDocumentsDocIdAttachmentsPost doc_id=value Accept:value Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdAudittrailGet

Retrieve Complete Audit History for a Single Document

### Example

```bash
 objectsDocumentsDocIdAudittrailGet doc_id=value  start_date=value  end_date=value  format_result=value  limit=value  offset=value  events=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document ID for which to retrieve audit history. | [default to null]
 **startDate** | **string** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date. | [optional] [default to null]
 **endDate** | **string** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. | [optional] [default to null]
 **formatResult** | **string** | To request a CSV file of your audit history, use csv. | [optional] [default to null]
 **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. | [optional] [default to null]
 **events** | **string** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events=WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdDelete

Delete Single Document

### Example

```bash
 objectsDocumentsDocIdDelete doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdEventsGet

Retrieve Document Events

### Example

```bash
 objectsDocumentsDocIdEventsGet doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdFileGet

Download Document File

### Example

```bash
 objectsDocumentsDocIdFileGet doc_id=value  lockDocument=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **lockDocument** | **boolean** | Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdGet

Retrieve Document

### Example

```bash
 objectsDocumentsDocIdGet doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdLockDelete

Delete Document Lock

### Example

```bash
 objectsDocumentsDocIdLockDelete doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdLockGet

Retrieve Document Lock

### Example

```bash
 objectsDocumentsDocIdLockGet doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdLockPost

Create Document Lock

### Example

```bash
 objectsDocumentsDocIdLockPost doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet

Download All Document Version Attachments

### Example

```bash
 objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet doc_id=value major_version=value minor_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdPost

Create Single Document Version

### Example

```bash
 objectsDocumentsDocIdPost doc_id=value  suppressRendition=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **suppressRendition** | **string** | Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdPut

Update Single Document

### Example

```bash
 objectsDocumentsDocIdPut doc_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdRenditionsGet

Retrieve Document Renditions

### Example

```bash
 objectsDocumentsDocIdRenditionsGet doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdRenditionsRenditionTypeDelete

Delete Single Document Rendition

### Example

```bash
 objectsDocumentsDocIdRenditionsRenditionTypeDelete doc_id=value rendition_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdRenditionsRenditionTypeGet

Download Document Rendition File

### Example

```bash
 objectsDocumentsDocIdRenditionsRenditionTypeGet doc_id=value rendition_type=value  steadyState=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **steadyState** | **string** | Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdRenditionsRenditionTypePost

Add Single Document Rendition

### Example

```bash
 objectsDocumentsDocIdRenditionsRenditionTypePost doc_id=value rendition_type=value Authorization:value Accept:value Content Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **content Type** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdRenditionsRenditionTypePut

Replace Document Rendition

### Example

```bash
 objectsDocumentsDocIdRenditionsRenditionTypePut doc_id=value rendition_type=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete

Remove Users & Groups from Roles on a Single Document

### Example

```bash
 objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete doc_id=value role_name_and_user_or_group=value id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The id value of the document from which to remove roles. | [default to null]
 **roleNameAndUserOrGroup** | **string** | The name of the role from which to remove the user or group followed by either 'user' or 'group'. The format is '{role_name}.{user_or_group}'. For example, 'consumer__v.user'. | [default to null]
 **id** | **string** | The id value of the user or group to remove from the role. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet

Retrieve Document Version Attachments

### Example

```bash
 objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet doc_id=value major_version=value minor_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsGet

Retrieve Document Versions

### Example

```bash
 objectsDocumentsDocIdVersionsGet doc_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet

Read Annotations by ID

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet doc_id=value major_version=value minor_version=value annotation_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **annotationId** | **string** | The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet

Read Replies of Parent Annotation

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet doc_id=value major_version=value minor_version=value annotation_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **annotationId** | **string** | The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet

Export Document Version Annotations to PDF

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet doc_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost

Import Document Version Annotations from PDF

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost doc_id=value major_version=value minor_version=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet

Read Annotations by Document Version and Type

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet doc_id=value major_version=value minor_version=value  limit=value  offset=value  annotation_types=value  pagination_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **limit** | **string** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [optional] [default to null]
 **offset** | **string** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset=201. | [optional] [default to null]
 **annotationTypes** | **string** | The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include:
'note__sys'
'line__sys'
'document_link__sys'
'permalink_link__sys'
'anchor__sys'
'reply__sys'
'external_link__sys'

The following annotation types are only valid in PromoMats Vaults:

'suggested_link__sys'
'approved_link__sys'
'auto_link__sys'
'keyword_link__sys' | [optional] [default to null]
 **paginationId** | **string** | A unique identifier used to load requests with paginated results. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

Download Document Version Attachment Version

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet doc_id=value major_version=value minor_version=value attachment_id=value attachment_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **attachmentId** | **string** | The id field value of the attachment. | [default to null]
 **attachmentVersion** | **string** | The version of the attachment. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet

Retrieve Document Version Attachment Versions

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet doc_id=value major_version=value minor_version=value attachment_id=value attachment_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **attachmentId** | **string** | The id of the document attachment to retrieve. | [default to null]
 **attachmentVersion** | **string** | Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete

Delete Single Document Version

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete doc_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet

Retrieve Document Version Notes as CSV

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet doc_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost

Create Document Event

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost doc_id=value major_version=value minor_version=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet

Retrieve Video Annotations

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet doc_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The video document id field value. | [default to null]
 **majorVersion** | **string** | The video document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The video document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** | This 'Accept' header only changes the format of the response in the case of an error. On 'SUCCESS', the HTTP Response Header 'Content-Type' is set to 'text/plain;charset=UnicodeLittle'. | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet

Download Document Version File

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet doc_id=value major_version=value minor_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet

Retrieve Document Version

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet doc_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut

Update Document Version

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut doc_id=value major_version=value minor_version=value Authorization:value Content-Type:value Accept:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet

Retrieve Document Relationships

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet doc_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost

Create Single Document Relationship

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost doc_id=value major_version=value minor_version=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete

Delete Single Document Relationship

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete doc_id=value major_version=value minor_version=value relationship_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **relationshipId** | **string** | The relationship id field value. See Retrieve Document Relationships. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet

Retrieve Document Relationship

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet doc_id=value major_version=value minor_version=value relationship_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **relationshipId** | **string** | The relationship id field value. See Retrieve Document Relationships. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet

Retrieve Document Version Renditions

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet doc_id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete

Delete Document Version Rendition

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete doc_id=value major_version=value minor_version=value rendition_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet

Download Document Version Rendition File

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet doc_id=value major_version=value minor_version=value rendition_type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost

Upload Document Version Rendition

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost doc_id=value major_version=value minor_version=value rendition_type=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut

Replace Document Version Rendition

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut doc_id=value major_version=value minor_version=value rendition_type=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **renditionType** | **string** | The document rendition type. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet

Download Document Version Thumbnail File

### Example

```bash
 objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet doc_id=value major_version=value minor_version=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **string** | The document id field value. | [default to null]
 **majorVersion** | **string** | The document major_version_number__v field value. | [default to null]
 **minorVersion** | **string** | The document minor_version_number__v field value. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsGet

Retrieve All Documents

### Example

```bash
 objectsDocumentsGet  named_filter=value  scope=value  versionscope=value  search=value  limit=value  sort=value  start=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namedFilter** | **string** | Retrieves only documents which you have created. | [optional] [default to null]
 **scope** | **string** | Searches only within the document content. | [optional] [default to null]
 **versionscope** | **string** | Retrieves all document versions, rather than only the latest version. | [optional] [default to null]
 **search** | **string** | Search for documents based on a {keyword} in searchable document fields. | [optional] [default to null]
 **limit** | **string** | See VQL documentation for more information. | [optional] [default to null]
 **sort** | **string** | See VQL documentation for more information. | [optional] [default to null]
 **start** | **string** | See VQL documentation for more information. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsIdRolesGet

Retrieve All Document Roles

### Example

```bash
 objectsDocumentsIdRolesGet id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsIdRolesPost

Assign Users & Groups to Roles on a Single Document

### Example

```bash
 objectsDocumentsIdRolesPost id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsIdRolesRoleNameGet

Retrieve Document Role

### Example

```bash
 objectsDocumentsIdRolesRoleNameGet id=value role_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The document 'id'. | [default to null]
 **roleName** | **string** | The name of the role to retrieve. For example, 'owner__v'. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet

Retrieve Document User Actions

### Example

```bash
 objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet id=value major_version=value minor_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The document id field value from which to retrieve available user actions. | [default to null]
 **majorVersion** | **string** | The major version number of the document. | [default to null]
 **minorVersion** | **string** | The minor version number of the document. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet

Retrieve Document Entry Criteria

### Example

```bash
 objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet id=value major_version=value minor_version=value name__v=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The document id field value from which to retrieve available user actions. | [default to null]
 **majorVersion** | **string** | The major version number of the document. | [default to null]
 **minorVersion** | **string** | The minor version number of the document. | [default to null]
 **nameV** | **string** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut

Initiate Document User Action

### Example

```bash
 objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut id=value major_version=value minor_version=value name__v=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The document id field value from which to retrieve available user actions. | [default to null]
 **majorVersion** | **string** | The major version number of the document. | [default to null]
 **minorVersion** | **string** | The minor version number of the document. | [default to null]
 **nameV** | **string** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsLifecycleActionsPost

Retrieve User Actions on Multiple Documents

### Example

```bash
 objectsDocumentsLifecycleActionsPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsLifecycleActionsUserActionNamePut

Initiate Bulk Document User Actions

### Example

```bash
 objectsDocumentsLifecycleActionsUserActionNamePut user_action_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userActionName** | **string** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsPost

Create Single Document

### Example

```bash
 objectsDocumentsPost Authorization:value Accept:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsRelationshipsBatchDelete

Delete Multiple Document Relationships

### Example

```bash
 objectsDocumentsRelationshipsBatchDelete Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsRelationshipsBatchPost

Create Multiple Document Relationships

### Example

```bash
 objectsDocumentsRelationshipsBatchPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsRenditionsBatchDelete

Delete Multiple Document Renditions

### Example

```bash
 objectsDocumentsRenditionsBatchDelete Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsRenditionsBatchPost

Add Multiple Document Renditions

### Example

```bash
 objectsDocumentsRenditionsBatchPost  idParam=value  largeSizeAsset=value Authorization:value Accept:value Content-Type:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **largeSizeAsset** | **string** | If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsRolesBatchDelete

Remove Users and Groups from Roles on Multiple Documents & Binders

### Example

```bash
 objectsDocumentsRolesBatchDelete Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsRolesBatchPost

Assign Users & Groups to Roles on Multiple Documents & Binders

### Example

```bash
 objectsDocumentsRolesBatchPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTemplatesGet

Retrieve Document Template Collection

### Example

```bash
 objectsDocumentsTemplatesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTemplatesPost

Create Single Document Template

### Example

```bash
 objectsDocumentsTemplatesPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTemplatesPut

Update Multiple Document Templates

### Example

```bash
 objectsDocumentsTemplatesPut Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTemplatesTemplateNameDelete

Delete Basic Document Template

### Example

```bash
 objectsDocumentsTemplatesTemplateNameDelete template_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The document template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTemplatesTemplateNameFileGet

Download Document Template File

### Example

```bash
 objectsDocumentsTemplatesTemplateNameFileGet template_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The document template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTemplatesTemplateNameGet

Retrieve Document Template Attributes

### Example

```bash
 objectsDocumentsTemplatesTemplateNameGet template_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The document template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTemplatesTemplateNamePut

Update Single Document Template

### Example

```bash
 objectsDocumentsTemplatesTemplateNamePut template_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **string** | The document template name__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsTokensPost

Document Tokens

### Example

```bash
 objectsDocumentsTokensPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsVersionsBatchActionsFileextractPost

Export Document Versions

### Example

```bash
 objectsDocumentsVersionsBatchActionsFileextractPost  source=value  renditions=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **boolean** | Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true. | [optional] [default to null]
 **renditions** | **boolean** | Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsVersionsBatchDelete

Delete Multiple Document Versions

### Example

```bash
 objectsDocumentsVersionsBatchDelete  idParam=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDocumentsVersionsBatchPost

Create Multiple Document Versions

### Example

```bash
 objectsDocumentsVersionsBatchPost  idParam=value Authorization:value Accept:value Content-Type:value X-VaultAPI-MigrationMode:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIMigrationMode** | **string** | Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the 'status__v' field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDomainGet

Retrieve Domain Information

### Example

```bash
 objectsDomainGet  include_application=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeApplication** | **boolean** | To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsDomainsGet

Retrieve Domains

### Example

```bash
 objectsDomainsGet Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsEdlMatchedDocumentsBatchActionsAddPost

Add EDL Matched Documents

### Example

```bash
 objectsEdlMatchedDocumentsBatchActionsAddPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsEdlMatchedDocumentsBatchActionsRemovePost

Remove EDL Matched Documents

### Example

```bash
 objectsEdlMatchedDocumentsBatchActionsRemovePost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsGroupsAutoGet

Retrieve Auto Managed Groups

### Example

```bash
 objectsGroupsAutoGet  limit=value  offset=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **string** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. | [optional] [default to null]
 **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsGroupsGet

Retrieve All Groups

### Example

```bash
 objectsGroupsGet  includeImplied=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeImplied** | **string** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsGroupsGroupIdDelete

Delete Group

### Example

```bash
 objectsGroupsGroupIdDelete group_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **string** | The group id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsGroupsGroupIdGet

Retrieve Group

### Example

```bash
 objectsGroupsGroupIdGet group_id=value  includeImplied=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **string** | The group id field value. | [default to null]
 **includeImplied** | **boolean** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsGroupsGroupIdPut

Update Group

### Example

```bash
 objectsGroupsGroupIdPut group_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **string** | The group id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsGroupsPost

Create Group

### Example

```bash
 objectsGroupsPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsLicensesGet

Retrieve Application License Usage

### Example

```bash
 objectsLicensesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsActionsGet

Retrieve All Multi-Record Workflows

### Example

```bash
 objectsObjectworkflowsActionsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsActionsWorkflowNameGet

Retrieve Multi-Record Workflow Details

### Example

```bash
 objectsObjectworkflowsActionsWorkflowNameGet workflow_name=value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsActionsWorkflowNamePost

Initiate Multi-Record Workflow

### Example

```bash
 objectsObjectworkflowsActionsWorkflowNamePost workflow_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsGet

Retrieve Workflows

### Example

```bash
 objectsObjectworkflowsGet  object__v=value  record_id__v=value  participant=value  status__v=value  offset=value  page_size=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectV** | **string** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. | [optional] [default to null]
 **recordIdV** | **string** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. | [optional] [default to null]
 **participant** | **string** | To retrieve all workflows available to a particular user, include the user id field value as ?participant={id}. To retrieve your own workflows, set this value to ?participant=me. This parameter is required when the object__v and record_id__v parameters are not used. | [optional] [default to null]
 **statusV** | **string** | To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v=active__v, status__v=active__v,completed__v. Workflows with 'status__v=active__v' are in progress for the indicated object record. Valid statuses include:
active__v
completed__v
cancelled__v | [optional] [default to null]
 **offset** | **string** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. | [optional] [default to null]
 **pageSize** | **string** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. | [optional] [default to null]
 **loc** | **string** | When localized (translated) strings are available, retrieve them by including ?loc=true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksGet

Retrieve Workflow Tasks

### Example

```bash
 objectsObjectworkflowsTasksGet  object__v=value  record_id__v=value  assignee__v=value  status__v=value  offset=value  page_size=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectV** | **string** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used. | [optional] [default to null]
 **recordIdV** | **string** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used. | [optional] [default to null]
 **assigneeV** | **string** | To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v={id}. To retrieve your own workflow tasks, set this value to ?assignee__v=me. This parameter is required when the object__v and record_id__v parameters are not used. | [optional] [default to null]
 **statusV** | **string** | To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v=available__v or ?status__v=available__v,completed__v. | [optional] [default to null]
 **offset** | **string** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. | [optional] [default to null]
 **pageSize** | **string** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. | [optional] [default to null]
 **loc** | **string** | When localized (translated) strings are available, retrieve them by including ?loc=true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsAcceptPost

Accept Single Record Workflow Task

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsAcceptPost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsCancelPost

Cancel Workflow Task

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsCancelPost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsCompletePost

Complete Single Record Workflow Task

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsCompletePost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsGet

Retrieve Workflow Task Actions

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsGet task_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost

Accept Multi-item Workflow Task

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost

Complete Multi-item Workflow Task

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost

Manage Multi-Item Workflow Content

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost

Reassign Multi-item Workflow Task

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The id of the task to reassign. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsReassignPost

Reassign Single Record Workflow Task

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsReassignPost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The id of the task to reassign. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsTaskActionGet

Retrieve Workflow Task Action Details

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsTaskActionGet task_id=value task_action=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **taskAction** | **string** | The name of the task action retrieved from Retrieve Workflow Task Actions. | [default to null]
 **loc** | **string** | When localized (translated) strings are available, retrieve them by including loc=true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost

Undo Workflow Task Acceptance

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost

Update Workflow Task Due Date

### Example

```bash
 objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost task_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The id of the task. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsTasksTaskIdGet

Retrieve Workflow Task Details

### Example

```bash
 objectsObjectworkflowsTasksTaskIdGet task_id=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **string** | The task id field value. | [default to null]
 **loc** | **boolean** | When localized (translated) strings are available, retrieve them by including loc=true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsWorkflowIdActionsGet

Retrieve Workflow Actions

### Example

```bash
 objectsObjectworkflowsWorkflowIdActionsGet workflow_id=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **string** | The workflow id field value. | [default to null]
 **loc** | **string** | When localized (translated) strings are available, retrieve them by including loc=true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet

Retrieve Workflow Action Details

### Example

```bash
 objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet workflow_id=value workflow_action=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **string** | The workflow id field value. | [default to null]
 **workflowAction** | **string** | The workflow action name retrieved from Retrieve Workflow Actions. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost

Initiate Workflow Action

### Example

```bash
 objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost workflow_id=value workflow_action=value  documents__sys=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **string** | The workflow id field value. | [default to null]
 **workflowAction** | **string** | The workflow action name retrieved from Retrieve Workflow Actions. | [default to null]
 **documentsSys** | **string** | Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action.
If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsObjectworkflowsWorkflowIdGet

Retrieve Workflow Details

### Example

```bash
 objectsObjectworkflowsWorkflowIdGet workflow_id=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **string** | The workflow id field value. | [default to null]
 **loc** | **boolean** | When localized (translated) strings are available, retrieve them by including loc=true. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsPicklistsGet

Retrieve All Picklists

### Example

```bash
 objectsPicklistsGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsPicklistsPicklistNameGet

Retrieve Picklist Values

### Example

```bash
 objectsPicklistsPicklistNameGet picklist_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsPicklistsPicklistNamePicklistValueNameDelete

Inactivate Picklist Value

### Example

```bash
 objectsPicklistsPicklistNamePicklistValueNameDelete picklist_name=value picklist_value_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **picklistValueName** | **string** | The picklist value name field value (north_america__c, south_america__c, etc.) | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsPicklistsPicklistNamePicklistValueNamePut

Update Picklist Value

### Example

```bash
 objectsPicklistsPicklistNamePicklistValueNamePut picklist_name=value picklist_value_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **picklistValueName** | **string** | The picklist value name field value (north_america__c, south_america__c, etc.) | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsPicklistsPicklistNamePost

Create Picklist Values

### Example

```bash
 objectsPicklistsPicklistNamePost picklist_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsPicklistsPicklistNamePut

Update Picklist Value Label

### Example

```bash
 objectsPicklistsPicklistNamePut picklist_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxActionsBuildproductionPost

Build Production Vault

### Example

```bash
 objectsSandboxActionsBuildproductionPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxActionsPromoteproductionPost

Promote to Production

### Example

```bash
 objectsSandboxActionsPromoteproductionPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxActionsRecheckusagePost

Recheck Sandbox Usage Limit

### Example

```bash
 objectsSandboxActionsRecheckusagePost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxBatchChangesizePost

Change Sandbox Size

### Example

```bash
 objectsSandboxBatchChangesizePost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxEntitlementsSetPost

Set Sandbox Entitlements

### Example

```bash
 objectsSandboxEntitlementsSetPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxGet

Retrieve Sandboxes

### Example

```bash
 objectsSandboxGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxNameDelete

Delete Sandbox

### Example

```bash
 objectsSandboxNameDelete name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxPost

Create or Refresh Sandbox

### Example

```bash
 objectsSandboxPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxSnapshotApiNameActionsUpdatePost

Update Sandbox Snapshot

### Example

```bash
 objectsSandboxSnapshotApiNameActionsUpdatePost api_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiName** | **string** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxSnapshotApiNameActionsUpgradePost

Upgrade Sandbox Snapshot

### Example

```bash
 objectsSandboxSnapshotApiNameActionsUpgradePost api_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiName** | **string** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxSnapshotApiNameDelete

Delete Sandbox Snapshot

### Example

```bash
 objectsSandboxSnapshotApiNameDelete api_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiName** | **string** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxSnapshotGet

Retrieve Sandbox Snapshots

### Example

```bash
 objectsSandboxSnapshotGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxSnapshotPost

Create Sandbox Snapshot

### Example

```bash
 objectsSandboxSnapshotPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxVaultIdActionsRefreshPost

Refresh Sandbox from Snapshot

### Example

```bash
 objectsSandboxVaultIdActionsRefreshPost vault_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaultId** | **string** | The Vault ID of the sandbox to be refreshed. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSandboxVaultIdGet

Retrieve Sandbox Details by ID

### Example

```bash
 objectsSandboxVaultIdGet vault_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaultId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSecuritypoliciesGet

Retrieve All Security Policies

### Example

```bash
 objectsSecuritypoliciesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsSecuritypoliciesSecurityPolicyNameGet

Retrieve Security Policy

### Example

```bash
 objectsSecuritypoliciesSecurityPolicyNameGet security_policy_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPolicyName** | **string** | Security policy name__v field value (retrieved from previous request). This is typically a numeric value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersGet

Retrieve All Users

### Example

```bash
 objectsUsersGet  vaults=value  exclude_vault_membership=value  exclude_app_licensing=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaults** | **string** | Retrieve all users assigned to all Vaults in your domain. | [optional] [default to null]
 **excludeVaultMembership** | **string** | Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [optional] [default to null]
 **excludeAppLicensing** | **string** | Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersIdGet

Retrieve User

### Example

```bash
 objectsUsersIdGet id=value  exclude_vault_membership=value  exclude_app_licensing=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The user id field value. Use the value me to get information for the currently authenticated user. | [default to null]
 **excludeVaultMembership** | **string** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] [default to null]
 **excludeAppLicensing** | **string** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersIdPermissionsGet

Retrieve User Permissions

### Example

```bash
 objectsUsersIdPermissionsGet id=value  filter=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the user. Use the value me to retrieve information for the currently authenticated user. | [default to null]
 **filter** | **string** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersIdPut

Update Single User

### Example

```bash
 objectsUsersIdPut id=value Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The user id field value. Use the value me to get information for the currently authenticated user. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersMeGet

Validate Session User

### Example

```bash
 objectsUsersMeGet  exclude_vault_membership=value  exclude_app_licensing=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **excludeVaultMembership** | **string** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] [default to null]
 **excludeAppLicensing** | **string** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersMePasswordPost

Change My Password

### Example

```bash
 objectsUsersMePasswordPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersMePermissionsGet

Retrieve My User Permissions

### Example

```bash
 objectsUsersMePermissionsGet  filter=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersMePut

Update My User

### Example

```bash
 objectsUsersMePut Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersPost

Create Single User

### Example

```bash
 objectsUsersPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersPut

Update Multiple Users

### Example

```bash
 objectsUsersPut Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersUserIdDelete

Disable User

### Example

```bash
 objectsUsersUserIdDelete user_id=value  domain=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | The user id field value. | [default to null]
 **domain** | **boolean** | When true, this disables the user account in all vaults in the domain. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsUsersUserIdVaultMembershipVaultIdPut

Update Vault Membership

### Example

```bash
 objectsUsersUserIdVaultMembershipVaultIdPut user_id=value vault_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | The user id field value. | [default to null]
 **vaultId** | **string** | The system-managed id field value assigned to each vault in the domain. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsVaultActionsComparePost

Vault Compare

### Example

```bash
 objectsVaultActionsComparePost Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objectsVaultActionsConfigreportPost

Vault Configuration Report

### Example

```bash
 objectsVaultActionsConfigreportPost Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## queryComponentsPost

Component Definition Query

### Example

```bash
 queryComponentsPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## queryNextPagePost

Next Page URL

### Example

```bash
 queryNextPagePost next_page=value Authorization:value Accept:value X-VaultAPI-DescribeQuery:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIDescribeQuery** | **boolean** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## queryPost

Submitting a Query

### Example

```bash
 queryPost Authorization:value Accept:value X-VaultAPI-DescribeQuery:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIDescribeQuery** | **boolean** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## queryPreviousPagePost

Previous Page URL

### Example

```bash
 queryPreviousPagePost previous_page=value Authorization:value Accept:value X-VaultAPI-DescribeQuery:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **previousPage** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIDescribeQuery** | **boolean** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2MeGet

Retrieve Current User with SCIM

### Example

```bash
 scimV2MeGet  attributes=value  excludedAttributes=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2MePut

Update Current User with SCIM

### Example

```bash
 scimV2MePut  attributes=value  excludedAttributes=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2ResourceTypesGet

Retrieve All SCIM Resource Types

### Example

```bash
 scimV2ResourceTypesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2ResourceTypesTypeGet

Retrieve Single SCIM Resource Type

### Example

```bash
 scimV2ResourceTypesTypeGet type=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2SchemasGet

Retrieve All SCIM Schema Information

### Example

```bash
 scimV2SchemasGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2SchemasIdGet

Retrieve Single SCIM Schema Information

### Example

```bash
 scimV2SchemasIdGet id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2ServiceProviderConfigGet

Retrieve SCIM Provider

### Example

```bash
 scimV2ServiceProviderConfigGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2TypeGet

Retrieve SCIM Resources

### Example

```bash
 scimV2TypeGet type=value  filter=value  attributes=value  excludedAttributes=value  sortBy=value  sortOrder=value  startIndex=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | [default to null]
 **filter** | **string** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator. | [optional] [default to null]
 **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **sortBy** | **string** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported:
securityPolicy
securityProfile
locale
preferredLanguage | [optional] [default to null]
 **sortOrder** | **string** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] [default to null]
 **startIndex** | **string** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2TypeIdGet

Retrieve Single SCIM Resource

### Example

```bash
 scimV2TypeIdGet type=value id=value  attributes=value  excludedAttributes=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | [default to null]
 **id** | **string** | The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. | [default to null]
 **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2UsersGet

Retrieve All Users with SCIM

### Example

```bash
 scimV2UsersGet  filter=value  attributes=value  excludedAttributes=value  sortBy=value  sortOrder=value  count=value  startIndex=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator. | [optional] [default to null]
 **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **sortBy** | **string** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported:
securityPolicy
securityProfile
locale
preferredLanguage | [optional] [default to null]
 **sortOrder** | **string** | Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [optional] [default to null]
 **count** | **string** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] [default to null]
 **startIndex** | **string** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2UsersIdGet

Retrieve Single User with SCIM

### Example

```bash
 scimV2UsersIdGet id=value  filter=value  attributes=value  excludedAttributes=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The id of the user you wish to update. | [default to null]
 **filter** | **string** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator. | [optional] [default to null]
 **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2UsersIdPut

Update User with SCIM

### Example

```bash
 scimV2UsersIdPut id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The id of the user you wish to update. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scimV2UsersPost

Create User with SCIM

### Example

```bash
 scimV2UsersPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesCertificateCertIdGet

Retrieve Signing Certificate

### Example

```bash
 servicesCertificateCertIdGet cert_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certId** | **string** | The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesConfigurationModeActionsDisablePost

Disable Configuration Mode

### Example

```bash
 servicesConfigurationModeActionsDisablePost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesConfigurationModeActionsEnablePost

Enable Configuration Mode

### Example

```bash
 servicesConfigurationModeActionsEnablePost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesDirectdataFilesGet

Retrieve Available Direct Data Files

### Example

```bash
 servicesDirectdataFilesGet  extract_type=value  start_time=value  stop_time=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extractType** | **string** | The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [optional] [default to null]
 **startTime** | **integer** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [optional] [default to null]
 **stopTime** | **integer** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesDirectdataFilesNameGet

Download Direct Data File

### Example

```bash
 servicesDirectdataFilesNameGet name=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingItemsContentItemGet

Download Item Content

### Example

```bash
 servicesFileStagingItemsContentItemGet item=value Authorization:value Accept:value Range:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **string** | The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **range** | **string** | Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format 'bytes={min}-{max}'. For example, 'bytes=0-1000'. | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingItemsItemDelete

Delete File or Folder

### Example

```bash
 servicesFileStagingItemsItemDelete item=value  recursive=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **string** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **recursive** | **string** | Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingItemsItemGet

List Items at a Path

### Example

```bash
 servicesFileStagingItemsItemGet item=value  recursive=value  limit=value  format_result=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **string** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **recursive** | **string** | If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [optional] [default to null]
 **limit** | **string** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] [default to null]
 **formatResult** | **string** | If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingItemsItemPut

Update Folder or File

### Example

```bash
 servicesFileStagingItemsItemPut item=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **string** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingItemsPost

Create Folder or File

### Example

```bash
 servicesFileStagingItemsPost Authorization:value Accept:value Content-MD5:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentMD5** | **string** | Optional: The MD5 checksum of the file being uploaded. | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingUploadGet

List Upload Sessions

### Example

```bash
 servicesFileStagingUploadGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingUploadPost

Create Resumable Upload Session

### Example

```bash
 servicesFileStagingUploadPost Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingUploadUploadSessionIdDelete

Abort Upload Session

### Example

```bash
 servicesFileStagingUploadUploadSessionIdDelete upload_session_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingUploadUploadSessionIdGet

Get Upload Session Details

### Example

```bash
 servicesFileStagingUploadUploadSessionIdGet upload_session_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingUploadUploadSessionIdPartsGet

List File Parts Uploaded to Session

### Example

```bash
 servicesFileStagingUploadUploadSessionIdPartsGet upload_session_id=value  limit=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **string** |  | [default to null]
 **limit** | **string** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingUploadUploadSessionIdPost

Commit Upload Session

### Example

```bash
 servicesFileStagingUploadUploadSessionIdPost upload_session_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesFileStagingUploadUploadSessionIdPut

Upload to a Session

### Example

```bash
 servicesFileStagingUploadUploadSessionIdPut upload_session_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-FilePartNumber:value Content-MD5:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIFilePartNumber** | **string** | The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [optional] [default to null]
 **contentMD5** | **string** | Optional: The MD5 checksum of the file part being uploaded. | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesJobsHistoriesGet

Retrieve Job Histories

### Example

```bash
 servicesJobsHistoriesGet  start_date=value  end_date=value  status=value  limit=value  offset=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] [default to null]
 **endDate** | **string** | Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] [default to null]
 **status** | **string** | Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [optional] [default to null]
 **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] [default to null]
 **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesJobsJobIdErrorsGet

Retrieve Import Bulk Translation File Job Errors

### Example

```bash
 servicesJobsJobIdErrorsGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesJobsJobIdGet

Retrieve Job Status

### Example

```bash
 servicesJobsJobIdGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The ID of the job, returned from the original job request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesJobsJobIdSummaryGet

Retrieve Import Bulk Translation File Job Summary

### Example

```bash
 servicesJobsJobIdSummaryGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesJobsJobIdTasksGet

Retrieve SDK Job Tasks

### Example

```bash
 servicesJobsJobIdTasksGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The ID of the SDK job, returned from the original job request. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesJobsMonitorsGet

Retrieve Job Monitors

### Example

```bash
 servicesJobsMonitorsGet  start_date=value  end_date=value  status=value  limit=value  offset=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] [default to null]
 **endDate** | **string** | Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] [default to null]
 **status** | **string** | Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [optional] [default to null]
 **limit** | **string** | Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] [default to null]
 **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesJobsStartNowJobIdPost

Start Job

### Example

```bash
 servicesJobsStartNowJobIdPost job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The ID of the scheduled job instance to start. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesLoaderExtractPost

Extract Data Files

### Example

```bash
 servicesLoaderExtractPost Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesLoaderJobIdTasksTaskIdFailurelogGet

Retrieve Load Failure Log Results

### Example

```bash
 servicesLoaderJobIdTasksTaskIdFailurelogGet job_id=value task_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested extract job. | [default to null]
 **taskId** | **string** | The id value of the requested extract task. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesLoaderJobIdTasksTaskIdResultsGet

Retrieve Loader Extract Results

### Example

```bash
 servicesLoaderJobIdTasksTaskIdResultsGet job_id=value task_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested extract job. | [default to null]
 **taskId** | **string** | The id value of the requested extract task. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesLoaderJobIdTasksTaskIdResultsRenditionsGet

Retrieve Loader Extract Renditions Results

### Example

```bash
 servicesLoaderJobIdTasksTaskIdResultsRenditionsGet job_id=value task_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested extract job. | [default to null]
 **taskId** | **string** | The id value of the requested extract task. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesLoaderJobIdTasksTaskIdSuccesslogGet

Retrieve Load Success Log Results

### Example

```bash
 servicesLoaderJobIdTasksTaskIdSuccesslogGet job_id=value task_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The id value of the requested extract job. | [default to null]
 **taskId** | **string** | The id value of the requested extract task. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesLoaderLoadPost

Load Data Objects

### Example

```bash
 servicesLoaderLoadPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesPackageActionsValidatePost

Validate Package

### Example

```bash
 servicesPackageActionsValidatePost Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesPackagePost

Export Package

### Example

```bash
 servicesPackagePost Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesPackagePut

Import Package

### Example

```bash
 servicesPackagePut Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesQueuesGet

Retrieve All Queues

### Example

```bash
 servicesQueuesGet Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesQueuesQueueNameActionsDisableDeliveryPut

Disable Delivery

### Example

```bash
 servicesQueuesQueueNameActionsDisableDeliveryPut queue_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **string** | The name of a specific Queue. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesQueuesQueueNameActionsEnableDeliveryPut

Enable Delivery

### Example

```bash
 servicesQueuesQueueNameActionsEnableDeliveryPut queue_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **string** | The name of a specific Queue. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesQueuesQueueNameActionsResetPut

Reset Queue

### Example

```bash
 servicesQueuesQueueNameActionsResetPut queue_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **string** | The name of a specific Queue. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesQueuesQueueNameGet

Retrieve Queue Status

### Example

```bash
 servicesQueuesQueueNameGet queue_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **string** | The name of a specific queue. For example, queue__c. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## servicesVobjectVaultPackageVPackageIdActionsValidatePost

Validate Imported Package

### Example

```bash
 servicesVobjectVaultPackageVPackageIdActionsValidatePost package_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **string** | The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sessionDelete

End Session

### Example

```bash
 sessionDelete Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** | The Vault sessionId to end. | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicodeDistributionsDistributionNameCodeGet

Download Single Client Code Distribution

### Example

```bash
 uicodeDistributionsDistributionNameCodeGet distribution_name=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionName** | **string** | The name attribute of the client code distribution to download. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicodeDistributionsDistributionNameDelete

Delete Single Client Code Distribution

### Example

```bash
 uicodeDistributionsDistributionNameDelete distribution_name=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionName** | **string** | The name attribute of the client code distribution to delete. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicodeDistributionsDistributionNameGet

Retrieve Single Client Code Distribution Metadata

### Example

```bash
 uicodeDistributionsDistributionNameGet distribution_name=value Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionName** | **string** | The name attribute of the client code distribution to delete. | [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicodeDistributionsGet

Retrieve All Client Code Distribution Metadata

### Example

```bash
 uicodeDistributionsGet Accept:value Authorization:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicodeDistributionsPost

Add or Replace Single Client Code Distribution

### Example

```bash
 uicodeDistributionsPost Accept:value Authorization:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectVaultPackageVPackageIdActionsDeployPost

Deploy Package

### Example

```bash
 vobjectVaultPackageVPackageIdActionsDeployPost package_id=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **string** | The id field value of the vault_package__v object record used for deployment. See Import Package. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectVaultPackageVPackageIdActionsDeployResultsGet

Retrieve Package Deploy Results

### Example

```bash
 vobjectVaultPackageVPackageIdActionsDeployResultsGet package_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **string** | The id field value of the vault_package__v object record used for deployment. See Deploy Package. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet

Retrieve Results of Cascade Delete Job

### Example

```bash
 vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet object_name=value job_status=value job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **jobStatus** | **string** |  | [default to null]
 **jobId** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet

Retrieve Results of Deep Copy Job

### Example

```bash
 vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet object_name=value job_status=value job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **jobStatus** | **string** | The ID of the job, retrieved from the response of the job request. | [default to null]
 **jobId** | **string** | Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsEdlItemVActionsCreateplaceholderPost

Create a Placeholder from an EDL Item

### Example

```bash
 vobjectsEdlItemVActionsCreateplaceholderPost Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsMergesJobIdLogGet

Download Merge Records Job Log

### Example

```bash
 vobjectsMergesJobIdLogGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsMergesJobIdResultsGet

Retrieve Record Merge Results

### Example

```bash
 vobjectsMergesJobIdResultsGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsMergesJobIdStatusGet

Retrieve Record Merge Status

### Example

```bash
 vobjectsMergesJobIdStatusGet job_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameActionsActionNamePost

Initiate Object Action on Multiple Records

### Example

```bash
 vobjectsObjectNameActionsActionNamePost object_name=value action_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. | [default to null]
 **actionName** | **string** | Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameActionsChangetypePost

Change Object Type

### Example

```bash
 vobjectsObjectNameActionsChangetypePost object_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The name of the object. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameActionsMergePost

Initiate Record Merge

### Example

```bash
 vobjectsObjectNameActionsMergePost object_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. For example, account__v. This object must have Enable Merges configured. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]
 **vobjectsObjectNameActionsMergePostRequestInner** | [**array[VobjectsObjectNameActionsMergePostRequestInner]**](VobjectsObjectNameActionsMergePostRequestInner.md) |  | [optional]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameActionsRecalculaterollupsGet

Retrieve Roll-up Field Recalculation Status

### Example

```bash
 vobjectsObjectNameActionsRecalculaterollupsGet object_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The name of the object for which to check the status of a Roll-up field recalculation. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameActionsRecalculaterollupsPost

Recalculate Roll-up Fields

### Example

```bash
 vobjectsObjectNameActionsRecalculaterollupsPost object_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The name of the object for which to check the status of a Roll-up field recalculation. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameActionsUpdatecorporatecurrencyPut

Update Corporate Currency Fields

### Example

```bash
 vobjectsObjectNameActionsUpdatecorporatecurrencyPut object_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameAttachmentsBatchDelete

Delete Multiple Object Record Attachments

### Example

```bash
 vobjectsObjectNameAttachmentsBatchDelete object_name=value  idParam=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **idParam** | **string** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameAttachmentsBatchPost

Create Multiple Object Record Attachments

### Example

```bash
 vobjectsObjectNameAttachmentsBatchPost object_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameAttachmentsBatchPut

Update Multiple Object Record Attachment Descriptions

### Example

```bash
 vobjectsObjectNameAttachmentsBatchPut object_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameDelete

Delete Object Records

### Example

```bash
 vobjectsObjectNameDelete object_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** | Can be text/csv or application/json | [optional] [default to null]
 **accept** | **string** | Can be text/csv or application/json | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameIdRolesRoleNameGet

Retrieve Object Record Roles

### Example

```bash
 vobjectsObjectNameIdRolesRoleNameGet object_name=value id=value role_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name. | [default to null]
 **id** | **string** | The id of the document, binder, or object record. | [default to null]
 **roleName** | **string** | Optional: Include a role name to filter for a specific role. For example, owner__v. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdActionsActionNameGet

Retrieve Object User Actions Details

### Example

```bash
 vobjectsObjectNameObjectRecordIdActionsActionNameGet object_name=value object_record_id=value action_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. | [default to null]
 **objectRecordId** | **string** | The object record id field value from which to retrieve user actions. | [default to null]
 **actionName** | **string** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdActionsActionNamePost

Initiate Object Action on a Single Record

### Example

```bash
 vobjectsObjectNameObjectRecordIdActionsActionNamePost object_name=value object_record_id=value action_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. | [default to null]
 **objectRecordId** | **string** | The object record id field value from which to retrieve user actions. | [default to null]
 **actionName** | **string** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdActionsCascadedeletePost

Cascade Delete Object Record

### Example

```bash
 vobjectsObjectNameObjectRecordIdActionsCascadedeletePost object_name=value object_record_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdActionsDeepcopyPost

Deep Copy Object Record

### Example

```bash
 vobjectsObjectNameObjectRecordIdActionsDeepcopyPost object_name=value object_record_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdActionsGet

Retrieve Object Record User Actions

### Example

```bash
 vobjectsObjectNameObjectRecordIdActionsGet object_name=value object_record_id=value  loc=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **loc** | **boolean** | Optional: When true, retrieves localized (translated) strings for the label. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet

Download Attachment Field File

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet object_name=value object_record_id=value attachment_field_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. For example, product__v. | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentFieldName** | **string** | The name of the Attachment field to update. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost

Update Attachment Field File

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost object_name=value object_record_id=value attachment_field_name=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. For example, product__v. | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentFieldName** | **string** | The name of the Attachment field to update. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet

Download All Attachment Field Files

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet object_name=value object_record_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. For example, product__v. | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete

Delete Object Record Attachment

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete object_name=value object_record_id=value attachment_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet

Retrieve Object Record Attachment Metadata

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet object_name=value object_record_id=value attachment_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut

Update Object Record Attachment Description

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut object_name=value object_record_id=value attachment_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete

Delete Object Record Attachment Version

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete object_name=value object_record_id=value attachment_id=value attachment_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** | The attachment version__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

Download Object Record Attachment File

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet object_name=value object_record_id=value attachment_id=value attachment_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** |  | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet

Retrieve Object Record Attachment Version Metadata

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet object_name=value object_record_id=value attachment_id=value attachment_version=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** | The attachment version__v field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost

Restore Object Record Attachment Version

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost object_name=value object_record_id=value attachment_id=value attachment_version=value  restore=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **attachmentVersion** | **string** | The attachment version__v field value. | [default to null]
 **restore** | **boolean** |  | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet

Retrieve Object Record Attachment Versions

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet object_name=value object_record_id=value attachment_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **attachmentId** | **string** | The attachment id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsFileGet

Download All Object Record Attachment Files

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsFileGet object_name=value object_record_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsGet

Retrieve Object Record Attachments

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsGet object_name=value object_record_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAttachmentsPost

Create Object Record Attachment

### Example

```bash
 vobjectsObjectNameObjectRecordIdAttachmentsPost object_name=value object_record_id=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdAudittrailGet

Retrieve Complete Audit History for a Single Object Record

### Example

```bash
 vobjectsObjectNameObjectRecordIdAudittrailGet object_name=value object_record_id=value  start_date=value  end_date=value  format_result=value  limit=value  offset=value  events=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value. | [default to null]
 **objectRecordId** | **string** | The object record id field value from which to retrieve user actions. | [default to null]
 **startDate** | **string** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date. | [optional] [default to null]
 **endDate** | **string** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. | [optional] [default to null]
 **formatResult** | **string** | To request a CSV file of your audit history, use csv. | [optional] [default to null]
 **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. | [optional] [default to null]
 **events** | **string** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events=Copy,Edit,Delete. If omitted, defaults to all audit events. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameObjectRecordIdGet

Retrieve Object Record

### Example

```bash
 vobjectsObjectNameObjectRecordIdGet object_name=value object_record_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **objectRecordId** | **string** | The object record id field value. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNamePost

Create & Upsert Object Records

### Example

```bash
 vobjectsObjectNamePost object_name=value  idParam=value Authorization:value Content-Type:value Accept:value X-VaultAPI-MigrationMode:value X-VaultAPI-NoTriggers:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **idParam** | **string** | To upsert object records, add 'idParam={field_name}' to the request endpoint. You can use any object field which has 'unique' set to 'true' in the object metadata. For example, 'idParam=external_id__v'. | [optional] [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** | Can be text/csv or application/json | [optional] [default to null]
 **accept** | **string** | Can be text/csv or application/json | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | If set to 'true', Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as 'created_by__v'. Does not bypass record triggers. Use the 'X-VaultAPI-NoTriggers' header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] [default to null]
 **xVaultAPINoTriggers** | **boolean** | If set to 'true' and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNamePut

Update Object Records

### Example

```bash
 vobjectsObjectNamePut object_name=value Authorization:value Content-Type:value Accept:value X-VaultAPI-MigrationMode:value X-VaultAPI-NoTriggers:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **contentType** | **string** | Can be text/csv or application/json | [optional] [default to null]
 **accept** | **string** | Can be text/csv or application/json | [optional] [default to null]
 **xVaultAPIMigrationMode** | **boolean** | If set to 'true', Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as 'created_by__v'. Does not bypass record triggers. Use the 'X-VaultAPI-NoTriggers' header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] [default to null]
 **xVaultAPINoTriggers** | **boolean** | If set to 'true' and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameRolesDelete

Remove Users & Groups from Roles on Object Records

### Example

```bash
 vobjectsObjectNameRolesDelete object_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The name of the object where you want to remove roles. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsObjectNameRolesPost

Assign Users & Groups to Roles on Object Records

### Example

```bash
 vobjectsObjectNameRolesPost object_name=value Authorization:value Accept:value Content-Type:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **string** | The name of the object where you want to remove roles. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **contentType** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjectsOutboundPackageVPackageIdDependenciesGet

Retrieve Outbound Package Dependencies

### Example

```bash
 vobjectsOutboundPackageVPackageIdDependenciesGet package_id=value Authorization:value Accept:value X-VaultAPI-ClientID:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **string** | The ID of the outbound_package__v record from which to retrieve dependencies. | [default to null]
 **authorization** | **string** |  | [optional] [default to null]
 **accept** | **string** |  | [optional] [default to null]
 **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as 'unknown' in the API Usage Log. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

