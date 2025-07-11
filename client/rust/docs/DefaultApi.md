# \DefaultApi

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
[**composites_trees_edl_hierarchy_v_parent_node_id_children_get**](DefaultApi.md#composites_trees_edl_hierarchy_v_parent_node_id_children_get) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node's Children
[**composites_trees_edl_hierarchy_v_parent_node_id_children_put**](DefaultApi.md#composites_trees_edl_hierarchy_v_parent_node_id_children_put) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
[**configuration_component_type_and_record_name_get**](DefaultApi.md#configuration_component_type_and_record_name_get) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
[**configuration_component_type_get**](DefaultApi.md#configuration_component_type_get) | **GET** /configuration/{component_type} | Retrieve Component Record Collection
[**configuration_object_name_and_object_type_get**](DefaultApi.md#configuration_object_name_and_object_type_get) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
[**configuration_objecttype_get**](DefaultApi.md#configuration_objecttype_get) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types
[**configuration_role_assignment_rule_delete**](DefaultApi.md#configuration_role_assignment_rule_delete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_get**](DefaultApi.md#configuration_role_assignment_rule_get) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default & Override)
[**configuration_role_assignment_rule_post**](DefaultApi.md#configuration_role_assignment_rule_post) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_put**](DefaultApi.md#configuration_role_assignment_rule_put) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default & Override)
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
[**objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete**](DefaultApi.md#objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Binder
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
[**objects_binders_id_roles_post**](DefaultApi.md#objects_binders_id_roles_post) | **POST** /objects/binders/{id}/roles | Assign Users & Groups to Roles on a Single Binder
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
[**objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete**](DefaultApi.md#objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Document
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
[**objects_documents_id_roles_post**](DefaultApi.md#objects_documents_id_roles_post) | **POST** /objects/documents/{id}/roles | Assign Users & Groups to Roles on a Single Document
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
[**objects_documents_roles_batch_delete**](DefaultApi.md#objects_documents_roles_batch_delete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents & Binders
[**objects_documents_roles_batch_post**](DefaultApi.md#objects_documents_roles_batch_post) | **POST** /objects/documents/roles/batch | Assign Users & Groups to Roles on Multiple Documents & Binders
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
[**vobjects_object_name_post**](DefaultApi.md#vobjects_object_name_post) | **POST** /vobjects/{object_name} | Create & Upsert Object Records
[**vobjects_object_name_put**](DefaultApi.md#vobjects_object_name_put) | **PUT** /vobjects/{object_name} | Update Object Records
[**vobjects_object_name_roles_delete**](DefaultApi.md#vobjects_object_name_roles_delete) | **DELETE** /vobjects/{object_name}/roles | Remove Users & Groups from Roles on Object Records
[**vobjects_object_name_roles_post**](DefaultApi.md#vobjects_object_name_roles_post) | **POST** /vobjects/{object_name}/roles | Assign Users & Groups to Roles on Object Records
[**vobjects_outbound_package_v_package_id_dependencies_get**](DefaultApi.md#vobjects_outbound_package_v_package_id_dependencies_get) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies



## api_get

> api_get(authorization, accept, x_vault_api_client_id)
Retrieve API Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## api_mdl_components_component_type_and_record_name_files_get

> api_mdl_components_component_type_and_record_name_files_get(component_type_and_record_name, authorization, accept, x_vault_api_client_id)
Retrieve Content File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**component_type_and_record_name** | **String** | The component type of the record followed by the name of the record from which to retrieve the content file. The format is `{Componenttype}.{record_name}`. For example, `Formattedoutput.my_formatted_output__c`. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## api_mdl_components_component_type_and_record_name_get

> api_mdl_components_component_type_and_record_name_get(component_type_and_record_name, authorization, accept, x_vault_api_client_id)
Retrieve Component Record (MDL)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**component_type_and_record_name** | **String** | The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## api_mdl_execute_async_job_id_results_get

> api_mdl_execute_async_job_id_results_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Asynchronous MDL Script Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## api_mdl_execute_async_post

> api_mdl_execute_async_post(authorization, accept, x_vault_api_client_id)
Execute MDL Script Asynchronously

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## api_mdl_execute_post

> api_mdl_execute_post(authorization, accept, x_vault_api_client_id)
Execute MDL Script

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## api_mdl_files_post

> api_mdl_files_post(authorization, accept, content_type, x_vault_api_client_id)
Upload Content File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audittrail_audit_trail_type_get

> audittrail_audit_trail_type_get(audit_trail_type, start_date, end_date, all_dates, format_result, limit, offset, objects, events, authorization, accept, x_vault_api_client_id)
Retrieve Audit Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**audit_trail_type** | **String** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. | [required] |
**start_date** | Option<**String**> | Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. |  |
**end_date** | Option<**String**> | Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. |  |
**all_dates** | Option<**String**> | Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. |  |
**format_result** | Option<**String**> | To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. |  |
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. |  |
**offset** | Option<**String**> | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. |  |
**objects** | Option<**String**> | This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects=product__v,country__v. If omitted, defaults to all objects. |  |
**events** | Option<**String**> | This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events=Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## auth_discovery_post

> auth_discovery_post(accept, x_vault_api_client_id)
Authentication Type Discovery

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## auth_oauth_session_oath_oidc_profile_id_post

> auth_oauth_session_oath_oidc_profile_id_post(oath_oidc_profile_id, authorization, accept, x_vault_api_client_id)
OAuth 2.0 / OpenID Connect

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**oath_oidc_profile_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## auth_post

> auth_post(content_type, accept, x_vault_api_client_id)
User Name and Password

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_class_name_delete

> code_class_name_delete(class_name, authorization, accept, x_vault_api_client_id)
Delete Single Source Code File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**class_name** | **String** | The fully qualified class name of your file. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_class_name_disable_put

> code_class_name_disable_put(class_name, authorization, accept, content_type, x_vault_api_client_id)
Disable Vault Extension

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**class_name** | **String** | The fully qualified class name of your file. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_class_name_enable_put

> code_class_name_enable_put(class_name, authorization, accept, content_type, x_vault_api_client_id)
Enable Vault Extension

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**class_name** | **String** | The fully qualified class name of your file. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_class_name_get

> code_class_name_get(class_name, authorization, accept, x_vault_api_client_id)
Retrieve Single Source Code File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**class_name** | **String** | The fully qualified class name of your file. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_profiler_get

> code_profiler_get(authorization, accept, x_vault_api_client_id)
Retrieve All Profiling Sessions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_profiler_post

> code_profiler_post(authorization, content_type, accept, x_vault_api_client_id)
Create Profiling Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_profiler_session_name_actions_end_post

> code_profiler_session_name_actions_end_post(session_name, authorization, accept, x_vault_api_client_id)
End Profiling Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_name** | **String** | The name of the session, for example,  baseline__c. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_profiler_session_name_delete

> code_profiler_session_name_delete(session_name, authorization, accept, x_vault_api_client_id)
Delete Profiling Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_name** | **String** | The name of the session, for example,  baseline__c. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_profiler_session_name_get

> code_profiler_session_name_get(session_name, authorization, accept, x_vault_api_client_id)
Retrieve Profiling Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_name** | **String** | The name of the session, for example,  baseline__c. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_profiler_session_name_results_get

> code_profiler_session_name_results_get(session_name, authorization, accept, x_vault_api_client_id)
Download Profiling Session Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_name** | **String** | The name of the session, for example,  baseline__c. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## code_put

> code_put(authorization, accept, content_type, x_vault_api_client_id)
Add or Replace Single Source Code File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## composites_trees_edl_hierarchy_or_template_actions_listnodes_post

> composites_trees_edl_hierarchy_or_template_actions_listnodes_post(edl_hierarchy_or_template, authorization, content_type, accept, x_vault_api_client_id)
Retrieve Specific Root Nodes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**edl_hierarchy_or_template** | **String** | Choose to retrieve either edl_hierarchy__v or edl_template__v | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## composites_trees_edl_hierarchy_or_template_get

> composites_trees_edl_hierarchy_or_template_get(edl_hierarchy_or_template, authorization, content_type, accept, x_vault_api_client_id)
Retrieve All Root Nodes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**edl_hierarchy_or_template** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## composites_trees_edl_hierarchy_v_parent_node_id_children_get

> composites_trees_edl_hierarchy_v_parent_node_id_children_get(parent_node_id, authorization, content_type, accept, x_vault_api_client_id)
Retrieve a Node's Children

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**parent_node_id** | **String** | The ID of a parent node in the hierarchy. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## composites_trees_edl_hierarchy_v_parent_node_id_children_put

> composites_trees_edl_hierarchy_v_parent_node_id_children_put(parent_node_id, authorization, content_type, accept, x_vault_api_client_id)
Update Node Order

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**parent_node_id** | **String** | The ID of a parent node in the hierarchy. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_component_type_and_record_name_get

> configuration_component_type_and_record_name_get(component_type_and_record_name, loc, authorization, accept, x_vault_api_client_id)
Retrieve Component Record (XML/JSON)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**component_type_and_record_name** | **String** | The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | [required] |
**loc** | Option<**String**> | When localized (translated) strings are available, retrieve them by setting loc to true. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_component_type_get

> configuration_component_type_get(component_type, authorization, accept, x_vault_api_client_id)
Retrieve Component Record Collection

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**component_type** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_object_name_and_object_type_get

> configuration_object_name_and_object_type_get(object_name_and_object_type, loc, authorization, accept, x_vault_api_client_id)
Retrieve Details from a Specific Object

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name_and_object_type** | **String** | The object name followed by the object type in the format `Objecttype.{object_name}.{object_type}`. For example, `Objecttype.product__v.base__v`. | [required] |
**loc** | Option<**String**> | When localized (translated) strings are available, retrieve them by setting loc to true. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_objecttype_get

> configuration_objecttype_get(authorization, accept, x_vault_api_client_id)
Retrieve Details from All Object Types

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_role_assignment_rule_delete

> configuration_role_assignment_rule_delete(authorization, accept, x_vault_api_client_id)
Delete Lifecycle Role Assignment Override Rules

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_role_assignment_rule_get

> configuration_role_assignment_rule_get(lifecycle__v, role__v, product__v, country__v, study__v, study_country__v, authorization, accept, x_vault_api_client_id)
Retrieve Lifecycle Role Assignment Rules (Default & Override)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**lifecycle__v** | Option<**String**> | Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v=general_lifecycle__c |  |
**role__v** | Option<**String**> | Include the name of the role from which to retrieve information. For example: role__v=editor__c |  |
**product__v** | Option<**String**> | Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v=0PR0011001 or product__v.name__v=CholeCap |  |
**country__v** | Option<**String**> | Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v=0CR0022002 or country__v.name__v=United States |  |
**study__v** | Option<**String**> | In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v=0ST0021J01 or study__v.name__v=CholeCap Study |  |
**study_country__v** | Option<**String**> | In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v=0SC0001001 or study_country__v.name__v=Germany |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_role_assignment_rule_post

> configuration_role_assignment_rule_post(authorization, accept, content_type, x_vault_api_client_id)
Create Lifecycle Role Assignment Override Rules

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## configuration_role_assignment_rule_put

> configuration_role_assignment_rule_put(authorization, accept, content_type, x_vault_api_client_id)
Update Lifecycle Role Assignment Rules (Default & Override)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delegation_login_post

> delegation_login_post(authorization, accept, x_vault_api_client_id)
Initiate Delegated Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> | The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delegation_vaults_get

> delegation_vaults_get(authorization, accept, x_vault_api_client_id)
Retrieve Delegations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## keep_alive_post

> keep_alive_post(authorization, accept, x_vault_api_client_id)
Session Keep Alive

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## limits_get

> limits_get(authorization, accept, x_vault_api_client_id)
Retrieve Limits on Objects

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_api_usage_get

> logs_api_usage_get(date, log_format, authorization, accept, x_vault_api_client_id)
Download Daily API Usage

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**date** | Option<**String**> | The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. |  |
**log_format** | Option<**String**> | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_code_debug_get

> logs_code_debug_get(user_id, include_inactive, authorization, accept, x_vault_api_client_id)
Retrieve All Debug Logs

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_id** | Option<**String**> | Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. |  |
**include_inactive** | Option<**bool**> | Set to `true` to include debug log sessions with a status of `inactive__sys` in the response. If omitted, defaults to `false` and inactive sessions are not included in the response. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_code_debug_id_actions_reset_delete

> logs_code_debug_id_actions_reset_delete(id, authorization, accept, x_vault_api_client_id)
Delete Debug Log

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The ID of the debug log to delete. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_code_debug_id_actions_reset_post

> logs_code_debug_id_actions_reset_post(id, authorization, accept, x_vault_api_client_id)
Reset Debug Log

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The ID of the debug log to delete. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_code_debug_id_files_get

> logs_code_debug_id_files_get(id, authorization, accept, x_vault_api_client_id)
Download Debug Log Files

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The ID of the debug log to download. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_code_debug_id_get

> logs_code_debug_id_get(id, authorization, accept, x_vault_api_client_id)
Retrieve Single Debug Log

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The ID of the debug log to retrieve. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_code_debug_post

> logs_code_debug_post(authorization, accept, content_type, x_vault_api_client_id)
Create Debug Log

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logs_code_runtime_get

> logs_code_runtime_get(date, log_format, authorization, accept, x_vault_api_client_id)
Download SDK Runtime Log

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**date** | Option<**String**> |  |  |
**log_format** | Option<**String**> | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## messages_message_type_actions_import_post

> messages_message_type_actions_import_post(message_type, authorization, accept, x_vault_api_client_id)
Import Bulk Translation File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**message_type** | **String** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## messages_message_type_language_lang_actions_export_post

> messages_message_type_language_lang_actions_export_post(message_type, lang, authorization, accept, x_vault_api_client_id)
Export Bulk Translation File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**message_type** | **String** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | [required] |
**lang** | **String** | A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_audittrail_audit_trail_type_get

> metadata_audittrail_audit_trail_type_get(audit_trail_type, authorization, accept, x_vault_api_client_id)
Retrieve Audit Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**audit_trail_type** | **String** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_audittrail_get

> metadata_audittrail_get(authorization, accept, x_vault_api_client_id)
Retrieve Audit Types

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_components_component_type_get

> metadata_components_component_type_get(component_type, authorization, accept, x_vault_api_client_id)
Retrieve Component Type Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**component_type** | **String** | The component type name (Picklist, Docfield, Doctype, etc.). | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_components_get

> metadata_components_get(authorization, accept, x_vault_api_client_id)
Retrieve All Component Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_binders_templates_bindernodes_get

> metadata_objects_binders_templates_bindernodes_get(authorization, accept, x_vault_api_client_id)
Retrieve Binder Template Node Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_binders_templates_get

> metadata_objects_binders_templates_get(authorization, accept, x_vault_api_client_id)
Retrieve Binder Template Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_annotations_placemarks_types_placemark_type_get

> metadata_objects_documents_annotations_placemarks_types_placemark_type_get(placemark_type, authorization, accept, x_vault_api_client_id)
Retrieve Annotation Placemark Type Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**placemark_type** | **String** | The name of the placemark type. For example, sticky__sys. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_annotations_references_types_reference_type_get

> metadata_objects_documents_annotations_references_types_reference_type_get(reference_type, authorization, accept, x_vault_api_client_id)
Retrieve Annotation Reference Type Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**reference_type** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_annotations_types_annotation_type_get

> metadata_objects_documents_annotations_types_annotation_type_get(annotation_type, authorization, accept, x_vault_api_client_id)
Retrieve Annotation Type Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**annotation_type** | **String** | The name of the annotation type. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in Medical and PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys` | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_events_event_type_types_event_subtype_get

> metadata_objects_documents_events_event_type_types_event_subtype_get(event_type, event_subtype, authorization, accept, x_vault_api_client_id)
Retrieve Document Event SubType Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**event_type** | **String** | The event type. For example, distribution__v. | [required] |
**event_subtype** | **String** | The event subtype. For example, approved_email__v. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_events_get

> metadata_objects_documents_events_get(authorization, accept, x_vault_api_client_id)
Retrieve Document Event Types and Subtypes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_lock_get

> metadata_objects_documents_lock_get(authorization, accept, x_vault_api_client_id)
Retrieve Document Lock Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_properties_find_common_post

> metadata_objects_documents_properties_find_common_post(content_type, accept, authorization, x_vault_api_client_id)
Retrieve Common Document Fields

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_properties_get

> metadata_objects_documents_properties_get(authorization, accept, x_vault_api_client_id)
Retrieve All Document Fields

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_templates_get

> metadata_objects_documents_templates_get(authorization, accept, x_vault_api_client_id)
Retrieve Document Template Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_types_get

> metadata_objects_documents_types_get(authorization, accept, x_vault_api_client_id)
Retrieve All Document Types

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_types_type_get

> metadata_objects_documents_types_type_get(r#type, authorization, accept, x_vault_api_client_id)
Retrieve Document Type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#type** | **String** | The document type. See Retrieve Document Types. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_types_type_relationships_get

> metadata_objects_documents_types_type_relationships_get(r#type, authorization, accept, x_vault_api_client_id)
Retrieve Document Type Relationships

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#type** | **String** | The document type. See Retrieve Document Types. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get

> metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(r#type, subtype, classification, authorization, accept, x_vault_api_client_id)
Retrieve Document Classification

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#type** | **String** | The document type. See Retrieve Document Types. | [required] |
**subtype** | **String** | The document subtype. See Retrieve Document Types. | [required] |
**classification** | **String** | The document classification. See Retrieve Document Types. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_documents_types_type_subtypes_subtype_get

> metadata_objects_documents_types_type_subtypes_subtype_get(r#type, subtype, authorization, accept, x_vault_api_client_id)
Retrieve Document Subtype

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#type** | **String** | The document type. See Retrieve Document Types. | [required] |
**subtype** | **String** | The document subtype. See Retrieve Document Types. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_groups_get

> metadata_objects_groups_get(authorization, accept, x_vault_api_client_id)
Retrieve Group Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_securitypolicies_get

> metadata_objects_securitypolicies_get(authorization, accept, x_vault_api_client_id)
Retrieve Security Policy Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_objects_users_get

> metadata_objects_users_get(authorization, accept, x_vault_api_client_id)
Retrieve User Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_query_archived_documents_relationships_document_signature_sysr_get

> metadata_query_archived_documents_relationships_document_signature_sysr_get(authorization, accept, x_vault_api_client_id)
Retrieve Archived Document Signature Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_query_documents_relationships_document_signature_sysr_get

> metadata_query_documents_relationships_document_signature_sysr_get(authorization, accept, x_vault_api_client_id)
Retrieve Document Signature Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_vobjects_get

> metadata_vobjects_get(loc, authorization, accept, x_vault_api_client_id)
Retrieve Object Collection

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**loc** | Option<**bool**> | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_vobjects_object_name_actions_canceldeployment_post

> metadata_vobjects_object_name_actions_canceldeployment_post(object_name, authorization, accept, x_vault_api_client_id)
Cancel Raw Object Deployment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_vobjects_object_name_fields_object_field_name_get

> metadata_vobjects_object_name_fields_object_field_name_get(object_name, object_field_name, loc, authorization, accept, x_vault_api_client_id)
Retrieve Object Field Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_field_name** | **String** | The object field name value (id, name__v, external_id__v, etc.). | [required] |
**loc** | Option<**bool**> | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_vobjects_object_name_get

> metadata_vobjects_object_name_get(object_name, loc, authorization, accept, x_vault_api_client_id)
Retrieve Object Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**loc** | Option<**bool**> | To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_vobjects_object_name_page_layouts_get

> metadata_vobjects_object_name_page_layouts_get(object_name, authorization, accept, x_vault_api_client_id)
Retrieve Page Layouts

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## metadata_vobjects_object_name_page_layouts_layout_name_get

> metadata_vobjects_object_name_page_layouts_layout_name_get(object_name, layout_name, authorization, accept, x_vault_api_client_id)
Retrieve Page Layout Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The name of the object from which to retrieve page layout metadata. | [required] |
**layout_name** | **String** | The name of the page layout from which to retrieve metadata. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## notifications_histories_get

> notifications_histories_get(start_date, end_date, all_dates, format_result, limit, offset, authorization, accept, x_vault_api_client_id)
Retrieve Email Notification Histories

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | Option<**String**> | Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. |  |
**end_date** | Option<**String**> | Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. |  |
**all_dates** | Option<**bool**> | Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. |  |
**format_result** | Option<**String**> | To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. |  |
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. |  |
**offset** | Option<**String**> | Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## object_workflow_actions_action_get

> object_workflow_actions_action_get(action, authorization, accept, x_vault_api_client_id)
Retrieve Bulk Workflow Action Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**action** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## object_workflow_actions_action_post

> object_workflow_actions_action_post(action, authorization, accept, content_type, x_vault_api_client_id)
Initiate Workflow Actions on Multiple Workflows

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**action** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## object_workflow_actions_canceltasks_post

> object_workflow_actions_canceltasks_post(authorization, accept, content_type, x_vault_api_client_id)
Cancel Workflow Tasks

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## object_workflow_actions_cancelworkflows_post

> object_workflow_actions_cancelworkflows_post(authorization, accept, content_type, x_vault_api_client_id)
Cancel Workflows

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## object_workflow_actions_get

> object_workflow_actions_get(authorization, accept, x_vault_api_client_id)
Retrieve Bulk Workflow Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## object_workflow_actions_reassigntasks_post

> object_workflow_actions_reassigntasks_post(authorization, accept, content_type, x_vault_api_client_id)
Reassign Workflow Tasks

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## object_workflow_actions_replaceworkflowowner_post

> object_workflow_actions_replaceworkflowowner_post(authorization, accept, content_type, x_vault_api_client_id)
Replace Workflow Owner

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_actions_export_job_id_results_get

> objects_binders_actions_export_job_id_results_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Binder Export Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested export job. This is returned with the export binder requests above. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_actions_export_post

> objects_binders_binder_id_actions_export_post(binder_id, source, renditiontype, docversion, attachments, export, docfield, authorization, accept, x_vault_api_client_id)
Export Binder (Latest Version)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**source** | Option<**bool**> | to include source content or not |  |
**renditiontype** | Option<**String**> | to include viewable renditions |  |
**docversion** | Option<**String**> | to include all major versions |  |
**attachments** | Option<**String**> | to include all versions of attachments |  |
**export** | Option<**String**> | configurable filename metadata |  |
**docfield** | Option<**bool**> | to exclude document metadata csv |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_actions_post

> objects_binders_binder_id_actions_post(binder_id, authorization, content_type, accept, x_vault_api_client_id)
Refresh Binder Auto-Filing

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_binding_rule_put

> objects_binders_binder_id_binding_rule_put(binder_id, content_type, accept, authorization, x_vault_api_client_id)
Update Binding Rule

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_delete

> objects_binders_binder_id_delete(binder_id, authorization, accept, x_vault_api_client_id)
Delete Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_documents_node_id_binding_rule_put

> objects_binders_binder_id_documents_node_id_binding_rule_put(binder_id, node_id, authorization, content_type, accept, x_vault_api_client_id)
Update Binder Document Binding Rule

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**node_id** | **String** | The binder node id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_documents_post

> objects_binders_binder_id_documents_post(binder_id, authorization, content_type, accept, x_vault_api_client_id)
Add Document to Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_documents_section_id_delete

> objects_binders_binder_id_documents_section_id_delete(binder_id, section_id, authorization, accept, x_vault_api_client_id)
Remove Document from Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**section_id** | **String** | The binder node id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_documents_section_id_put

> objects_binders_binder_id_documents_section_id_put(binder_id, section_id, authorization, content_type, accept, x_vault_api_client_id)
Move Document in Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**section_id** | **String** | The binder node id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_get

> objects_binders_binder_id_get(binder_id, depth, authorization, accept, x_vault_api_client_id)
Retrieve Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**depth** | Option<**String**> | To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_post

> objects_binders_binder_id_post(binder_id, authorization, accept, x_vault_api_client_id)
Create Binder Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_put

> objects_binders_binder_id_put(binder_id, authorization, content_type, accept, x_vault_api_client_id)
Update Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete

> objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(binder_id, role_name_and_user_or_group, id, authorization, accept, x_vault_api_client_id)
Remove Users & Groups from Roles on a Single Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The id value of the binder from which to remove roles. | [required] |
**role_name_and_user_or_group** | **String** | The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. | [required] |
**id** | **String** | The id value of the user or group to remove from the role. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_sections_node_id_binding_rule_put

> objects_binders_binder_id_sections_node_id_binding_rule_put(binder_id, node_id, content_type, accept, authorization, x_vault_api_client_id)
Update Binder Section Binding Rule

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**node_id** | **String** | The binder node id field value. | [required] |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_sections_node_id_put

> objects_binders_binder_id_sections_node_id_put(binder_id, node_id, authorization, accept, content_type, x_vault_api_client_id)
Update Binder Section

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**node_id** | **String** | The binder node id of the section. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_sections_post

> objects_binders_binder_id_sections_post(binder_id, authorization, accept, content_type, x_vault_api_client_id)
Create Binder Section

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_sections_section_id_delete

> objects_binders_binder_id_sections_section_id_delete(binder_id, section_id, authorization, accept, content_type, x_vault_api_client_id)
Delete Binder Section

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**section_id** | **String** | The binder node id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_sections_section_id_get

> objects_binders_binder_id_sections_section_id_get(binder_id, section_id, authorization, accept, x_vault_api_client_id)
Retrieve Binder Sections

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**section_id** | **String** | The binder node id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_get

> objects_binders_binder_id_versions_get(binder_id, authorization, accept, x_vault_api_client_id)
Retrieve All Binder Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_actions_export_post

> objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(binder_id, major_version, minor_version, source, renditiontype, docversion, attachments, export, docfield, authorization, accept, x_vault_api_client_id)
Export Binder (Specific Version)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**source** | Option<**bool**> | to include source content or not |  |
**renditiontype** | Option<**String**> | to include viewable renditions |  |
**docversion** | Option<**String**> | to include all major versions |  |
**attachments** | Option<**String**> | to include all versions of attachments |  |
**export** | Option<**String**> | configurable filename metadata |  |
**docfield** | Option<**bool**> | to exclude document metadata csv |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_delete

> objects_binders_binder_id_versions_major_version_minor_version_delete(binder_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Delete Binder Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_get

> objects_binders_binder_id_versions_major_version_minor_version_get(binder_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Binder Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_put

> objects_binders_binder_id_versions_major_version_minor_version_put(binder_id, major_version, minor_version, authorization, content_type, accept, x_vault_api_client_id)
Update Binder Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_relationships_post

> objects_binders_binder_id_versions_major_version_minor_version_relationships_post(binder_id, major_version, minor_version, authorization, content_type, accept, x_vault_api_client_id)
Create Binder Relationship

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete

> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(binder_id, major_version, minor_version, relationship_id, authorization, accept, x_vault_api_client_id)
Delete Binder Relationship

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**relationship_id** | **String** | The binder relationship id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get

> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(binder_id, major_version, minor_version, relationship_id, authorization, accept, x_vault_api_client_id)
Retrieve Binder Relationship

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**relationship_id** | **String** | The binder relationship id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get

> objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(binder_id, major_version, minor_version, section_id, authorization, accept, x_vault_api_client_id)
Retrieve Binder Version Section

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**binder_id** | **String** | The binder id field value. | [required] |
**major_version** | **String** | The binder major_version_number__v field value. | [required] |
**minor_version** | **String** | The binder minor_version_number__v field value. | [required] |
**section_id** | **String** | Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_id_roles_get

> objects_binders_id_roles_get(id, authorization, accept, x_vault_api_client_id)
Retrieve All Binder Roles

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_id_roles_post

> objects_binders_id_roles_post(id, authorization, accept, content_type, x_vault_api_client_id)
Assign Users & Groups to Roles on a Single Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_id_roles_role_name_get

> objects_binders_id_roles_role_name_get(id, role_name, authorization, accept, x_vault_api_client_id)
Retrieve Document Role

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The binder `id`. | [required] |
**role_name** | **String** | The name of the role to retrieve. For example, `owner__v`. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get

> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Binder User Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The binder id field value from which to retrieve available user actions. | [required] |
**major_version** | **String** | The major version number of the binder. | [required] |
**minor_version** | **String** | The minor version number of the binder. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get

> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(id, major_version, minor_version, name__v, authorization, accept, x_vault_api_client_id)
Retrieve Binder Entry Criteria

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The binder id field value from which to retrieve available user actions. | [required] |
**major_version** | **String** | The major version number of the binder. | [required] |
**minor_version** | **String** | The minor version number of the binder. | [required] |
**name__v** | **String** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put

> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(id, major_version, minor_version, name__v, authorization, content_type, accept, x_vault_api_client_id)
Initiate Binder User Action

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The binder id field value from which to retrieve available user actions. | [required] |
**major_version** | **String** | The major version number of the binder. | [required] |
**minor_version** | **String** | The minor version number of the binder. | [required] |
**name__v** | **String** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_lifecycle_actions_post

> objects_binders_lifecycle_actions_post(authorization, accept, content_type, x_vault_api_client_id)
Retrieve User Actions on Multiple Binders

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_lifecycle_actions_user_action_name_put

> objects_binders_lifecycle_actions_user_action_name_put(user_action_name, authorization, content_type, accept, x_vault_api_client_id)
Initiate Bulk Binder User Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_action_name** | **String** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_post

> objects_binders_post(r#async, authorization, content_type, accept, x_vault_api_client_id)
Create Binder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#async** | Option<**bool**> | When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async=true). This helps speed up the response time from Vault when processing large amounts of data.  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_get

> objects_binders_templates_get(authorization, accept, x_vault_api_client_id)
Retrieve Binder Template Collection

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_post

> objects_binders_templates_post(authorization, accept, content_type, x_vault_api_client_id)
Create Binder Template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_put

> objects_binders_templates_put(authorization, accept, content_type, x_vault_api_client_id)
Update Binder Template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_template_name_bindernodes_get

> objects_binders_templates_template_name_bindernodes_get(template_name, authorization, accept, x_vault_api_client_id)
Retrieve Binder Template Node Attributes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The binder template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_template_name_bindernodes_post

> objects_binders_templates_template_name_bindernodes_post(template_name, authorization, accept, content_type, x_vault_api_client_id)
Create Binder Template Node

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The binder template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_template_name_bindernodes_put

> objects_binders_templates_template_name_bindernodes_put(template_name, authorization, accept, content_type, x_vault_api_client_id)
Replace Binder Template Nodes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The binder template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_template_name_delete

> objects_binders_templates_template_name_delete(template_name, authorization, accept, x_vault_api_client_id)
Delete Binder Template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The binder template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_binders_templates_template_name_get

> objects_binders_templates_template_name_get(template_name, authorization, accept, x_vault_api_client_id)
Retrieve Binder Template Attributes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The binder template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_deletions_documents_get

> objects_deletions_documents_get(start_date, end_date, authorization, content_type, accept, x_vault_api_client_id)
Retrieve Deleted Document IDs

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | Option<**String**> | Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z |  |
**end_date** | Option<**String**> | Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_deletions_vobjects_object_name_get

> objects_deletions_vobjects_object_name_get(object_name, authorization, accept, x_vault_api_client_id)
Retrieve Deleted Object Record ID

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_actions_get

> objects_documents_actions_get(loc, authorization, accept, x_vault_api_client_id)
Retrieve All Document Workflows

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**loc** | Option<**bool**> | When localized (translated) strings are available, retrieve them by setting loc to true. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get

> objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(lifecycle_and_state_and_action, job_id, authorization, accept, x_vault_api_client_id)
Download Controlled Copy Job Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**lifecycle_and_state_and_action** | **String** | The `name__v` values for the lifecycle, state, and action in the format `{lifecycle_name}.{state_name}.{action_name}`. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the `href` under the `artifacts` link. | [required] |
**job_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_actions_workflow_name_get

> objects_documents_actions_workflow_name_get(workflow_name, loc, authorization, accept, x_vault_api_client_id)
Retrieve Document Workflow Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_name** | **String** | The document workflow name value. | [required] |
**loc** | Option<**bool**> | When localized (translated) strings are available, retrieve them by setting loc to true. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_actions_workflow_name_post

> objects_documents_actions_workflow_name_post(workflow_name, authorization, accept, content_type, x_vault_api_client_id)
Initiate Document Workflow

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_name** | **String** | The document workflow name value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_annotations_batch_delete

> objects_documents_annotations_batch_delete(authorization, accept, content_type, x_vault_api_client_id)
Delete Annotations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_annotations_batch_post

> objects_documents_annotations_batch_post(authorization, content_type, accept, x_vault_api_client_id)
Create Multiple Annotations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | **String** |  | [required] |
**content_type** | **String** |  | [required] |
**accept** | **String** |  | [required] |
**x_vault_api_client_id** | **String** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_annotations_batch_put

> objects_documents_annotations_batch_put(authorization, content_type, accept, x_vault_api_client_id)
Update Annotations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_annotations_replies_batch_post

> objects_documents_annotations_replies_batch_post(authorization, content_type, accept, x_vault_api_client_id)
Add Annotation Replies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_attachments_batch_delete

> objects_documents_attachments_batch_delete(accept, authorization, content_type, x_vault_api_client_id)
Delete Multiple Document Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_attachments_batch_post

> objects_documents_attachments_batch_post(accept, authorization, content_type, x_vault_api_client_id)
Create Multiple Document Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_attachments_batch_put

> objects_documents_attachments_batch_put(accept, authorization, content_type, x_vault_api_client_id)
Update Multiple Document Attachment Descriptions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_actions_fileextract_job_id_results_get

> objects_documents_batch_actions_fileextract_job_id_results_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Document Export Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested export job. This is returned with the export document requests. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_actions_fileextract_post

> objects_documents_batch_actions_fileextract_post(source, renditions, allversions, authorization, content_type, accept, x_vault_api_client_id)
Export Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**source** | Option<**bool**> | Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true. |  |
**renditions** | Option<**bool**> | Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false. |  |
**allversions** | Option<**bool**> | Optional: To include all versions or latest version, include a query parameter allversions=true. If omitted, defaults to false. |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_actions_reclassify_put

> objects_documents_batch_actions_reclassify_put(authorization, content_type, accept, x_vault_api_migration_mode, x_vault_api_client_id)
Reclassify Multiple Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**bool**> | When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_actions_rerender_post

> objects_documents_batch_actions_rerender_post(authorization, accept, content_type, x_vault_api_client_id)
Update Multiple Document Renditions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_delete

> objects_documents_batch_delete(id_param, authorization, accept, content_type, x_vault_api_client_id)
Delete Multiple Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id_param** | Option<**String**> | If you’re identifying documents in your input by their external ID |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_lock_delete

> objects_documents_batch_lock_delete(authorization, accept, content_type, x_vault_api_client_id)
Undo Collaborative Authoring Checkout

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_post

> objects_documents_batch_post(authorization, accept, content_type, x_vault_api_migration_mode, x_vault_api_client_id)
Create Multiple Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**bool**> | When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_batch_put

> objects_documents_batch_put(authorization, accept, content_type, x_vault_api_migration_mode, x_vault_api_client_id)
Update Multiple Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**bool**> | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_anchors_get

> objects_documents_doc_id_anchors_get(doc_id, authorization, accept, x_vault_api_client_id)
Retrieve Anchor IDs

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_annotations_file_get

> objects_documents_doc_id_annotations_file_get(doc_id, authorization, accept, x_vault_api_client_id)
Export Document Annotations to PDF

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_annotations_file_post

> objects_documents_doc_id_annotations_file_post(doc_id, authorization, accept, content_type, x_vault_api_client_id)
Import Document Annotations from PDF

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_delete

> objects_documents_doc_id_attachments_attachment_id_delete(doc_id, attachment_id, accept, authorization, x_vault_api_client_id)
Delete Single Document Attachment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_file_get

> objects_documents_doc_id_attachments_attachment_id_file_get(doc_id, attachment_id, accept, authorization, x_vault_api_client_id)
Download Document Attachment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_get

> objects_documents_doc_id_attachments_attachment_id_get(doc_id, attachment_id, accept, authorization, x_vault_api_client_id)
Retrieve Document Attachment Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_put

> objects_documents_doc_id_attachments_attachment_id_put(doc_id, attachment_id, accept, authorization, content_type, x_vault_api_client_id)
Update Document Attachment Description

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete

> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(doc_id, attachment_id, attachment_version, accept, authorization, x_vault_api_client_id)
Delete Single Document Attachment Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** | The attachment version__v field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get

> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(doc_id, attachment_id, attachment_version, accept, authorization, x_vault_api_client_id)
Download Document Attachment Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** | The attachment version__v field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get

> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(doc_id, attachment_id, attachment_version, accept, authorization, x_vault_api_client_id)
Retrieve Document Attachment Version Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** | The attachment version__v field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post

> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(doc_id, attachment_id, attachment_version, restore, accept, authorization, x_vault_api_client_id)
Restore Document Attachment Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** | The attachment version__v field value. | [required] |
**restore** | Option<**bool**> | The parameter restore must be set to true.  |  |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_attachment_id_versions_get

> objects_documents_doc_id_attachments_attachment_id_versions_get(doc_id, attachment_id, accept, authorization, x_vault_api_client_id)
Retrieve Document Attachment Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_file_get

> objects_documents_doc_id_attachments_file_get(doc_id, accept, authorization, x_vault_api_client_id)
Download All Document Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_get

> objects_documents_doc_id_attachments_get(doc_id, accept, authorization, x_vault_api_client_id)
Retrieve Document Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_attachments_post

> objects_documents_doc_id_attachments_post(doc_id, accept, authorization, content_type, x_vault_api_client_id)
Create Document Attachment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_audittrail_get

> objects_documents_doc_id_audittrail_get(doc_id, start_date, end_date, format_result, limit, offset, events, authorization, accept, x_vault_api_client_id)
Retrieve Complete Audit History for a Single Document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document ID for which to retrieve audit history. | [required] |
**start_date** | Option<**String**> | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  |  |
**end_date** | Option<**String**> | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  |  |
**format_result** | Option<**String**> | To request a CSV file of your audit history, use csv.  |  |
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. |  |
**offset** | Option<**String**> | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. |  |
**events** | Option<**String**> | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events=WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_delete

> objects_documents_doc_id_delete(doc_id, authorization, accept, x_vault_api_client_id)
Delete Single Document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_events_get

> objects_documents_doc_id_events_get(doc_id, authorization, accept, x_vault_api_client_id)
Retrieve Document Events

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_file_get

> objects_documents_doc_id_file_get(doc_id, lock_document, accept, authorization, x_vault_api_client_id)
Download Document File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**lock_document** | Option<**bool**> | Set to true to Check Out this document before retrieval. If omitted, defaults to false. |  |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_get

> objects_documents_doc_id_get(doc_id, authorization, accept, x_vault_api_client_id)
Retrieve Document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_lock_delete

> objects_documents_doc_id_lock_delete(doc_id, authorization, accept, x_vault_api_client_id)
Delete Document Lock

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_lock_get

> objects_documents_doc_id_lock_get(doc_id, authorization, accept, x_vault_api_client_id)
Retrieve Document Lock

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_lock_post

> objects_documents_doc_id_lock_post(doc_id, authorization, accept, x_vault_api_client_id)
Create Document Lock

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_major_version_minor_version_attachments_file_get

> objects_documents_doc_id_major_version_minor_version_attachments_file_get(doc_id, major_version, minor_version, accept, authorization, x_vault_api_client_id)
Download All Document Version Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_post

> objects_documents_doc_id_post(doc_id, suppress_rendition, authorization, content_type, accept, x_vault_api_client_id)
Create Single Document Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**suppress_rendition** | Option<**String**> | Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_put

> objects_documents_doc_id_put(doc_id, authorization, content_type, accept, x_vault_api_migration_mode, x_vault_api_client_id)
Update Single Document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**bool**> | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_renditions_get

> objects_documents_doc_id_renditions_get(doc_id, authorization, accept, x_vault_api_client_id)
Retrieve Document Renditions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_renditions_rendition_type_delete

> objects_documents_doc_id_renditions_rendition_type_delete(doc_id, rendition_type, authorization, accept, x_vault_api_client_id)
Delete Single Document Rendition

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_renditions_rendition_type_get

> objects_documents_doc_id_renditions_rendition_type_get(doc_id, rendition_type, steady_state, authorization, accept, x_vault_api_client_id)
Download Document Rendition File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**steady_state** | Option<**String**> | Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_renditions_rendition_type_post

> objects_documents_doc_id_renditions_rendition_type_post(doc_id, rendition_type, authorization, accept, content_type, x_vault_api_client_id)
Add Single Document Rendition

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_renditions_rendition_type_put

> objects_documents_doc_id_renditions_rendition_type_put(doc_id, rendition_type, authorization, accept, content_type, x_vault_api_client_id)
Replace Document Rendition

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete

> objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(doc_id, role_name_and_user_or_group, id, authorization, accept, x_vault_api_client_id)
Remove Users & Groups from Roles on a Single Document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The id value of the document from which to remove roles. | [required] |
**role_name_and_user_or_group** | **String** | The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. | [required] |
**id** | **String** | The id value of the user or group to remove from the role. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_version_major_version_minor_version_attachments_get

> objects_documents_doc_id_version_major_version_minor_version_attachments_get(doc_id, major_version, minor_version, accept, authorization, x_vault_api_client_id)
Retrieve Document Version Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_get

> objects_documents_doc_id_versions_get(doc_id, authorization, accept, x_vault_api_client_id)
Retrieve Document Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get

> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(doc_id, major_version, minor_version, annotation_id, authorization, accept, x_vault_api_client_id)
Read Annotations by ID

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**annotation_id** | **String** | The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get

> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(doc_id, major_version, minor_version, annotation_id, authorization, accept, x_vault_api_client_id)
Read Replies of Parent Annotation

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**annotation_id** | **String** | The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get

> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(doc_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Export Document Version Annotations to PDF

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post

> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(doc_id, major_version, minor_version, authorization, accept, content_type, x_vault_api_client_id)
Import Document Version Annotations from PDF

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_annotations_get

> objects_documents_doc_id_versions_major_version_minor_version_annotations_get(doc_id, major_version, minor_version, limit, offset, annotation_types, pagination_id, authorization, accept, x_vault_api_client_id)
Read Annotations by Document Version and Type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. |  |
**offset** | Option<**String**> | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset=201. |  |
**annotation_types** | Option<**String**> | The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys`  |  |
**pagination_id** | Option<**String**> | A unique identifier used to load requests with paginated results. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get

> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(doc_id, major_version, minor_version, attachment_id, attachment_version, accept, authorization, x_vault_api_client_id)
Download Document Version Attachment Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**attachment_id** | **String** | The id field value of the attachment. | [required] |
**attachment_version** | **String** | The version of the attachment. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get

> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(doc_id, major_version, minor_version, attachment_id, attachment_version, accept, authorization, x_vault_api_client_id)
Retrieve Document Version Attachment Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**attachment_id** | **String** | The id of the document attachment to retrieve. | [required] |
**attachment_version** | **String** | Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_delete

> objects_documents_doc_id_versions_major_version_minor_version_delete(doc_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Delete Single Document Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get

> objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(doc_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Document Version Notes as CSV

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_events_post

> objects_documents_doc_id_versions_major_version_minor_version_events_post(doc_id, major_version, minor_version, authorization, accept, content_type, x_vault_api_client_id)
Create Document Event

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get

> objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(doc_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Video Annotations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The video document id field value. | [required] |
**major_version** | **String** | The video document major_version_number__v field value. | [required] |
**minor_version** | **String** | The video document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> | This `Accept` header only changes the format of the response in the case of an error. On `SUCCESS`, the HTTP Response Header `Content-Type` is set to `text/plain;charset=UnicodeLittle`. |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_file_get

> objects_documents_doc_id_versions_major_version_minor_version_file_get(doc_id, major_version, minor_version, accept, authorization, x_vault_api_client_id)
Download Document Version File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_get

> objects_documents_doc_id_versions_major_version_minor_version_get(doc_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Document Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_put

> objects_documents_doc_id_versions_major_version_minor_version_put(doc_id, major_version, minor_version, authorization, content_type, accept, x_vault_api_migration_mode, x_vault_api_client_id)
Update Document Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**bool**> | When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_relationships_get

> objects_documents_doc_id_versions_major_version_minor_version_relationships_get(doc_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Document Relationships

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_relationships_post

> objects_documents_doc_id_versions_major_version_minor_version_relationships_post(doc_id, major_version, minor_version, authorization, accept, content_type, x_vault_api_client_id)
Create Single Document Relationship

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete

> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(doc_id, major_version, minor_version, relationship_id, authorization, accept, x_vault_api_client_id)
Delete Single Document Relationship

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**relationship_id** | **String** | The relationship id field value. See Retrieve Document Relationships. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get

> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(doc_id, major_version, minor_version, relationship_id, authorization, accept, x_vault_api_client_id)
Retrieve Document Relationship

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**relationship_id** | **String** | The relationship id field value. See Retrieve Document Relationships. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_renditions_get

> objects_documents_doc_id_versions_major_version_minor_version_renditions_get(doc_id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Document Version Renditions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete

> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(doc_id, major_version, minor_version, rendition_type, authorization, accept, x_vault_api_client_id)
Delete Document Version Rendition

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get

> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(doc_id, major_version, minor_version, rendition_type, authorization, accept, x_vault_api_client_id)
Download Document Version Rendition File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post

> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(doc_id, major_version, minor_version, rendition_type, authorization, accept, content_type, x_vault_api_client_id)
Upload Document Version Rendition

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put

> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(doc_id, major_version, minor_version, rendition_type, authorization, accept, content_type, x_vault_api_client_id)
Replace Document Version Rendition

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**rendition_type** | **String** | The document rendition type. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get

> objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(doc_id, major_version, minor_version, accept, authorization, x_vault_api_client_id)
Download Document Version Thumbnail File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**doc_id** | **String** | The document id field value. | [required] |
**major_version** | **String** | The document major_version_number__v field value. | [required] |
**minor_version** | **String** | The document minor_version_number__v field value. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_get

> objects_documents_get(named_filter, scope, versionscope, search, limit, sort, start, authorization, accept, x_vault_api_client_id)
Retrieve All Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**named_filter** | Option<**String**> | Retrieves only documents which you have created. |  |
**scope** | Option<**String**> | Searches only within the document content. |  |
**versionscope** | Option<**String**> | Retrieves all document versions, rather than only the latest version. |  |
**search** | Option<**String**> | Search for documents based on a {keyword} in searchable document fields. |  |
**limit** | Option<**String**> | See VQL documentation for more information. |  |
**sort** | Option<**String**> | See VQL documentation for more information. |  |
**start** | Option<**String**> | See VQL documentation for more information. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_id_roles_get

> objects_documents_id_roles_get(id, authorization, accept, x_vault_api_client_id)
Retrieve All Document Roles

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_id_roles_post

> objects_documents_id_roles_post(id, authorization, accept, content_type, x_vault_api_client_id)
Assign Users & Groups to Roles on a Single Document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_id_roles_role_name_get

> objects_documents_id_roles_role_name_get(id, role_name, authorization, accept, x_vault_api_client_id)
Retrieve Document Role

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The document `id`. | [required] |
**role_name** | **String** | The name of the role to retrieve. For example, `owner__v`. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get

> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(id, major_version, minor_version, authorization, accept, x_vault_api_client_id)
Retrieve Document User Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The document id field value from which to retrieve available user actions. | [required] |
**major_version** | **String** | The major version number of the document. | [required] |
**minor_version** | **String** | The minor version number of the document. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get

> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(id, major_version, minor_version, name__v, authorization, accept, x_vault_api_client_id)
Retrieve Document Entry Criteria

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The document id field value from which to retrieve available user actions. | [required] |
**major_version** | **String** | The major version number of the document. | [required] |
**minor_version** | **String** | The minor version number of the document. | [required] |
**name__v** | **String** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put

> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(id, major_version, minor_version, name__v, authorization, content_type, accept, x_vault_api_client_id)
Initiate Document User Action

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The document id field value from which to retrieve available user actions. | [required] |
**major_version** | **String** | The major version number of the document. | [required] |
**minor_version** | **String** | The minor version number of the document. | [required] |
**name__v** | **String** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_lifecycle_actions_post

> objects_documents_lifecycle_actions_post(authorization, accept, content_type, x_vault_api_client_id)
Retrieve User Actions on Multiple Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_lifecycle_actions_user_action_name_put

> objects_documents_lifecycle_actions_user_action_name_put(user_action_name, authorization, content_type, accept, x_vault_api_client_id)
Initiate Bulk Document User Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_action_name** | **String** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_post

> objects_documents_post(authorization, accept, x_vault_api_migration_mode, x_vault_api_client_id)
Create Single Document

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**bool**> | When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_relationships_batch_delete

> objects_documents_relationships_batch_delete(authorization, accept, content_type, x_vault_api_client_id)
Delete Multiple Document Relationships

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_relationships_batch_post

> objects_documents_relationships_batch_post(authorization, accept, content_type, x_vault_api_client_id)
Create Multiple Document Relationships

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_renditions_batch_delete

> objects_documents_renditions_batch_delete(authorization, accept, content_type, x_vault_api_client_id)
Delete Multiple Document Renditions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_renditions_batch_post

> objects_documents_renditions_batch_post(id_param, large_size_asset, authorization, accept, content_type, x_vault_api_migration_mode, x_vault_api_client_id)
Add Multiple Document Renditions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id_param** | Option<**String**> | If you’re identifying documents in your input by their external ID |  |
**large_size_asset** | Option<**String**> | If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**bool**> | Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_roles_batch_delete

> objects_documents_roles_batch_delete(authorization, content_type, accept, x_vault_api_client_id)
Remove Users and Groups from Roles on Multiple Documents & Binders

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_roles_batch_post

> objects_documents_roles_batch_post(authorization, accept, content_type, x_vault_api_client_id)
Assign Users & Groups to Roles on Multiple Documents & Binders

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_templates_get

> objects_documents_templates_get(authorization, accept, x_vault_api_client_id)
Retrieve Document Template Collection

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_templates_post

> objects_documents_templates_post(authorization, content_type, accept, x_vault_api_client_id)
Create Single Document Template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_templates_put

> objects_documents_templates_put(authorization, accept, content_type, x_vault_api_client_id)
Update Multiple Document Templates

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_templates_template_name_delete

> objects_documents_templates_template_name_delete(template_name, authorization, accept, x_vault_api_client_id)
Delete Basic Document Template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The document template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_templates_template_name_file_get

> objects_documents_templates_template_name_file_get(template_name, authorization, accept, x_vault_api_client_id)
Download Document Template File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The document template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_templates_template_name_get

> objects_documents_templates_template_name_get(template_name, authorization, accept, x_vault_api_client_id)
Retrieve Document Template Attributes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The document template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_templates_template_name_put

> objects_documents_templates_template_name_put(template_name, authorization, accept, x_vault_api_client_id)
Update Single Document Template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**template_name** | **String** | The document template name__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_tokens_post

> objects_documents_tokens_post(authorization, content_type, accept, x_vault_api_client_id)
Document Tokens

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_versions_batch_actions_fileextract_post

> objects_documents_versions_batch_actions_fileextract_post(source, renditions, authorization, content_type, accept, x_vault_api_client_id)
Export Document Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**source** | Option<**bool**> | Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true. |  |
**renditions** | Option<**bool**> | Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false. |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_versions_batch_delete

> objects_documents_versions_batch_delete(id_param, authorization, content_type, accept, x_vault_api_client_id)
Delete Multiple Document Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id_param** | Option<**String**> | If you’re identifying documents in your input by their external ID |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_documents_versions_batch_post

> objects_documents_versions_batch_post(id_param, authorization, accept, content_type, x_vault_api_migration_mode, x_vault_api_client_id)
Create Multiple Document Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id_param** | Option<**String**> | If you’re identifying documents in your input by their external ID |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_migration_mode** | Option<**String**> | Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the `status__v` field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a> |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_domain_get

> objects_domain_get(include_application, authorization, accept, content_type, x_vault_api_client_id)
Retrieve Domain Information

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**include_application** | Option<**bool**> | To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_domains_get

> objects_domains_get(authorization, accept, content_type, x_vault_api_client_id)
Retrieve Domains

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_edl_matched_documents_batch_actions_add_post

> objects_edl_matched_documents_batch_actions_add_post(authorization, content_type, accept, x_vault_api_client_id)
Add EDL Matched Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_edl_matched_documents_batch_actions_remove_post

> objects_edl_matched_documents_batch_actions_remove_post(authorization, content_type, accept, x_vault_api_client_id)
Remove EDL Matched Documents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_groups_auto_get

> objects_groups_auto_get(limit, offset, authorization, accept, x_vault_api_client_id)
Retrieve Auto Managed Groups

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  |  |
**offset** | Option<**String**> | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_groups_get

> objects_groups_get(include_implied, authorization, accept, x_vault_api_client_id)
Retrieve All Groups

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**include_implied** | Option<**String**> | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_groups_group_id_delete

> objects_groups_group_id_delete(group_id, authorization, accept, x_vault_api_client_id)
Delete Group

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**group_id** | **String** | The group id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_groups_group_id_get

> objects_groups_group_id_get(group_id, include_implied, authorization, accept, x_vault_api_client_id)
Retrieve Group

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**group_id** | **String** | The group id field value. | [required] |
**include_implied** | Option<**bool**> | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_groups_group_id_put

> objects_groups_group_id_put(group_id, authorization, accept, content_type, x_vault_api_client_id)
Update Group

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**group_id** | **String** | The group id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_groups_post

> objects_groups_post(authorization, accept, content_type, x_vault_api_client_id)
Create Group 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_licenses_get

> objects_licenses_get(authorization, accept, x_vault_api_client_id)
Retrieve Application License Usage

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_actions_get

> objects_objectworkflows_actions_get(authorization, accept, x_vault_api_client_id)
Retrieve All Multi-Record Workflows

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_actions_workflow_name_get

> objects_objectworkflows_actions_workflow_name_get(workflow_name, authorization, x_vault_api_client_id)
Retrieve Multi-Record Workflow Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_name** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_actions_workflow_name_post

> objects_objectworkflows_actions_workflow_name_post(workflow_name, authorization, content_type, accept, x_vault_api_client_id)
Initiate Multi-Record Workflow

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_name** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_get

> objects_objectworkflows_get(object__v, record_id__v, participant, status__v, offset, page_size, loc, authorization, accept, x_vault_api_client_id)
Retrieve Workflows

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object__v** | Option<**String**> | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used.  |  |
**record_id__v** | Option<**String**> | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used.  |  |
**participant** | Option<**String**> | To retrieve all workflows available to a particular user, include the user id field value as ?participant={id}. To retrieve your own workflows, set this value to ?participant=me. This parameter is required when the object__v and record_id__v parameters are not used.  |  |
**status__v** | Option<**String**> | To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v=active__v, status__v=active__v,completed__v. Workflows with `status__v=active__v` are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v |  |
**offset** | Option<**String**> | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201.  |  |
**page_size** | Option<**String**> | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000.  |  |
**loc** | Option<**String**> | When localized (translated) strings are available, retrieve them by including ?loc=true.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_get

> objects_objectworkflows_tasks_get(object__v, record_id__v, assignee__v, status__v, offset, page_size, loc, authorization, accept, x_vault_api_client_id)
Retrieve Workflow Tasks

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object__v** | Option<**String**> | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used. |  |
**record_id__v** | Option<**String**> | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used. |  |
**assignee__v** | Option<**String**> | To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v={id}. To retrieve your own workflow tasks, set this value to ?assignee__v=me. This parameter is required when the object__v and record_id__v parameters are not used.  |  |
**status__v** | Option<**String**> | To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v=available__v or ?status__v=available__v,completed__v.  |  |
**offset** | Option<**String**> | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201.  |  |
**page_size** | Option<**String**> | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000.  |  |
**loc** | Option<**String**> | When localized (translated) strings are available, retrieve them by including ?loc=true.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_accept_post

> objects_objectworkflows_tasks_task_id_actions_accept_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Accept Single Record Workflow Task

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_cancel_post

> objects_objectworkflows_tasks_task_id_actions_cancel_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Cancel Workflow Task

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_complete_post

> objects_objectworkflows_tasks_task_id_actions_complete_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Complete Single Record Workflow Task

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_get

> objects_objectworkflows_tasks_task_id_actions_get(task_id, authorization, accept, x_vault_api_client_id)
Retrieve Workflow Task Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_mdwaccept_post

> objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Accept Multi-item Workflow Task

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post

> objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Complete Multi-item Workflow Task

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post

> objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Manage Multi-Item Workflow Content

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_mdwreassign_post

> objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Reassign Multi-item Workflow Task

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The id of the task to reassign. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_reassign_post

> objects_objectworkflows_tasks_task_id_actions_reassign_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Reassign Single Record Workflow Task

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The id of the task to reassign. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_task_action_get

> objects_objectworkflows_tasks_task_id_actions_task_action_get(task_id, task_action, loc, authorization, accept, x_vault_api_client_id)
Retrieve Workflow Task Action Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**task_action** | **String** | The name of the task action retrieved from Retrieve Workflow Task Actions. | [required] |
**loc** | Option<**String**> | When localized (translated) strings are available, retrieve them by including loc=true.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_undoaccept_post

> objects_objectworkflows_tasks_task_id_actions_undoaccept_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Undo Workflow Task Acceptance

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_actions_updateduedate_post

> objects_objectworkflows_tasks_task_id_actions_updateduedate_post(task_id, authorization, accept, content_type, x_vault_api_client_id)
Update Workflow Task Due Date

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The id of the task. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_tasks_task_id_get

> objects_objectworkflows_tasks_task_id_get(task_id, loc, authorization, accept, x_vault_api_client_id)
Retrieve Workflow Task Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**task_id** | **String** | The task id field value. | [required] |
**loc** | Option<**bool**> | When localized (translated) strings are available, retrieve them by including loc=true. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_workflow_id_actions_get

> objects_objectworkflows_workflow_id_actions_get(workflow_id, loc, authorization, accept, x_vault_api_client_id)
Retrieve Workflow Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_id** | **String** | The workflow id field value. | [required] |
**loc** | Option<**String**> | When localized (translated) strings are available, retrieve them by including loc=true.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_workflow_id_actions_workflow_action_get

> objects_objectworkflows_workflow_id_actions_workflow_action_get(workflow_id, workflow_action, authorization, accept, x_vault_api_client_id)
Retrieve Workflow Action Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_id** | **String** | The workflow id field value. | [required] |
**workflow_action** | **String** | The workflow action name retrieved from Retrieve Workflow Actions. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_workflow_id_actions_workflow_action_post

> objects_objectworkflows_workflow_id_actions_workflow_action_post(workflow_id, workflow_action, documents__sys, authorization, content_type, accept, x_vault_api_client_id)
Initiate Workflow Action

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_id** | **String** | The workflow id field value. | [required] |
**workflow_action** | **String** | The workflow action name retrieved from Retrieve Workflow Actions. | [required] |
**documents__sys** | Option<**String**> | Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_objectworkflows_workflow_id_get

> objects_objectworkflows_workflow_id_get(workflow_id, loc, authorization, accept, x_vault_api_client_id)
Retrieve Workflow Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**workflow_id** | **String** | The workflow id field value. | [required] |
**loc** | Option<**bool**> | When localized (translated) strings are available, retrieve them by including loc=true. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_picklists_get

> objects_picklists_get(authorization, accept, x_vault_api_client_id)
Retrieve All Picklists

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_picklists_picklist_name_get

> objects_picklists_picklist_name_get(picklist_name, authorization, accept, x_vault_api_client_id)
Retrieve Picklist Values

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_picklists_picklist_name_picklist_value_name_delete

> objects_picklists_picklist_name_picklist_value_name_delete(picklist_name, picklist_value_name, authorization, accept, x_vault_api_client_id)
Inactivate Picklist Value

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [required] |
**picklist_value_name** | **String** | The picklist value name field value (north_america__c, south_america__c, etc.) | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_picklists_picklist_name_picklist_value_name_put

> objects_picklists_picklist_name_picklist_value_name_put(picklist_name, picklist_value_name, authorization, accept, content_type, x_vault_api_client_id)
Update Picklist Value

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [required] |
**picklist_value_name** | **String** | The picklist value name field value (north_america__c, south_america__c, etc.) | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_picklists_picklist_name_post

> objects_picklists_picklist_name_post(picklist_name, authorization, accept, content_type, x_vault_api_client_id)
Create Picklist Values

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_picklists_picklist_name_put

> objects_picklists_picklist_name_put(picklist_name, authorization, accept, content_type, x_vault_api_client_id)
Update Picklist Value Label

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**picklist_name** | **String** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_actions_buildproduction_post

> objects_sandbox_actions_buildproduction_post(authorization, accept, content_type, x_vault_api_client_id)
Build Production Vault

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_actions_promoteproduction_post

> objects_sandbox_actions_promoteproduction_post(authorization, accept, content_type, x_vault_api_client_id)
Promote to Production

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_actions_recheckusage_post

> objects_sandbox_actions_recheckusage_post(authorization, accept, content_type, x_vault_api_client_id)
Recheck Sandbox Usage Limit

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_batch_changesize_post

> objects_sandbox_batch_changesize_post(authorization, accept, content_type, x_vault_api_client_id)
Change Sandbox Size

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_entitlements_set_post

> objects_sandbox_entitlements_set_post(authorization, accept, content_type, x_vault_api_client_id)
Set Sandbox Entitlements

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_get

> objects_sandbox_get(authorization, accept, x_vault_api_client_id)
Retrieve Sandboxes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_name_delete

> objects_sandbox_name_delete(name, authorization, accept, x_vault_api_client_id)
Delete Sandbox

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**name** | **String** | The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_post

> objects_sandbox_post(authorization, accept, content_type, x_vault_api_client_id)
Create or Refresh Sandbox

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_snapshot_api_name_actions_update_post

> objects_sandbox_snapshot_api_name_actions_update_post(api_name, authorization, accept, x_vault_api_client_id)
Update Sandbox Snapshot

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**api_name** | **String** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_snapshot_api_name_actions_upgrade_post

> objects_sandbox_snapshot_api_name_actions_upgrade_post(api_name, authorization, accept, x_vault_api_client_id)
Upgrade Sandbox Snapshot

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**api_name** | **String** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_snapshot_api_name_delete

> objects_sandbox_snapshot_api_name_delete(api_name, authorization, accept, x_vault_api_client_id)
Delete Sandbox Snapshot

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**api_name** | **String** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_snapshot_get

> objects_sandbox_snapshot_get(authorization, accept, x_vault_api_client_id)
Retrieve Sandbox Snapshots

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_snapshot_post

> objects_sandbox_snapshot_post(authorization, accept, content_type, x_vault_api_client_id)
Create Sandbox Snapshot

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_vault_id_actions_refresh_post

> objects_sandbox_vault_id_actions_refresh_post(vault_id, authorization, accept, content_type, x_vault_api_client_id)
Refresh Sandbox from Snapshot

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**vault_id** | **String** | The Vault ID of the sandbox to be refreshed. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_sandbox_vault_id_get

> objects_sandbox_vault_id_get(vault_id, authorization, accept, x_vault_api_client_id)
Retrieve Sandbox Details by ID

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**vault_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_securitypolicies_get

> objects_securitypolicies_get(authorization, accept, x_vault_api_client_id)
Retrieve All Security Policies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_securitypolicies_security_policy_name_get

> objects_securitypolicies_security_policy_name_get(security_policy_name, authorization, accept, x_vault_api_client_id)
Retrieve Security Policy

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**security_policy_name** | **String** | Security policy name__v field value (retrieved from previous request). This is typically a numeric value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_get

> objects_users_get(vaults, exclude_vault_membership, exclude_app_licensing, authorization, accept, x_vault_api_client_id)
Retrieve All Users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**vaults** | Option<**String**> | Retrieve all users assigned to all Vaults in your domain. |  |
**exclude_vault_membership** | Option<**String**> | Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. |  |
**exclude_app_licensing** | Option<**String**> | Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_id_get

> objects_users_id_get(id, exclude_vault_membership, exclude_app_licensing, authorization, accept, x_vault_api_client_id)
Retrieve User

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The user id field value. Use the value me to get information for the currently authenticated user. | [required] |
**exclude_vault_membership** | Option<**String**> | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. |  |
**exclude_app_licensing** | Option<**String**> | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_id_permissions_get

> objects_users_id_permissions_get(id, filter, authorization, accept, x_vault_api_client_id)
Retrieve User Permissions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The ID of the user. Use the value me to retrieve information for the currently authenticated user. | [required] |
**filter** | Option<**String**> | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_id_put

> objects_users_id_put(id, authorization, content_type, x_vault_api_client_id)
Update Single User

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The user id field value. Use the value me to get information for the currently authenticated user. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_me_get

> objects_users_me_get(exclude_vault_membership, exclude_app_licensing, authorization, accept, x_vault_api_client_id)
Validate Session User

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**exclude_vault_membership** | Option<**String**> | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. |  |
**exclude_app_licensing** | Option<**String**> | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_me_password_post

> objects_users_me_password_post(authorization, content_type, accept, x_vault_api_client_id)
Change My Password

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_me_permissions_get

> objects_users_me_permissions_get(filter, authorization, accept, x_vault_api_client_id)
Retrieve My User Permissions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**filter** | Option<**String**> | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_me_put

> objects_users_me_put(authorization, content_type, x_vault_api_client_id)
Update My User

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_post

> objects_users_post(authorization, accept, content_type, x_vault_api_client_id)
Create Single User

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_put

> objects_users_put(authorization, content_type, accept, x_vault_api_client_id)
Update Multiple Users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_user_id_delete

> objects_users_user_id_delete(user_id, domain, authorization, accept, x_vault_api_client_id)
Disable User

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_id** | **String** | The user id field value.  | [required] |
**domain** | Option<**bool**> | When true, this disables the user account in all vaults in the domain. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_users_user_id_vault_membership_vault_id_put

> objects_users_user_id_vault_membership_vault_id_put(user_id, vault_id, authorization, content_type, accept, x_vault_api_client_id)
Update Vault Membership

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_id** | **String** | The user id field value. | [required] |
**vault_id** | **String** | The system-managed id field value assigned to each vault in the domain. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_vault_actions_compare_post

> objects_vault_actions_compare_post(authorization, content_type, x_vault_api_client_id)
Vault Compare

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## objects_vault_actions_configreport_post

> objects_vault_actions_configreport_post(authorization, content_type, x_vault_api_client_id)
Vault Configuration Report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## query_components_post

> query_components_post(authorization, accept, content_type, x_vault_api_client_id)
Component Definition Query

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## query_next_page_post

> query_next_page_post(next_page, authorization, accept, x_vault_api_describe_query, content_type, x_vault_api_client_id)
Next Page URL

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**next_page** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_describe_query** | Option<**bool**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## query_post

> query_post(authorization, accept, x_vault_api_describe_query, content_type, x_vault_api_client_id)
Submitting a Query

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_describe_query** | Option<**bool**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## query_previous_page_post

> query_previous_page_post(previous_page, authorization, accept, x_vault_api_describe_query, content_type, x_vault_api_client_id)
Previous Page URL

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**previous_page** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_describe_query** | Option<**bool**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_me_get

> scim_v2_me_get(attributes, excluded_attributes, authorization, accept, x_vault_api_client_id)
Retrieve Current User with SCIM

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**attributes** | Option<**String**> | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. |  |
**excluded_attributes** | Option<**String**> | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_me_put

> scim_v2_me_put(attributes, excluded_attributes, authorization, accept, content_type, x_vault_api_client_id)
Update Current User with SCIM

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**attributes** | Option<**String**> | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. |  |
**excluded_attributes** | Option<**String**> | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_resource_types_get

> scim_v2_resource_types_get(authorization, accept, x_vault_api_client_id)
Retrieve All SCIM Resource Types

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_resource_types_type_get

> scim_v2_resource_types_type_get(r#type, authorization, accept, x_vault_api_client_id)
Retrieve Single SCIM Resource Type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#type** | **String** | A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_schemas_get

> scim_v2_schemas_get(authorization, accept, x_vault_api_client_id)
Retrieve All SCIM Schema Information

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_schemas_id_get

> scim_v2_schemas_id_get(id, authorization, accept, x_vault_api_client_id)
Retrieve Single SCIM Schema Information

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_service_provider_config_get

> scim_v2_service_provider_config_get(authorization, accept, x_vault_api_client_id)
Retrieve SCIM Provider

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_type_get

> scim_v2_type_get(r#type, filter, attributes, excluded_attributes, sort_by, sort_order, start_index, authorization, accept, x_vault_api_client_id)
Retrieve SCIM Resources

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#type** | **String** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | [required] |
**filter** | Option<**String**> | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator. |  |
**attributes** | Option<**String**> | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. |  |
**excluded_attributes** | Option<**String**> | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. |  |
**sort_by** | Option<**String**> | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage |  |
**sort_order** | Option<**String**> | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. |  |
**start_index** | Option<**String**> | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_type_id_get

> scim_v2_type_id_get(r#type, id, attributes, excluded_attributes, authorization, accept, x_vault_api_client_id)
Retrieve Single SCIM Resource

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**r#type** | **String** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | [required] |
**id** | **String** | The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. | [required] |
**attributes** | Option<**String**> | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. |  |
**excluded_attributes** | Option<**String**> | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_users_get

> scim_v2_users_get(filter, attributes, excluded_attributes, sort_by, sort_order, count, start_index, authorization, accept, x_vault_api_client_id)
Retrieve All Users with SCIM

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**filter** | Option<**String**> | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator. |  |
**attributes** | Option<**String**> | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. |  |
**excluded_attributes** | Option<**String**> | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. |  |
**sort_by** | Option<**String**> | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage |  |
**sort_order** | Option<**String**> | Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. |  |
**count** | Option<**String**> | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. |  |
**start_index** | Option<**String**> | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_users_id_get

> scim_v2_users_id_get(id, filter, attributes, excluded_attributes, authorization, accept, x_vault_api_client_id)
Retrieve Single User with SCIM

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The id of the user you wish to update. | [required] |
**filter** | Option<**String**> | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator. |  |
**attributes** | Option<**String**> | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned. |  |
**excluded_attributes** | Option<**String**> | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_users_id_put

> scim_v2_users_id_put(id, authorization, accept, content_type, x_vault_api_client_id)
Update User with SCIM

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The id of the user you wish to update. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## scim_v2_users_post

> scim_v2_users_post(authorization, accept, content_type, x_vault_api_client_id)
Create User with SCIM

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_certificate_cert_id_get

> services_certificate_cert_id_get(cert_id, authorization, accept, x_vault_api_client_id)
Retrieve Signing Certificate

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**cert_id** | **String** | The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_configuration_mode_actions_disable_post

> services_configuration_mode_actions_disable_post(authorization, accept, content_type, x_vault_api_client_id)
Disable Configuration Mode

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_configuration_mode_actions_enable_post

> services_configuration_mode_actions_enable_post(authorization, accept, content_type, x_vault_api_client_id)
Enable Configuration Mode

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_directdata_files_get

> services_directdata_files_get(extract_type, start_time, stop_time, accept, authorization, x_vault_api_client_id)
Retrieve Available Direct Data Files

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**extract_type** | Option<**String**> | The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. |  |
**start_time** | Option<**i32**> | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. |  |
**stop_time** | Option<**i32**> | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. |  |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_directdata_files_name_get

> services_directdata_files_name_get(name, accept, authorization, x_vault_api_client_id)
Download Direct Data File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**name** | **String** | The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_items_content_item_get

> services_file_staging_items_content_item_get(item, authorization, accept, range, x_vault_api_client_id)
Download Item Content

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**item** | **String** | The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**range** | Option<**String**> | Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format `bytes={min}-{max}`. For example, `bytes=0-1000`. |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_items_item_delete

> services_file_staging_items_item_delete(item, recursive, authorization, accept, x_vault_api_client_id)
Delete File or Folder

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**item** | **String** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [required] |
**recursive** | Option<**String**> | Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_items_item_get

> services_file_staging_items_item_get(item, recursive, limit, format_result, authorization, accept, x_vault_api_client_id)
List Items at a Path

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**item** | **String** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [required] |
**recursive** | Option<**String**> | If true, the response will contain the contents of all subfolders. If not specified, the default value is false. |  |
**limit** | Option<**String**> | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. |  |
**format_result** | Option<**String**> | If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_items_item_put

> services_file_staging_items_item_put(item, authorization, accept, x_vault_api_client_id)
Update Folder or File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**item** | **String** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_items_post

> services_file_staging_items_post(authorization, accept, content_md5, x_vault_api_client_id)
Create Folder or File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_md5** | Option<**String**> | Optional: The MD5 checksum of the file being uploaded. |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_upload_get

> services_file_staging_upload_get(authorization, accept, x_vault_api_client_id)
List Upload Sessions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_upload_post

> services_file_staging_upload_post(authorization, accept, x_vault_api_client_id)
Create Resumable Upload Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_upload_upload_session_id_delete

> services_file_staging_upload_upload_session_id_delete(upload_session_id, authorization, accept, x_vault_api_client_id)
Abort Upload Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**upload_session_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_upload_upload_session_id_get

> services_file_staging_upload_upload_session_id_get(upload_session_id, authorization, accept, x_vault_api_client_id)
Get Upload Session Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**upload_session_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_upload_upload_session_id_parts_get

> services_file_staging_upload_upload_session_id_parts_get(upload_session_id, limit, authorization, accept, x_vault_api_client_id)
List File Parts Uploaded to Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**upload_session_id** | **String** |  | [required] |
**limit** | Option<**String**> | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_upload_upload_session_id_post

> services_file_staging_upload_upload_session_id_post(upload_session_id, authorization, accept, x_vault_api_client_id)
Commit Upload Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**upload_session_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_file_staging_upload_upload_session_id_put

> services_file_staging_upload_upload_session_id_put(upload_session_id, authorization, accept, content_type, x_vault_api_file_part_number, content_md5, x_vault_api_client_id)
Upload to a Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**upload_session_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_file_part_number** | Option<**String**> | The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. |  |
**content_md5** | Option<**String**> | Optional: The MD5 checksum of the file part being uploaded. |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_jobs_histories_get

> services_jobs_histories_get(start_date, end_date, status, limit, offset, authorization, accept, x_vault_api_client_id)
Retrieve Job Histories

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | Option<**String**> | Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. |  |
**end_date** | Option<**String**> | Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. |  |
**status** | Option<**String**> | Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. |  |
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. |  |
**offset** | Option<**String**> | Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_jobs_job_id_errors_get

> services_jobs_job_id_errors_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Import Bulk Translation File Job Errors

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_jobs_job_id_get

> services_jobs_job_id_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Job Status

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The ID of the job, returned from the original job request. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_jobs_job_id_summary_get

> services_jobs_job_id_summary_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Import Bulk Translation File Job Summary

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_jobs_job_id_tasks_get

> services_jobs_job_id_tasks_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve SDK Job Tasks

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The ID of the SDK job, returned from the original job request. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_jobs_monitors_get

> services_jobs_monitors_get(start_date, end_date, status, limit, offset, authorization, accept, x_vault_api_client_id)
Retrieve Job Monitors

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | Option<**String**> | Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. |  |
**end_date** | Option<**String**> | Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. |  |
**status** | Option<**String**> | Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. |  |
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. |  |
**offset** | Option<**String**> | Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_jobs_start_now_job_id_post

> services_jobs_start_now_job_id_post(job_id, authorization, accept, x_vault_api_client_id)
Start Job

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The ID of the scheduled job instance to start. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_loader_extract_post

> services_loader_extract_post(authorization, accept, content_type, x_vault_api_client_id)
Extract Data Files

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_loader_job_id_tasks_task_id_failurelog_get

> services_loader_job_id_tasks_task_id_failurelog_get(job_id, task_id, authorization, accept, x_vault_api_client_id)
Retrieve Load Failure Log Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested extract job. | [required] |
**task_id** | **String** | The id value of the requested extract task. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_loader_job_id_tasks_task_id_results_get

> services_loader_job_id_tasks_task_id_results_get(job_id, task_id, authorization, accept, x_vault_api_client_id)
Retrieve Loader Extract Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested extract job. | [required] |
**task_id** | **String** | The id value of the requested extract task. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_loader_job_id_tasks_task_id_results_renditions_get

> services_loader_job_id_tasks_task_id_results_renditions_get(job_id, task_id, authorization, accept, x_vault_api_client_id)
Retrieve Loader Extract Renditions Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested extract job. | [required] |
**task_id** | **String** | The id value of the requested extract task. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_loader_job_id_tasks_task_id_successlog_get

> services_loader_job_id_tasks_task_id_successlog_get(job_id, task_id, authorization, accept, x_vault_api_client_id)
Retrieve Load Success Log Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The id value of the requested extract job. | [required] |
**task_id** | **String** | The id value of the requested extract task. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_loader_load_post

> services_loader_load_post(authorization, content_type, accept, x_vault_api_client_id)
Load Data Objects

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_package_actions_validate_post

> services_package_actions_validate_post(authorization, content_type, x_vault_api_client_id)
Validate Package

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_package_post

> services_package_post(authorization, content_type, x_vault_api_client_id)
Export Package

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_package_put

> services_package_put(authorization, content_type, accept, x_vault_api_client_id)
Import Package

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_queues_get

> services_queues_get(authorization, accept, x_vault_api_client_id)
Retrieve All Queues

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_queues_queue_name_actions_disable_delivery_put

> services_queues_queue_name_actions_disable_delivery_put(queue_name, authorization, accept, x_vault_api_client_id)
Disable Delivery

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**queue_name** | **String** | The name of a specific Queue. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_queues_queue_name_actions_enable_delivery_put

> services_queues_queue_name_actions_enable_delivery_put(queue_name, authorization, accept, x_vault_api_client_id)
Enable Delivery

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**queue_name** | **String** | The name of a specific Queue. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_queues_queue_name_actions_reset_put

> services_queues_queue_name_actions_reset_put(queue_name, authorization, accept, x_vault_api_client_id)
Reset Queue

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**queue_name** | **String** | The name of a specific Queue. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_queues_queue_name_get

> services_queues_queue_name_get(queue_name, authorization, accept, x_vault_api_client_id)
Retrieve Queue Status

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**queue_name** | **String** | The name of a specific queue. For example, queue__c. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## services_vobject_vault_package_v_package_id_actions_validate_post

> services_vobject_vault_package_v_package_id_actions_validate_post(package_id, authorization, accept, x_vault_api_client_id)
Validate Imported Package

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**package_id** | **String** | The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## session_delete

> session_delete(accept, authorization, x_vault_api_client_id)
End Session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> | The Vault sessionId to end. |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicode_distributions_distribution_name_code_get

> uicode_distributions_distribution_name_code_get(distribution_name, accept, authorization, x_vault_api_client_id)
Download Single Client Code Distribution

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**distribution_name** | **String** | The name attribute of the client code distribution to download. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicode_distributions_distribution_name_delete

> uicode_distributions_distribution_name_delete(distribution_name, accept, authorization, x_vault_api_client_id)
Delete Single Client Code Distribution

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**distribution_name** | **String** | The name attribute of the client code distribution to delete. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicode_distributions_distribution_name_get

> uicode_distributions_distribution_name_get(distribution_name, accept, authorization, x_vault_api_client_id)
Retrieve Single Client Code Distribution Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**distribution_name** | **String** | The name attribute of the client code distribution to delete. | [required] |
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicode_distributions_get

> uicode_distributions_get(accept, authorization, x_vault_api_client_id)
Retrieve All Client Code Distribution Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uicode_distributions_post

> uicode_distributions_post(accept, authorization, content_type, x_vault_api_client_id)
Add or Replace Single Client Code Distribution

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**accept** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobject_vault_package_v_package_id_actions_deploy_post

> vobject_vault_package_v_package_id_actions_deploy_post(package_id, authorization, content_type, accept, x_vault_api_client_id)
Deploy Package

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**package_id** | **String** | The id field value of the vault_package__v object record used for deployment. See Import Package. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobject_vault_package_v_package_id_actions_deploy_results_get

> vobject_vault_package_v_package_id_actions_deploy_results_get(package_id, authorization, accept, x_vault_api_client_id)
Retrieve Package Deploy Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**package_id** | **String** | The id field value of the vault_package__v object record used for deployment. See Deploy Package. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_cascadedelete_results_object_name_job_status_job_id_get

> vobjects_cascadedelete_results_object_name_job_status_job_id_get(object_name, job_status, job_id, authorization, accept, x_vault_api_client_id)
Retrieve Results of Cascade Delete Job

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**job_status** | **String** |  | [required] |
**job_id** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_deepcopy_results_object_name_job_status_job_id_get

> vobjects_deepcopy_results_object_name_job_status_job_id_get(object_name, job_status, job_id, authorization, accept, x_vault_api_client_id)
Retrieve Results of Deep Copy Job

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**job_status** | **String** | The ID of the job, retrieved from the response of the job request. | [required] |
**job_id** | **String** | Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_edl_item_v_actions_createplaceholder_post

> vobjects_edl_item_v_actions_createplaceholder_post(authorization, content_type, accept, x_vault_api_client_id)
Create a Placeholder from an EDL Item

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_merges_job_id_log_get

> vobjects_merges_job_id_log_get(job_id, authorization, accept, x_vault_api_client_id)
Download Merge Records Job Log

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_merges_job_id_results_get

> vobjects_merges_job_id_results_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Record Merge Results

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_merges_job_id_status_get

> vobjects_merges_job_id_status_get(job_id, authorization, accept, x_vault_api_client_id)
Retrieve Record Merge Status

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **String** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_actions_action_name_post

> vobjects_object_name_actions_action_name_post(object_name, action_name, authorization, content_type, accept, x_vault_api_client_id)
Initiate Object Action on Multiple Records

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. | [required] |
**action_name** | **String** | Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_actions_changetype_post

> vobjects_object_name_actions_changetype_post(object_name, authorization, content_type, accept, x_vault_api_client_id)
Change Object Type

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The name of the object. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_actions_merge_post

> vobjects_object_name_actions_merge_post(object_name, authorization, content_type, accept, x_vault_api_client_id, _vobjects__object_name__actions_merge_post_request_inner)
Initiate Record Merge

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. For example, account__v. This object must have Enable Merges configured. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |
**_vobjects__object_name__actions_merge_post_request_inner** | Option<[**Vec<models::VobjectsObjectNameActionsMergePostRequestInner>**](_vobjects__object_name__actions_merge_post_request_inner.md)> |  |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_actions_recalculaterollups_get

> vobjects_object_name_actions_recalculaterollups_get(object_name, authorization, accept, x_vault_api_client_id)
Retrieve Roll-up Field Recalculation Status

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The name of the object for which to check the status of a Roll-up field recalculation. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_actions_recalculaterollups_post

> vobjects_object_name_actions_recalculaterollups_post(object_name, authorization, accept, x_vault_api_client_id)
Recalculate Roll-up Fields

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The name of the object for which to check the status of a Roll-up field recalculation. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_actions_updatecorporatecurrency_put

> vobjects_object_name_actions_updatecorporatecurrency_put(object_name, authorization, accept, content_type, x_vault_api_client_id)
Update Corporate Currency Fields

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_attachments_batch_delete

> vobjects_object_name_attachments_batch_delete(object_name, id_param, authorization, accept, content_type, x_vault_api_client_id)
Delete Multiple Object Record Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**id_param** | Option<**String**> |  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_attachments_batch_post

> vobjects_object_name_attachments_batch_post(object_name, authorization, accept, content_type, x_vault_api_client_id)
Create Multiple Object Record Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_attachments_batch_put

> vobjects_object_name_attachments_batch_put(object_name, authorization, accept, content_type, x_vault_api_client_id)
Update Multiple Object Record Attachment Descriptions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_delete

> vobjects_object_name_delete(object_name, authorization, content_type, accept, x_vault_api_client_id)
Delete Object Records

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> | Can be text/csv or application/json |  |
**accept** | Option<**String**> | Can be text/csv or application/json |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_id_roles_role_name_get

> vobjects_object_name_id_roles_role_name_get(object_name, id, role_name, authorization, accept, x_vault_api_client_id)
Retrieve Object Record Roles

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name. | [required] |
**id** | **String** | The id of the document, binder, or object record. | [required] |
**role_name** | **String** | Optional: Include a role name to filter for a specific role. For example, owner__v. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_actions_action_name_get

> vobjects_object_name_object_record_id_actions_action_name_get(object_name, object_record_id, action_name, authorization, accept, x_vault_api_client_id)
Retrieve Object User Actions Details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. | [required] |
**object_record_id** | **String** | The object record id field value from which to retrieve user actions. | [required] |
**action_name** | **String** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_actions_action_name_post

> vobjects_object_name_object_record_id_actions_action_name_post(object_name, object_record_id, action_name, authorization, content_type, accept, x_vault_api_client_id)
Initiate Object Action on a Single Record

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. | [required] |
**object_record_id** | **String** | The object record id field value from which to retrieve user actions. | [required] |
**action_name** | **String** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_actions_cascadedelete_post

> vobjects_object_name_object_record_id_actions_cascadedelete_post(object_name, object_record_id, authorization, accept, x_vault_api_client_id)
Cascade Delete Object Record

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_actions_deepcopy_post

> vobjects_object_name_object_record_id_actions_deepcopy_post(object_name, object_record_id, authorization, accept, content_type, x_vault_api_client_id)
Deep Copy Object Record

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_actions_get

> vobjects_object_name_object_record_id_actions_get(object_name, object_record_id, loc, authorization, accept, x_vault_api_client_id)
Retrieve Object Record User Actions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**loc** | Option<**bool**> | Optional: When true, retrieves localized (translated) strings for the label.  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get

> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(object_name, object_record_id, attachment_field_name, authorization, accept, x_vault_api_client_id)
Download Attachment Field File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. For example, product__v. | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_field_name** | **String** | The name of the Attachment field to update. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post

> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(object_name, object_record_id, attachment_field_name, authorization, accept, x_vault_api_client_id)
Update Attachment Field File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. For example, product__v. | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_field_name** | **String** | The name of the Attachment field to update. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachment_fields_file_get

> vobjects_object_name_object_record_id_attachment_fields_file_get(object_name, object_record_id, authorization, accept, x_vault_api_client_id)
Download All Attachment Field Files

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. For example, product__v. | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_delete

> vobjects_object_name_object_record_id_attachments_attachment_id_delete(object_name, object_record_id, attachment_id, authorization, accept, content_type, x_vault_api_client_id)
Delete Object Record Attachment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_get

> vobjects_object_name_object_record_id_attachments_attachment_id_get(object_name, object_record_id, attachment_id, authorization, accept, x_vault_api_client_id)
Retrieve Object Record Attachment Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_put

> vobjects_object_name_object_record_id_attachments_attachment_id_put(object_name, object_record_id, attachment_id, authorization, accept, content_type, x_vault_api_client_id)
Update Object Record Attachment Description

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete

> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(object_name, object_record_id, attachment_id, attachment_version, authorization, accept, x_vault_api_client_id)
Delete Object Record Attachment Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** | The attachment version__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get

> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(object_name, object_record_id, attachment_id, attachment_version, authorization, accept, x_vault_api_client_id)
Download Object Record Attachment File

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** |  | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get

> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(object_name, object_record_id, attachment_id, attachment_version, authorization, accept, x_vault_api_client_id)
Retrieve Object Record Attachment Version Metadata

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** | The attachment version__v field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post

> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(object_name, object_record_id, attachment_id, attachment_version, restore, authorization, accept, content_type, x_vault_api_client_id)
Restore Object Record Attachment Version

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**attachment_version** | **String** | The attachment version__v field value. | [required] |
**restore** | Option<**bool**> |  |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_attachment_id_versions_get

> vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(object_name, object_record_id, attachment_id, authorization, accept, x_vault_api_client_id)
Retrieve Object Record Attachment Versions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**attachment_id** | **String** | The attachment id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_file_get

> vobjects_object_name_object_record_id_attachments_file_get(object_name, object_record_id, authorization, accept, x_vault_api_client_id)
Download All Object Record Attachment Files

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_get

> vobjects_object_name_object_record_id_attachments_get(object_name, object_record_id, authorization, accept, x_vault_api_client_id)
Retrieve Object Record Attachments

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_attachments_post

> vobjects_object_name_object_record_id_attachments_post(object_name, object_record_id, authorization, accept, content_type, x_vault_api_client_id)
Create Object Record Attachment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_audittrail_get

> vobjects_object_name_object_record_id_audittrail_get(object_name, object_record_id, start_date, end_date, format_result, limit, offset, events, authorization, accept, x_vault_api_client_id)
Retrieve Complete Audit History for a Single Object Record

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value. | [required] |
**object_record_id** | **String** | The object record id field value from which to retrieve user actions. | [required] |
**start_date** | Option<**String**> | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  |  |
**end_date** | Option<**String**> | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  |  |
**format_result** | Option<**String**> | To request a CSV file of your audit history, use csv.  |  |
**limit** | Option<**String**> | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. |  |
**offset** | Option<**String**> | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0. |  |
**events** | Option<**String**> | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events=Copy,Edit,Delete. If omitted, defaults to all audit events. |  |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_object_record_id_get

> vobjects_object_name_object_record_id_get(object_name, object_record_id, authorization, accept, x_vault_api_client_id)
Retrieve Object Record

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**object_record_id** | **String** | The object record id field value. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_post

> vobjects_object_name_post(object_name, id_param, authorization, content_type, accept, x_vault_api_migration_mode, x_vault_api_no_triggers, x_vault_api_client_id)
Create & Upsert Object Records

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**id_param** | Option<**String**> | To upsert object records, add `idParam={field_name}` to the request endpoint. You can use any object field which has `unique` set to `true` in the object metadata. For example, `idParam=external_id__v`. |  |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> | Can be text/csv or application/json |  |
**accept** | Option<**String**> | Can be text/csv or application/json |  |
**x_vault_api_migration_mode** | Option<**bool**> | If set to `true`, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. |  |
**x_vault_api_no_triggers** | Option<**bool**> | If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_put

> vobjects_object_name_put(object_name, authorization, content_type, accept, x_vault_api_migration_mode, x_vault_api_no_triggers, x_vault_api_client_id)
Update Object Records

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The object name__v field value (product__v, country__v, custom_object__c, etc.). | [required] |
**authorization** | Option<**String**> |  |  |
**content_type** | Option<**String**> | Can be text/csv or application/json |  |
**accept** | Option<**String**> | Can be text/csv or application/json |  |
**x_vault_api_migration_mode** | Option<**bool**> | If set to `true`, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. |  |
**x_vault_api_no_triggers** | Option<**bool**> | If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_roles_delete

> vobjects_object_name_roles_delete(object_name, authorization, accept, content_type, x_vault_api_client_id)
Remove Users & Groups from Roles on Object Records

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The name of the object where you want to remove roles. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_object_name_roles_post

> vobjects_object_name_roles_post(object_name, authorization, accept, content_type, x_vault_api_client_id)
Assign Users & Groups to Roles on Object Records

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**object_name** | **String** | The name of the object where you want to remove roles. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**content_type** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## vobjects_outbound_package_v_package_id_dependencies_get

> vobjects_outbound_package_v_package_id_dependencies_get(package_id, authorization, accept, x_vault_api_client_id)
Retrieve Outbound Package Dependencies

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**package_id** | **String** | The ID of the outbound_package__v record from which to retrieve dependencies. | [required] |
**authorization** | Option<**String**> |  |  |
**accept** | Option<**String**> |  |  |
**x_vault_api_client_id** | Option<**String**> | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

