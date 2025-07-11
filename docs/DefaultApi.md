# DefaultApi

All URIs are relative to *http://}/api/v25.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_get**](DefaultApi.md#api_get) | **GET** /api/ | Retrieve API Versions
[**api_mdl_components_component_type_and_record_name_files_get**](DefaultApi.md#api_mdl_components_component_type_and_record_name_files_get) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File
[**api_mdl_components_component_type_and_record_name_get**](DefaultApi.md#api_mdl_components_component_type_and_record_name_get) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL)
[**api_mdl_execute_async_job_id_results_get**](DefaultApi.md#api_mdl_execute_async_job_id_results_get) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results
[**api_mdl_execute_async_post**](DefaultApi.md#api_mdl_execute_async_post) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously
[**api_mdl_execute_post**](DefaultApi.md#api_mdl_execute_post) | **POST** /api/mdl/execute | Execute MDL Script
[**api_mdl_files_post**](DefaultApi.md#api_mdl_files_post) | **POST** /api/mdl/files | Upload Content File
[**audittrail_audit_trail_type_get**](DefaultApi.md#audittrail_audit_trail_type_get) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details
[**auth_discovery_post**](DefaultApi.md#auth_discovery_post) | **POST** /auth/discovery | Authentication Type Discovery
[**auth_oauth_session_oath_oidc_profile_id_post**](DefaultApi.md#auth_oauth_session_oath_oidc_profile_id_post) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect
[**auth_post**](DefaultApi.md#auth_post) | **POST** /auth | User Name and Password
[**code_class_name_delete**](DefaultApi.md#code_class_name_delete) | **DELETE** /code/{class_name} | Delete Single Source Code File
[**code_class_name_disable_put**](DefaultApi.md#code_class_name_disable_put) | **PUT** /code/{class_name}/disable | Disable Vault Extension
[**code_class_name_enable_put**](DefaultApi.md#code_class_name_enable_put) | **PUT** /code/{class_name}/enable | Enable Vault Extension
[**code_class_name_get**](DefaultApi.md#code_class_name_get) | **GET** /code/{class_name} | Retrieve Single Source Code File
[**code_profiler_get**](DefaultApi.md#code_profiler_get) | **GET** /code/profiler | Retrieve All Profiling Sessions
[**code_profiler_post**](DefaultApi.md#code_profiler_post) | **POST** /code/profiler | Create Profiling Session
[**code_profiler_session_name_actions_end_post**](DefaultApi.md#code_profiler_session_name_actions_end_post) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session
[**code_profiler_session_name_delete**](DefaultApi.md#code_profiler_session_name_delete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session
[**code_profiler_session_name_get**](DefaultApi.md#code_profiler_session_name_get) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session
[**code_profiler_session_name_results_get**](DefaultApi.md#code_profiler_session_name_results_get) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results
[**code_put**](DefaultApi.md#code_put) | **PUT** /code | Add or Replace Single Source Code File
[**composites_trees_edl_hierarchy_or_template_actions_listnodes_post**](DefaultApi.md#composites_trees_edl_hierarchy_or_template_actions_listnodes_post) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes
[**composites_trees_edl_hierarchy_or_template_get**](DefaultApi.md#composites_trees_edl_hierarchy_or_template_get) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes
[**composites_trees_edl_hierarchy_v_parent_node_id_children_get**](DefaultApi.md#composites_trees_edl_hierarchy_v_parent_node_id_children_get) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node&#39;s Children
[**composites_trees_edl_hierarchy_v_parent_node_id_children_put**](DefaultApi.md#composites_trees_edl_hierarchy_v_parent_node_id_children_put) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
[**configuration_component_type_and_record_name_get**](DefaultApi.md#configuration_component_type_and_record_name_get) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
[**configuration_component_type_get**](DefaultApi.md#configuration_component_type_get) | **GET** /configuration/{component_type} | Retrieve Component Record Collection
[**configuration_object_name_and_object_type_get**](DefaultApi.md#configuration_object_name_and_object_type_get) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
[**configuration_objecttype_get**](DefaultApi.md#configuration_objecttype_get) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types
[**configuration_role_assignment_rule_delete**](DefaultApi.md#configuration_role_assignment_rule_delete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_get**](DefaultApi.md#configuration_role_assignment_rule_get) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
[**configuration_role_assignment_rule_post**](DefaultApi.md#configuration_role_assignment_rule_post) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_put**](DefaultApi.md#configuration_role_assignment_rule_put) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override)
[**delegation_login_post**](DefaultApi.md#delegation_login_post) | **POST** /delegation/login | Initiate Delegated Session
[**delegation_vaults_get**](DefaultApi.md#delegation_vaults_get) | **GET** /delegation/vaults | Retrieve Delegations
[**keep_alive_post**](DefaultApi.md#keep_alive_post) | **POST** /keep-alive | Session Keep Alive
[**limits_get**](DefaultApi.md#limits_get) | **GET** /limits | Retrieve Limits on Objects
[**logs_api_usage_get**](DefaultApi.md#logs_api_usage_get) | **GET** /logs/api_usage | Download Daily API Usage
[**logs_code_debug_get**](DefaultApi.md#logs_code_debug_get) | **GET** /logs/code/debug | Retrieve All Debug Logs
[**logs_code_debug_id_actions_reset_delete**](DefaultApi.md#logs_code_debug_id_actions_reset_delete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log
[**logs_code_debug_id_actions_reset_post**](DefaultApi.md#logs_code_debug_id_actions_reset_post) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log
[**logs_code_debug_id_files_get**](DefaultApi.md#logs_code_debug_id_files_get) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files
[**logs_code_debug_id_get**](DefaultApi.md#logs_code_debug_id_get) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log
[**logs_code_debug_post**](DefaultApi.md#logs_code_debug_post) | **POST** /logs/code/debug | Create Debug Log
[**logs_code_runtime_get**](DefaultApi.md#logs_code_runtime_get) | **GET** /logs/code/runtime | Download SDK Runtime Log
[**messages_message_type_actions_import_post**](DefaultApi.md#messages_message_type_actions_import_post) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File
[**messages_message_type_language_lang_actions_export_post**](DefaultApi.md#messages_message_type_language_lang_actions_export_post) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File
[**metadata_audittrail_audit_trail_type_get**](DefaultApi.md#metadata_audittrail_audit_trail_type_get) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata
[**metadata_audittrail_get**](DefaultApi.md#metadata_audittrail_get) | **GET** /metadata/audittrail | Retrieve Audit Types
[**metadata_components_component_type_get**](DefaultApi.md#metadata_components_component_type_get) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata
[**metadata_components_get**](DefaultApi.md#metadata_components_get) | **GET** /metadata/components | Retrieve All Component Metadata
[**metadata_objects_binders_templates_bindernodes_get**](DefaultApi.md#metadata_objects_binders_templates_bindernodes_get) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata
[**metadata_objects_binders_templates_get**](DefaultApi.md#metadata_objects_binders_templates_get) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata
[**metadata_objects_documents_annotations_placemarks_types_placemark_type_get**](DefaultApi.md#metadata_objects_documents_annotations_placemarks_types_placemark_type_get) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata
[**metadata_objects_documents_annotations_references_types_reference_type_get**](DefaultApi.md#metadata_objects_documents_annotations_references_types_reference_type_get) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata
[**metadata_objects_documents_annotations_types_annotation_type_get**](DefaultApi.md#metadata_objects_documents_annotations_types_annotation_type_get) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata
[**metadata_objects_documents_events_event_type_types_event_subtype_get**](DefaultApi.md#metadata_objects_documents_events_event_type_types_event_subtype_get) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata
[**metadata_objects_documents_events_get**](DefaultApi.md#metadata_objects_documents_events_get) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes
[**metadata_objects_documents_lock_get**](DefaultApi.md#metadata_objects_documents_lock_get) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata
[**metadata_objects_documents_properties_find_common_post**](DefaultApi.md#metadata_objects_documents_properties_find_common_post) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields
[**metadata_objects_documents_properties_get**](DefaultApi.md#metadata_objects_documents_properties_get) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields
[**metadata_objects_documents_templates_get**](DefaultApi.md#metadata_objects_documents_templates_get) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata
[**metadata_objects_documents_types_get**](DefaultApi.md#metadata_objects_documents_types_get) | **GET** /metadata/objects/documents/types | Retrieve All Document Types
[**metadata_objects_documents_types_type_get**](DefaultApi.md#metadata_objects_documents_types_type_get) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type
[**metadata_objects_documents_types_type_relationships_get**](DefaultApi.md#metadata_objects_documents_types_type_relationships_get) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships
[**metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get**](DefaultApi.md#metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification
[**metadata_objects_documents_types_type_subtypes_subtype_get**](DefaultApi.md#metadata_objects_documents_types_type_subtypes_subtype_get) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype
[**metadata_objects_groups_get**](DefaultApi.md#metadata_objects_groups_get) | **GET** /metadata/objects/groups | Retrieve Group Metadata
[**metadata_objects_securitypolicies_get**](DefaultApi.md#metadata_objects_securitypolicies_get) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata
[**metadata_objects_users_get**](DefaultApi.md#metadata_objects_users_get) | **GET** /metadata/objects/users | Retrieve User Metadata
[**metadata_query_archived_documents_relationships_document_signature_sysr_get**](DefaultApi.md#metadata_query_archived_documents_relationships_document_signature_sysr_get) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata
[**metadata_query_documents_relationships_document_signature_sysr_get**](DefaultApi.md#metadata_query_documents_relationships_document_signature_sysr_get) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata
[**metadata_vobjects_get**](DefaultApi.md#metadata_vobjects_get) | **GET** /metadata/vobjects | Retrieve Object Collection
[**metadata_vobjects_object_name_actions_canceldeployment_post**](DefaultApi.md#metadata_vobjects_object_name_actions_canceldeployment_post) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment
[**metadata_vobjects_object_name_fields_object_field_name_get**](DefaultApi.md#metadata_vobjects_object_name_fields_object_field_name_get) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata
[**metadata_vobjects_object_name_get**](DefaultApi.md#metadata_vobjects_object_name_get) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata
[**metadata_vobjects_object_name_page_layouts_get**](DefaultApi.md#metadata_vobjects_object_name_page_layouts_get) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts
[**metadata_vobjects_object_name_page_layouts_layout_name_get**](DefaultApi.md#metadata_vobjects_object_name_page_layouts_layout_name_get) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata
[**notifications_histories_get**](DefaultApi.md#notifications_histories_get) | **GET** /notifications/histories | Retrieve Email Notification Histories
[**object_workflow_actions_action_get**](DefaultApi.md#object_workflow_actions_action_get) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details
[**object_workflow_actions_action_post**](DefaultApi.md#object_workflow_actions_action_post) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows
[**object_workflow_actions_canceltasks_post**](DefaultApi.md#object_workflow_actions_canceltasks_post) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks
[**object_workflow_actions_cancelworkflows_post**](DefaultApi.md#object_workflow_actions_cancelworkflows_post) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows
[**object_workflow_actions_get**](DefaultApi.md#object_workflow_actions_get) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions
[**object_workflow_actions_reassigntasks_post**](DefaultApi.md#object_workflow_actions_reassigntasks_post) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks
[**object_workflow_actions_replaceworkflowowner_post**](DefaultApi.md#object_workflow_actions_replaceworkflowowner_post) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner
[**objects_binders_actions_export_job_id_results_get**](DefaultApi.md#objects_binders_actions_export_job_id_results_get) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results
[**objects_binders_binder_id_actions_export_post**](DefaultApi.md#objects_binders_binder_id_actions_export_post) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version)
[**objects_binders_binder_id_actions_post**](DefaultApi.md#objects_binders_binder_id_actions_post) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing
[**objects_binders_binder_id_binding_rule_put**](DefaultApi.md#objects_binders_binder_id_binding_rule_put) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule
[**objects_binders_binder_id_delete**](DefaultApi.md#objects_binders_binder_id_delete) | **DELETE** /objects/binders/{binder_id} | Delete Binder
[**objects_binders_binder_id_documents_node_id_binding_rule_put**](DefaultApi.md#objects_binders_binder_id_documents_node_id_binding_rule_put) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule
[**objects_binders_binder_id_documents_post**](DefaultApi.md#objects_binders_binder_id_documents_post) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder
[**objects_binders_binder_id_documents_section_id_delete**](DefaultApi.md#objects_binders_binder_id_documents_section_id_delete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder
[**objects_binders_binder_id_documents_section_id_put**](DefaultApi.md#objects_binders_binder_id_documents_section_id_put) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder
[**objects_binders_binder_id_get**](DefaultApi.md#objects_binders_binder_id_get) | **GET** /objects/binders/{binder_id} | Retrieve Binder
[**objects_binders_binder_id_post**](DefaultApi.md#objects_binders_binder_id_post) | **POST** /objects/binders/{binder_id} | Create Binder Version
[**objects_binders_binder_id_put**](DefaultApi.md#objects_binders_binder_id_put) | **PUT** /objects/binders/{binder_id} | Update Binder
[**objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete**](DefaultApi.md#objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder
[**objects_binders_binder_id_sections_node_id_binding_rule_put**](DefaultApi.md#objects_binders_binder_id_sections_node_id_binding_rule_put) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule
[**objects_binders_binder_id_sections_node_id_put**](DefaultApi.md#objects_binders_binder_id_sections_node_id_put) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section
[**objects_binders_binder_id_sections_post**](DefaultApi.md#objects_binders_binder_id_sections_post) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section
[**objects_binders_binder_id_sections_section_id_delete**](DefaultApi.md#objects_binders_binder_id_sections_section_id_delete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section
[**objects_binders_binder_id_sections_section_id_get**](DefaultApi.md#objects_binders_binder_id_sections_section_id_get) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections
[**objects_binders_binder_id_versions_get**](DefaultApi.md#objects_binders_binder_id_versions_get) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions
[**objects_binders_binder_id_versions_major_version_minor_version_actions_export_post**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_actions_export_post) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version)
[**objects_binders_binder_id_versions_major_version_minor_version_delete**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_delete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_get**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_get) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_put**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_put) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_post**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_relationships_post) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get**](DefaultApi.md#objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section
[**objects_binders_id_roles_get**](DefaultApi.md#objects_binders_id_roles_get) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles
[**objects_binders_id_roles_post**](DefaultApi.md#objects_binders_id_roles_post) | **POST** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder
[**objects_binders_id_roles_role_name_get**](DefaultApi.md#objects_binders_id_roles_role_name_get) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get**](DefaultApi.md#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**](DefaultApi.md#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**](DefaultApi.md#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action
[**objects_binders_lifecycle_actions_post**](DefaultApi.md#objects_binders_lifecycle_actions_post) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders
[**objects_binders_lifecycle_actions_user_action_name_put**](DefaultApi.md#objects_binders_lifecycle_actions_user_action_name_put) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions
[**objects_binders_post**](DefaultApi.md#objects_binders_post) | **POST** /objects/binders | Create Binder
[**objects_binders_templates_get**](DefaultApi.md#objects_binders_templates_get) | **GET** /objects/binders/templates | Retrieve Binder Template Collection
[**objects_binders_templates_post**](DefaultApi.md#objects_binders_templates_post) | **POST** /objects/binders/templates | Create Binder Template
[**objects_binders_templates_put**](DefaultApi.md#objects_binders_templates_put) | **PUT** /objects/binders/templates | Update Binder Template
[**objects_binders_templates_template_name_bindernodes_get**](DefaultApi.md#objects_binders_templates_template_name_bindernodes_get) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes
[**objects_binders_templates_template_name_bindernodes_post**](DefaultApi.md#objects_binders_templates_template_name_bindernodes_post) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node
[**objects_binders_templates_template_name_bindernodes_put**](DefaultApi.md#objects_binders_templates_template_name_bindernodes_put) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes
[**objects_binders_templates_template_name_delete**](DefaultApi.md#objects_binders_templates_template_name_delete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template
[**objects_binders_templates_template_name_get**](DefaultApi.md#objects_binders_templates_template_name_get) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes
[**objects_deletions_documents_get**](DefaultApi.md#objects_deletions_documents_get) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs
[**objects_deletions_vobjects_object_name_get**](DefaultApi.md#objects_deletions_vobjects_object_name_get) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID
[**objects_documents_actions_get**](DefaultApi.md#objects_documents_actions_get) | **GET** /objects/documents/actions | Retrieve All Document Workflows
[**objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get**](DefaultApi.md#objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results
[**objects_documents_actions_workflow_name_get**](DefaultApi.md#objects_documents_actions_workflow_name_get) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details
[**objects_documents_actions_workflow_name_post**](DefaultApi.md#objects_documents_actions_workflow_name_post) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow
[**objects_documents_annotations_batch_delete**](DefaultApi.md#objects_documents_annotations_batch_delete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations
[**objects_documents_annotations_batch_post**](DefaultApi.md#objects_documents_annotations_batch_post) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations
[**objects_documents_annotations_batch_put**](DefaultApi.md#objects_documents_annotations_batch_put) | **PUT** /objects/documents/annotations/batch | Update Annotations
[**objects_documents_annotations_replies_batch_post**](DefaultApi.md#objects_documents_annotations_replies_batch_post) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies
[**objects_documents_attachments_batch_delete**](DefaultApi.md#objects_documents_attachments_batch_delete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments
[**objects_documents_attachments_batch_post**](DefaultApi.md#objects_documents_attachments_batch_post) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments
[**objects_documents_attachments_batch_put**](DefaultApi.md#objects_documents_attachments_batch_put) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions
[**objects_documents_batch_actions_fileextract_job_id_results_get**](DefaultApi.md#objects_documents_batch_actions_fileextract_job_id_results_get) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results
[**objects_documents_batch_actions_fileextract_post**](DefaultApi.md#objects_documents_batch_actions_fileextract_post) | **POST** /objects/documents/batch/actions/fileextract | Export Documents
[**objects_documents_batch_actions_reclassify_put**](DefaultApi.md#objects_documents_batch_actions_reclassify_put) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents
[**objects_documents_batch_actions_rerender_post**](DefaultApi.md#objects_documents_batch_actions_rerender_post) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions
[**objects_documents_batch_delete**](DefaultApi.md#objects_documents_batch_delete) | **DELETE** /objects/documents/batch | Delete Multiple Documents
[**objects_documents_batch_lock_delete**](DefaultApi.md#objects_documents_batch_lock_delete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout
[**objects_documents_batch_post**](DefaultApi.md#objects_documents_batch_post) | **POST** /objects/documents/batch | Create Multiple Documents
[**objects_documents_batch_put**](DefaultApi.md#objects_documents_batch_put) | **PUT** /objects/documents/batch | Update Multiple Documents
[**objects_documents_doc_id_anchors_get**](DefaultApi.md#objects_documents_doc_id_anchors_get) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs
[**objects_documents_doc_id_annotations_file_get**](DefaultApi.md#objects_documents_doc_id_annotations_file_get) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF
[**objects_documents_doc_id_annotations_file_post**](DefaultApi.md#objects_documents_doc_id_annotations_file_post) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF
[**objects_documents_doc_id_attachments_attachment_id_delete**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_delete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment
[**objects_documents_doc_id_attachments_attachment_id_file_get**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_file_get) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment
[**objects_documents_doc_id_attachments_attachment_id_get**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_get) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata
[**objects_documents_doc_id_attachments_attachment_id_put**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_put) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_get**](DefaultApi.md#objects_documents_doc_id_attachments_attachment_id_versions_get) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions
[**objects_documents_doc_id_attachments_file_get**](DefaultApi.md#objects_documents_doc_id_attachments_file_get) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments
[**objects_documents_doc_id_attachments_get**](DefaultApi.md#objects_documents_doc_id_attachments_get) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments
[**objects_documents_doc_id_attachments_post**](DefaultApi.md#objects_documents_doc_id_attachments_post) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment
[**objects_documents_doc_id_audittrail_get**](DefaultApi.md#objects_documents_doc_id_audittrail_get) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document
[**objects_documents_doc_id_delete**](DefaultApi.md#objects_documents_doc_id_delete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document
[**objects_documents_doc_id_events_get**](DefaultApi.md#objects_documents_doc_id_events_get) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events
[**objects_documents_doc_id_file_get**](DefaultApi.md#objects_documents_doc_id_file_get) | **GET** /objects/documents/{doc_id}/file | Download Document File
[**objects_documents_doc_id_get**](DefaultApi.md#objects_documents_doc_id_get) | **GET** /objects/documents/{doc_id} | Retrieve Document
[**objects_documents_doc_id_lock_delete**](DefaultApi.md#objects_documents_doc_id_lock_delete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock
[**objects_documents_doc_id_lock_get**](DefaultApi.md#objects_documents_doc_id_lock_get) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock
[**objects_documents_doc_id_lock_post**](DefaultApi.md#objects_documents_doc_id_lock_post) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock
[**objects_documents_doc_id_major_version_minor_version_attachments_file_get**](DefaultApi.md#objects_documents_doc_id_major_version_minor_version_attachments_file_get) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments
[**objects_documents_doc_id_post**](DefaultApi.md#objects_documents_doc_id_post) | **POST** /objects/documents/{doc_id} | Create Single Document Version
[**objects_documents_doc_id_put**](DefaultApi.md#objects_documents_doc_id_put) | **PUT** /objects/documents/{doc_id} | Update Single Document
[**objects_documents_doc_id_renditions_get**](DefaultApi.md#objects_documents_doc_id_renditions_get) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions
[**objects_documents_doc_id_renditions_rendition_type_delete**](DefaultApi.md#objects_documents_doc_id_renditions_rendition_type_delete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition
[**objects_documents_doc_id_renditions_rendition_type_get**](DefaultApi.md#objects_documents_doc_id_renditions_rendition_type_get) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File
[**objects_documents_doc_id_renditions_rendition_type_post**](DefaultApi.md#objects_documents_doc_id_renditions_rendition_type_post) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition
[**objects_documents_doc_id_renditions_rendition_type_put**](DefaultApi.md#objects_documents_doc_id_renditions_rendition_type_put) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition
[**objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete**](DefaultApi.md#objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document
[**objects_documents_doc_id_version_major_version_minor_version_attachments_get**](DefaultApi.md#objects_documents_doc_id_version_major_version_minor_version_attachments_get) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments
[**objects_documents_doc_id_versions_get**](DefaultApi.md#objects_documents_doc_id_versions_get) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type
[**objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version
[**objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions
[**objects_documents_doc_id_versions_major_version_minor_version_delete**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_delete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV
[**objects_documents_doc_id_versions_major_version_minor_version_events_post**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_events_post) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event
[**objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations
[**objects_documents_doc_id_versions_major_version_minor_version_file_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_file_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File
[**objects_documents_doc_id_versions_major_version_minor_version_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_put**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_put) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_post**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_post) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get**](DefaultApi.md#objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File
[**objects_documents_get**](DefaultApi.md#objects_documents_get) | **GET** /objects/documents | Retrieve All Documents
[**objects_documents_id_roles_get**](DefaultApi.md#objects_documents_id_roles_get) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles
[**objects_documents_id_roles_post**](DefaultApi.md#objects_documents_id_roles_post) | **POST** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document
[**objects_documents_id_roles_role_name_get**](DefaultApi.md#objects_documents_id_roles_role_name_get) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get**](DefaultApi.md#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**](DefaultApi.md#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**](DefaultApi.md#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action
[**objects_documents_lifecycle_actions_post**](DefaultApi.md#objects_documents_lifecycle_actions_post) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents
[**objects_documents_lifecycle_actions_user_action_name_put**](DefaultApi.md#objects_documents_lifecycle_actions_user_action_name_put) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions
[**objects_documents_post**](DefaultApi.md#objects_documents_post) | **POST** /objects/documents | Create Single Document
[**objects_documents_relationships_batch_delete**](DefaultApi.md#objects_documents_relationships_batch_delete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships
[**objects_documents_relationships_batch_post**](DefaultApi.md#objects_documents_relationships_batch_post) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships
[**objects_documents_renditions_batch_delete**](DefaultApi.md#objects_documents_renditions_batch_delete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions
[**objects_documents_renditions_batch_post**](DefaultApi.md#objects_documents_renditions_batch_post) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions
[**objects_documents_roles_batch_delete**](DefaultApi.md#objects_documents_roles_batch_delete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders
[**objects_documents_roles_batch_post**](DefaultApi.md#objects_documents_roles_batch_post) | **POST** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
[**objects_documents_templates_get**](DefaultApi.md#objects_documents_templates_get) | **GET** /objects/documents/templates | Retrieve Document Template Collection
[**objects_documents_templates_post**](DefaultApi.md#objects_documents_templates_post) | **POST** /objects/documents/templates | Create Single Document Template
[**objects_documents_templates_put**](DefaultApi.md#objects_documents_templates_put) | **PUT** /objects/documents/templates | Update Multiple Document Templates
[**objects_documents_templates_template_name_delete**](DefaultApi.md#objects_documents_templates_template_name_delete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template
[**objects_documents_templates_template_name_file_get**](DefaultApi.md#objects_documents_templates_template_name_file_get) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File
[**objects_documents_templates_template_name_get**](DefaultApi.md#objects_documents_templates_template_name_get) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes
[**objects_documents_templates_template_name_put**](DefaultApi.md#objects_documents_templates_template_name_put) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template
[**objects_documents_tokens_post**](DefaultApi.md#objects_documents_tokens_post) | **POST** /objects/documents/tokens | Document Tokens
[**objects_documents_versions_batch_actions_fileextract_post**](DefaultApi.md#objects_documents_versions_batch_actions_fileextract_post) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions
[**objects_documents_versions_batch_delete**](DefaultApi.md#objects_documents_versions_batch_delete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions
[**objects_documents_versions_batch_post**](DefaultApi.md#objects_documents_versions_batch_post) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions
[**objects_domain_get**](DefaultApi.md#objects_domain_get) | **GET** /objects/domain | Retrieve Domain Information
[**objects_domains_get**](DefaultApi.md#objects_domains_get) | **GET** /objects/domains | Retrieve Domains
[**objects_edl_matched_documents_batch_actions_add_post**](DefaultApi.md#objects_edl_matched_documents_batch_actions_add_post) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents
[**objects_edl_matched_documents_batch_actions_remove_post**](DefaultApi.md#objects_edl_matched_documents_batch_actions_remove_post) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents
[**objects_groups_auto_get**](DefaultApi.md#objects_groups_auto_get) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups
[**objects_groups_get**](DefaultApi.md#objects_groups_get) | **GET** /objects/groups | Retrieve All Groups
[**objects_groups_group_id_delete**](DefaultApi.md#objects_groups_group_id_delete) | **DELETE** /objects/groups/{group_id} | Delete Group
[**objects_groups_group_id_get**](DefaultApi.md#objects_groups_group_id_get) | **GET** /objects/groups/{group_id} | Retrieve Group
[**objects_groups_group_id_put**](DefaultApi.md#objects_groups_group_id_put) | **PUT** /objects/groups/{group_id} | Update Group
[**objects_groups_post**](DefaultApi.md#objects_groups_post) | **POST** /objects/groups | Create Group 
[**objects_licenses_get**](DefaultApi.md#objects_licenses_get) | **GET** /objects/licenses | Retrieve Application License Usage
[**objects_objectworkflows_actions_get**](DefaultApi.md#objects_objectworkflows_actions_get) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows
[**objects_objectworkflows_actions_workflow_name_get**](DefaultApi.md#objects_objectworkflows_actions_workflow_name_get) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details
[**objects_objectworkflows_actions_workflow_name_post**](DefaultApi.md#objects_objectworkflows_actions_workflow_name_post) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow
[**objects_objectworkflows_get**](DefaultApi.md#objects_objectworkflows_get) | **GET** /objects/objectworkflows | Retrieve Workflows
[**objects_objectworkflows_tasks_get**](DefaultApi.md#objects_objectworkflows_tasks_get) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks
[**objects_objectworkflows_tasks_task_id_actions_accept_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_accept_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_cancel_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_cancel_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_complete_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_complete_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_get**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_get) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions
[**objects_objectworkflows_tasks_task_id_actions_mdwaccept_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_mdwaccept_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content
[**objects_objectworkflows_tasks_task_id_actions_mdwreassign_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_mdwreassign_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_reassign_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_reassign_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_task_action_get**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_task_action_get) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details
[**objects_objectworkflows_tasks_task_id_actions_undoaccept_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_undoaccept_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance
[**objects_objectworkflows_tasks_task_id_actions_updateduedate_post**](DefaultApi.md#objects_objectworkflows_tasks_task_id_actions_updateduedate_post) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date
[**objects_objectworkflows_tasks_task_id_get**](DefaultApi.md#objects_objectworkflows_tasks_task_id_get) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details
[**objects_objectworkflows_workflow_id_actions_get**](DefaultApi.md#objects_objectworkflows_workflow_id_actions_get) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions
[**objects_objectworkflows_workflow_id_actions_workflow_action_get**](DefaultApi.md#objects_objectworkflows_workflow_id_actions_workflow_action_get) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details
[**objects_objectworkflows_workflow_id_actions_workflow_action_post**](DefaultApi.md#objects_objectworkflows_workflow_id_actions_workflow_action_post) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action
[**objects_objectworkflows_workflow_id_get**](DefaultApi.md#objects_objectworkflows_workflow_id_get) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details
[**objects_picklists_get**](DefaultApi.md#objects_picklists_get) | **GET** /objects/picklists | Retrieve All Picklists
[**objects_picklists_picklist_name_get**](DefaultApi.md#objects_picklists_picklist_name_get) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values
[**objects_picklists_picklist_name_picklist_value_name_delete**](DefaultApi.md#objects_picklists_picklist_name_picklist_value_name_delete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value
[**objects_picklists_picklist_name_picklist_value_name_put**](DefaultApi.md#objects_picklists_picklist_name_picklist_value_name_put) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value
[**objects_picklists_picklist_name_post**](DefaultApi.md#objects_picklists_picklist_name_post) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values
[**objects_picklists_picklist_name_put**](DefaultApi.md#objects_picklists_picklist_name_put) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label
[**objects_sandbox_actions_buildproduction_post**](DefaultApi.md#objects_sandbox_actions_buildproduction_post) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault
[**objects_sandbox_actions_promoteproduction_post**](DefaultApi.md#objects_sandbox_actions_promoteproduction_post) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production
[**objects_sandbox_actions_recheckusage_post**](DefaultApi.md#objects_sandbox_actions_recheckusage_post) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit
[**objects_sandbox_batch_changesize_post**](DefaultApi.md#objects_sandbox_batch_changesize_post) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size
[**objects_sandbox_entitlements_set_post**](DefaultApi.md#objects_sandbox_entitlements_set_post) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements
[**objects_sandbox_get**](DefaultApi.md#objects_sandbox_get) | **GET** /objects/sandbox | Retrieve Sandboxes
[**objects_sandbox_name_delete**](DefaultApi.md#objects_sandbox_name_delete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox
[**objects_sandbox_post**](DefaultApi.md#objects_sandbox_post) | **POST** /objects/sandbox | Create or Refresh Sandbox
[**objects_sandbox_snapshot_api_name_actions_update_post**](DefaultApi.md#objects_sandbox_snapshot_api_name_actions_update_post) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot
[**objects_sandbox_snapshot_api_name_actions_upgrade_post**](DefaultApi.md#objects_sandbox_snapshot_api_name_actions_upgrade_post) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot
[**objects_sandbox_snapshot_api_name_delete**](DefaultApi.md#objects_sandbox_snapshot_api_name_delete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot
[**objects_sandbox_snapshot_get**](DefaultApi.md#objects_sandbox_snapshot_get) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots
[**objects_sandbox_snapshot_post**](DefaultApi.md#objects_sandbox_snapshot_post) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot
[**objects_sandbox_vault_id_actions_refresh_post**](DefaultApi.md#objects_sandbox_vault_id_actions_refresh_post) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot
[**objects_sandbox_vault_id_get**](DefaultApi.md#objects_sandbox_vault_id_get) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID
[**objects_securitypolicies_get**](DefaultApi.md#objects_securitypolicies_get) | **GET** /objects/securitypolicies | Retrieve All Security Policies
[**objects_securitypolicies_security_policy_name_get**](DefaultApi.md#objects_securitypolicies_security_policy_name_get) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy
[**objects_users_get**](DefaultApi.md#objects_users_get) | **GET** /objects/users/ | Retrieve All Users
[**objects_users_id_get**](DefaultApi.md#objects_users_id_get) | **GET** /objects/users/{id} | Retrieve User
[**objects_users_id_permissions_get**](DefaultApi.md#objects_users_id_permissions_get) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions
[**objects_users_id_put**](DefaultApi.md#objects_users_id_put) | **PUT** /objects/users/{id} | Update Single User
[**objects_users_me_get**](DefaultApi.md#objects_users_me_get) | **GET** /objects/users/me | Validate Session User
[**objects_users_me_password_post**](DefaultApi.md#objects_users_me_password_post) | **POST** /objects/users/me/password | Change My Password
[**objects_users_me_permissions_get**](DefaultApi.md#objects_users_me_permissions_get) | **GET** /objects/users/me/permissions | Retrieve My User Permissions
[**objects_users_me_put**](DefaultApi.md#objects_users_me_put) | **PUT** /objects/users/me | Update My User
[**objects_users_post**](DefaultApi.md#objects_users_post) | **POST** /objects/users | Create Single User
[**objects_users_put**](DefaultApi.md#objects_users_put) | **PUT** /objects/users | Update Multiple Users
[**objects_users_user_id_delete**](DefaultApi.md#objects_users_user_id_delete) | **DELETE** /objects/users/{user_id} | Disable User
[**objects_users_user_id_vault_membership_vault_id_put**](DefaultApi.md#objects_users_user_id_vault_membership_vault_id_put) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership
[**objects_vault_actions_compare_post**](DefaultApi.md#objects_vault_actions_compare_post) | **POST** /objects/vault/actions/compare | Vault Compare
[**objects_vault_actions_configreport_post**](DefaultApi.md#objects_vault_actions_configreport_post) | **POST** /objects/vault/actions/configreport | Vault Configuration Report
[**query_components_post**](DefaultApi.md#query_components_post) | **POST** /query/components | Component Definition Query
[**query_next_page_post**](DefaultApi.md#query_next_page_post) | **POST** /query/{next_page} | Next Page URL
[**query_post**](DefaultApi.md#query_post) | **POST** /query | Submitting a Query
[**query_previous_page_post**](DefaultApi.md#query_previous_page_post) | **POST** /query/{previous_page} | Previous Page URL
[**scim_v2_me_get**](DefaultApi.md#scim_v2_me_get) | **GET** /scim/v2/Me | Retrieve Current User with SCIM
[**scim_v2_me_put**](DefaultApi.md#scim_v2_me_put) | **PUT** /scim/v2/Me | Update Current User with SCIM
[**scim_v2_resource_types_get**](DefaultApi.md#scim_v2_resource_types_get) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types
[**scim_v2_resource_types_type_get**](DefaultApi.md#scim_v2_resource_types_type_get) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type
[**scim_v2_schemas_get**](DefaultApi.md#scim_v2_schemas_get) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information
[**scim_v2_schemas_id_get**](DefaultApi.md#scim_v2_schemas_id_get) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information
[**scim_v2_service_provider_config_get**](DefaultApi.md#scim_v2_service_provider_config_get) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider
[**scim_v2_type_get**](DefaultApi.md#scim_v2_type_get) | **GET** /scim/v2/{type} | Retrieve SCIM Resources
[**scim_v2_type_id_get**](DefaultApi.md#scim_v2_type_id_get) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource
[**scim_v2_users_get**](DefaultApi.md#scim_v2_users_get) | **GET** /scim/v2/Users | Retrieve All Users with SCIM
[**scim_v2_users_id_get**](DefaultApi.md#scim_v2_users_id_get) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM
[**scim_v2_users_id_put**](DefaultApi.md#scim_v2_users_id_put) | **PUT** /scim/v2/Users/{id} | Update User with SCIM
[**scim_v2_users_post**](DefaultApi.md#scim_v2_users_post) | **POST** /scim/v2/Users | Create User with SCIM
[**services_certificate_cert_id_get**](DefaultApi.md#services_certificate_cert_id_get) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate
[**services_configuration_mode_actions_disable_post**](DefaultApi.md#services_configuration_mode_actions_disable_post) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode
[**services_configuration_mode_actions_enable_post**](DefaultApi.md#services_configuration_mode_actions_enable_post) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode
[**services_directdata_files_get**](DefaultApi.md#services_directdata_files_get) | **GET** /services/directdata/files | Retrieve Available Direct Data Files
[**services_directdata_files_name_get**](DefaultApi.md#services_directdata_files_name_get) | **GET** /services/directdata/files/{name} | Download Direct Data File
[**services_file_staging_items_content_item_get**](DefaultApi.md#services_file_staging_items_content_item_get) | **GET** /services/file_staging/items/content/{item} | Download Item Content
[**services_file_staging_items_item_delete**](DefaultApi.md#services_file_staging_items_item_delete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder
[**services_file_staging_items_item_get**](DefaultApi.md#services_file_staging_items_item_get) | **GET** /services/file_staging/items/{item} | List Items at a Path
[**services_file_staging_items_item_put**](DefaultApi.md#services_file_staging_items_item_put) | **PUT** /services/file_staging/items/{item} | Update Folder or File
[**services_file_staging_items_post**](DefaultApi.md#services_file_staging_items_post) | **POST** /services/file_staging/items | Create Folder or File
[**services_file_staging_upload_get**](DefaultApi.md#services_file_staging_upload_get) | **GET** /services/file_staging/upload/ | List Upload Sessions
[**services_file_staging_upload_post**](DefaultApi.md#services_file_staging_upload_post) | **POST** /services/file_staging/upload | Create Resumable Upload Session
[**services_file_staging_upload_upload_session_id_delete**](DefaultApi.md#services_file_staging_upload_upload_session_id_delete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session
[**services_file_staging_upload_upload_session_id_get**](DefaultApi.md#services_file_staging_upload_upload_session_id_get) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details
[**services_file_staging_upload_upload_session_id_parts_get**](DefaultApi.md#services_file_staging_upload_upload_session_id_parts_get) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session
[**services_file_staging_upload_upload_session_id_post**](DefaultApi.md#services_file_staging_upload_upload_session_id_post) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session
[**services_file_staging_upload_upload_session_id_put**](DefaultApi.md#services_file_staging_upload_upload_session_id_put) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session
[**services_jobs_histories_get**](DefaultApi.md#services_jobs_histories_get) | **GET** /services/jobs/histories | Retrieve Job Histories
[**services_jobs_job_id_errors_get**](DefaultApi.md#services_jobs_job_id_errors_get) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors
[**services_jobs_job_id_get**](DefaultApi.md#services_jobs_job_id_get) | **GET** /services/jobs/{job_id} | Retrieve Job Status
[**services_jobs_job_id_summary_get**](DefaultApi.md#services_jobs_job_id_summary_get) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary
[**services_jobs_job_id_tasks_get**](DefaultApi.md#services_jobs_job_id_tasks_get) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks
[**services_jobs_monitors_get**](DefaultApi.md#services_jobs_monitors_get) | **GET** /services/jobs/monitors | Retrieve Job Monitors
[**services_jobs_start_now_job_id_post**](DefaultApi.md#services_jobs_start_now_job_id_post) | **POST** /services/jobs/start_now/{job_id} | Start Job
[**services_loader_extract_post**](DefaultApi.md#services_loader_extract_post) | **POST** /services/loader/extract | Extract Data Files
[**services_loader_job_id_tasks_task_id_failurelog_get**](DefaultApi.md#services_loader_job_id_tasks_task_id_failurelog_get) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results
[**services_loader_job_id_tasks_task_id_results_get**](DefaultApi.md#services_loader_job_id_tasks_task_id_results_get) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results
[**services_loader_job_id_tasks_task_id_results_renditions_get**](DefaultApi.md#services_loader_job_id_tasks_task_id_results_renditions_get) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results
[**services_loader_job_id_tasks_task_id_successlog_get**](DefaultApi.md#services_loader_job_id_tasks_task_id_successlog_get) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results
[**services_loader_load_post**](DefaultApi.md#services_loader_load_post) | **POST** /services/loader/load | Load Data Objects
[**services_package_actions_validate_post**](DefaultApi.md#services_package_actions_validate_post) | **POST** /services/package/actions/validate | Validate Package
[**services_package_post**](DefaultApi.md#services_package_post) | **POST** /services/package | Export Package
[**services_package_put**](DefaultApi.md#services_package_put) | **PUT** /services/package | Import Package
[**services_queues_get**](DefaultApi.md#services_queues_get) | **GET** /services/queues | Retrieve All Queues
[**services_queues_queue_name_actions_disable_delivery_put**](DefaultApi.md#services_queues_queue_name_actions_disable_delivery_put) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery
[**services_queues_queue_name_actions_enable_delivery_put**](DefaultApi.md#services_queues_queue_name_actions_enable_delivery_put) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery
[**services_queues_queue_name_actions_reset_put**](DefaultApi.md#services_queues_queue_name_actions_reset_put) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue
[**services_queues_queue_name_get**](DefaultApi.md#services_queues_queue_name_get) | **GET** /services/queues/{queue_name} | Retrieve Queue Status
[**services_vobject_vault_package_v_package_id_actions_validate_post**](DefaultApi.md#services_vobject_vault_package_v_package_id_actions_validate_post) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package
[**session_delete**](DefaultApi.md#session_delete) | **DELETE** /session | End Session
[**uicode_distributions_distribution_name_code_get**](DefaultApi.md#uicode_distributions_distribution_name_code_get) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution
[**uicode_distributions_distribution_name_delete**](DefaultApi.md#uicode_distributions_distribution_name_delete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution
[**uicode_distributions_distribution_name_get**](DefaultApi.md#uicode_distributions_distribution_name_get) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata
[**uicode_distributions_get**](DefaultApi.md#uicode_distributions_get) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata
[**uicode_distributions_post**](DefaultApi.md#uicode_distributions_post) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution
[**vobject_vault_package_v_package_id_actions_deploy_post**](DefaultApi.md#vobject_vault_package_v_package_id_actions_deploy_post) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package
[**vobject_vault_package_v_package_id_actions_deploy_results_get**](DefaultApi.md#vobject_vault_package_v_package_id_actions_deploy_results_get) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results
[**vobjects_cascadedelete_results_object_name_job_status_job_id_get**](DefaultApi.md#vobjects_cascadedelete_results_object_name_job_status_job_id_get) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job
[**vobjects_deepcopy_results_object_name_job_status_job_id_get**](DefaultApi.md#vobjects_deepcopy_results_object_name_job_status_job_id_get) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job
[**vobjects_edl_item_v_actions_createplaceholder_post**](DefaultApi.md#vobjects_edl_item_v_actions_createplaceholder_post) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item
[**vobjects_merges_job_id_log_get**](DefaultApi.md#vobjects_merges_job_id_log_get) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log
[**vobjects_merges_job_id_results_get**](DefaultApi.md#vobjects_merges_job_id_results_get) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results
[**vobjects_merges_job_id_status_get**](DefaultApi.md#vobjects_merges_job_id_status_get) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status
[**vobjects_object_name_actions_action_name_post**](DefaultApi.md#vobjects_object_name_actions_action_name_post) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records
[**vobjects_object_name_actions_changetype_post**](DefaultApi.md#vobjects_object_name_actions_changetype_post) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type
[**vobjects_object_name_actions_merge_post**](DefaultApi.md#vobjects_object_name_actions_merge_post) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge
[**vobjects_object_name_actions_recalculaterollups_get**](DefaultApi.md#vobjects_object_name_actions_recalculaterollups_get) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status
[**vobjects_object_name_actions_recalculaterollups_post**](DefaultApi.md#vobjects_object_name_actions_recalculaterollups_post) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields
[**vobjects_object_name_actions_updatecorporatecurrency_put**](DefaultApi.md#vobjects_object_name_actions_updatecorporatecurrency_put) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields
[**vobjects_object_name_attachments_batch_delete**](DefaultApi.md#vobjects_object_name_attachments_batch_delete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments
[**vobjects_object_name_attachments_batch_post**](DefaultApi.md#vobjects_object_name_attachments_batch_post) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments
[**vobjects_object_name_attachments_batch_put**](DefaultApi.md#vobjects_object_name_attachments_batch_put) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions
[**vobjects_object_name_delete**](DefaultApi.md#vobjects_object_name_delete) | **DELETE** /vobjects/{object_name} | Delete Object Records
[**vobjects_object_name_id_roles_role_name_get**](DefaultApi.md#vobjects_object_name_id_roles_role_name_get) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles
[**vobjects_object_name_object_record_id_actions_action_name_get**](DefaultApi.md#vobjects_object_name_object_record_id_actions_action_name_get) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details
[**vobjects_object_name_object_record_id_actions_action_name_post**](DefaultApi.md#vobjects_object_name_object_record_id_actions_action_name_post) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record
[**vobjects_object_name_object_record_id_actions_cascadedelete_post**](DefaultApi.md#vobjects_object_name_object_record_id_actions_cascadedelete_post) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record
[**vobjects_object_name_object_record_id_actions_deepcopy_post**](DefaultApi.md#vobjects_object_name_object_record_id_actions_deepcopy_post) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record
[**vobjects_object_name_object_record_id_actions_get**](DefaultApi.md#vobjects_object_name_object_record_id_actions_get) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions
[**vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File
[**vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post**](DefaultApi.md#vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File
[**vobjects_object_name_object_record_id_attachment_fields_file_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachment_fields_file_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files
[**vobjects_object_name_object_record_id_attachments_attachment_id_delete**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_delete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment
[**vobjects_object_name_object_record_id_attachments_attachment_id_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata
[**vobjects_object_name_object_record_id_attachments_attachment_id_put**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_put) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions
[**vobjects_object_name_object_record_id_attachments_file_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_file_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files
[**vobjects_object_name_object_record_id_attachments_get**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_get) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments
[**vobjects_object_name_object_record_id_attachments_post**](DefaultApi.md#vobjects_object_name_object_record_id_attachments_post) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment
[**vobjects_object_name_object_record_id_audittrail_get**](DefaultApi.md#vobjects_object_name_object_record_id_audittrail_get) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record
[**vobjects_object_name_object_record_id_get**](DefaultApi.md#vobjects_object_name_object_record_id_get) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record
[**vobjects_object_name_post**](DefaultApi.md#vobjects_object_name_post) | **POST** /vobjects/{object_name} | Create &amp; Upsert Object Records
[**vobjects_object_name_put**](DefaultApi.md#vobjects_object_name_put) | **PUT** /vobjects/{object_name} | Update Object Records
[**vobjects_object_name_roles_delete**](DefaultApi.md#vobjects_object_name_roles_delete) | **DELETE** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records
[**vobjects_object_name_roles_post**](DefaultApi.md#vobjects_object_name_roles_post) | **POST** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records
[**vobjects_outbound_package_v_package_id_dependencies_get**](DefaultApi.md#vobjects_outbound_package_v_package_id_dependencies_get) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies


# **api_get**
> api_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> api_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve API Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **api_mdl_components_component_type_and_record_name_files_get**
> api_mdl_components_component_type_and_record_name_files_get(_api::DefaultApi, component_type_and_record_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> api_mdl_components_component_type_and_record_name_files_get(_api::DefaultApi, response_stream::Channel, component_type_and_record_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Content File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**component_type_and_record_name** | **String** | The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **api_mdl_components_component_type_and_record_name_get**
> api_mdl_components_component_type_and_record_name_get(_api::DefaultApi, component_type_and_record_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> api_mdl_components_component_type_and_record_name_get(_api::DefaultApi, response_stream::Channel, component_type_and_record_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Component Record (MDL)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**component_type_and_record_name** | **String** | The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **api_mdl_execute_async_job_id_results_get**
> api_mdl_execute_async_job_id_results_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> api_mdl_execute_async_job_id_results_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Asynchronous MDL Script Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **api_mdl_execute_async_post**
> api_mdl_execute_async_post(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> api_mdl_execute_async_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Execute MDL Script Asynchronously

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **api_mdl_execute_post**
> api_mdl_execute_post(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> api_mdl_execute_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Execute MDL Script

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **api_mdl_files_post**
> api_mdl_files_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> api_mdl_files_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Upload Content File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **audittrail_audit_trail_type_get**
> audittrail_audit_trail_type_get(_api::DefaultApi, audit_trail_type::String; start_date=nothing, end_date=nothing, all_dates=nothing, format_result=nothing, limit=nothing, offset=nothing, objects=nothing, events=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> audittrail_audit_trail_type_get(_api::DefaultApi, response_stream::Channel, audit_trail_type::String; start_date=nothing, end_date=nothing, all_dates=nothing, format_result=nothing, limit=nothing, offset=nothing, objects=nothing, events=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Audit Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**audit_trail_type** | **String** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **String** | Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [default to nothing]
 **end_date** | **String** | Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [default to nothing]
 **all_dates** | **String** | Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [default to nothing]
 **format_result** | **String** | To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [default to nothing]
 **limit** | **String** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [default to nothing]
 **offset** | **String** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [default to nothing]
 **objects** | **String** | This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects. | [default to nothing]
 **events** | **String** | This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **auth_discovery_post**
> auth_discovery_post(_api::DefaultApi; accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> auth_discovery_post(_api::DefaultApi, response_stream::Channel; accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Authentication Type Discovery

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **auth_oauth_session_oath_oidc_profile_id_post**
> auth_oauth_session_oath_oidc_profile_id_post(_api::DefaultApi, oath_oidc_profile_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> auth_oauth_session_oath_oidc_profile_id_post(_api::DefaultApi, response_stream::Channel, oath_oidc_profile_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

OAuth 2.0 / OpenID Connect

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**oath_oidc_profile_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **auth_post**
> auth_post(_api::DefaultApi; content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> auth_post(_api::DefaultApi, response_stream::Channel; content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

User Name and Password

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_class_name_delete**
> code_class_name_delete(_api::DefaultApi, class_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_class_name_delete(_api::DefaultApi, response_stream::Channel, class_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Source Code File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**class_name** | **String** | The fully qualified class name of your file. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_class_name_disable_put**
> code_class_name_disable_put(_api::DefaultApi, class_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_class_name_disable_put(_api::DefaultApi, response_stream::Channel, class_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Disable Vault Extension

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**class_name** | **String** | The fully qualified class name of your file. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_class_name_enable_put**
> code_class_name_enable_put(_api::DefaultApi, class_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_class_name_enable_put(_api::DefaultApi, response_stream::Channel, class_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Enable Vault Extension

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**class_name** | **String** | The fully qualified class name of your file. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_class_name_get**
> code_class_name_get(_api::DefaultApi, class_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_class_name_get(_api::DefaultApi, response_stream::Channel, class_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Single Source Code File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**class_name** | **String** | The fully qualified class name of your file. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_profiler_get**
> code_profiler_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_profiler_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Profiling Sessions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_profiler_post**
> code_profiler_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_profiler_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Profiling Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_profiler_session_name_actions_end_post**
> code_profiler_session_name_actions_end_post(_api::DefaultApi, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_profiler_session_name_actions_end_post(_api::DefaultApi, response_stream::Channel, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

End Profiling Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**session_name** | **String** | The name of the session, for example,  baseline__c. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_profiler_session_name_delete**
> code_profiler_session_name_delete(_api::DefaultApi, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_profiler_session_name_delete(_api::DefaultApi, response_stream::Channel, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Profiling Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**session_name** | **String** | The name of the session, for example,  baseline__c. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_profiler_session_name_get**
> code_profiler_session_name_get(_api::DefaultApi, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_profiler_session_name_get(_api::DefaultApi, response_stream::Channel, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Profiling Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**session_name** | **String** | The name of the session, for example,  baseline__c. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_profiler_session_name_results_get**
> code_profiler_session_name_results_get(_api::DefaultApi, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_profiler_session_name_results_get(_api::DefaultApi, response_stream::Channel, session_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Profiling Session Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**session_name** | **String** | The name of the session, for example,  baseline__c. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **code_put**
> code_put(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> code_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Add or Replace Single Source Code File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_or_template_actions_listnodes_post**
> composites_trees_edl_hierarchy_or_template_actions_listnodes_post(_api::DefaultApi, edl_hierarchy_or_template::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> composites_trees_edl_hierarchy_or_template_actions_listnodes_post(_api::DefaultApi, response_stream::Channel, edl_hierarchy_or_template::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Specific Root Nodes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**edl_hierarchy_or_template** | **String** | Choose to retrieve either edl_hierarchy__v or edl_template__v |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_or_template_get**
> composites_trees_edl_hierarchy_or_template_get(_api::DefaultApi, edl_hierarchy_or_template::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> composites_trees_edl_hierarchy_or_template_get(_api::DefaultApi, response_stream::Channel, edl_hierarchy_or_template::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Root Nodes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**edl_hierarchy_or_template** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_v_parent_node_id_children_get**
> composites_trees_edl_hierarchy_v_parent_node_id_children_get(_api::DefaultApi, parent_node_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> composites_trees_edl_hierarchy_v_parent_node_id_children_get(_api::DefaultApi, response_stream::Channel, parent_node_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve a Node's Children

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**parent_node_id** | **String** | The ID of a parent node in the hierarchy. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_v_parent_node_id_children_put**
> composites_trees_edl_hierarchy_v_parent_node_id_children_put(_api::DefaultApi, parent_node_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> composites_trees_edl_hierarchy_v_parent_node_id_children_put(_api::DefaultApi, response_stream::Channel, parent_node_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Node Order

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**parent_node_id** | **String** | The ID of a parent node in the hierarchy. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_component_type_and_record_name_get**
> configuration_component_type_and_record_name_get(_api::DefaultApi, component_type_and_record_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_component_type_and_record_name_get(_api::DefaultApi, response_stream::Channel, component_type_and_record_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Component Record (XML/JSON)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**component_type_and_record_name** | **String** | The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **String** | When localized (translated) strings are available, retrieve them by setting loc to true. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_component_type_get**
> configuration_component_type_get(_api::DefaultApi, component_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_component_type_get(_api::DefaultApi, response_stream::Channel, component_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Component Record Collection

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**component_type** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_object_name_and_object_type_get**
> configuration_object_name_and_object_type_get(_api::DefaultApi, object_name_and_object_type::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_object_name_and_object_type_get(_api::DefaultApi, response_stream::Channel, object_name_and_object_type::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Details from a Specific Object

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name_and_object_type** | **String** | The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **String** | When localized (translated) strings are available, retrieve them by setting loc to true. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_objecttype_get**
> configuration_objecttype_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_objecttype_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Details from All Object Types

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_delete**
> configuration_role_assignment_rule_delete(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_role_assignment_rule_delete(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Lifecycle Role Assignment Override Rules

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_get**
> configuration_role_assignment_rule_get(_api::DefaultApi; lifecycle_v=nothing, role_v=nothing, product_v=nothing, country_v=nothing, study_v=nothing, study_country_v=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_role_assignment_rule_get(_api::DefaultApi, response_stream::Channel; lifecycle_v=nothing, role_v=nothing, product_v=nothing, country_v=nothing, study_v=nothing, study_country_v=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Lifecycle Role Assignment Rules (Default & Override)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycle_v** | **String** | Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c | [default to nothing]
 **role_v** | **String** | Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c | [default to nothing]
 **product_v** | **String** | Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap | [default to nothing]
 **country_v** | **String** | Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States | [default to nothing]
 **study_v** | **String** | In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study | [default to nothing]
 **study_country_v** | **String** | In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_post**
> configuration_role_assignment_rule_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_role_assignment_rule_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Lifecycle Role Assignment Override Rules

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_put**
> configuration_role_assignment_rule_put(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> configuration_role_assignment_rule_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Lifecycle Role Assignment Rules (Default & Override)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delegation_login_post**
> delegation_login_post(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> delegation_login_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Delegated Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** | The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delegation_vaults_get**
> delegation_vaults_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> delegation_vaults_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Delegations

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **keep_alive_post**
> keep_alive_post(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> keep_alive_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Session Keep Alive

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **limits_get**
> limits_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> limits_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Limits on Objects

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_api_usage_get**
> logs_api_usage_get(_api::DefaultApi; date=nothing, log_format=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_api_usage_get(_api::DefaultApi, response_stream::Channel; date=nothing, log_format=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Daily API Usage

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String** | The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [default to nothing]
 **log_format** | **String** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_code_debug_get**
> logs_code_debug_get(_api::DefaultApi; user_id=nothing, include_inactive=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_code_debug_get(_api::DefaultApi, response_stream::Channel; user_id=nothing, include_inactive=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Debug Logs

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String** | Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [default to nothing]
 **include_inactive** | **Bool** | Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_code_debug_id_actions_reset_delete**
> logs_code_debug_id_actions_reset_delete(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_code_debug_id_actions_reset_delete(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Debug Log

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The ID of the debug log to delete. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_code_debug_id_actions_reset_post**
> logs_code_debug_id_actions_reset_post(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_code_debug_id_actions_reset_post(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Reset Debug Log

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The ID of the debug log to delete. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_code_debug_id_files_get**
> logs_code_debug_id_files_get(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_code_debug_id_files_get(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Debug Log Files

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The ID of the debug log to download. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_code_debug_id_get**
> logs_code_debug_id_get(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_code_debug_id_get(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Single Debug Log

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The ID of the debug log to retrieve. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_code_debug_post**
> logs_code_debug_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_code_debug_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Debug Log

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **logs_code_runtime_get**
> logs_code_runtime_get(_api::DefaultApi; date=nothing, log_format=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> logs_code_runtime_get(_api::DefaultApi, response_stream::Channel; date=nothing, log_format=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download SDK Runtime Log

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String** |  | [default to nothing]
 **log_format** | **String** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **messages_message_type_actions_import_post**
> messages_message_type_actions_import_post(_api::DefaultApi, message_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> messages_message_type_actions_import_post(_api::DefaultApi, response_stream::Channel, message_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Import Bulk Translation File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**message_type** | **String** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **messages_message_type_language_lang_actions_export_post**
> messages_message_type_language_lang_actions_export_post(_api::DefaultApi, message_type::String, lang::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> messages_message_type_language_lang_actions_export_post(_api::DefaultApi, response_stream::Channel, message_type::String, lang::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Bulk Translation File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**message_type** | **String** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. |
**lang** | **String** | A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_audittrail_audit_trail_type_get**
> metadata_audittrail_audit_trail_type_get(_api::DefaultApi, audit_trail_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_audittrail_audit_trail_type_get(_api::DefaultApi, response_stream::Channel, audit_trail_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Audit Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**audit_trail_type** | **String** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_audittrail_get**
> metadata_audittrail_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_audittrail_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Audit Types

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_components_component_type_get**
> metadata_components_component_type_get(_api::DefaultApi, component_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_components_component_type_get(_api::DefaultApi, response_stream::Channel, component_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Component Type Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**component_type** | **String** | The component type name (Picklist, Docfield, Doctype, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_components_get**
> metadata_components_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_components_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Component Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_binders_templates_bindernodes_get**
> metadata_objects_binders_templates_bindernodes_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_binders_templates_bindernodes_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Template Node Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_binders_templates_get**
> metadata_objects_binders_templates_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_binders_templates_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Template Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_annotations_placemarks_types_placemark_type_get**
> metadata_objects_documents_annotations_placemarks_types_placemark_type_get(_api::DefaultApi, placemark_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_annotations_placemarks_types_placemark_type_get(_api::DefaultApi, response_stream::Channel, placemark_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Annotation Placemark Type Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**placemark_type** | **String** | The name of the placemark type. For example, sticky__sys. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_annotations_references_types_reference_type_get**
> metadata_objects_documents_annotations_references_types_reference_type_get(_api::DefaultApi, reference_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_annotations_references_types_reference_type_get(_api::DefaultApi, response_stream::Channel, reference_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Annotation Reference Type Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**reference_type** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_annotations_types_annotation_type_get**
> metadata_objects_documents_annotations_types_annotation_type_get(_api::DefaultApi, annotation_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_annotations_types_annotation_type_get(_api::DefaultApi, response_stream::Channel, annotation_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Annotation Type Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**annotation_type** | **String** | The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_events_event_type_types_event_subtype_get**
> metadata_objects_documents_events_event_type_types_event_subtype_get(_api::DefaultApi, event_type::String, event_subtype::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_events_event_type_types_event_subtype_get(_api::DefaultApi, response_stream::Channel, event_type::String, event_subtype::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Event SubType Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**event_type** | **String** | The event type. For example, distribution__v. |
**event_subtype** | **String** | The event subtype. For example, approved_email__v. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_events_get**
> metadata_objects_documents_events_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_events_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Event Types and Subtypes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_lock_get**
> metadata_objects_documents_lock_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_lock_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Lock Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_properties_find_common_post**
> metadata_objects_documents_properties_find_common_post(_api::DefaultApi; content_type=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_properties_find_common_post(_api::DefaultApi, response_stream::Channel; content_type=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Common Document Fields

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_properties_get**
> metadata_objects_documents_properties_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_properties_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Document Fields

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_templates_get**
> metadata_objects_documents_templates_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_templates_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Template Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_get**
> metadata_objects_documents_types_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_types_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Document Types

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_get**
> metadata_objects_documents_types_type_get(_api::DefaultApi, type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_types_type_get(_api::DefaultApi, response_stream::Channel, type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**type** | **String** | The document type. See Retrieve Document Types. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_relationships_get**
> metadata_objects_documents_types_type_relationships_get(_api::DefaultApi, type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_types_type_relationships_get(_api::DefaultApi, response_stream::Channel, type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Type Relationships

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**type** | **String** | The document type. See Retrieve Document Types. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get**
> metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(_api::DefaultApi, type::String, subtype::String, classification::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(_api::DefaultApi, response_stream::Channel, type::String, subtype::String, classification::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Classification

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**type** | **String** | The document type. See Retrieve Document Types. |
**subtype** | **String** | The document subtype. See Retrieve Document Types. |
**classification** | **String** | The document classification. See Retrieve Document Types. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_subtypes_subtype_get**
> metadata_objects_documents_types_type_subtypes_subtype_get(_api::DefaultApi, type::String, subtype::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_documents_types_type_subtypes_subtype_get(_api::DefaultApi, response_stream::Channel, type::String, subtype::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Subtype

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**type** | **String** | The document type. See Retrieve Document Types. |
**subtype** | **String** | The document subtype. See Retrieve Document Types. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_groups_get**
> metadata_objects_groups_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_groups_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Group Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_securitypolicies_get**
> metadata_objects_securitypolicies_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_securitypolicies_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Security Policy Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_objects_users_get**
> metadata_objects_users_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_objects_users_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve User Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_query_archived_documents_relationships_document_signature_sysr_get**
> metadata_query_archived_documents_relationships_document_signature_sysr_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_query_archived_documents_relationships_document_signature_sysr_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Archived Document Signature Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_query_documents_relationships_document_signature_sysr_get**
> metadata_query_documents_relationships_document_signature_sysr_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_query_documents_relationships_document_signature_sysr_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Signature Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_vobjects_get**
> metadata_vobjects_get(_api::DefaultApi; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_vobjects_get(_api::DefaultApi, response_stream::Channel; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Collection

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_actions_canceldeployment_post**
> metadata_vobjects_object_name_actions_canceldeployment_post(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_vobjects_object_name_actions_canceldeployment_post(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Cancel Raw Object Deployment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_fields_object_field_name_get**
> metadata_vobjects_object_name_fields_object_field_name_get(_api::DefaultApi, object_name::String, object_field_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_vobjects_object_name_fields_object_field_name_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_field_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Field Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_field_name** | **String** | The object field name value (id, name__v, external_id__v, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_get**
> metadata_vobjects_object_name_get(_api::DefaultApi, object_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_vobjects_object_name_get(_api::DefaultApi, response_stream::Channel, object_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_page_layouts_get**
> metadata_vobjects_object_name_page_layouts_get(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_vobjects_object_name_page_layouts_get(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Page Layouts

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_page_layouts_layout_name_get**
> metadata_vobjects_object_name_page_layouts_layout_name_get(_api::DefaultApi, object_name::String, layout_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> metadata_vobjects_object_name_page_layouts_layout_name_get(_api::DefaultApi, response_stream::Channel, object_name::String, layout_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Page Layout Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The name of the object from which to retrieve page layout metadata. |
**layout_name** | **String** | The name of the page layout from which to retrieve metadata. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **notifications_histories_get**
> notifications_histories_get(_api::DefaultApi; start_date=nothing, end_date=nothing, all_dates=nothing, format_result=nothing, limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> notifications_histories_get(_api::DefaultApi, response_stream::Channel; start_date=nothing, end_date=nothing, all_dates=nothing, format_result=nothing, limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Email Notification Histories

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **String** | Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. | [default to nothing]
 **end_date** | **String** | Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. | [default to nothing]
 **all_dates** | **Bool** | Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [default to nothing]
 **format_result** | **String** | To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [default to nothing]
 **limit** | **String** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [default to nothing]
 **offset** | **String** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **object_workflow_actions_action_get**
> object_workflow_actions_action_get(_api::DefaultApi, action::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> object_workflow_actions_action_get(_api::DefaultApi, response_stream::Channel, action::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Bulk Workflow Action Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**action** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **object_workflow_actions_action_post**
> object_workflow_actions_action_post(_api::DefaultApi, action::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> object_workflow_actions_action_post(_api::DefaultApi, response_stream::Channel, action::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Workflow Actions on Multiple Workflows

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**action** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **object_workflow_actions_canceltasks_post**
> object_workflow_actions_canceltasks_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> object_workflow_actions_canceltasks_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Cancel Workflow Tasks

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **object_workflow_actions_cancelworkflows_post**
> object_workflow_actions_cancelworkflows_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> object_workflow_actions_cancelworkflows_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Cancel Workflows

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **object_workflow_actions_get**
> object_workflow_actions_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> object_workflow_actions_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Bulk Workflow Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **object_workflow_actions_reassigntasks_post**
> object_workflow_actions_reassigntasks_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> object_workflow_actions_reassigntasks_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Reassign Workflow Tasks

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **object_workflow_actions_replaceworkflowowner_post**
> object_workflow_actions_replaceworkflowowner_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> object_workflow_actions_replaceworkflowowner_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Replace Workflow Owner

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_actions_export_job_id_results_get**
> objects_binders_actions_export_job_id_results_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_actions_export_job_id_results_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Export Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested export job. This is returned with the export binder requests above. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_actions_export_post**
> objects_binders_binder_id_actions_export_post(_api::DefaultApi, binder_id::String; source=nothing, renditiontype=nothing, docversion=nothing, attachments=nothing, __export__=nothing, docfield=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_actions_export_post(_api::DefaultApi, response_stream::Channel, binder_id::String; source=nothing, renditiontype=nothing, docversion=nothing, attachments=nothing, __export__=nothing, docfield=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Binder (Latest Version)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **Bool** | to include source content or not | [default to nothing]
 **renditiontype** | **String** | to include viewable renditions | [default to nothing]
 **docversion** | **String** | to include all major versions | [default to nothing]
 **attachments** | **String** | to include all versions of attachments | [default to nothing]
 **__export__** | **String** | configurable filename metadata | [default to nothing]
 **docfield** | **Bool** | to exclude document metadata csv | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_actions_post**
> objects_binders_binder_id_actions_post(_api::DefaultApi, binder_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_actions_post(_api::DefaultApi, response_stream::Channel, binder_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Refresh Binder Auto-Filing

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_binding_rule_put**
> objects_binders_binder_id_binding_rule_put(_api::DefaultApi, binder_id::String; content_type=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_binding_rule_put(_api::DefaultApi, response_stream::Channel, binder_id::String; content_type=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Binding Rule

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_delete**
> objects_binders_binder_id_delete(_api::DefaultApi, binder_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_delete(_api::DefaultApi, response_stream::Channel, binder_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_node_id_binding_rule_put**
> objects_binders_binder_id_documents_node_id_binding_rule_put(_api::DefaultApi, binder_id::String, node_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_documents_node_id_binding_rule_put(_api::DefaultApi, response_stream::Channel, binder_id::String, node_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Binder Document Binding Rule

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**node_id** | **String** | The binder node id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_post**
> objects_binders_binder_id_documents_post(_api::DefaultApi, binder_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_documents_post(_api::DefaultApi, response_stream::Channel, binder_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Add Document to Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_section_id_delete**
> objects_binders_binder_id_documents_section_id_delete(_api::DefaultApi, binder_id::String, section_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_documents_section_id_delete(_api::DefaultApi, response_stream::Channel, binder_id::String, section_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Remove Document from Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**section_id** | **String** | The binder node id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_section_id_put**
> objects_binders_binder_id_documents_section_id_put(_api::DefaultApi, binder_id::String, section_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_documents_section_id_put(_api::DefaultApi, response_stream::Channel, binder_id::String, section_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Move Document in Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**section_id** | **String** | The binder node id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_get**
> objects_binders_binder_id_get(_api::DefaultApi, binder_id::String; depth=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_get(_api::DefaultApi, response_stream::Channel, binder_id::String; depth=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **String** | To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_post**
> objects_binders_binder_id_post(_api::DefaultApi, binder_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_post(_api::DefaultApi, response_stream::Channel, binder_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Binder Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_put**
> objects_binders_binder_id_put(_api::DefaultApi, binder_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_put(_api::DefaultApi, response_stream::Channel, binder_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete**
> objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(_api::DefaultApi, binder_id::String, role_name_and_user_or_group::String, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(_api::DefaultApi, response_stream::Channel, binder_id::String, role_name_and_user_or_group::String, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Remove Users & Groups from Roles on a Single Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The id value of the binder from which to remove roles. |
**role_name_and_user_or_group** | **String** | The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. |
**id** | **String** | The id value of the user or group to remove from the role. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_node_id_binding_rule_put**
> objects_binders_binder_id_sections_node_id_binding_rule_put(_api::DefaultApi, binder_id::String, node_id::String; content_type=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_sections_node_id_binding_rule_put(_api::DefaultApi, response_stream::Channel, binder_id::String, node_id::String; content_type=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Binder Section Binding Rule

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**node_id** | **String** | The binder node id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_node_id_put**
> objects_binders_binder_id_sections_node_id_put(_api::DefaultApi, binder_id::String, node_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_sections_node_id_put(_api::DefaultApi, response_stream::Channel, binder_id::String, node_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Binder Section

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**node_id** | **String** | The binder node id of the section. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_post**
> objects_binders_binder_id_sections_post(_api::DefaultApi, binder_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_sections_post(_api::DefaultApi, response_stream::Channel, binder_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Binder Section

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_section_id_delete**
> objects_binders_binder_id_sections_section_id_delete(_api::DefaultApi, binder_id::String, section_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_sections_section_id_delete(_api::DefaultApi, response_stream::Channel, binder_id::String, section_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Binder Section

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**section_id** | **String** | The binder node id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_section_id_get**
> objects_binders_binder_id_sections_section_id_get(_api::DefaultApi, binder_id::String, section_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_sections_section_id_get(_api::DefaultApi, response_stream::Channel, binder_id::String, section_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Sections

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**section_id** | **String** | The binder node id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_get**
> objects_binders_binder_id_versions_get(_api::DefaultApi, binder_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_get(_api::DefaultApi, response_stream::Channel, binder_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Binder Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_actions_export_post**
> objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String; source=nothing, renditiontype=nothing, docversion=nothing, attachments=nothing, __export__=nothing, docfield=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String; source=nothing, renditiontype=nothing, docversion=nothing, attachments=nothing, __export__=nothing, docfield=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Binder (Specific Version)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **Bool** | to include source content or not | [default to nothing]
 **renditiontype** | **String** | to include viewable renditions | [default to nothing]
 **docversion** | **String** | to include all major versions | [default to nothing]
 **attachments** | **String** | to include all versions of attachments | [default to nothing]
 **__export__** | **String** | configurable filename metadata | [default to nothing]
 **docfield** | **Bool** | to exclude document metadata csv | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_delete**
> objects_binders_binder_id_versions_major_version_minor_version_delete(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_delete(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Binder Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_get**
> objects_binders_binder_id_versions_major_version_minor_version_get(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_get(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_put**
> objects_binders_binder_id_versions_major_version_minor_version_put(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_put(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Binder Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_post**
> objects_binders_binder_id_versions_major_version_minor_version_relationships_post(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_relationships_post(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Binder Relationship

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete**
> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Binder Relationship

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |
**relationship_id** | **String** | The binder relationship id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get**
> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Relationship

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |
**relationship_id** | **String** | The binder relationship id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get**
> objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(_api::DefaultApi, binder_id::String, major_version::String, minor_version::String, section_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(_api::DefaultApi, response_stream::Channel, binder_id::String, major_version::String, minor_version::String, section_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Version Section

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**binder_id** | **String** | The binder id field value. |
**major_version** | **String** | The binder major_version_number__v field value. |
**minor_version** | **String** | The binder minor_version_number__v field value. |
**section_id** | **String** | Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_id_roles_get**
> objects_binders_id_roles_get(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_id_roles_get(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Binder Roles

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_id_roles_post**
> objects_binders_id_roles_post(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_id_roles_post(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Assign Users & Groups to Roles on a Single Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_id_roles_role_name_get**
> objects_binders_id_roles_role_name_get(_api::DefaultApi, id::String, role_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_id_roles_role_name_get(_api::DefaultApi, response_stream::Channel, id::String, role_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Role

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The binder &#x60;id&#x60;. |
**role_name** | **String** | The name of the role to retrieve. For example, &#x60;owner__v&#x60;. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get**
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(_api::DefaultApi, id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(_api::DefaultApi, response_stream::Channel, id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder User Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The binder id field value from which to retrieve available user actions. |
**major_version** | **String** | The major version number of the binder. |
**minor_version** | **String** | The minor version number of the binder. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(_api::DefaultApi, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(_api::DefaultApi, response_stream::Channel, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Entry Criteria

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The binder id field value from which to retrieve available user actions. |
**major_version** | **String** | The major version number of the binder. |
**minor_version** | **String** | The minor version number of the binder. |
**name_v** | **String** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(_api::DefaultApi, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(_api::DefaultApi, response_stream::Channel, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Binder User Action

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The binder id field value from which to retrieve available user actions. |
**major_version** | **String** | The major version number of the binder. |
**minor_version** | **String** | The minor version number of the binder. |
**name_v** | **String** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_lifecycle_actions_post**
> objects_binders_lifecycle_actions_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_lifecycle_actions_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve User Actions on Multiple Binders

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_lifecycle_actions_user_action_name_put**
> objects_binders_lifecycle_actions_user_action_name_put(_api::DefaultApi, user_action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_lifecycle_actions_user_action_name_put(_api::DefaultApi, response_stream::Channel, user_action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Bulk Binder User Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**user_action_name** | **String** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_post**
> objects_binders_post(_api::DefaultApi; async=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_post(_api::DefaultApi, response_stream::Channel; async=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Binder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async** | **Bool** | When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_get**
> objects_binders_templates_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Template Collection

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_post**
> objects_binders_templates_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Binder Template

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_put**
> objects_binders_templates_put(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Binder Template

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_bindernodes_get**
> objects_binders_templates_template_name_bindernodes_get(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_template_name_bindernodes_get(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Template Node Attributes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The binder template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_bindernodes_post**
> objects_binders_templates_template_name_bindernodes_post(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_template_name_bindernodes_post(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Binder Template Node

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The binder template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_bindernodes_put**
> objects_binders_templates_template_name_bindernodes_put(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_template_name_bindernodes_put(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Replace Binder Template Nodes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The binder template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_delete**
> objects_binders_templates_template_name_delete(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_template_name_delete(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Binder Template

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The binder template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_get**
> objects_binders_templates_template_name_get(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_binders_templates_template_name_get(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Binder Template Attributes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The binder template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_deletions_documents_get**
> objects_deletions_documents_get(_api::DefaultApi; start_date=nothing, end_date=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_deletions_documents_get(_api::DefaultApi, response_stream::Channel; start_date=nothing, end_date=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Deleted Document IDs

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **String** | Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [default to nothing]
 **end_date** | **String** | Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_deletions_vobjects_object_name_get**
> objects_deletions_vobjects_object_name_get(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_deletions_vobjects_object_name_get(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Deleted Object Record ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_actions_get**
> objects_documents_actions_get(_api::DefaultApi; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_actions_get(_api::DefaultApi, response_stream::Channel; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Document Workflows

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | When localized (translated) strings are available, retrieve them by setting loc to true. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get**
> objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(_api::DefaultApi, lifecycle_and_state_and_action::String, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(_api::DefaultApi, response_stream::Channel, lifecycle_and_state_and_action::String, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Controlled Copy Job Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**lifecycle_and_state_and_action** | **String** | The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link. |
**job_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_actions_workflow_name_get**
> objects_documents_actions_workflow_name_get(_api::DefaultApi, workflow_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_actions_workflow_name_get(_api::DefaultApi, response_stream::Channel, workflow_name::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Workflow Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_name** | **String** | The document workflow name value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | When localized (translated) strings are available, retrieve them by setting loc to true. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_actions_workflow_name_post**
> objects_documents_actions_workflow_name_post(_api::DefaultApi, workflow_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_actions_workflow_name_post(_api::DefaultApi, response_stream::Channel, workflow_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Document Workflow

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_name** | **String** | The document workflow name value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_annotations_batch_delete**
> objects_documents_annotations_batch_delete(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_annotations_batch_delete(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Annotations

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_annotations_batch_post**
> objects_documents_annotations_batch_post(_api::DefaultApi, authorization::String, content_type::String, accept::String, x_vault_a_p_i_client_i_d::String; _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_annotations_batch_post(_api::DefaultApi, response_stream::Channel, authorization::String, content_type::String, accept::String, x_vault_a_p_i_client_i_d::String; _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Multiple Annotations

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**authorization** | **String** |  |
**content_type** | **String** |  |
**accept** | **String** |  |
**x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. |

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_annotations_batch_put**
> objects_documents_annotations_batch_put(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_annotations_batch_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Annotations

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_annotations_replies_batch_post**
> objects_documents_annotations_replies_batch_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_annotations_replies_batch_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Add Annotation Replies

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_attachments_batch_delete**
> objects_documents_attachments_batch_delete(_api::DefaultApi; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_attachments_batch_delete(_api::DefaultApi, response_stream::Channel; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Multiple Document Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_attachments_batch_post**
> objects_documents_attachments_batch_post(_api::DefaultApi; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_attachments_batch_post(_api::DefaultApi, response_stream::Channel; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Multiple Document Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_attachments_batch_put**
> objects_documents_attachments_batch_put(_api::DefaultApi; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_attachments_batch_put(_api::DefaultApi, response_stream::Channel; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Multiple Document Attachment Descriptions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_fileextract_job_id_results_get**
> objects_documents_batch_actions_fileextract_job_id_results_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_actions_fileextract_job_id_results_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Export Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested export job. This is returned with the export document requests. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_fileextract_post**
> objects_documents_batch_actions_fileextract_post(_api::DefaultApi; source=nothing, renditions=nothing, allversions=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_actions_fileextract_post(_api::DefaultApi, response_stream::Channel; source=nothing, renditions=nothing, allversions=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **Bool** | Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [default to nothing]
 **renditions** | **Bool** | Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [default to nothing]
 **allversions** | **Bool** | Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_reclassify_put**
> objects_documents_batch_actions_reclassify_put(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_actions_reclassify_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Reclassify Multiple Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_rerender_post**
> objects_documents_batch_actions_rerender_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_actions_rerender_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Multiple Document Renditions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_delete**
> objects_documents_batch_delete(_api::DefaultApi; id_param=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_delete(_api::DefaultApi, response_stream::Channel; id_param=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Multiple Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **String** | If you’re identifying documents in your input by their external ID | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_lock_delete**
> objects_documents_batch_lock_delete(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_lock_delete(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Undo Collaborative Authoring Checkout

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_post**
> objects_documents_batch_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Multiple Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_batch_put**
> objects_documents_batch_put(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_batch_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Multiple Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_anchors_get**
> objects_documents_doc_id_anchors_get(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_anchors_get(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Anchor IDs

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_annotations_file_get**
> objects_documents_doc_id_annotations_file_get(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_annotations_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Document Annotations to PDF

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_annotations_file_post**
> objects_documents_doc_id_annotations_file_post(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_annotations_file_post(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Import Document Annotations from PDF

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_delete**
> objects_documents_doc_id_attachments_attachment_id_delete(_api::DefaultApi, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_delete(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Document Attachment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_file_get**
> objects_documents_doc_id_attachments_attachment_id_file_get(_api::DefaultApi, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Attachment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_get**
> objects_documents_doc_id_attachments_attachment_id_get(_api::DefaultApi, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_get(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Attachment Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_put**
> objects_documents_doc_id_attachments_attachment_id_put(_api::DefaultApi, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_put(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Document Attachment Description

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(_api::DefaultApi, doc_id::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Document Attachment Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** | The attachment version__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(_api::DefaultApi, doc_id::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Attachment Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** | The attachment version__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(_api::DefaultApi, doc_id::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Attachment Version Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** | The attachment version__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(_api::DefaultApi, doc_id::String, attachment_id::String, attachment_version::String; restore=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String, attachment_version::String; restore=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Restore Document Attachment Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** | The attachment version__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restore** | **Bool** | The parameter restore must be set to true.  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_get**
> objects_documents_doc_id_attachments_attachment_id_versions_get(_api::DefaultApi, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_attachment_id_versions_get(_api::DefaultApi, response_stream::Channel, doc_id::String, attachment_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Attachment Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_file_get**
> objects_documents_doc_id_attachments_file_get(_api::DefaultApi, doc_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download All Document Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_get**
> objects_documents_doc_id_attachments_get(_api::DefaultApi, doc_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_get(_api::DefaultApi, response_stream::Channel, doc_id::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_post**
> objects_documents_doc_id_attachments_post(_api::DefaultApi, doc_id::String; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_attachments_post(_api::DefaultApi, response_stream::Channel, doc_id::String; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Document Attachment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_audittrail_get**
> objects_documents_doc_id_audittrail_get(_api::DefaultApi, doc_id::String; start_date=nothing, end_date=nothing, format_result=nothing, limit=nothing, offset=nothing, events=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_audittrail_get(_api::DefaultApi, response_stream::Channel, doc_id::String; start_date=nothing, end_date=nothing, format_result=nothing, limit=nothing, offset=nothing, events=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Complete Audit History for a Single Document

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document ID for which to retrieve audit history. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **String** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  | [default to nothing]
 **end_date** | **String** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [default to nothing]
 **format_result** | **String** | To request a CSV file of your audit history, use csv.  | [default to nothing]
 **limit** | **String** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [default to nothing]
 **offset** | **String** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [default to nothing]
 **events** | **String** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_delete**
> objects_documents_doc_id_delete(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_delete(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Document

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_events_get**
> objects_documents_doc_id_events_get(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_events_get(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Events

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_file_get**
> objects_documents_doc_id_file_get(_api::DefaultApi, doc_id::String; lock_document=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String; lock_document=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lock_document** | **Bool** | Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_get**
> objects_documents_doc_id_get(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_get(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_lock_delete**
> objects_documents_doc_id_lock_delete(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_lock_delete(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Document Lock

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_lock_get**
> objects_documents_doc_id_lock_get(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_lock_get(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Lock

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_lock_post**
> objects_documents_doc_id_lock_post(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_lock_post(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Document Lock

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_major_version_minor_version_attachments_file_get**
> objects_documents_doc_id_major_version_minor_version_attachments_file_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_major_version_minor_version_attachments_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download All Document Version Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_post**
> objects_documents_doc_id_post(_api::DefaultApi, doc_id::String; suppress_rendition=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_post(_api::DefaultApi, response_stream::Channel, doc_id::String; suppress_rendition=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Single Document Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suppress_rendition** | **String** | Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_put**
> objects_documents_doc_id_put(_api::DefaultApi, doc_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_put(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Single Document

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_get**
> objects_documents_doc_id_renditions_get(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_renditions_get(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Renditions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_delete**
> objects_documents_doc_id_renditions_rendition_type_delete(_api::DefaultApi, doc_id::String, rendition_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_renditions_rendition_type_delete(_api::DefaultApi, response_stream::Channel, doc_id::String, rendition_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Document Rendition

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_get**
> objects_documents_doc_id_renditions_rendition_type_get(_api::DefaultApi, doc_id::String, rendition_type::String; steady_state=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_renditions_rendition_type_get(_api::DefaultApi, response_stream::Channel, doc_id::String, rendition_type::String; steady_state=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Rendition File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **steady_state** | **String** | Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_post**
> objects_documents_doc_id_renditions_rendition_type_post(_api::DefaultApi, doc_id::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_renditions_rendition_type_post(_api::DefaultApi, response_stream::Channel, doc_id::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Add Single Document Rendition

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_put**
> objects_documents_doc_id_renditions_rendition_type_put(_api::DefaultApi, doc_id::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_renditions_rendition_type_put(_api::DefaultApi, response_stream::Channel, doc_id::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Replace Document Rendition

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete**
> objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(_api::DefaultApi, doc_id::String, role_name_and_user_or_group::String, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(_api::DefaultApi, response_stream::Channel, doc_id::String, role_name_and_user_or_group::String, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Remove Users & Groups from Roles on a Single Document

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The id value of the document from which to remove roles. |
**role_name_and_user_or_group** | **String** | The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. |
**id** | **String** | The id value of the user or group to remove from the role. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_version_major_version_minor_version_attachments_get**
> objects_documents_doc_id_version_major_version_minor_version_attachments_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_version_major_version_minor_version_attachments_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Version Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_get**
> objects_documents_doc_id_versions_get(_api::DefaultApi, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_get(_api::DefaultApi, response_stream::Channel, doc_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, annotation_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, annotation_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Read Annotations by ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**annotation_id** | **String** | The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, annotation_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, annotation_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Read Replies of Parent Annotation

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**annotation_id** | **String** | The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Document Version Annotations to PDF

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Import Document Version Annotations from PDF

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; limit=nothing, offset=nothing, annotation_types=nothing, pagination_id=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_annotations_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; limit=nothing, offset=nothing, annotation_types=nothing, pagination_id=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Read Annotations by Document Version and Type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [default to nothing]
 **offset** | **String** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201. | [default to nothing]
 **annotation_types** | **String** | The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;  | [default to nothing]
 **pagination_id** | **String** | A unique identifier used to load requests with paginated results. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get**
> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Version Attachment Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**attachment_id** | **String** | The id field value of the attachment. |
**attachment_version** | **String** | The version of the attachment. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get**
> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, attachment_id::String, attachment_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Version Attachment Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**attachment_id** | **String** | The id of the document attachment to retrieve. |
**attachment_version** | **String** | Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_delete**
> objects_documents_doc_id_versions_major_version_minor_version_delete(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_delete(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Document Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get**
> objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Version Notes as CSV

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_events_post**
> objects_documents_doc_id_versions_major_version_minor_version_events_post(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_events_post(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Document Event

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get**
> objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Video Annotations

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The video document id field value. |
**major_version** | **String** | The video document major_version_number__v field value. |
**minor_version** | **String** | The video document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** | This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;. | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_file_get**
> objects_documents_doc_id_versions_major_version_minor_version_file_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_file_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Version File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_get**
> objects_documents_doc_id_versions_major_version_minor_version_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_put**
> objects_documents_doc_id_versions_major_version_minor_version_put(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_put(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Document Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_get**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_relationships_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Relationships

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_post**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_post(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_relationships_post(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Single Document Relationship

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Document Relationship

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**relationship_id** | **String** | The relationship id field value. See Retrieve Document Relationships. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, relationship_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Relationship

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**relationship_id** | **String** | The relationship id field value. See Retrieve Document Relationships. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_get**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_renditions_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Version Renditions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Document Version Rendition

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Version Rendition File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Upload Document Version Rendition

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String, rendition_type::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Replace Document Version Rendition

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |
**rendition_type** | **String** | The document rendition type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get**
> objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(_api::DefaultApi, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(_api::DefaultApi, response_stream::Channel, doc_id::String, major_version::String, minor_version::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Version Thumbnail File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**doc_id** | **String** | The document id field value. |
**major_version** | **String** | The document major_version_number__v field value. |
**minor_version** | **String** | The document minor_version_number__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_get**
> objects_documents_get(_api::DefaultApi; named_filter=nothing, scope=nothing, versionscope=nothing, search=nothing, limit=nothing, sort=nothing, start=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_get(_api::DefaultApi, response_stream::Channel; named_filter=nothing, scope=nothing, versionscope=nothing, search=nothing, limit=nothing, sort=nothing, start=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **named_filter** | **String** | Retrieves only documents which you have created. | [default to nothing]
 **scope** | **String** | Searches only within the document content. | [default to nothing]
 **versionscope** | **String** | Retrieves all document versions, rather than only the latest version. | [default to nothing]
 **search** | **String** | Search for documents based on a {keyword} in searchable document fields. | [default to nothing]
 **limit** | **String** | See VQL documentation for more information. | [default to nothing]
 **sort** | **String** | See VQL documentation for more information. | [default to nothing]
 **start** | **String** | See VQL documentation for more information. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_id_roles_get**
> objects_documents_id_roles_get(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_id_roles_get(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Document Roles

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_id_roles_post**
> objects_documents_id_roles_post(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_id_roles_post(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Assign Users & Groups to Roles on a Single Document

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_id_roles_role_name_get**
> objects_documents_id_roles_role_name_get(_api::DefaultApi, id::String, role_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_id_roles_role_name_get(_api::DefaultApi, response_stream::Channel, id::String, role_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Role

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The document &#x60;id&#x60;. |
**role_name** | **String** | The name of the role to retrieve. For example, &#x60;owner__v&#x60;. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get**
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(_api::DefaultApi, id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(_api::DefaultApi, response_stream::Channel, id::String, major_version::String, minor_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document User Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The document id field value from which to retrieve available user actions. |
**major_version** | **String** | The major version number of the document. |
**minor_version** | **String** | The minor version number of the document. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(_api::DefaultApi, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(_api::DefaultApi, response_stream::Channel, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Entry Criteria

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The document id field value from which to retrieve available user actions. |
**major_version** | **String** | The major version number of the document. |
**minor_version** | **String** | The minor version number of the document. |
**name_v** | **String** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(_api::DefaultApi, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(_api::DefaultApi, response_stream::Channel, id::String, major_version::String, minor_version::String, name_v::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Document User Action

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The document id field value from which to retrieve available user actions. |
**major_version** | **String** | The major version number of the document. |
**minor_version** | **String** | The minor version number of the document. |
**name_v** | **String** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_lifecycle_actions_post**
> objects_documents_lifecycle_actions_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_lifecycle_actions_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve User Actions on Multiple Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_lifecycle_actions_user_action_name_put**
> objects_documents_lifecycle_actions_user_action_name_put(_api::DefaultApi, user_action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_lifecycle_actions_user_action_name_put(_api::DefaultApi, response_stream::Channel, user_action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Bulk Document User Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**user_action_name** | **String** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_post**
> objects_documents_post(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Single Document

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_relationships_batch_delete**
> objects_documents_relationships_batch_delete(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_relationships_batch_delete(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Multiple Document Relationships

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_relationships_batch_post**
> objects_documents_relationships_batch_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_relationships_batch_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Multiple Document Relationships

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_renditions_batch_delete**
> objects_documents_renditions_batch_delete(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_renditions_batch_delete(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Multiple Document Renditions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_renditions_batch_post**
> objects_documents_renditions_batch_post(_api::DefaultApi; id_param=nothing, large_size_asset=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_renditions_batch_post(_api::DefaultApi, response_stream::Channel; id_param=nothing, large_size_asset=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Add Multiple Document Renditions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **String** | If you’re identifying documents in your input by their external ID | [default to nothing]
 **large_size_asset** | **String** | If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_roles_batch_delete**
> objects_documents_roles_batch_delete(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_roles_batch_delete(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Remove Users and Groups from Roles on Multiple Documents & Binders

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_roles_batch_post**
> objects_documents_roles_batch_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_roles_batch_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Assign Users & Groups to Roles on Multiple Documents & Binders

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_templates_get**
> objects_documents_templates_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_templates_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Template Collection

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_templates_post**
> objects_documents_templates_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_templates_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Single Document Template

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_templates_put**
> objects_documents_templates_put(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_templates_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Multiple Document Templates

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_delete**
> objects_documents_templates_template_name_delete(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_templates_template_name_delete(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Basic Document Template

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The document template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_file_get**
> objects_documents_templates_template_name_file_get(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_templates_template_name_file_get(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Document Template File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The document template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_get**
> objects_documents_templates_template_name_get(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_templates_template_name_get(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Document Template Attributes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The document template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_put**
> objects_documents_templates_template_name_put(_api::DefaultApi, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_templates_template_name_put(_api::DefaultApi, response_stream::Channel, template_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Single Document Template

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**template_name** | **String** | The document template name__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_tokens_post**
> objects_documents_tokens_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_tokens_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Document Tokens

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_versions_batch_actions_fileextract_post**
> objects_documents_versions_batch_actions_fileextract_post(_api::DefaultApi; source=nothing, renditions=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_versions_batch_actions_fileextract_post(_api::DefaultApi, response_stream::Channel; source=nothing, renditions=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Document Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **Bool** | Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [default to nothing]
 **renditions** | **Bool** | Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_versions_batch_delete**
> objects_documents_versions_batch_delete(_api::DefaultApi; id_param=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_versions_batch_delete(_api::DefaultApi, response_stream::Channel; id_param=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Multiple Document Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **String** | If you’re identifying documents in your input by their external ID | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_documents_versions_batch_post**
> objects_documents_versions_batch_post(_api::DefaultApi; id_param=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_documents_versions_batch_post(_api::DefaultApi, response_stream::Channel; id_param=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Multiple Document Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **String** | If you’re identifying documents in your input by their external ID | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **String** | Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_domain_get**
> objects_domain_get(_api::DefaultApi; include_application=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_domain_get(_api::DefaultApi, response_stream::Channel; include_application=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Domain Information

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_application** | **Bool** | To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_domains_get**
> objects_domains_get(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_domains_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Domains

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_edl_matched_documents_batch_actions_add_post**
> objects_edl_matched_documents_batch_actions_add_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_edl_matched_documents_batch_actions_add_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Add EDL Matched Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_edl_matched_documents_batch_actions_remove_post**
> objects_edl_matched_documents_batch_actions_remove_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_edl_matched_documents_batch_actions_remove_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Remove EDL Matched Documents

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_groups_auto_get**
> objects_groups_auto_get(_api::DefaultApi; limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_groups_auto_get(_api::DefaultApi, response_stream::Channel; limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Auto Managed Groups

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  | [default to nothing]
 **offset** | **String** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_groups_get**
> objects_groups_get(_api::DefaultApi; include_implied=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_groups_get(_api::DefaultApi, response_stream::Channel; include_implied=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Groups

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_implied** | **String** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_groups_group_id_delete**
> objects_groups_group_id_delete(_api::DefaultApi, group_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_groups_group_id_delete(_api::DefaultApi, response_stream::Channel, group_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Group

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**group_id** | **String** | The group id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_groups_group_id_get**
> objects_groups_group_id_get(_api::DefaultApi, group_id::String; include_implied=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_groups_group_id_get(_api::DefaultApi, response_stream::Channel, group_id::String; include_implied=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Group

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**group_id** | **String** | The group id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_implied** | **Bool** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_groups_group_id_put**
> objects_groups_group_id_put(_api::DefaultApi, group_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_groups_group_id_put(_api::DefaultApi, response_stream::Channel, group_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Group

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**group_id** | **String** | The group id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_groups_post**
> objects_groups_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_groups_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Group 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_licenses_get**
> objects_licenses_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_licenses_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Application License Usage

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_actions_get**
> objects_objectworkflows_actions_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_actions_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Multi-Record Workflows

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_actions_workflow_name_get**
> objects_objectworkflows_actions_workflow_name_get(_api::DefaultApi, workflow_name::String; authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_actions_workflow_name_get(_api::DefaultApi, response_stream::Channel, workflow_name::String; authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Multi-Record Workflow Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_name** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_actions_workflow_name_post**
> objects_objectworkflows_actions_workflow_name_post(_api::DefaultApi, workflow_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_actions_workflow_name_post(_api::DefaultApi, response_stream::Channel, workflow_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Multi-Record Workflow

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_name** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_get**
> objects_objectworkflows_get(_api::DefaultApi; object_v=nothing, record_id_v=nothing, participant=nothing, status_v=nothing, offset=nothing, page_size=nothing, loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_get(_api::DefaultApi, response_stream::Channel; object_v=nothing, record_id_v=nothing, participant=nothing, status_v=nothing, offset=nothing, page_size=nothing, loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflows

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_v** | **String** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [default to nothing]
 **record_id_v** | **String** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [default to nothing]
 **participant** | **String** | To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [default to nothing]
 **status_v** | **String** | To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v | [default to nothing]
 **offset** | **String** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [default to nothing]
 **page_size** | **String** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [default to nothing]
 **loc** | **String** | When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_get**
> objects_objectworkflows_tasks_get(_api::DefaultApi; object_v=nothing, record_id_v=nothing, assignee_v=nothing, status_v=nothing, offset=nothing, page_size=nothing, loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_get(_api::DefaultApi, response_stream::Channel; object_v=nothing, record_id_v=nothing, assignee_v=nothing, status_v=nothing, offset=nothing, page_size=nothing, loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflow Tasks

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_v** | **String** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [default to nothing]
 **record_id_v** | **String** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [default to nothing]
 **assignee_v** | **String** | To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [default to nothing]
 **status_v** | **String** | To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.  | [default to nothing]
 **offset** | **String** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [default to nothing]
 **page_size** | **String** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [default to nothing]
 **loc** | **String** | When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_accept_post**
> objects_objectworkflows_tasks_task_id_actions_accept_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_accept_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Accept Single Record Workflow Task

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_cancel_post**
> objects_objectworkflows_tasks_task_id_actions_cancel_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_cancel_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Cancel Workflow Task

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_complete_post**
> objects_objectworkflows_tasks_task_id_actions_complete_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_complete_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Complete Single Record Workflow Task

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_get**
> objects_objectworkflows_tasks_task_id_actions_get(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_get(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflow Task Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwaccept_post**
> objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Accept Multi-item Workflow Task

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post**
> objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Complete Multi-item Workflow Task

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post**
> objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Manage Multi-Item Workflow Content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwreassign_post**
> objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Reassign Multi-item Workflow Task

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The id of the task to reassign. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_reassign_post**
> objects_objectworkflows_tasks_task_id_actions_reassign_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_reassign_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Reassign Single Record Workflow Task

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The id of the task to reassign. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_task_action_get**
> objects_objectworkflows_tasks_task_id_actions_task_action_get(_api::DefaultApi, task_id::String, task_action::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_task_action_get(_api::DefaultApi, response_stream::Channel, task_id::String, task_action::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflow Task Action Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |
**task_action** | **String** | The name of the task action retrieved from Retrieve Workflow Task Actions. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **String** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_undoaccept_post**
> objects_objectworkflows_tasks_task_id_actions_undoaccept_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_undoaccept_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Undo Workflow Task Acceptance

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_updateduedate_post**
> objects_objectworkflows_tasks_task_id_actions_updateduedate_post(_api::DefaultApi, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_actions_updateduedate_post(_api::DefaultApi, response_stream::Channel, task_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Workflow Task Due Date

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The id of the task. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_get**
> objects_objectworkflows_tasks_task_id_get(_api::DefaultApi, task_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_tasks_task_id_get(_api::DefaultApi, response_stream::Channel, task_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflow Task Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**task_id** | **String** | The task id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_actions_get**
> objects_objectworkflows_workflow_id_actions_get(_api::DefaultApi, workflow_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_workflow_id_actions_get(_api::DefaultApi, response_stream::Channel, workflow_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflow Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_id** | **String** | The workflow id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **String** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_actions_workflow_action_get**
> objects_objectworkflows_workflow_id_actions_workflow_action_get(_api::DefaultApi, workflow_id::String, workflow_action::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_workflow_id_actions_workflow_action_get(_api::DefaultApi, response_stream::Channel, workflow_id::String, workflow_action::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflow Action Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_id** | **String** | The workflow id field value. |
**workflow_action** | **String** | The workflow action name retrieved from Retrieve Workflow Actions. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_actions_workflow_action_post**
> objects_objectworkflows_workflow_id_actions_workflow_action_post(_api::DefaultApi, workflow_id::String, workflow_action::String; documents_sys=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_workflow_id_actions_workflow_action_post(_api::DefaultApi, response_stream::Channel, workflow_id::String, workflow_action::String; documents_sys=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Workflow Action

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_id** | **String** | The workflow id field value. |
**workflow_action** | **String** | The workflow action name retrieved from Retrieve Workflow Actions. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents_sys** | **String** | Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_get**
> objects_objectworkflows_workflow_id_get(_api::DefaultApi, workflow_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_objectworkflows_workflow_id_get(_api::DefaultApi, response_stream::Channel, workflow_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Workflow Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**workflow_id** | **String** | The workflow id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_picklists_get**
> objects_picklists_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_picklists_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Picklists

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_get**
> objects_picklists_picklist_name_get(_api::DefaultApi, picklist_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_picklists_picklist_name_get(_api::DefaultApi, response_stream::Channel, picklist_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Picklist Values

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_picklist_value_name_delete**
> objects_picklists_picklist_name_picklist_value_name_delete(_api::DefaultApi, picklist_name::String, picklist_value_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_picklists_picklist_name_picklist_value_name_delete(_api::DefaultApi, response_stream::Channel, picklist_name::String, picklist_value_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Inactivate Picklist Value

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |
**picklist_value_name** | **String** | The picklist value name field value (north_america__c, south_america__c, etc.) |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_picklist_value_name_put**
> objects_picklists_picklist_name_picklist_value_name_put(_api::DefaultApi, picklist_name::String, picklist_value_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_picklists_picklist_name_picklist_value_name_put(_api::DefaultApi, response_stream::Channel, picklist_name::String, picklist_value_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Picklist Value

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |
**picklist_value_name** | **String** | The picklist value name field value (north_america__c, south_america__c, etc.) |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_post**
> objects_picklists_picklist_name_post(_api::DefaultApi, picklist_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_picklists_picklist_name_post(_api::DefaultApi, response_stream::Channel, picklist_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Picklist Values

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_put**
> objects_picklists_picklist_name_put(_api::DefaultApi, picklist_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_picklists_picklist_name_put(_api::DefaultApi, response_stream::Channel, picklist_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Picklist Value Label

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_actions_buildproduction_post**
> objects_sandbox_actions_buildproduction_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_actions_buildproduction_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Build Production Vault

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_actions_promoteproduction_post**
> objects_sandbox_actions_promoteproduction_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_actions_promoteproduction_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Promote to Production

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_actions_recheckusage_post**
> objects_sandbox_actions_recheckusage_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_actions_recheckusage_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Recheck Sandbox Usage Limit

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_batch_changesize_post**
> objects_sandbox_batch_changesize_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_batch_changesize_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Change Sandbox Size

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_entitlements_set_post**
> objects_sandbox_entitlements_set_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_entitlements_set_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Set Sandbox Entitlements

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_get**
> objects_sandbox_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Sandboxes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_name_delete**
> objects_sandbox_name_delete(_api::DefaultApi, name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_name_delete(_api::DefaultApi, response_stream::Channel, name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Sandbox

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**name** | **String** | The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_post**
> objects_sandbox_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create or Refresh Sandbox

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_api_name_actions_update_post**
> objects_sandbox_snapshot_api_name_actions_update_post(_api::DefaultApi, api_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_snapshot_api_name_actions_update_post(_api::DefaultApi, response_stream::Channel, api_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Sandbox Snapshot

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**api_name** | **String** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_api_name_actions_upgrade_post**
> objects_sandbox_snapshot_api_name_actions_upgrade_post(_api::DefaultApi, api_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_snapshot_api_name_actions_upgrade_post(_api::DefaultApi, response_stream::Channel, api_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Upgrade Sandbox Snapshot

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**api_name** | **String** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_api_name_delete**
> objects_sandbox_snapshot_api_name_delete(_api::DefaultApi, api_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_snapshot_api_name_delete(_api::DefaultApi, response_stream::Channel, api_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Sandbox Snapshot

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**api_name** | **String** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_get**
> objects_sandbox_snapshot_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_snapshot_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Sandbox Snapshots

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_post**
> objects_sandbox_snapshot_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_snapshot_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Sandbox Snapshot

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_vault_id_actions_refresh_post**
> objects_sandbox_vault_id_actions_refresh_post(_api::DefaultApi, vault_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_vault_id_actions_refresh_post(_api::DefaultApi, response_stream::Channel, vault_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Refresh Sandbox from Snapshot

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**vault_id** | **String** | The Vault ID of the sandbox to be refreshed. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_sandbox_vault_id_get**
> objects_sandbox_vault_id_get(_api::DefaultApi, vault_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_sandbox_vault_id_get(_api::DefaultApi, response_stream::Channel, vault_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Sandbox Details by ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**vault_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_securitypolicies_get**
> objects_securitypolicies_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_securitypolicies_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Security Policies

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_securitypolicies_security_policy_name_get**
> objects_securitypolicies_security_policy_name_get(_api::DefaultApi, security_policy_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_securitypolicies_security_policy_name_get(_api::DefaultApi, response_stream::Channel, security_policy_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Security Policy

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**security_policy_name** | **String** | Security policy name__v field value (retrieved from previous request). This is typically a numeric value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_get**
> objects_users_get(_api::DefaultApi; vaults=nothing, exclude_vault_membership=nothing, exclude_app_licensing=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_get(_api::DefaultApi, response_stream::Channel; vaults=nothing, exclude_vault_membership=nothing, exclude_app_licensing=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Users

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaults** | **String** | Retrieve all users assigned to all Vaults in your domain. | [default to nothing]
 **exclude_vault_membership** | **String** | Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [default to nothing]
 **exclude_app_licensing** | **String** | Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_id_get**
> objects_users_id_get(_api::DefaultApi, id::String; exclude_vault_membership=nothing, exclude_app_licensing=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_id_get(_api::DefaultApi, response_stream::Channel, id::String; exclude_vault_membership=nothing, exclude_app_licensing=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve User

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The user id field value. Use the value me to get information for the currently authenticated user. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exclude_vault_membership** | **String** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [default to nothing]
 **exclude_app_licensing** | **String** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_id_permissions_get**
> objects_users_id_permissions_get(_api::DefaultApi, id::String; filter=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_id_permissions_get(_api::DefaultApi, response_stream::Channel, id::String; filter=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve User Permissions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The ID of the user. Use the value me to retrieve information for the currently authenticated user. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_id_put**
> objects_users_id_put(_api::DefaultApi, id::String; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_id_put(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Single User

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The user id field value. Use the value me to get information for the currently authenticated user. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_me_get**
> objects_users_me_get(_api::DefaultApi; exclude_vault_membership=nothing, exclude_app_licensing=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_me_get(_api::DefaultApi, response_stream::Channel; exclude_vault_membership=nothing, exclude_app_licensing=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Validate Session User

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exclude_vault_membership** | **String** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [default to nothing]
 **exclude_app_licensing** | **String** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_me_password_post**
> objects_users_me_password_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_me_password_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Change My Password

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_me_permissions_get**
> objects_users_me_permissions_get(_api::DefaultApi; filter=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_me_permissions_get(_api::DefaultApi, response_stream::Channel; filter=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve My User Permissions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_me_put**
> objects_users_me_put(_api::DefaultApi; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_me_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update My User

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_post**
> objects_users_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Single User

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_put**
> objects_users_put(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Multiple Users

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_user_id_delete**
> objects_users_user_id_delete(_api::DefaultApi, user_id::String; domain=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_user_id_delete(_api::DefaultApi, response_stream::Channel, user_id::String; domain=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Disable User

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**user_id** | **String** | The user id field value.  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **Bool** | When true, this disables the user account in all vaults in the domain. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_users_user_id_vault_membership_vault_id_put**
> objects_users_user_id_vault_membership_vault_id_put(_api::DefaultApi, user_id::String, vault_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_users_user_id_vault_membership_vault_id_put(_api::DefaultApi, response_stream::Channel, user_id::String, vault_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Vault Membership

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**user_id** | **String** | The user id field value. |
**vault_id** | **String** | The system-managed id field value assigned to each vault in the domain. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_vault_actions_compare_post**
> objects_vault_actions_compare_post(_api::DefaultApi; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_vault_actions_compare_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Vault Compare

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **objects_vault_actions_configreport_post**
> objects_vault_actions_configreport_post(_api::DefaultApi; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> objects_vault_actions_configreport_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Vault Configuration Report

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **query_components_post**
> query_components_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> query_components_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Component Definition Query

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **query_next_page_post**
> query_next_page_post(_api::DefaultApi, next_page::String; authorization=nothing, accept=nothing, x_vault_a_p_i_describe_query=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> query_next_page_post(_api::DefaultApi, response_stream::Channel, next_page::String; authorization=nothing, accept=nothing, x_vault_a_p_i_describe_query=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Next Page URL

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**next_page** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_describe_query** | **Bool** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **query_post**
> query_post(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_describe_query=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> query_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_describe_query=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Submitting a Query

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_describe_query** | **Bool** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **query_previous_page_post**
> query_previous_page_post(_api::DefaultApi, previous_page::String; authorization=nothing, accept=nothing, x_vault_a_p_i_describe_query=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> query_previous_page_post(_api::DefaultApi, response_stream::Channel, previous_page::String; authorization=nothing, accept=nothing, x_vault_a_p_i_describe_query=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Previous Page URL

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**previous_page** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_describe_query** | **Bool** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_me_get**
> scim_v2_me_get(_api::DefaultApi; attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_me_get(_api::DefaultApi, response_stream::Channel; attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Current User with SCIM

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **String** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [default to nothing]
 **excluded_attributes** | **String** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_me_put**
> scim_v2_me_put(_api::DefaultApi; attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_me_put(_api::DefaultApi, response_stream::Channel; attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Current User with SCIM

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **String** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [default to nothing]
 **excluded_attributes** | **String** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_resource_types_get**
> scim_v2_resource_types_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_resource_types_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All SCIM Resource Types

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_resource_types_type_get**
> scim_v2_resource_types_type_get(_api::DefaultApi, type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_resource_types_type_get(_api::DefaultApi, response_stream::Channel, type::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Single SCIM Resource Type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**type** | **String** | A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_schemas_get**
> scim_v2_schemas_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_schemas_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All SCIM Schema Information

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_schemas_id_get**
> scim_v2_schemas_id_get(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_schemas_id_get(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Single SCIM Schema Information

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_service_provider_config_get**
> scim_v2_service_provider_config_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_service_provider_config_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve SCIM Provider

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_type_get**
> scim_v2_type_get(_api::DefaultApi, type::String; filter=nothing, attributes=nothing, excluded_attributes=nothing, sort_by=nothing, sort_order=nothing, start_index=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_type_get(_api::DefaultApi, response_stream::Channel, type::String; filter=nothing, attributes=nothing, excluded_attributes=nothing, sort_by=nothing, sort_order=nothing, start_index=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve SCIM Resources

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**type** | **String** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [default to nothing]
 **attributes** | **String** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [default to nothing]
 **excluded_attributes** | **String** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [default to nothing]
 **sort_by** | **String** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [default to nothing]
 **sort_order** | **String** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [default to nothing]
 **start_index** | **String** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_type_id_get**
> scim_v2_type_id_get(_api::DefaultApi, type::String, id::String; attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_type_id_get(_api::DefaultApi, response_stream::Channel, type::String, id::String; attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Single SCIM Resource

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**type** | **String** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. |
**id** | **String** | The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **String** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [default to nothing]
 **excluded_attributes** | **String** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_users_get**
> scim_v2_users_get(_api::DefaultApi; filter=nothing, attributes=nothing, excluded_attributes=nothing, sort_by=nothing, sort_order=nothing, count=nothing, start_index=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_users_get(_api::DefaultApi, response_stream::Channel; filter=nothing, attributes=nothing, excluded_attributes=nothing, sort_by=nothing, sort_order=nothing, count=nothing, start_index=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Users with SCIM

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [default to nothing]
 **attributes** | **String** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [default to nothing]
 **excluded_attributes** | **String** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [default to nothing]
 **sort_by** | **String** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [default to nothing]
 **sort_order** | **String** | Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [default to nothing]
 **count** | **String** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [default to nothing]
 **start_index** | **String** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_users_id_get**
> scim_v2_users_id_get(_api::DefaultApi, id::String; filter=nothing, attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_users_id_get(_api::DefaultApi, response_stream::Channel, id::String; filter=nothing, attributes=nothing, excluded_attributes=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Single User with SCIM

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The id of the user you wish to update. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [default to nothing]
 **attributes** | **String** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [default to nothing]
 **excluded_attributes** | **String** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_users_id_put**
> scim_v2_users_id_put(_api::DefaultApi, id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_users_id_put(_api::DefaultApi, response_stream::Channel, id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update User with SCIM

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**id** | **String** | The id of the user you wish to update. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **scim_v2_users_post**
> scim_v2_users_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> scim_v2_users_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create User with SCIM

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_certificate_cert_id_get**
> services_certificate_cert_id_get(_api::DefaultApi, cert_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_certificate_cert_id_get(_api::DefaultApi, response_stream::Channel, cert_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Signing Certificate

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**cert_id** | **String** | The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_configuration_mode_actions_disable_post**
> services_configuration_mode_actions_disable_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_configuration_mode_actions_disable_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Disable Configuration Mode

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_configuration_mode_actions_enable_post**
> services_configuration_mode_actions_enable_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_configuration_mode_actions_enable_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Enable Configuration Mode

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_directdata_files_get**
> services_directdata_files_get(_api::DefaultApi; extract_type=nothing, start_time=nothing, stop_time=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_directdata_files_get(_api::DefaultApi, response_stream::Channel; extract_type=nothing, start_time=nothing, stop_time=nothing, accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Available Direct Data Files

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extract_type** | **String** | The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [default to nothing]
 **start_time** | **Int64** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [default to nothing]
 **stop_time** | **Int64** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_directdata_files_name_get**
> services_directdata_files_name_get(_api::DefaultApi, name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_directdata_files_name_get(_api::DefaultApi, response_stream::Channel, name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Direct Data File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**name** | **String** | The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_items_content_item_get**
> services_file_staging_items_content_item_get(_api::DefaultApi, item::String; authorization=nothing, accept=nothing, range=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_items_content_item_get(_api::DefaultApi, response_stream::Channel, item::String; authorization=nothing, accept=nothing, range=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Item Content

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**item** | **String** | The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **range** | **String** | Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;. | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_items_item_delete**
> services_file_staging_items_item_delete(_api::DefaultApi, item::String; recursive=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_items_item_delete(_api::DefaultApi, response_stream::Channel, item::String; recursive=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete File or Folder

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**item** | **String** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recursive** | **String** | Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_items_item_get**
> services_file_staging_items_item_get(_api::DefaultApi, item::String; recursive=nothing, limit=nothing, format_result=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_items_item_get(_api::DefaultApi, response_stream::Channel, item::String; recursive=nothing, limit=nothing, format_result=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

List Items at a Path

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**item** | **String** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recursive** | **String** | If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [default to nothing]
 **limit** | **String** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [default to nothing]
 **format_result** | **String** | If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_items_item_put**
> services_file_staging_items_item_put(_api::DefaultApi, item::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_items_item_put(_api::DefaultApi, response_stream::Channel, item::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Folder or File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**item** | **String** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_items_post**
> services_file_staging_items_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_m_d5=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_items_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_m_d5=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Folder or File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_m_d5** | **String** | Optional: The MD5 checksum of the file being uploaded. | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_upload_get**
> services_file_staging_upload_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_upload_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

List Upload Sessions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_upload_post**
> services_file_staging_upload_post(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_upload_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Resumable Upload Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_delete**
> services_file_staging_upload_upload_session_id_delete(_api::DefaultApi, upload_session_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_upload_upload_session_id_delete(_api::DefaultApi, response_stream::Channel, upload_session_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Abort Upload Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**upload_session_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_get**
> services_file_staging_upload_upload_session_id_get(_api::DefaultApi, upload_session_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_upload_upload_session_id_get(_api::DefaultApi, response_stream::Channel, upload_session_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Get Upload Session Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**upload_session_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_parts_get**
> services_file_staging_upload_upload_session_id_parts_get(_api::DefaultApi, upload_session_id::String; limit=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_upload_upload_session_id_parts_get(_api::DefaultApi, response_stream::Channel, upload_session_id::String; limit=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

List File Parts Uploaded to Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**upload_session_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_post**
> services_file_staging_upload_upload_session_id_post(_api::DefaultApi, upload_session_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_upload_upload_session_id_post(_api::DefaultApi, response_stream::Channel, upload_session_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Commit Upload Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**upload_session_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_put**
> services_file_staging_upload_upload_session_id_put(_api::DefaultApi, upload_session_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_file_part_number=nothing, content_m_d5=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_file_staging_upload_upload_session_id_put(_api::DefaultApi, response_stream::Channel, upload_session_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_file_part_number=nothing, content_m_d5=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Upload to a Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**upload_session_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_file_part_number** | **String** | The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [default to nothing]
 **content_m_d5** | **String** | Optional: The MD5 checksum of the file part being uploaded. | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_jobs_histories_get**
> services_jobs_histories_get(_api::DefaultApi; start_date=nothing, end_date=nothing, status=nothing, limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_jobs_histories_get(_api::DefaultApi, response_stream::Channel; start_date=nothing, end_date=nothing, status=nothing, limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Job Histories

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **String** | Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [default to nothing]
 **end_date** | **String** | Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [default to nothing]
 **status** | **String** | Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [default to nothing]
 **limit** | **String** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [default to nothing]
 **offset** | **String** | Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_jobs_job_id_errors_get**
> services_jobs_job_id_errors_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_jobs_job_id_errors_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Import Bulk Translation File Job Errors

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_jobs_job_id_get**
> services_jobs_job_id_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_jobs_job_id_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Job Status

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The ID of the job, returned from the original job request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_jobs_job_id_summary_get**
> services_jobs_job_id_summary_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_jobs_job_id_summary_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Import Bulk Translation File Job Summary

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_jobs_job_id_tasks_get**
> services_jobs_job_id_tasks_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_jobs_job_id_tasks_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve SDK Job Tasks

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The ID of the SDK job, returned from the original job request. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_jobs_monitors_get**
> services_jobs_monitors_get(_api::DefaultApi; start_date=nothing, end_date=nothing, status=nothing, limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_jobs_monitors_get(_api::DefaultApi, response_stream::Channel; start_date=nothing, end_date=nothing, status=nothing, limit=nothing, offset=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Job Monitors

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **String** | Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [default to nothing]
 **end_date** | **String** | Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [default to nothing]
 **status** | **String** | Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [default to nothing]
 **limit** | **String** | Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [default to nothing]
 **offset** | **String** | Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_jobs_start_now_job_id_post**
> services_jobs_start_now_job_id_post(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_jobs_start_now_job_id_post(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Start Job

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The ID of the scheduled job instance to start. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_loader_extract_post**
> services_loader_extract_post(_api::DefaultApi; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_loader_extract_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Extract Data Files

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_failurelog_get**
> services_loader_job_id_tasks_task_id_failurelog_get(_api::DefaultApi, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_loader_job_id_tasks_task_id_failurelog_get(_api::DefaultApi, response_stream::Channel, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Load Failure Log Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested extract job. |
**task_id** | **String** | The id value of the requested extract task. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_results_get**
> services_loader_job_id_tasks_task_id_results_get(_api::DefaultApi, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_loader_job_id_tasks_task_id_results_get(_api::DefaultApi, response_stream::Channel, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Loader Extract Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested extract job. |
**task_id** | **String** | The id value of the requested extract task. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_results_renditions_get**
> services_loader_job_id_tasks_task_id_results_renditions_get(_api::DefaultApi, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_loader_job_id_tasks_task_id_results_renditions_get(_api::DefaultApi, response_stream::Channel, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Loader Extract Renditions Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested extract job. |
**task_id** | **String** | The id value of the requested extract task. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_successlog_get**
> services_loader_job_id_tasks_task_id_successlog_get(_api::DefaultApi, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_loader_job_id_tasks_task_id_successlog_get(_api::DefaultApi, response_stream::Channel, job_id::String, task_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Load Success Log Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The id value of the requested extract job. |
**task_id** | **String** | The id value of the requested extract task. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_loader_load_post**
> services_loader_load_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_loader_load_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Load Data Objects

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_package_actions_validate_post**
> services_package_actions_validate_post(_api::DefaultApi; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_package_actions_validate_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Validate Package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_package_post**
> services_package_post(_api::DefaultApi; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_package_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Export Package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_package_put**
> services_package_put(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_package_put(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Import Package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_queues_get**
> services_queues_get(_api::DefaultApi; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_queues_get(_api::DefaultApi, response_stream::Channel; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Queues

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_queues_queue_name_actions_disable_delivery_put**
> services_queues_queue_name_actions_disable_delivery_put(_api::DefaultApi, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_queues_queue_name_actions_disable_delivery_put(_api::DefaultApi, response_stream::Channel, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Disable Delivery

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**queue_name** | **String** | The name of a specific Queue. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_queues_queue_name_actions_enable_delivery_put**
> services_queues_queue_name_actions_enable_delivery_put(_api::DefaultApi, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_queues_queue_name_actions_enable_delivery_put(_api::DefaultApi, response_stream::Channel, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Enable Delivery

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**queue_name** | **String** | The name of a specific Queue. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_queues_queue_name_actions_reset_put**
> services_queues_queue_name_actions_reset_put(_api::DefaultApi, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_queues_queue_name_actions_reset_put(_api::DefaultApi, response_stream::Channel, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Reset Queue

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**queue_name** | **String** | The name of a specific Queue. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_queues_queue_name_get**
> services_queues_queue_name_get(_api::DefaultApi, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_queues_queue_name_get(_api::DefaultApi, response_stream::Channel, queue_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Queue Status

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**queue_name** | **String** | The name of a specific queue. For example, queue__c. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **services_vobject_vault_package_v_package_id_actions_validate_post**
> services_vobject_vault_package_v_package_id_actions_validate_post(_api::DefaultApi, package_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> services_vobject_vault_package_v_package_id_actions_validate_post(_api::DefaultApi, response_stream::Channel, package_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Validate Imported Package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**package_id** | **String** | The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **session_delete**
> session_delete(_api::DefaultApi; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> session_delete(_api::DefaultApi, response_stream::Channel; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

End Session

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** | The Vault sessionId to end. | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **uicode_distributions_distribution_name_code_get**
> uicode_distributions_distribution_name_code_get(_api::DefaultApi, distribution_name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> uicode_distributions_distribution_name_code_get(_api::DefaultApi, response_stream::Channel, distribution_name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Single Client Code Distribution

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**distribution_name** | **String** | The name attribute of the client code distribution to download. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **uicode_distributions_distribution_name_delete**
> uicode_distributions_distribution_name_delete(_api::DefaultApi, distribution_name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> uicode_distributions_distribution_name_delete(_api::DefaultApi, response_stream::Channel, distribution_name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Single Client Code Distribution

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**distribution_name** | **String** | The name attribute of the client code distribution to delete. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **uicode_distributions_distribution_name_get**
> uicode_distributions_distribution_name_get(_api::DefaultApi, distribution_name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> uicode_distributions_distribution_name_get(_api::DefaultApi, response_stream::Channel, distribution_name::String; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Single Client Code Distribution Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**distribution_name** | **String** | The name attribute of the client code distribution to delete. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **uicode_distributions_get**
> uicode_distributions_get(_api::DefaultApi; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> uicode_distributions_get(_api::DefaultApi, response_stream::Channel; accept=nothing, authorization=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve All Client Code Distribution Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **uicode_distributions_post**
> uicode_distributions_post(_api::DefaultApi; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> uicode_distributions_post(_api::DefaultApi, response_stream::Channel; accept=nothing, authorization=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Add or Replace Single Client Code Distribution

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobject_vault_package_v_package_id_actions_deploy_post**
> vobject_vault_package_v_package_id_actions_deploy_post(_api::DefaultApi, package_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobject_vault_package_v_package_id_actions_deploy_post(_api::DefaultApi, response_stream::Channel, package_id::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Deploy Package

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**package_id** | **String** | The id field value of the vault_package__v object record used for deployment. See Import Package. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobject_vault_package_v_package_id_actions_deploy_results_get**
> vobject_vault_package_v_package_id_actions_deploy_results_get(_api::DefaultApi, package_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobject_vault_package_v_package_id_actions_deploy_results_get(_api::DefaultApi, response_stream::Channel, package_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Package Deploy Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**package_id** | **String** | The id field value of the vault_package__v object record used for deployment. See Deploy Package. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_cascadedelete_results_object_name_job_status_job_id_get**
> vobjects_cascadedelete_results_object_name_job_status_job_id_get(_api::DefaultApi, object_name::String, job_status::String, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_cascadedelete_results_object_name_job_status_job_id_get(_api::DefaultApi, response_stream::Channel, object_name::String, job_status::String, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Results of Cascade Delete Job

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**job_status** | **String** |  |
**job_id** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_deepcopy_results_object_name_job_status_job_id_get**
> vobjects_deepcopy_results_object_name_job_status_job_id_get(_api::DefaultApi, object_name::String, job_status::String, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_deepcopy_results_object_name_job_status_job_id_get(_api::DefaultApi, response_stream::Channel, object_name::String, job_status::String, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Results of Deep Copy Job

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**job_status** | **String** | The ID of the job, retrieved from the response of the job request. |
**job_id** | **String** | Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_edl_item_v_actions_createplaceholder_post**
> vobjects_edl_item_v_actions_createplaceholder_post(_api::DefaultApi; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_edl_item_v_actions_createplaceholder_post(_api::DefaultApi, response_stream::Channel; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create a Placeholder from an EDL Item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_merges_job_id_log_get**
> vobjects_merges_job_id_log_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_merges_job_id_log_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Merge Records Job Log

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_merges_job_id_results_get**
> vobjects_merges_job_id_results_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_merges_job_id_results_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Record Merge Results

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_merges_job_id_status_get**
> vobjects_merges_job_id_status_get(_api::DefaultApi, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_merges_job_id_status_get(_api::DefaultApi, response_stream::Channel, job_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Record Merge Status

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**job_id** | **String** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_action_name_post**
> vobjects_object_name_actions_action_name_post(_api::DefaultApi, object_name::String, action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_actions_action_name_post(_api::DefaultApi, response_stream::Channel, object_name::String, action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Object Action on Multiple Records

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. |
**action_name** | **String** | Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_changetype_post**
> vobjects_object_name_actions_changetype_post(_api::DefaultApi, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_actions_changetype_post(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Change Object Type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The name of the object. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_merge_post**
> vobjects_object_name_actions_merge_post(_api::DefaultApi, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, vobjects_object_name_actions_merge_post_request_inner=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_actions_merge_post(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, vobjects_object_name_actions_merge_post_request_inner=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Record Merge

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. For example, account__v. This object must have Enable Merges configured. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]
 **vobjects_object_name_actions_merge_post_request_inner** | [**Vector{VobjectsObjectNameActionsMergePostRequestInner}**](VobjectsObjectNameActionsMergePostRequestInner.md) |  | 

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_recalculaterollups_get**
> vobjects_object_name_actions_recalculaterollups_get(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_actions_recalculaterollups_get(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Roll-up Field Recalculation Status

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The name of the object for which to check the status of a Roll-up field recalculation. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_recalculaterollups_post**
> vobjects_object_name_actions_recalculaterollups_post(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_actions_recalculaterollups_post(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Recalculate Roll-up Fields

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The name of the object for which to check the status of a Roll-up field recalculation. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_updatecorporatecurrency_put**
> vobjects_object_name_actions_updatecorporatecurrency_put(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_actions_updatecorporatecurrency_put(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Corporate Currency Fields

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_attachments_batch_delete**
> vobjects_object_name_attachments_batch_delete(_api::DefaultApi, object_name::String; id_param=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_attachments_batch_delete(_api::DefaultApi, response_stream::Channel, object_name::String; id_param=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Multiple Object Record Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **String** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_attachments_batch_post**
> vobjects_object_name_attachments_batch_post(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_attachments_batch_post(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Multiple Object Record Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_attachments_batch_put**
> vobjects_object_name_attachments_batch_put(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_attachments_batch_put(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Multiple Object Record Attachment Descriptions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_delete**
> vobjects_object_name_delete(_api::DefaultApi, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_delete(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Object Records

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** | Can be text/csv or application/json | [default to nothing]
 **accept** | **String** | Can be text/csv or application/json | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_id_roles_role_name_get**
> vobjects_object_name_id_roles_role_name_get(_api::DefaultApi, object_name::String, id::String, role_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_id_roles_role_name_get(_api::DefaultApi, response_stream::Channel, object_name::String, id::String, role_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Record Roles

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name. |
**id** | **String** | The id of the document, binder, or object record. |
**role_name** | **String** | Optional: Include a role name to filter for a specific role. For example, owner__v. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_action_name_get**
> vobjects_object_name_object_record_id_actions_action_name_get(_api::DefaultApi, object_name::String, object_record_id::String, action_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_actions_action_name_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, action_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object User Actions Details

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. |
**object_record_id** | **String** | The object record id field value from which to retrieve user actions. |
**action_name** | **String** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_action_name_post**
> vobjects_object_name_object_record_id_actions_action_name_post(_api::DefaultApi, object_name::String, object_record_id::String, action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_actions_action_name_post(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, action_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Initiate Object Action on a Single Record

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. |
**object_record_id** | **String** | The object record id field value from which to retrieve user actions. |
**action_name** | **String** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_cascadedelete_post**
> vobjects_object_name_object_record_id_actions_cascadedelete_post(_api::DefaultApi, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_actions_cascadedelete_post(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Cascade Delete Object Record

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_deepcopy_post**
> vobjects_object_name_object_record_id_actions_deepcopy_post(_api::DefaultApi, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_actions_deepcopy_post(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Deep Copy Object Record

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_get**
> vobjects_object_name_object_record_id_actions_get(_api::DefaultApi, object_name::String, object_record_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_actions_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; loc=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Record User Actions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **Bool** | Optional: When true, retrieves localized (translated) strings for the label.  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get**
> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(_api::DefaultApi, object_name::String, object_record_id::String, attachment_field_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_field_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Attachment Field File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. For example, product__v. |
**object_record_id** | **String** | The object record id field value. |
**attachment_field_name** | **String** | The name of the Attachment field to update. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post**
> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(_api::DefaultApi, object_name::String, object_record_id::String, attachment_field_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_field_name::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Attachment Field File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. For example, product__v. |
**object_record_id** | **String** | The object record id field value. |
**attachment_field_name** | **String** | The name of the Attachment field to update. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachment_fields_file_get**
> vobjects_object_name_object_record_id_attachment_fields_file_get(_api::DefaultApi, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachment_fields_file_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download All Attachment Field Files

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. For example, product__v. |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_delete**
> vobjects_object_name_object_record_id_attachments_attachment_id_delete(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_delete(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Object Record Attachment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_get(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Record Attachment Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_put**
> vobjects_object_name_object_record_id_attachments_attachment_id_put(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_put(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Object Record Attachment Description

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Delete Object Record Attachment Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** | The attachment version__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download Object Record Attachment File

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Record Attachment Version Metadata

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** | The attachment version__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; restore=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String, attachment_version::String; restore=nothing, authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Restore Object Record Attachment Version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |
**attachment_version** | **String** | The attachment version__v field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **restore** | **Bool** |  | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(_api::DefaultApi, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String, attachment_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Record Attachment Versions

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |
**attachment_id** | **String** | The attachment id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_file_get**
> vobjects_object_name_object_record_id_attachments_file_get(_api::DefaultApi, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_file_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Download All Object Record Attachment Files

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_get**
> vobjects_object_name_object_record_id_attachments_get(_api::DefaultApi, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Record Attachments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_post**
> vobjects_object_name_object_record_id_attachments_post(_api::DefaultApi, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_attachments_post(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create Object Record Attachment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_audittrail_get**
> vobjects_object_name_object_record_id_audittrail_get(_api::DefaultApi, object_name::String, object_record_id::String; start_date=nothing, end_date=nothing, format_result=nothing, limit=nothing, offset=nothing, events=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_audittrail_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; start_date=nothing, end_date=nothing, format_result=nothing, limit=nothing, offset=nothing, events=nothing, authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Complete Audit History for a Single Object Record

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value. |
**object_record_id** | **String** | The object record id field value from which to retrieve user actions. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **String** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  | [default to nothing]
 **end_date** | **String** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [default to nothing]
 **format_result** | **String** | To request a CSV file of your audit history, use csv.  | [default to nothing]
 **limit** | **String** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [default to nothing]
 **offset** | **String** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [default to nothing]
 **events** | **String** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_get**
> vobjects_object_name_object_record_id_get(_api::DefaultApi, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_object_record_id_get(_api::DefaultApi, response_stream::Channel, object_name::String, object_record_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Object Record

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |
**object_record_id** | **String** | The object record id field value. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_post**
> vobjects_object_name_post(_api::DefaultApi, object_name::String; id_param=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_no_triggers=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_post(_api::DefaultApi, response_stream::Channel, object_name::String; id_param=nothing, authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_no_triggers=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Create & Upsert Object Records

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **String** | To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;. | [default to nothing]
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** | Can be text/csv or application/json | [default to nothing]
 **accept** | **String** | Can be text/csv or application/json | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [default to nothing]
 **x_vault_a_p_i_no_triggers** | **Bool** | If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_put**
> vobjects_object_name_put(_api::DefaultApi, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_no_triggers=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_put(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, content_type=nothing, accept=nothing, x_vault_a_p_i_migration_mode=nothing, x_vault_a_p_i_no_triggers=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Update Object Records

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **content_type** | **String** | Can be text/csv or application/json | [default to nothing]
 **accept** | **String** | Can be text/csv or application/json | [default to nothing]
 **x_vault_a_p_i_migration_mode** | **Bool** | If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [default to nothing]
 **x_vault_a_p_i_no_triggers** | **Bool** | If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_roles_delete**
> vobjects_object_name_roles_delete(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_roles_delete(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Remove Users & Groups from Roles on Object Records

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The name of the object where you want to remove roles. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_object_name_roles_post**
> vobjects_object_name_roles_post(_api::DefaultApi, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_object_name_roles_post(_api::DefaultApi, response_stream::Channel, object_name::String; authorization=nothing, accept=nothing, content_type=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Assign Users & Groups to Roles on Object Records

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**object_name** | **String** | The name of the object where you want to remove roles. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **content_type** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **vobjects_outbound_package_v_package_id_dependencies_get**
> vobjects_outbound_package_v_package_id_dependencies_get(_api::DefaultApi, package_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Nothing, OpenAPI.Clients.ApiResponse <br/>
> vobjects_outbound_package_v_package_id_dependencies_get(_api::DefaultApi, response_stream::Channel, package_id::String; authorization=nothing, accept=nothing, x_vault_a_p_i_client_i_d=nothing, _mediaType=nothing) -> Channel{ Nothing }, OpenAPI.Clients.ApiResponse

Retrieve Outbound Package Dependencies

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**package_id** | **String** | The ID of the outbound_package__v record from which to retrieve dependencies. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String** |  | [default to nothing]
 **accept** | **String** |  | [default to nothing]
 **x_vault_a_p_i_client_i_d** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to nothing]

### Return type

Nothing

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

