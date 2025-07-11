# DefaultAPI

All URIs are relative to *http://}/api/v25.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DefaultAPI_apiGet**](DefaultAPI.md#DefaultAPI_apiGet) | **GET** /api/ | Retrieve API Versions
[**DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameFilesGet**](DefaultAPI.md#DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameFilesGet) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File
[**DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameGet**](DefaultAPI.md#DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameGet) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL)
[**DefaultAPI_apiMdlExecuteAsyncJobIdResultsGet**](DefaultAPI.md#DefaultAPI_apiMdlExecuteAsyncJobIdResultsGet) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results
[**DefaultAPI_apiMdlExecuteAsyncPost**](DefaultAPI.md#DefaultAPI_apiMdlExecuteAsyncPost) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously
[**DefaultAPI_apiMdlExecutePost**](DefaultAPI.md#DefaultAPI_apiMdlExecutePost) | **POST** /api/mdl/execute | Execute MDL Script
[**DefaultAPI_apiMdlFilesPost**](DefaultAPI.md#DefaultAPI_apiMdlFilesPost) | **POST** /api/mdl/files | Upload Content File
[**DefaultAPI_audittrailAuditTrailTypeGet**](DefaultAPI.md#DefaultAPI_audittrailAuditTrailTypeGet) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details
[**DefaultAPI_authDiscoveryPost**](DefaultAPI.md#DefaultAPI_authDiscoveryPost) | **POST** /auth/discovery | Authentication Type Discovery
[**DefaultAPI_authOauthSessionOathOidcProfileIdPost**](DefaultAPI.md#DefaultAPI_authOauthSessionOathOidcProfileIdPost) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect
[**DefaultAPI_authPost**](DefaultAPI.md#DefaultAPI_authPost) | **POST** /auth | User Name and Password
[**DefaultAPI_codeClassNameDelete**](DefaultAPI.md#DefaultAPI_codeClassNameDelete) | **DELETE** /code/{class_name} | Delete Single Source Code File
[**DefaultAPI_codeClassNameDisablePut**](DefaultAPI.md#DefaultAPI_codeClassNameDisablePut) | **PUT** /code/{class_name}/disable | Disable Vault Extension
[**DefaultAPI_codeClassNameEnablePut**](DefaultAPI.md#DefaultAPI_codeClassNameEnablePut) | **PUT** /code/{class_name}/enable | Enable Vault Extension
[**DefaultAPI_codeClassNameGet**](DefaultAPI.md#DefaultAPI_codeClassNameGet) | **GET** /code/{class_name} | Retrieve Single Source Code File
[**DefaultAPI_codeProfilerGet**](DefaultAPI.md#DefaultAPI_codeProfilerGet) | **GET** /code/profiler | Retrieve All Profiling Sessions
[**DefaultAPI_codeProfilerPost**](DefaultAPI.md#DefaultAPI_codeProfilerPost) | **POST** /code/profiler | Create Profiling Session
[**DefaultAPI_codeProfilerSessionNameActionsEndPost**](DefaultAPI.md#DefaultAPI_codeProfilerSessionNameActionsEndPost) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session
[**DefaultAPI_codeProfilerSessionNameDelete**](DefaultAPI.md#DefaultAPI_codeProfilerSessionNameDelete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session
[**DefaultAPI_codeProfilerSessionNameGet**](DefaultAPI.md#DefaultAPI_codeProfilerSessionNameGet) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session
[**DefaultAPI_codeProfilerSessionNameResultsGet**](DefaultAPI.md#DefaultAPI_codeProfilerSessionNameResultsGet) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results
[**DefaultAPI_codePut**](DefaultAPI.md#DefaultAPI_codePut) | **PUT** /code | Add or Replace Single Source Code File
[**DefaultAPI_compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**](DefaultAPI.md#DefaultAPI_compositesTreesEdlHierarchyOrTemplateActionsListnodesPost) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes
[**DefaultAPI_compositesTreesEdlHierarchyOrTemplateGet**](DefaultAPI.md#DefaultAPI_compositesTreesEdlHierarchyOrTemplateGet) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes
[**DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenGet**](DefaultAPI.md#DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenGet) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node&#39;s Children
[**DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenPut**](DefaultAPI.md#DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenPut) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
[**DefaultAPI_configurationComponentTypeAndRecordNameGet**](DefaultAPI.md#DefaultAPI_configurationComponentTypeAndRecordNameGet) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
[**DefaultAPI_configurationComponentTypeGet**](DefaultAPI.md#DefaultAPI_configurationComponentTypeGet) | **GET** /configuration/{component_type} | Retrieve Component Record Collection
[**DefaultAPI_configurationObjectNameAndObjectTypeGet**](DefaultAPI.md#DefaultAPI_configurationObjectNameAndObjectTypeGet) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
[**DefaultAPI_configurationObjecttypeGet**](DefaultAPI.md#DefaultAPI_configurationObjecttypeGet) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types
[**DefaultAPI_configurationRoleAssignmentRuleDelete**](DefaultAPI.md#DefaultAPI_configurationRoleAssignmentRuleDelete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
[**DefaultAPI_configurationRoleAssignmentRuleGet**](DefaultAPI.md#DefaultAPI_configurationRoleAssignmentRuleGet) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
[**DefaultAPI_configurationRoleAssignmentRulePost**](DefaultAPI.md#DefaultAPI_configurationRoleAssignmentRulePost) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
[**DefaultAPI_configurationRoleAssignmentRulePut**](DefaultAPI.md#DefaultAPI_configurationRoleAssignmentRulePut) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override)
[**DefaultAPI_delegationLoginPost**](DefaultAPI.md#DefaultAPI_delegationLoginPost) | **POST** /delegation/login | Initiate Delegated Session
[**DefaultAPI_delegationVaultsGet**](DefaultAPI.md#DefaultAPI_delegationVaultsGet) | **GET** /delegation/vaults | Retrieve Delegations
[**DefaultAPI_keepAlivePost**](DefaultAPI.md#DefaultAPI_keepAlivePost) | **POST** /keep-alive | Session Keep Alive
[**DefaultAPI_limitsGet**](DefaultAPI.md#DefaultAPI_limitsGet) | **GET** /limits | Retrieve Limits on Objects
[**DefaultAPI_logsApiUsageGet**](DefaultAPI.md#DefaultAPI_logsApiUsageGet) | **GET** /logs/api_usage | Download Daily API Usage
[**DefaultAPI_logsCodeDebugGet**](DefaultAPI.md#DefaultAPI_logsCodeDebugGet) | **GET** /logs/code/debug | Retrieve All Debug Logs
[**DefaultAPI_logsCodeDebugIdActionsResetDelete**](DefaultAPI.md#DefaultAPI_logsCodeDebugIdActionsResetDelete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log
[**DefaultAPI_logsCodeDebugIdActionsResetPost**](DefaultAPI.md#DefaultAPI_logsCodeDebugIdActionsResetPost) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log
[**DefaultAPI_logsCodeDebugIdFilesGet**](DefaultAPI.md#DefaultAPI_logsCodeDebugIdFilesGet) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files
[**DefaultAPI_logsCodeDebugIdGet**](DefaultAPI.md#DefaultAPI_logsCodeDebugIdGet) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log
[**DefaultAPI_logsCodeDebugPost**](DefaultAPI.md#DefaultAPI_logsCodeDebugPost) | **POST** /logs/code/debug | Create Debug Log
[**DefaultAPI_logsCodeRuntimeGet**](DefaultAPI.md#DefaultAPI_logsCodeRuntimeGet) | **GET** /logs/code/runtime | Download SDK Runtime Log
[**DefaultAPI_messagesMessageTypeActionsImportPost**](DefaultAPI.md#DefaultAPI_messagesMessageTypeActionsImportPost) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File
[**DefaultAPI_messagesMessageTypeLanguageLangActionsExportPost**](DefaultAPI.md#DefaultAPI_messagesMessageTypeLanguageLangActionsExportPost) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File
[**DefaultAPI_metadataAudittrailAuditTrailTypeGet**](DefaultAPI.md#DefaultAPI_metadataAudittrailAuditTrailTypeGet) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata
[**DefaultAPI_metadataAudittrailGet**](DefaultAPI.md#DefaultAPI_metadataAudittrailGet) | **GET** /metadata/audittrail | Retrieve Audit Types
[**DefaultAPI_metadataComponentsComponentTypeGet**](DefaultAPI.md#DefaultAPI_metadataComponentsComponentTypeGet) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata
[**DefaultAPI_metadataComponentsGet**](DefaultAPI.md#DefaultAPI_metadataComponentsGet) | **GET** /metadata/components | Retrieve All Component Metadata
[**DefaultAPI_metadataObjectsBindersTemplatesBindernodesGet**](DefaultAPI.md#DefaultAPI_metadataObjectsBindersTemplatesBindernodesGet) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata
[**DefaultAPI_metadataObjectsBindersTemplatesGet**](DefaultAPI.md#DefaultAPI_metadataObjectsBindersTemplatesGet) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata
[**DefaultAPI_metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata
[**DefaultAPI_metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata
[**DefaultAPI_metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata
[**DefaultAPI_metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata
[**DefaultAPI_metadataObjectsDocumentsEventsGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsEventsGet) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes
[**DefaultAPI_metadataObjectsDocumentsLockGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsLockGet) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata
[**DefaultAPI_metadataObjectsDocumentsPropertiesFindCommonPost**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsPropertiesFindCommonPost) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields
[**DefaultAPI_metadataObjectsDocumentsPropertiesGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsPropertiesGet) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields
[**DefaultAPI_metadataObjectsDocumentsTemplatesGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsTemplatesGet) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata
[**DefaultAPI_metadataObjectsDocumentsTypesGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsTypesGet) | **GET** /metadata/objects/documents/types | Retrieve All Document Types
[**DefaultAPI_metadataObjectsDocumentsTypesTypeGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsTypesTypeGet) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type
[**DefaultAPI_metadataObjectsDocumentsTypesTypeRelationshipsGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsTypesTypeRelationshipsGet) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships
[**DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification
[**DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**](DefaultAPI.md#DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype
[**DefaultAPI_metadataObjectsGroupsGet**](DefaultAPI.md#DefaultAPI_metadataObjectsGroupsGet) | **GET** /metadata/objects/groups | Retrieve Group Metadata
[**DefaultAPI_metadataObjectsSecuritypoliciesGet**](DefaultAPI.md#DefaultAPI_metadataObjectsSecuritypoliciesGet) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata
[**DefaultAPI_metadataObjectsUsersGet**](DefaultAPI.md#DefaultAPI_metadataObjectsUsersGet) | **GET** /metadata/objects/users | Retrieve User Metadata
[**DefaultAPI_metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultAPI.md#DefaultAPI_metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata
[**DefaultAPI_metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultAPI.md#DefaultAPI_metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata
[**DefaultAPI_metadataVobjectsGet**](DefaultAPI.md#DefaultAPI_metadataVobjectsGet) | **GET** /metadata/vobjects | Retrieve Object Collection
[**DefaultAPI_metadataVobjectsObjectNameActionsCanceldeploymentPost**](DefaultAPI.md#DefaultAPI_metadataVobjectsObjectNameActionsCanceldeploymentPost) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment
[**DefaultAPI_metadataVobjectsObjectNameFieldsObjectFieldNameGet**](DefaultAPI.md#DefaultAPI_metadataVobjectsObjectNameFieldsObjectFieldNameGet) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata
[**DefaultAPI_metadataVobjectsObjectNameGet**](DefaultAPI.md#DefaultAPI_metadataVobjectsObjectNameGet) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata
[**DefaultAPI_metadataVobjectsObjectNamePageLayoutsGet**](DefaultAPI.md#DefaultAPI_metadataVobjectsObjectNamePageLayoutsGet) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts
[**DefaultAPI_metadataVobjectsObjectNamePageLayoutsLayoutNameGet**](DefaultAPI.md#DefaultAPI_metadataVobjectsObjectNamePageLayoutsLayoutNameGet) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata
[**DefaultAPI_notificationsHistoriesGet**](DefaultAPI.md#DefaultAPI_notificationsHistoriesGet) | **GET** /notifications/histories | Retrieve Email Notification Histories
[**DefaultAPI_objectWorkflowActionsActionGet**](DefaultAPI.md#DefaultAPI_objectWorkflowActionsActionGet) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details
[**DefaultAPI_objectWorkflowActionsActionPost**](DefaultAPI.md#DefaultAPI_objectWorkflowActionsActionPost) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows
[**DefaultAPI_objectWorkflowActionsCanceltasksPost**](DefaultAPI.md#DefaultAPI_objectWorkflowActionsCanceltasksPost) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks
[**DefaultAPI_objectWorkflowActionsCancelworkflowsPost**](DefaultAPI.md#DefaultAPI_objectWorkflowActionsCancelworkflowsPost) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows
[**DefaultAPI_objectWorkflowActionsGet**](DefaultAPI.md#DefaultAPI_objectWorkflowActionsGet) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions
[**DefaultAPI_objectWorkflowActionsReassigntasksPost**](DefaultAPI.md#DefaultAPI_objectWorkflowActionsReassigntasksPost) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks
[**DefaultAPI_objectWorkflowActionsReplaceworkflowownerPost**](DefaultAPI.md#DefaultAPI_objectWorkflowActionsReplaceworkflowownerPost) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner
[**DefaultAPI_objectsBindersActionsExportJobIdResultsGet**](DefaultAPI.md#DefaultAPI_objectsBindersActionsExportJobIdResultsGet) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results
[**DefaultAPI_objectsBindersBinderIdActionsExportPost**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdActionsExportPost) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version)
[**DefaultAPI_objectsBindersBinderIdActionsPost**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdActionsPost) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing
[**DefaultAPI_objectsBindersBinderIdBindingRulePut**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule
[**DefaultAPI_objectsBindersBinderIdDelete**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdDelete) | **DELETE** /objects/binders/{binder_id} | Delete Binder
[**DefaultAPI_objectsBindersBinderIdDocumentsNodeIdBindingRulePut**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdDocumentsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule
[**DefaultAPI_objectsBindersBinderIdDocumentsPost**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdDocumentsPost) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder
[**DefaultAPI_objectsBindersBinderIdDocumentsSectionIdDelete**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdDocumentsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder
[**DefaultAPI_objectsBindersBinderIdDocumentsSectionIdPut**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdDocumentsSectionIdPut) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder
[**DefaultAPI_objectsBindersBinderIdGet**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdGet) | **GET** /objects/binders/{binder_id} | Retrieve Binder
[**DefaultAPI_objectsBindersBinderIdPost**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdPost) | **POST** /objects/binders/{binder_id} | Create Binder Version
[**DefaultAPI_objectsBindersBinderIdPut**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdPut) | **PUT** /objects/binders/{binder_id} | Update Binder
[**DefaultAPI_objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder
[**DefaultAPI_objectsBindersBinderIdSectionsNodeIdBindingRulePut**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdSectionsNodeIdBindingRulePut) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule
[**DefaultAPI_objectsBindersBinderIdSectionsNodeIdPut**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdSectionsNodeIdPut) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section
[**DefaultAPI_objectsBindersBinderIdSectionsPost**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdSectionsPost) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section
[**DefaultAPI_objectsBindersBinderIdSectionsSectionIdDelete**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdSectionsSectionIdDelete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section
[**DefaultAPI_objectsBindersBinderIdSectionsSectionIdGet**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections
[**DefaultAPI_objectsBindersBinderIdVersionsGet**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsGet) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version)
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship
[**DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**](DefaultAPI.md#DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section
[**DefaultAPI_objectsBindersIdRolesGet**](DefaultAPI.md#DefaultAPI_objectsBindersIdRolesGet) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles
[**DefaultAPI_objectsBindersIdRolesPost**](DefaultAPI.md#DefaultAPI_objectsBindersIdRolesPost) | **POST** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder
[**DefaultAPI_objectsBindersIdRolesRoleNameGet**](DefaultAPI.md#DefaultAPI_objectsBindersIdRolesRoleNameGet) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role
[**DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultAPI.md#DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions
[**DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultAPI.md#DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria
[**DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultAPI.md#DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action
[**DefaultAPI_objectsBindersLifecycleActionsPost**](DefaultAPI.md#DefaultAPI_objectsBindersLifecycleActionsPost) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders
[**DefaultAPI_objectsBindersLifecycleActionsUserActionNamePut**](DefaultAPI.md#DefaultAPI_objectsBindersLifecycleActionsUserActionNamePut) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions
[**DefaultAPI_objectsBindersPost**](DefaultAPI.md#DefaultAPI_objectsBindersPost) | **POST** /objects/binders | Create Binder
[**DefaultAPI_objectsBindersTemplatesGet**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesGet) | **GET** /objects/binders/templates | Retrieve Binder Template Collection
[**DefaultAPI_objectsBindersTemplatesPost**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesPost) | **POST** /objects/binders/templates | Create Binder Template
[**DefaultAPI_objectsBindersTemplatesPut**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesPut) | **PUT** /objects/binders/templates | Update Binder Template
[**DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesGet**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesGet) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes
[**DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPost**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPost) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node
[**DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPut**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPut) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes
[**DefaultAPI_objectsBindersTemplatesTemplateNameDelete**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesTemplateNameDelete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template
[**DefaultAPI_objectsBindersTemplatesTemplateNameGet**](DefaultAPI.md#DefaultAPI_objectsBindersTemplatesTemplateNameGet) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes
[**DefaultAPI_objectsDeletionsDocumentsGet**](DefaultAPI.md#DefaultAPI_objectsDeletionsDocumentsGet) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs
[**DefaultAPI_objectsDeletionsVobjectsObjectNameGet**](DefaultAPI.md#DefaultAPI_objectsDeletionsVobjectsObjectNameGet) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID
[**DefaultAPI_objectsDocumentsActionsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsActionsGet) | **GET** /objects/documents/actions | Retrieve All Document Workflows
[**DefaultAPI_objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results
[**DefaultAPI_objectsDocumentsActionsWorkflowNameGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsActionsWorkflowNameGet) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details
[**DefaultAPI_objectsDocumentsActionsWorkflowNamePost**](DefaultAPI.md#DefaultAPI_objectsDocumentsActionsWorkflowNamePost) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow
[**DefaultAPI_objectsDocumentsAnnotationsBatchDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsAnnotationsBatchDelete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations
[**DefaultAPI_objectsDocumentsAnnotationsBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsAnnotationsBatchPost) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations
[**DefaultAPI_objectsDocumentsAnnotationsBatchPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsAnnotationsBatchPut) | **PUT** /objects/documents/annotations/batch | Update Annotations
[**DefaultAPI_objectsDocumentsAnnotationsRepliesBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsAnnotationsRepliesBatchPost) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies
[**DefaultAPI_objectsDocumentsAttachmentsBatchDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsAttachmentsBatchDelete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments
[**DefaultAPI_objectsDocumentsAttachmentsBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsAttachmentsBatchPost) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments
[**DefaultAPI_objectsDocumentsAttachmentsBatchPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsAttachmentsBatchPut) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions
[**DefaultAPI_objectsDocumentsBatchActionsFileextractJobIdResultsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchActionsFileextractJobIdResultsGet) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results
[**DefaultAPI_objectsDocumentsBatchActionsFileextractPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchActionsFileextractPost) | **POST** /objects/documents/batch/actions/fileextract | Export Documents
[**DefaultAPI_objectsDocumentsBatchActionsReclassifyPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchActionsReclassifyPut) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents
[**DefaultAPI_objectsDocumentsBatchActionsRerenderPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchActionsRerenderPost) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions
[**DefaultAPI_objectsDocumentsBatchDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchDelete) | **DELETE** /objects/documents/batch | Delete Multiple Documents
[**DefaultAPI_objectsDocumentsBatchLockDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchLockDelete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout
[**DefaultAPI_objectsDocumentsBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchPost) | **POST** /objects/documents/batch | Create Multiple Documents
[**DefaultAPI_objectsDocumentsBatchPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsBatchPut) | **PUT** /objects/documents/batch | Update Multiple Documents
[**DefaultAPI_objectsDocumentsDocIdAnchorsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAnchorsGet) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs
[**DefaultAPI_objectsDocumentsDocIdAnnotationsFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF
[**DefaultAPI_objectsDocumentsDocIdAnnotationsFilePost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdPut) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version
[**DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions
[**DefaultAPI_objectsDocumentsDocIdAttachmentsFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments
[**DefaultAPI_objectsDocumentsDocIdAttachmentsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsGet) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments
[**DefaultAPI_objectsDocumentsDocIdAttachmentsPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAttachmentsPost) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment
[**DefaultAPI_objectsDocumentsDocIdAudittrailGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdAudittrailGet) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document
[**DefaultAPI_objectsDocumentsDocIdDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdDelete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document
[**DefaultAPI_objectsDocumentsDocIdEventsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdEventsGet) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events
[**DefaultAPI_objectsDocumentsDocIdFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdFileGet) | **GET** /objects/documents/{doc_id}/file | Download Document File
[**DefaultAPI_objectsDocumentsDocIdGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdGet) | **GET** /objects/documents/{doc_id} | Retrieve Document
[**DefaultAPI_objectsDocumentsDocIdLockDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdLockDelete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock
[**DefaultAPI_objectsDocumentsDocIdLockGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdLockGet) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock
[**DefaultAPI_objectsDocumentsDocIdLockPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdLockPost) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock
[**DefaultAPI_objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments
[**DefaultAPI_objectsDocumentsDocIdPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdPost) | **POST** /objects/documents/{doc_id} | Create Single Document Version
[**DefaultAPI_objectsDocumentsDocIdPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdPut) | **PUT** /objects/documents/{doc_id} | Update Single Document
[**DefaultAPI_objectsDocumentsDocIdRenditionsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdRenditionsGet) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions
[**DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition
[**DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File
[**DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition
[**DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePut**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition
[**DefaultAPI_objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document
[**DefaultAPI_objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments
[**DefaultAPI_objectsDocumentsDocIdVersionsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsGet) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition
[**DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File
[**DefaultAPI_objectsDocumentsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsGet) | **GET** /objects/documents | Retrieve All Documents
[**DefaultAPI_objectsDocumentsIdRolesGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsIdRolesGet) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles
[**DefaultAPI_objectsDocumentsIdRolesPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsIdRolesPost) | **POST** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document
[**DefaultAPI_objectsDocumentsIdRolesRoleNameGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsIdRolesRoleNameGet) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role
[**DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions
[**DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria
[**DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action
[**DefaultAPI_objectsDocumentsLifecycleActionsPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsLifecycleActionsPost) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents
[**DefaultAPI_objectsDocumentsLifecycleActionsUserActionNamePut**](DefaultAPI.md#DefaultAPI_objectsDocumentsLifecycleActionsUserActionNamePut) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions
[**DefaultAPI_objectsDocumentsPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsPost) | **POST** /objects/documents | Create Single Document
[**DefaultAPI_objectsDocumentsRelationshipsBatchDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsRelationshipsBatchDelete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships
[**DefaultAPI_objectsDocumentsRelationshipsBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsRelationshipsBatchPost) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships
[**DefaultAPI_objectsDocumentsRenditionsBatchDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsRenditionsBatchDelete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions
[**DefaultAPI_objectsDocumentsRenditionsBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsRenditionsBatchPost) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions
[**DefaultAPI_objectsDocumentsRolesBatchDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsRolesBatchDelete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders
[**DefaultAPI_objectsDocumentsRolesBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsRolesBatchPost) | **POST** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
[**DefaultAPI_objectsDocumentsTemplatesGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsTemplatesGet) | **GET** /objects/documents/templates | Retrieve Document Template Collection
[**DefaultAPI_objectsDocumentsTemplatesPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsTemplatesPost) | **POST** /objects/documents/templates | Create Single Document Template
[**DefaultAPI_objectsDocumentsTemplatesPut**](DefaultAPI.md#DefaultAPI_objectsDocumentsTemplatesPut) | **PUT** /objects/documents/templates | Update Multiple Document Templates
[**DefaultAPI_objectsDocumentsTemplatesTemplateNameDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsTemplatesTemplateNameDelete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template
[**DefaultAPI_objectsDocumentsTemplatesTemplateNameFileGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsTemplatesTemplateNameFileGet) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File
[**DefaultAPI_objectsDocumentsTemplatesTemplateNameGet**](DefaultAPI.md#DefaultAPI_objectsDocumentsTemplatesTemplateNameGet) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes
[**DefaultAPI_objectsDocumentsTemplatesTemplateNamePut**](DefaultAPI.md#DefaultAPI_objectsDocumentsTemplatesTemplateNamePut) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template
[**DefaultAPI_objectsDocumentsTokensPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsTokensPost) | **POST** /objects/documents/tokens | Document Tokens
[**DefaultAPI_objectsDocumentsVersionsBatchActionsFileextractPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsVersionsBatchActionsFileextractPost) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions
[**DefaultAPI_objectsDocumentsVersionsBatchDelete**](DefaultAPI.md#DefaultAPI_objectsDocumentsVersionsBatchDelete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions
[**DefaultAPI_objectsDocumentsVersionsBatchPost**](DefaultAPI.md#DefaultAPI_objectsDocumentsVersionsBatchPost) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions
[**DefaultAPI_objectsDomainGet**](DefaultAPI.md#DefaultAPI_objectsDomainGet) | **GET** /objects/domain | Retrieve Domain Information
[**DefaultAPI_objectsDomainsGet**](DefaultAPI.md#DefaultAPI_objectsDomainsGet) | **GET** /objects/domains | Retrieve Domains
[**DefaultAPI_objectsEdlMatchedDocumentsBatchActionsAddPost**](DefaultAPI.md#DefaultAPI_objectsEdlMatchedDocumentsBatchActionsAddPost) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents
[**DefaultAPI_objectsEdlMatchedDocumentsBatchActionsRemovePost**](DefaultAPI.md#DefaultAPI_objectsEdlMatchedDocumentsBatchActionsRemovePost) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents
[**DefaultAPI_objectsGroupsAutoGet**](DefaultAPI.md#DefaultAPI_objectsGroupsAutoGet) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups
[**DefaultAPI_objectsGroupsGet**](DefaultAPI.md#DefaultAPI_objectsGroupsGet) | **GET** /objects/groups | Retrieve All Groups
[**DefaultAPI_objectsGroupsGroupIdDelete**](DefaultAPI.md#DefaultAPI_objectsGroupsGroupIdDelete) | **DELETE** /objects/groups/{group_id} | Delete Group
[**DefaultAPI_objectsGroupsGroupIdGet**](DefaultAPI.md#DefaultAPI_objectsGroupsGroupIdGet) | **GET** /objects/groups/{group_id} | Retrieve Group
[**DefaultAPI_objectsGroupsGroupIdPut**](DefaultAPI.md#DefaultAPI_objectsGroupsGroupIdPut) | **PUT** /objects/groups/{group_id} | Update Group
[**DefaultAPI_objectsGroupsPost**](DefaultAPI.md#DefaultAPI_objectsGroupsPost) | **POST** /objects/groups | Create Group 
[**DefaultAPI_objectsLicensesGet**](DefaultAPI.md#DefaultAPI_objectsLicensesGet) | **GET** /objects/licenses | Retrieve Application License Usage
[**DefaultAPI_objectsObjectworkflowsActionsGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsActionsGet) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows
[**DefaultAPI_objectsObjectworkflowsActionsWorkflowNameGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsActionsWorkflowNameGet) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details
[**DefaultAPI_objectsObjectworkflowsActionsWorkflowNamePost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsActionsWorkflowNamePost) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow
[**DefaultAPI_objectsObjectworkflowsGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsGet) | **GET** /objects/objectworkflows | Retrieve Workflows
[**DefaultAPI_objectsObjectworkflowsTasksGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksGet) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsAcceptPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsAcceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCancelPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCancelPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCompletePost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsReassignPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsReassignPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsTaskActionGet) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date
[**DefaultAPI_objectsObjectworkflowsTasksTaskIdGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsTasksTaskIdGet) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details
[**DefaultAPI_objectsObjectworkflowsWorkflowIdActionsGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsWorkflowIdActionsGet) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions
[**DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details
[**DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action
[**DefaultAPI_objectsObjectworkflowsWorkflowIdGet**](DefaultAPI.md#DefaultAPI_objectsObjectworkflowsWorkflowIdGet) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details
[**DefaultAPI_objectsPicklistsGet**](DefaultAPI.md#DefaultAPI_objectsPicklistsGet) | **GET** /objects/picklists | Retrieve All Picklists
[**DefaultAPI_objectsPicklistsPicklistNameGet**](DefaultAPI.md#DefaultAPI_objectsPicklistsPicklistNameGet) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values
[**DefaultAPI_objectsPicklistsPicklistNamePicklistValueNameDelete**](DefaultAPI.md#DefaultAPI_objectsPicklistsPicklistNamePicklistValueNameDelete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value
[**DefaultAPI_objectsPicklistsPicklistNamePicklistValueNamePut**](DefaultAPI.md#DefaultAPI_objectsPicklistsPicklistNamePicklistValueNamePut) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value
[**DefaultAPI_objectsPicklistsPicklistNamePost**](DefaultAPI.md#DefaultAPI_objectsPicklistsPicklistNamePost) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values
[**DefaultAPI_objectsPicklistsPicklistNamePut**](DefaultAPI.md#DefaultAPI_objectsPicklistsPicklistNamePut) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label
[**DefaultAPI_objectsSandboxActionsBuildproductionPost**](DefaultAPI.md#DefaultAPI_objectsSandboxActionsBuildproductionPost) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault
[**DefaultAPI_objectsSandboxActionsPromoteproductionPost**](DefaultAPI.md#DefaultAPI_objectsSandboxActionsPromoteproductionPost) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production
[**DefaultAPI_objectsSandboxActionsRecheckusagePost**](DefaultAPI.md#DefaultAPI_objectsSandboxActionsRecheckusagePost) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit
[**DefaultAPI_objectsSandboxBatchChangesizePost**](DefaultAPI.md#DefaultAPI_objectsSandboxBatchChangesizePost) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size
[**DefaultAPI_objectsSandboxEntitlementsSetPost**](DefaultAPI.md#DefaultAPI_objectsSandboxEntitlementsSetPost) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements
[**DefaultAPI_objectsSandboxGet**](DefaultAPI.md#DefaultAPI_objectsSandboxGet) | **GET** /objects/sandbox | Retrieve Sandboxes
[**DefaultAPI_objectsSandboxNameDelete**](DefaultAPI.md#DefaultAPI_objectsSandboxNameDelete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox
[**DefaultAPI_objectsSandboxPost**](DefaultAPI.md#DefaultAPI_objectsSandboxPost) | **POST** /objects/sandbox | Create or Refresh Sandbox
[**DefaultAPI_objectsSandboxSnapshotApiNameActionsUpdatePost**](DefaultAPI.md#DefaultAPI_objectsSandboxSnapshotApiNameActionsUpdatePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot
[**DefaultAPI_objectsSandboxSnapshotApiNameActionsUpgradePost**](DefaultAPI.md#DefaultAPI_objectsSandboxSnapshotApiNameActionsUpgradePost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot
[**DefaultAPI_objectsSandboxSnapshotApiNameDelete**](DefaultAPI.md#DefaultAPI_objectsSandboxSnapshotApiNameDelete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot
[**DefaultAPI_objectsSandboxSnapshotGet**](DefaultAPI.md#DefaultAPI_objectsSandboxSnapshotGet) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots
[**DefaultAPI_objectsSandboxSnapshotPost**](DefaultAPI.md#DefaultAPI_objectsSandboxSnapshotPost) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot
[**DefaultAPI_objectsSandboxVaultIdActionsRefreshPost**](DefaultAPI.md#DefaultAPI_objectsSandboxVaultIdActionsRefreshPost) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot
[**DefaultAPI_objectsSandboxVaultIdGet**](DefaultAPI.md#DefaultAPI_objectsSandboxVaultIdGet) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID
[**DefaultAPI_objectsSecuritypoliciesGet**](DefaultAPI.md#DefaultAPI_objectsSecuritypoliciesGet) | **GET** /objects/securitypolicies | Retrieve All Security Policies
[**DefaultAPI_objectsSecuritypoliciesSecurityPolicyNameGet**](DefaultAPI.md#DefaultAPI_objectsSecuritypoliciesSecurityPolicyNameGet) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy
[**DefaultAPI_objectsUsersGet**](DefaultAPI.md#DefaultAPI_objectsUsersGet) | **GET** /objects/users/ | Retrieve All Users
[**DefaultAPI_objectsUsersIdGet**](DefaultAPI.md#DefaultAPI_objectsUsersIdGet) | **GET** /objects/users/{id} | Retrieve User
[**DefaultAPI_objectsUsersIdPermissionsGet**](DefaultAPI.md#DefaultAPI_objectsUsersIdPermissionsGet) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions
[**DefaultAPI_objectsUsersIdPut**](DefaultAPI.md#DefaultAPI_objectsUsersIdPut) | **PUT** /objects/users/{id} | Update Single User
[**DefaultAPI_objectsUsersMeGet**](DefaultAPI.md#DefaultAPI_objectsUsersMeGet) | **GET** /objects/users/me | Validate Session User
[**DefaultAPI_objectsUsersMePasswordPost**](DefaultAPI.md#DefaultAPI_objectsUsersMePasswordPost) | **POST** /objects/users/me/password | Change My Password
[**DefaultAPI_objectsUsersMePermissionsGet**](DefaultAPI.md#DefaultAPI_objectsUsersMePermissionsGet) | **GET** /objects/users/me/permissions | Retrieve My User Permissions
[**DefaultAPI_objectsUsersMePut**](DefaultAPI.md#DefaultAPI_objectsUsersMePut) | **PUT** /objects/users/me | Update My User
[**DefaultAPI_objectsUsersPost**](DefaultAPI.md#DefaultAPI_objectsUsersPost) | **POST** /objects/users | Create Single User
[**DefaultAPI_objectsUsersPut**](DefaultAPI.md#DefaultAPI_objectsUsersPut) | **PUT** /objects/users | Update Multiple Users
[**DefaultAPI_objectsUsersUserIdDelete**](DefaultAPI.md#DefaultAPI_objectsUsersUserIdDelete) | **DELETE** /objects/users/{user_id} | Disable User
[**DefaultAPI_objectsUsersUserIdVaultMembershipVaultIdPut**](DefaultAPI.md#DefaultAPI_objectsUsersUserIdVaultMembershipVaultIdPut) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership
[**DefaultAPI_objectsVaultActionsComparePost**](DefaultAPI.md#DefaultAPI_objectsVaultActionsComparePost) | **POST** /objects/vault/actions/compare | Vault Compare
[**DefaultAPI_objectsVaultActionsConfigreportPost**](DefaultAPI.md#DefaultAPI_objectsVaultActionsConfigreportPost) | **POST** /objects/vault/actions/configreport | Vault Configuration Report
[**DefaultAPI_queryComponentsPost**](DefaultAPI.md#DefaultAPI_queryComponentsPost) | **POST** /query/components | Component Definition Query
[**DefaultAPI_queryNextPagePost**](DefaultAPI.md#DefaultAPI_queryNextPagePost) | **POST** /query/{next_page} | Next Page URL
[**DefaultAPI_queryPost**](DefaultAPI.md#DefaultAPI_queryPost) | **POST** /query | Submitting a Query
[**DefaultAPI_queryPreviousPagePost**](DefaultAPI.md#DefaultAPI_queryPreviousPagePost) | **POST** /query/{previous_page} | Previous Page URL
[**DefaultAPI_scimV2MeGet**](DefaultAPI.md#DefaultAPI_scimV2MeGet) | **GET** /scim/v2/Me | Retrieve Current User with SCIM
[**DefaultAPI_scimV2MePut**](DefaultAPI.md#DefaultAPI_scimV2MePut) | **PUT** /scim/v2/Me | Update Current User with SCIM
[**DefaultAPI_scimV2ResourceTypesGet**](DefaultAPI.md#DefaultAPI_scimV2ResourceTypesGet) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types
[**DefaultAPI_scimV2ResourceTypesTypeGet**](DefaultAPI.md#DefaultAPI_scimV2ResourceTypesTypeGet) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type
[**DefaultAPI_scimV2SchemasGet**](DefaultAPI.md#DefaultAPI_scimV2SchemasGet) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information
[**DefaultAPI_scimV2SchemasIdGet**](DefaultAPI.md#DefaultAPI_scimV2SchemasIdGet) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information
[**DefaultAPI_scimV2ServiceProviderConfigGet**](DefaultAPI.md#DefaultAPI_scimV2ServiceProviderConfigGet) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider
[**DefaultAPI_scimV2TypeGet**](DefaultAPI.md#DefaultAPI_scimV2TypeGet) | **GET** /scim/v2/{type} | Retrieve SCIM Resources
[**DefaultAPI_scimV2TypeIdGet**](DefaultAPI.md#DefaultAPI_scimV2TypeIdGet) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource
[**DefaultAPI_scimV2UsersGet**](DefaultAPI.md#DefaultAPI_scimV2UsersGet) | **GET** /scim/v2/Users | Retrieve All Users with SCIM
[**DefaultAPI_scimV2UsersIdGet**](DefaultAPI.md#DefaultAPI_scimV2UsersIdGet) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM
[**DefaultAPI_scimV2UsersIdPut**](DefaultAPI.md#DefaultAPI_scimV2UsersIdPut) | **PUT** /scim/v2/Users/{id} | Update User with SCIM
[**DefaultAPI_scimV2UsersPost**](DefaultAPI.md#DefaultAPI_scimV2UsersPost) | **POST** /scim/v2/Users | Create User with SCIM
[**DefaultAPI_servicesCertificateCertIdGet**](DefaultAPI.md#DefaultAPI_servicesCertificateCertIdGet) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate
[**DefaultAPI_servicesConfigurationModeActionsDisablePost**](DefaultAPI.md#DefaultAPI_servicesConfigurationModeActionsDisablePost) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode
[**DefaultAPI_servicesConfigurationModeActionsEnablePost**](DefaultAPI.md#DefaultAPI_servicesConfigurationModeActionsEnablePost) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode
[**DefaultAPI_servicesDirectdataFilesGet**](DefaultAPI.md#DefaultAPI_servicesDirectdataFilesGet) | **GET** /services/directdata/files | Retrieve Available Direct Data Files
[**DefaultAPI_servicesDirectdataFilesNameGet**](DefaultAPI.md#DefaultAPI_servicesDirectdataFilesNameGet) | **GET** /services/directdata/files/{name} | Download Direct Data File
[**DefaultAPI_servicesFileStagingItemsContentItemGet**](DefaultAPI.md#DefaultAPI_servicesFileStagingItemsContentItemGet) | **GET** /services/file_staging/items/content/{item} | Download Item Content
[**DefaultAPI_servicesFileStagingItemsItemDelete**](DefaultAPI.md#DefaultAPI_servicesFileStagingItemsItemDelete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder
[**DefaultAPI_servicesFileStagingItemsItemGet**](DefaultAPI.md#DefaultAPI_servicesFileStagingItemsItemGet) | **GET** /services/file_staging/items/{item} | List Items at a Path
[**DefaultAPI_servicesFileStagingItemsItemPut**](DefaultAPI.md#DefaultAPI_servicesFileStagingItemsItemPut) | **PUT** /services/file_staging/items/{item} | Update Folder or File
[**DefaultAPI_servicesFileStagingItemsPost**](DefaultAPI.md#DefaultAPI_servicesFileStagingItemsPost) | **POST** /services/file_staging/items | Create Folder or File
[**DefaultAPI_servicesFileStagingUploadGet**](DefaultAPI.md#DefaultAPI_servicesFileStagingUploadGet) | **GET** /services/file_staging/upload/ | List Upload Sessions
[**DefaultAPI_servicesFileStagingUploadPost**](DefaultAPI.md#DefaultAPI_servicesFileStagingUploadPost) | **POST** /services/file_staging/upload | Create Resumable Upload Session
[**DefaultAPI_servicesFileStagingUploadUploadSessionIdDelete**](DefaultAPI.md#DefaultAPI_servicesFileStagingUploadUploadSessionIdDelete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session
[**DefaultAPI_servicesFileStagingUploadUploadSessionIdGet**](DefaultAPI.md#DefaultAPI_servicesFileStagingUploadUploadSessionIdGet) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details
[**DefaultAPI_servicesFileStagingUploadUploadSessionIdPartsGet**](DefaultAPI.md#DefaultAPI_servicesFileStagingUploadUploadSessionIdPartsGet) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session
[**DefaultAPI_servicesFileStagingUploadUploadSessionIdPost**](DefaultAPI.md#DefaultAPI_servicesFileStagingUploadUploadSessionIdPost) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session
[**DefaultAPI_servicesFileStagingUploadUploadSessionIdPut**](DefaultAPI.md#DefaultAPI_servicesFileStagingUploadUploadSessionIdPut) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session
[**DefaultAPI_servicesJobsHistoriesGet**](DefaultAPI.md#DefaultAPI_servicesJobsHistoriesGet) | **GET** /services/jobs/histories | Retrieve Job Histories
[**DefaultAPI_servicesJobsJobIdErrorsGet**](DefaultAPI.md#DefaultAPI_servicesJobsJobIdErrorsGet) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors
[**DefaultAPI_servicesJobsJobIdGet**](DefaultAPI.md#DefaultAPI_servicesJobsJobIdGet) | **GET** /services/jobs/{job_id} | Retrieve Job Status
[**DefaultAPI_servicesJobsJobIdSummaryGet**](DefaultAPI.md#DefaultAPI_servicesJobsJobIdSummaryGet) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary
[**DefaultAPI_servicesJobsJobIdTasksGet**](DefaultAPI.md#DefaultAPI_servicesJobsJobIdTasksGet) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks
[**DefaultAPI_servicesJobsMonitorsGet**](DefaultAPI.md#DefaultAPI_servicesJobsMonitorsGet) | **GET** /services/jobs/monitors | Retrieve Job Monitors
[**DefaultAPI_servicesJobsStartNowJobIdPost**](DefaultAPI.md#DefaultAPI_servicesJobsStartNowJobIdPost) | **POST** /services/jobs/start_now/{job_id} | Start Job
[**DefaultAPI_servicesLoaderExtractPost**](DefaultAPI.md#DefaultAPI_servicesLoaderExtractPost) | **POST** /services/loader/extract | Extract Data Files
[**DefaultAPI_servicesLoaderJobIdTasksTaskIdFailurelogGet**](DefaultAPI.md#DefaultAPI_servicesLoaderJobIdTasksTaskIdFailurelogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results
[**DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsGet**](DefaultAPI.md#DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results
[**DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**](DefaultAPI.md#DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsRenditionsGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results
[**DefaultAPI_servicesLoaderJobIdTasksTaskIdSuccesslogGet**](DefaultAPI.md#DefaultAPI_servicesLoaderJobIdTasksTaskIdSuccesslogGet) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results
[**DefaultAPI_servicesLoaderLoadPost**](DefaultAPI.md#DefaultAPI_servicesLoaderLoadPost) | **POST** /services/loader/load | Load Data Objects
[**DefaultAPI_servicesPackageActionsValidatePost**](DefaultAPI.md#DefaultAPI_servicesPackageActionsValidatePost) | **POST** /services/package/actions/validate | Validate Package
[**DefaultAPI_servicesPackagePost**](DefaultAPI.md#DefaultAPI_servicesPackagePost) | **POST** /services/package | Export Package
[**DefaultAPI_servicesPackagePut**](DefaultAPI.md#DefaultAPI_servicesPackagePut) | **PUT** /services/package | Import Package
[**DefaultAPI_servicesQueuesGet**](DefaultAPI.md#DefaultAPI_servicesQueuesGet) | **GET** /services/queues | Retrieve All Queues
[**DefaultAPI_servicesQueuesQueueNameActionsDisableDeliveryPut**](DefaultAPI.md#DefaultAPI_servicesQueuesQueueNameActionsDisableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery
[**DefaultAPI_servicesQueuesQueueNameActionsEnableDeliveryPut**](DefaultAPI.md#DefaultAPI_servicesQueuesQueueNameActionsEnableDeliveryPut) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery
[**DefaultAPI_servicesQueuesQueueNameActionsResetPut**](DefaultAPI.md#DefaultAPI_servicesQueuesQueueNameActionsResetPut) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue
[**DefaultAPI_servicesQueuesQueueNameGet**](DefaultAPI.md#DefaultAPI_servicesQueuesQueueNameGet) | **GET** /services/queues/{queue_name} | Retrieve Queue Status
[**DefaultAPI_servicesVobjectVaultPackageVPackageIdActionsValidatePost**](DefaultAPI.md#DefaultAPI_servicesVobjectVaultPackageVPackageIdActionsValidatePost) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package
[**DefaultAPI_sessionDelete**](DefaultAPI.md#DefaultAPI_sessionDelete) | **DELETE** /session | End Session
[**DefaultAPI_uicodeDistributionsDistributionNameCodeGet**](DefaultAPI.md#DefaultAPI_uicodeDistributionsDistributionNameCodeGet) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution
[**DefaultAPI_uicodeDistributionsDistributionNameDelete**](DefaultAPI.md#DefaultAPI_uicodeDistributionsDistributionNameDelete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution
[**DefaultAPI_uicodeDistributionsDistributionNameGet**](DefaultAPI.md#DefaultAPI_uicodeDistributionsDistributionNameGet) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata
[**DefaultAPI_uicodeDistributionsGet**](DefaultAPI.md#DefaultAPI_uicodeDistributionsGet) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata
[**DefaultAPI_uicodeDistributionsPost**](DefaultAPI.md#DefaultAPI_uicodeDistributionsPost) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution
[**DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployPost**](DefaultAPI.md#DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployPost) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package
[**DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployResultsGet**](DefaultAPI.md#DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployResultsGet) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results
[**DefaultAPI_vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**](DefaultAPI.md#DefaultAPI_vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job
[**DefaultAPI_vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**](DefaultAPI.md#DefaultAPI_vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job
[**DefaultAPI_vobjectsEdlItemVActionsCreateplaceholderPost**](DefaultAPI.md#DefaultAPI_vobjectsEdlItemVActionsCreateplaceholderPost) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item
[**DefaultAPI_vobjectsMergesJobIdLogGet**](DefaultAPI.md#DefaultAPI_vobjectsMergesJobIdLogGet) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log
[**DefaultAPI_vobjectsMergesJobIdResultsGet**](DefaultAPI.md#DefaultAPI_vobjectsMergesJobIdResultsGet) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results
[**DefaultAPI_vobjectsMergesJobIdStatusGet**](DefaultAPI.md#DefaultAPI_vobjectsMergesJobIdStatusGet) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status
[**DefaultAPI_vobjectsObjectNameActionsActionNamePost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameActionsActionNamePost) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records
[**DefaultAPI_vobjectsObjectNameActionsChangetypePost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameActionsChangetypePost) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type
[**DefaultAPI_vobjectsObjectNameActionsMergePost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameActionsMergePost) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge
[**DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsGet) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status
[**DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsPost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsPost) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields
[**DefaultAPI_vobjectsObjectNameActionsUpdatecorporatecurrencyPut**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameActionsUpdatecorporatecurrencyPut) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields
[**DefaultAPI_vobjectsObjectNameAttachmentsBatchDelete**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameAttachmentsBatchDelete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments
[**DefaultAPI_vobjectsObjectNameAttachmentsBatchPost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameAttachmentsBatchPost) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments
[**DefaultAPI_vobjectsObjectNameAttachmentsBatchPut**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameAttachmentsBatchPut) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions
[**DefaultAPI_vobjectsObjectNameDelete**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameDelete) | **DELETE** /vobjects/{object_name} | Delete Object Records
[**DefaultAPI_vobjectsObjectNameIdRolesRoleNameGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameIdRolesRoleNameGet) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles
[**DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNameGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNameGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details
[**DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNamePost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNamePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record
[**DefaultAPI_vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdActionsCascadedeletePost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record
[**DefaultAPI_vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdActionsDeepcopyPost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record
[**DefaultAPI_vobjectsObjectNameObjectRecordIdActionsGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdActionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsFileGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsFileGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsGet) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsPost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsPost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment
[**DefaultAPI_vobjectsObjectNameObjectRecordIdAudittrailGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdAudittrailGet) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record
[**DefaultAPI_vobjectsObjectNameObjectRecordIdGet**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameObjectRecordIdGet) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record
[**DefaultAPI_vobjectsObjectNamePost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNamePost) | **POST** /vobjects/{object_name} | Create &amp; Upsert Object Records
[**DefaultAPI_vobjectsObjectNamePut**](DefaultAPI.md#DefaultAPI_vobjectsObjectNamePut) | **PUT** /vobjects/{object_name} | Update Object Records
[**DefaultAPI_vobjectsObjectNameRolesDelete**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameRolesDelete) | **DELETE** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records
[**DefaultAPI_vobjectsObjectNameRolesPost**](DefaultAPI.md#DefaultAPI_vobjectsObjectNameRolesPost) | **POST** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records
[**DefaultAPI_vobjectsOutboundPackageVPackageIdDependenciesGet**](DefaultAPI.md#DefaultAPI_vobjectsOutboundPackageVPackageIdDependenciesGet) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies


# **DefaultAPI_apiGet**
```c
// Retrieve API Versions
//
void DefaultAPI_apiGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameFilesGet**
```c
// Retrieve Content File
//
void DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameFilesGet(apiClient_t *apiClient, char *component_type_and_record_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**component_type_and_record_name** | **char \*** | The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameGet**
```c
// Retrieve Component Record (MDL)
//
void DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameGet(apiClient_t *apiClient, char *component_type_and_record_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**component_type_and_record_name** | **char \*** | The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_apiMdlExecuteAsyncJobIdResultsGet**
```c
// Retrieve Asynchronous MDL Script Results
//
void DefaultAPI_apiMdlExecuteAsyncJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_apiMdlExecuteAsyncPost**
```c
// Execute MDL Script Asynchronously
//
void DefaultAPI_apiMdlExecuteAsyncPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_apiMdlExecutePost**
```c
// Execute MDL Script
//
void DefaultAPI_apiMdlExecutePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_apiMdlFilesPost**
```c
// Upload Content File
//
void DefaultAPI_apiMdlFilesPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_audittrailAuditTrailTypeGet**
```c
// Retrieve Audit Details
//
void DefaultAPI_audittrailAuditTrailTypeGet(apiClient_t *apiClient, char *audit_trail_type, char *start_date, char *end_date, char *all_dates, char *format_result, char *limit, char *offset, char *objects, char *events, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**audit_trail_type** | **char \*** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. | 
**start_date** | **char \*** | Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] 
**end_date** | **char \*** | Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] 
**all_dates** | **char \*** | Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [optional] 
**format_result** | **char \*** | To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [optional] 
**limit** | **char \*** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
**offset** | **char \*** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
**objects** | **char \*** | This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects. | [optional] 
**events** | **char \*** | This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_authDiscoveryPost**
```c
// Authentication Type Discovery
//
void DefaultAPI_authDiscoveryPost(apiClient_t *apiClient, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_authOauthSessionOathOidcProfileIdPost**
```c
// OAuth 2.0 / OpenID Connect
//
void DefaultAPI_authOauthSessionOathOidcProfileIdPost(apiClient_t *apiClient, char *oath_oidc_profile_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**oath_oidc_profile_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_authPost**
```c
// User Name and Password
//
void DefaultAPI_authPost(apiClient_t *apiClient, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeClassNameDelete**
```c
// Delete Single Source Code File
//
void DefaultAPI_codeClassNameDelete(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**class_name** | **char \*** | The fully qualified class name of your file. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeClassNameDisablePut**
```c
// Disable Vault Extension
//
void DefaultAPI_codeClassNameDisablePut(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**class_name** | **char \*** | The fully qualified class name of your file. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeClassNameEnablePut**
```c
// Enable Vault Extension
//
void DefaultAPI_codeClassNameEnablePut(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**class_name** | **char \*** | The fully qualified class name of your file. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeClassNameGet**
```c
// Retrieve Single Source Code File
//
void DefaultAPI_codeClassNameGet(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**class_name** | **char \*** | The fully qualified class name of your file. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeProfilerGet**
```c
// Retrieve All Profiling Sessions
//
void DefaultAPI_codeProfilerGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeProfilerPost**
```c
// Create Profiling Session
//
void DefaultAPI_codeProfilerPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeProfilerSessionNameActionsEndPost**
```c
// End Profiling Session
//
void DefaultAPI_codeProfilerSessionNameActionsEndPost(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**session_name** | **char \*** | The name of the session, for example,  baseline__c. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeProfilerSessionNameDelete**
```c
// Delete Profiling Session
//
void DefaultAPI_codeProfilerSessionNameDelete(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**session_name** | **char \*** | The name of the session, for example,  baseline__c. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeProfilerSessionNameGet**
```c
// Retrieve Profiling Session
//
void DefaultAPI_codeProfilerSessionNameGet(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**session_name** | **char \*** | The name of the session, for example,  baseline__c. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codeProfilerSessionNameResultsGet**
```c
// Download Profiling Session Results
//
void DefaultAPI_codeProfilerSessionNameResultsGet(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**session_name** | **char \*** | The name of the session, for example,  baseline__c. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_codePut**
```c
// Add or Replace Single Source Code File
//
void DefaultAPI_codePut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_compositesTreesEdlHierarchyOrTemplateActionsListnodesPost**
```c
// Retrieve Specific Root Nodes
//
void DefaultAPI_compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(apiClient_t *apiClient, char *edl_hierarchy_or_template, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**edl_hierarchy_or_template** | **char \*** | Choose to retrieve either edl_hierarchy__v or edl_template__v | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_compositesTreesEdlHierarchyOrTemplateGet**
```c
// Retrieve All Root Nodes
//
void DefaultAPI_compositesTreesEdlHierarchyOrTemplateGet(apiClient_t *apiClient, char *edl_hierarchy_or_template, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**edl_hierarchy_or_template** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenGet**
```c
// Retrieve a Node's Children
//
void DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenGet(apiClient_t *apiClient, char *parent_node_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**parent_node_id** | **char \*** | The ID of a parent node in the hierarchy. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenPut**
```c
// Update Node Order
//
void DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenPut(apiClient_t *apiClient, char *parent_node_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**parent_node_id** | **char \*** | The ID of a parent node in the hierarchy. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationComponentTypeAndRecordNameGet**
```c
// Retrieve Component Record (XML/JSON)
//
void DefaultAPI_configurationComponentTypeAndRecordNameGet(apiClient_t *apiClient, char *component_type_and_record_name, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**component_type_and_record_name** | **char \*** | The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | 
**loc** | **char \*** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationComponentTypeGet**
```c
// Retrieve Component Record Collection
//
void DefaultAPI_configurationComponentTypeGet(apiClient_t *apiClient, char *component_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**component_type** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationObjectNameAndObjectTypeGet**
```c
// Retrieve Details from a Specific Object
//
void DefaultAPI_configurationObjectNameAndObjectTypeGet(apiClient_t *apiClient, char *object_name_and_object_type, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name_and_object_type** | **char \*** | The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;. | 
**loc** | **char \*** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationObjecttypeGet**
```c
// Retrieve Details from All Object Types
//
void DefaultAPI_configurationObjecttypeGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationRoleAssignmentRuleDelete**
```c
// Delete Lifecycle Role Assignment Override Rules
//
void DefaultAPI_configurationRoleAssignmentRuleDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationRoleAssignmentRuleGet**
```c
// Retrieve Lifecycle Role Assignment Rules (Default & Override)
//
void DefaultAPI_configurationRoleAssignmentRuleGet(apiClient_t *apiClient, char *lifecycle__v, char *role__v, char *product__v, char *country__v, char *study__v, char *study_country__v, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**lifecycle__v** | **char \*** | Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c | [optional] 
**role__v** | **char \*** | Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c | [optional] 
**product__v** | **char \*** | Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap | [optional] 
**country__v** | **char \*** | Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States | [optional] 
**study__v** | **char \*** | In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study | [optional] 
**study_country__v** | **char \*** | In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationRoleAssignmentRulePost**
```c
// Create Lifecycle Role Assignment Override Rules
//
void DefaultAPI_configurationRoleAssignmentRulePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_configurationRoleAssignmentRulePut**
```c
// Update Lifecycle Role Assignment Rules (Default & Override)
//
void DefaultAPI_configurationRoleAssignmentRulePut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_delegationLoginPost**
```c
// Initiate Delegated Session
//
void DefaultAPI_delegationLoginPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** | The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_delegationVaultsGet**
```c
// Retrieve Delegations
//
void DefaultAPI_delegationVaultsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_keepAlivePost**
```c
// Session Keep Alive
//
void DefaultAPI_keepAlivePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_limitsGet**
```c
// Retrieve Limits on Objects
//
void DefaultAPI_limitsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsApiUsageGet**
```c
// Download Daily API Usage
//
void DefaultAPI_logsApiUsageGet(apiClient_t *apiClient, char *date, char *log_format, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**date** | **char \*** | The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [optional] 
**log_format** | **char \*** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsCodeDebugGet**
```c
// Retrieve All Debug Logs
//
void DefaultAPI_logsCodeDebugGet(apiClient_t *apiClient, char *user_id, int *include_inactive, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_id** | **char \*** | Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [optional] 
**include_inactive** | **int \*** | Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsCodeDebugIdActionsResetDelete**
```c
// Delete Debug Log
//
void DefaultAPI_logsCodeDebugIdActionsResetDelete(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The ID of the debug log to delete. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsCodeDebugIdActionsResetPost**
```c
// Reset Debug Log
//
void DefaultAPI_logsCodeDebugIdActionsResetPost(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The ID of the debug log to delete. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsCodeDebugIdFilesGet**
```c
// Download Debug Log Files
//
void DefaultAPI_logsCodeDebugIdFilesGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The ID of the debug log to download. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsCodeDebugIdGet**
```c
// Retrieve Single Debug Log
//
void DefaultAPI_logsCodeDebugIdGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The ID of the debug log to retrieve. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsCodeDebugPost**
```c
// Create Debug Log
//
void DefaultAPI_logsCodeDebugPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_logsCodeRuntimeGet**
```c
// Download SDK Runtime Log
//
void DefaultAPI_logsCodeRuntimeGet(apiClient_t *apiClient, char *date, char *log_format, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**date** | **char \*** |  | [optional] 
**log_format** | **char \*** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_messagesMessageTypeActionsImportPost**
```c
// Import Bulk Translation File
//
void DefaultAPI_messagesMessageTypeActionsImportPost(apiClient_t *apiClient, char *message_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**message_type** | **char \*** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_messagesMessageTypeLanguageLangActionsExportPost**
```c
// Export Bulk Translation File
//
void DefaultAPI_messagesMessageTypeLanguageLangActionsExportPost(apiClient_t *apiClient, char *message_type, char *lang, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**message_type** | **char \*** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | 
**lang** | **char \*** | A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataAudittrailAuditTrailTypeGet**
```c
// Retrieve Audit Metadata
//
void DefaultAPI_metadataAudittrailAuditTrailTypeGet(apiClient_t *apiClient, char *audit_trail_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**audit_trail_type** | **char \*** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataAudittrailGet**
```c
// Retrieve Audit Types
//
void DefaultAPI_metadataAudittrailGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataComponentsComponentTypeGet**
```c
// Retrieve Component Type Metadata
//
void DefaultAPI_metadataComponentsComponentTypeGet(apiClient_t *apiClient, char *component_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**component_type** | **char \*** | The component type name (Picklist, Docfield, Doctype, etc.). | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataComponentsGet**
```c
// Retrieve All Component Metadata
//
void DefaultAPI_metadataComponentsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsBindersTemplatesBindernodesGet**
```c
// Retrieve Binder Template Node Metadata
//
void DefaultAPI_metadataObjectsBindersTemplatesBindernodesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsBindersTemplatesGet**
```c
// Retrieve Binder Template Metadata
//
void DefaultAPI_metadataObjectsBindersTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**
```c
// Retrieve Annotation Placemark Type Metadata
//
void DefaultAPI_metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(apiClient_t *apiClient, char *placemark_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**placemark_type** | **char \*** | The name of the placemark type. For example, sticky__sys. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**
```c
// Retrieve Annotation Reference Type Metadata
//
void DefaultAPI_metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(apiClient_t *apiClient, char *reference_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**reference_type** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**
```c
// Retrieve Annotation Type Metadata
//
void DefaultAPI_metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(apiClient_t *apiClient, char *annotation_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**annotation_type** | **char \*** | The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**
```c
// Retrieve Document Event SubType Metadata
//
void DefaultAPI_metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(apiClient_t *apiClient, char *event_type, char *event_subtype, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**event_type** | **char \*** | The event type. For example, distribution__v. | 
**event_subtype** | **char \*** | The event subtype. For example, approved_email__v. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsEventsGet**
```c
// Retrieve Document Event Types and Subtypes
//
void DefaultAPI_metadataObjectsDocumentsEventsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsLockGet**
```c
// Retrieve Document Lock Metadata
//
void DefaultAPI_metadataObjectsDocumentsLockGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsPropertiesFindCommonPost**
```c
// Retrieve Common Document Fields
//
void DefaultAPI_metadataObjectsDocumentsPropertiesFindCommonPost(apiClient_t *apiClient, char *Content_Type, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsPropertiesGet**
```c
// Retrieve All Document Fields
//
void DefaultAPI_metadataObjectsDocumentsPropertiesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsTemplatesGet**
```c
// Retrieve Document Template Metadata
//
void DefaultAPI_metadataObjectsDocumentsTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsTypesGet**
```c
// Retrieve All Document Types
//
void DefaultAPI_metadataObjectsDocumentsTypesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsTypesTypeGet**
```c
// Retrieve Document Type
//
void DefaultAPI_metadataObjectsDocumentsTypesTypeGet(apiClient_t *apiClient, char *type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**type** | **char \*** | The document type. See Retrieve Document Types. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsTypesTypeRelationshipsGet**
```c
// Retrieve Document Type Relationships
//
void DefaultAPI_metadataObjectsDocumentsTypesTypeRelationshipsGet(apiClient_t *apiClient, char *type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**type** | **char \*** | The document type. See Retrieve Document Types. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**
```c
// Retrieve Document Classification
//
void DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(apiClient_t *apiClient, char *type, char *subtype, char *classification, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**type** | **char \*** | The document type. See Retrieve Document Types. | 
**subtype** | **char \*** | The document subtype. See Retrieve Document Types. | 
**classification** | **char \*** | The document classification. See Retrieve Document Types. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**
```c
// Retrieve Document Subtype
//
void DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(apiClient_t *apiClient, char *type, char *subtype, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**type** | **char \*** | The document type. See Retrieve Document Types. | 
**subtype** | **char \*** | The document subtype. See Retrieve Document Types. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsGroupsGet**
```c
// Retrieve Group Metadata
//
void DefaultAPI_metadataObjectsGroupsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsSecuritypoliciesGet**
```c
// Retrieve Security Policy Metadata
//
void DefaultAPI_metadataObjectsSecuritypoliciesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataObjectsUsersGet**
```c
// Retrieve User Metadata
//
void DefaultAPI_metadataObjectsUsersGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**
```c
// Retrieve Archived Document Signature Metadata
//
void DefaultAPI_metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**
```c
// Retrieve Document Signature Metadata
//
void DefaultAPI_metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataVobjectsGet**
```c
// Retrieve Object Collection
//
void DefaultAPI_metadataVobjectsGet(apiClient_t *apiClient, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**loc** | **int \*** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataVobjectsObjectNameActionsCanceldeploymentPost**
```c
// Cancel Raw Object Deployment
//
void DefaultAPI_metadataVobjectsObjectNameActionsCanceldeploymentPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataVobjectsObjectNameFieldsObjectFieldNameGet**
```c
// Retrieve Object Field Metadata
//
void DefaultAPI_metadataVobjectsObjectNameFieldsObjectFieldNameGet(apiClient_t *apiClient, char *object_name, char *object_field_name, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_field_name** | **char \*** | The object field name value (id, name__v, external_id__v, etc.). | 
**loc** | **int \*** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataVobjectsObjectNameGet**
```c
// Retrieve Object Metadata
//
void DefaultAPI_metadataVobjectsObjectNameGet(apiClient_t *apiClient, char *object_name, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**loc** | **int \*** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataVobjectsObjectNamePageLayoutsGet**
```c
// Retrieve Page Layouts
//
void DefaultAPI_metadataVobjectsObjectNamePageLayoutsGet(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_metadataVobjectsObjectNamePageLayoutsLayoutNameGet**
```c
// Retrieve Page Layout Metadata
//
void DefaultAPI_metadataVobjectsObjectNamePageLayoutsLayoutNameGet(apiClient_t *apiClient, char *object_name, char *layout_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The name of the object from which to retrieve page layout metadata. | 
**layout_name** | **char \*** | The name of the page layout from which to retrieve metadata. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_notificationsHistoriesGet**
```c
// Retrieve Email Notification Histories
//
void DefaultAPI_notificationsHistoriesGet(apiClient_t *apiClient, char *start_date, char *end_date, int *all_dates, char *format_result, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char \*** | Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. | [optional] 
**end_date** | **char \*** | Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. | [optional] 
**all_dates** | **int \*** | Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [optional] 
**format_result** | **char \*** | To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [optional] 
**limit** | **char \*** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
**offset** | **char \*** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectWorkflowActionsActionGet**
```c
// Retrieve Bulk Workflow Action Details
//
void DefaultAPI_objectWorkflowActionsActionGet(apiClient_t *apiClient, char *action, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**action** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectWorkflowActionsActionPost**
```c
// Initiate Workflow Actions on Multiple Workflows
//
void DefaultAPI_objectWorkflowActionsActionPost(apiClient_t *apiClient, char *action, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**action** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectWorkflowActionsCanceltasksPost**
```c
// Cancel Workflow Tasks
//
void DefaultAPI_objectWorkflowActionsCanceltasksPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectWorkflowActionsCancelworkflowsPost**
```c
// Cancel Workflows
//
void DefaultAPI_objectWorkflowActionsCancelworkflowsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectWorkflowActionsGet**
```c
// Retrieve Bulk Workflow Actions
//
void DefaultAPI_objectWorkflowActionsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectWorkflowActionsReassigntasksPost**
```c
// Reassign Workflow Tasks
//
void DefaultAPI_objectWorkflowActionsReassigntasksPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectWorkflowActionsReplaceworkflowownerPost**
```c
// Replace Workflow Owner
//
void DefaultAPI_objectWorkflowActionsReplaceworkflowownerPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersActionsExportJobIdResultsGet**
```c
// Retrieve Binder Export Results
//
void DefaultAPI_objectsBindersActionsExportJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested export job. This is returned with the export binder requests above. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdActionsExportPost**
```c
// Export Binder (Latest Version)
//
void DefaultAPI_objectsBindersBinderIdActionsExportPost(apiClient_t *apiClient, char *binder_id, int *source, char *renditiontype, char *docversion, char *attachments, char *_export, int *docfield, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**source** | **int \*** | to include source content or not | [optional] 
**renditiontype** | **char \*** | to include viewable renditions | [optional] 
**docversion** | **char \*** | to include all major versions | [optional] 
**attachments** | **char \*** | to include all versions of attachments | [optional] 
**_export** | **char \*** | configurable filename metadata | [optional] 
**docfield** | **int \*** | to exclude document metadata csv | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdActionsPost**
```c
// Refresh Binder Auto-Filing
//
void DefaultAPI_objectsBindersBinderIdActionsPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdBindingRulePut**
```c
// Update Binding Rule
//
void DefaultAPI_objectsBindersBinderIdBindingRulePut(apiClient_t *apiClient, char *binder_id, char *Content_Type, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdDelete**
```c
// Delete Binder
//
void DefaultAPI_objectsBindersBinderIdDelete(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdDocumentsNodeIdBindingRulePut**
```c
// Update Binder Document Binding Rule
//
void DefaultAPI_objectsBindersBinderIdDocumentsNodeIdBindingRulePut(apiClient_t *apiClient, char *binder_id, char *node_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**node_id** | **char \*** | The binder node id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdDocumentsPost**
```c
// Add Document to Binder
//
void DefaultAPI_objectsBindersBinderIdDocumentsPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdDocumentsSectionIdDelete**
```c
// Remove Document from Binder
//
void DefaultAPI_objectsBindersBinderIdDocumentsSectionIdDelete(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**section_id** | **char \*** | The binder node id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdDocumentsSectionIdPut**
```c
// Move Document in Binder
//
void DefaultAPI_objectsBindersBinderIdDocumentsSectionIdPut(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**section_id** | **char \*** | The binder node id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdGet**
```c
// Retrieve Binder
//
void DefaultAPI_objectsBindersBinderIdGet(apiClient_t *apiClient, char *binder_id, char *depth, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**depth** | **char \*** | To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdPost**
```c
// Create Binder Version
//
void DefaultAPI_objectsBindersBinderIdPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdPut**
```c
// Update Binder
//
void DefaultAPI_objectsBindersBinderIdPut(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**
```c
// Remove Users & Groups from Roles on a Single Binder
//
void DefaultAPI_objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(apiClient_t *apiClient, char *binder_id, char *role_name_and_user_or_group, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The id value of the binder from which to remove roles. | 
**role_name_and_user_or_group** | **char \*** | The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | 
**id** | **char \*** | The id value of the user or group to remove from the role. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdSectionsNodeIdBindingRulePut**
```c
// Update Binder Section Binding Rule
//
void DefaultAPI_objectsBindersBinderIdSectionsNodeIdBindingRulePut(apiClient_t *apiClient, char *binder_id, char *node_id, char *Content_Type, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**node_id** | **char \*** | The binder node id field value. | 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdSectionsNodeIdPut**
```c
// Update Binder Section
//
void DefaultAPI_objectsBindersBinderIdSectionsNodeIdPut(apiClient_t *apiClient, char *binder_id, char *node_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**node_id** | **char \*** | The binder node id of the section. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdSectionsPost**
```c
// Create Binder Section
//
void DefaultAPI_objectsBindersBinderIdSectionsPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdSectionsSectionIdDelete**
```c
// Delete Binder Section
//
void DefaultAPI_objectsBindersBinderIdSectionsSectionIdDelete(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**section_id** | **char \*** | The binder node id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdSectionsSectionIdGet**
```c
// Retrieve Binder Sections
//
void DefaultAPI_objectsBindersBinderIdSectionsSectionIdGet(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**section_id** | **char \*** | The binder node id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsGet**
```c
// Retrieve All Binder Versions
//
void DefaultAPI_objectsBindersBinderIdVersionsGet(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**
```c
// Export Binder (Specific Version)
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, int *source, char *renditiontype, char *docversion, char *attachments, char *_export, int *docfield, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**source** | **int \*** | to include source content or not | [optional] 
**renditiontype** | **char \*** | to include viewable renditions | [optional] 
**docversion** | **char \*** | to include all major versions | [optional] 
**attachments** | **char \*** | to include all versions of attachments | [optional] 
**_export** | **char \*** | configurable filename metadata | [optional] 
**docfield** | **int \*** | to exclude document metadata csv | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**
```c
// Delete Binder Version
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionGet**
```c
// Retrieve Binder Version
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionPut**
```c
// Update Binder Version
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**
```c
// Create Binder Relationship
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**
```c
// Delete Binder Relationship
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**relationship_id** | **char \*** | The binder relationship id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**
```c
// Retrieve Binder Relationship
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**relationship_id** | **char \*** | The binder relationship id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**
```c
// Retrieve Binder Version Section
//
void DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *section_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**binder_id** | **char \*** | The binder id field value. | 
**major_version** | **char \*** | The binder major_version_number__v field value. | 
**minor_version** | **char \*** | The binder minor_version_number__v field value. | 
**section_id** | **char \*** | Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersIdRolesGet**
```c
// Retrieve All Binder Roles
//
void DefaultAPI_objectsBindersIdRolesGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersIdRolesPost**
```c
// Assign Users & Groups to Roles on a Single Binder
//
void DefaultAPI_objectsBindersIdRolesPost(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersIdRolesRoleNameGet**
```c
// Retrieve Document Role
//
void DefaultAPI_objectsBindersIdRolesRoleNameGet(apiClient_t *apiClient, char *id, char *role_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The binder &#x60;id&#x60;. | 
**role_name** | **char \*** | The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**
```c
// Retrieve Binder User Actions
//
void DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The binder id field value from which to retrieve available user actions. | 
**major_version** | **char \*** | The major version number of the binder. | 
**minor_version** | **char \*** | The minor version number of the binder. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**
```c
// Retrieve Binder Entry Criteria
//
void DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The binder id field value from which to retrieve available user actions. | 
**major_version** | **char \*** | The major version number of the binder. | 
**minor_version** | **char \*** | The minor version number of the binder. | 
**name__v** | **char \*** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**
```c
// Initiate Binder User Action
//
void DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The binder id field value from which to retrieve available user actions. | 
**major_version** | **char \*** | The major version number of the binder. | 
**minor_version** | **char \*** | The minor version number of the binder. | 
**name__v** | **char \*** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersLifecycleActionsPost**
```c
// Retrieve User Actions on Multiple Binders
//
void DefaultAPI_objectsBindersLifecycleActionsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersLifecycleActionsUserActionNamePut**
```c
// Initiate Bulk Binder User Actions
//
void DefaultAPI_objectsBindersLifecycleActionsUserActionNamePut(apiClient_t *apiClient, char *user_action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_action_name** | **char \*** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersPost**
```c
// Create Binder
//
void DefaultAPI_objectsBindersPost(apiClient_t *apiClient, int *async, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**async** | **int \*** | When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesGet**
```c
// Retrieve Binder Template Collection
//
void DefaultAPI_objectsBindersTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesPost**
```c
// Create Binder Template
//
void DefaultAPI_objectsBindersTemplatesPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesPut**
```c
// Update Binder Template
//
void DefaultAPI_objectsBindersTemplatesPut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesGet**
```c
// Retrieve Binder Template Node Attributes
//
void DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The binder template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPost**
```c
// Create Binder Template Node
//
void DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPost(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The binder template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPut**
```c
// Replace Binder Template Nodes
//
void DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPut(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The binder template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesTemplateNameDelete**
```c
// Delete Binder Template
//
void DefaultAPI_objectsBindersTemplatesTemplateNameDelete(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The binder template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsBindersTemplatesTemplateNameGet**
```c
// Retrieve Binder Template Attributes
//
void DefaultAPI_objectsBindersTemplatesTemplateNameGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The binder template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDeletionsDocumentsGet**
```c
// Retrieve Deleted Document IDs
//
void DefaultAPI_objectsDeletionsDocumentsGet(apiClient_t *apiClient, char *start_date, char *end_date, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char \*** | Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional] 
**end_date** | **char \*** | Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDeletionsVobjectsObjectNameGet**
```c
// Retrieve Deleted Object Record ID
//
void DefaultAPI_objectsDeletionsVobjectsObjectNameGet(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsActionsGet**
```c
// Retrieve All Document Workflows
//
void DefaultAPI_objectsDocumentsActionsGet(apiClient_t *apiClient, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**loc** | **int \*** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**
```c
// Download Controlled Copy Job Results
//
void DefaultAPI_objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(apiClient_t *apiClient, char *lifecycle_and_state_and_action, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**lifecycle_and_state_and_action** | **char \*** | The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link. | 
**job_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsActionsWorkflowNameGet**
```c
// Retrieve Document Workflow Details
//
void DefaultAPI_objectsDocumentsActionsWorkflowNameGet(apiClient_t *apiClient, char *workflow_name, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_name** | **char \*** | The document workflow name value. | 
**loc** | **int \*** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsActionsWorkflowNamePost**
```c
// Initiate Document Workflow
//
void DefaultAPI_objectsDocumentsActionsWorkflowNamePost(apiClient_t *apiClient, char *workflow_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_name** | **char \*** | The document workflow name value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsAnnotationsBatchDelete**
```c
// Delete Annotations
//
void DefaultAPI_objectsDocumentsAnnotationsBatchDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsAnnotationsBatchPost**
```c
// Create Multiple Annotations
//
void DefaultAPI_objectsDocumentsAnnotationsBatchPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | 
**Content_Type** | **char \*** |  | 
**Accept** | **char \*** |  | 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsAnnotationsBatchPut**
```c
// Update Annotations
//
void DefaultAPI_objectsDocumentsAnnotationsBatchPut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsAnnotationsRepliesBatchPost**
```c
// Add Annotation Replies
//
void DefaultAPI_objectsDocumentsAnnotationsRepliesBatchPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsAttachmentsBatchDelete**
```c
// Delete Multiple Document Attachments
//
void DefaultAPI_objectsDocumentsAttachmentsBatchDelete(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsAttachmentsBatchPost**
```c
// Create Multiple Document Attachments
//
void DefaultAPI_objectsDocumentsAttachmentsBatchPost(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsAttachmentsBatchPut**
```c
// Update Multiple Document Attachment Descriptions
//
void DefaultAPI_objectsDocumentsAttachmentsBatchPut(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchActionsFileextractJobIdResultsGet**
```c
// Retrieve Document Export Results
//
void DefaultAPI_objectsDocumentsBatchActionsFileextractJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested export job. This is returned with the export document requests. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchActionsFileextractPost**
```c
// Export Documents
//
void DefaultAPI_objectsDocumentsBatchActionsFileextractPost(apiClient_t *apiClient, int *source, int *renditions, int *allversions, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**source** | **int \*** | Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] 
**renditions** | **int \*** | Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] 
**allversions** | **int \*** | Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchActionsReclassifyPut**
```c
// Reclassify Multiple Documents
//
void DefaultAPI_objectsDocumentsBatchActionsReclassifyPut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchActionsRerenderPost**
```c
// Update Multiple Document Renditions
//
void DefaultAPI_objectsDocumentsBatchActionsRerenderPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchDelete**
```c
// Delete Multiple Documents
//
void DefaultAPI_objectsDocumentsBatchDelete(apiClient_t *apiClient, char *idParam, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**idParam** | **char \*** | If you’re identifying documents in your input by their external ID | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchLockDelete**
```c
// Undo Collaborative Authoring Checkout
//
void DefaultAPI_objectsDocumentsBatchLockDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchPost**
```c
// Create Multiple Documents
//
void DefaultAPI_objectsDocumentsBatchPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsBatchPut**
```c
// Update Multiple Documents
//
void DefaultAPI_objectsDocumentsBatchPut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAnchorsGet**
```c
// Retrieve Anchor IDs
//
void DefaultAPI_objectsDocumentsDocIdAnchorsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAnnotationsFileGet**
```c
// Export Document Annotations to PDF
//
void DefaultAPI_objectsDocumentsDocIdAnnotationsFileGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAnnotationsFilePost**
```c
// Import Document Annotations from PDF
//
void DefaultAPI_objectsDocumentsDocIdAnnotationsFilePost(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdDelete**
```c
// Delete Single Document Attachment
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdDelete(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdFileGet**
```c
// Download Document Attachment
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdGet**
```c
// Retrieve Document Attachment Metadata
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdPut**
```c
// Update Document Attachment Description
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdPut(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**
```c
// Delete Single Document Attachment Version
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** | The attachment version__v field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
```c
// Download Document Attachment Version
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** | The attachment version__v field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**
```c
// Retrieve Document Attachment Version Metadata
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** | The attachment version__v field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**
```c
// Restore Document Attachment Version
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, int *restore, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** | The attachment version__v field value. | 
**restore** | **int \*** | The parameter restore must be set to true.  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**
```c
// Retrieve Document Attachment Versions
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsFileGet**
```c
// Download All Document Attachments
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsFileGet(apiClient_t *apiClient, char *doc_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsGet**
```c
// Retrieve Document Attachments
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsGet(apiClient_t *apiClient, char *doc_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAttachmentsPost**
```c
// Create Document Attachment
//
void DefaultAPI_objectsDocumentsDocIdAttachmentsPost(apiClient_t *apiClient, char *doc_id, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdAudittrailGet**
```c
// Retrieve Complete Audit History for a Single Document
//
void DefaultAPI_objectsDocumentsDocIdAudittrailGet(apiClient_t *apiClient, char *doc_id, char *start_date, char *end_date, char *format_result, char *limit, char *offset, char *events, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document ID for which to retrieve audit history. | 
**start_date** | **char \*** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  | [optional] 
**end_date** | **char \*** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] 
**format_result** | **char \*** | To request a CSV file of your audit history, use csv.  | [optional] 
**limit** | **char \*** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
**offset** | **char \*** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
**events** | **char \*** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdDelete**
```c
// Delete Single Document
//
void DefaultAPI_objectsDocumentsDocIdDelete(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdEventsGet**
```c
// Retrieve Document Events
//
void DefaultAPI_objectsDocumentsDocIdEventsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdFileGet**
```c
// Download Document File
//
void DefaultAPI_objectsDocumentsDocIdFileGet(apiClient_t *apiClient, char *doc_id, int *lockDocument, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**lockDocument** | **int \*** | Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [optional] 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdGet**
```c
// Retrieve Document
//
void DefaultAPI_objectsDocumentsDocIdGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdLockDelete**
```c
// Delete Document Lock
//
void DefaultAPI_objectsDocumentsDocIdLockDelete(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdLockGet**
```c
// Retrieve Document Lock
//
void DefaultAPI_objectsDocumentsDocIdLockGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdLockPost**
```c
// Create Document Lock
//
void DefaultAPI_objectsDocumentsDocIdLockPost(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**
```c
// Download All Document Version Attachments
//
void DefaultAPI_objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdPost**
```c
// Create Single Document Version
//
void DefaultAPI_objectsDocumentsDocIdPost(apiClient_t *apiClient, char *doc_id, char *suppressRendition, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**suppressRendition** | **char \*** | Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdPut**
```c
// Update Single Document
//
void DefaultAPI_objectsDocumentsDocIdPut(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdRenditionsGet**
```c
// Retrieve Document Renditions
//
void DefaultAPI_objectsDocumentsDocIdRenditionsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeDelete**
```c
// Delete Single Document Rendition
//
void DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeDelete(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeGet**
```c
// Download Document Rendition File
//
void DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeGet(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *steadyState, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**steadyState** | **char \*** | Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePost**
```c
// Add Single Document Rendition
//
void DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePost(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *Authorization, char *Accept, char *Content Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePut**
```c
// Replace Document Rendition
//
void DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePut(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**
```c
// Remove Users & Groups from Roles on a Single Document
//
void DefaultAPI_objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(apiClient_t *apiClient, char *doc_id, char *role_name_and_user_or_group, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The id value of the document from which to remove roles. | 
**role_name_and_user_or_group** | **char \*** | The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | 
**id** | **char \*** | The id value of the user or group to remove from the role. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**
```c
// Retrieve Document Version Attachments
//
void DefaultAPI_objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsGet**
```c
// Retrieve Document Versions
//
void DefaultAPI_objectsDocumentsDocIdVersionsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**
```c
// Read Annotations by ID
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *annotation_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**annotation_id** | **char \*** | The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**
```c
// Read Replies of Parent Annotation
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *annotation_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**annotation_id** | **char \*** | The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**
```c
// Export Document Version Annotations to PDF
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**
```c
// Import Document Version Annotations from PDF
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**
```c
// Read Annotations by Document Version and Type
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *limit, char *offset, char *annotation_types, char *pagination_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**limit** | **char \*** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [optional] 
**offset** | **char \*** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201. | [optional] 
**annotation_types** | **char \*** | The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;  | [optional] 
**pagination_id** | **char \*** | A unique identifier used to load requests with paginated results. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
```c
// Download Document Version Attachment Version
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**attachment_id** | **char \*** | The id field value of the attachment. | 
**attachment_version** | **char \*** | The version of the attachment. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**
```c
// Retrieve Document Version Attachment Versions
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**attachment_id** | **char \*** | The id of the document attachment to retrieve. | 
**attachment_version** | **char \*** | Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**
```c
// Delete Single Document Version
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**
```c
// Retrieve Document Version Notes as CSV
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**
```c
// Create Document Event
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**
```c
// Retrieve Video Annotations
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The video document id field value. | 
**major_version** | **char \*** | The video document major_version_number__v field value. | 
**minor_version** | **char \*** | The video document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** | This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;. | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**
```c
// Download Document Version File
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**
```c
// Retrieve Document Version
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**
```c
// Update Document Version
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**
```c
// Retrieve Document Relationships
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**
```c
// Create Single Document Relationship
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**
```c
// Delete Single Document Relationship
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**relationship_id** | **char \*** | The relationship id field value. See Retrieve Document Relationships. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**
```c
// Retrieve Document Relationship
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**relationship_id** | **char \*** | The relationship id field value. See Retrieve Document Relationships. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**
```c
// Retrieve Document Version Renditions
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**
```c
// Delete Document Version Rendition
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**
```c
// Download Document Version Rendition File
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**
```c
// Upload Document Version Rendition
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**
```c
// Replace Document Version Rendition
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**rendition_type** | **char \*** | The document rendition type. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**
```c
// Download Document Version Thumbnail File
//
void DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**doc_id** | **char \*** | The document id field value. | 
**major_version** | **char \*** | The document major_version_number__v field value. | 
**minor_version** | **char \*** | The document minor_version_number__v field value. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsGet**
```c
// Retrieve All Documents
//
void DefaultAPI_objectsDocumentsGet(apiClient_t *apiClient, char *named_filter, char *scope, char *versionscope, char *search, char *limit, char *sort, char *start, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**named_filter** | **char \*** | Retrieves only documents which you have created. | [optional] 
**scope** | **char \*** | Searches only within the document content. | [optional] 
**versionscope** | **char \*** | Retrieves all document versions, rather than only the latest version. | [optional] 
**search** | **char \*** | Search for documents based on a {keyword} in searchable document fields. | [optional] 
**limit** | **char \*** | See VQL documentation for more information. | [optional] 
**sort** | **char \*** | See VQL documentation for more information. | [optional] 
**start** | **char \*** | See VQL documentation for more information. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsIdRolesGet**
```c
// Retrieve All Document Roles
//
void DefaultAPI_objectsDocumentsIdRolesGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsIdRolesPost**
```c
// Assign Users & Groups to Roles on a Single Document
//
void DefaultAPI_objectsDocumentsIdRolesPost(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsIdRolesRoleNameGet**
```c
// Retrieve Document Role
//
void DefaultAPI_objectsDocumentsIdRolesRoleNameGet(apiClient_t *apiClient, char *id, char *role_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The document &#x60;id&#x60;. | 
**role_name** | **char \*** | The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**
```c
// Retrieve Document User Actions
//
void DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The document id field value from which to retrieve available user actions. | 
**major_version** | **char \*** | The major version number of the document. | 
**minor_version** | **char \*** | The minor version number of the document. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**
```c
// Retrieve Document Entry Criteria
//
void DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The document id field value from which to retrieve available user actions. | 
**major_version** | **char \*** | The major version number of the document. | 
**minor_version** | **char \*** | The minor version number of the document. | 
**name__v** | **char \*** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**
```c
// Initiate Document User Action
//
void DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The document id field value from which to retrieve available user actions. | 
**major_version** | **char \*** | The major version number of the document. | 
**minor_version** | **char \*** | The minor version number of the document. | 
**name__v** | **char \*** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsLifecycleActionsPost**
```c
// Retrieve User Actions on Multiple Documents
//
void DefaultAPI_objectsDocumentsLifecycleActionsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsLifecycleActionsUserActionNamePut**
```c
// Initiate Bulk Document User Actions
//
void DefaultAPI_objectsDocumentsLifecycleActionsUserActionNamePut(apiClient_t *apiClient, char *user_action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_action_name** | **char \*** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsPost**
```c
// Create Single Document
//
void DefaultAPI_objectsDocumentsPost(apiClient_t *apiClient, char *Authorization, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsRelationshipsBatchDelete**
```c
// Delete Multiple Document Relationships
//
void DefaultAPI_objectsDocumentsRelationshipsBatchDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsRelationshipsBatchPost**
```c
// Create Multiple Document Relationships
//
void DefaultAPI_objectsDocumentsRelationshipsBatchPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsRenditionsBatchDelete**
```c
// Delete Multiple Document Renditions
//
void DefaultAPI_objectsDocumentsRenditionsBatchDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsRenditionsBatchPost**
```c
// Add Multiple Document Renditions
//
void DefaultAPI_objectsDocumentsRenditionsBatchPost(apiClient_t *apiClient, char *idParam, char *largeSizeAsset, char *Authorization, char *Accept, char *Content_Type, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**idParam** | **char \*** | If you’re identifying documents in your input by their external ID | [optional] 
**largeSizeAsset** | **char \*** | If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsRolesBatchDelete**
```c
// Remove Users and Groups from Roles on Multiple Documents & Binders
//
void DefaultAPI_objectsDocumentsRolesBatchDelete(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsRolesBatchPost**
```c
// Assign Users & Groups to Roles on Multiple Documents & Binders
//
void DefaultAPI_objectsDocumentsRolesBatchPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTemplatesGet**
```c
// Retrieve Document Template Collection
//
void DefaultAPI_objectsDocumentsTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTemplatesPost**
```c
// Create Single Document Template
//
void DefaultAPI_objectsDocumentsTemplatesPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTemplatesPut**
```c
// Update Multiple Document Templates
//
void DefaultAPI_objectsDocumentsTemplatesPut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTemplatesTemplateNameDelete**
```c
// Delete Basic Document Template
//
void DefaultAPI_objectsDocumentsTemplatesTemplateNameDelete(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The document template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTemplatesTemplateNameFileGet**
```c
// Download Document Template File
//
void DefaultAPI_objectsDocumentsTemplatesTemplateNameFileGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The document template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTemplatesTemplateNameGet**
```c
// Retrieve Document Template Attributes
//
void DefaultAPI_objectsDocumentsTemplatesTemplateNameGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The document template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTemplatesTemplateNamePut**
```c
// Update Single Document Template
//
void DefaultAPI_objectsDocumentsTemplatesTemplateNamePut(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**template_name** | **char \*** | The document template name__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsTokensPost**
```c
// Document Tokens
//
void DefaultAPI_objectsDocumentsTokensPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsVersionsBatchActionsFileextractPost**
```c
// Export Document Versions
//
void DefaultAPI_objectsDocumentsVersionsBatchActionsFileextractPost(apiClient_t *apiClient, int *source, int *renditions, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**source** | **int \*** | Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] 
**renditions** | **int \*** | Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsVersionsBatchDelete**
```c
// Delete Multiple Document Versions
//
void DefaultAPI_objectsDocumentsVersionsBatchDelete(apiClient_t *apiClient, char *idParam, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**idParam** | **char \*** | If you’re identifying documents in your input by their external ID | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDocumentsVersionsBatchPost**
```c
// Create Multiple Document Versions
//
void DefaultAPI_objectsDocumentsVersionsBatchPost(apiClient_t *apiClient, char *idParam, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**idParam** | **char \*** | If you’re identifying documents in your input by their external ID | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_MigrationMode** | **char \*** | Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDomainGet**
```c
// Retrieve Domain Information
//
void DefaultAPI_objectsDomainGet(apiClient_t *apiClient, int *include_application, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**include_application** | **int \*** | To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsDomainsGet**
```c
// Retrieve Domains
//
void DefaultAPI_objectsDomainsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsEdlMatchedDocumentsBatchActionsAddPost**
```c
// Add EDL Matched Documents
//
void DefaultAPI_objectsEdlMatchedDocumentsBatchActionsAddPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsEdlMatchedDocumentsBatchActionsRemovePost**
```c
// Remove EDL Matched Documents
//
void DefaultAPI_objectsEdlMatchedDocumentsBatchActionsRemovePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsGroupsAutoGet**
```c
// Retrieve Auto Managed Groups
//
void DefaultAPI_objectsGroupsAutoGet(apiClient_t *apiClient, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **char \*** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  | [optional] 
**offset** | **char \*** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsGroupsGet**
```c
// Retrieve All Groups
//
void DefaultAPI_objectsGroupsGet(apiClient_t *apiClient, char *includeImplied, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**includeImplied** | **char \*** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsGroupsGroupIdDelete**
```c
// Delete Group
//
void DefaultAPI_objectsGroupsGroupIdDelete(apiClient_t *apiClient, char *group_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**group_id** | **char \*** | The group id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsGroupsGroupIdGet**
```c
// Retrieve Group
//
void DefaultAPI_objectsGroupsGroupIdGet(apiClient_t *apiClient, char *group_id, int *includeImplied, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**group_id** | **char \*** | The group id field value. | 
**includeImplied** | **int \*** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsGroupsGroupIdPut**
```c
// Update Group
//
void DefaultAPI_objectsGroupsGroupIdPut(apiClient_t *apiClient, char *group_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**group_id** | **char \*** | The group id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsGroupsPost**
```c
// Create Group 
//
void DefaultAPI_objectsGroupsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsLicensesGet**
```c
// Retrieve Application License Usage
//
void DefaultAPI_objectsLicensesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsActionsGet**
```c
// Retrieve All Multi-Record Workflows
//
void DefaultAPI_objectsObjectworkflowsActionsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsActionsWorkflowNameGet**
```c
// Retrieve Multi-Record Workflow Details
//
void DefaultAPI_objectsObjectworkflowsActionsWorkflowNameGet(apiClient_t *apiClient, char *workflow_name, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_name** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsActionsWorkflowNamePost**
```c
// Initiate Multi-Record Workflow
//
void DefaultAPI_objectsObjectworkflowsActionsWorkflowNamePost(apiClient_t *apiClient, char *workflow_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_name** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsGet**
```c
// Retrieve Workflows
//
void DefaultAPI_objectsObjectworkflowsGet(apiClient_t *apiClient, char *object__v, char *record_id__v, char *participant, char *status__v, char *offset, char *page_size, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object__v** | **char \*** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] 
**record_id__v** | **char \*** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] 
**participant** | **char \*** | To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] 
**status__v** | **char \*** | To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v | [optional] 
**offset** | **char \*** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] 
**page_size** | **char \*** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] 
**loc** | **char \*** | When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksGet**
```c
// Retrieve Workflow Tasks
//
void DefaultAPI_objectsObjectworkflowsTasksGet(apiClient_t *apiClient, char *object__v, char *record_id__v, char *assignee__v, char *status__v, char *offset, char *page_size, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object__v** | **char \*** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] 
**record_id__v** | **char \*** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] 
**assignee__v** | **char \*** | To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] 
**status__v** | **char \*** | To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.  | [optional] 
**offset** | **char \*** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] 
**page_size** | **char \*** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] 
**loc** | **char \*** | When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsAcceptPost**
```c
// Accept Single Record Workflow Task
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsAcceptPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCancelPost**
```c
// Cancel Workflow Task
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCancelPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCompletePost**
```c
// Complete Single Record Workflow Task
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCompletePost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsGet**
```c
// Retrieve Workflow Task Actions
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsGet(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**
```c
// Accept Multi-item Workflow Task
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**
```c
// Complete Multi-item Workflow Task
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**
```c
// Manage Multi-Item Workflow Content
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**
```c
// Reassign Multi-item Workflow Task
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The id of the task to reassign. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsReassignPost**
```c
// Reassign Single Record Workflow Task
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsReassignPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The id of the task to reassign. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsTaskActionGet**
```c
// Retrieve Workflow Task Action Details
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(apiClient_t *apiClient, char *task_id, char *task_action, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**task_action** | **char \*** | The name of the task action retrieved from Retrieve Workflow Task Actions. | 
**loc** | **char \*** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**
```c
// Undo Workflow Task Acceptance
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**
```c
// Update Workflow Task Due Date
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The id of the task. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsTasksTaskIdGet**
```c
// Retrieve Workflow Task Details
//
void DefaultAPI_objectsObjectworkflowsTasksTaskIdGet(apiClient_t *apiClient, char *task_id, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**task_id** | **char \*** | The task id field value. | 
**loc** | **int \*** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsWorkflowIdActionsGet**
```c
// Retrieve Workflow Actions
//
void DefaultAPI_objectsObjectworkflowsWorkflowIdActionsGet(apiClient_t *apiClient, char *workflow_id, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_id** | **char \*** | The workflow id field value. | 
**loc** | **char \*** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**
```c
// Retrieve Workflow Action Details
//
void DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(apiClient_t *apiClient, char *workflow_id, char *workflow_action, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_id** | **char \*** | The workflow id field value. | 
**workflow_action** | **char \*** | The workflow action name retrieved from Retrieve Workflow Actions. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**
```c
// Initiate Workflow Action
//
void DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(apiClient_t *apiClient, char *workflow_id, char *workflow_action, char *documents__sys, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_id** | **char \*** | The workflow id field value. | 
**workflow_action** | **char \*** | The workflow action name retrieved from Retrieve Workflow Actions. | 
**documents__sys** | **char \*** | Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsObjectworkflowsWorkflowIdGet**
```c
// Retrieve Workflow Details
//
void DefaultAPI_objectsObjectworkflowsWorkflowIdGet(apiClient_t *apiClient, char *workflow_id, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**workflow_id** | **char \*** | The workflow id field value. | 
**loc** | **int \*** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsPicklistsGet**
```c
// Retrieve All Picklists
//
void DefaultAPI_objectsPicklistsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsPicklistsPicklistNameGet**
```c
// Retrieve Picklist Values
//
void DefaultAPI_objectsPicklistsPicklistNameGet(apiClient_t *apiClient, char *picklist_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**picklist_name** | **char \*** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsPicklistsPicklistNamePicklistValueNameDelete**
```c
// Inactivate Picklist Value
//
void DefaultAPI_objectsPicklistsPicklistNamePicklistValueNameDelete(apiClient_t *apiClient, char *picklist_name, char *picklist_value_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**picklist_name** | **char \*** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
**picklist_value_name** | **char \*** | The picklist value name field value (north_america__c, south_america__c, etc.) | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsPicklistsPicklistNamePicklistValueNamePut**
```c
// Update Picklist Value
//
void DefaultAPI_objectsPicklistsPicklistNamePicklistValueNamePut(apiClient_t *apiClient, char *picklist_name, char *picklist_value_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**picklist_name** | **char \*** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
**picklist_value_name** | **char \*** | The picklist value name field value (north_america__c, south_america__c, etc.) | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsPicklistsPicklistNamePost**
```c
// Create Picklist Values
//
void DefaultAPI_objectsPicklistsPicklistNamePost(apiClient_t *apiClient, char *picklist_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**picklist_name** | **char \*** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsPicklistsPicklistNamePut**
```c
// Update Picklist Value Label
//
void DefaultAPI_objectsPicklistsPicklistNamePut(apiClient_t *apiClient, char *picklist_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**picklist_name** | **char \*** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxActionsBuildproductionPost**
```c
// Build Production Vault
//
void DefaultAPI_objectsSandboxActionsBuildproductionPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxActionsPromoteproductionPost**
```c
// Promote to Production
//
void DefaultAPI_objectsSandboxActionsPromoteproductionPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxActionsRecheckusagePost**
```c
// Recheck Sandbox Usage Limit
//
void DefaultAPI_objectsSandboxActionsRecheckusagePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxBatchChangesizePost**
```c
// Change Sandbox Size
//
void DefaultAPI_objectsSandboxBatchChangesizePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxEntitlementsSetPost**
```c
// Set Sandbox Entitlements
//
void DefaultAPI_objectsSandboxEntitlementsSetPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxGet**
```c
// Retrieve Sandboxes
//
void DefaultAPI_objectsSandboxGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxNameDelete**
```c
// Delete Sandbox
//
void DefaultAPI_objectsSandboxNameDelete(apiClient_t *apiClient, char *name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**name** | **char \*** | The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxPost**
```c
// Create or Refresh Sandbox
//
void DefaultAPI_objectsSandboxPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxSnapshotApiNameActionsUpdatePost**
```c
// Update Sandbox Snapshot
//
void DefaultAPI_objectsSandboxSnapshotApiNameActionsUpdatePost(apiClient_t *apiClient, char *api_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**api_name** | **char \*** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxSnapshotApiNameActionsUpgradePost**
```c
// Upgrade Sandbox Snapshot
//
void DefaultAPI_objectsSandboxSnapshotApiNameActionsUpgradePost(apiClient_t *apiClient, char *api_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**api_name** | **char \*** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxSnapshotApiNameDelete**
```c
// Delete Sandbox Snapshot
//
void DefaultAPI_objectsSandboxSnapshotApiNameDelete(apiClient_t *apiClient, char *api_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**api_name** | **char \*** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxSnapshotGet**
```c
// Retrieve Sandbox Snapshots
//
void DefaultAPI_objectsSandboxSnapshotGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxSnapshotPost**
```c
// Create Sandbox Snapshot
//
void DefaultAPI_objectsSandboxSnapshotPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxVaultIdActionsRefreshPost**
```c
// Refresh Sandbox from Snapshot
//
void DefaultAPI_objectsSandboxVaultIdActionsRefreshPost(apiClient_t *apiClient, char *vault_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vault_id** | **char \*** | The Vault ID of the sandbox to be refreshed. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSandboxVaultIdGet**
```c
// Retrieve Sandbox Details by ID
//
void DefaultAPI_objectsSandboxVaultIdGet(apiClient_t *apiClient, char *vault_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vault_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSecuritypoliciesGet**
```c
// Retrieve All Security Policies
//
void DefaultAPI_objectsSecuritypoliciesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsSecuritypoliciesSecurityPolicyNameGet**
```c
// Retrieve Security Policy
//
void DefaultAPI_objectsSecuritypoliciesSecurityPolicyNameGet(apiClient_t *apiClient, char *security_policy_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**security_policy_name** | **char \*** | Security policy name__v field value (retrieved from previous request). This is typically a numeric value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersGet**
```c
// Retrieve All Users
//
void DefaultAPI_objectsUsersGet(apiClient_t *apiClient, char *vaults, char *exclude_vault_membership, char *exclude_app_licensing, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vaults** | **char \*** | Retrieve all users assigned to all Vaults in your domain. | [optional] 
**exclude_vault_membership** | **char \*** | Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [optional] 
**exclude_app_licensing** | **char \*** | Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersIdGet**
```c
// Retrieve User
//
void DefaultAPI_objectsUsersIdGet(apiClient_t *apiClient, char *id, char *exclude_vault_membership, char *exclude_app_licensing, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The user id field value. Use the value me to get information for the currently authenticated user. | 
**exclude_vault_membership** | **char \*** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] 
**exclude_app_licensing** | **char \*** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersIdPermissionsGet**
```c
// Retrieve User Permissions
//
void DefaultAPI_objectsUsersIdPermissionsGet(apiClient_t *apiClient, char *id, char *filter, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The ID of the user. Use the value me to retrieve information for the currently authenticated user. | 
**filter** | **char \*** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersIdPut**
```c
// Update Single User
//
void DefaultAPI_objectsUsersIdPut(apiClient_t *apiClient, char *id, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The user id field value. Use the value me to get information for the currently authenticated user. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersMeGet**
```c
// Validate Session User
//
void DefaultAPI_objectsUsersMeGet(apiClient_t *apiClient, char *exclude_vault_membership, char *exclude_app_licensing, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**exclude_vault_membership** | **char \*** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] 
**exclude_app_licensing** | **char \*** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersMePasswordPost**
```c
// Change My Password
//
void DefaultAPI_objectsUsersMePasswordPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersMePermissionsGet**
```c
// Retrieve My User Permissions
//
void DefaultAPI_objectsUsersMePermissionsGet(apiClient_t *apiClient, char *filter, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**filter** | **char \*** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersMePut**
```c
// Update My User
//
void DefaultAPI_objectsUsersMePut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersPost**
```c
// Create Single User
//
void DefaultAPI_objectsUsersPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersPut**
```c
// Update Multiple Users
//
void DefaultAPI_objectsUsersPut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersUserIdDelete**
```c
// Disable User
//
void DefaultAPI_objectsUsersUserIdDelete(apiClient_t *apiClient, char *user_id, int *domain, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_id** | **char \*** | The user id field value.  | 
**domain** | **int \*** | When true, this disables the user account in all vaults in the domain. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsUsersUserIdVaultMembershipVaultIdPut**
```c
// Update Vault Membership
//
void DefaultAPI_objectsUsersUserIdVaultMembershipVaultIdPut(apiClient_t *apiClient, char *user_id, char *vault_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_id** | **char \*** | The user id field value. | 
**vault_id** | **char \*** | The system-managed id field value assigned to each vault in the domain. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsVaultActionsComparePost**
```c
// Vault Compare
//
void DefaultAPI_objectsVaultActionsComparePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_objectsVaultActionsConfigreportPost**
```c
// Vault Configuration Report
//
void DefaultAPI_objectsVaultActionsConfigreportPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_queryComponentsPost**
```c
// Component Definition Query
//
void DefaultAPI_queryComponentsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_queryNextPagePost**
```c
// Next Page URL
//
void DefaultAPI_queryNextPagePost(apiClient_t *apiClient, char *next_page, char *Authorization, char *Accept, int *X_VaultAPI_DescribeQuery, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**next_page** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_DescribeQuery** | **int \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_queryPost**
```c
// Submitting a Query
//
void DefaultAPI_queryPost(apiClient_t *apiClient, char *Authorization, char *Accept, int *X_VaultAPI_DescribeQuery, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_DescribeQuery** | **int \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_queryPreviousPagePost**
```c
// Previous Page URL
//
void DefaultAPI_queryPreviousPagePost(apiClient_t *apiClient, char *previous_page, char *Authorization, char *Accept, int *X_VaultAPI_DescribeQuery, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**previous_page** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_DescribeQuery** | **int \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2MeGet**
```c
// Retrieve Current User with SCIM
//
void DefaultAPI_scimV2MeGet(apiClient_t *apiClient, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**attributes** | **char \*** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
**excludedAttributes** | **char \*** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2MePut**
```c
// Update Current User with SCIM
//
void DefaultAPI_scimV2MePut(apiClient_t *apiClient, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**attributes** | **char \*** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
**excludedAttributes** | **char \*** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2ResourceTypesGet**
```c
// Retrieve All SCIM Resource Types
//
void DefaultAPI_scimV2ResourceTypesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2ResourceTypesTypeGet**
```c
// Retrieve Single SCIM Resource Type
//
void DefaultAPI_scimV2ResourceTypesTypeGet(apiClient_t *apiClient, char *type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**type** | **char \*** | A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2SchemasGet**
```c
// Retrieve All SCIM Schema Information
//
void DefaultAPI_scimV2SchemasGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2SchemasIdGet**
```c
// Retrieve Single SCIM Schema Information
//
void DefaultAPI_scimV2SchemasIdGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2ServiceProviderConfigGet**
```c
// Retrieve SCIM Provider
//
void DefaultAPI_scimV2ServiceProviderConfigGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2TypeGet**
```c
// Retrieve SCIM Resources
//
void DefaultAPI_scimV2TypeGet(apiClient_t *apiClient, char *type, char *filter, char *attributes, char *excludedAttributes, char *sortBy, char *sortOrder, char *startIndex, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**type** | **char \*** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | 
**filter** | **char \*** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] 
**attributes** | **char \*** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
**excludedAttributes** | **char \*** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
**sortBy** | **char \*** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] 
**sortOrder** | **char \*** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] 
**startIndex** | **char \*** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2TypeIdGet**
```c
// Retrieve Single SCIM Resource
//
void DefaultAPI_scimV2TypeIdGet(apiClient_t *apiClient, char *type, char *id, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**type** | **char \*** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | 
**id** | **char \*** | The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. | 
**attributes** | **char \*** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
**excludedAttributes** | **char \*** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2UsersGet**
```c
// Retrieve All Users with SCIM
//
void DefaultAPI_scimV2UsersGet(apiClient_t *apiClient, char *filter, char *attributes, char *excludedAttributes, char *sortBy, char *sortOrder, char *count, char *startIndex, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**filter** | **char \*** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] 
**attributes** | **char \*** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
**excludedAttributes** | **char \*** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
**sortBy** | **char \*** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] 
**sortOrder** | **char \*** | Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [optional] 
**count** | **char \*** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] 
**startIndex** | **char \*** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2UsersIdGet**
```c
// Retrieve Single User with SCIM
//
void DefaultAPI_scimV2UsersIdGet(apiClient_t *apiClient, char *id, char *filter, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The id of the user you wish to update. | 
**filter** | **char \*** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] 
**attributes** | **char \*** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] 
**excludedAttributes** | **char \*** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2UsersIdPut**
```c
// Update User with SCIM
//
void DefaultAPI_scimV2UsersIdPut(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | The id of the user you wish to update. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_scimV2UsersPost**
```c
// Create User with SCIM
//
void DefaultAPI_scimV2UsersPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesCertificateCertIdGet**
```c
// Retrieve Signing Certificate
//
void DefaultAPI_servicesCertificateCertIdGet(apiClient_t *apiClient, char *cert_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**cert_id** | **char \*** | The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesConfigurationModeActionsDisablePost**
```c
// Disable Configuration Mode
//
void DefaultAPI_servicesConfigurationModeActionsDisablePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesConfigurationModeActionsEnablePost**
```c
// Enable Configuration Mode
//
void DefaultAPI_servicesConfigurationModeActionsEnablePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesDirectdataFilesGet**
```c
// Retrieve Available Direct Data Files
//
void DefaultAPI_servicesDirectdataFilesGet(apiClient_t *apiClient, char *extract_type, int *start_time, int *stop_time, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**extract_type** | **char \*** | The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [optional] 
**start_time** | **int \*** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [optional] 
**stop_time** | **int \*** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [optional] 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesDirectdataFilesNameGet**
```c
// Download Direct Data File
//
void DefaultAPI_servicesDirectdataFilesNameGet(apiClient_t *apiClient, char *name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**name** | **char \*** | The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingItemsContentItemGet**
```c
// Download Item Content
//
void DefaultAPI_servicesFileStagingItemsContentItemGet(apiClient_t *apiClient, char *item, char *Authorization, char *Accept, char *Range, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**item** | **char \*** | The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Range** | **char \*** | Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;. | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingItemsItemDelete**
```c
// Delete File or Folder
//
void DefaultAPI_servicesFileStagingItemsItemDelete(apiClient_t *apiClient, char *item, char *recursive, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**item** | **char \*** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
**recursive** | **char \*** | Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingItemsItemGet**
```c
// List Items at a Path
//
void DefaultAPI_servicesFileStagingItemsItemGet(apiClient_t *apiClient, char *item, char *recursive, char *limit, char *format_result, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**item** | **char \*** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
**recursive** | **char \*** | If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [optional] 
**limit** | **char \*** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] 
**format_result** | **char \*** | If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingItemsItemPut**
```c
// Update Folder or File
//
void DefaultAPI_servicesFileStagingItemsItemPut(apiClient_t *apiClient, char *item, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**item** | **char \*** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingItemsPost**
```c
// Create Folder or File
//
void DefaultAPI_servicesFileStagingItemsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_MD5, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_MD5** | **char \*** | Optional: The MD5 checksum of the file being uploaded. | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingUploadGet**
```c
// List Upload Sessions
//
void DefaultAPI_servicesFileStagingUploadGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingUploadPost**
```c
// Create Resumable Upload Session
//
void DefaultAPI_servicesFileStagingUploadPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingUploadUploadSessionIdDelete**
```c
// Abort Upload Session
//
void DefaultAPI_servicesFileStagingUploadUploadSessionIdDelete(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**upload_session_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingUploadUploadSessionIdGet**
```c
// Get Upload Session Details
//
void DefaultAPI_servicesFileStagingUploadUploadSessionIdGet(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**upload_session_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingUploadUploadSessionIdPartsGet**
```c
// List File Parts Uploaded to Session
//
void DefaultAPI_servicesFileStagingUploadUploadSessionIdPartsGet(apiClient_t *apiClient, char *upload_session_id, char *limit, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**upload_session_id** | **char \*** |  | 
**limit** | **char \*** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingUploadUploadSessionIdPost**
```c
// Commit Upload Session
//
void DefaultAPI_servicesFileStagingUploadUploadSessionIdPost(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**upload_session_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesFileStagingUploadUploadSessionIdPut**
```c
// Upload to a Session
//
void DefaultAPI_servicesFileStagingUploadUploadSessionIdPut(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_FilePartNumber, char *Content_MD5, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**upload_session_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_FilePartNumber** | **char \*** | The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [optional] 
**Content_MD5** | **char \*** | Optional: The MD5 checksum of the file part being uploaded. | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesJobsHistoriesGet**
```c
// Retrieve Job Histories
//
void DefaultAPI_servicesJobsHistoriesGet(apiClient_t *apiClient, char *start_date, char *end_date, char *status, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char \*** | Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] 
**end_date** | **char \*** | Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] 
**status** | **char \*** | Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [optional] 
**limit** | **char \*** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] 
**offset** | **char \*** | Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesJobsJobIdErrorsGet**
```c
// Retrieve Import Bulk Translation File Job Errors
//
void DefaultAPI_servicesJobsJobIdErrorsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesJobsJobIdGet**
```c
// Retrieve Job Status
//
void DefaultAPI_servicesJobsJobIdGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The ID of the job, returned from the original job request. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesJobsJobIdSummaryGet**
```c
// Retrieve Import Bulk Translation File Job Summary
//
void DefaultAPI_servicesJobsJobIdSummaryGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesJobsJobIdTasksGet**
```c
// Retrieve SDK Job Tasks
//
void DefaultAPI_servicesJobsJobIdTasksGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The ID of the SDK job, returned from the original job request. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesJobsMonitorsGet**
```c
// Retrieve Job Monitors
//
void DefaultAPI_servicesJobsMonitorsGet(apiClient_t *apiClient, char *start_date, char *end_date, char *status, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char \*** | Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] 
**end_date** | **char \*** | Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] 
**status** | **char \*** | Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [optional] 
**limit** | **char \*** | Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] 
**offset** | **char \*** | Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesJobsStartNowJobIdPost**
```c
// Start Job
//
void DefaultAPI_servicesJobsStartNowJobIdPost(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The ID of the scheduled job instance to start. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesLoaderExtractPost**
```c
// Extract Data Files
//
void DefaultAPI_servicesLoaderExtractPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesLoaderJobIdTasksTaskIdFailurelogGet**
```c
// Retrieve Load Failure Log Results
//
void DefaultAPI_servicesLoaderJobIdTasksTaskIdFailurelogGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested extract job. | 
**task_id** | **char \*** | The id value of the requested extract task. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsGet**
```c
// Retrieve Loader Extract Results
//
void DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested extract job. | 
**task_id** | **char \*** | The id value of the requested extract task. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsRenditionsGet**
```c
// Retrieve Loader Extract Renditions Results
//
void DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested extract job. | 
**task_id** | **char \*** | The id value of the requested extract task. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesLoaderJobIdTasksTaskIdSuccesslogGet**
```c
// Retrieve Load Success Log Results
//
void DefaultAPI_servicesLoaderJobIdTasksTaskIdSuccesslogGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The id value of the requested extract job. | 
**task_id** | **char \*** | The id value of the requested extract task. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesLoaderLoadPost**
```c
// Load Data Objects
//
void DefaultAPI_servicesLoaderLoadPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesPackageActionsValidatePost**
```c
// Validate Package
//
void DefaultAPI_servicesPackageActionsValidatePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesPackagePost**
```c
// Export Package
//
void DefaultAPI_servicesPackagePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesPackagePut**
```c
// Import Package
//
void DefaultAPI_servicesPackagePut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesQueuesGet**
```c
// Retrieve All Queues
//
void DefaultAPI_servicesQueuesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesQueuesQueueNameActionsDisableDeliveryPut**
```c
// Disable Delivery
//
void DefaultAPI_servicesQueuesQueueNameActionsDisableDeliveryPut(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**queue_name** | **char \*** | The name of a specific Queue. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesQueuesQueueNameActionsEnableDeliveryPut**
```c
// Enable Delivery
//
void DefaultAPI_servicesQueuesQueueNameActionsEnableDeliveryPut(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**queue_name** | **char \*** | The name of a specific Queue. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesQueuesQueueNameActionsResetPut**
```c
// Reset Queue
//
void DefaultAPI_servicesQueuesQueueNameActionsResetPut(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**queue_name** | **char \*** | The name of a specific Queue. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesQueuesQueueNameGet**
```c
// Retrieve Queue Status
//
void DefaultAPI_servicesQueuesQueueNameGet(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**queue_name** | **char \*** | The name of a specific queue. For example, queue__c. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_servicesVobjectVaultPackageVPackageIdActionsValidatePost**
```c
// Validate Imported Package
//
void DefaultAPI_servicesVobjectVaultPackageVPackageIdActionsValidatePost(apiClient_t *apiClient, char *package_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**package_id** | **char \*** | The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_sessionDelete**
```c
// End Session
//
void DefaultAPI_sessionDelete(apiClient_t *apiClient, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** | The Vault sessionId to end. | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_uicodeDistributionsDistributionNameCodeGet**
```c
// Download Single Client Code Distribution
//
void DefaultAPI_uicodeDistributionsDistributionNameCodeGet(apiClient_t *apiClient, char *distribution_name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**distribution_name** | **char \*** | The name attribute of the client code distribution to download. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_uicodeDistributionsDistributionNameDelete**
```c
// Delete Single Client Code Distribution
//
void DefaultAPI_uicodeDistributionsDistributionNameDelete(apiClient_t *apiClient, char *distribution_name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**distribution_name** | **char \*** | The name attribute of the client code distribution to delete. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_uicodeDistributionsDistributionNameGet**
```c
// Retrieve Single Client Code Distribution Metadata
//
void DefaultAPI_uicodeDistributionsDistributionNameGet(apiClient_t *apiClient, char *distribution_name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**distribution_name** | **char \*** | The name attribute of the client code distribution to delete. | 
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_uicodeDistributionsGet**
```c
// Retrieve All Client Code Distribution Metadata
//
void DefaultAPI_uicodeDistributionsGet(apiClient_t *apiClient, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_uicodeDistributionsPost**
```c
// Add or Replace Single Client Code Distribution
//
void DefaultAPI_uicodeDistributionsPost(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Accept** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployPost**
```c
// Deploy Package
//
void DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployPost(apiClient_t *apiClient, char *package_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**package_id** | **char \*** | The id field value of the vault_package__v object record used for deployment. See Import Package. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployResultsGet**
```c
// Retrieve Package Deploy Results
//
void DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployResultsGet(apiClient_t *apiClient, char *package_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**package_id** | **char \*** | The id field value of the vault_package__v object record used for deployment. See Deploy Package. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**
```c
// Retrieve Results of Cascade Delete Job
//
void DefaultAPI_vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(apiClient_t *apiClient, char *object_name, char *job_status, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**job_status** | **char \*** |  | 
**job_id** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**
```c
// Retrieve Results of Deep Copy Job
//
void DefaultAPI_vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(apiClient_t *apiClient, char *object_name, char *job_status, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**job_status** | **char \*** | The ID of the job, retrieved from the response of the job request. | 
**job_id** | **char \*** | Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsEdlItemVActionsCreateplaceholderPost**
```c
// Create a Placeholder from an EDL Item
//
void DefaultAPI_vobjectsEdlItemVActionsCreateplaceholderPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsMergesJobIdLogGet**
```c
// Download Merge Records Job Log
//
void DefaultAPI_vobjectsMergesJobIdLogGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsMergesJobIdResultsGet**
```c
// Retrieve Record Merge Results
//
void DefaultAPI_vobjectsMergesJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsMergesJobIdStatusGet**
```c
// Retrieve Record Merge Status
//
void DefaultAPI_vobjectsMergesJobIdStatusGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**job_id** | **char \*** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameActionsActionNamePost**
```c
// Initiate Object Action on Multiple Records
//
void DefaultAPI_vobjectsObjectNameActionsActionNamePost(apiClient_t *apiClient, char *object_name, char *action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. | 
**action_name** | **char \*** | Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameActionsChangetypePost**
```c
// Change Object Type
//
void DefaultAPI_vobjectsObjectNameActionsChangetypePost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The name of the object. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameActionsMergePost**
```c
// Initiate Record Merge
//
void DefaultAPI_vobjectsObjectNameActionsMergePost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID, list_t *_vobjects__object_name__actions_merge_post_request_inner);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. For example, account__v. This object must have Enable Merges configured. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 
**_vobjects__object_name__actions_merge_post_request_inner** | **[list_t](_vobjects__object_name__actions_merge_post_request_inner.md) \*** |  | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsGet**
```c
// Retrieve Roll-up Field Recalculation Status
//
void DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsGet(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The name of the object for which to check the status of a Roll-up field recalculation. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsPost**
```c
// Recalculate Roll-up Fields
//
void DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The name of the object for which to check the status of a Roll-up field recalculation. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameActionsUpdatecorporatecurrencyPut**
```c
// Update Corporate Currency Fields
//
void DefaultAPI_vobjectsObjectNameActionsUpdatecorporatecurrencyPut(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameAttachmentsBatchDelete**
```c
// Delete Multiple Object Record Attachments
//
void DefaultAPI_vobjectsObjectNameAttachmentsBatchDelete(apiClient_t *apiClient, char *object_name, char *idParam, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**idParam** | **char \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameAttachmentsBatchPost**
```c
// Create Multiple Object Record Attachments
//
void DefaultAPI_vobjectsObjectNameAttachmentsBatchPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameAttachmentsBatchPut**
```c
// Update Multiple Object Record Attachment Descriptions
//
void DefaultAPI_vobjectsObjectNameAttachmentsBatchPut(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameDelete**
```c
// Delete Object Records
//
void DefaultAPI_vobjectsObjectNameDelete(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** | Can be text/csv or application/json | [optional] 
**Accept** | **char \*** | Can be text/csv or application/json | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameIdRolesRoleNameGet**
```c
// Retrieve Object Record Roles
//
void DefaultAPI_vobjectsObjectNameIdRolesRoleNameGet(apiClient_t *apiClient, char *object_name, char *id, char *role_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name. | 
**id** | **char \*** | The id of the document, binder, or object record. | 
**role_name** | **char \*** | Optional: Include a role name to filter for a specific role. For example, owner__v. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNameGet**
```c
// Retrieve Object User Actions Details
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNameGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *action_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. | 
**object_record_id** | **char \*** | The object record id field value from which to retrieve user actions. | 
**action_name** | **char \*** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNamePost**
```c
// Initiate Object Action on a Single Record
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNamePost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. | 
**object_record_id** | **char \*** | The object record id field value from which to retrieve user actions. | 
**action_name** | **char \*** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdActionsCascadedeletePost**
```c
// Cascade Delete Object Record
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdActionsDeepcopyPost**
```c
// Deep Copy Object Record
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdActionsGet**
```c
// Retrieve Object Record User Actions
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdActionsGet(apiClient_t *apiClient, char *object_name, char *object_record_id, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. | 
**object_record_id** | **char \*** | The object record id field value. | 
**loc** | **int \*** | Optional: When true, retrieves localized (translated) strings for the label.  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**
```c
// Download Attachment Field File
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_field_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. For example, product__v. | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_field_name** | **char \*** | The name of the Attachment field to update. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**
```c
// Update Attachment Field File
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_field_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. For example, product__v. | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_field_name** | **char \*** | The name of the Attachment field to update. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**
```c
// Download All Attachment Field Files
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. For example, product__v. | 
**object_record_id** | **char \*** | The object record id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**
```c
// Delete Object Record Attachment
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**
```c
// Retrieve Object Record Attachment Metadata
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**
```c
// Update Object Record Attachment Description
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**
```c
// Delete Object Record Attachment Version
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** | The attachment version__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
```c
// Download Object Record Attachment File
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** |  | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**
```c
// Retrieve Object Record Attachment Version Metadata
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** | The attachment version__v field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**
```c
// Restore Object Record Attachment Version
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, int *restore, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**attachment_version** | **char \*** | The attachment version__v field value. | 
**restore** | **int \*** |  | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**
```c
// Retrieve Object Record Attachment Versions
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**attachment_id** | **char \*** | The attachment id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsFileGet**
```c
// Download All Object Record Attachment Files
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsGet**
```c
// Retrieve Object Record Attachments
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsPost**
```c
// Create Object Record Attachment
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsPost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdAudittrailGet**
```c
// Retrieve Complete Audit History for a Single Object Record
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdAudittrailGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *start_date, char *end_date, char *format_result, char *limit, char *offset, char *events, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value. | 
**object_record_id** | **char \*** | The object record id field value from which to retrieve user actions. | 
**start_date** | **char \*** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  | [optional] 
**end_date** | **char \*** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] 
**format_result** | **char \*** | To request a CSV file of your audit history, use csv.  | [optional] 
**limit** | **char \*** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] 
**offset** | **char \*** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] 
**events** | **char \*** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameObjectRecordIdGet**
```c
// Retrieve Object Record
//
void DefaultAPI_vobjectsObjectNameObjectRecordIdGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**object_record_id** | **char \*** | The object record id field value. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNamePost**
```c
// Create & Upsert Object Records
//
void DefaultAPI_vobjectsObjectNamePost(apiClient_t *apiClient, char *object_name, char *idParam, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, int *X_VaultAPI_NoTriggers, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**idParam** | **char \*** | To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;. | [optional] 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** | Can be text/csv or application/json | [optional] 
**Accept** | **char \*** | Can be text/csv or application/json | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] 
**X_VaultAPI_NoTriggers** | **int \*** | If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNamePut**
```c
// Update Object Records
//
void DefaultAPI_vobjectsObjectNamePut(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, int *X_VaultAPI_NoTriggers, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | 
**Authorization** | **char \*** |  | [optional] 
**Content_Type** | **char \*** | Can be text/csv or application/json | [optional] 
**Accept** | **char \*** | Can be text/csv or application/json | [optional] 
**X_VaultAPI_MigrationMode** | **int \*** | If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] 
**X_VaultAPI_NoTriggers** | **int \*** | If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameRolesDelete**
```c
// Remove Users & Groups from Roles on Object Records
//
void DefaultAPI_vobjectsObjectNameRolesDelete(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The name of the object where you want to remove roles. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsObjectNameRolesPost**
```c
// Assign Users & Groups to Roles on Object Records
//
void DefaultAPI_vobjectsObjectNameRolesPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**object_name** | **char \*** | The name of the object where you want to remove roles. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**Content_Type** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_vobjectsOutboundPackageVPackageIdDependenciesGet**
```c
// Retrieve Outbound Package Dependencies
//
void DefaultAPI_vobjectsOutboundPackageVPackageIdDependenciesGet(apiClient_t *apiClient, char *package_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**package_id** | **char \*** | The ID of the outbound_package__v record from which to retrieve dependencies. | 
**Authorization** | **char \*** |  | [optional] 
**Accept** | **char \*** |  | [optional] 
**X_VaultAPI_ClientID** | **char \*** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] 

### Return type

void

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

