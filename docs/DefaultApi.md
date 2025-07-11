# VeevaVaultApiV251.DefaultApi

All URIs are relative to *http://}/api/v25.1*

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

> apiGet(opts)

Retrieve API Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.apiGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## apiMdlComponentsComponentTypeAndRecordNameFilesGet

> apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName, opts)

Retrieve Content File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let componentTypeAndRecordName = "componentTypeAndRecordName_example"; // String | The component type of the record followed by the name of the record from which to retrieve the content file. The format is `{Componenttype}.{record_name}`. For example, `Formattedoutput.my_formatted_output__c`.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentTypeAndRecordName** | **String**| The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## apiMdlComponentsComponentTypeAndRecordNameGet

> apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName, opts)

Retrieve Component Record (MDL)

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let componentTypeAndRecordName = "componentTypeAndRecordName_example"; // String | The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentTypeAndRecordName** | **String**| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## apiMdlExecuteAsyncJobIdResultsGet

> apiMdlExecuteAsyncJobIdResultsGet(jobId, opts)

Retrieve Asynchronous MDL Script Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.apiMdlExecuteAsyncJobIdResultsGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## apiMdlExecuteAsyncPost

> apiMdlExecuteAsyncPost(opts)

Execute MDL Script Asynchronously

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.apiMdlExecuteAsyncPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## apiMdlExecutePost

> apiMdlExecutePost(opts)

Execute MDL Script

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.apiMdlExecutePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## apiMdlFilesPost

> apiMdlFilesPost(opts)

Upload Content File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.apiMdlFilesPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## audittrailAuditTrailTypeGet

> audittrailAuditTrailTypeGet(auditTrailType, opts)

Retrieve Audit Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let auditTrailType = "auditTrailType_example"; // String | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time.
let opts = {
  'startDate': "startDate_example", // String | Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
  'endDate': "endDate_example", // String | Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
  'allDates': "allDates_example", // String | Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail.
  'formatResult': "formatResult_example", // String | To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required.
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
  'offset': "offset_example", // String | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
  'objects': "objects_example", // String | This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects=product__v,country__v. If omitted, defaults to all objects.
  'events': "events_example", // String | This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events=Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.audittrailAuditTrailTypeGet(auditTrailType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTrailType** | **String**| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. | 
 **startDate** | **String**| Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] 
 **endDate** | **String**| Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] 
 **allDates** | **String**| Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [optional] 
 **formatResult** | **String**| To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [optional] 
 **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
 **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
 **objects** | **String**| This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects. | [optional] 
 **events** | **String**| This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## authDiscoveryPost

> authDiscoveryPost(opts)

Authentication Type Discovery

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.authDiscoveryPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## authOauthSessionOathOidcProfileIdPost

> authOauthSessionOathOidcProfileIdPost(oathOidcProfileId, opts)

OAuth 2.0 / OpenID Connect

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let oathOidcProfileId = "{{oath_oidc_profile_id}}"; // String | 
let opts = {
  'authorization': "Bearer {{access_token}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.authOauthSessionOathOidcProfileIdPost(oathOidcProfileId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oathOidcProfileId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## authPost

> authPost(opts)

User Name and Password

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.authPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeClassNameDelete

> codeClassNameDelete(className, opts)

Delete Single Source Code File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let className = "className_example"; // String | The fully qualified class name of your file.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeClassNameDelete(className, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| The fully qualified class name of your file. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeClassNameDisablePut

> codeClassNameDisablePut(className, opts)

Disable Vault Extension

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let className = "className_example"; // String | The fully qualified class name of your file.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeClassNameDisablePut(className, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| The fully qualified class name of your file. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeClassNameEnablePut

> codeClassNameEnablePut(className, opts)

Enable Vault Extension

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let className = "className_example"; // String | The fully qualified class name of your file.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeClassNameEnablePut(className, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| The fully qualified class name of your file. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeClassNameGet

> codeClassNameGet(className, opts)

Retrieve Single Source Code File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let className = "className_example"; // String | The fully qualified class name of your file.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeClassNameGet(className, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| The fully qualified class name of your file. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeProfilerGet

> codeProfilerGet(opts)

Retrieve All Profiling Sessions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeProfilerGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeProfilerPost

> codeProfilerPost(opts)

Create Profiling Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeProfilerPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeProfilerSessionNameActionsEndPost

> codeProfilerSessionNameActionsEndPost(sessionName, opts)

End Profiling Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let sessionName = "sessionName_example"; // String | The name of the session, for example,  baseline__c.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeProfilerSessionNameActionsEndPost(sessionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **String**| The name of the session, for example,  baseline__c. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeProfilerSessionNameDelete

> codeProfilerSessionNameDelete(sessionName, opts)

Delete Profiling Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let sessionName = "sessionName_example"; // String | The name of the session, for example,  baseline__c.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeProfilerSessionNameDelete(sessionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **String**| The name of the session, for example,  baseline__c. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeProfilerSessionNameGet

> codeProfilerSessionNameGet(sessionName, opts)

Retrieve Profiling Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let sessionName = "sessionName_example"; // String | The name of the session, for example,  baseline__c.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeProfilerSessionNameGet(sessionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **String**| The name of the session, for example,  baseline__c. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codeProfilerSessionNameResultsGet

> codeProfilerSessionNameResultsGet(sessionName, opts)

Download Profiling Session Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let sessionName = "sessionName_example"; // String | The name of the session, for example,  baseline__c.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codeProfilerSessionNameResultsGet(sessionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionName** | **String**| The name of the session, for example,  baseline__c. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## codePut

> codePut(opts)

Add or Replace Single Source Code File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.codePut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## compositesTreesEdlHierarchyOrTemplateActionsListnodesPost

> compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate, opts)

Retrieve Specific Root Nodes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let edlHierarchyOrTemplate = "edlHierarchyOrTemplate_example"; // String | Choose to retrieve either edl_hierarchy__v or edl_template__v
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edlHierarchyOrTemplate** | **String**| Choose to retrieve either edl_hierarchy__v or edl_template__v | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## compositesTreesEdlHierarchyOrTemplateGet

> compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate, opts)

Retrieve All Root Nodes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let edlHierarchyOrTemplate = "edlHierarchyOrTemplate_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edlHierarchyOrTemplate** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## compositesTreesEdlHierarchyVParentNodeIdChildrenGet

> compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId, opts)

Retrieve a Node&#39;s Children

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let parentNodeId = "parentNodeId_example"; // String | The ID of a parent node in the hierarchy.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentNodeId** | **String**| The ID of a parent node in the hierarchy. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## compositesTreesEdlHierarchyVParentNodeIdChildrenPut

> compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId, opts)

Update Node Order

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let parentNodeId = "parentNodeId_example"; // String | The ID of a parent node in the hierarchy.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentNodeId** | **String**| The ID of a parent node in the hierarchy. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationComponentTypeAndRecordNameGet

> configurationComponentTypeAndRecordNameGet(componentTypeAndRecordName, opts)

Retrieve Component Record (XML/JSON)

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let componentTypeAndRecordName = "componentTypeAndRecordName_example"; // String | The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
let opts = {
  'loc': "loc_example", // String | When localized (translated) strings are available, retrieve them by setting loc to true.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationComponentTypeAndRecordNameGet(componentTypeAndRecordName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentTypeAndRecordName** | **String**| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | 
 **loc** | **String**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationComponentTypeGet

> configurationComponentTypeGet(componentType, opts)

Retrieve Component Record Collection

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let componentType = "componentType_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationComponentTypeGet(componentType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationObjectNameAndObjectTypeGet

> configurationObjectNameAndObjectTypeGet(objectNameAndObjectType, opts)

Retrieve Details from a Specific Object

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectNameAndObjectType = "objectNameAndObjectType_example"; // String | The object name followed by the object type in the format `Objecttype.{object_name}.{object_type}`. For example, `Objecttype.product__v.base__v`.
let opts = {
  'loc': "loc_example", // String | When localized (translated) strings are available, retrieve them by setting loc to true.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationObjectNameAndObjectTypeGet(objectNameAndObjectType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectNameAndObjectType** | **String**| The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;. | 
 **loc** | **String**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationObjecttypeGet

> configurationObjecttypeGet(opts)

Retrieve Details from All Object Types

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationObjecttypeGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationRoleAssignmentRuleDelete

> configurationRoleAssignmentRuleDelete(opts)

Delete Lifecycle Role Assignment Override Rules

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationRoleAssignmentRuleDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationRoleAssignmentRuleGet

> configurationRoleAssignmentRuleGet(opts)

Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'lifecycleV': "lifecycleV_example", // String | Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v=general_lifecycle__c
  'roleV': "roleV_example", // String | Include the name of the role from which to retrieve information. For example: role__v=editor__c
  'productV': "productV_example", // String | Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v=0PR0011001 or product__v.name__v=CholeCap
  'countryV': "countryV_example", // String | Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v=0CR0022002 or country__v.name__v=United States
  'studyV': "studyV_example", // String | In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v=0ST0021J01 or study__v.name__v=CholeCap Study
  'studyCountryV': "studyCountryV_example", // String | In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v=0SC0001001 or study_country__v.name__v=Germany
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationRoleAssignmentRuleGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycleV** | **String**| Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c | [optional] 
 **roleV** | **String**| Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c | [optional] 
 **productV** | **String**| Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap | [optional] 
 **countryV** | **String**| Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States | [optional] 
 **studyV** | **String**| In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study | [optional] 
 **studyCountryV** | **String**| In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationRoleAssignmentRulePost

> configurationRoleAssignmentRulePost(opts)

Create Lifecycle Role Assignment Override Rules

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationRoleAssignmentRulePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## configurationRoleAssignmentRulePut

> configurationRoleAssignmentRulePut(opts)

Update Lifecycle Role Assignment Rules (Default &amp; Override)

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.configurationRoleAssignmentRulePut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## delegationLoginPost

> delegationLoginPost(opts)

Initiate Delegated Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.delegationLoginPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## delegationVaultsGet

> delegationVaultsGet(opts)

Retrieve Delegations

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.delegationVaultsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## keepAlivePost

> keepAlivePost(opts)

Session Keep Alive

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.keepAlivePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## limitsGet

> limitsGet(opts)

Retrieve Limits on Objects

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.limitsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsApiUsageGet

> logsApiUsageGet(opts)

Download Daily API Usage

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'date': "date_example", // String | The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
  'logFormat': "logFormat_example", // String | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsApiUsageGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**| The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [optional] 
 **logFormat** | **String**| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsCodeDebugGet

> logsCodeDebugGet(opts)

Retrieve All Debug Logs

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'userId': "userId_example", // String | Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
  'includeInactive': true, // Boolean | Set to `true` to include debug log sessions with a status of `inactive__sys` in the response. If omitted, defaults to `false` and inactive sessions are not included in the response.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsCodeDebugGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [optional] 
 **includeInactive** | **Boolean**| Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsCodeDebugIdActionsResetDelete

> logsCodeDebugIdActionsResetDelete(id, opts)

Delete Debug Log

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The ID of the debug log to delete.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsCodeDebugIdActionsResetDelete(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the debug log to delete. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsCodeDebugIdActionsResetPost

> logsCodeDebugIdActionsResetPost(id, opts)

Reset Debug Log

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The ID of the debug log to delete.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsCodeDebugIdActionsResetPost(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the debug log to delete. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsCodeDebugIdFilesGet

> logsCodeDebugIdFilesGet(id, opts)

Download Debug Log Files

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The ID of the debug log to download.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsCodeDebugIdFilesGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the debug log to download. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsCodeDebugIdGet

> logsCodeDebugIdGet(id, opts)

Retrieve Single Debug Log

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The ID of the debug log to retrieve.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsCodeDebugIdGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the debug log to retrieve. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsCodeDebugPost

> logsCodeDebugPost(opts)

Create Debug Log

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsCodeDebugPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## logsCodeRuntimeGet

> logsCodeRuntimeGet(opts)

Download SDK Runtime Log

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'date': "YYYY-MM-DD", // String | 
  'logFormat': "logFormat_example", // String | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.logsCodeRuntimeGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**|  | [optional] 
 **logFormat** | **String**| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## messagesMessageTypeActionsImportPost

> messagesMessageTypeActionsImportPost(messageType, opts)

Import Bulk Translation File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let messageType = "messageType_example"; // String | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.messagesMessageTypeActionsImportPost(messageType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageType** | **String**| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## messagesMessageTypeLanguageLangActionsExportPost

> messagesMessageTypeLanguageLangActionsExportPost(messageType, lang, opts)

Export Bulk Translation File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let messageType = "messageType_example"; // String | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
let lang = "lang_example"; // String | A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid. 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.messagesMessageTypeLanguageLangActionsExportPost(messageType, lang, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageType** | **String**| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | 
 **lang** | **String**| A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataAudittrailAuditTrailTypeGet

> metadataAudittrailAuditTrailTypeGet(auditTrailType, opts)

Retrieve Audit Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let auditTrailType = "auditTrailType_example"; // String | The name of the specified audit type (document_audit_trail, object_audit_trail, etc).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataAudittrailAuditTrailTypeGet(auditTrailType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTrailType** | **String**| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataAudittrailGet

> metadataAudittrailGet(opts)

Retrieve Audit Types

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataAudittrailGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataComponentsComponentTypeGet

> metadataComponentsComponentTypeGet(componentType, opts)

Retrieve Component Type Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let componentType = "componentType_example"; // String | The component type name (Picklist, Docfield, Doctype, etc.).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataComponentsComponentTypeGet(componentType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentType** | **String**| The component type name (Picklist, Docfield, Doctype, etc.). | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataComponentsGet

> metadataComponentsGet(opts)

Retrieve All Component Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataComponentsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsBindersTemplatesBindernodesGet

> metadataObjectsBindersTemplatesBindernodesGet(opts)

Retrieve Binder Template Node Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsBindersTemplatesBindernodesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsBindersTemplatesGet

> metadataObjectsBindersTemplatesGet(opts)

Retrieve Binder Template Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsBindersTemplatesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet

> metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType, opts)

Retrieve Annotation Placemark Type Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let placemarkType = "placemarkType_example"; // String | The name of the placemark type. For example, sticky__sys.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placemarkType** | **String**| The name of the placemark type. For example, sticky__sys. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet

> metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType, opts)

Retrieve Annotation Reference Type Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let referenceType = "referenceType_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet

> metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType, opts)

Retrieve Annotation Type Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let annotationType = "annotationType_example"; // String | The name of the annotation type. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in Medical and PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys`
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotationType** | **String**| The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet

> metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventType, eventSubtype, opts)

Retrieve Document Event SubType Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let eventType = "eventType_example"; // String | The event type. For example, distribution__v.
let eventSubtype = "eventSubtype_example"; // String | The event subtype. For example, approved_email__v.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventType, eventSubtype, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventType** | **String**| The event type. For example, distribution__v. | 
 **eventSubtype** | **String**| The event subtype. For example, approved_email__v. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsEventsGet

> metadataObjectsDocumentsEventsGet(opts)

Retrieve Document Event Types and Subtypes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsEventsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsLockGet

> metadataObjectsDocumentsLockGet(opts)

Retrieve Document Lock Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsLockGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsPropertiesFindCommonPost

> metadataObjectsDocumentsPropertiesFindCommonPost(opts)

Retrieve Common Document Fields

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsPropertiesFindCommonPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsPropertiesGet

> metadataObjectsDocumentsPropertiesGet(opts)

Retrieve All Document Fields

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsPropertiesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsTemplatesGet

> metadataObjectsDocumentsTemplatesGet(opts)

Retrieve Document Template Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsTemplatesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsTypesGet

> metadataObjectsDocumentsTypesGet(opts)

Retrieve All Document Types

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsTypesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsTypesTypeGet

> metadataObjectsDocumentsTypesTypeGet(type, opts)

Retrieve Document Type

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let type = "type_example"; // String | The document type. See Retrieve Document Types.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsTypesTypeGet(type, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The document type. See Retrieve Document Types. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsTypesTypeRelationshipsGet

> metadataObjectsDocumentsTypesTypeRelationshipsGet(type, opts)

Retrieve Document Type Relationships

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let type = "type_example"; // String | The document type. See Retrieve Document Types.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsTypesTypeRelationshipsGet(type, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The document type. See Retrieve Document Types. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet

> metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(type, subtype, classification, opts)

Retrieve Document Classification

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let type = "type_example"; // String | The document type. See Retrieve Document Types.
let subtype = "subtype_example"; // String | The document subtype. See Retrieve Document Types.
let classification = "classification_example"; // String | The document classification. See Retrieve Document Types.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(type, subtype, classification, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The document type. See Retrieve Document Types. | 
 **subtype** | **String**| The document subtype. See Retrieve Document Types. | 
 **classification** | **String**| The document classification. See Retrieve Document Types. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet

> metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(type, subtype, opts)

Retrieve Document Subtype

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let type = "type_example"; // String | The document type. See Retrieve Document Types.
let subtype = "subtype_example"; // String | The document subtype. See Retrieve Document Types.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(type, subtype, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The document type. See Retrieve Document Types. | 
 **subtype** | **String**| The document subtype. See Retrieve Document Types. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsGroupsGet

> metadataObjectsGroupsGet(opts)

Retrieve Group Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsGroupsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsSecuritypoliciesGet

> metadataObjectsSecuritypoliciesGet(opts)

Retrieve Security Policy Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsSecuritypoliciesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataObjectsUsersGet

> metadataObjectsUsersGet(opts)

Retrieve User Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataObjectsUsersGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet

> metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(opts)

Retrieve Archived Document Signature Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet

> metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(opts)

Retrieve Document Signature Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataVobjectsGet

> metadataVobjectsGet(opts)

Retrieve Object Collection

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'loc': true, // Boolean | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataVobjectsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Boolean**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataVobjectsObjectNameActionsCanceldeploymentPost

> metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName, opts)

Cancel Raw Object Deployment

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataVobjectsObjectNameFieldsObjectFieldNameGet

> metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectName, objectFieldName, opts)

Retrieve Object Field Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectFieldName = "objectFieldName_example"; // String | The object field name value (id, name__v, external_id__v, etc.).
let opts = {
  'loc': true, // Boolean | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectName, objectFieldName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectFieldName** | **String**| The object field name value (id, name__v, external_id__v, etc.). | 
 **loc** | **Boolean**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataVobjectsObjectNameGet

> metadataVobjectsObjectNameGet(objectName, opts)

Retrieve Object Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'loc': true, // Boolean | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataVobjectsObjectNameGet(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **loc** | **Boolean**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataVobjectsObjectNamePageLayoutsGet

> metadataVobjectsObjectNamePageLayoutsGet(objectName, opts)

Retrieve Page Layouts

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataVobjectsObjectNamePageLayoutsGet(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## metadataVobjectsObjectNamePageLayoutsLayoutNameGet

> metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectName, layoutName, opts)

Retrieve Page Layout Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The name of the object from which to retrieve page layout metadata.
let layoutName = "layoutName_example"; // String | The name of the page layout from which to retrieve metadata.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectName, layoutName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The name of the object from which to retrieve page layout metadata. | 
 **layoutName** | **String**| The name of the page layout from which to retrieve metadata. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## notificationsHistoriesGet

> notificationsHistoriesGet(opts)

Retrieve Email Notification Histories

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'startDate': "YYYY-MM-DD", // String | Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date.
  'endDate': "YYYY-MM-DD", // String | Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date.
  'allDates': true, // Boolean | Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours.
  'formatResult': "csv", // String | To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv.
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
  'offset': "offset_example", // String | Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.notificationsHistoriesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. | [optional] 
 **endDate** | **String**| Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. | [optional] 
 **allDates** | **Boolean**| Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [optional] 
 **formatResult** | **String**| To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [optional] 
 **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
 **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectWorkflowActionsActionGet

> objectWorkflowActionsActionGet(action, opts)

Retrieve Bulk Workflow Action Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let action = "action_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectWorkflowActionsActionGet(action, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectWorkflowActionsActionPost

> objectWorkflowActionsActionPost(action, opts)

Initiate Workflow Actions on Multiple Workflows

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let action = "action_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectWorkflowActionsActionPost(action, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectWorkflowActionsCanceltasksPost

> objectWorkflowActionsCanceltasksPost(opts)

Cancel Workflow Tasks

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectWorkflowActionsCanceltasksPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectWorkflowActionsCancelworkflowsPost

> objectWorkflowActionsCancelworkflowsPost(opts)

Cancel Workflows

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectWorkflowActionsCancelworkflowsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectWorkflowActionsGet

> objectWorkflowActionsGet(opts)

Retrieve Bulk Workflow Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectWorkflowActionsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectWorkflowActionsReassigntasksPost

> objectWorkflowActionsReassigntasksPost(opts)

Reassign Workflow Tasks

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectWorkflowActionsReassigntasksPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectWorkflowActionsReplaceworkflowownerPost

> objectWorkflowActionsReplaceworkflowownerPost(opts)

Replace Workflow Owner

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectWorkflowActionsReplaceworkflowownerPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersActionsExportJobIdResultsGet

> objectsBindersActionsExportJobIdResultsGet(jobId, opts)

Retrieve Binder Export Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested export job. This is returned with the export binder requests above.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersActionsExportJobIdResultsGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested export job. This is returned with the export binder requests above. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdActionsExportPost

> objectsBindersBinderIdActionsExportPost(binderId, opts)

Export Binder (Latest Version)

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'source': true, // Boolean | to include source content or not
  'renditiontype': "viewable_rendition__v", // String | to include viewable renditions
  'docversion': "major", // String | to include all major versions
  'attachments': "all", // String | to include all versions of attachments
  '_export': "name__v,title__v,document_number__v", // String | configurable filename metadata
  'docfield': false, // Boolean | to exclude document metadata csv
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdActionsExportPost(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **source** | **Boolean**| to include source content or not | [optional] 
 **renditiontype** | **String**| to include viewable renditions | [optional] 
 **docversion** | **String**| to include all major versions | [optional] 
 **attachments** | **String**| to include all versions of attachments | [optional] 
 **_export** | **String**| configurable filename metadata | [optional] 
 **docfield** | **Boolean**| to exclude document metadata csv | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdActionsPost

> objectsBindersBinderIdActionsPost(binderId, opts)

Refresh Binder Auto-Filing

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdActionsPost(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdBindingRulePut

> objectsBindersBinderIdBindingRulePut(binderId, opts)

Update Binding Rule

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdBindingRulePut(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdDelete

> objectsBindersBinderIdDelete(binderId, opts)

Delete Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdDelete(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdDocumentsNodeIdBindingRulePut

> objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderId, nodeId, opts)

Update Binder Document Binding Rule

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let nodeId = "nodeId_example"; // String | The binder node id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderId, nodeId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **nodeId** | **String**| The binder node id field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdDocumentsPost

> objectsBindersBinderIdDocumentsPost(binderId, opts)

Add Document to Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdDocumentsPost(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdDocumentsSectionIdDelete

> objectsBindersBinderIdDocumentsSectionIdDelete(binderId, sectionId, opts)

Remove Document from Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let sectionId = "sectionId_example"; // String | The binder node id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdDocumentsSectionIdDelete(binderId, sectionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **sectionId** | **String**| The binder node id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdDocumentsSectionIdPut

> objectsBindersBinderIdDocumentsSectionIdPut(binderId, sectionId, opts)

Move Document in Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let sectionId = "sectionId_example"; // String | The binder node id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdDocumentsSectionIdPut(binderId, sectionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **sectionId** | **String**| The binder node id field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdGet

> objectsBindersBinderIdGet(binderId, opts)

Retrieve Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'depth': "depth_example", // String | To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdGet(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **depth** | **String**| To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdPost

> objectsBindersBinderIdPost(binderId, opts)

Create Binder Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdPost(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdPut

> objectsBindersBinderIdPut(binderId, opts)

Update Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdPut(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete

> objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderId, roleNameAndUserOrGroup, id, opts)

Remove Users &amp; Groups from Roles on a Single Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The id value of the binder from which to remove roles.
let roleNameAndUserOrGroup = "roleNameAndUserOrGroup_example"; // String | The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`.
let id = "id_example"; // String | The id value of the user or group to remove from the role.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderId, roleNameAndUserOrGroup, id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The id value of the binder from which to remove roles. | 
 **roleNameAndUserOrGroup** | **String**| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | 
 **id** | **String**| The id value of the user or group to remove from the role. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdSectionsNodeIdBindingRulePut

> objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderId, nodeId, opts)

Update Binder Section Binding Rule

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let nodeId = "nodeId_example"; // String | The binder node id field value.
let opts = {
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderId, nodeId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **nodeId** | **String**| The binder node id field value. | 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdSectionsNodeIdPut

> objectsBindersBinderIdSectionsNodeIdPut(binderId, nodeId, opts)

Update Binder Section

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let nodeId = "nodeId_example"; // String | The binder node id of the section.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdSectionsNodeIdPut(binderId, nodeId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **nodeId** | **String**| The binder node id of the section. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdSectionsPost

> objectsBindersBinderIdSectionsPost(binderId, opts)

Create Binder Section

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdSectionsPost(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdSectionsSectionIdDelete

> objectsBindersBinderIdSectionsSectionIdDelete(binderId, sectionId, opts)

Delete Binder Section

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let sectionId = "sectionId_example"; // String | The binder node id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdSectionsSectionIdDelete(binderId, sectionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **sectionId** | **String**| The binder node id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdSectionsSectionIdGet

> objectsBindersBinderIdSectionsSectionIdGet(binderId, sectionId, opts)

Retrieve Binder Sections

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let sectionId = "sectionId_example"; // String | The binder node id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdSectionsSectionIdGet(binderId, sectionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **sectionId** | **String**| The binder node id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsGet

> objectsBindersBinderIdVersionsGet(binderId, opts)

Retrieve All Binder Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsGet(binderId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost

> objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderId, majorVersion, minorVersion, opts)

Export Binder (Specific Version)

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let opts = {
  'source': true, // Boolean | to include source content or not
  'renditiontype': "viewable_rendition__v", // String | to include viewable renditions
  'docversion': "major", // String | to include all major versions
  'attachments': "all", // String | to include all versions of attachments
  '_export': "name__v,title__v,document_number__v", // String | configurable filename metadata
  'docfield': false, // Boolean | to exclude document metadata csv
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **source** | **Boolean**| to include source content or not | [optional] 
 **renditiontype** | **String**| to include viewable renditions | [optional] 
 **docversion** | **String**| to include all major versions | [optional] 
 **attachments** | **String**| to include all versions of attachments | [optional] 
 **_export** | **String**| configurable filename metadata | [optional] 
 **docfield** | **Boolean**| to exclude document metadata csv | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete

> objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderId, majorVersion, minorVersion, opts)

Delete Binder Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionGet

> objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderId, majorVersion, minorVersion, opts)

Retrieve Binder Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionPut

> objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderId, majorVersion, minorVersion, opts)

Update Binder Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost

> objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderId, majorVersion, minorVersion, opts)

Create Binder Relationship

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete

> objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderId, majorVersion, minorVersion, relationshipId, opts)

Delete Binder Relationship

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let relationshipId = "relationshipId_example"; // String | The binder relationship id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderId, majorVersion, minorVersion, relationshipId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **relationshipId** | **String**| The binder relationship id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet

> objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderId, majorVersion, minorVersion, relationshipId, opts)

Retrieve Binder Relationship

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let relationshipId = "relationshipId_example"; // String | The binder relationship id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderId, majorVersion, minorVersion, relationshipId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **relationshipId** | **String**| The binder relationship id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet

> objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderId, majorVersion, minorVersion, sectionId, opts)

Retrieve Binder Version Section

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let binderId = "binderId_example"; // String | The binder id field value.
let majorVersion = "majorVersion_example"; // String | The binder major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The binder minor_version_number__v field value.
let sectionId = "sectionId_example"; // String | Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderId, majorVersion, minorVersion, sectionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binderId** | **String**| The binder id field value. | 
 **majorVersion** | **String**| The binder major_version_number__v field value. | 
 **minorVersion** | **String**| The binder minor_version_number__v field value. | 
 **sectionId** | **String**| Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersIdRolesGet

> objectsBindersIdRolesGet(id, opts)

Retrieve All Binder Roles

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersIdRolesGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersIdRolesPost

> objectsBindersIdRolesPost(id, opts)

Assign Users &amp; Groups to Roles on a Single Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersIdRolesPost(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersIdRolesRoleNameGet

> objectsBindersIdRolesRoleNameGet(id, roleName, opts)

Retrieve Document Role

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The binder `id`.
let roleName = "roleName_example"; // String | The name of the role to retrieve. For example, `owner__v`.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersIdRolesRoleNameGet(id, roleName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The binder &#x60;id&#x60;. | 
 **roleName** | **String**| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet

> objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, opts)

Retrieve Binder User Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The binder id field value from which to retrieve available user actions.
let majorVersion = "majorVersion_example"; // String | The major version number of the binder.
let minorVersion = "minorVersion_example"; // String | The minor version number of the binder.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The binder id field value from which to retrieve available user actions. | 
 **majorVersion** | **String**| The major version number of the binder. | 
 **minorVersion** | **String**| The minor version number of the binder. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet

> objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, opts)

Retrieve Binder Entry Criteria

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The binder id field value from which to retrieve available user actions.
let majorVersion = "majorVersion_example"; // String | The major version number of the binder.
let minorVersion = "minorVersion_example"; // String | The minor version number of the binder.
let nameV = "nameV_example"; // String | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The binder id field value from which to retrieve available user actions. | 
 **majorVersion** | **String**| The major version number of the binder. | 
 **minorVersion** | **String**| The minor version number of the binder. | 
 **nameV** | **String**| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut

> objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, opts)

Initiate Binder User Action

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The binder id field value from which to retrieve available user actions.
let majorVersion = "majorVersion_example"; // String | The major version number of the binder.
let minorVersion = "minorVersion_example"; // String | The minor version number of the binder.
let nameV = "nameV_example"; // String | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The binder id field value from which to retrieve available user actions. | 
 **majorVersion** | **String**| The major version number of the binder. | 
 **minorVersion** | **String**| The minor version number of the binder. | 
 **nameV** | **String**| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersLifecycleActionsPost

> objectsBindersLifecycleActionsPost(opts)

Retrieve User Actions on Multiple Binders

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersLifecycleActionsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersLifecycleActionsUserActionNamePut

> objectsBindersLifecycleActionsUserActionNamePut(userActionName, opts)

Initiate Bulk Binder User Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let userActionName = "userActionName_example"; // String | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersLifecycleActionsUserActionNamePut(userActionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userActionName** | **String**| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersPost

> objectsBindersPost(opts)

Create Binder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'async': true, // Boolean | When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async=true). This helps speed up the response time from Vault when processing large amounts of data. 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async** | **Boolean**| When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesGet

> objectsBindersTemplatesGet(opts)

Retrieve Binder Template Collection

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesPost

> objectsBindersTemplatesPost(opts)

Create Binder Template

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesPut

> objectsBindersTemplatesPut(opts)

Update Binder Template

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesPut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesTemplateNameBindernodesGet

> objectsBindersTemplatesTemplateNameBindernodesGet(templateName, opts)

Retrieve Binder Template Node Attributes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The binder template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesTemplateNameBindernodesGet(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The binder template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesTemplateNameBindernodesPost

> objectsBindersTemplatesTemplateNameBindernodesPost(templateName, opts)

Create Binder Template Node

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The binder template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesTemplateNameBindernodesPost(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The binder template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesTemplateNameBindernodesPut

> objectsBindersTemplatesTemplateNameBindernodesPut(templateName, opts)

Replace Binder Template Nodes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The binder template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesTemplateNameBindernodesPut(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The binder template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesTemplateNameDelete

> objectsBindersTemplatesTemplateNameDelete(templateName, opts)

Delete Binder Template

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The binder template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesTemplateNameDelete(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The binder template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsBindersTemplatesTemplateNameGet

> objectsBindersTemplatesTemplateNameGet(templateName, opts)

Retrieve Binder Template Attributes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The binder template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsBindersTemplatesTemplateNameGet(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The binder template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDeletionsDocumentsGet

> objectsDeletionsDocumentsGet(opts)

Retrieve Deleted Document IDs

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'startDate': "startDate_example", // String | Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
  'endDate': "endDate_example", // String | Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDeletionsDocumentsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional] 
 **endDate** | **String**| Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDeletionsVobjectsObjectNameGet

> objectsDeletionsVobjectsObjectNameGet(objectName, opts)

Retrieve Deleted Object Record ID

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDeletionsVobjectsObjectNameGet(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsActionsGet

> objectsDocumentsActionsGet(opts)

Retrieve All Document Workflows

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'loc': true, // Boolean | When localized (translated) strings are available, retrieve them by setting loc to true.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsActionsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet

> objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndAction, jobId, opts)

Download Controlled Copy Job Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let lifecycleAndStateAndAction = "lifecycleAndStateAndAction_example"; // String | The `name__v` values for the lifecycle, state, and action in the format `{lifecycle_name}.{state_name}.{action_name}`. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the `href` under the `artifacts` link.
let jobId = "jobId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndAction, jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycleAndStateAndAction** | **String**| The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link. | 
 **jobId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsActionsWorkflowNameGet

> objectsDocumentsActionsWorkflowNameGet(workflowName, opts)

Retrieve Document Workflow Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowName = "workflowName_example"; // String | The document workflow name value.
let opts = {
  'loc': true, // Boolean | When localized (translated) strings are available, retrieve them by setting loc to true.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsActionsWorkflowNameGet(workflowName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **String**| The document workflow name value. | 
 **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsActionsWorkflowNamePost

> objectsDocumentsActionsWorkflowNamePost(workflowName, opts)

Initiate Document Workflow

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowName = "workflowName_example"; // String | The document workflow name value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsActionsWorkflowNamePost(workflowName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **String**| The document workflow name value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsAnnotationsBatchDelete

> objectsDocumentsAnnotationsBatchDelete(opts)

Delete Annotations

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsAnnotationsBatchDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsAnnotationsBatchPost

> objectsDocumentsAnnotationsBatchPost(authorization, contentType, accept, xVaultAPIClientID)

Create Multiple Annotations

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let authorization = "{{sessionId}}"; // String | 
let contentType = "application/json"; // String | 
let accept = "application/json"; // String | 
let xVaultAPIClientID = "{{clientId}}"; // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
apiInstance.objectsDocumentsAnnotationsBatchPost(authorization, contentType, accept, xVaultAPIClientID, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | 
 **contentType** | **String**|  | 
 **accept** | **String**|  | 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsAnnotationsBatchPut

> objectsDocumentsAnnotationsBatchPut(opts)

Update Annotations

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsAnnotationsBatchPut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsAnnotationsRepliesBatchPost

> objectsDocumentsAnnotationsRepliesBatchPost(opts)

Add Annotation Replies

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsAnnotationsRepliesBatchPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsAttachmentsBatchDelete

> objectsDocumentsAttachmentsBatchDelete(opts)

Delete Multiple Document Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsAttachmentsBatchDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsAttachmentsBatchPost

> objectsDocumentsAttachmentsBatchPost(opts)

Create Multiple Document Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsAttachmentsBatchPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsAttachmentsBatchPut

> objectsDocumentsAttachmentsBatchPut(opts)

Update Multiple Document Attachment Descriptions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsAttachmentsBatchPut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchActionsFileextractJobIdResultsGet

> objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId, opts)

Retrieve Document Export Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested export job. This is returned with the export document requests.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested export job. This is returned with the export document requests. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchActionsFileextractPost

> objectsDocumentsBatchActionsFileextractPost(opts)

Export Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'source': true, // Boolean | Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
  'renditions': false, // Boolean | Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
  'allversions': true, // Boolean | Optional: To include all versions or latest version, include a query parameter allversions=true. If omitted, defaults to false.
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchActionsFileextractPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **Boolean**| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] 
 **renditions** | **Boolean**| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] 
 **allversions** | **Boolean**| Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false. | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchActionsReclassifyPut

> objectsDocumentsBatchActionsReclassifyPut(opts)

Reclassify Multiple Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIMigrationMode': true, // Boolean | When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchActionsReclassifyPut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchActionsRerenderPost

> objectsDocumentsBatchActionsRerenderPost(opts)

Update Multiple Document Renditions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchActionsRerenderPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchDelete

> objectsDocumentsBatchDelete(opts)

Delete Multiple Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'idParam': "idParam_example", // String | If you’re identifying documents in your input by their external ID
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchLockDelete

> objectsDocumentsBatchLockDelete(opts)

Undo Collaborative Authoring Checkout

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchLockDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchPost

> objectsDocumentsBatchPost(opts)

Create Multiple Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIMigrationMode': true, // Boolean | When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsBatchPut

> objectsDocumentsBatchPut(opts)

Update Multiple Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIMigrationMode': true, // Boolean | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsBatchPut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAnchorsGet

> objectsDocumentsDocIdAnchorsGet(docId, opts)

Retrieve Anchor IDs

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAnchorsGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAnnotationsFileGet

> objectsDocumentsDocIdAnnotationsFileGet(docId, opts)

Export Document Annotations to PDF

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAnnotationsFileGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAnnotationsFilePost

> objectsDocumentsDocIdAnnotationsFilePost(docId, opts)

Import Document Annotations from PDF

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAnnotationsFilePost(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdDelete

> objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docId, attachmentId, opts)

Delete Single Document Attachment

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdFileGet

> objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docId, attachmentId, opts)

Download Document Attachment

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdGet

> objectsDocumentsDocIdAttachmentsAttachmentIdGet(docId, attachmentId, opts)

Retrieve Document Attachment Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdGet(docId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdPut

> objectsDocumentsDocIdAttachmentsAttachmentIdPut(docId, attachmentId, opts)

Update Document Attachment Description

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdPut(docId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete

> objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docId, attachmentId, attachmentVersion, opts)

Delete Single Document Attachment Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | The attachment version__v field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**| The attachment version__v field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

> objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, attachmentId, attachmentVersion, opts)

Download Document Attachment Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | The attachment version__v field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**| The attachment version__v field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet

> objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, attachmentId, attachmentVersion, opts)

Retrieve Document Attachment Version Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | The attachment version__v field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**| The attachment version__v field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost

> objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docId, attachmentId, attachmentVersion, opts)

Restore Document Attachment Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | The attachment version__v field value.
let opts = {
  'restore': true, // Boolean | The parameter restore must be set to true. 
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**| The attachment version__v field value. | 
 **restore** | **Boolean**| The parameter restore must be set to true.  | [optional] 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet

> objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docId, attachmentId, opts)

Retrieve Document Attachment Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsFileGet

> objectsDocumentsDocIdAttachmentsFileGet(docId, opts)

Download All Document Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsFileGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsGet

> objectsDocumentsDocIdAttachmentsGet(docId, opts)

Retrieve Document Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAttachmentsPost

> objectsDocumentsDocIdAttachmentsPost(docId, opts)

Create Document Attachment

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAttachmentsPost(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdAudittrailGet

> objectsDocumentsDocIdAudittrailGet(docId, opts)

Retrieve Complete Audit History for a Single Document

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document ID for which to retrieve audit history.
let opts = {
  'startDate': "startDate_example", // String | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date. 
  'endDate': "endDate_example", // String | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
  'formatResult': "formatResult_example", // String | To request a CSV file of your audit history, use csv. 
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
  'offset': "offset_example", // String | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
  'events': "events_example", // String | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events=WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdAudittrailGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document ID for which to retrieve audit history. | 
 **startDate** | **String**| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  | [optional] 
 **endDate** | **String**| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] 
 **formatResult** | **String**| To request a CSV file of your audit history, use csv.  | [optional] 
 **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
 **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
 **events** | **String**| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdDelete

> objectsDocumentsDocIdDelete(docId, opts)

Delete Single Document

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdDelete(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdEventsGet

> objectsDocumentsDocIdEventsGet(docId, opts)

Retrieve Document Events

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdEventsGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdFileGet

> objectsDocumentsDocIdFileGet(docId, opts)

Download Document File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'lockDocument': false, // Boolean | Set to true to Check Out this document before retrieval. If omitted, defaults to false.
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdFileGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **lockDocument** | **Boolean**| Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [optional] 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdGet

> objectsDocumentsDocIdGet(docId, opts)

Retrieve Document

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdLockDelete

> objectsDocumentsDocIdLockDelete(docId, opts)

Delete Document Lock

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdLockDelete(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdLockGet

> objectsDocumentsDocIdLockGet(docId, opts)

Retrieve Document Lock

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdLockGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdLockPost

> objectsDocumentsDocIdLockPost(docId, opts)

Create Document Lock

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdLockPost(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet

> objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docId, majorVersion, minorVersion, opts)

Download All Document Version Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdPost

> objectsDocumentsDocIdPost(docId, opts)

Create Single Document Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'suppressRendition': "suppressRendition_example", // String | Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
  'authorization': "{{sessionId}}", // String | 
  'contentType': "multipart/form-data", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdPost(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **suppressRendition** | **String**| Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdPut

> objectsDocumentsDocIdPut(docId, opts)

Update Single Document

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIMigrationMode': true, // Boolean | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdPut(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdRenditionsGet

> objectsDocumentsDocIdRenditionsGet(docId, opts)

Retrieve Document Renditions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdRenditionsGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdRenditionsRenditionTypeDelete

> objectsDocumentsDocIdRenditionsRenditionTypeDelete(docId, renditionType, opts)

Delete Single Document Rendition

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdRenditionsRenditionTypeDelete(docId, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdRenditionsRenditionTypeGet

> objectsDocumentsDocIdRenditionsRenditionTypeGet(docId, renditionType, opts)

Download Document Rendition File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'steadyState': "steadyState_example", // String | Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdRenditionsRenditionTypeGet(docId, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **steadyState** | **String**| Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdRenditionsRenditionTypePost

> objectsDocumentsDocIdRenditionsRenditionTypePost(docId, renditionType, opts)

Add Single Document Rendition

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdRenditionsRenditionTypePost(docId, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdRenditionsRenditionTypePut

> objectsDocumentsDocIdRenditionsRenditionTypePut(docId, renditionType, opts)

Replace Document Rendition

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdRenditionsRenditionTypePut(docId, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete

> objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docId, roleNameAndUserOrGroup, id, opts)

Remove Users &amp; Groups from Roles on a Single Document

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The id value of the document from which to remove roles.
let roleNameAndUserOrGroup = "roleNameAndUserOrGroup_example"; // String | The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`.
let id = "id_example"; // String | The id value of the user or group to remove from the role.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docId, roleNameAndUserOrGroup, id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The id value of the document from which to remove roles. | 
 **roleNameAndUserOrGroup** | **String**| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | 
 **id** | **String**| The id value of the user or group to remove from the role. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet

> objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docId, majorVersion, minorVersion, opts)

Retrieve Document Version Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsGet

> objectsDocumentsDocIdVersionsGet(docId, opts)

Retrieve Document Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsGet(docId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docId, majorVersion, minorVersion, annotationId, opts)

Read Annotations by ID

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let annotationId = "annotationId_example"; // String | The annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docId, majorVersion, minorVersion, annotationId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **annotationId** | **String**| The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docId, majorVersion, minorVersion, annotationId, opts)

Read Replies of Parent Annotation

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let annotationId = "annotationId_example"; // String | The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docId, majorVersion, minorVersion, annotationId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **annotationId** | **String**| The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docId, majorVersion, minorVersion, opts)

Export Document Version Annotations to PDF

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docId, majorVersion, minorVersion, opts)

Import Document Version Annotations from PDF

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docId, majorVersion, minorVersion, opts)

Read Annotations by Document Version and Type

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored.
  'offset': "offset_example", // String | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset=201.
  'annotationTypes': "annotationTypes_example", // String | The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys` 
  'paginationId': "paginationId_example", // String | A unique identifier used to load requests with paginated results.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **limit** | **String**| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [optional] 
 **offset** | **String**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201. | [optional] 
 **annotationTypes** | **String**| The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;  | [optional] 
 **paginationId** | **String**| A unique identifier used to load requests with paginated results. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, opts)

Download Document Version Attachment Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let attachmentId = "attachmentId_example"; // String | The id field value of the attachment.
let attachmentVersion = "attachmentVersion_example"; // String | The version of the attachment.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **attachmentId** | **String**| The id field value of the attachment. | 
 **attachmentVersion** | **String**| The version of the attachment. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, opts)

Retrieve Document Version Attachment Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let attachmentId = "attachmentId_example"; // String | The id of the document attachment to retrieve.
let attachmentVersion = "attachmentVersion_example"; // String | Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **attachmentId** | **String**| The id of the document attachment to retrieve. | 
 **attachmentVersion** | **String**| Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docId, majorVersion, minorVersion, opts)

Delete Single Document Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docId, majorVersion, minorVersion, opts)

Retrieve Document Version Notes as CSV

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docId, majorVersion, minorVersion, opts)

Create Document Event

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docId, majorVersion, minorVersion, opts)

Retrieve Video Annotations

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The video document id field value.
let majorVersion = "majorVersion_example"; // String | The video document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The video document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | This `Accept` header only changes the format of the response in the case of an error. On `SUCCESS`, the HTTP Response Header `Content-Type` is set to `text/plain;charset=UnicodeLittle`.
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The video document id field value. | 
 **majorVersion** | **String**| The video document major_version_number__v field value. | 
 **minorVersion** | **String**| The video document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**| This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;. | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docId, majorVersion, minorVersion, opts)

Download Document Version File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docId, majorVersion, minorVersion, opts)

Retrieve Document Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docId, majorVersion, minorVersion, opts)

Update Document Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIMigrationMode': true, // Boolean | When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docId, majorVersion, minorVersion, opts)

Retrieve Document Relationships

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docId, majorVersion, minorVersion, opts)

Create Single Document Relationship

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docId, majorVersion, minorVersion, relationshipId, opts)

Delete Single Document Relationship

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let relationshipId = "relationshipId_example"; // String | The relationship id field value. See Retrieve Document Relationships.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docId, majorVersion, minorVersion, relationshipId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **relationshipId** | **String**| The relationship id field value. See Retrieve Document Relationships. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docId, majorVersion, minorVersion, relationshipId, opts)

Retrieve Document Relationship

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let relationshipId = "relationshipId_example"; // String | The relationship id field value. See Retrieve Document Relationships.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docId, majorVersion, minorVersion, relationshipId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **relationshipId** | **String**| The relationship id field value. See Retrieve Document Relationships. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docId, majorVersion, minorVersion, opts)

Retrieve Document Version Renditions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docId, majorVersion, minorVersion, renditionType, opts)

Delete Document Version Rendition

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docId, majorVersion, minorVersion, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docId, majorVersion, minorVersion, renditionType, opts)

Download Document Version Rendition File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docId, majorVersion, minorVersion, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docId, majorVersion, minorVersion, renditionType, opts)

Upload Document Version Rendition

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docId, majorVersion, minorVersion, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docId, majorVersion, minorVersion, renditionType, opts)

Replace Document Version Rendition

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let renditionType = "renditionType_example"; // String | The document rendition type.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docId, majorVersion, minorVersion, renditionType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **renditionType** | **String**| The document rendition type. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet

> objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docId, majorVersion, minorVersion, opts)

Download Document Version Thumbnail File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let docId = "docId_example"; // String | The document id field value.
let majorVersion = "majorVersion_example"; // String | The document major_version_number__v field value.
let minorVersion = "minorVersion_example"; // String | The document minor_version_number__v field value.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docId, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docId** | **String**| The document id field value. | 
 **majorVersion** | **String**| The document major_version_number__v field value. | 
 **minorVersion** | **String**| The document minor_version_number__v field value. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsGet

> objectsDocumentsGet(opts)

Retrieve All Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'namedFilter': "My Documents", // String | Retrieves only documents which you have created.
  'scope': "contents", // String | Searches only within the document content.
  'versionscope': "all", // String | Retrieves all document versions, rather than only the latest version.
  'search': "{keyword}", // String | Search for documents based on a {keyword} in searchable document fields.
  'limit': "limit_example", // String | See VQL documentation for more information.
  'sort': "sort_example", // String | See VQL documentation for more information.
  'start': "start_example", // String | See VQL documentation for more information.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namedFilter** | **String**| Retrieves only documents which you have created. | [optional] 
 **scope** | **String**| Searches only within the document content. | [optional] 
 **versionscope** | **String**| Retrieves all document versions, rather than only the latest version. | [optional] 
 **search** | **String**| Search for documents based on a {keyword} in searchable document fields. | [optional] 
 **limit** | **String**| See VQL documentation for more information. | [optional] 
 **sort** | **String**| See VQL documentation for more information. | [optional] 
 **start** | **String**| See VQL documentation for more information. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsIdRolesGet

> objectsDocumentsIdRolesGet(id, opts)

Retrieve All Document Roles

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsIdRolesGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsIdRolesPost

> objectsDocumentsIdRolesPost(id, opts)

Assign Users &amp; Groups to Roles on a Single Document

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsIdRolesPost(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsIdRolesRoleNameGet

> objectsDocumentsIdRolesRoleNameGet(id, roleName, opts)

Retrieve Document Role

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The document `id`.
let roleName = "roleName_example"; // String | The name of the role to retrieve. For example, `owner__v`.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsIdRolesRoleNameGet(id, roleName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The document &#x60;id&#x60;. | 
 **roleName** | **String**| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet

> objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, opts)

Retrieve Document User Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The document id field value from which to retrieve available user actions.
let majorVersion = "majorVersion_example"; // String | The major version number of the document.
let minorVersion = "minorVersion_example"; // String | The minor version number of the document.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The document id field value from which to retrieve available user actions. | 
 **majorVersion** | **String**| The major version number of the document. | 
 **minorVersion** | **String**| The minor version number of the document. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet

> objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, opts)

Retrieve Document Entry Criteria

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The document id field value from which to retrieve available user actions.
let majorVersion = "majorVersion_example"; // String | The major version number of the document.
let minorVersion = "minorVersion_example"; // String | The minor version number of the document.
let nameV = "nameV_example"; // String | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The document id field value from which to retrieve available user actions. | 
 **majorVersion** | **String**| The major version number of the document. | 
 **minorVersion** | **String**| The minor version number of the document. | 
 **nameV** | **String**| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut

> objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, opts)

Initiate Document User Action

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The document id field value from which to retrieve available user actions.
let majorVersion = "majorVersion_example"; // String | The major version number of the document.
let minorVersion = "minorVersion_example"; // String | The minor version number of the document.
let nameV = "nameV_example"; // String | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The document id field value from which to retrieve available user actions. | 
 **majorVersion** | **String**| The major version number of the document. | 
 **minorVersion** | **String**| The minor version number of the document. | 
 **nameV** | **String**| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsLifecycleActionsPost

> objectsDocumentsLifecycleActionsPost(opts)

Retrieve User Actions on Multiple Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsLifecycleActionsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsLifecycleActionsUserActionNamePut

> objectsDocumentsLifecycleActionsUserActionNamePut(userActionName, opts)

Initiate Bulk Document User Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let userActionName = "userActionName_example"; // String | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsLifecycleActionsUserActionNamePut(userActionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userActionName** | **String**| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsPost

> objectsDocumentsPost(opts)

Create Single Document

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIMigrationMode': true, // Boolean | When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsRelationshipsBatchDelete

> objectsDocumentsRelationshipsBatchDelete(opts)

Delete Multiple Document Relationships

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsRelationshipsBatchDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsRelationshipsBatchPost

> objectsDocumentsRelationshipsBatchPost(opts)

Create Multiple Document Relationships

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsRelationshipsBatchPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsRenditionsBatchDelete

> objectsDocumentsRenditionsBatchDelete(opts)

Delete Multiple Document Renditions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsRenditionsBatchDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsRenditionsBatchPost

> objectsDocumentsRenditionsBatchPost(opts)

Add Multiple Document Renditions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'idParam': "idParam_example", // String | If you’re identifying documents in your input by their external ID
  'largeSizeAsset': "largeSizeAsset_example", // String | If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIMigrationMode': true, // Boolean | Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsRenditionsBatchPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] 
 **largeSizeAsset** | **String**| If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsRolesBatchDelete

> objectsDocumentsRolesBatchDelete(opts)

Remove Users and Groups from Roles on Multiple Documents &amp; Binders

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsRolesBatchDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsRolesBatchPost

> objectsDocumentsRolesBatchPost(opts)

Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsRolesBatchPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTemplatesGet

> objectsDocumentsTemplatesGet(opts)

Retrieve Document Template Collection

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTemplatesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTemplatesPost

> objectsDocumentsTemplatesPost(opts)

Create Single Document Template

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "multipart/form-data", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTemplatesPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTemplatesPut

> objectsDocumentsTemplatesPut(opts)

Update Multiple Document Templates

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTemplatesPut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTemplatesTemplateNameDelete

> objectsDocumentsTemplatesTemplateNameDelete(templateName, opts)

Delete Basic Document Template

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The document template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTemplatesTemplateNameDelete(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The document template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTemplatesTemplateNameFileGet

> objectsDocumentsTemplatesTemplateNameFileGet(templateName, opts)

Download Document Template File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The document template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTemplatesTemplateNameFileGet(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The document template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTemplatesTemplateNameGet

> objectsDocumentsTemplatesTemplateNameGet(templateName, opts)

Retrieve Document Template Attributes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The document template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTemplatesTemplateNameGet(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The document template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTemplatesTemplateNamePut

> objectsDocumentsTemplatesTemplateNamePut(templateName, opts)

Update Single Document Template

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let templateName = "templateName_example"; // String | The document template name__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTemplatesTemplateNamePut(templateName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateName** | **String**| The document template name__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsTokensPost

> objectsDocumentsTokensPost(opts)

Document Tokens

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsTokensPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsVersionsBatchActionsFileextractPost

> objectsDocumentsVersionsBatchActionsFileextractPost(opts)

Export Document Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'source': true, // Boolean | Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
  'renditions': false, // Boolean | Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsVersionsBatchActionsFileextractPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **Boolean**| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] 
 **renditions** | **Boolean**| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsVersionsBatchDelete

> objectsDocumentsVersionsBatchDelete(opts)

Delete Multiple Document Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'idParam': "idParam_example", // String | If you’re identifying documents in your input by their external ID
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsVersionsBatchDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDocumentsVersionsBatchPost

> objectsDocumentsVersionsBatchPost(opts)

Create Multiple Document Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'idParam': "external_id__v", // String | If you’re identifying documents in your input by their external ID
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIMigrationMode': "xVaultAPIMigrationMode_example", // String | Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the `status__v` field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDocumentsVersionsBatchPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idParam** | **String**| If you’re identifying documents in your input by their external ID | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIMigrationMode** | **String**| Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDomainGet

> objectsDomainGet(opts)

Retrieve Domain Information

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'includeApplication': true, // Boolean | To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDomainGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeApplication** | **Boolean**| To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsDomainsGet

> objectsDomainsGet(opts)

Retrieve Domains

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsDomainsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsEdlMatchedDocumentsBatchActionsAddPost

> objectsEdlMatchedDocumentsBatchActionsAddPost(opts)

Add EDL Matched Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsEdlMatchedDocumentsBatchActionsAddPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsEdlMatchedDocumentsBatchActionsRemovePost

> objectsEdlMatchedDocumentsBatchActionsRemovePost(opts)

Remove EDL Matched Documents

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsEdlMatchedDocumentsBatchActionsRemovePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsGroupsAutoGet

> objectsGroupsAutoGet(opts)

Retrieve Auto Managed Groups

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
  'offset': "offset_example", // String | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsGroupsAutoGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  | [optional] 
 **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsGroupsGet

> objectsGroupsGet(opts)

Retrieve All Groups

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'includeImplied': "includeImplied_example", // String | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsGroupsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeImplied** | **String**| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsGroupsGroupIdDelete

> objectsGroupsGroupIdDelete(groupId, opts)

Delete Group

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let groupId = "groupId_example"; // String | The group id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsGroupsGroupIdDelete(groupId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsGroupsGroupIdGet

> objectsGroupsGroupIdGet(groupId, opts)

Retrieve Group

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let groupId = "groupId_example"; // String | The group id field value.
let opts = {
  'includeImplied': true, // Boolean | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsGroupsGroupIdGet(groupId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id field value. | 
 **includeImplied** | **Boolean**| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsGroupsGroupIdPut

> objectsGroupsGroupIdPut(groupId, opts)

Update Group

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let groupId = "groupId_example"; // String | The group id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsGroupsGroupIdPut(groupId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsGroupsPost

> objectsGroupsPost(opts)

Create Group 

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsGroupsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsLicensesGet

> objectsLicensesGet(opts)

Retrieve Application License Usage

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsLicensesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsActionsGet

> objectsObjectworkflowsActionsGet(opts)

Retrieve All Multi-Record Workflows

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsActionsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsActionsWorkflowNameGet

> objectsObjectworkflowsActionsWorkflowNameGet(workflowName, opts)

Retrieve Multi-Record Workflow Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowName = "workflowName_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsActionsWorkflowNameGet(workflowName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsActionsWorkflowNamePost

> objectsObjectworkflowsActionsWorkflowNamePost(workflowName, opts)

Initiate Multi-Record Workflow

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowName = "workflowName_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsActionsWorkflowNamePost(workflowName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsGet

> objectsObjectworkflowsGet(opts)

Retrieve Workflows

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'objectV': "objectV_example", // String | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. 
  'recordIdV': "recordIdV_example", // String | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. 
  'participant': "participant_example", // String | To retrieve all workflows available to a particular user, include the user id field value as ?participant={id}. To retrieve your own workflows, set this value to ?participant=me. This parameter is required when the object__v and record_id__v parameters are not used. 
  'statusV': "statusV_example", // String | To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v=active__v, status__v=active__v,completed__v. Workflows with `status__v=active__v` are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v
  'offset': "offset_example", // String | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. 
  'pageSize': "pageSize_example", // String | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. 
  'loc': "loc_example", // String | When localized (translated) strings are available, retrieve them by including ?loc=true. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectV** | **String**| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] 
 **recordIdV** | **String**| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] 
 **participant** | **String**| To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] 
 **statusV** | **String**| To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v | [optional] 
 **offset** | **String**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] 
 **pageSize** | **String**| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] 
 **loc** | **String**| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksGet

> objectsObjectworkflowsTasksGet(opts)

Retrieve Workflow Tasks

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'objectV': "objectV_example", // String | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used.
  'recordIdV': "recordIdV_example", // String | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used.
  'assigneeV': "assigneeV_example", // String | To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v={id}. To retrieve your own workflow tasks, set this value to ?assignee__v=me. This parameter is required when the object__v and record_id__v parameters are not used. 
  'statusV': "statusV_example", // String | To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v=available__v or ?status__v=available__v,completed__v. 
  'offset': "offset_example", // String | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. 
  'pageSize': "pageSize_example", // String | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. 
  'loc': "loc_example", // String | When localized (translated) strings are available, retrieve them by including ?loc=true. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectV** | **String**| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] 
 **recordIdV** | **String**| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] 
 **assigneeV** | **String**| To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] 
 **statusV** | **String**| To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.  | [optional] 
 **offset** | **String**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] 
 **pageSize** | **String**| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] 
 **loc** | **String**| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsAcceptPost

> objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId, opts)

Accept Single Record Workflow Task

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsCancelPost

> objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId, opts)

Cancel Workflow Task

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsCompletePost

> objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId, opts)

Complete Single Record Workflow Task

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsGet

> objectsObjectworkflowsTasksTaskIdActionsGet(taskId, opts)

Retrieve Workflow Task Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsGet(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost

> objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId, opts)

Accept Multi-item Workflow Task

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost

> objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId, opts)

Complete Multi-item Workflow Task

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost

> objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId, opts)

Manage Multi-Item Workflow Content

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost

> objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId, opts)

Reassign Multi-item Workflow Task

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The id of the task to reassign.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The id of the task to reassign. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsReassignPost

> objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId, opts)

Reassign Single Record Workflow Task

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The id of the task to reassign.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The id of the task to reassign. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsTaskActionGet

> objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskId, taskAction, opts)

Retrieve Workflow Task Action Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let taskAction = "taskAction_example"; // String | The name of the task action retrieved from Retrieve Workflow Task Actions.
let opts = {
  'loc': "loc_example", // String | When localized (translated) strings are available, retrieve them by including loc=true. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskId, taskAction, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **taskAction** | **String**| The name of the task action retrieved from Retrieve Workflow Task Actions. | 
 **loc** | **String**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost

> objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId, opts)

Undo Workflow Task Acceptance

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost

> objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId, opts)

Update Workflow Task Due Date

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The id of the task.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The id of the task. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsTasksTaskIdGet

> objectsObjectworkflowsTasksTaskIdGet(taskId, opts)

Retrieve Workflow Task Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let taskId = "taskId_example"; // String | The task id field value.
let opts = {
  'loc': true, // Boolean | When localized (translated) strings are available, retrieve them by including loc=true.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsTasksTaskIdGet(taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| The task id field value. | 
 **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsWorkflowIdActionsGet

> objectsObjectworkflowsWorkflowIdActionsGet(workflowId, opts)

Retrieve Workflow Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowId = "workflowId_example"; // String | The workflow id field value.
let opts = {
  'loc': "loc_example", // String | When localized (translated) strings are available, retrieve them by including loc=true. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsWorkflowIdActionsGet(workflowId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **String**| The workflow id field value. | 
 **loc** | **String**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet

> objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowId, workflowAction, opts)

Retrieve Workflow Action Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowId = "workflowId_example"; // String | The workflow id field value.
let workflowAction = "workflowAction_example"; // String | The workflow action name retrieved from Retrieve Workflow Actions.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowId, workflowAction, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **String**| The workflow id field value. | 
 **workflowAction** | **String**| The workflow action name retrieved from Retrieve Workflow Actions. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost

> objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowId, workflowAction, opts)

Initiate Workflow Action

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowId = "workflowId_example"; // String | The workflow id field value.
let workflowAction = "workflowAction_example"; // String | The workflow action name retrieved from Retrieve Workflow Actions.
let opts = {
  'documentsSys': "documentsSys_example", // String | Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowId, workflowAction, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **String**| The workflow id field value. | 
 **workflowAction** | **String**| The workflow action name retrieved from Retrieve Workflow Actions. | 
 **documentsSys** | **String**| Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsObjectworkflowsWorkflowIdGet

> objectsObjectworkflowsWorkflowIdGet(workflowId, opts)

Retrieve Workflow Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let workflowId = "workflowId_example"; // String | The workflow id field value.
let opts = {
  'loc': true, // Boolean | When localized (translated) strings are available, retrieve them by including loc=true.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsObjectworkflowsWorkflowIdGet(workflowId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **String**| The workflow id field value. | 
 **loc** | **Boolean**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsPicklistsGet

> objectsPicklistsGet(opts)

Retrieve All Picklists

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsPicklistsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsPicklistsPicklistNameGet

> objectsPicklistsPicklistNameGet(picklistName, opts)

Retrieve Picklist Values

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let picklistName = "picklistName_example"; // String | The picklist name field value (license_type__v, product_family__c, region__c, etc.)
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsPicklistsPicklistNameGet(picklistName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsPicklistsPicklistNamePicklistValueNameDelete

> objectsPicklistsPicklistNamePicklistValueNameDelete(picklistName, picklistValueName, opts)

Inactivate Picklist Value

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let picklistName = "picklistName_example"; // String | The picklist name field value (license_type__v, product_family__c, region__c, etc.)
let picklistValueName = "picklistValueName_example"; // String | The picklist value name field value (north_america__c, south_america__c, etc.)
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsPicklistsPicklistNamePicklistValueNameDelete(picklistName, picklistValueName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
 **picklistValueName** | **String**| The picklist value name field value (north_america__c, south_america__c, etc.) | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsPicklistsPicklistNamePicklistValueNamePut

> objectsPicklistsPicklistNamePicklistValueNamePut(picklistName, picklistValueName, opts)

Update Picklist Value

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let picklistName = "picklistName_example"; // String | The picklist name field value (license_type__v, product_family__c, region__c, etc.)
let picklistValueName = "picklistValueName_example"; // String | The picklist value name field value (north_america__c, south_america__c, etc.)
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsPicklistsPicklistNamePicklistValueNamePut(picklistName, picklistValueName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
 **picklistValueName** | **String**| The picklist value name field value (north_america__c, south_america__c, etc.) | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsPicklistsPicklistNamePost

> objectsPicklistsPicklistNamePost(picklistName, opts)

Create Picklist Values

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let picklistName = "picklistName_example"; // String | The picklist name field value (license_type__v, product_family__c, region__c, etc.)
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsPicklistsPicklistNamePost(picklistName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsPicklistsPicklistNamePut

> objectsPicklistsPicklistNamePut(picklistName, opts)

Update Picklist Value Label

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let picklistName = "picklistName_example"; // String | The picklist name field value (license_type__v, product_family__c, region__c, etc.)
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsPicklistsPicklistNamePut(picklistName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistName** | **String**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxActionsBuildproductionPost

> objectsSandboxActionsBuildproductionPost(opts)

Build Production Vault

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxActionsBuildproductionPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxActionsPromoteproductionPost

> objectsSandboxActionsPromoteproductionPost(opts)

Promote to Production

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxActionsPromoteproductionPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxActionsRecheckusagePost

> objectsSandboxActionsRecheckusagePost(opts)

Recheck Sandbox Usage Limit

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxActionsRecheckusagePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxBatchChangesizePost

> objectsSandboxBatchChangesizePost(opts)

Change Sandbox Size

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxBatchChangesizePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxEntitlementsSetPost

> objectsSandboxEntitlementsSetPost(opts)

Set Sandbox Entitlements

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxEntitlementsSetPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxGet

> objectsSandboxGet(opts)

Retrieve Sandboxes

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxNameDelete

> objectsSandboxNameDelete(name, opts)

Delete Sandbox

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let name = "name_example"; // String | The name of the sandbox vault to delete. This is the name which appears on the My Vaults page.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxNameDelete(name, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxPost

> objectsSandboxPost(opts)

Create or Refresh Sandbox

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxSnapshotApiNameActionsUpdatePost

> objectsSandboxSnapshotApiNameActionsUpdatePost(apiName, opts)

Update Sandbox Snapshot

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let apiName = "apiName_example"; // String | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxSnapshotApiNameActionsUpdatePost(apiName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiName** | **String**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxSnapshotApiNameActionsUpgradePost

> objectsSandboxSnapshotApiNameActionsUpgradePost(apiName, opts)

Upgrade Sandbox Snapshot

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let apiName = "apiName_example"; // String | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxSnapshotApiNameActionsUpgradePost(apiName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiName** | **String**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxSnapshotApiNameDelete

> objectsSandboxSnapshotApiNameDelete(apiName, opts)

Delete Sandbox Snapshot

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let apiName = "apiName_example"; // String | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxSnapshotApiNameDelete(apiName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiName** | **String**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxSnapshotGet

> objectsSandboxSnapshotGet(opts)

Retrieve Sandbox Snapshots

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxSnapshotGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxSnapshotPost

> objectsSandboxSnapshotPost(opts)

Create Sandbox Snapshot

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxSnapshotPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxVaultIdActionsRefreshPost

> objectsSandboxVaultIdActionsRefreshPost(vaultId, opts)

Refresh Sandbox from Snapshot

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let vaultId = "vaultId_example"; // String | The Vault ID of the sandbox to be refreshed.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxVaultIdActionsRefreshPost(vaultId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaultId** | **String**| The Vault ID of the sandbox to be refreshed. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSandboxVaultIdGet

> objectsSandboxVaultIdGet(vaultId, opts)

Retrieve Sandbox Details by ID

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let vaultId = "vaultId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSandboxVaultIdGet(vaultId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaultId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSecuritypoliciesGet

> objectsSecuritypoliciesGet(opts)

Retrieve All Security Policies

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSecuritypoliciesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsSecuritypoliciesSecurityPolicyNameGet

> objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName, opts)

Retrieve Security Policy

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let securityPolicyName = "securityPolicyName_example"; // String | Security policy name__v field value (retrieved from previous request). This is typically a numeric value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPolicyName** | **String**| Security policy name__v field value (retrieved from previous request). This is typically a numeric value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersGet

> objectsUsersGet(opts)

Retrieve All Users

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'vaults': "all", // String | Retrieve all users assigned to all Vaults in your domain.
  'excludeVaultMembership': "excludeVaultMembership_example", // String | Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
  'excludeAppLicensing': "excludeAppLicensing_example", // String | Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaults** | **String**| Retrieve all users assigned to all Vaults in your domain. | [optional] 
 **excludeVaultMembership** | **String**| Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [optional] 
 **excludeAppLicensing** | **String**| Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersIdGet

> objectsUsersIdGet(id, opts)

Retrieve User

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The user id field value. Use the value me to get information for the currently authenticated user.
let opts = {
  'excludeVaultMembership': "excludeVaultMembership_example", // String | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
  'excludeAppLicensing': "excludeAppLicensing_example", // String | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersIdGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user id field value. Use the value me to get information for the currently authenticated user. | 
 **excludeVaultMembership** | **String**| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] 
 **excludeAppLicensing** | **String**| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersIdPermissionsGet

> objectsUsersIdPermissionsGet(id, opts)

Retrieve User Permissions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The ID of the user. Use the value me to retrieve information for the currently authenticated user.
let opts = {
  'filter': "filter_example", // String | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersIdPermissionsGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user. Use the value me to retrieve information for the currently authenticated user. | 
 **filter** | **String**| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersIdPut

> objectsUsersIdPut(id, opts)

Update Single User

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The user id field value. Use the value me to get information for the currently authenticated user.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersIdPut(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user id field value. Use the value me to get information for the currently authenticated user. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersMeGet

> objectsUsersMeGet(opts)

Validate Session User

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'excludeVaultMembership': "excludeVaultMembership_example", // String | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
  'excludeAppLicensing': "excludeAppLicensing_example", // String | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersMeGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **excludeVaultMembership** | **String**| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] 
 **excludeAppLicensing** | **String**| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersMePasswordPost

> objectsUsersMePasswordPost(opts)

Change My Password

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersMePasswordPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersMePermissionsGet

> objectsUsersMePermissionsGet(opts)

Retrieve My User Permissions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'filter': "filter_example", // String | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersMePermissionsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersMePut

> objectsUsersMePut(opts)

Update My User

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersMePut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersPost

> objectsUsersPost(opts)

Create Single User

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersPut

> objectsUsersPut(opts)

Update Multiple Users

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersPut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersUserIdDelete

> objectsUsersUserIdDelete(userId, opts)

Disable User

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let userId = "userId_example"; // String | The user id field value. 
let opts = {
  'domain': true, // Boolean | When true, this disables the user account in all vaults in the domain.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersUserIdDelete(userId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user id field value.  | 
 **domain** | **Boolean**| When true, this disables the user account in all vaults in the domain. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsUsersUserIdVaultMembershipVaultIdPut

> objectsUsersUserIdVaultMembershipVaultIdPut(userId, vaultId, opts)

Update Vault Membership

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let userId = "userId_example"; // String | The user id field value.
let vaultId = "vaultId_example"; // String | The system-managed id field value assigned to each vault in the domain.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsUsersUserIdVaultMembershipVaultIdPut(userId, vaultId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user id field value. | 
 **vaultId** | **String**| The system-managed id field value assigned to each vault in the domain. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsVaultActionsComparePost

> objectsVaultActionsComparePost(opts)

Vault Compare

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsVaultActionsComparePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## objectsVaultActionsConfigreportPost

> objectsVaultActionsConfigreportPost(opts)

Vault Configuration Report

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.objectsVaultActionsConfigreportPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## queryComponentsPost

> queryComponentsPost(opts)

Component Definition Query

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.queryComponentsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## queryNextPagePost

> queryNextPagePost(nextPage, opts)

Next Page URL

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let nextPage = "nextPage_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIDescribeQuery': true, // Boolean | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.queryNextPagePost(nextPage, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIDescribeQuery** | **Boolean**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## queryPost

> queryPost(opts)

Submitting a Query

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIDescribeQuery': true, // Boolean | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.queryPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIDescribeQuery** | **Boolean**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## queryPreviousPagePost

> queryPreviousPagePost(previousPage, opts)

Previous Page URL

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let previousPage = "previousPage_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIDescribeQuery': true, // Boolean | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.queryPreviousPagePost(previousPage, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **previousPage** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIDescribeQuery** | **Boolean**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2MeGet

> scimV2MeGet(opts)

Retrieve Current User with SCIM

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'attributes': "attributes_example", // String | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
  'excludedAttributes': "excludedAttributes_example", // String | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2MeGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
 **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2MePut

> scimV2MePut(opts)

Update Current User with SCIM

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'attributes': "attributes_example", // String | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
  'excludedAttributes': "excludedAttributes_example", // String | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'contentType': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2MePut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
 **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2ResourceTypesGet

> scimV2ResourceTypesGet(opts)

Retrieve All SCIM Resource Types

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2ResourceTypesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2ResourceTypesTypeGet

> scimV2ResourceTypesTypeGet(type, opts)

Retrieve Single SCIM Resource Type

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let type = "type_example"; // String | A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2ResourceTypesTypeGet(type, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2SchemasGet

> scimV2SchemasGet(opts)

Retrieve All SCIM Schema Information

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2SchemasGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2SchemasIdGet

> scimV2SchemasIdGet(id, opts)

Retrieve Single SCIM Schema Information

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2SchemasIdGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2ServiceProviderConfigGet

> scimV2ServiceProviderConfigGet(opts)

Retrieve SCIM Provider

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2ServiceProviderConfigGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2TypeGet

> scimV2TypeGet(type, opts)

Retrieve SCIM Resources

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let type = "type_example"; // String | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
let opts = {
  'filter': "filter_example", // String | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
  'attributes': "attributes_example", // String | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
  'excludedAttributes': "excludedAttributes_example", // String | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
  'sortBy': "sortBy_example", // String | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
  'sortOrder': "sortOrder_example", // String | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
  'startIndex': "startIndex_example", // String | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2TypeGet(type, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | 
 **filter** | **String**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] 
 **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
 **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
 **sortBy** | **String**| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] 
 **sortOrder** | **String**| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] 
 **startIndex** | **String**| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2TypeIdGet

> scimV2TypeIdGet(type, id, opts)

Retrieve Single SCIM Resource

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let type = "type_example"; // String | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
let id = "id_example"; // String | The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v.
let opts = {
  'attributes': "attributes_example", // String | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
  'excludedAttributes': "excludedAttributes_example", // String | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2TypeIdGet(type, id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | 
 **id** | **String**| The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. | 
 **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
 **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2UsersGet

> scimV2UsersGet(opts)

Retrieve All Users with SCIM

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'filter': "filter_example", // String | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
  'attributes': "attributes_example", // String | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
  'excludedAttributes': "excludedAttributes_example", // String | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
  'sortBy': "sortBy_example", // String | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
  'sortOrder': "sortOrder_example", // String | Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending.
  'count': "count_example", // String | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
  'startIndex': "startIndex_example", // String | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2UsersGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] 
 **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
 **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
 **sortBy** | **String**| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] 
 **sortOrder** | **String**| Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [optional] 
 **count** | **String**| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] 
 **startIndex** | **String**| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2UsersIdGet

> scimV2UsersIdGet(id, opts)

Retrieve Single User with SCIM

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The id of the user you wish to update.
let opts = {
  'filter': "filter_example", // String | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
  'attributes': "attributes_example", // String | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
  'excludedAttributes': "excludedAttributes_example", // String | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2UsersIdGet(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the user you wish to update. | 
 **filter** | **String**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] 
 **attributes** | **String**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
 **excludedAttributes** | **String**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2UsersIdPut

> scimV2UsersIdPut(id, opts)

Update User with SCIM

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let id = "id_example"; // String | The id of the user you wish to update.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'contentType': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2UsersIdPut(id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the user you wish to update. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## scimV2UsersPost

> scimV2UsersPost(opts)

Create User with SCIM

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/scim+json", // String | 
  'contentType': "application/scim+json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.scimV2UsersPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesCertificateCertIdGet

> servicesCertificateCertIdGet(certId, opts)

Retrieve Signing Certificate

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let certId = "certId_example"; // String | The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesCertificateCertIdGet(certId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certId** | **String**| The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesConfigurationModeActionsDisablePost

> servicesConfigurationModeActionsDisablePost(opts)

Disable Configuration Mode

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "contentType_example", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesConfigurationModeActionsDisablePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesConfigurationModeActionsEnablePost

> servicesConfigurationModeActionsEnablePost(opts)

Enable Configuration Mode

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "contentType_example", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesConfigurationModeActionsEnablePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesDirectdataFilesGet

> servicesDirectdataFilesGet(opts)

Retrieve Available Direct Data Files

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'extractType': "incremental_directdata", // String | The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
  'startTime': 2023-12-07T00:00Z, // Number | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
  'stopTime': 2023-12-08T00:00Z, // Number | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesDirectdataFilesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extractType** | **String**| The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [optional] 
 **startTime** | **Number**| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [optional] 
 **stopTime** | **Number**| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [optional] 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesDirectdataFilesNameGet

> servicesDirectdataFilesNameGet(name, opts)

Download Direct Data File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let name = "name_example"; // String | The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesDirectdataFilesNameGet(name, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingItemsContentItemGet

> servicesFileStagingItemsContentItemGet(item, opts)

Download Item Content

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let item = "item_example"; // String | The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'range': "range_example", // String | Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format `bytes={min}-{max}`. For example, `bytes=0-1000`.
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingItemsContentItemGet(item, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **String**| The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **range** | **String**| Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;. | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingItemsItemDelete

> servicesFileStagingItemsItemDelete(item, opts)

Delete File or Folder

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let item = "item_example"; // String | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
let opts = {
  'recursive': "recursive_example", // String | Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingItemsItemDelete(item, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **String**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
 **recursive** | **String**| Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingItemsItemGet

> servicesFileStagingItemsItemGet(item, opts)

List Items at a Path

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let item = "item_example"; // String | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
let opts = {
  'recursive': "recursive_example", // String | If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
  'limit': "limit_example", // String | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
  'formatResult': "formatResult_example", // String | If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingItemsItemGet(item, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **String**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
 **recursive** | **String**| If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [optional] 
 **limit** | **String**| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] 
 **formatResult** | **String**| If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingItemsItemPut

> servicesFileStagingItemsItemPut(item, opts)

Update Folder or File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let item = "item_example"; // String | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingItemsItemPut(item, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **String**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingItemsPost

> servicesFileStagingItemsPost(opts)

Create Folder or File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentMD5': "contentMD5_example", // String | Optional: The MD5 checksum of the file being uploaded.
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingItemsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentMD5** | **String**| Optional: The MD5 checksum of the file being uploaded. | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingUploadGet

> servicesFileStagingUploadGet(opts)

List Upload Sessions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingUploadGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingUploadPost

> servicesFileStagingUploadPost(opts)

Create Resumable Upload Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingUploadPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingUploadUploadSessionIdDelete

> servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId, opts)

Abort Upload Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let uploadSessionId = "uploadSessionId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingUploadUploadSessionIdGet

> servicesFileStagingUploadUploadSessionIdGet(uploadSessionId, opts)

Get Upload Session Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let uploadSessionId = "uploadSessionId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingUploadUploadSessionIdGet(uploadSessionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingUploadUploadSessionIdPartsGet

> servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionId, opts)

List File Parts Uploaded to Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let uploadSessionId = "uploadSessionId_example"; // String | 
let opts = {
  'limit': "limit_example", // String | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **String**|  | 
 **limit** | **String**| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingUploadUploadSessionIdPost

> servicesFileStagingUploadUploadSessionIdPost(uploadSessionId, opts)

Commit Upload Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let uploadSessionId = "uploadSessionId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingUploadUploadSessionIdPost(uploadSessionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesFileStagingUploadUploadSessionIdPut

> servicesFileStagingUploadUploadSessionIdPut(uploadSessionId, opts)

Upload to a Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let uploadSessionId = "uploadSessionId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/octet-stream", // String | 
  'xVaultAPIFilePartNumber': "xVaultAPIFilePartNumber_example", // String | The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
  'contentMD5': "contentMD5_example", // String | Optional: The MD5 checksum of the file part being uploaded.
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesFileStagingUploadUploadSessionIdPut(uploadSessionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadSessionId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIFilePartNumber** | **String**| The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [optional] 
 **contentMD5** | **String**| Optional: The MD5 checksum of the file part being uploaded. | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesJobsHistoriesGet

> servicesJobsHistoriesGet(opts)

Retrieve Job Histories

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'startDate': "startDate_example", // String | Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
  'endDate': "endDate_example", // String | Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
  'status': "status_example", // String | Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses.
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
  'offset': "offset_example", // String | Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesJobsHistoriesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] 
 **endDate** | **String**| Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] 
 **status** | **String**| Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [optional] 
 **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] 
 **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesJobsJobIdErrorsGet

> servicesJobsJobIdErrorsGet(jobId, opts)

Retrieve Import Bulk Translation File Job Errors

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested import job. This was returned from the Import Bulk Translation File request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesJobsJobIdErrorsGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesJobsJobIdGet

> servicesJobsJobIdGet(jobId, opts)

Retrieve Job Status

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The ID of the job, returned from the original job request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesJobsJobIdGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The ID of the job, returned from the original job request. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesJobsJobIdSummaryGet

> servicesJobsJobIdSummaryGet(jobId, opts)

Retrieve Import Bulk Translation File Job Summary

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested import job. This was returned from the Import Bulk Translation File request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesJobsJobIdSummaryGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesJobsJobIdTasksGet

> servicesJobsJobIdTasksGet(jobId, opts)

Retrieve SDK Job Tasks

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The ID of the SDK job, returned from the original job request.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesJobsJobIdTasksGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The ID of the SDK job, returned from the original job request. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesJobsMonitorsGet

> servicesJobsMonitorsGet(opts)

Retrieve Job Monitors

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'startDate': "startDate_example", // String | Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
  'endDate': "endDate_example", // String | Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
  'status': "status_example", // String | Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses.
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
  'offset': "offset_example", // String | Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesJobsMonitorsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] 
 **endDate** | **String**| Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] 
 **status** | **String**| Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [optional] 
 **limit** | **String**| Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] 
 **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesJobsStartNowJobIdPost

> servicesJobsStartNowJobIdPost(jobId, opts)

Start Job

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The ID of the scheduled job instance to start.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesJobsStartNowJobIdPost(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The ID of the scheduled job instance to start. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesLoaderExtractPost

> servicesLoaderExtractPost(opts)

Extract Data Files

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesLoaderExtractPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesLoaderJobIdTasksTaskIdFailurelogGet

> servicesLoaderJobIdTasksTaskIdFailurelogGet(jobId, taskId, opts)

Retrieve Load Failure Log Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested extract job.
let taskId = "taskId_example"; // String | The id value of the requested extract task.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesLoaderJobIdTasksTaskIdFailurelogGet(jobId, taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested extract job. | 
 **taskId** | **String**| The id value of the requested extract task. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesLoaderJobIdTasksTaskIdResultsGet

> servicesLoaderJobIdTasksTaskIdResultsGet(jobId, taskId, opts)

Retrieve Loader Extract Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested extract job.
let taskId = "taskId_example"; // String | The id value of the requested extract task.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesLoaderJobIdTasksTaskIdResultsGet(jobId, taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested extract job. | 
 **taskId** | **String**| The id value of the requested extract task. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesLoaderJobIdTasksTaskIdResultsRenditionsGet

> servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobId, taskId, opts)

Retrieve Loader Extract Renditions Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested extract job.
let taskId = "taskId_example"; // String | The id value of the requested extract task.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobId, taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested extract job. | 
 **taskId** | **String**| The id value of the requested extract task. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesLoaderJobIdTasksTaskIdSuccesslogGet

> servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobId, taskId, opts)

Retrieve Load Success Log Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The id value of the requested extract job.
let taskId = "taskId_example"; // String | The id value of the requested extract task.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobId, taskId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id value of the requested extract job. | 
 **taskId** | **String**| The id value of the requested extract task. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesLoaderLoadPost

> servicesLoaderLoadPost(opts)

Load Data Objects

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesLoaderLoadPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesPackageActionsValidatePost

> servicesPackageActionsValidatePost(opts)

Validate Package

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesPackageActionsValidatePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesPackagePost

> servicesPackagePost(opts)

Export Package

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesPackagePost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesPackagePut

> servicesPackagePut(opts)

Import Package

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "multipart/form-data", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesPackagePut(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesQueuesGet

> servicesQueuesGet(opts)

Retrieve All Queues

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesQueuesGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesQueuesQueueNameActionsDisableDeliveryPut

> servicesQueuesQueueNameActionsDisableDeliveryPut(queueName, opts)

Disable Delivery

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let queueName = "queueName_example"; // String | The name of a specific Queue.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesQueuesQueueNameActionsDisableDeliveryPut(queueName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **String**| The name of a specific Queue. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesQueuesQueueNameActionsEnableDeliveryPut

> servicesQueuesQueueNameActionsEnableDeliveryPut(queueName, opts)

Enable Delivery

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let queueName = "queueName_example"; // String | The name of a specific Queue.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesQueuesQueueNameActionsEnableDeliveryPut(queueName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **String**| The name of a specific Queue. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesQueuesQueueNameActionsResetPut

> servicesQueuesQueueNameActionsResetPut(queueName, opts)

Reset Queue

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let queueName = "queueName_example"; // String | The name of a specific Queue.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesQueuesQueueNameActionsResetPut(queueName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **String**| The name of a specific Queue. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesQueuesQueueNameGet

> servicesQueuesQueueNameGet(queueName, opts)

Retrieve Queue Status

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let queueName = "queueName_example"; // String | The name of a specific queue. For example, queue__c.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesQueuesQueueNameGet(queueName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **String**| The name of a specific queue. For example, queue__c. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## servicesVobjectVaultPackageVPackageIdActionsValidatePost

> servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId, opts)

Validate Imported Package

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let packageId = "packageId_example"; // String | The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**| The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## sessionDelete

> sessionDelete(opts)

End Session

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | The Vault sessionId to end.
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.sessionDelete(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional] 
 **authorization** | **String**| The Vault sessionId to end. | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## uicodeDistributionsDistributionNameCodeGet

> uicodeDistributionsDistributionNameCodeGet(distributionName, opts)

Download Single Client Code Distribution

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let distributionName = "distributionName_example"; // String | The name attribute of the client code distribution to download.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.uicodeDistributionsDistributionNameCodeGet(distributionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionName** | **String**| The name attribute of the client code distribution to download. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## uicodeDistributionsDistributionNameDelete

> uicodeDistributionsDistributionNameDelete(distributionName, opts)

Delete Single Client Code Distribution

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let distributionName = "distributionName_example"; // String | The name attribute of the client code distribution to delete.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.uicodeDistributionsDistributionNameDelete(distributionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionName** | **String**| The name attribute of the client code distribution to delete. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## uicodeDistributionsDistributionNameGet

> uicodeDistributionsDistributionNameGet(distributionName, opts)

Retrieve Single Client Code Distribution Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let distributionName = "distributionName_example"; // String | The name attribute of the client code distribution to delete.
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.uicodeDistributionsDistributionNameGet(distributionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionName** | **String**| The name attribute of the client code distribution to delete. | 
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## uicodeDistributionsGet

> uicodeDistributionsGet(opts)

Retrieve All Client Code Distribution Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.uicodeDistributionsGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## uicodeDistributionsPost

> uicodeDistributionsPost(opts)

Add or Replace Single Client Code Distribution

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'accept': "application/json", // String | 
  'authorization': "{{sessionId}}", // String | 
  'contentType': "multipart/form-data", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.uicodeDistributionsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectVaultPackageVPackageIdActionsDeployPost

> vobjectVaultPackageVPackageIdActionsDeployPost(packageId, opts)

Deploy Package

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let packageId = "packageId_example"; // String | The id field value of the vault_package__v object record used for deployment. See Import Package.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectVaultPackageVPackageIdActionsDeployPost(packageId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**| The id field value of the vault_package__v object record used for deployment. See Import Package. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectVaultPackageVPackageIdActionsDeployResultsGet

> vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId, opts)

Retrieve Package Deploy Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let packageId = "packageId_example"; // String | The id field value of the vault_package__v object record used for deployment. See Deploy Package.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**| The id field value of the vault_package__v object record used for deployment. See Deploy Package. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet

> vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, opts)

Retrieve Results of Cascade Delete Job

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let jobStatus = "jobStatus_example"; // String | 
let jobId = "jobId_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **jobStatus** | **String**|  | 
 **jobId** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet

> vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, opts)

Retrieve Results of Deep Copy Job

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let jobStatus = "jobStatus_example"; // String | The ID of the job, retrieved from the response of the job request.
let jobId = "jobId_example"; // String | Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **jobStatus** | **String**| The ID of the job, retrieved from the response of the job request. | 
 **jobId** | **String**| Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsEdlItemVActionsCreateplaceholderPost

> vobjectsEdlItemVActionsCreateplaceholderPost(opts)

Create a Placeholder from an EDL Item

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsEdlItemVActionsCreateplaceholderPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsMergesJobIdLogGet

> vobjectsMergesJobIdLogGet(jobId, opts)

Download Merge Records Job Log

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsMergesJobIdLogGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsMergesJobIdResultsGet

> vobjectsMergesJobIdResultsGet(jobId, opts)

Retrieve Record Merge Results

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsMergesJobIdResultsGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsMergesJobIdStatusGet

> vobjectsMergesJobIdStatusGet(jobId, opts)

Retrieve Record Merge Status

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let jobId = "jobId_example"; // String | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsMergesJobIdStatusGet(jobId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameActionsActionNamePost

> vobjectsObjectNameActionsActionNamePost(objectName, actionName, opts)

Initiate Object Action on Multiple Records

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value.
let actionName = "actionName_example"; // String | Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameActionsActionNamePost(objectName, actionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. | 
 **actionName** | **String**| Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameActionsChangetypePost

> vobjectsObjectNameActionsChangetypePost(objectName, opts)

Change Object Type

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The name of the object.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameActionsChangetypePost(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The name of the object. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameActionsMergePost

> vobjectsObjectNameActionsMergePost(objectName, opts)

Initiate Record Merge

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value. For example, account__v. This object must have Enable Merges configured.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/json", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}", // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
  'vobjectsObjectNameActionsMergePostRequestInner': [new VeevaVaultApiV251.VobjectsObjectNameActionsMergePostRequestInner()] // [VobjectsObjectNameActionsMergePostRequestInner] | 
};
apiInstance.vobjectsObjectNameActionsMergePost(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. For example, account__v. This object must have Enable Merges configured. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 
 **vobjectsObjectNameActionsMergePostRequestInner** | [**[VobjectsObjectNameActionsMergePostRequestInner]**](VobjectsObjectNameActionsMergePostRequestInner.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## vobjectsObjectNameActionsRecalculaterollupsGet

> vobjectsObjectNameActionsRecalculaterollupsGet(objectName, opts)

Retrieve Roll-up Field Recalculation Status

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The name of the object for which to check the status of a Roll-up field recalculation.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameActionsRecalculaterollupsGet(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The name of the object for which to check the status of a Roll-up field recalculation. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameActionsRecalculaterollupsPost

> vobjectsObjectNameActionsRecalculaterollupsPost(objectName, opts)

Recalculate Roll-up Fields

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The name of the object for which to check the status of a Roll-up field recalculation.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameActionsRecalculaterollupsPost(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The name of the object for which to check the status of a Roll-up field recalculation. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameActionsUpdatecorporatecurrencyPut

> vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName, opts)

Update Corporate Currency Fields

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameAttachmentsBatchDelete

> vobjectsObjectNameAttachmentsBatchDelete(objectName, opts)

Delete Multiple Object Record Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'idParam': "If you’re identifying attachments in your input by external id, add idParam=external_id__v to the request endpoint.", // String | 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameAttachmentsBatchDelete(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **idParam** | **String**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameAttachmentsBatchPost

> vobjectsObjectNameAttachmentsBatchPost(objectName, opts)

Create Multiple Object Record Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameAttachmentsBatchPost(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameAttachmentsBatchPut

> vobjectsObjectNameAttachmentsBatchPut(objectName, opts)

Update Multiple Object Record Attachment Descriptions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameAttachmentsBatchPut(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameDelete

> vobjectsObjectNameDelete(objectName, opts)

Delete Object Records

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | Can be text/csv or application/json
  'accept': "application/json", // String | Can be text/csv or application/json
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameDelete(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**| Can be text/csv or application/json | [optional] 
 **accept** | **String**| Can be text/csv or application/json | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameIdRolesRoleNameGet

> vobjectsObjectNameIdRolesRoleNameGet(objectName, id, roleName, opts)

Retrieve Object Record Roles

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name.
let id = "id_example"; // String | The id of the document, binder, or object record.
let roleName = "roleName_example"; // String | Optional: Include a role name to filter for a specific role. For example, owner__v.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameIdRolesRoleNameGet(objectName, id, roleName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name. | 
 **id** | **String**| The id of the document, binder, or object record. | 
 **roleName** | **String**| Optional: Include a role name to filter for a specific role. For example, owner__v. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdActionsActionNameGet

> vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectName, objectRecordId, actionName, opts)

Retrieve Object User Actions Details

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value.
let objectRecordId = "objectRecordId_example"; // String | The object record id field value from which to retrieve user actions.
let actionName = "actionName_example"; // String | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectName, objectRecordId, actionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. | 
 **objectRecordId** | **String**| The object record id field value from which to retrieve user actions. | 
 **actionName** | **String**| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdActionsActionNamePost

> vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectName, objectRecordId, actionName, opts)

Initiate Object Action on a Single Record

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value.
let objectRecordId = "objectRecordId_example"; // String | The object record id field value from which to retrieve user actions.
let actionName = "actionName_example"; // String | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "application/x-www-form-urlencoded", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectName, objectRecordId, actionName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. | 
 **objectRecordId** | **String**| The object record id field value from which to retrieve user actions. | 
 **actionName** | **String**| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdActionsCascadedeletePost

> vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectName, objectRecordId, opts)

Cascade Delete Object Record

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdActionsDeepcopyPost

> vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectName, objectRecordId, opts)

Deep Copy Object Record

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdActionsGet

> vobjectsObjectNameObjectRecordIdActionsGet(objectName, objectRecordId, opts)

Retrieve Object Record User Actions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value.
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'loc': true, // Boolean | Optional: When true, retrieves localized (translated) strings for the label. 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdActionsGet(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. | 
 **objectRecordId** | **String**| The object record id field value. | 
 **loc** | **Boolean**| Optional: When true, retrieves localized (translated) strings for the label.  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet

> vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectName, objectRecordId, attachmentFieldName, opts)

Download Attachment Field File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value. For example, product__v.
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentFieldName = "attachmentFieldName_example"; // String | The name of the Attachment field to update.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectName, objectRecordId, attachmentFieldName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. For example, product__v. | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentFieldName** | **String**| The name of the Attachment field to update. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost

> vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectName, objectRecordId, attachmentFieldName, opts)

Update Attachment Field File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value. For example, product__v.
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentFieldName = "attachmentFieldName_example"; // String | The name of the Attachment field to update.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectName, objectRecordId, attachmentFieldName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. For example, product__v. | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentFieldName** | **String**| The name of the Attachment field to update. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet

> vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectName, objectRecordId, opts)

Download All Attachment Field Files

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value. For example, product__v.
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. For example, product__v. | 
 **objectRecordId** | **String**| The object record id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectName, objectRecordId, attachmentId, opts)

Delete Object Record Attachment

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectName, objectRecordId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectName, objectRecordId, attachmentId, opts)

Retrieve Object Record Attachment Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectName, objectRecordId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectName, objectRecordId, attachmentId, opts)

Update Object Record Attachment Description

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectName, objectRecordId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectName, objectRecordId, attachmentId, attachmentVersion, opts)

Delete Object Record Attachment Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | The attachment version__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectName, objectRecordId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**| The attachment version__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectName, objectRecordId, attachmentId, attachmentVersion, opts)

Download Object Record Attachment File

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | 
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectName, objectRecordId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**|  | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectName, objectRecordId, attachmentId, attachmentVersion, opts)

Retrieve Object Record Attachment Version Metadata

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | The attachment version__v field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectName, objectRecordId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**| The attachment version__v field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectName, objectRecordId, attachmentId, attachmentVersion, opts)

Restore Object Record Attachment Version

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let attachmentVersion = "attachmentVersion_example"; // String | The attachment version__v field value.
let opts = {
  'restore': true, // Boolean | 
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectName, objectRecordId, attachmentId, attachmentVersion, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **attachmentVersion** | **String**| The attachment version__v field value. | 
 **restore** | **Boolean**|  | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet

> vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectName, objectRecordId, attachmentId, opts)

Retrieve Object Record Attachment Versions

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let attachmentId = "attachmentId_example"; // String | The attachment id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectName, objectRecordId, attachmentId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **attachmentId** | **String**| The attachment id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsFileGet

> vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectName, objectRecordId, opts)

Download All Object Record Attachment Files

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsGet

> vobjectsObjectNameObjectRecordIdAttachmentsGet(objectName, objectRecordId, opts)

Retrieve Object Record Attachments

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsGet(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAttachmentsPost

> vobjectsObjectNameObjectRecordIdAttachmentsPost(objectName, objectRecordId, opts)

Create Object Record Attachment

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAttachmentsPost(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdAudittrailGet

> vobjectsObjectNameObjectRecordIdAudittrailGet(objectName, objectRecordId, opts)

Retrieve Complete Audit History for a Single Object Record

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value.
let objectRecordId = "objectRecordId_example"; // String | The object record id field value from which to retrieve user actions.
let opts = {
  'startDate': "startDate_example", // String | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date. 
  'endDate': "endDate_example", // String | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
  'formatResult': "formatResult_example", // String | To request a CSV file of your audit history, use csv. 
  'limit': "limit_example", // String | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
  'offset': "offset_example", // String | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
  'events': "events_example", // String | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events=Copy,Edit,Delete. If omitted, defaults to all audit events.
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdAudittrailGet(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value. | 
 **objectRecordId** | **String**| The object record id field value from which to retrieve user actions. | 
 **startDate** | **String**| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  | [optional] 
 **endDate** | **String**| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] 
 **formatResult** | **String**| To request a CSV file of your audit history, use csv.  | [optional] 
 **limit** | **String**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
 **offset** | **String**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
 **events** | **String**| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events. | [optional] 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameObjectRecordIdGet

> vobjectsObjectNameObjectRecordIdGet(objectName, objectRecordId, opts)

Retrieve Object Record

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let objectRecordId = "objectRecordId_example"; // String | The object record id field value.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameObjectRecordIdGet(objectName, objectRecordId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **objectRecordId** | **String**| The object record id field value. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNamePost

> vobjectsObjectNamePost(objectName, opts)

Create &amp; Upsert Object Records

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'idParam': "idParam_example", // String | To upsert object records, add `idParam={field_name}` to the request endpoint. You can use any object field which has `unique` set to `true` in the object metadata. For example, `idParam=external_id__v`.
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | Can be text/csv or application/json
  'accept': "application/json", // String | Can be text/csv or application/json
  'xVaultAPIMigrationMode': true, // Boolean | If set to `true`, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
  'xVaultAPINoTriggers': true, // Boolean | If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNamePost(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **idParam** | **String**| To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;. | [optional] 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**| Can be text/csv or application/json | [optional] 
 **accept** | **String**| Can be text/csv or application/json | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] 
 **xVaultAPINoTriggers** | **Boolean**| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNamePut

> vobjectsObjectNamePut(objectName, opts)

Update Object Records

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The object name__v field value (product__v, country__v, custom_object__c, etc.).
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'contentType': "text/csv", // String | Can be text/csv or application/json
  'accept': "application/json", // String | Can be text/csv or application/json
  'xVaultAPIMigrationMode': true, // Boolean | If set to `true`, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
  'xVaultAPINoTriggers': true, // Boolean | If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNamePut(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
 **authorization** | **String**|  | [optional] 
 **contentType** | **String**| Can be text/csv or application/json | [optional] 
 **accept** | **String**| Can be text/csv or application/json | [optional] 
 **xVaultAPIMigrationMode** | **Boolean**| If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] 
 **xVaultAPINoTriggers** | **Boolean**| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameRolesDelete

> vobjectsObjectNameRolesDelete(objectName, opts)

Remove Users &amp; Groups from Roles on Object Records

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The name of the object where you want to remove roles.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameRolesDelete(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The name of the object where you want to remove roles. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsObjectNameRolesPost

> vobjectsObjectNameRolesPost(objectName, opts)

Assign Users &amp; Groups to Roles on Object Records

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let objectName = "objectName_example"; // String | The name of the object where you want to remove roles.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'contentType': "text/csv", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsObjectNameRolesPost(objectName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectName** | **String**| The name of the object where you want to remove roles. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **contentType** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## vobjectsOutboundPackageVPackageIdDependenciesGet

> vobjectsOutboundPackageVPackageIdDependenciesGet(packageId, opts)

Retrieve Outbound Package Dependencies

### Example

```javascript
import VeevaVaultApiV251 from 'veeva_vault_api_v25_1';

let apiInstance = new VeevaVaultApiV251.DefaultApi();
let packageId = "packageId_example"; // String | The ID of the outbound_package__v record from which to retrieve dependencies.
let opts = {
  'authorization': "{{sessionId}}", // String | 
  'accept': "application/json", // String | 
  'xVaultAPIClientID': "{{clientId}}" // String | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
};
apiInstance.vobjectsOutboundPackageVPackageIdDependenciesGet(packageId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**| The ID of the outbound_package__v record from which to retrieve dependencies. | 
 **authorization** | **String**|  | [optional] 
 **accept** | **String**|  | [optional] 
 **xVaultAPIClientID** | **String**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

