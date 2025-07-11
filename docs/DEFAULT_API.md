# DEFAULT_API

All URIs are relative to *http://}/api/v25.1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**api_get**](DEFAULT_API.md#api_get) | **Get** /api/ | Retrieve API Versions
[**api_mdl_components_component_type_and_record_name_files_get**](DEFAULT_API.md#api_mdl_components_component_type_and_record_name_files_get) | **Get** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File
[**api_mdl_components_component_type_and_record_name_get**](DEFAULT_API.md#api_mdl_components_component_type_and_record_name_get) | **Get** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL)
[**api_mdl_execute_async_job_id_results_get**](DEFAULT_API.md#api_mdl_execute_async_job_id_results_get) | **Get** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results
[**api_mdl_execute_async_post**](DEFAULT_API.md#api_mdl_execute_async_post) | **Post** /api/mdl/execute_async | Execute MDL Script Asynchronously
[**api_mdl_execute_post**](DEFAULT_API.md#api_mdl_execute_post) | **Post** /api/mdl/execute | Execute MDL Script
[**api_mdl_files_post**](DEFAULT_API.md#api_mdl_files_post) | **Post** /api/mdl/files | Upload Content File
[**audittrail_audit_trail_type_get**](DEFAULT_API.md#audittrail_audit_trail_type_get) | **Get** /audittrail/{audit_trail_type} | Retrieve Audit Details
[**auth_discovery_post**](DEFAULT_API.md#auth_discovery_post) | **Post** /auth/discovery | Authentication Type Discovery
[**auth_oauth_session_oath_oidc_profile_id_post**](DEFAULT_API.md#auth_oauth_session_oath_oidc_profile_id_post) | **Post** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect
[**auth_post**](DEFAULT_API.md#auth_post) | **Post** /auth | User Name and Password
[**code_class_name_delete**](DEFAULT_API.md#code_class_name_delete) | **Delete** /code/{class_name} | Delete Single Source Code File
[**code_class_name_disable_put**](DEFAULT_API.md#code_class_name_disable_put) | **Put** /code/{class_name}/disable | Disable Vault Extension
[**code_class_name_enable_put**](DEFAULT_API.md#code_class_name_enable_put) | **Put** /code/{class_name}/enable | Enable Vault Extension
[**code_class_name_get**](DEFAULT_API.md#code_class_name_get) | **Get** /code/{class_name} | Retrieve Single Source Code File
[**code_profiler_get**](DEFAULT_API.md#code_profiler_get) | **Get** /code/profiler | Retrieve All Profiling Sessions
[**code_profiler_post**](DEFAULT_API.md#code_profiler_post) | **Post** /code/profiler | Create Profiling Session
[**code_profiler_session_name_actions_end_post**](DEFAULT_API.md#code_profiler_session_name_actions_end_post) | **Post** /code/profiler/{session_name}/actions/end | End Profiling Session
[**code_profiler_session_name_delete**](DEFAULT_API.md#code_profiler_session_name_delete) | **Delete** /code/profiler/{session_name} | Delete Profiling Session
[**code_profiler_session_name_get**](DEFAULT_API.md#code_profiler_session_name_get) | **Get** /code/profiler/{session_name} | Retrieve Profiling Session
[**code_profiler_session_name_results_get**](DEFAULT_API.md#code_profiler_session_name_results_get) | **Get** /code/profiler/{session_name}/results | Download Profiling Session Results
[**code_put**](DEFAULT_API.md#code_put) | **Put** /code | Add or Replace Single Source Code File
[**composites_trees_edl_hierarchy_or_template_actions_listnodes_post**](DEFAULT_API.md#composites_trees_edl_hierarchy_or_template_actions_listnodes_post) | **Post** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes
[**composites_trees_edl_hierarchy_or_template_get**](DEFAULT_API.md#composites_trees_edl_hierarchy_or_template_get) | **Get** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes
[**composites_trees_edl_hierarchy_vparent_node_id_children_get**](DEFAULT_API.md#composites_trees_edl_hierarchy_vparent_node_id_children_get) | **Get** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node&#39;s Children
[**composites_trees_edl_hierarchy_vparent_node_id_children_put**](DEFAULT_API.md#composites_trees_edl_hierarchy_vparent_node_id_children_put) | **Put** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order
[**configuration_component_type_and_record_name_get**](DEFAULT_API.md#configuration_component_type_and_record_name_get) | **Get** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON)
[**configuration_component_type_get**](DEFAULT_API.md#configuration_component_type_get) | **Get** /configuration/{component_type} | Retrieve Component Record Collection
[**configuration_object_name_and_object_type_get**](DEFAULT_API.md#configuration_object_name_and_object_type_get) | **Get** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object
[**configuration_objecttype_get**](DEFAULT_API.md#configuration_objecttype_get) | **Get** /configuration/Objecttype | Retrieve Details from All Object Types
[**configuration_role_assignment_rule_delete**](DEFAULT_API.md#configuration_role_assignment_rule_delete) | **Delete** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_get**](DEFAULT_API.md#configuration_role_assignment_rule_get) | **Get** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
[**configuration_role_assignment_rule_post**](DEFAULT_API.md#configuration_role_assignment_rule_post) | **Post** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_put**](DEFAULT_API.md#configuration_role_assignment_rule_put) | **Put** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override)
[**delegation_login_post**](DEFAULT_API.md#delegation_login_post) | **Post** /delegation/login | Initiate Delegated Session
[**delegation_vaults_get**](DEFAULT_API.md#delegation_vaults_get) | **Get** /delegation/vaults | Retrieve Delegations
[**keep_alive_post**](DEFAULT_API.md#keep_alive_post) | **Post** /keep-alive | Session Keep Alive
[**limits_get**](DEFAULT_API.md#limits_get) | **Get** /limits | Retrieve Limits on Objects
[**logs_api_usage_get**](DEFAULT_API.md#logs_api_usage_get) | **Get** /logs/api_usage | Download Daily API Usage
[**logs_code_debug_get**](DEFAULT_API.md#logs_code_debug_get) | **Get** /logs/code/debug | Retrieve All Debug Logs
[**logs_code_debug_id_actions_reset_delete**](DEFAULT_API.md#logs_code_debug_id_actions_reset_delete) | **Delete** /logs/code/debug/{id}/actions/reset | Delete Debug Log
[**logs_code_debug_id_actions_reset_post**](DEFAULT_API.md#logs_code_debug_id_actions_reset_post) | **Post** /logs/code/debug/{id}/actions/reset | Reset Debug Log
[**logs_code_debug_id_files_get**](DEFAULT_API.md#logs_code_debug_id_files_get) | **Get** /logs/code/debug/{id}/files | Download Debug Log Files
[**logs_code_debug_id_get**](DEFAULT_API.md#logs_code_debug_id_get) | **Get** /logs/code/debug/{id} | Retrieve Single Debug Log
[**logs_code_debug_post**](DEFAULT_API.md#logs_code_debug_post) | **Post** /logs/code/debug | Create Debug Log
[**logs_code_runtime_get**](DEFAULT_API.md#logs_code_runtime_get) | **Get** /logs/code/runtime | Download SDK Runtime Log
[**messages_message_type_actions_import_post**](DEFAULT_API.md#messages_message_type_actions_import_post) | **Post** /messages/{message_type}/actions/import | Import Bulk Translation File
[**messages_message_type_language_lang_actions_export_post**](DEFAULT_API.md#messages_message_type_language_lang_actions_export_post) | **Post** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File
[**metadata_audittrail_audit_trail_type_get**](DEFAULT_API.md#metadata_audittrail_audit_trail_type_get) | **Get** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata
[**metadata_audittrail_get**](DEFAULT_API.md#metadata_audittrail_get) | **Get** /metadata/audittrail | Retrieve Audit Types
[**metadata_components_component_type_get**](DEFAULT_API.md#metadata_components_component_type_get) | **Get** /metadata/components/{component_type} | Retrieve Component Type Metadata
[**metadata_components_get**](DEFAULT_API.md#metadata_components_get) | **Get** /metadata/components | Retrieve All Component Metadata
[**metadata_objects_binders_templates_bindernodes_get**](DEFAULT_API.md#metadata_objects_binders_templates_bindernodes_get) | **Get** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata
[**metadata_objects_binders_templates_get**](DEFAULT_API.md#metadata_objects_binders_templates_get) | **Get** /metadata/objects/binders/templates | Retrieve Binder Template Metadata
[**metadata_objects_documents_annotations_placemarks_types_placemark_type_get**](DEFAULT_API.md#metadata_objects_documents_annotations_placemarks_types_placemark_type_get) | **Get** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata
[**metadata_objects_documents_annotations_references_types_reference_type_get**](DEFAULT_API.md#metadata_objects_documents_annotations_references_types_reference_type_get) | **Get** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata
[**metadata_objects_documents_annotations_types_annotation_type_get**](DEFAULT_API.md#metadata_objects_documents_annotations_types_annotation_type_get) | **Get** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata
[**metadata_objects_documents_events_event_type_types_event_subtype_get**](DEFAULT_API.md#metadata_objects_documents_events_event_type_types_event_subtype_get) | **Get** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata
[**metadata_objects_documents_events_get**](DEFAULT_API.md#metadata_objects_documents_events_get) | **Get** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes
[**metadata_objects_documents_lock_get**](DEFAULT_API.md#metadata_objects_documents_lock_get) | **Get** /metadata/objects/documents/lock | Retrieve Document Lock Metadata
[**metadata_objects_documents_properties_find_common_post**](DEFAULT_API.md#metadata_objects_documents_properties_find_common_post) | **Post** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields
[**metadata_objects_documents_properties_get**](DEFAULT_API.md#metadata_objects_documents_properties_get) | **Get** /metadata/objects/documents/properties | Retrieve All Document Fields
[**metadata_objects_documents_templates_get**](DEFAULT_API.md#metadata_objects_documents_templates_get) | **Get** /metadata/objects/documents/templates | Retrieve Document Template Metadata
[**metadata_objects_documents_types_get**](DEFAULT_API.md#metadata_objects_documents_types_get) | **Get** /metadata/objects/documents/types | Retrieve All Document Types
[**metadata_objects_documents_types_type_get**](DEFAULT_API.md#metadata_objects_documents_types_type_get) | **Get** /metadata/objects/documents/types/{type} | Retrieve Document Type
[**metadata_objects_documents_types_type_relationships_get**](DEFAULT_API.md#metadata_objects_documents_types_type_relationships_get) | **Get** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships
[**metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get**](DEFAULT_API.md#metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get) | **Get** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification
[**metadata_objects_documents_types_type_subtypes_subtype_get**](DEFAULT_API.md#metadata_objects_documents_types_type_subtypes_subtype_get) | **Get** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype
[**metadata_objects_groups_get**](DEFAULT_API.md#metadata_objects_groups_get) | **Get** /metadata/objects/groups | Retrieve Group Metadata
[**metadata_objects_securitypolicies_get**](DEFAULT_API.md#metadata_objects_securitypolicies_get) | **Get** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata
[**metadata_objects_users_get**](DEFAULT_API.md#metadata_objects_users_get) | **Get** /metadata/objects/users | Retrieve User Metadata
[**metadata_query_archived_documents_relationships_document_signature_sysr_get**](DEFAULT_API.md#metadata_query_archived_documents_relationships_document_signature_sysr_get) | **Get** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata
[**metadata_query_documents_relationships_document_signature_sysr_get**](DEFAULT_API.md#metadata_query_documents_relationships_document_signature_sysr_get) | **Get** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata
[**metadata_vobjects_get**](DEFAULT_API.md#metadata_vobjects_get) | **Get** /metadata/vobjects | Retrieve Object Collection
[**metadata_vobjects_object_name_actions_canceldeployment_post**](DEFAULT_API.md#metadata_vobjects_object_name_actions_canceldeployment_post) | **Post** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment
[**metadata_vobjects_object_name_fields_object_field_name_get**](DEFAULT_API.md#metadata_vobjects_object_name_fields_object_field_name_get) | **Get** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata
[**metadata_vobjects_object_name_get**](DEFAULT_API.md#metadata_vobjects_object_name_get) | **Get** /metadata/vobjects/{object_name} | Retrieve Object Metadata
[**metadata_vobjects_object_name_page_layouts_get**](DEFAULT_API.md#metadata_vobjects_object_name_page_layouts_get) | **Get** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts
[**metadata_vobjects_object_name_page_layouts_layout_name_get**](DEFAULT_API.md#metadata_vobjects_object_name_page_layouts_layout_name_get) | **Get** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata
[**notifications_histories_get**](DEFAULT_API.md#notifications_histories_get) | **Get** /notifications/histories | Retrieve Email Notification Histories
[**object_workflow_actions_action_get**](DEFAULT_API.md#object_workflow_actions_action_get) | **Get** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details
[**object_workflow_actions_action_post**](DEFAULT_API.md#object_workflow_actions_action_post) | **Post** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows
[**object_workflow_actions_canceltasks_post**](DEFAULT_API.md#object_workflow_actions_canceltasks_post) | **Post** /object/workflow/actions/canceltasks | Cancel Workflow Tasks
[**object_workflow_actions_cancelworkflows_post**](DEFAULT_API.md#object_workflow_actions_cancelworkflows_post) | **Post** /object/workflow/actions/cancelworkflows | Cancel Workflows
[**object_workflow_actions_get**](DEFAULT_API.md#object_workflow_actions_get) | **Get** /object/workflow/actions | Retrieve Bulk Workflow Actions
[**object_workflow_actions_reassigntasks_post**](DEFAULT_API.md#object_workflow_actions_reassigntasks_post) | **Post** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks
[**object_workflow_actions_replaceworkflowowner_post**](DEFAULT_API.md#object_workflow_actions_replaceworkflowowner_post) | **Post** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner
[**objects_binders_actions_export_job_id_results_get**](DEFAULT_API.md#objects_binders_actions_export_job_id_results_get) | **Get** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results
[**objects_binders_binder_id_actions_export_post**](DEFAULT_API.md#objects_binders_binder_id_actions_export_post) | **Post** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version)
[**objects_binders_binder_id_actions_post**](DEFAULT_API.md#objects_binders_binder_id_actions_post) | **Post** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing
[**objects_binders_binder_id_binding_rule_put**](DEFAULT_API.md#objects_binders_binder_id_binding_rule_put) | **Put** /objects/binders/{binder_id}/binding_rule | Update Binding Rule
[**objects_binders_binder_id_delete**](DEFAULT_API.md#objects_binders_binder_id_delete) | **Delete** /objects/binders/{binder_id} | Delete Binder
[**objects_binders_binder_id_documents_node_id_binding_rule_put**](DEFAULT_API.md#objects_binders_binder_id_documents_node_id_binding_rule_put) | **Put** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule
[**objects_binders_binder_id_documents_post**](DEFAULT_API.md#objects_binders_binder_id_documents_post) | **Post** /objects/binders/{binder_id}/documents | Add Document to Binder
[**objects_binders_binder_id_documents_section_id_delete**](DEFAULT_API.md#objects_binders_binder_id_documents_section_id_delete) | **Delete** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder
[**objects_binders_binder_id_documents_section_id_put**](DEFAULT_API.md#objects_binders_binder_id_documents_section_id_put) | **Put** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder
[**objects_binders_binder_id_get**](DEFAULT_API.md#objects_binders_binder_id_get) | **Get** /objects/binders/{binder_id} | Retrieve Binder
[**objects_binders_binder_id_post**](DEFAULT_API.md#objects_binders_binder_id_post) | **Post** /objects/binders/{binder_id} | Create Binder Version
[**objects_binders_binder_id_put**](DEFAULT_API.md#objects_binders_binder_id_put) | **Put** /objects/binders/{binder_id} | Update Binder
[**objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete**](DEFAULT_API.md#objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete) | **Delete** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder
[**objects_binders_binder_id_sections_node_id_binding_rule_put**](DEFAULT_API.md#objects_binders_binder_id_sections_node_id_binding_rule_put) | **Put** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule
[**objects_binders_binder_id_sections_node_id_put**](DEFAULT_API.md#objects_binders_binder_id_sections_node_id_put) | **Put** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section
[**objects_binders_binder_id_sections_post**](DEFAULT_API.md#objects_binders_binder_id_sections_post) | **Post** /objects/binders/{binder_id}/sections | Create Binder Section
[**objects_binders_binder_id_sections_section_id_delete**](DEFAULT_API.md#objects_binders_binder_id_sections_section_id_delete) | **Delete** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section
[**objects_binders_binder_id_sections_section_id_get**](DEFAULT_API.md#objects_binders_binder_id_sections_section_id_get) | **Get** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections
[**objects_binders_binder_id_versions_get**](DEFAULT_API.md#objects_binders_binder_id_versions_get) | **Get** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions
[**objects_binders_binder_id_versions_major_version_minor_version_actions_export_post**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_actions_export_post) | **Post** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version)
[**objects_binders_binder_id_versions_major_version_minor_version_delete**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_delete) | **Delete** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_get**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_get) | **Get** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_put**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_put) | **Put** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_post**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_relationships_post) | **Post** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete) | **Delete** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get) | **Get** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get**](DEFAULT_API.md#objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get) | **Get** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section
[**objects_binders_id_roles_get**](DEFAULT_API.md#objects_binders_id_roles_get) | **Get** /objects/binders/{id}/roles | Retrieve All Binder Roles
[**objects_binders_id_roles_post**](DEFAULT_API.md#objects_binders_id_roles_post) | **Post** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder
[**objects_binders_id_roles_role_name_get**](DEFAULT_API.md#objects_binders_id_roles_role_name_get) | **Get** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get**](DEFAULT_API.md#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get) | **Get** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get**](DEFAULT_API.md#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get) | **Get** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_vput**](DEFAULT_API.md#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_vput) | **Put** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action
[**objects_binders_lifecycle_actions_post**](DEFAULT_API.md#objects_binders_lifecycle_actions_post) | **Post** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders
[**objects_binders_lifecycle_actions_user_action_name_put**](DEFAULT_API.md#objects_binders_lifecycle_actions_user_action_name_put) | **Put** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions
[**objects_binders_post**](DEFAULT_API.md#objects_binders_post) | **Post** /objects/binders | Create Binder
[**objects_binders_templates_get**](DEFAULT_API.md#objects_binders_templates_get) | **Get** /objects/binders/templates | Retrieve Binder Template Collection
[**objects_binders_templates_post**](DEFAULT_API.md#objects_binders_templates_post) | **Post** /objects/binders/templates | Create Binder Template
[**objects_binders_templates_put**](DEFAULT_API.md#objects_binders_templates_put) | **Put** /objects/binders/templates | Update Binder Template
[**objects_binders_templates_template_name_bindernodes_get**](DEFAULT_API.md#objects_binders_templates_template_name_bindernodes_get) | **Get** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes
[**objects_binders_templates_template_name_bindernodes_post**](DEFAULT_API.md#objects_binders_templates_template_name_bindernodes_post) | **Post** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node
[**objects_binders_templates_template_name_bindernodes_put**](DEFAULT_API.md#objects_binders_templates_template_name_bindernodes_put) | **Put** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes
[**objects_binders_templates_template_name_delete**](DEFAULT_API.md#objects_binders_templates_template_name_delete) | **Delete** /objects/binders/templates/{template_name} | Delete Binder Template
[**objects_binders_templates_template_name_get**](DEFAULT_API.md#objects_binders_templates_template_name_get) | **Get** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes
[**objects_deletions_documents_get**](DEFAULT_API.md#objects_deletions_documents_get) | **Get** /objects/deletions/documents | Retrieve Deleted Document IDs
[**objects_deletions_vobjects_object_name_get**](DEFAULT_API.md#objects_deletions_vobjects_object_name_get) | **Get** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID
[**objects_documents_actions_get**](DEFAULT_API.md#objects_documents_actions_get) | **Get** /objects/documents/actions | Retrieve All Document Workflows
[**objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get**](DEFAULT_API.md#objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get) | **Get** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results
[**objects_documents_actions_workflow_name_get**](DEFAULT_API.md#objects_documents_actions_workflow_name_get) | **Get** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details
[**objects_documents_actions_workflow_name_post**](DEFAULT_API.md#objects_documents_actions_workflow_name_post) | **Post** /objects/documents/actions/{workflow_name} | Initiate Document Workflow
[**objects_documents_annotations_batch_delete**](DEFAULT_API.md#objects_documents_annotations_batch_delete) | **Delete** /objects/documents/annotations/batch | Delete Annotations
[**objects_documents_annotations_batch_post**](DEFAULT_API.md#objects_documents_annotations_batch_post) | **Post** /objects/documents/annotations/batch | Create Multiple Annotations
[**objects_documents_annotations_batch_put**](DEFAULT_API.md#objects_documents_annotations_batch_put) | **Put** /objects/documents/annotations/batch | Update Annotations
[**objects_documents_annotations_replies_batch_post**](DEFAULT_API.md#objects_documents_annotations_replies_batch_post) | **Post** /objects/documents/annotations/replies/batch | Add Annotation Replies
[**objects_documents_attachments_batch_delete**](DEFAULT_API.md#objects_documents_attachments_batch_delete) | **Delete** /objects/documents/attachments/batch | Delete Multiple Document Attachments
[**objects_documents_attachments_batch_post**](DEFAULT_API.md#objects_documents_attachments_batch_post) | **Post** /objects/documents/attachments/batch | Create Multiple Document Attachments
[**objects_documents_attachments_batch_put**](DEFAULT_API.md#objects_documents_attachments_batch_put) | **Put** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions
[**objects_documents_batch_actions_fileextract_job_id_results_get**](DEFAULT_API.md#objects_documents_batch_actions_fileextract_job_id_results_get) | **Get** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results
[**objects_documents_batch_actions_fileextract_post**](DEFAULT_API.md#objects_documents_batch_actions_fileextract_post) | **Post** /objects/documents/batch/actions/fileextract | Export Documents
[**objects_documents_batch_actions_reclassify_put**](DEFAULT_API.md#objects_documents_batch_actions_reclassify_put) | **Put** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents
[**objects_documents_batch_actions_rerender_post**](DEFAULT_API.md#objects_documents_batch_actions_rerender_post) | **Post** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions
[**objects_documents_batch_delete**](DEFAULT_API.md#objects_documents_batch_delete) | **Delete** /objects/documents/batch | Delete Multiple Documents
[**objects_documents_batch_lock_delete**](DEFAULT_API.md#objects_documents_batch_lock_delete) | **Delete** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout
[**objects_documents_batch_post**](DEFAULT_API.md#objects_documents_batch_post) | **Post** /objects/documents/batch | Create Multiple Documents
[**objects_documents_batch_put**](DEFAULT_API.md#objects_documents_batch_put) | **Put** /objects/documents/batch | Update Multiple Documents
[**objects_documents_doc_id_anchors_get**](DEFAULT_API.md#objects_documents_doc_id_anchors_get) | **Get** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs
[**objects_documents_doc_id_annotations_file_get**](DEFAULT_API.md#objects_documents_doc_id_annotations_file_get) | **Get** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF
[**objects_documents_doc_id_annotations_file_post**](DEFAULT_API.md#objects_documents_doc_id_annotations_file_post) | **Post** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF
[**objects_documents_doc_id_attachments_attachment_id_delete**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_delete) | **Delete** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment
[**objects_documents_doc_id_attachments_attachment_id_file_get**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_file_get) | **Get** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment
[**objects_documents_doc_id_attachments_attachment_id_get**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_get) | **Get** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata
[**objects_documents_doc_id_attachments_attachment_id_put**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_put) | **Put** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete) | **Delete** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get) | **Get** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get) | **Get** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post) | **Post** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_get**](DEFAULT_API.md#objects_documents_doc_id_attachments_attachment_id_versions_get) | **Get** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions
[**objects_documents_doc_id_attachments_file_get**](DEFAULT_API.md#objects_documents_doc_id_attachments_file_get) | **Get** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments
[**objects_documents_doc_id_attachments_get**](DEFAULT_API.md#objects_documents_doc_id_attachments_get) | **Get** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments
[**objects_documents_doc_id_attachments_post**](DEFAULT_API.md#objects_documents_doc_id_attachments_post) | **Post** /objects/documents/{doc_id}/attachments | Create Document Attachment
[**objects_documents_doc_id_audittrail_get**](DEFAULT_API.md#objects_documents_doc_id_audittrail_get) | **Get** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document
[**objects_documents_doc_id_delete**](DEFAULT_API.md#objects_documents_doc_id_delete) | **Delete** /objects/documents/{doc_id} | Delete Single Document
[**objects_documents_doc_id_events_get**](DEFAULT_API.md#objects_documents_doc_id_events_get) | **Get** /objects/documents/{doc_id}/events | Retrieve Document Events
[**objects_documents_doc_id_file_get**](DEFAULT_API.md#objects_documents_doc_id_file_get) | **Get** /objects/documents/{doc_id}/file | Download Document File
[**objects_documents_doc_id_get**](DEFAULT_API.md#objects_documents_doc_id_get) | **Get** /objects/documents/{doc_id} | Retrieve Document
[**objects_documents_doc_id_lock_delete**](DEFAULT_API.md#objects_documents_doc_id_lock_delete) | **Delete** /objects/documents/{doc_id}/lock | Delete Document Lock
[**objects_documents_doc_id_lock_get**](DEFAULT_API.md#objects_documents_doc_id_lock_get) | **Get** /objects/documents/{doc_id}/lock | Retrieve Document Lock
[**objects_documents_doc_id_lock_post**](DEFAULT_API.md#objects_documents_doc_id_lock_post) | **Post** /objects/documents/{doc_id}/lock | Create Document Lock
[**objects_documents_doc_id_major_version_minor_version_attachments_file_get**](DEFAULT_API.md#objects_documents_doc_id_major_version_minor_version_attachments_file_get) | **Get** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments
[**objects_documents_doc_id_post**](DEFAULT_API.md#objects_documents_doc_id_post) | **Post** /objects/documents/{doc_id} | Create Single Document Version
[**objects_documents_doc_id_put**](DEFAULT_API.md#objects_documents_doc_id_put) | **Put** /objects/documents/{doc_id} | Update Single Document
[**objects_documents_doc_id_renditions_get**](DEFAULT_API.md#objects_documents_doc_id_renditions_get) | **Get** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions
[**objects_documents_doc_id_renditions_rendition_type_delete**](DEFAULT_API.md#objects_documents_doc_id_renditions_rendition_type_delete) | **Delete** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition
[**objects_documents_doc_id_renditions_rendition_type_get**](DEFAULT_API.md#objects_documents_doc_id_renditions_rendition_type_get) | **Get** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File
[**objects_documents_doc_id_renditions_rendition_type_post**](DEFAULT_API.md#objects_documents_doc_id_renditions_rendition_type_post) | **Post** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition
[**objects_documents_doc_id_renditions_rendition_type_put**](DEFAULT_API.md#objects_documents_doc_id_renditions_rendition_type_put) | **Put** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition
[**objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete**](DEFAULT_API.md#objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete) | **Delete** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document
[**objects_documents_doc_id_version_major_version_minor_version_attachments_get**](DEFAULT_API.md#objects_documents_doc_id_version_major_version_minor_version_attachments_get) | **Get** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments
[**objects_documents_doc_id_versions_get**](DEFAULT_API.md#objects_documents_doc_id_versions_get) | **Get** /objects/documents/{doc_id}/versions | Retrieve Document Versions
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post) | **Post** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_annotations_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type
[**objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version
[**objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions
[**objects_documents_doc_id_versions_major_version_minor_version_delete**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_delete) | **Delete** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV
[**objects_documents_doc_id_versions_major_version_minor_version_events_post**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_events_post) | **Post** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event
[**objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations
[**objects_documents_doc_id_versions_major_version_minor_version_file_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_file_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File
[**objects_documents_doc_id_versions_major_version_minor_version_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_put**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_put) | **Put** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_post**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_post) | **Post** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete) | **Delete** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete) | **Delete** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post) | **Post** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put) | **Put** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get**](DEFAULT_API.md#objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get) | **Get** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File
[**objects_documents_get**](DEFAULT_API.md#objects_documents_get) | **Get** /objects/documents | Retrieve All Documents
[**objects_documents_id_roles_get**](DEFAULT_API.md#objects_documents_id_roles_get) | **Get** /objects/documents/{id}/roles | Retrieve All Document Roles
[**objects_documents_id_roles_post**](DEFAULT_API.md#objects_documents_id_roles_post) | **Post** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document
[**objects_documents_id_roles_role_name_get**](DEFAULT_API.md#objects_documents_id_roles_role_name_get) | **Get** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get**](DEFAULT_API.md#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get) | **Get** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get**](DEFAULT_API.md#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get) | **Get** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_vput**](DEFAULT_API.md#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_vput) | **Put** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action
[**objects_documents_lifecycle_actions_post**](DEFAULT_API.md#objects_documents_lifecycle_actions_post) | **Post** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents
[**objects_documents_lifecycle_actions_user_action_name_put**](DEFAULT_API.md#objects_documents_lifecycle_actions_user_action_name_put) | **Put** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions
[**objects_documents_post**](DEFAULT_API.md#objects_documents_post) | **Post** /objects/documents | Create Single Document
[**objects_documents_relationships_batch_delete**](DEFAULT_API.md#objects_documents_relationships_batch_delete) | **Delete** /objects/documents/relationships/batch | Delete Multiple Document Relationships
[**objects_documents_relationships_batch_post**](DEFAULT_API.md#objects_documents_relationships_batch_post) | **Post** /objects/documents/relationships/batch | Create Multiple Document Relationships
[**objects_documents_renditions_batch_delete**](DEFAULT_API.md#objects_documents_renditions_batch_delete) | **Delete** /objects/documents/renditions/batch | Delete Multiple Document Renditions
[**objects_documents_renditions_batch_post**](DEFAULT_API.md#objects_documents_renditions_batch_post) | **Post** /objects/documents/renditions/batch | Add Multiple Document Renditions
[**objects_documents_roles_batch_delete**](DEFAULT_API.md#objects_documents_roles_batch_delete) | **Delete** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders
[**objects_documents_roles_batch_post**](DEFAULT_API.md#objects_documents_roles_batch_post) | **Post** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
[**objects_documents_templates_get**](DEFAULT_API.md#objects_documents_templates_get) | **Get** /objects/documents/templates | Retrieve Document Template Collection
[**objects_documents_templates_post**](DEFAULT_API.md#objects_documents_templates_post) | **Post** /objects/documents/templates | Create Single Document Template
[**objects_documents_templates_put**](DEFAULT_API.md#objects_documents_templates_put) | **Put** /objects/documents/templates | Update Multiple Document Templates
[**objects_documents_templates_template_name_delete**](DEFAULT_API.md#objects_documents_templates_template_name_delete) | **Delete** /objects/documents/templates/{template_name} | Delete Basic Document Template
[**objects_documents_templates_template_name_file_get**](DEFAULT_API.md#objects_documents_templates_template_name_file_get) | **Get** /objects/documents/templates/{template_name}/file | Download Document Template File
[**objects_documents_templates_template_name_get**](DEFAULT_API.md#objects_documents_templates_template_name_get) | **Get** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes
[**objects_documents_templates_template_name_put**](DEFAULT_API.md#objects_documents_templates_template_name_put) | **Put** /objects/documents/templates/{template_name} | Update Single Document Template
[**objects_documents_tokens_post**](DEFAULT_API.md#objects_documents_tokens_post) | **Post** /objects/documents/tokens | Document Tokens
[**objects_documents_versions_batch_actions_fileextract_post**](DEFAULT_API.md#objects_documents_versions_batch_actions_fileextract_post) | **Post** /objects/documents/versions/batch/actions/fileextract | Export Document Versions
[**objects_documents_versions_batch_delete**](DEFAULT_API.md#objects_documents_versions_batch_delete) | **Delete** /objects/documents/versions/batch | Delete Multiple Document Versions
[**objects_documents_versions_batch_post**](DEFAULT_API.md#objects_documents_versions_batch_post) | **Post** /objects/documents/versions/batch | Create Multiple Document Versions
[**objects_domain_get**](DEFAULT_API.md#objects_domain_get) | **Get** /objects/domain | Retrieve Domain Information
[**objects_domains_get**](DEFAULT_API.md#objects_domains_get) | **Get** /objects/domains | Retrieve Domains
[**objects_edl_matched_documents_batch_actions_add_post**](DEFAULT_API.md#objects_edl_matched_documents_batch_actions_add_post) | **Post** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents
[**objects_edl_matched_documents_batch_actions_remove_post**](DEFAULT_API.md#objects_edl_matched_documents_batch_actions_remove_post) | **Post** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents
[**objects_groups_auto_get**](DEFAULT_API.md#objects_groups_auto_get) | **Get** /objects/groups/auto | Retrieve Auto Managed Groups
[**objects_groups_get**](DEFAULT_API.md#objects_groups_get) | **Get** /objects/groups | Retrieve All Groups
[**objects_groups_group_id_delete**](DEFAULT_API.md#objects_groups_group_id_delete) | **Delete** /objects/groups/{group_id} | Delete Group
[**objects_groups_group_id_get**](DEFAULT_API.md#objects_groups_group_id_get) | **Get** /objects/groups/{group_id} | Retrieve Group
[**objects_groups_group_id_put**](DEFAULT_API.md#objects_groups_group_id_put) | **Put** /objects/groups/{group_id} | Update Group
[**objects_groups_post**](DEFAULT_API.md#objects_groups_post) | **Post** /objects/groups | Create Group 
[**objects_licenses_get**](DEFAULT_API.md#objects_licenses_get) | **Get** /objects/licenses | Retrieve Application License Usage
[**objects_objectworkflows_actions_get**](DEFAULT_API.md#objects_objectworkflows_actions_get) | **Get** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows
[**objects_objectworkflows_actions_workflow_name_get**](DEFAULT_API.md#objects_objectworkflows_actions_workflow_name_get) | **Get** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details
[**objects_objectworkflows_actions_workflow_name_post**](DEFAULT_API.md#objects_objectworkflows_actions_workflow_name_post) | **Post** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow
[**objects_objectworkflows_get**](DEFAULT_API.md#objects_objectworkflows_get) | **Get** /objects/objectworkflows | Retrieve Workflows
[**objects_objectworkflows_tasks_get**](DEFAULT_API.md#objects_objectworkflows_tasks_get) | **Get** /objects/objectworkflows/tasks | Retrieve Workflow Tasks
[**objects_objectworkflows_tasks_task_id_actions_accept_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_accept_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_cancel_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_cancel_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_complete_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_complete_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_get**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_get) | **Get** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions
[**objects_objectworkflows_tasks_task_id_actions_mdwaccept_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_mdwaccept_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content
[**objects_objectworkflows_tasks_task_id_actions_mdwreassign_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_mdwreassign_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_reassign_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_reassign_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_task_action_get**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_task_action_get) | **Get** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details
[**objects_objectworkflows_tasks_task_id_actions_undoaccept_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_undoaccept_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance
[**objects_objectworkflows_tasks_task_id_actions_updateduedate_post**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_actions_updateduedate_post) | **Post** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date
[**objects_objectworkflows_tasks_task_id_get**](DEFAULT_API.md#objects_objectworkflows_tasks_task_id_get) | **Get** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details
[**objects_objectworkflows_workflow_id_actions_get**](DEFAULT_API.md#objects_objectworkflows_workflow_id_actions_get) | **Get** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions
[**objects_objectworkflows_workflow_id_actions_workflow_action_get**](DEFAULT_API.md#objects_objectworkflows_workflow_id_actions_workflow_action_get) | **Get** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details
[**objects_objectworkflows_workflow_id_actions_workflow_action_post**](DEFAULT_API.md#objects_objectworkflows_workflow_id_actions_workflow_action_post) | **Post** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action
[**objects_objectworkflows_workflow_id_get**](DEFAULT_API.md#objects_objectworkflows_workflow_id_get) | **Get** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details
[**objects_picklists_get**](DEFAULT_API.md#objects_picklists_get) | **Get** /objects/picklists | Retrieve All Picklists
[**objects_picklists_picklist_name_get**](DEFAULT_API.md#objects_picklists_picklist_name_get) | **Get** /objects/picklists/{picklist_name} | Retrieve Picklist Values
[**objects_picklists_picklist_name_picklist_value_name_delete**](DEFAULT_API.md#objects_picklists_picklist_name_picklist_value_name_delete) | **Delete** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value
[**objects_picklists_picklist_name_picklist_value_name_put**](DEFAULT_API.md#objects_picklists_picklist_name_picklist_value_name_put) | **Put** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value
[**objects_picklists_picklist_name_post**](DEFAULT_API.md#objects_picklists_picklist_name_post) | **Post** /objects/picklists/{picklist_name} | Create Picklist Values
[**objects_picklists_picklist_name_put**](DEFAULT_API.md#objects_picklists_picklist_name_put) | **Put** /objects/picklists/{picklist_name} | Update Picklist Value Label
[**objects_sandbox_actions_buildproduction_post**](DEFAULT_API.md#objects_sandbox_actions_buildproduction_post) | **Post** /objects/sandbox/actions/buildproduction | Build Production Vault
[**objects_sandbox_actions_promoteproduction_post**](DEFAULT_API.md#objects_sandbox_actions_promoteproduction_post) | **Post** /objects/sandbox/actions/promoteproduction | Promote to Production
[**objects_sandbox_actions_recheckusage_post**](DEFAULT_API.md#objects_sandbox_actions_recheckusage_post) | **Post** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit
[**objects_sandbox_batch_changesize_post**](DEFAULT_API.md#objects_sandbox_batch_changesize_post) | **Post** /objects/sandbox/batch/changesize | Change Sandbox Size
[**objects_sandbox_entitlements_set_post**](DEFAULT_API.md#objects_sandbox_entitlements_set_post) | **Post** /objects/sandbox/entitlements/set | Set Sandbox Entitlements
[**objects_sandbox_get**](DEFAULT_API.md#objects_sandbox_get) | **Get** /objects/sandbox | Retrieve Sandboxes
[**objects_sandbox_name_delete**](DEFAULT_API.md#objects_sandbox_name_delete) | **Delete** /objects/sandbox/{name} | Delete Sandbox
[**objects_sandbox_post**](DEFAULT_API.md#objects_sandbox_post) | **Post** /objects/sandbox | Create or Refresh Sandbox
[**objects_sandbox_snapshot_api_name_actions_update_post**](DEFAULT_API.md#objects_sandbox_snapshot_api_name_actions_update_post) | **Post** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot
[**objects_sandbox_snapshot_api_name_actions_upgrade_post**](DEFAULT_API.md#objects_sandbox_snapshot_api_name_actions_upgrade_post) | **Post** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot
[**objects_sandbox_snapshot_api_name_delete**](DEFAULT_API.md#objects_sandbox_snapshot_api_name_delete) | **Delete** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot
[**objects_sandbox_snapshot_get**](DEFAULT_API.md#objects_sandbox_snapshot_get) | **Get** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots
[**objects_sandbox_snapshot_post**](DEFAULT_API.md#objects_sandbox_snapshot_post) | **Post** /objects/sandbox/snapshot | Create Sandbox Snapshot
[**objects_sandbox_vault_id_actions_refresh_post**](DEFAULT_API.md#objects_sandbox_vault_id_actions_refresh_post) | **Post** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot
[**objects_sandbox_vault_id_get**](DEFAULT_API.md#objects_sandbox_vault_id_get) | **Get** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID
[**objects_securitypolicies_get**](DEFAULT_API.md#objects_securitypolicies_get) | **Get** /objects/securitypolicies | Retrieve All Security Policies
[**objects_securitypolicies_security_policy_name_get**](DEFAULT_API.md#objects_securitypolicies_security_policy_name_get) | **Get** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy
[**objects_users_get**](DEFAULT_API.md#objects_users_get) | **Get** /objects/users/ | Retrieve All Users
[**objects_users_id_get**](DEFAULT_API.md#objects_users_id_get) | **Get** /objects/users/{id} | Retrieve User
[**objects_users_id_permissions_get**](DEFAULT_API.md#objects_users_id_permissions_get) | **Get** /objects/users/{id}/permissions | Retrieve User Permissions
[**objects_users_id_put**](DEFAULT_API.md#objects_users_id_put) | **Put** /objects/users/{id} | Update Single User
[**objects_users_me_get**](DEFAULT_API.md#objects_users_me_get) | **Get** /objects/users/me | Validate Session User
[**objects_users_me_password_post**](DEFAULT_API.md#objects_users_me_password_post) | **Post** /objects/users/me/password | Change My Password
[**objects_users_me_permissions_get**](DEFAULT_API.md#objects_users_me_permissions_get) | **Get** /objects/users/me/permissions | Retrieve My User Permissions
[**objects_users_me_put**](DEFAULT_API.md#objects_users_me_put) | **Put** /objects/users/me | Update My User
[**objects_users_post**](DEFAULT_API.md#objects_users_post) | **Post** /objects/users | Create Single User
[**objects_users_put**](DEFAULT_API.md#objects_users_put) | **Put** /objects/users | Update Multiple Users
[**objects_users_user_id_delete**](DEFAULT_API.md#objects_users_user_id_delete) | **Delete** /objects/users/{user_id} | Disable User
[**objects_users_user_id_vault_membership_vault_id_put**](DEFAULT_API.md#objects_users_user_id_vault_membership_vault_id_put) | **Put** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership
[**objects_vault_actions_compare_post**](DEFAULT_API.md#objects_vault_actions_compare_post) | **Post** /objects/vault/actions/compare | Vault Compare
[**objects_vault_actions_configreport_post**](DEFAULT_API.md#objects_vault_actions_configreport_post) | **Post** /objects/vault/actions/configreport | Vault Configuration Report
[**query_components_post**](DEFAULT_API.md#query_components_post) | **Post** /query/components | Component Definition Query
[**query_next_page_post**](DEFAULT_API.md#query_next_page_post) | **Post** /query/{next_page} | Next Page URL
[**query_post**](DEFAULT_API.md#query_post) | **Post** /query | Submitting a Query
[**query_previous_page_post**](DEFAULT_API.md#query_previous_page_post) | **Post** /query/{previous_page} | Previous Page URL
[**scim_v2_me_get**](DEFAULT_API.md#scim_v2_me_get) | **Get** /scim/v2/Me | Retrieve Current User with SCIM
[**scim_v2_me_put**](DEFAULT_API.md#scim_v2_me_put) | **Put** /scim/v2/Me | Update Current User with SCIM
[**scim_v2_resource_types_get**](DEFAULT_API.md#scim_v2_resource_types_get) | **Get** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types
[**scim_v2_resource_types_type_get**](DEFAULT_API.md#scim_v2_resource_types_type_get) | **Get** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type
[**scim_v2_schemas_get**](DEFAULT_API.md#scim_v2_schemas_get) | **Get** /scim/v2/Schemas | Retrieve All SCIM Schema Information
[**scim_v2_schemas_id_get**](DEFAULT_API.md#scim_v2_schemas_id_get) | **Get** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information
[**scim_v2_service_provider_config_get**](DEFAULT_API.md#scim_v2_service_provider_config_get) | **Get** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider
[**scim_v2_type_get**](DEFAULT_API.md#scim_v2_type_get) | **Get** /scim/v2/{type} | Retrieve SCIM Resources
[**scim_v2_type_id_get**](DEFAULT_API.md#scim_v2_type_id_get) | **Get** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource
[**scim_v2_users_get**](DEFAULT_API.md#scim_v2_users_get) | **Get** /scim/v2/Users | Retrieve All Users with SCIM
[**scim_v2_users_id_get**](DEFAULT_API.md#scim_v2_users_id_get) | **Get** /scim/v2/Users/{id} | Retrieve Single User with SCIM
[**scim_v2_users_id_put**](DEFAULT_API.md#scim_v2_users_id_put) | **Put** /scim/v2/Users/{id} | Update User with SCIM
[**scim_v2_users_post**](DEFAULT_API.md#scim_v2_users_post) | **Post** /scim/v2/Users | Create User with SCIM
[**services_certificate_cert_id_get**](DEFAULT_API.md#services_certificate_cert_id_get) | **Get** /services/certificate/{cert_id} | Retrieve Signing Certificate
[**services_configuration_mode_actions_disable_post**](DEFAULT_API.md#services_configuration_mode_actions_disable_post) | **Post** /services/configuration_mode/actions/disable | Disable Configuration Mode
[**services_configuration_mode_actions_enable_post**](DEFAULT_API.md#services_configuration_mode_actions_enable_post) | **Post** /services/configuration_mode/actions/enable | Enable Configuration Mode
[**services_directdata_files_get**](DEFAULT_API.md#services_directdata_files_get) | **Get** /services/directdata/files | Retrieve Available Direct Data Files
[**services_directdata_files_name_get**](DEFAULT_API.md#services_directdata_files_name_get) | **Get** /services/directdata/files/{name} | Download Direct Data File
[**services_file_staging_items_content_item_get**](DEFAULT_API.md#services_file_staging_items_content_item_get) | **Get** /services/file_staging/items/content/{item} | Download Item Content
[**services_file_staging_items_item_delete**](DEFAULT_API.md#services_file_staging_items_item_delete) | **Delete** /services/file_staging/items/{item} | Delete File or Folder
[**services_file_staging_items_item_get**](DEFAULT_API.md#services_file_staging_items_item_get) | **Get** /services/file_staging/items/{item} | List Items at a Path
[**services_file_staging_items_item_put**](DEFAULT_API.md#services_file_staging_items_item_put) | **Put** /services/file_staging/items/{item} | Update Folder or File
[**services_file_staging_items_post**](DEFAULT_API.md#services_file_staging_items_post) | **Post** /services/file_staging/items | Create Folder or File
[**services_file_staging_upload_get**](DEFAULT_API.md#services_file_staging_upload_get) | **Get** /services/file_staging/upload/ | List Upload Sessions
[**services_file_staging_upload_post**](DEFAULT_API.md#services_file_staging_upload_post) | **Post** /services/file_staging/upload | Create Resumable Upload Session
[**services_file_staging_upload_upload_session_id_delete**](DEFAULT_API.md#services_file_staging_upload_upload_session_id_delete) | **Delete** /services/file_staging/upload/{upload_session_id} | Abort Upload Session
[**services_file_staging_upload_upload_session_id_get**](DEFAULT_API.md#services_file_staging_upload_upload_session_id_get) | **Get** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details
[**services_file_staging_upload_upload_session_id_parts_get**](DEFAULT_API.md#services_file_staging_upload_upload_session_id_parts_get) | **Get** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session
[**services_file_staging_upload_upload_session_id_post**](DEFAULT_API.md#services_file_staging_upload_upload_session_id_post) | **Post** /services/file_staging/upload/{upload_session_id} | Commit Upload Session
[**services_file_staging_upload_upload_session_id_put**](DEFAULT_API.md#services_file_staging_upload_upload_session_id_put) | **Put** /services/file_staging/upload/{upload_session_id} | Upload to a Session
[**services_jobs_histories_get**](DEFAULT_API.md#services_jobs_histories_get) | **Get** /services/jobs/histories | Retrieve Job Histories
[**services_jobs_job_id_errors_get**](DEFAULT_API.md#services_jobs_job_id_errors_get) | **Get** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors
[**services_jobs_job_id_get**](DEFAULT_API.md#services_jobs_job_id_get) | **Get** /services/jobs/{job_id} | Retrieve Job Status
[**services_jobs_job_id_summary_get**](DEFAULT_API.md#services_jobs_job_id_summary_get) | **Get** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary
[**services_jobs_job_id_tasks_get**](DEFAULT_API.md#services_jobs_job_id_tasks_get) | **Get** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks
[**services_jobs_monitors_get**](DEFAULT_API.md#services_jobs_monitors_get) | **Get** /services/jobs/monitors | Retrieve Job Monitors
[**services_jobs_start_now_job_id_post**](DEFAULT_API.md#services_jobs_start_now_job_id_post) | **Post** /services/jobs/start_now/{job_id} | Start Job
[**services_loader_extract_post**](DEFAULT_API.md#services_loader_extract_post) | **Post** /services/loader/extract | Extract Data Files
[**services_loader_job_id_tasks_task_id_failurelog_get**](DEFAULT_API.md#services_loader_job_id_tasks_task_id_failurelog_get) | **Get** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results
[**services_loader_job_id_tasks_task_id_results_get**](DEFAULT_API.md#services_loader_job_id_tasks_task_id_results_get) | **Get** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results
[**services_loader_job_id_tasks_task_id_results_renditions_get**](DEFAULT_API.md#services_loader_job_id_tasks_task_id_results_renditions_get) | **Get** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results
[**services_loader_job_id_tasks_task_id_successlog_get**](DEFAULT_API.md#services_loader_job_id_tasks_task_id_successlog_get) | **Get** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results
[**services_loader_load_post**](DEFAULT_API.md#services_loader_load_post) | **Post** /services/loader/load | Load Data Objects
[**services_package_actions_validate_post**](DEFAULT_API.md#services_package_actions_validate_post) | **Post** /services/package/actions/validate | Validate Package
[**services_package_post**](DEFAULT_API.md#services_package_post) | **Post** /services/package | Export Package
[**services_package_put**](DEFAULT_API.md#services_package_put) | **Put** /services/package | Import Package
[**services_queues_get**](DEFAULT_API.md#services_queues_get) | **Get** /services/queues | Retrieve All Queues
[**services_queues_queue_name_actions_disable_delivery_put**](DEFAULT_API.md#services_queues_queue_name_actions_disable_delivery_put) | **Put** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery
[**services_queues_queue_name_actions_enable_delivery_put**](DEFAULT_API.md#services_queues_queue_name_actions_enable_delivery_put) | **Put** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery
[**services_queues_queue_name_actions_reset_put**](DEFAULT_API.md#services_queues_queue_name_actions_reset_put) | **Put** /services/queues/{queue_name}/actions/reset | Reset Queue
[**services_queues_queue_name_get**](DEFAULT_API.md#services_queues_queue_name_get) | **Get** /services/queues/{queue_name} | Retrieve Queue Status
[**services_vobject_vault_package_vpackage_id_actions_validate_post**](DEFAULT_API.md#services_vobject_vault_package_vpackage_id_actions_validate_post) | **Post** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package
[**session_delete**](DEFAULT_API.md#session_delete) | **Delete** /session | End Session
[**uicode_distributions_distribution_name_code_get**](DEFAULT_API.md#uicode_distributions_distribution_name_code_get) | **Get** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution
[**uicode_distributions_distribution_name_delete**](DEFAULT_API.md#uicode_distributions_distribution_name_delete) | **Delete** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution
[**uicode_distributions_distribution_name_get**](DEFAULT_API.md#uicode_distributions_distribution_name_get) | **Get** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata
[**uicode_distributions_get**](DEFAULT_API.md#uicode_distributions_get) | **Get** /uicode/distributions | Retrieve All Client Code Distribution Metadata
[**uicode_distributions_post**](DEFAULT_API.md#uicode_distributions_post) | **Post** /uicode/distributions | Add or Replace Single Client Code Distribution
[**vobject_vault_package_vpackage_id_actions_deploy_post**](DEFAULT_API.md#vobject_vault_package_vpackage_id_actions_deploy_post) | **Post** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package
[**vobject_vault_package_vpackage_id_actions_deploy_results_get**](DEFAULT_API.md#vobject_vault_package_vpackage_id_actions_deploy_results_get) | **Get** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results
[**vobjects_cascadedelete_results_object_name_job_status_job_id_get**](DEFAULT_API.md#vobjects_cascadedelete_results_object_name_job_status_job_id_get) | **Get** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job
[**vobjects_deepcopy_results_object_name_job_status_job_id_get**](DEFAULT_API.md#vobjects_deepcopy_results_object_name_job_status_job_id_get) | **Get** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job
[**vobjects_edl_item_vactions_createplaceholder_post**](DEFAULT_API.md#vobjects_edl_item_vactions_createplaceholder_post) | **Post** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item
[**vobjects_merges_job_id_log_get**](DEFAULT_API.md#vobjects_merges_job_id_log_get) | **Get** /vobjects/merges/{job_id}/log | Download Merge Records Job Log
[**vobjects_merges_job_id_results_get**](DEFAULT_API.md#vobjects_merges_job_id_results_get) | **Get** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results
[**vobjects_merges_job_id_status_get**](DEFAULT_API.md#vobjects_merges_job_id_status_get) | **Get** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status
[**vobjects_object_name_actions_action_name_post**](DEFAULT_API.md#vobjects_object_name_actions_action_name_post) | **Post** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records
[**vobjects_object_name_actions_changetype_post**](DEFAULT_API.md#vobjects_object_name_actions_changetype_post) | **Post** /vobjects/{object_name}/actions/changetype | Change Object Type
[**vobjects_object_name_actions_merge_post**](DEFAULT_API.md#vobjects_object_name_actions_merge_post) | **Post** /vobjects/{object_name}/actions/merge | Initiate Record Merge
[**vobjects_object_name_actions_recalculaterollups_get**](DEFAULT_API.md#vobjects_object_name_actions_recalculaterollups_get) | **Get** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status
[**vobjects_object_name_actions_recalculaterollups_post**](DEFAULT_API.md#vobjects_object_name_actions_recalculaterollups_post) | **Post** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields
[**vobjects_object_name_actions_updatecorporatecurrency_put**](DEFAULT_API.md#vobjects_object_name_actions_updatecorporatecurrency_put) | **Put** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields
[**vobjects_object_name_attachments_batch_delete**](DEFAULT_API.md#vobjects_object_name_attachments_batch_delete) | **Delete** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments
[**vobjects_object_name_attachments_batch_post**](DEFAULT_API.md#vobjects_object_name_attachments_batch_post) | **Post** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments
[**vobjects_object_name_attachments_batch_put**](DEFAULT_API.md#vobjects_object_name_attachments_batch_put) | **Put** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions
[**vobjects_object_name_delete**](DEFAULT_API.md#vobjects_object_name_delete) | **Delete** /vobjects/{object_name} | Delete Object Records
[**vobjects_object_name_id_roles_role_name_get**](DEFAULT_API.md#vobjects_object_name_id_roles_role_name_get) | **Get** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles
[**vobjects_object_name_object_record_id_actions_action_name_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_actions_action_name_get) | **Get** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details
[**vobjects_object_name_object_record_id_actions_action_name_post**](DEFAULT_API.md#vobjects_object_name_object_record_id_actions_action_name_post) | **Post** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record
[**vobjects_object_name_object_record_id_actions_cascadedelete_post**](DEFAULT_API.md#vobjects_object_name_object_record_id_actions_cascadedelete_post) | **Post** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record
[**vobjects_object_name_object_record_id_actions_deepcopy_post**](DEFAULT_API.md#vobjects_object_name_object_record_id_actions_deepcopy_post) | **Post** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record
[**vobjects_object_name_object_record_id_actions_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_actions_get) | **Get** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions
[**vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File
[**vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post) | **Post** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File
[**vobjects_object_name_object_record_id_attachment_fields_file_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachment_fields_file_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files
[**vobjects_object_name_object_record_id_attachments_attachment_id_delete**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_delete) | **Delete** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment
[**vobjects_object_name_object_record_id_attachments_attachment_id_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata
[**vobjects_object_name_object_record_id_attachments_attachment_id_put**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_put) | **Put** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete) | **Delete** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post) | **Post** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_attachment_id_versions_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions
[**vobjects_object_name_object_record_id_attachments_file_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_file_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files
[**vobjects_object_name_object_record_id_attachments_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_get) | **Get** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments
[**vobjects_object_name_object_record_id_attachments_post**](DEFAULT_API.md#vobjects_object_name_object_record_id_attachments_post) | **Post** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment
[**vobjects_object_name_object_record_id_audittrail_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_audittrail_get) | **Get** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record
[**vobjects_object_name_object_record_id_get**](DEFAULT_API.md#vobjects_object_name_object_record_id_get) | **Get** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record
[**vobjects_object_name_post**](DEFAULT_API.md#vobjects_object_name_post) | **Post** /vobjects/{object_name} | Create &amp; Upsert Object Records
[**vobjects_object_name_put**](DEFAULT_API.md#vobjects_object_name_put) | **Put** /vobjects/{object_name} | Update Object Records
[**vobjects_object_name_roles_delete**](DEFAULT_API.md#vobjects_object_name_roles_delete) | **Delete** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records
[**vobjects_object_name_roles_post**](DEFAULT_API.md#vobjects_object_name_roles_post) | **Post** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records
[**vobjects_outbound_package_vpackage_id_dependencies_get**](DEFAULT_API.md#vobjects_outbound_package_vpackage_id_dependencies_get) | **Get** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies


# **api_get**
> api_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve API Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_mdl_components_component_type_and_record_name_files_get**
> api_mdl_components_component_type_and_record_name_files_get (component_type_and_record_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Content File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component_type_and_record_name** | **STRING_32**| The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_mdl_components_component_type_and_record_name_get**
> api_mdl_components_component_type_and_record_name_get (component_type_and_record_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Component Record (MDL)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component_type_and_record_name** | **STRING_32**| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_mdl_execute_async_job_id_results_get**
> api_mdl_execute_async_job_id_results_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Asynchronous MDL Script Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_mdl_execute_async_post**
> api_mdl_execute_async_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Execute MDL Script Asynchronously


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_mdl_execute_post**
> api_mdl_execute_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Execute MDL Script


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_mdl_files_post**
> api_mdl_files_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Upload Content File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audittrail_audit_trail_type_get**
> audittrail_audit_trail_type_get (audit_trail_type: STRING_32 ; start_date:  detachable STRING_32 ; end_date:  detachable STRING_32 ; all_dates:  detachable STRING_32 ; format_result:  detachable STRING_32 ; limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; objects:  detachable STRING_32 ; events:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Audit Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit_trail_type** | **STRING_32**| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. | [default to null]
 **start_date** | **STRING_32**| Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] [default to null]
 **end_date** | **STRING_32**| Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional] [default to null]
 **all_dates** | **STRING_32**| Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [optional] [default to null]
 **format_result** | **STRING_32**| To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [optional] [default to null]
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **STRING_32**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] [default to null]
 **objects** | **STRING_32**| This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects. | [optional] [default to null]
 **events** | **STRING_32**| This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **auth_discovery_post**
> auth_discovery_post (accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Authentication Type Discovery


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **auth_oauth_session_oath_oidc_profile_id_post**
> auth_oauth_session_oath_oidc_profile_id_post (oath_oidc_profile_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


OAuth 2.0 / OpenID Connect


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oath_oidc_profile_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **auth_post**
> auth_post (content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


User Name and Password


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_class_name_delete**
> code_class_name_delete (class_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Source Code File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **class_name** | **STRING_32**| The fully qualified class name of your file. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_class_name_disable_put**
> code_class_name_disable_put (class_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Disable Vault Extension


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **class_name** | **STRING_32**| The fully qualified class name of your file. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_class_name_enable_put**
> code_class_name_enable_put (class_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Enable Vault Extension


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **class_name** | **STRING_32**| The fully qualified class name of your file. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_class_name_get**
> code_class_name_get (class_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Single Source Code File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **class_name** | **STRING_32**| The fully qualified class name of your file. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_profiler_get**
> code_profiler_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Profiling Sessions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_profiler_post**
> code_profiler_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Profiling Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_profiler_session_name_actions_end_post**
> code_profiler_session_name_actions_end_post (session_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


End Profiling Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_name** | **STRING_32**| The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_profiler_session_name_delete**
> code_profiler_session_name_delete (session_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Profiling Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_name** | **STRING_32**| The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_profiler_session_name_get**
> code_profiler_session_name_get (session_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Profiling Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_name** | **STRING_32**| The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_profiler_session_name_results_get**
> code_profiler_session_name_results_get (session_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Profiling Session Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **session_name** | **STRING_32**| The name of the session, for example,  baseline__c. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_put**
> code_put (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Add or Replace Single Source Code File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_or_template_actions_listnodes_post**
> composites_trees_edl_hierarchy_or_template_actions_listnodes_post (edl_hierarchy_or_template: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Specific Root Nodes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edl_hierarchy_or_template** | **STRING_32**| Choose to retrieve either edl_hierarchy__v or edl_template__v | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_or_template_get**
> composites_trees_edl_hierarchy_or_template_get (edl_hierarchy_or_template: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Root Nodes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edl_hierarchy_or_template** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_vparent_node_id_children_get**
> composites_trees_edl_hierarchy_vparent_node_id_children_get (parent_node_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve a Node's Children


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent_node_id** | **STRING_32**| The ID of a parent node in the hierarchy. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **composites_trees_edl_hierarchy_vparent_node_id_children_put**
> composites_trees_edl_hierarchy_vparent_node_id_children_put (parent_node_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Node Order


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent_node_id** | **STRING_32**| The ID of a parent node in the hierarchy. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_component_type_and_record_name_get**
> configuration_component_type_and_record_name_get (component_type_and_record_name: STRING_32 ; loc:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Component Record (XML/JSON)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component_type_and_record_name** | **STRING_32**| The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. | [default to null]
 **loc** | **STRING_32**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_component_type_get**
> configuration_component_type_get (component_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Component Record Collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component_type** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_object_name_and_object_type_get**
> configuration_object_name_and_object_type_get (object_name_and_object_type: STRING_32 ; loc:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Details from a Specific Object


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name_and_object_type** | **STRING_32**| The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;. | [default to null]
 **loc** | **STRING_32**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_objecttype_get**
> configuration_objecttype_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Details from All Object Types


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_delete**
> configuration_role_assignment_rule_delete (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Lifecycle Role Assignment Override Rules


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_get**
> configuration_role_assignment_rule_get (lifecycle__v:  detachable STRING_32 ; role__v:  detachable STRING_32 ; product__v:  detachable STRING_32 ; country__v:  detachable STRING_32 ; study__v:  detachable STRING_32 ; study_country__v:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Lifecycle Role Assignment Rules (Default & Override)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycle__v** | **STRING_32**| Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c | [optional] [default to null]
 **role__v** | **STRING_32**| Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c | [optional] [default to null]
 **product__v** | **STRING_32**| Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap | [optional] [default to null]
 **country__v** | **STRING_32**| Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States | [optional] [default to null]
 **study__v** | **STRING_32**| In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study | [optional] [default to null]
 **study_country__v** | **STRING_32**| In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_post**
> configuration_role_assignment_rule_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Lifecycle Role Assignment Override Rules


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **configuration_role_assignment_rule_put**
> configuration_role_assignment_rule_put (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Lifecycle Role Assignment Rules (Default & Override)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delegation_login_post**
> delegation_login_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Delegated Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**| The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delegation_vaults_get**
> delegation_vaults_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Delegations


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keep_alive_post**
> keep_alive_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Session Keep Alive


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **limits_get**
> limits_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Limits on Objects


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_api_usage_get**
> logs_api_usage_get (date:  detachable STRING_32 ; log_format:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Daily API Usage


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **STRING_32**| The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [optional] [default to null]
 **log_format** | **STRING_32**| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_code_debug_get**
> logs_code_debug_get (user_id:  detachable STRING_32 ; include_inactive:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Debug Logs


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **STRING_32**| Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [optional] [default to null]
 **include_inactive** | **BOOLEAN**| Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_code_debug_id_actions_reset_delete**
> logs_code_debug_id_actions_reset_delete (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Debug Log


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The ID of the debug log to delete. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_code_debug_id_actions_reset_post**
> logs_code_debug_id_actions_reset_post (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Reset Debug Log


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The ID of the debug log to delete. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_code_debug_id_files_get**
> logs_code_debug_id_files_get (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Debug Log Files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The ID of the debug log to download. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_code_debug_id_get**
> logs_code_debug_id_get (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Single Debug Log


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The ID of the debug log to retrieve. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_code_debug_post**
> logs_code_debug_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Debug Log


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logs_code_runtime_get**
> logs_code_runtime_get (date:  detachable STRING_32 ; log_format:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download SDK Runtime Log


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **STRING_32**|  | [optional] [default to null]
 **log_format** | **STRING_32**| Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **messages_message_type_actions_import_post**
> messages_message_type_actions_import_post (message_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Import Bulk Translation File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_type** | **STRING_32**| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **messages_message_type_language_lang_actions_export_post**
> messages_message_type_language_lang_actions_export_post (message_type: STRING_32 ; lang: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Bulk Translation File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message_type** | **STRING_32**| The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. | [default to null]
 **lang** | **STRING_32**| A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_audittrail_audit_trail_type_get**
> metadata_audittrail_audit_trail_type_get (audit_trail_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Audit Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit_trail_type** | **STRING_32**| The name of the specified audit type (document_audit_trail, object_audit_trail, etc). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_audittrail_get**
> metadata_audittrail_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Audit Types


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_components_component_type_get**
> metadata_components_component_type_get (component_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Component Type Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component_type** | **STRING_32**| The component type name (Picklist, Docfield, Doctype, etc.). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_components_get**
> metadata_components_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Component Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_binders_templates_bindernodes_get**
> metadata_objects_binders_templates_bindernodes_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Template Node Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_binders_templates_get**
> metadata_objects_binders_templates_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Template Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_annotations_placemarks_types_placemark_type_get**
> metadata_objects_documents_annotations_placemarks_types_placemark_type_get (placemark_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Annotation Placemark Type Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placemark_type** | **STRING_32**| The name of the placemark type. For example, sticky__sys. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_annotations_references_types_reference_type_get**
> metadata_objects_documents_annotations_references_types_reference_type_get (reference_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Annotation Reference Type Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference_type** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_annotations_types_annotation_type_get**
> metadata_objects_documents_annotations_types_annotation_type_get (annotation_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Annotation Type Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotation_type** | **STRING_32**| The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_events_event_type_types_event_subtype_get**
> metadata_objects_documents_events_event_type_types_event_subtype_get (event_type: STRING_32 ; event_subtype: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Event SubType Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_type** | **STRING_32**| The event type. For example, distribution__v. | [default to null]
 **event_subtype** | **STRING_32**| The event subtype. For example, approved_email__v. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_events_get**
> metadata_objects_documents_events_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Event Types and Subtypes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_lock_get**
> metadata_objects_documents_lock_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Lock Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_properties_find_common_post**
> metadata_objects_documents_properties_find_common_post (content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Common Document Fields


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_properties_get**
> metadata_objects_documents_properties_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Document Fields


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_templates_get**
> metadata_objects_documents_templates_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Template Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_get**
> metadata_objects_documents_types_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Document Types


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_get**
> metadata_objects_documents_types_type_get (type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Type


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| The document type. See Retrieve Document Types. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_relationships_get**
> metadata_objects_documents_types_type_relationships_get (type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Type Relationships


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| The document type. See Retrieve Document Types. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get**
> metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get (type: STRING_32 ; subtype: STRING_32 ; classification: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Classification


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| The document type. See Retrieve Document Types. | [default to null]
 **subtype** | **STRING_32**| The document subtype. See Retrieve Document Types. | [default to null]
 **classification** | **STRING_32**| The document classification. See Retrieve Document Types. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_documents_types_type_subtypes_subtype_get**
> metadata_objects_documents_types_type_subtypes_subtype_get (type: STRING_32 ; subtype: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Subtype


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| The document type. See Retrieve Document Types. | [default to null]
 **subtype** | **STRING_32**| The document subtype. See Retrieve Document Types. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_groups_get**
> metadata_objects_groups_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Group Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_securitypolicies_get**
> metadata_objects_securitypolicies_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Security Policy Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_objects_users_get**
> metadata_objects_users_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve User Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_query_archived_documents_relationships_document_signature_sysr_get**
> metadata_query_archived_documents_relationships_document_signature_sysr_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Archived Document Signature Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_query_documents_relationships_document_signature_sysr_get**
> metadata_query_documents_relationships_document_signature_sysr_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Signature Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_vobjects_get**
> metadata_vobjects_get (loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **BOOLEAN**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_actions_canceldeployment_post**
> metadata_vobjects_object_name_actions_canceldeployment_post (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Cancel Raw Object Deployment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_fields_object_field_name_get**
> metadata_vobjects_object_name_fields_object_field_name_get (object_name: STRING_32 ; object_field_name: STRING_32 ; loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Field Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_field_name** | **STRING_32**| The object field name value (id, name__v, external_id__v, etc.). | [default to null]
 **loc** | **BOOLEAN**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_get**
> metadata_vobjects_object_name_get (object_name: STRING_32 ; loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **loc** | **BOOLEAN**| To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_page_layouts_get**
> metadata_vobjects_object_name_page_layouts_get (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Page Layouts


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata_vobjects_object_name_page_layouts_layout_name_get**
> metadata_vobjects_object_name_page_layouts_layout_name_get (object_name: STRING_32 ; layout_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Page Layout Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The name of the object from which to retrieve page layout metadata. | [default to null]
 **layout_name** | **STRING_32**| The name of the page layout from which to retrieve metadata. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **notifications_histories_get**
> notifications_histories_get (start_date:  detachable STRING_32 ; end_date:  detachable STRING_32 ; all_dates:  detachable BOOLEAN ; format_result:  detachable STRING_32 ; limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Email Notification Histories


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **STRING_32**| Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. | [optional] [default to null]
 **end_date** | **STRING_32**| Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. | [optional] [default to null]
 **all_dates** | **BOOLEAN**| Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [optional] [default to null]
 **format_result** | **STRING_32**| To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [optional] [default to null]
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **STRING_32**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_workflow_actions_action_get**
> object_workflow_actions_action_get (action: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Bulk Workflow Action Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_workflow_actions_action_post**
> object_workflow_actions_action_post (action: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Workflow Actions on Multiple Workflows


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_workflow_actions_canceltasks_post**
> object_workflow_actions_canceltasks_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Cancel Workflow Tasks


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_workflow_actions_cancelworkflows_post**
> object_workflow_actions_cancelworkflows_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Cancel Workflows


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_workflow_actions_get**
> object_workflow_actions_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Bulk Workflow Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_workflow_actions_reassigntasks_post**
> object_workflow_actions_reassigntasks_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Reassign Workflow Tasks


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **object_workflow_actions_replaceworkflowowner_post**
> object_workflow_actions_replaceworkflowowner_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Replace Workflow Owner


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_actions_export_job_id_results_get**
> objects_binders_actions_export_job_id_results_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Export Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested export job. This is returned with the export binder requests above. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_actions_export_post**
> objects_binders_binder_id_actions_export_post (binder_id: STRING_32 ; source:  detachable BOOLEAN ; renditiontype:  detachable STRING_32 ; docversion:  detachable STRING_32 ; attachments:  detachable STRING_32 ; var_export:  detachable STRING_32 ; docfield:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Binder (Latest Version)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **source** | **BOOLEAN**| to include source content or not | [optional] [default to null]
 **renditiontype** | **STRING_32**| to include viewable renditions | [optional] [default to null]
 **docversion** | **STRING_32**| to include all major versions | [optional] [default to null]
 **attachments** | **STRING_32**| to include all versions of attachments | [optional] [default to null]
 **var_export** | **STRING_32**| configurable filename metadata | [optional] [default to null]
 **docfield** | **BOOLEAN**| to exclude document metadata csv | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_actions_post**
> objects_binders_binder_id_actions_post (binder_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Refresh Binder Auto-Filing


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_binding_rule_put**
> objects_binders_binder_id_binding_rule_put (binder_id: STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Binding Rule


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_delete**
> objects_binders_binder_id_delete (binder_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_node_id_binding_rule_put**
> objects_binders_binder_id_documents_node_id_binding_rule_put (binder_id: STRING_32 ; node_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Binder Document Binding Rule


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **node_id** | **STRING_32**| The binder node id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_post**
> objects_binders_binder_id_documents_post (binder_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Add Document to Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_section_id_delete**
> objects_binders_binder_id_documents_section_id_delete (binder_id: STRING_32 ; section_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Remove Document from Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **section_id** | **STRING_32**| The binder node id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_documents_section_id_put**
> objects_binders_binder_id_documents_section_id_put (binder_id: STRING_32 ; section_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Move Document in Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **section_id** | **STRING_32**| The binder node id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_get**
> objects_binders_binder_id_get (binder_id: STRING_32 ; depth:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **depth** | **STRING_32**| To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_post**
> objects_binders_binder_id_post (binder_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Binder Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_put**
> objects_binders_binder_id_put (binder_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete**
> objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete (binder_id: STRING_32 ; role_name_and_user_or_group: STRING_32 ; id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Remove Users & Groups from Roles on a Single Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The id value of the binder from which to remove roles. | [default to null]
 **role_name_and_user_or_group** | **STRING_32**| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | [default to null]
 **id** | **STRING_32**| The id value of the user or group to remove from the role. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_node_id_binding_rule_put**
> objects_binders_binder_id_sections_node_id_binding_rule_put (binder_id: STRING_32 ; node_id: STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Binder Section Binding Rule


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **node_id** | **STRING_32**| The binder node id field value. | [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_node_id_put**
> objects_binders_binder_id_sections_node_id_put (binder_id: STRING_32 ; node_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Binder Section


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **node_id** | **STRING_32**| The binder node id of the section. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_post**
> objects_binders_binder_id_sections_post (binder_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Binder Section


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_section_id_delete**
> objects_binders_binder_id_sections_section_id_delete (binder_id: STRING_32 ; section_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Binder Section


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **section_id** | **STRING_32**| The binder node id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_sections_section_id_get**
> objects_binders_binder_id_sections_section_id_get (binder_id: STRING_32 ; section_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Sections


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **section_id** | **STRING_32**| The binder node id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_get**
> objects_binders_binder_id_versions_get (binder_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Binder Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_actions_export_post**
> objects_binders_binder_id_versions_major_version_minor_version_actions_export_post (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; source:  detachable BOOLEAN ; renditiontype:  detachable STRING_32 ; docversion:  detachable STRING_32 ; attachments:  detachable STRING_32 ; var_export:  detachable STRING_32 ; docfield:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Binder (Specific Version)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **source** | **BOOLEAN**| to include source content or not | [optional] [default to null]
 **renditiontype** | **STRING_32**| to include viewable renditions | [optional] [default to null]
 **docversion** | **STRING_32**| to include all major versions | [optional] [default to null]
 **attachments** | **STRING_32**| to include all versions of attachments | [optional] [default to null]
 **var_export** | **STRING_32**| configurable filename metadata | [optional] [default to null]
 **docfield** | **BOOLEAN**| to exclude document metadata csv | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_delete**
> objects_binders_binder_id_versions_major_version_minor_version_delete (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Binder Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_get**
> objects_binders_binder_id_versions_major_version_minor_version_get (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_put**
> objects_binders_binder_id_versions_major_version_minor_version_put (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Binder Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_post**
> objects_binders_binder_id_versions_major_version_minor_version_relationships_post (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Binder Relationship


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete**
> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; relationship_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Binder Relationship


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **relationship_id** | **STRING_32**| The binder relationship id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get**
> objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; relationship_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Relationship


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **relationship_id** | **STRING_32**| The binder relationship id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get**
> objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get (binder_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; section_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Version Section


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binder_id** | **STRING_32**| The binder id field value. | [default to null]
 **major_version** | **STRING_32**| The binder major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The binder minor_version_number__v field value. | [default to null]
 **section_id** | **STRING_32**| Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_id_roles_get**
> objects_binders_id_roles_get (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Binder Roles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_id_roles_post**
> objects_binders_id_roles_post (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Assign Users & Groups to Roles on a Single Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_id_roles_role_name_get**
> objects_binders_id_roles_role_name_get (id: STRING_32 ; role_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Role


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The binder &#x60;id&#x60;. | [default to null]
 **role_name** | **STRING_32**| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get**
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get (id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder User Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The binder id field value from which to retrieve available user actions. | [default to null]
 **major_version** | **STRING_32**| The major version number of the binder. | [default to null]
 **minor_version** | **STRING_32**| The minor version number of the binder. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get**
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get (id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; name__v: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Entry Criteria


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The binder id field value from which to retrieve available user actions. | [default to null]
 **major_version** | **STRING_32**| The major version number of the binder. | [default to null]
 **minor_version** | **STRING_32**| The minor version number of the binder. | [default to null]
 **name__v** | **STRING_32**| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_vput**
> objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_vput (id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; name__v: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Binder User Action


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The binder id field value from which to retrieve available user actions. | [default to null]
 **major_version** | **STRING_32**| The major version number of the binder. | [default to null]
 **minor_version** | **STRING_32**| The minor version number of the binder. | [default to null]
 **name__v** | **STRING_32**| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_lifecycle_actions_post**
> objects_binders_lifecycle_actions_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve User Actions on Multiple Binders


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_lifecycle_actions_user_action_name_put**
> objects_binders_lifecycle_actions_user_action_name_put (user_action_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Bulk Binder User Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_action_name** | **STRING_32**| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_post**
> objects_binders_post (async:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Binder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async** | **BOOLEAN**| When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_get**
> objects_binders_templates_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Template Collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_post**
> objects_binders_templates_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Binder Template


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_put**
> objects_binders_templates_put (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Binder Template


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_bindernodes_get**
> objects_binders_templates_template_name_bindernodes_get (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Template Node Attributes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The binder template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_bindernodes_post**
> objects_binders_templates_template_name_bindernodes_post (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Binder Template Node


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The binder template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_bindernodes_put**
> objects_binders_templates_template_name_bindernodes_put (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Replace Binder Template Nodes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The binder template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_delete**
> objects_binders_templates_template_name_delete (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Binder Template


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The binder template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_binders_templates_template_name_get**
> objects_binders_templates_template_name_get (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Binder Template Attributes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The binder template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_deletions_documents_get**
> objects_deletions_documents_get (start_date:  detachable STRING_32 ; end_date:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Deleted Document IDs


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **STRING_32**| Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional] [default to null]
 **end_date** | **STRING_32**| Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_deletions_vobjects_object_name_get**
> objects_deletions_vobjects_object_name_get (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Deleted Object Record ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_actions_get**
> objects_documents_actions_get (loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Document Workflows


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loc** | **BOOLEAN**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get**
> objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get (lifecycle_and_state_and_action: STRING_32 ; job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Controlled Copy Job Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycle_and_state_and_action** | **STRING_32**| The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link. | [default to null]
 **job_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_actions_workflow_name_get**
> objects_documents_actions_workflow_name_get (workflow_name: STRING_32 ; loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Workflow Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_name** | **STRING_32**| The document workflow name value. | [default to null]
 **loc** | **BOOLEAN**| When localized (translated) strings are available, retrieve them by setting loc to true. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_actions_workflow_name_post**
> objects_documents_actions_workflow_name_post (workflow_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Document Workflow


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_name** | **STRING_32**| The document workflow name value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_annotations_batch_delete**
> objects_documents_annotations_batch_delete (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Annotations


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_annotations_batch_post**
> objects_documents_annotations_batch_post (authorization: STRING_32 ; content__type: STRING_32 ; accept: STRING_32 ; x__vault_ap_i__client_id: STRING_32 )


Create Multiple Annotations


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [default to null]
 **content__type** | **STRING_32**|  | [default to null]
 **accept** | **STRING_32**|  | [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_annotations_batch_put**
> objects_documents_annotations_batch_put (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Annotations


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_annotations_replies_batch_post**
> objects_documents_annotations_replies_batch_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Add Annotation Replies


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_attachments_batch_delete**
> objects_documents_attachments_batch_delete (accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Multiple Document Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_attachments_batch_post**
> objects_documents_attachments_batch_post (accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Multiple Document Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_attachments_batch_put**
> objects_documents_attachments_batch_put (accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Multiple Document Attachment Descriptions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_fileextract_job_id_results_get**
> objects_documents_batch_actions_fileextract_job_id_results_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Export Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested export job. This is returned with the export document requests. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_fileextract_post**
> objects_documents_batch_actions_fileextract_post (source:  detachable BOOLEAN ; renditions:  detachable BOOLEAN ; allversions:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **BOOLEAN**| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] [default to null]
 **renditions** | **BOOLEAN**| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] [default to null]
 **allversions** | **BOOLEAN**| Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_reclassify_put**
> objects_documents_batch_actions_reclassify_put (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Reclassify Multiple Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_actions_rerender_post**
> objects_documents_batch_actions_rerender_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Multiple Document Renditions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_delete**
> objects_documents_batch_delete (id_param:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Multiple Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **STRING_32**| If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_lock_delete**
> objects_documents_batch_lock_delete (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Undo Collaborative Authoring Checkout


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_post**
> objects_documents_batch_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Multiple Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_batch_put**
> objects_documents_batch_put (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Multiple Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_anchors_get**
> objects_documents_doc_id_anchors_get (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Anchor IDs


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_annotations_file_get**
> objects_documents_doc_id_annotations_file_get (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Document Annotations to PDF


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_annotations_file_post**
> objects_documents_doc_id_annotations_file_post (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Import Document Annotations from PDF


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_delete**
> objects_documents_doc_id_attachments_attachment_id_delete (doc_id: STRING_32 ; attachment_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Document Attachment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_file_get**
> objects_documents_doc_id_attachments_attachment_id_file_get (doc_id: STRING_32 ; attachment_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Attachment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_get**
> objects_documents_doc_id_attachments_attachment_id_get (doc_id: STRING_32 ; attachment_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Attachment Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_put**
> objects_documents_doc_id_attachments_attachment_id_put (doc_id: STRING_32 ; attachment_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Document Attachment Description


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete (doc_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Document Attachment Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**| The attachment version__v field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get (doc_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Attachment Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**| The attachment version__v field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get (doc_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Attachment Version Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**| The attachment version__v field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post**
> objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post (doc_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; restore:  detachable BOOLEAN ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Restore Document Attachment Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**| The attachment version__v field value. | [default to null]
 **restore** | **BOOLEAN**| The parameter restore must be set to true.  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_attachment_id_versions_get**
> objects_documents_doc_id_attachments_attachment_id_versions_get (doc_id: STRING_32 ; attachment_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Attachment Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_file_get**
> objects_documents_doc_id_attachments_file_get (doc_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download All Document Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_get**
> objects_documents_doc_id_attachments_get (doc_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_attachments_post**
> objects_documents_doc_id_attachments_post (doc_id: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Document Attachment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_audittrail_get**
> objects_documents_doc_id_audittrail_get (doc_id: STRING_32 ; start_date:  detachable STRING_32 ; end_date:  detachable STRING_32 ; format_result:  detachable STRING_32 ; limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; events:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Complete Audit History for a Single Document


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document ID for which to retrieve audit history. | [default to null]
 **start_date** | **STRING_32**| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  | [optional] [default to null]
 **end_date** | **STRING_32**| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] [default to null]
 **format_result** | **STRING_32**| To request a CSV file of your audit history, use csv.  | [optional] [default to null]
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **STRING_32**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] [default to null]
 **events** | **STRING_32**| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_delete**
> objects_documents_doc_id_delete (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Document


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_events_get**
> objects_documents_doc_id_events_get (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Events


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_file_get**
> objects_documents_doc_id_file_get (doc_id: STRING_32 ; lock_document:  detachable BOOLEAN ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **lock_document** | **BOOLEAN**| Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_get**
> objects_documents_doc_id_get (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_lock_delete**
> objects_documents_doc_id_lock_delete (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Document Lock


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_lock_get**
> objects_documents_doc_id_lock_get (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Lock


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_lock_post**
> objects_documents_doc_id_lock_post (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Document Lock


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_major_version_minor_version_attachments_file_get**
> objects_documents_doc_id_major_version_minor_version_attachments_file_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download All Document Version Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_post**
> objects_documents_doc_id_post (doc_id: STRING_32 ; suppress_rendition:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Single Document Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **suppress_rendition** | **STRING_32**| Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_put**
> objects_documents_doc_id_put (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Single Document


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_get**
> objects_documents_doc_id_renditions_get (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Renditions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_delete**
> objects_documents_doc_id_renditions_rendition_type_delete (doc_id: STRING_32 ; rendition_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Document Rendition


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_get**
> objects_documents_doc_id_renditions_rendition_type_get (doc_id: STRING_32 ; rendition_type: STRING_32 ; steady_state:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Rendition File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **steady_state** | **STRING_32**| Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_post**
> objects_documents_doc_id_renditions_rendition_type_post (doc_id: STRING_32 ; rendition_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Add Single Document Rendition


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_renditions_rendition_type_put**
> objects_documents_doc_id_renditions_rendition_type_put (doc_id: STRING_32 ; rendition_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Replace Document Rendition


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete**
> objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete (doc_id: STRING_32 ; role_name_and_user_or_group: STRING_32 ; id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Remove Users & Groups from Roles on a Single Document


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The id value of the document from which to remove roles. | [default to null]
 **role_name_and_user_or_group** | **STRING_32**| The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. | [default to null]
 **id** | **STRING_32**| The id value of the user or group to remove from the role. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_version_major_version_minor_version_attachments_get**
> objects_documents_doc_id_version_major_version_minor_version_attachments_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Version Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_get**
> objects_documents_doc_id_versions_get (doc_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; annotation_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Read Annotations by ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **annotation_id** | **STRING_32**| The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; annotation_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Read Replies of Parent Annotation


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **annotation_id** | **STRING_32**| The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Document Version Annotations to PDF


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Import Document Version Annotations from PDF


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_get**
> objects_documents_doc_id_versions_major_version_minor_version_annotations_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; annotation_types:  detachable STRING_32 ; pagination_id:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Read Annotations by Document Version and Type


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [optional] [default to null]
 **offset** | **STRING_32**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201. | [optional] [default to null]
 **annotation_types** | **STRING_32**| The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;  | [optional] [default to null]
 **pagination_id** | **STRING_32**| A unique identifier used to load requests with paginated results. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get**
> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Version Attachment Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **attachment_id** | **STRING_32**| The id field value of the attachment. | [default to null]
 **attachment_version** | **STRING_32**| The version of the attachment. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get**
> objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Version Attachment Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **attachment_id** | **STRING_32**| The id of the document attachment to retrieve. | [default to null]
 **attachment_version** | **STRING_32**| Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_delete**
> objects_documents_doc_id_versions_major_version_minor_version_delete (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Document Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get**
> objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Version Notes as CSV


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_events_post**
> objects_documents_doc_id_versions_major_version_minor_version_events_post (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Document Event


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get**
> objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Video Annotations


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The video document id field value. | [default to null]
 **major_version** | **STRING_32**| The video document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The video document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**| This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;. | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_file_get**
> objects_documents_doc_id_versions_major_version_minor_version_file_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Version File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_get**
> objects_documents_doc_id_versions_major_version_minor_version_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_put**
> objects_documents_doc_id_versions_major_version_minor_version_put (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Document Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_get**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Relationships


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_post**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_post (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Single Document Relationship


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; relationship_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Document Relationship


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **relationship_id** | **STRING_32**| The relationship id field value. See Retrieve Document Relationships. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get**
> objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; relationship_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Relationship


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **relationship_id** | **STRING_32**| The relationship id field value. See Retrieve Document Relationships. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_get**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Version Renditions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; rendition_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Document Version Rendition


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; rendition_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Version Rendition File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; rendition_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Upload Document Version Rendition


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put**
> objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; rendition_type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Replace Document Version Rendition


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **rendition_type** | **STRING_32**| The document rendition type. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get**
> objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get (doc_id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Version Thumbnail File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doc_id** | **STRING_32**| The document id field value. | [default to null]
 **major_version** | **STRING_32**| The document major_version_number__v field value. | [default to null]
 **minor_version** | **STRING_32**| The document minor_version_number__v field value. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_get**
> objects_documents_get (named_filter:  detachable STRING_32 ; scope:  detachable STRING_32 ; versionscope:  detachable STRING_32 ; search:  detachable STRING_32 ; limit:  detachable STRING_32 ; sort:  detachable STRING_32 ; start:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **named_filter** | **STRING_32**| Retrieves only documents which you have created. | [optional] [default to null]
 **scope** | **STRING_32**| Searches only within the document content. | [optional] [default to null]
 **versionscope** | **STRING_32**| Retrieves all document versions, rather than only the latest version. | [optional] [default to null]
 **search** | **STRING_32**| Search for documents based on a {keyword} in searchable document fields. | [optional] [default to null]
 **limit** | **STRING_32**| See VQL documentation for more information. | [optional] [default to null]
 **sort** | **STRING_32**| See VQL documentation for more information. | [optional] [default to null]
 **start** | **STRING_32**| See VQL documentation for more information. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_id_roles_get**
> objects_documents_id_roles_get (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Document Roles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_id_roles_post**
> objects_documents_id_roles_post (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Assign Users & Groups to Roles on a Single Document


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_id_roles_role_name_get**
> objects_documents_id_roles_role_name_get (id: STRING_32 ; role_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Role


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The document &#x60;id&#x60;. | [default to null]
 **role_name** | **STRING_32**| The name of the role to retrieve. For example, &#x60;owner__v&#x60;. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get**
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get (id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document User Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The document id field value from which to retrieve available user actions. | [default to null]
 **major_version** | **STRING_32**| The major version number of the document. | [default to null]
 **minor_version** | **STRING_32**| The minor version number of the document. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get**
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get (id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; name__v: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Entry Criteria


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The document id field value from which to retrieve available user actions. | [default to null]
 **major_version** | **STRING_32**| The major version number of the document. | [default to null]
 **minor_version** | **STRING_32**| The minor version number of the document. | [default to null]
 **name__v** | **STRING_32**| The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_vput**
> objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_vput (id: STRING_32 ; major_version: STRING_32 ; minor_version: STRING_32 ; name__v: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Document User Action


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The document id field value from which to retrieve available user actions. | [default to null]
 **major_version** | **STRING_32**| The major version number of the document. | [default to null]
 **minor_version** | **STRING_32**| The minor version number of the document. | [default to null]
 **name__v** | **STRING_32**| The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_lifecycle_actions_post**
> objects_documents_lifecycle_actions_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve User Actions on Multiple Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_lifecycle_actions_user_action_name_put**
> objects_documents_lifecycle_actions_user_action_name_put (user_action_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Bulk Document User Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_action_name** | **STRING_32**| The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_post**
> objects_documents_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Single Document


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_relationships_batch_delete**
> objects_documents_relationships_batch_delete (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Multiple Document Relationships


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_relationships_batch_post**
> objects_documents_relationships_batch_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Multiple Document Relationships


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_renditions_batch_delete**
> objects_documents_renditions_batch_delete (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Multiple Document Renditions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_renditions_batch_post**
> objects_documents_renditions_batch_post (id_param:  detachable STRING_32 ; large_size_asset:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Add Multiple Document Renditions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **STRING_32**| If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **large_size_asset** | **STRING_32**| If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_roles_batch_delete**
> objects_documents_roles_batch_delete (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Remove Users and Groups from Roles on Multiple Documents & Binders


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_roles_batch_post**
> objects_documents_roles_batch_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Assign Users & Groups to Roles on Multiple Documents & Binders


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_templates_get**
> objects_documents_templates_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Template Collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_templates_post**
> objects_documents_templates_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Single Document Template


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_templates_put**
> objects_documents_templates_put (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Multiple Document Templates


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_delete**
> objects_documents_templates_template_name_delete (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Basic Document Template


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The document template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_file_get**
> objects_documents_templates_template_name_file_get (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Document Template File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The document template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_get**
> objects_documents_templates_template_name_get (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Document Template Attributes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The document template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_templates_template_name_put**
> objects_documents_templates_template_name_put (template_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Single Document Template


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **STRING_32**| The document template name__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_tokens_post**
> objects_documents_tokens_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Document Tokens


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_versions_batch_actions_fileextract_post**
> objects_documents_versions_batch_actions_fileextract_post (source:  detachable BOOLEAN ; renditions:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Document Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **BOOLEAN**| Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional] [default to null]
 **renditions** | **BOOLEAN**| Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_versions_batch_delete**
> objects_documents_versions_batch_delete (id_param:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Multiple Document Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **STRING_32**| If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_documents_versions_batch_post**
> objects_documents_versions_batch_post (id_param:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Multiple Document Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_param** | **STRING_32**| If you’re identifying documents in your input by their external ID | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **STRING_32**| Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_domain_get**
> objects_domain_get (include_application:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Domain Information


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_application** | **BOOLEAN**| To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_domains_get**
> objects_domains_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Domains


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_edl_matched_documents_batch_actions_add_post**
> objects_edl_matched_documents_batch_actions_add_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Add EDL Matched Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_edl_matched_documents_batch_actions_remove_post**
> objects_edl_matched_documents_batch_actions_remove_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Remove EDL Matched Documents


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_groups_auto_get**
> objects_groups_auto_get (limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Auto Managed Groups


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  | [optional] [default to null]
 **offset** | **STRING_32**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_groups_get**
> objects_groups_get (include_implied:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Groups


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_implied** | **STRING_32**| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_groups_group_id_delete**
> objects_groups_group_id_delete (group_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Group


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **STRING_32**| The group id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_groups_group_id_get**
> objects_groups_group_id_get (group_id: STRING_32 ; include_implied:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Group


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **STRING_32**| The group id field value. | [default to null]
 **include_implied** | **BOOLEAN**| When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_groups_group_id_put**
> objects_groups_group_id_put (group_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Group


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **STRING_32**| The group id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_groups_post**
> objects_groups_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Group 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_licenses_get**
> objects_licenses_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Application License Usage


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_actions_get**
> objects_objectworkflows_actions_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Multi-Record Workflows


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_actions_workflow_name_get**
> objects_objectworkflows_actions_workflow_name_get (workflow_name: STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Multi-Record Workflow Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_name** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_actions_workflow_name_post**
> objects_objectworkflows_actions_workflow_name_post (workflow_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Multi-Record Workflow


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_name** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_get**
> objects_objectworkflows_get (object__v:  detachable STRING_32 ; record_id__v:  detachable STRING_32 ; participant:  detachable STRING_32 ; status__v:  detachable STRING_32 ; offset:  detachable STRING_32 ; page_size:  detachable STRING_32 ; loc:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflows


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object__v** | **STRING_32**| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] [default to null]
 **record_id__v** | **STRING_32**| To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional] [default to null]
 **participant** | **STRING_32**| To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] [default to null]
 **status__v** | **STRING_32**| To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v | [optional] [default to null]
 **offset** | **STRING_32**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] [default to null]
 **page_size** | **STRING_32**| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] [default to null]
 **loc** | **STRING_32**| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_get**
> objects_objectworkflows_tasks_get (object__v:  detachable STRING_32 ; record_id__v:  detachable STRING_32 ; assignee__v:  detachable STRING_32 ; status__v:  detachable STRING_32 ; offset:  detachable STRING_32 ; page_size:  detachable STRING_32 ; loc:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflow Tasks


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object__v** | **STRING_32**| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] [default to null]
 **record_id__v** | **STRING_32**| To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional] [default to null]
 **assignee__v** | **STRING_32**| To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional] [default to null]
 **status__v** | **STRING_32**| To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.  | [optional] [default to null]
 **offset** | **STRING_32**| This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional] [default to null]
 **page_size** | **STRING_32**| This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional] [default to null]
 **loc** | **STRING_32**| When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_accept_post**
> objects_objectworkflows_tasks_task_id_actions_accept_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Accept Single Record Workflow Task


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_cancel_post**
> objects_objectworkflows_tasks_task_id_actions_cancel_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Cancel Workflow Task


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_complete_post**
> objects_objectworkflows_tasks_task_id_actions_complete_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Complete Single Record Workflow Task


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_get**
> objects_objectworkflows_tasks_task_id_actions_get (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflow Task Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwaccept_post**
> objects_objectworkflows_tasks_task_id_actions_mdwaccept_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Accept Multi-item Workflow Task


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post**
> objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Complete Multi-item Workflow Task


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post**
> objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Manage Multi-Item Workflow Content


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_mdwreassign_post**
> objects_objectworkflows_tasks_task_id_actions_mdwreassign_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Reassign Multi-item Workflow Task


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The id of the task to reassign. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_reassign_post**
> objects_objectworkflows_tasks_task_id_actions_reassign_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Reassign Single Record Workflow Task


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The id of the task to reassign. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_task_action_get**
> objects_objectworkflows_tasks_task_id_actions_task_action_get (task_id: STRING_32 ; task_action: STRING_32 ; loc:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflow Task Action Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **task_action** | **STRING_32**| The name of the task action retrieved from Retrieve Workflow Task Actions. | [default to null]
 **loc** | **STRING_32**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_undoaccept_post**
> objects_objectworkflows_tasks_task_id_actions_undoaccept_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Undo Workflow Task Acceptance


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_actions_updateduedate_post**
> objects_objectworkflows_tasks_task_id_actions_updateduedate_post (task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Workflow Task Due Date


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The id of the task. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_tasks_task_id_get**
> objects_objectworkflows_tasks_task_id_get (task_id: STRING_32 ; loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflow Task Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **STRING_32**| The task id field value. | [default to null]
 **loc** | **BOOLEAN**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_actions_get**
> objects_objectworkflows_workflow_id_actions_get (workflow_id: STRING_32 ; loc:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflow Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_id** | **STRING_32**| The workflow id field value. | [default to null]
 **loc** | **STRING_32**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_actions_workflow_action_get**
> objects_objectworkflows_workflow_id_actions_workflow_action_get (workflow_id: STRING_32 ; workflow_action: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflow Action Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_id** | **STRING_32**| The workflow id field value. | [default to null]
 **workflow_action** | **STRING_32**| The workflow action name retrieved from Retrieve Workflow Actions. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_actions_workflow_action_post**
> objects_objectworkflows_workflow_id_actions_workflow_action_post (workflow_id: STRING_32 ; workflow_action: STRING_32 ; documents__sys:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Workflow Action


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_id** | **STRING_32**| The workflow id field value. | [default to null]
 **workflow_action** | **STRING_32**| The workflow action name retrieved from Retrieve Workflow Actions. | [default to null]
 **documents__sys** | **STRING_32**| Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_objectworkflows_workflow_id_get**
> objects_objectworkflows_workflow_id_get (workflow_id: STRING_32 ; loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Workflow Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflow_id** | **STRING_32**| The workflow id field value. | [default to null]
 **loc** | **BOOLEAN**| When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_picklists_get**
> objects_picklists_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Picklists


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_get**
> objects_picklists_picklist_name_get (picklist_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Picklist Values


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklist_name** | **STRING_32**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_picklist_value_name_delete**
> objects_picklists_picklist_name_picklist_value_name_delete (picklist_name: STRING_32 ; picklist_value_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Inactivate Picklist Value


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklist_name** | **STRING_32**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **picklist_value_name** | **STRING_32**| The picklist value name field value (north_america__c, south_america__c, etc.) | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_picklist_value_name_put**
> objects_picklists_picklist_name_picklist_value_name_put (picklist_name: STRING_32 ; picklist_value_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Picklist Value


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklist_name** | **STRING_32**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **picklist_value_name** | **STRING_32**| The picklist value name field value (north_america__c, south_america__c, etc.) | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_post**
> objects_picklists_picklist_name_post (picklist_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Picklist Values


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklist_name** | **STRING_32**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_picklists_picklist_name_put**
> objects_picklists_picklist_name_put (picklist_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Picklist Value Label


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklist_name** | **STRING_32**| The picklist name field value (license_type__v, product_family__c, region__c, etc.) | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_actions_buildproduction_post**
> objects_sandbox_actions_buildproduction_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Build Production Vault


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_actions_promoteproduction_post**
> objects_sandbox_actions_promoteproduction_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Promote to Production


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_actions_recheckusage_post**
> objects_sandbox_actions_recheckusage_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Recheck Sandbox Usage Limit


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_batch_changesize_post**
> objects_sandbox_batch_changesize_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Change Sandbox Size


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_entitlements_set_post**
> objects_sandbox_entitlements_set_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Set Sandbox Entitlements


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_get**
> objects_sandbox_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Sandboxes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_name_delete**
> objects_sandbox_name_delete (name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Sandbox


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **STRING_32**| The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_post**
> objects_sandbox_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create or Refresh Sandbox


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_api_name_actions_update_post**
> objects_sandbox_snapshot_api_name_actions_update_post (api_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Sandbox Snapshot


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_name** | **STRING_32**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_api_name_actions_upgrade_post**
> objects_sandbox_snapshot_api_name_actions_upgrade_post (api_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Upgrade Sandbox Snapshot


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_name** | **STRING_32**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_api_name_delete**
> objects_sandbox_snapshot_api_name_delete (api_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Sandbox Snapshot


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_name** | **STRING_32**| The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_get**
> objects_sandbox_snapshot_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Sandbox Snapshots


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_snapshot_post**
> objects_sandbox_snapshot_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Sandbox Snapshot


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_vault_id_actions_refresh_post**
> objects_sandbox_vault_id_actions_refresh_post (vault_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Refresh Sandbox from Snapshot


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vault_id** | **STRING_32**| The Vault ID of the sandbox to be refreshed. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_sandbox_vault_id_get**
> objects_sandbox_vault_id_get (vault_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Sandbox Details by ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vault_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_securitypolicies_get**
> objects_securitypolicies_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Security Policies


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_securitypolicies_security_policy_name_get**
> objects_securitypolicies_security_policy_name_get (security_policy_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Security Policy


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_policy_name** | **STRING_32**| Security policy name__v field value (retrieved from previous request). This is typically a numeric value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_get**
> objects_users_get (vaults:  detachable STRING_32 ; exclude_vault_membership:  detachable STRING_32 ; exclude_app_licensing:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Users


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vaults** | **STRING_32**| Retrieve all users assigned to all Vaults in your domain. | [optional] [default to null]
 **exclude_vault_membership** | **STRING_32**| Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [optional] [default to null]
 **exclude_app_licensing** | **STRING_32**| Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_id_get**
> objects_users_id_get (id: STRING_32 ; exclude_vault_membership:  detachable STRING_32 ; exclude_app_licensing:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve User


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The user id field value. Use the value me to get information for the currently authenticated user. | [default to null]
 **exclude_vault_membership** | **STRING_32**| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] [default to null]
 **exclude_app_licensing** | **STRING_32**| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_id_permissions_get**
> objects_users_id_permissions_get (id: STRING_32 ; filter:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve User Permissions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The ID of the user. Use the value me to retrieve information for the currently authenticated user. | [default to null]
 **filter** | **STRING_32**| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_id_put**
> objects_users_id_put (id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Single User


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The user id field value. Use the value me to get information for the currently authenticated user. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_me_get**
> objects_users_me_get (exclude_vault_membership:  detachable STRING_32 ; exclude_app_licensing:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Validate Session User


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exclude_vault_membership** | **STRING_32**| Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional] [default to null]
 **exclude_app_licensing** | **STRING_32**| Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_me_password_post**
> objects_users_me_password_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Change My Password


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_me_permissions_get**
> objects_users_me_permissions_get (filter:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve My User Permissions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **STRING_32**| Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_me_put**
> objects_users_me_put (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update My User


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_post**
> objects_users_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Single User


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_put**
> objects_users_put (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Multiple Users


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_user_id_delete**
> objects_users_user_id_delete (user_id: STRING_32 ; domain:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Disable User


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **STRING_32**| The user id field value.  | [default to null]
 **domain** | **BOOLEAN**| When true, this disables the user account in all vaults in the domain. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_users_user_id_vault_membership_vault_id_put**
> objects_users_user_id_vault_membership_vault_id_put (user_id: STRING_32 ; vault_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Vault Membership


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **STRING_32**| The user id field value. | [default to null]
 **vault_id** | **STRING_32**| The system-managed id field value assigned to each vault in the domain. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_vault_actions_compare_post**
> objects_vault_actions_compare_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Vault Compare


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_vault_actions_configreport_post**
> objects_vault_actions_configreport_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Vault Configuration Report


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query_components_post**
> query_components_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Component Definition Query


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query_next_page_post**
> query_next_page_post (next_page: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__describe_query:  detachable BOOLEAN ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Next Page URL


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **next_page** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__describe_query** | **BOOLEAN**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query_post**
> query_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__describe_query:  detachable BOOLEAN ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Submitting a Query


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__describe_query** | **BOOLEAN**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query_previous_page_post**
> query_previous_page_post (previous_page: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__describe_query:  detachable BOOLEAN ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Previous Page URL


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **previous_page** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__describe_query** | **BOOLEAN**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_me_get**
> scim_v2_me_get (attributes:  detachable STRING_32 ; excluded_attributes:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Current User with SCIM


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **STRING_32**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excluded_attributes** | **STRING_32**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_me_put**
> scim_v2_me_put (attributes:  detachable STRING_32 ; excluded_attributes:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Current User with SCIM


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **STRING_32**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excluded_attributes** | **STRING_32**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_resource_types_get**
> scim_v2_resource_types_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All SCIM Resource Types


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_resource_types_type_get**
> scim_v2_resource_types_type_get (type: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Single SCIM Resource Type


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_schemas_get**
> scim_v2_schemas_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All SCIM Schema Information


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_schemas_id_get**
> scim_v2_schemas_id_get (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Single SCIM Schema Information


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_service_provider_config_get**
> scim_v2_service_provider_config_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve SCIM Provider


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_type_get**
> scim_v2_type_get (type: STRING_32 ; filter:  detachable STRING_32 ; attributes:  detachable STRING_32 ; excluded_attributes:  detachable STRING_32 ; sort_by:  detachable STRING_32 ; sort_order:  detachable STRING_32 ; start_index:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve SCIM Resources


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | [default to null]
 **filter** | **STRING_32**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] [default to null]
 **attributes** | **STRING_32**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excluded_attributes** | **STRING_32**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **sort_by** | **STRING_32**| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] [default to null]
 **sort_order** | **STRING_32**| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] [default to null]
 **start_index** | **STRING_32**| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_type_id_get**
> scim_v2_type_id_get (type: STRING_32 ; id: STRING_32 ; attributes:  detachable STRING_32 ; excluded_attributes:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Single SCIM Resource


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **STRING_32**| The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. | [default to null]
 **id** | **STRING_32**| The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. | [default to null]
 **attributes** | **STRING_32**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excluded_attributes** | **STRING_32**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_get**
> scim_v2_users_get (filter:  detachable STRING_32 ; attributes:  detachable STRING_32 ; excluded_attributes:  detachable STRING_32 ; sort_by:  detachable STRING_32 ; sort_order:  detachable STRING_32 ; count:  detachable STRING_32 ; start_index:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Users with SCIM


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **STRING_32**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] [default to null]
 **attributes** | **STRING_32**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excluded_attributes** | **STRING_32**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **sort_by** | **STRING_32**| Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional] [default to null]
 **sort_order** | **STRING_32**| Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [optional] [default to null]
 **count** | **STRING_32**| Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional] [default to null]
 **start_index** | **STRING_32**| Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_id_get**
> scim_v2_users_id_get (id: STRING_32 ; filter:  detachable STRING_32 ; attributes:  detachable STRING_32 ; excluded_attributes:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Single User with SCIM


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The id of the user you wish to update. | [default to null]
 **filter** | **STRING_32**| Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional] [default to null]
 **attributes** | **STRING_32**| Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional] [default to null]
 **excluded_attributes** | **STRING_32**| Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_id_put**
> scim_v2_users_id_put (id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update User with SCIM


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| The id of the user you wish to update. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_post**
> scim_v2_users_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create User with SCIM


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_certificate_cert_id_get**
> services_certificate_cert_id_get (cert_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Signing Certificate


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cert_id** | **STRING_32**| The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_configuration_mode_actions_disable_post**
> services_configuration_mode_actions_disable_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Disable Configuration Mode


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_configuration_mode_actions_enable_post**
> services_configuration_mode_actions_enable_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Enable Configuration Mode


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_directdata_files_get**
> services_directdata_files_get (extract_type:  detachable STRING_32 ; start_time:  detachable INTEGER_32 ; stop_time:  detachable INTEGER_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Available Direct Data Files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extract_type** | **STRING_32**| The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [optional] [default to null]
 **start_time** | **INTEGER_32**| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [optional] [default to null]
 **stop_time** | **INTEGER_32**| Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_directdata_files_name_get**
> services_directdata_files_name_get (name: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Direct Data File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **STRING_32**| The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_items_content_item_get**
> services_file_staging_items_content_item_get (item: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; range:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Item Content


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **STRING_32**| The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **range** | **STRING_32**| Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;. | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_items_item_delete**
> services_file_staging_items_item_delete (item: STRING_32 ; recursive:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete File or Folder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **STRING_32**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **recursive** | **STRING_32**| Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_items_item_get**
> services_file_staging_items_item_get (item: STRING_32 ; recursive:  detachable STRING_32 ; limit:  detachable STRING_32 ; format_result:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


List Items at a Path


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **STRING_32**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **recursive** | **STRING_32**| If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [optional] [default to null]
 **limit** | **STRING_32**| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] [default to null]
 **format_result** | **STRING_32**| If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_items_item_put**
> services_file_staging_items_item_put (item: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Folder or File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **STRING_32**| The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_items_post**
> services_file_staging_items_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__md5:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Folder or File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__md5** | **STRING_32**| Optional: The MD5 checksum of the file being uploaded. | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_upload_get**
> services_file_staging_upload_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


List Upload Sessions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_upload_post**
> services_file_staging_upload_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Resumable Upload Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_delete**
> services_file_staging_upload_upload_session_id_delete (upload_session_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Abort Upload Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_session_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_get**
> services_file_staging_upload_upload_session_id_get (upload_session_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Get Upload Session Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_session_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_parts_get**
> services_file_staging_upload_upload_session_id_parts_get (upload_session_id: STRING_32 ; limit:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


List File Parts Uploaded to Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_session_id** | **STRING_32**|  | [default to null]
 **limit** | **STRING_32**| Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_post**
> services_file_staging_upload_upload_session_id_post (upload_session_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Commit Upload Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_session_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_file_staging_upload_upload_session_id_put**
> services_file_staging_upload_upload_session_id_put (upload_session_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__file_part_number:  detachable STRING_32 ; content__md5:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Upload to a Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_session_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__file_part_number** | **STRING_32**| The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [optional] [default to null]
 **content__md5** | **STRING_32**| Optional: The MD5 checksum of the file part being uploaded. | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_jobs_histories_get**
> services_jobs_histories_get (start_date:  detachable STRING_32 ; end_date:  detachable STRING_32 ; status:  detachable STRING_32 ; limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Job Histories


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **STRING_32**| Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] [default to null]
 **end_date** | **STRING_32**| Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] [default to null]
 **status** | **STRING_32**| Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [optional] [default to null]
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] [default to null]
 **offset** | **STRING_32**| Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_jobs_job_id_errors_get**
> services_jobs_job_id_errors_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Import Bulk Translation File Job Errors


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_jobs_job_id_get**
> services_jobs_job_id_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Job Status


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The ID of the job, returned from the original job request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_jobs_job_id_summary_get**
> services_jobs_job_id_summary_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Import Bulk Translation File Job Summary


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested import job. This was returned from the Import Bulk Translation File request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_jobs_job_id_tasks_get**
> services_jobs_job_id_tasks_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve SDK Job Tasks


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The ID of the SDK job, returned from the original job request. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_jobs_monitors_get**
> services_jobs_monitors_get (start_date:  detachable STRING_32 ; end_date:  detachable STRING_32 ; status:  detachable STRING_32 ; limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Job Monitors


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **STRING_32**| Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional] [default to null]
 **end_date** | **STRING_32**| Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional] [default to null]
 **status** | **STRING_32**| Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [optional] [default to null]
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional] [default to null]
 **offset** | **STRING_32**| Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_jobs_start_now_job_id_post**
> services_jobs_start_now_job_id_post (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Start Job


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The ID of the scheduled job instance to start. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_loader_extract_post**
> services_loader_extract_post (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Extract Data Files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_failurelog_get**
> services_loader_job_id_tasks_task_id_failurelog_get (job_id: STRING_32 ; task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Load Failure Log Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested extract job. | [default to null]
 **task_id** | **STRING_32**| The id value of the requested extract task. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_results_get**
> services_loader_job_id_tasks_task_id_results_get (job_id: STRING_32 ; task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Loader Extract Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested extract job. | [default to null]
 **task_id** | **STRING_32**| The id value of the requested extract task. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_results_renditions_get**
> services_loader_job_id_tasks_task_id_results_renditions_get (job_id: STRING_32 ; task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Loader Extract Renditions Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested extract job. | [default to null]
 **task_id** | **STRING_32**| The id value of the requested extract task. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_loader_job_id_tasks_task_id_successlog_get**
> services_loader_job_id_tasks_task_id_successlog_get (job_id: STRING_32 ; task_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Load Success Log Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The id value of the requested extract job. | [default to null]
 **task_id** | **STRING_32**| The id value of the requested extract task. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_loader_load_post**
> services_loader_load_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Load Data Objects


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_package_actions_validate_post**
> services_package_actions_validate_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Validate Package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_package_post**
> services_package_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Export Package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_package_put**
> services_package_put (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Import Package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_queues_get**
> services_queues_get (authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Queues


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_queues_queue_name_actions_disable_delivery_put**
> services_queues_queue_name_actions_disable_delivery_put (queue_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Disable Delivery


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue_name** | **STRING_32**| The name of a specific Queue. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_queues_queue_name_actions_enable_delivery_put**
> services_queues_queue_name_actions_enable_delivery_put (queue_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Enable Delivery


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue_name** | **STRING_32**| The name of a specific Queue. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_queues_queue_name_actions_reset_put**
> services_queues_queue_name_actions_reset_put (queue_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Reset Queue


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue_name** | **STRING_32**| The name of a specific Queue. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_queues_queue_name_get**
> services_queues_queue_name_get (queue_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Queue Status


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue_name** | **STRING_32**| The name of a specific queue. For example, queue__c. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **services_vobject_vault_package_vpackage_id_actions_validate_post**
> services_vobject_vault_package_vpackage_id_actions_validate_post (package_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Validate Imported Package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **STRING_32**| The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **session_delete**
> session_delete (accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


End Session


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**| The Vault sessionId to end. | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uicode_distributions_distribution_name_code_get**
> uicode_distributions_distribution_name_code_get (distribution_name: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Single Client Code Distribution


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distribution_name** | **STRING_32**| The name attribute of the client code distribution to download. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uicode_distributions_distribution_name_delete**
> uicode_distributions_distribution_name_delete (distribution_name: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Single Client Code Distribution


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distribution_name** | **STRING_32**| The name attribute of the client code distribution to delete. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uicode_distributions_distribution_name_get**
> uicode_distributions_distribution_name_get (distribution_name: STRING_32 ; accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Single Client Code Distribution Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distribution_name** | **STRING_32**| The name attribute of the client code distribution to delete. | [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uicode_distributions_get**
> uicode_distributions_get (accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve All Client Code Distribution Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uicode_distributions_post**
> uicode_distributions_post (accept:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Add or Replace Single Client Code Distribution


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobject_vault_package_vpackage_id_actions_deploy_post**
> vobject_vault_package_vpackage_id_actions_deploy_post (package_id: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Deploy Package


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **STRING_32**| The id field value of the vault_package__v object record used for deployment. See Import Package. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobject_vault_package_vpackage_id_actions_deploy_results_get**
> vobject_vault_package_vpackage_id_actions_deploy_results_get (package_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Package Deploy Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **STRING_32**| The id field value of the vault_package__v object record used for deployment. See Deploy Package. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_cascadedelete_results_object_name_job_status_job_id_get**
> vobjects_cascadedelete_results_object_name_job_status_job_id_get (object_name: STRING_32 ; job_status: STRING_32 ; job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Results of Cascade Delete Job


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **job_status** | **STRING_32**|  | [default to null]
 **job_id** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_deepcopy_results_object_name_job_status_job_id_get**
> vobjects_deepcopy_results_object_name_job_status_job_id_get (object_name: STRING_32 ; job_status: STRING_32 ; job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Results of Deep Copy Job


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **job_status** | **STRING_32**| The ID of the job, retrieved from the response of the job request. | [default to null]
 **job_id** | **STRING_32**| Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_edl_item_vactions_createplaceholder_post**
> vobjects_edl_item_vactions_createplaceholder_post (authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create a Placeholder from an EDL Item


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_merges_job_id_log_get**
> vobjects_merges_job_id_log_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Merge Records Job Log


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_merges_job_id_results_get**
> vobjects_merges_job_id_results_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Record Merge Results


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_merges_job_id_status_get**
> vobjects_merges_job_id_status_get (job_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Record Merge Status


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **STRING_32**| The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_action_name_post**
> vobjects_object_name_actions_action_name_post (object_name: STRING_32 ; action_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Object Action on Multiple Records


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. | [default to null]
 **action_name** | **STRING_32**| Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_changetype_post**
> vobjects_object_name_actions_changetype_post (object_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Change Object Type


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The name of the object. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_merge_post**
> vobjects_object_name_actions_merge_post (object_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 ; var_vobjects__object_name__actions_merge_post_request_inner:  detachable LIST [MODEL_VOBJECTS__OBJECT_NAME__ACTIONS_MERGE_POST_REQUEST_INNER] )


Initiate Record Merge


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. For example, account__v. This object must have Enable Merges configured. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]
 **var_vobjects__object_name__actions_merge_post_request_inner** | [**LIST [MODEL_VOBJECTS__OBJECT_NAME__ACTIONS_MERGE_POST_REQUEST_INNER]**](_vobjects__object_name__actions_merge_post_request_inner.md)|  | [optional] 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_recalculaterollups_get**
> vobjects_object_name_actions_recalculaterollups_get (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Roll-up Field Recalculation Status


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The name of the object for which to check the status of a Roll-up field recalculation. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_recalculaterollups_post**
> vobjects_object_name_actions_recalculaterollups_post (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Recalculate Roll-up Fields


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The name of the object for which to check the status of a Roll-up field recalculation. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_actions_updatecorporatecurrency_put**
> vobjects_object_name_actions_updatecorporatecurrency_put (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Corporate Currency Fields


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_attachments_batch_delete**
> vobjects_object_name_attachments_batch_delete (object_name: STRING_32 ; id_param:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Multiple Object Record Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **id_param** | **STRING_32**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_attachments_batch_post**
> vobjects_object_name_attachments_batch_post (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Multiple Object Record Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_attachments_batch_put**
> vobjects_object_name_attachments_batch_put (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Multiple Object Record Attachment Descriptions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_delete**
> vobjects_object_name_delete (object_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Object Records


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**| Can be text/csv or application/json | [optional] [default to null]
 **accept** | **STRING_32**| Can be text/csv or application/json | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_id_roles_role_name_get**
> vobjects_object_name_id_roles_role_name_get (object_name: STRING_32 ; id: STRING_32 ; role_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Record Roles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name. | [default to null]
 **id** | **STRING_32**| The id of the document, binder, or object record. | [default to null]
 **role_name** | **STRING_32**| Optional: Include a role name to filter for a specific role. For example, owner__v. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_action_name_get**
> vobjects_object_name_object_record_id_actions_action_name_get (object_name: STRING_32 ; object_record_id: STRING_32 ; action_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object User Actions Details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value from which to retrieve user actions. | [default to null]
 **action_name** | **STRING_32**| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_action_name_post**
> vobjects_object_name_object_record_id_actions_action_name_post (object_name: STRING_32 ; object_record_id: STRING_32 ; action_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Initiate Object Action on a Single Record


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value from which to retrieve user actions. | [default to null]
 **action_name** | **STRING_32**| The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_cascadedelete_post**
> vobjects_object_name_object_record_id_actions_cascadedelete_post (object_name: STRING_32 ; object_record_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Cascade Delete Object Record


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_deepcopy_post**
> vobjects_object_name_object_record_id_actions_deepcopy_post (object_name: STRING_32 ; object_record_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Deep Copy Object Record


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_actions_get**
> vobjects_object_name_object_record_id_actions_get (object_name: STRING_32 ; object_record_id: STRING_32 ; loc:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Record User Actions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **loc** | **BOOLEAN**| Optional: When true, retrieves localized (translated) strings for the label.  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get**
> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_field_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Attachment Field File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. For example, product__v. | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_field_name** | **STRING_32**| The name of the Attachment field to update. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post**
> vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_field_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Attachment Field File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. For example, product__v. | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_field_name** | **STRING_32**| The name of the Attachment field to update. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachment_fields_file_get**
> vobjects_object_name_object_record_id_attachment_fields_file_get (object_name: STRING_32 ; object_record_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download All Attachment Field Files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. For example, product__v. | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_delete**
> vobjects_object_name_object_record_id_attachments_attachment_id_delete (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Object Record Attachment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_get (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Record Attachment Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_put**
> vobjects_object_name_object_record_id_attachments_attachment_id_put (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Object Record Attachment Description


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Delete Object Record Attachment Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**| The attachment version__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download Object Record Attachment File


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**|  | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Record Attachment Version Metadata


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**| The attachment version__v field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; attachment_version: STRING_32 ; restore:  detachable BOOLEAN ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Restore Object Record Attachment Version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **attachment_version** | **STRING_32**| The attachment version__v field value. | [default to null]
 **restore** | **BOOLEAN**|  | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_get**
> vobjects_object_name_object_record_id_attachments_attachment_id_versions_get (object_name: STRING_32 ; object_record_id: STRING_32 ; attachment_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Record Attachment Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **attachment_id** | **STRING_32**| The attachment id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_file_get**
> vobjects_object_name_object_record_id_attachments_file_get (object_name: STRING_32 ; object_record_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Download All Object Record Attachment Files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_get**
> vobjects_object_name_object_record_id_attachments_get (object_name: STRING_32 ; object_record_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Record Attachments


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_attachments_post**
> vobjects_object_name_object_record_id_attachments_post (object_name: STRING_32 ; object_record_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create Object Record Attachment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_audittrail_get**
> vobjects_object_name_object_record_id_audittrail_get (object_name: STRING_32 ; object_record_id: STRING_32 ; start_date:  detachable STRING_32 ; end_date:  detachable STRING_32 ; format_result:  detachable STRING_32 ; limit:  detachable STRING_32 ; offset:  detachable STRING_32 ; events:  detachable STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Complete Audit History for a Single Object Record


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value. | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value from which to retrieve user actions. | [default to null]
 **start_date** | **STRING_32**| Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  | [optional] [default to null]
 **end_date** | **STRING_32**| Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional] [default to null]
 **format_result** | **STRING_32**| To request a CSV file of your audit history, use csv.  | [optional] [default to null]
 **limit** | **STRING_32**| Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional] [default to null]
 **offset** | **STRING_32**| Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional] [default to null]
 **events** | **STRING_32**| Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_object_record_id_get**
> vobjects_object_name_object_record_id_get (object_name: STRING_32 ; object_record_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Object Record


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **object_record_id** | **STRING_32**| The object record id field value. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_post**
> vobjects_object_name_post (object_name: STRING_32 ; id_param:  detachable STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__no_triggers:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Create & Upsert Object Records


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **id_param** | **STRING_32**| To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;. | [optional] [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**| Can be text/csv or application/json | [optional] [default to null]
 **accept** | **STRING_32**| Can be text/csv or application/json | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] [default to null]
 **x__vault_ap_i__no_triggers** | **BOOLEAN**| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_put**
> vobjects_object_name_put (object_name: STRING_32 ; authorization:  detachable STRING_32 ; content__type:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__migration_mode:  detachable BOOLEAN ; x__vault_ap_i__no_triggers:  detachable BOOLEAN ; x__vault_ap_i__client_id:  detachable STRING_32 )


Update Object Records


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The object name__v field value (product__v, country__v, custom_object__c, etc.). | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**| Can be text/csv or application/json | [optional] [default to null]
 **accept** | **STRING_32**| Can be text/csv or application/json | [optional] [default to null]
 **x__vault_ap_i__migration_mode** | **BOOLEAN**| If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional] [default to null]
 **x__vault_ap_i__no_triggers** | **BOOLEAN**| If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_roles_delete**
> vobjects_object_name_roles_delete (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Remove Users & Groups from Roles on Object Records


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The name of the object where you want to remove roles. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_object_name_roles_post**
> vobjects_object_name_roles_post (object_name: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; content__type:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Assign Users & Groups to Roles on Object Records


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **object_name** | **STRING_32**| The name of the object where you want to remove roles. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **content__type** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vobjects_outbound_package_vpackage_id_dependencies_get**
> vobjects_outbound_package_vpackage_id_dependencies_get (package_id: STRING_32 ; authorization:  detachable STRING_32 ; accept:  detachable STRING_32 ; x__vault_ap_i__client_id:  detachable STRING_32 )


Retrieve Outbound Package Dependencies


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **package_id** | **STRING_32**| The ID of the outbound_package__v record from which to retrieve dependencies. | [default to null]
 **authorization** | **STRING_32**|  | [optional] [default to null]
 **accept** | **STRING_32**|  | [optional] [default to null]
 **x__vault_ap_i__client_id** | **STRING_32**| Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

