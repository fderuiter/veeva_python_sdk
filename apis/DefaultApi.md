<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *http://}/api/v25.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_get**](#api_get) | **GET** `/api/` | Retrieve API Versions
[**api_mdl_components_component_type_and_record_name_files_get**](#api_mdl_components_component_type_and_record_name_files_get) | **GET** `/api/mdl/components/{component_type_and_record_name}/files` | Retrieve Content File
[**api_mdl_components_component_type_and_record_name_get**](#api_mdl_components_component_type_and_record_name_get) | **GET** `/api/mdl/components/{component_type_and_record_name}` | Retrieve Component Record (MDL)
[**api_mdl_execute_async_job_id_results_get**](#api_mdl_execute_async_job_id_results_get) | **GET** `/api/mdl/execute_async/{job_id}/results` | Retrieve Asynchronous MDL Script Results
[**api_mdl_execute_async_post**](#api_mdl_execute_async_post) | **POST** `/api/mdl/execute_async` | Execute MDL Script Asynchronously
[**api_mdl_execute_post**](#api_mdl_execute_post) | **POST** `/api/mdl/execute` | Execute MDL Script
[**api_mdl_files_post**](#api_mdl_files_post) | **POST** `/api/mdl/files` | Upload Content File
[**audittrail_audit_trail_type_get**](#audittrail_audit_trail_type_get) | **GET** `/audittrail/{audit_trail_type}` | Retrieve Audit Details
[**auth_discovery_post**](#auth_discovery_post) | **POST** `/auth/discovery` | Authentication Type Discovery
[**auth_oauth_session_oath_oidc_profile_id_post**](#auth_oauth_session_oath_oidc_profile_id_post) | **POST** `/auth/oauth/session/{oath_oidc_profile_id}` | OAuth 2.0 / OpenID Connect
[**auth_post**](#auth_post) | **POST** `/auth` | User Name and Password
[**code_class_name_delete**](#code_class_name_delete) | **DELETE** `/code/{class_name}` | Delete Single Source Code File
[**code_class_name_disable_put**](#code_class_name_disable_put) | **PUT** `/code/{class_name}/disable` | Disable Vault Extension
[**code_class_name_enable_put**](#code_class_name_enable_put) | **PUT** `/code/{class_name}/enable` | Enable Vault Extension
[**code_class_name_get**](#code_class_name_get) | **GET** `/code/{class_name}` | Retrieve Single Source Code File
[**code_profiler_get**](#code_profiler_get) | **GET** `/code/profiler` | Retrieve All Profiling Sessions
[**code_profiler_post**](#code_profiler_post) | **POST** `/code/profiler` | Create Profiling Session
[**code_profiler_session_name_actions_end_post**](#code_profiler_session_name_actions_end_post) | **POST** `/code/profiler/{session_name}/actions/end` | End Profiling Session
[**code_profiler_session_name_delete**](#code_profiler_session_name_delete) | **DELETE** `/code/profiler/{session_name}` | Delete Profiling Session
[**code_profiler_session_name_get**](#code_profiler_session_name_get) | **GET** `/code/profiler/{session_name}` | Retrieve Profiling Session
[**code_profiler_session_name_results_get**](#code_profiler_session_name_results_get) | **GET** `/code/profiler/{session_name}/results` | Download Profiling Session Results
[**code_put**](#code_put) | **PUT** `/code` | Add or Replace Single Source Code File
[**composites_trees_edl_hierarchy_or_template_actions_listnodes_post**](#composites_trees_edl_hierarchy_or_template_actions_listnodes_post) | **POST** `/composites/trees/{edl_hierarchy_or_template}/actions/listnodes` | Retrieve Specific Root Nodes
[**composites_trees_edl_hierarchy_or_template_get**](#composites_trees_edl_hierarchy_or_template_get) | **GET** `/composites/trees/{edl_hierarchy_or_template}` | Retrieve All Root Nodes
[**composites_trees_edl_hierarchy_v_parent_node_id_children_get**](#composites_trees_edl_hierarchy_v_parent_node_id_children_get) | **GET** `/composites/trees/edl_hierarchy__v/{parent_node_id}/children` | Retrieve a Node&#x27;s Children
[**composites_trees_edl_hierarchy_v_parent_node_id_children_put**](#composites_trees_edl_hierarchy_v_parent_node_id_children_put) | **PUT** `/composites/trees/edl_hierarchy__v/{parent_node_id}/children` | Update Node Order
[**configuration_component_type_and_record_name_get**](#configuration_component_type_and_record_name_get) | **GET** `/configuration/{component_type_and_record_name}` | Retrieve Component Record (XML/JSON)
[**configuration_component_type_get**](#configuration_component_type_get) | **GET** `/configuration/{component_type}` | Retrieve Component Record Collection
[**configuration_object_name_and_object_type_get**](#configuration_object_name_and_object_type_get) | **GET** `/configuration/{object_name_and_object_type}` | Retrieve Details from a Specific Object
[**configuration_objecttype_get**](#configuration_objecttype_get) | **GET** `/configuration/Objecttype` | Retrieve Details from All Object Types
[**configuration_role_assignment_rule_delete**](#configuration_role_assignment_rule_delete) | **DELETE** `/configuration/role_assignment_rule` | Delete Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_get**](#configuration_role_assignment_rule_get) | **GET** `/configuration/role_assignment_rule` | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
[**configuration_role_assignment_rule_post**](#configuration_role_assignment_rule_post) | **POST** `/configuration/role_assignment_rule` | Create Lifecycle Role Assignment Override Rules
[**configuration_role_assignment_rule_put**](#configuration_role_assignment_rule_put) | **PUT** `/configuration/role_assignment_rule` | Update Lifecycle Role Assignment Rules (Default &amp; Override)
[**delegation_login_post**](#delegation_login_post) | **POST** `/delegation/login` | Initiate Delegated Session
[**delegation_vaults_get**](#delegation_vaults_get) | **GET** `/delegation/vaults` | Retrieve Delegations
[**keep_alive_post**](#keep_alive_post) | **POST** `/keep-alive` | Session Keep Alive
[**limits_get**](#limits_get) | **GET** `/limits` | Retrieve Limits on Objects
[**logs_api_usage_get**](#logs_api_usage_get) | **GET** `/logs/api_usage` | Download Daily API Usage
[**logs_code_debug_get**](#logs_code_debug_get) | **GET** `/logs/code/debug` | Retrieve All Debug Logs
[**logs_code_debug_id_actions_reset_delete**](#logs_code_debug_id_actions_reset_delete) | **DELETE** `/logs/code/debug/{id}/actions/reset` | Delete Debug Log
[**logs_code_debug_id_actions_reset_post**](#logs_code_debug_id_actions_reset_post) | **POST** `/logs/code/debug/{id}/actions/reset` | Reset Debug Log
[**logs_code_debug_id_files_get**](#logs_code_debug_id_files_get) | **GET** `/logs/code/debug/{id}/files` | Download Debug Log Files
[**logs_code_debug_id_get**](#logs_code_debug_id_get) | **GET** `/logs/code/debug/{id}` | Retrieve Single Debug Log
[**logs_code_debug_post**](#logs_code_debug_post) | **POST** `/logs/code/debug` | Create Debug Log
[**logs_code_runtime_get**](#logs_code_runtime_get) | **GET** `/logs/code/runtime` | Download SDK Runtime Log
[**messages_message_type_actions_import_post**](#messages_message_type_actions_import_post) | **POST** `/messages/{message_type}/actions/import` | Import Bulk Translation File
[**messages_message_type_language_lang_actions_export_post**](#messages_message_type_language_lang_actions_export_post) | **POST** `/messages/{message_type}/language/{lang}/actions/export` | Export Bulk Translation File
[**metadata_audittrail_audit_trail_type_get**](#metadata_audittrail_audit_trail_type_get) | **GET** `/metadata/audittrail/{audit_trail_type}` | Retrieve Audit Metadata
[**metadata_audittrail_get**](#metadata_audittrail_get) | **GET** `/metadata/audittrail` | Retrieve Audit Types
[**metadata_components_component_type_get**](#metadata_components_component_type_get) | **GET** `/metadata/components/{component_type}` | Retrieve Component Type Metadata
[**metadata_components_get**](#metadata_components_get) | **GET** `/metadata/components` | Retrieve All Component Metadata
[**metadata_objects_binders_templates_bindernodes_get**](#metadata_objects_binders_templates_bindernodes_get) | **GET** `/metadata/objects/binders/templates/bindernodes` | Retrieve Binder Template Node Metadata
[**metadata_objects_binders_templates_get**](#metadata_objects_binders_templates_get) | **GET** `/metadata/objects/binders/templates` | Retrieve Binder Template Metadata
[**metadata_objects_documents_annotations_placemarks_types_placemark_type_get**](#metadata_objects_documents_annotations_placemarks_types_placemark_type_get) | **GET** `/metadata/objects/documents/annotations/placemarks/types/{placemark_type}` | Retrieve Annotation Placemark Type Metadata
[**metadata_objects_documents_annotations_references_types_reference_type_get**](#metadata_objects_documents_annotations_references_types_reference_type_get) | **GET** `/metadata/objects/documents/annotations/references/types/{reference_type}` | Retrieve Annotation Reference Type Metadata
[**metadata_objects_documents_annotations_types_annotation_type_get**](#metadata_objects_documents_annotations_types_annotation_type_get) | **GET** `/metadata/objects/documents/annotations/types/{annotation_type}` | Retrieve Annotation Type Metadata
[**metadata_objects_documents_events_event_type_types_event_subtype_get**](#metadata_objects_documents_events_event_type_types_event_subtype_get) | **GET** `/metadata/objects/documents/events/{event_type}/types/{event_subtype}` | Retrieve Document Event SubType Metadata
[**metadata_objects_documents_events_get**](#metadata_objects_documents_events_get) | **GET** `/metadata/objects/documents/events` | Retrieve Document Event Types and Subtypes
[**metadata_objects_documents_lock_get**](#metadata_objects_documents_lock_get) | **GET** `/metadata/objects/documents/lock` | Retrieve Document Lock Metadata
[**metadata_objects_documents_properties_find_common_post**](#metadata_objects_documents_properties_find_common_post) | **POST** `/metadata/objects/documents/properties/find_common` | Retrieve Common Document Fields
[**metadata_objects_documents_properties_get**](#metadata_objects_documents_properties_get) | **GET** `/metadata/objects/documents/properties` | Retrieve All Document Fields
[**metadata_objects_documents_templates_get**](#metadata_objects_documents_templates_get) | **GET** `/metadata/objects/documents/templates` | Retrieve Document Template Metadata
[**metadata_objects_documents_types_get**](#metadata_objects_documents_types_get) | **GET** `/metadata/objects/documents/types` | Retrieve All Document Types
[**metadata_objects_documents_types_type_get**](#metadata_objects_documents_types_type_get) | **GET** `/metadata/objects/documents/types/{type}` | Retrieve Document Type
[**metadata_objects_documents_types_type_relationships_get**](#metadata_objects_documents_types_type_relationships_get) | **GET** `/metadata/objects/documents/types/{type}/relationships` | Retrieve Document Type Relationships
[**metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get**](#metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get) | **GET** `/metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification}` | Retrieve Document Classification
[**metadata_objects_documents_types_type_subtypes_subtype_get**](#metadata_objects_documents_types_type_subtypes_subtype_get) | **GET** `/metadata/objects/documents/types/{type}/subtypes/{subtype}` | Retrieve Document Subtype
[**metadata_objects_groups_get**](#metadata_objects_groups_get) | **GET** `/metadata/objects/groups` | Retrieve Group Metadata
[**metadata_objects_securitypolicies_get**](#metadata_objects_securitypolicies_get) | **GET** `/metadata/objects/securitypolicies` | Retrieve Security Policy Metadata
[**metadata_objects_users_get**](#metadata_objects_users_get) | **GET** `/metadata/objects/users` | Retrieve User Metadata
[**metadata_query_archived_documents_relationships_document_signature_sysr_get**](#metadata_query_archived_documents_relationships_document_signature_sysr_get) | **GET** `/metadata/query/archived_documents/relationships/document_signature__sysr` | Retrieve Archived Document Signature Metadata
[**metadata_query_documents_relationships_document_signature_sysr_get**](#metadata_query_documents_relationships_document_signature_sysr_get) | **GET** `/metadata/query/documents/relationships/document_signature__sysr` | Retrieve Document Signature Metadata
[**metadata_vobjects_get**](#metadata_vobjects_get) | **GET** `/metadata/vobjects` | Retrieve Object Collection
[**metadata_vobjects_object_name_actions_canceldeployment_post**](#metadata_vobjects_object_name_actions_canceldeployment_post) | **POST** `/metadata/vobjects/{object_name}/actions/canceldeployment` | Cancel Raw Object Deployment
[**metadata_vobjects_object_name_fields_object_field_name_get**](#metadata_vobjects_object_name_fields_object_field_name_get) | **GET** `/metadata/vobjects/{object_name}/fields/{object_field_name}` | Retrieve Object Field Metadata
[**metadata_vobjects_object_name_get**](#metadata_vobjects_object_name_get) | **GET** `/metadata/vobjects/{object_name}` | Retrieve Object Metadata
[**metadata_vobjects_object_name_page_layouts_get**](#metadata_vobjects_object_name_page_layouts_get) | **GET** `/metadata/vobjects/{object_name}/page_layouts` | Retrieve Page Layouts
[**metadata_vobjects_object_name_page_layouts_layout_name_get**](#metadata_vobjects_object_name_page_layouts_layout_name_get) | **GET** `/metadata/vobjects/{object_name}/page_layouts/{layout_name}` | Retrieve Page Layout Metadata
[**notifications_histories_get**](#notifications_histories_get) | **GET** `/notifications/histories` | Retrieve Email Notification Histories
[**object_workflow_actions_action_get**](#object_workflow_actions_action_get) | **GET** `/object/workflow/actions/{action}` | Retrieve Bulk Workflow Action Details
[**object_workflow_actions_action_post**](#object_workflow_actions_action_post) | **POST** `/object/workflow/actions/{action}` | Initiate Workflow Actions on Multiple Workflows
[**object_workflow_actions_canceltasks_post**](#object_workflow_actions_canceltasks_post) | **POST** `/object/workflow/actions/canceltasks` | Cancel Workflow Tasks
[**object_workflow_actions_cancelworkflows_post**](#object_workflow_actions_cancelworkflows_post) | **POST** `/object/workflow/actions/cancelworkflows` | Cancel Workflows
[**object_workflow_actions_get**](#object_workflow_actions_get) | **GET** `/object/workflow/actions` | Retrieve Bulk Workflow Actions
[**object_workflow_actions_reassigntasks_post**](#object_workflow_actions_reassigntasks_post) | **POST** `/object/workflow/actions/reassigntasks` | Reassign Workflow Tasks
[**object_workflow_actions_replaceworkflowowner_post**](#object_workflow_actions_replaceworkflowowner_post) | **POST** `/object/workflow/actions/replaceworkflowowner` | Replace Workflow Owner
[**objects_binders_actions_export_job_id_results_get**](#objects_binders_actions_export_job_id_results_get) | **GET** `/objects/binders/actions/export/{job_id}/results` | Retrieve Binder Export Results
[**objects_binders_binder_id_actions_export_post**](#objects_binders_binder_id_actions_export_post) | **POST** `/objects/binders/{binder_id}/actions/export` | Export Binder (Latest Version)
[**objects_binders_binder_id_actions_post**](#objects_binders_binder_id_actions_post) | **POST** `/objects/binders/{binder_id}/actions` | Refresh Binder Auto-Filing
[**objects_binders_binder_id_binding_rule_put**](#objects_binders_binder_id_binding_rule_put) | **PUT** `/objects/binders/{binder_id}/binding_rule` | Update Binding Rule
[**objects_binders_binder_id_delete**](#objects_binders_binder_id_delete) | **DELETE** `/objects/binders/{binder_id}` | Delete Binder
[**objects_binders_binder_id_documents_node_id_binding_rule_put**](#objects_binders_binder_id_documents_node_id_binding_rule_put) | **PUT** `/objects/binders/{binder_id}/documents/{node_id}/binding_rule` | Update Binder Document Binding Rule
[**objects_binders_binder_id_documents_post**](#objects_binders_binder_id_documents_post) | **POST** `/objects/binders/{binder_id}/documents` | Add Document to Binder
[**objects_binders_binder_id_documents_section_id_delete**](#objects_binders_binder_id_documents_section_id_delete) | **DELETE** `/objects/binders/{binder_id}/documents/{section_id}` | Remove Document from Binder
[**objects_binders_binder_id_documents_section_id_put**](#objects_binders_binder_id_documents_section_id_put) | **PUT** `/objects/binders/{binder_id}/documents/{section_id}` | Move Document in Binder
[**objects_binders_binder_id_get**](#objects_binders_binder_id_get) | **GET** `/objects/binders/{binder_id}` | Retrieve Binder
[**objects_binders_binder_id_post**](#objects_binders_binder_id_post) | **POST** `/objects/binders/{binder_id}` | Create Binder Version
[**objects_binders_binder_id_put**](#objects_binders_binder_id_put) | **PUT** `/objects/binders/{binder_id}` | Update Binder
[**objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete**](#objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete) | **DELETE** `/objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id}` | Remove Users &amp; Groups from Roles on a Single Binder
[**objects_binders_binder_id_sections_node_id_binding_rule_put**](#objects_binders_binder_id_sections_node_id_binding_rule_put) | **PUT** `/objects/binders/{binder_id}/sections/{node_id}/binding_rule` | Update Binder Section Binding Rule
[**objects_binders_binder_id_sections_node_id_put**](#objects_binders_binder_id_sections_node_id_put) | **PUT** `/objects/binders/{binder_id}/sections/{node_id}` | Update Binder Section
[**objects_binders_binder_id_sections_post**](#objects_binders_binder_id_sections_post) | **POST** `/objects/binders/{binder_id}/sections` | Create Binder Section
[**objects_binders_binder_id_sections_section_id_delete**](#objects_binders_binder_id_sections_section_id_delete) | **DELETE** `/objects/binders/{binder_id}/sections/{section_id}` | Delete Binder Section
[**objects_binders_binder_id_sections_section_id_get**](#objects_binders_binder_id_sections_section_id_get) | **GET** `/objects/binders/{binder_id}/sections/{section_id}` | Retrieve Binder Sections
[**objects_binders_binder_id_versions_get**](#objects_binders_binder_id_versions_get) | **GET** `/objects/binders/{binder_id}/versions` | Retrieve All Binder Versions
[**objects_binders_binder_id_versions_major_version_minor_version_actions_export_post**](#objects_binders_binder_id_versions_major_version_minor_version_actions_export_post) | **POST** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export` | Export Binder (Specific Version)
[**objects_binders_binder_id_versions_major_version_minor_version_delete**](#objects_binders_binder_id_versions_major_version_minor_version_delete) | **DELETE** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}` | Delete Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_get**](#objects_binders_binder_id_versions_major_version_minor_version_get) | **GET** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}` | Retrieve Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_put**](#objects_binders_binder_id_versions_major_version_minor_version_put) | **PUT** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}` | Update Binder Version
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_post**](#objects_binders_binder_id_versions_major_version_minor_version_relationships_post) | **POST** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships` | Create Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete**](#objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete) | **DELETE** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}` | Delete Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get**](#objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get) | **GET** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}` | Retrieve Binder Relationship
[**objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get**](#objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get) | **GET** `/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id}` | Retrieve Binder Version Section
[**objects_binders_id_roles_get**](#objects_binders_id_roles_get) | **GET** `/objects/binders/{id}/roles` | Retrieve All Binder Roles
[**objects_binders_id_roles_post**](#objects_binders_id_roles_post) | **POST** `/objects/binders/{id}/roles` | Assign Users &amp; Groups to Roles on a Single Binder
[**objects_binders_id_roles_role_name_get**](#objects_binders_id_roles_role_name_get) | **GET** `/objects/binders/{id}/roles/{role_name}` | Retrieve Document Role
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get**](#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get) | **GET** `/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions` | Retrieve Binder User Actions
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**](#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get) | **GET** `/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements` | Retrieve Binder Entry Criteria
[**objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**](#objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put) | **PUT** `/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}` | Initiate Binder User Action
[**objects_binders_lifecycle_actions_post**](#objects_binders_lifecycle_actions_post) | **POST** `/objects/binders/lifecycle_actions` | Retrieve User Actions on Multiple Binders
[**objects_binders_lifecycle_actions_user_action_name_put**](#objects_binders_lifecycle_actions_user_action_name_put) | **PUT** `/objects/binders/lifecycle_actions/{user_action_name}` | Initiate Bulk Binder User Actions
[**objects_binders_post**](#objects_binders_post) | **POST** `/objects/binders` | Create Binder
[**objects_binders_templates_get**](#objects_binders_templates_get) | **GET** `/objects/binders/templates` | Retrieve Binder Template Collection
[**objects_binders_templates_post**](#objects_binders_templates_post) | **POST** `/objects/binders/templates` | Create Binder Template
[**objects_binders_templates_put**](#objects_binders_templates_put) | **PUT** `/objects/binders/templates` | Update Binder Template
[**objects_binders_templates_template_name_bindernodes_get**](#objects_binders_templates_template_name_bindernodes_get) | **GET** `/objects/binders/templates/{template_name}/bindernodes` | Retrieve Binder Template Node Attributes
[**objects_binders_templates_template_name_bindernodes_post**](#objects_binders_templates_template_name_bindernodes_post) | **POST** `/objects/binders/templates/{template_name}/bindernodes` | Create Binder Template Node
[**objects_binders_templates_template_name_bindernodes_put**](#objects_binders_templates_template_name_bindernodes_put) | **PUT** `/objects/binders/templates/{template_name}/bindernodes` | Replace Binder Template Nodes
[**objects_binders_templates_template_name_delete**](#objects_binders_templates_template_name_delete) | **DELETE** `/objects/binders/templates/{template_name}` | Delete Binder Template
[**objects_binders_templates_template_name_get**](#objects_binders_templates_template_name_get) | **GET** `/objects/binders/templates/{template_name}` | Retrieve Binder Template Attributes
[**objects_deletions_documents_get**](#objects_deletions_documents_get) | **GET** `/objects/deletions/documents` | Retrieve Deleted Document IDs
[**objects_deletions_vobjects_object_name_get**](#objects_deletions_vobjects_object_name_get) | **GET** `/objects/deletions/vobjects/{object_name}` | Retrieve Deleted Object Record ID
[**objects_documents_actions_get**](#objects_documents_actions_get) | **GET** `/objects/documents/actions` | Retrieve All Document Workflows
[**objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get**](#objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get) | **GET** `/objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results` | Download Controlled Copy Job Results
[**objects_documents_actions_workflow_name_get**](#objects_documents_actions_workflow_name_get) | **GET** `/objects/documents/actions/{workflow_name}` | Retrieve Document Workflow Details
[**objects_documents_actions_workflow_name_post**](#objects_documents_actions_workflow_name_post) | **POST** `/objects/documents/actions/{workflow_name}` | Initiate Document Workflow
[**objects_documents_annotations_batch_delete**](#objects_documents_annotations_batch_delete) | **DELETE** `/objects/documents/annotations/batch` | Delete Annotations
[**objects_documents_annotations_batch_post**](#objects_documents_annotations_batch_post) | **POST** `/objects/documents/annotations/batch` | Create Multiple Annotations
[**objects_documents_annotations_batch_put**](#objects_documents_annotations_batch_put) | **PUT** `/objects/documents/annotations/batch` | Update Annotations
[**objects_documents_annotations_replies_batch_post**](#objects_documents_annotations_replies_batch_post) | **POST** `/objects/documents/annotations/replies/batch` | Add Annotation Replies
[**objects_documents_attachments_batch_delete**](#objects_documents_attachments_batch_delete) | **DELETE** `/objects/documents/attachments/batch` | Delete Multiple Document Attachments
[**objects_documents_attachments_batch_post**](#objects_documents_attachments_batch_post) | **POST** `/objects/documents/attachments/batch` | Create Multiple Document Attachments
[**objects_documents_attachments_batch_put**](#objects_documents_attachments_batch_put) | **PUT** `/objects/documents/attachments/batch` | Update Multiple Document Attachment Descriptions
[**objects_documents_batch_actions_fileextract_job_id_results_get**](#objects_documents_batch_actions_fileextract_job_id_results_get) | **GET** `/objects/documents/batch/actions/fileextract/{job_id}/results` | Retrieve Document Export Results
[**objects_documents_batch_actions_fileextract_post**](#objects_documents_batch_actions_fileextract_post) | **POST** `/objects/documents/batch/actions/fileextract` | Export Documents
[**objects_documents_batch_actions_reclassify_put**](#objects_documents_batch_actions_reclassify_put) | **PUT** `/objects/documents/batch/actions/reclassify` | Reclassify Multiple Documents
[**objects_documents_batch_actions_rerender_post**](#objects_documents_batch_actions_rerender_post) | **POST** `/objects/documents/batch/actions/rerender` | Update Multiple Document Renditions
[**objects_documents_batch_delete**](#objects_documents_batch_delete) | **DELETE** `/objects/documents/batch` | Delete Multiple Documents
[**objects_documents_batch_lock_delete**](#objects_documents_batch_lock_delete) | **DELETE** `/objects/documents/batch/lock` | Undo Collaborative Authoring Checkout
[**objects_documents_batch_post**](#objects_documents_batch_post) | **POST** `/objects/documents/batch` | Create Multiple Documents
[**objects_documents_batch_put**](#objects_documents_batch_put) | **PUT** `/objects/documents/batch` | Update Multiple Documents
[**objects_documents_doc_id_anchors_get**](#objects_documents_doc_id_anchors_get) | **GET** `/objects/documents/{doc_id}/anchors` | Retrieve Anchor IDs
[**objects_documents_doc_id_annotations_file_get**](#objects_documents_doc_id_annotations_file_get) | **GET** `/objects/documents/{doc_id}/annotations/file` | Export Document Annotations to PDF
[**objects_documents_doc_id_annotations_file_post**](#objects_documents_doc_id_annotations_file_post) | **POST** `/objects/documents/{doc_id}/annotations/file` | Import Document Annotations from PDF
[**objects_documents_doc_id_attachments_attachment_id_delete**](#objects_documents_doc_id_attachments_attachment_id_delete) | **DELETE** `/objects/documents/{doc_id}/attachments/{attachment_id}` | Delete Single Document Attachment
[**objects_documents_doc_id_attachments_attachment_id_file_get**](#objects_documents_doc_id_attachments_attachment_id_file_get) | **GET** `/objects/documents/{doc_id}/attachments/{attachment_id}/file` | Download Document Attachment
[**objects_documents_doc_id_attachments_attachment_id_get**](#objects_documents_doc_id_attachments_attachment_id_get) | **GET** `/objects/documents/{doc_id}/attachments/{attachment_id}` | Retrieve Document Attachment Metadata
[**objects_documents_doc_id_attachments_attachment_id_put**](#objects_documents_doc_id_attachments_attachment_id_put) | **PUT** `/objects/documents/{doc_id}/attachments/{attachment_id}` | Update Document Attachment Description
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete**](#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete) | **DELETE** `/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}` | Delete Single Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get**](#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get) | **GET** `/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file` | Download Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get**](#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get) | **GET** `/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}` | Retrieve Document Attachment Version Metadata
[**objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post**](#objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post) | **POST** `/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}` | Restore Document Attachment Version
[**objects_documents_doc_id_attachments_attachment_id_versions_get**](#objects_documents_doc_id_attachments_attachment_id_versions_get) | **GET** `/objects/documents/{doc_id}/attachments/{attachment_id}/versions` | Retrieve Document Attachment Versions
[**objects_documents_doc_id_attachments_file_get**](#objects_documents_doc_id_attachments_file_get) | **GET** `/objects/documents/{doc_id}/attachments/file` | Download All Document Attachments
[**objects_documents_doc_id_attachments_get**](#objects_documents_doc_id_attachments_get) | **GET** `/objects/documents/{doc_id}/attachments` | Retrieve Document Attachments
[**objects_documents_doc_id_attachments_post**](#objects_documents_doc_id_attachments_post) | **POST** `/objects/documents/{doc_id}/attachments` | Create Document Attachment
[**objects_documents_doc_id_audittrail_get**](#objects_documents_doc_id_audittrail_get) | **GET** `/objects/documents/{doc_id}/audittrail` | Retrieve Complete Audit History for a Single Document
[**objects_documents_doc_id_delete**](#objects_documents_doc_id_delete) | **DELETE** `/objects/documents/{doc_id}` | Delete Single Document
[**objects_documents_doc_id_events_get**](#objects_documents_doc_id_events_get) | **GET** `/objects/documents/{doc_id}/events` | Retrieve Document Events
[**objects_documents_doc_id_file_get**](#objects_documents_doc_id_file_get) | **GET** `/objects/documents/{doc_id}/file` | Download Document File
[**objects_documents_doc_id_get**](#objects_documents_doc_id_get) | **GET** `/objects/documents/{doc_id}` | Retrieve Document
[**objects_documents_doc_id_lock_delete**](#objects_documents_doc_id_lock_delete) | **DELETE** `/objects/documents/{doc_id}/lock` | Delete Document Lock
[**objects_documents_doc_id_lock_get**](#objects_documents_doc_id_lock_get) | **GET** `/objects/documents/{doc_id}/lock` | Retrieve Document Lock
[**objects_documents_doc_id_lock_post**](#objects_documents_doc_id_lock_post) | **POST** `/objects/documents/{doc_id}/lock` | Create Document Lock
[**objects_documents_doc_id_major_version_minor_version_attachments_file_get**](#objects_documents_doc_id_major_version_minor_version_attachments_file_get) | **GET** `/objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file` | Download All Document Version Attachments
[**objects_documents_doc_id_post**](#objects_documents_doc_id_post) | **POST** `/objects/documents/{doc_id}` | Create Single Document Version
[**objects_documents_doc_id_put**](#objects_documents_doc_id_put) | **PUT** `/objects/documents/{doc_id}` | Update Single Document
[**objects_documents_doc_id_renditions_get**](#objects_documents_doc_id_renditions_get) | **GET** `/objects/documents/{doc_id}/renditions` | Retrieve Document Renditions
[**objects_documents_doc_id_renditions_rendition_type_delete**](#objects_documents_doc_id_renditions_rendition_type_delete) | **DELETE** `/objects/documents/{doc_id}/renditions/{rendition_type}` | Delete Single Document Rendition
[**objects_documents_doc_id_renditions_rendition_type_get**](#objects_documents_doc_id_renditions_rendition_type_get) | **GET** `/objects/documents/{doc_id}/renditions/{rendition_type}` | Download Document Rendition File
[**objects_documents_doc_id_renditions_rendition_type_post**](#objects_documents_doc_id_renditions_rendition_type_post) | **POST** `/objects/documents/{doc_id}/renditions/{rendition_type}` | Add Single Document Rendition
[**objects_documents_doc_id_renditions_rendition_type_put**](#objects_documents_doc_id_renditions_rendition_type_put) | **PUT** `/objects/documents/{doc_id}/renditions/{rendition_type}` | Replace Document Rendition
[**objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete**](#objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete) | **DELETE** `/objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id}` | Remove Users &amp; Groups from Roles on a Single Document
[**objects_documents_doc_id_version_major_version_minor_version_attachments_get**](#objects_documents_doc_id_version_major_version_minor_version_attachments_get) | **GET** `/objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments` | Retrieve Document Version Attachments
[**objects_documents_doc_id_versions_get**](#objects_documents_doc_id_versions_get) | **GET** `/objects/documents/{doc_id}/versions` | Retrieve Document Versions
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get**](#objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}` | Read Annotations by ID
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get**](#objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies` | Read Replies of Parent Annotation
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get**](#objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file` | Export Document Version Annotations to PDF
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post**](#objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post) | **POST** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file` | Import Document Version Annotations from PDF
[**objects_documents_doc_id_versions_major_version_minor_version_annotations_get**](#objects_documents_doc_id_versions_major_version_minor_version_annotations_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations` | Read Annotations by Document Version and Type
[**objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get**](#objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file` | Download Document Version Attachment Version
[**objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get**](#objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}` | Retrieve Document Version Attachment Versions
[**objects_documents_doc_id_versions_major_version_minor_version_delete**](#objects_documents_doc_id_versions_major_version_minor_version_delete) | **DELETE** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}` | Delete Single Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get**](#objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv` | Retrieve Document Version Notes as CSV
[**objects_documents_doc_id_versions_major_version_minor_version_events_post**](#objects_documents_doc_id_versions_major_version_minor_version_events_post) | **POST** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events` | Create Document Event
[**objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get**](#objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations` | Retrieve Video Annotations
[**objects_documents_doc_id_versions_major_version_minor_version_file_get**](#objects_documents_doc_id_versions_major_version_minor_version_file_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file` | Download Document Version File
[**objects_documents_doc_id_versions_major_version_minor_version_get**](#objects_documents_doc_id_versions_major_version_minor_version_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}` | Retrieve Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_put**](#objects_documents_doc_id_versions_major_version_minor_version_put) | **PUT** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}` | Update Document Version
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_get**](#objects_documents_doc_id_versions_major_version_minor_version_relationships_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships` | Retrieve Document Relationships
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_post**](#objects_documents_doc_id_versions_major_version_minor_version_relationships_post) | **POST** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships` | Create Single Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete**](#objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete) | **DELETE** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}` | Delete Single Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get**](#objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}` | Retrieve Document Relationship
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_get**](#objects_documents_doc_id_versions_major_version_minor_version_renditions_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions` | Retrieve Document Version Renditions
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete**](#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete) | **DELETE** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}` | Delete Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get**](#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}` | Download Document Version Rendition File
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post**](#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post) | **POST** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}` | Upload Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put**](#objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put) | **PUT** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}` | Replace Document Version Rendition
[**objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get**](#objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get) | **GET** `/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail` | Download Document Version Thumbnail File
[**objects_documents_get**](#objects_documents_get) | **GET** `/objects/documents` | Retrieve All Documents
[**objects_documents_id_roles_get**](#objects_documents_id_roles_get) | **GET** `/objects/documents/{id}/roles` | Retrieve All Document Roles
[**objects_documents_id_roles_post**](#objects_documents_id_roles_post) | **POST** `/objects/documents/{id}/roles` | Assign Users &amp; Groups to Roles on a Single Document
[**objects_documents_id_roles_role_name_get**](#objects_documents_id_roles_role_name_get) | **GET** `/objects/documents/{id}/roles/{role_name}` | Retrieve Document Role
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get**](#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get) | **GET** `/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions` | Retrieve Document User Actions
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**](#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get) | **GET** `/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements` | Retrieve Document Entry Criteria
[**objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**](#objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put) | **PUT** `/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}` | Initiate Document User Action
[**objects_documents_lifecycle_actions_post**](#objects_documents_lifecycle_actions_post) | **POST** `/objects/documents/lifecycle_actions` | Retrieve User Actions on Multiple Documents
[**objects_documents_lifecycle_actions_user_action_name_put**](#objects_documents_lifecycle_actions_user_action_name_put) | **PUT** `/objects/documents/lifecycle_actions/{user_action_name}` | Initiate Bulk Document User Actions
[**objects_documents_post**](#objects_documents_post) | **POST** `/objects/documents` | Create Single Document
[**objects_documents_relationships_batch_delete**](#objects_documents_relationships_batch_delete) | **DELETE** `/objects/documents/relationships/batch` | Delete Multiple Document Relationships
[**objects_documents_relationships_batch_post**](#objects_documents_relationships_batch_post) | **POST** `/objects/documents/relationships/batch` | Create Multiple Document Relationships
[**objects_documents_renditions_batch_delete**](#objects_documents_renditions_batch_delete) | **DELETE** `/objects/documents/renditions/batch` | Delete Multiple Document Renditions
[**objects_documents_renditions_batch_post**](#objects_documents_renditions_batch_post) | **POST** `/objects/documents/renditions/batch` | Add Multiple Document Renditions
[**objects_documents_roles_batch_delete**](#objects_documents_roles_batch_delete) | **DELETE** `/objects/documents/roles/batch` | Remove Users and Groups from Roles on Multiple Documents &amp; Binders
[**objects_documents_roles_batch_post**](#objects_documents_roles_batch_post) | **POST** `/objects/documents/roles/batch` | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
[**objects_documents_templates_get**](#objects_documents_templates_get) | **GET** `/objects/documents/templates` | Retrieve Document Template Collection
[**objects_documents_templates_post**](#objects_documents_templates_post) | **POST** `/objects/documents/templates` | Create Single Document Template
[**objects_documents_templates_put**](#objects_documents_templates_put) | **PUT** `/objects/documents/templates` | Update Multiple Document Templates
[**objects_documents_templates_template_name_delete**](#objects_documents_templates_template_name_delete) | **DELETE** `/objects/documents/templates/{template_name}` | Delete Basic Document Template
[**objects_documents_templates_template_name_file_get**](#objects_documents_templates_template_name_file_get) | **GET** `/objects/documents/templates/{template_name}/file` | Download Document Template File
[**objects_documents_templates_template_name_get**](#objects_documents_templates_template_name_get) | **GET** `/objects/documents/templates/{template_name}` | Retrieve Document Template Attributes
[**objects_documents_templates_template_name_put**](#objects_documents_templates_template_name_put) | **PUT** `/objects/documents/templates/{template_name}` | Update Single Document Template
[**objects_documents_tokens_post**](#objects_documents_tokens_post) | **POST** `/objects/documents/tokens` | Document Tokens
[**objects_documents_versions_batch_actions_fileextract_post**](#objects_documents_versions_batch_actions_fileextract_post) | **POST** `/objects/documents/versions/batch/actions/fileextract` | Export Document Versions
[**objects_documents_versions_batch_delete**](#objects_documents_versions_batch_delete) | **DELETE** `/objects/documents/versions/batch` | Delete Multiple Document Versions
[**objects_documents_versions_batch_post**](#objects_documents_versions_batch_post) | **POST** `/objects/documents/versions/batch` | Create Multiple Document Versions
[**objects_domain_get**](#objects_domain_get) | **GET** `/objects/domain` | Retrieve Domain Information
[**objects_domains_get**](#objects_domains_get) | **GET** `/objects/domains` | Retrieve Domains
[**objects_edl_matched_documents_batch_actions_add_post**](#objects_edl_matched_documents_batch_actions_add_post) | **POST** `/objects/edl_matched_documents/batch/actions/add` | Add EDL Matched Documents
[**objects_edl_matched_documents_batch_actions_remove_post**](#objects_edl_matched_documents_batch_actions_remove_post) | **POST** `/objects/edl_matched_documents/batch/actions/remove` | Remove EDL Matched Documents
[**objects_groups_auto_get**](#objects_groups_auto_get) | **GET** `/objects/groups/auto` | Retrieve Auto Managed Groups
[**objects_groups_get**](#objects_groups_get) | **GET** `/objects/groups` | Retrieve All Groups
[**objects_groups_group_id_delete**](#objects_groups_group_id_delete) | **DELETE** `/objects/groups/{group_id}` | Delete Group
[**objects_groups_group_id_get**](#objects_groups_group_id_get) | **GET** `/objects/groups/{group_id}` | Retrieve Group
[**objects_groups_group_id_put**](#objects_groups_group_id_put) | **PUT** `/objects/groups/{group_id}` | Update Group
[**objects_groups_post**](#objects_groups_post) | **POST** `/objects/groups` | Create Group 
[**objects_licenses_get**](#objects_licenses_get) | **GET** `/objects/licenses` | Retrieve Application License Usage
[**objects_objectworkflows_actions_get**](#objects_objectworkflows_actions_get) | **GET** `/objects/objectworkflows/actions` | Retrieve All Multi-Record Workflows
[**objects_objectworkflows_actions_workflow_name_get**](#objects_objectworkflows_actions_workflow_name_get) | **GET** `/objects/objectworkflows/actions/{workflow_name}` | Retrieve Multi-Record Workflow Details
[**objects_objectworkflows_actions_workflow_name_post**](#objects_objectworkflows_actions_workflow_name_post) | **POST** `/objects/objectworkflows/actions/{workflow_name}` | Initiate Multi-Record Workflow
[**objects_objectworkflows_get**](#objects_objectworkflows_get) | **GET** `/objects/objectworkflows` | Retrieve Workflows
[**objects_objectworkflows_tasks_get**](#objects_objectworkflows_tasks_get) | **GET** `/objects/objectworkflows/tasks` | Retrieve Workflow Tasks
[**objects_objectworkflows_tasks_task_id_actions_accept_post**](#objects_objectworkflows_tasks_task_id_actions_accept_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/accept` | Accept Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_cancel_post**](#objects_objectworkflows_tasks_task_id_actions_cancel_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/cancel` | Cancel Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_complete_post**](#objects_objectworkflows_tasks_task_id_actions_complete_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/complete` | Complete Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_get**](#objects_objectworkflows_tasks_task_id_actions_get) | **GET** `/objects/objectworkflows/tasks/{task_id}/actions` | Retrieve Workflow Task Actions
[**objects_objectworkflows_tasks_task_id_actions_mdwaccept_post**](#objects_objectworkflows_tasks_task_id_actions_mdwaccept_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/mdwaccept` | Accept Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post**](#objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete` | Complete Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post**](#objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent` | Manage Multi-Item Workflow Content
[**objects_objectworkflows_tasks_task_id_actions_mdwreassign_post**](#objects_objectworkflows_tasks_task_id_actions_mdwreassign_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/mdwreassign` | Reassign Multi-item Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_reassign_post**](#objects_objectworkflows_tasks_task_id_actions_reassign_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/reassign` | Reassign Single Record Workflow Task
[**objects_objectworkflows_tasks_task_id_actions_task_action_get**](#objects_objectworkflows_tasks_task_id_actions_task_action_get) | **GET** `/objects/objectworkflows/tasks/{task_id}/actions/{task_action}` | Retrieve Workflow Task Action Details
[**objects_objectworkflows_tasks_task_id_actions_undoaccept_post**](#objects_objectworkflows_tasks_task_id_actions_undoaccept_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/undoaccept` | Undo Workflow Task Acceptance
[**objects_objectworkflows_tasks_task_id_actions_updateduedate_post**](#objects_objectworkflows_tasks_task_id_actions_updateduedate_post) | **POST** `/objects/objectworkflows/tasks/{task_id}/actions/updateduedate` | Update Workflow Task Due Date
[**objects_objectworkflows_tasks_task_id_get**](#objects_objectworkflows_tasks_task_id_get) | **GET** `/objects/objectworkflows/tasks/{task_id}` | Retrieve Workflow Task Details
[**objects_objectworkflows_workflow_id_actions_get**](#objects_objectworkflows_workflow_id_actions_get) | **GET** `/objects/objectworkflows/{workflow_id}/actions` | Retrieve Workflow Actions
[**objects_objectworkflows_workflow_id_actions_workflow_action_get**](#objects_objectworkflows_workflow_id_actions_workflow_action_get) | **GET** `/objects/objectworkflows/{workflow_id}/actions/{workflow_action}` | Retrieve Workflow Action Details
[**objects_objectworkflows_workflow_id_actions_workflow_action_post**](#objects_objectworkflows_workflow_id_actions_workflow_action_post) | **POST** `/objects/objectworkflows/{workflow_id}/actions/{workflow_action}` | Initiate Workflow Action
[**objects_objectworkflows_workflow_id_get**](#objects_objectworkflows_workflow_id_get) | **GET** `/objects/objectworkflows/{workflow_id}` | Retrieve Workflow Details
[**objects_picklists_get**](#objects_picklists_get) | **GET** `/objects/picklists` | Retrieve All Picklists
[**objects_picklists_picklist_name_get**](#objects_picklists_picklist_name_get) | **GET** `/objects/picklists/{picklist_name}` | Retrieve Picklist Values
[**objects_picklists_picklist_name_picklist_value_name_delete**](#objects_picklists_picklist_name_picklist_value_name_delete) | **DELETE** `/objects/picklists/{picklist_name}/{picklist_value_name}` | Inactivate Picklist Value
[**objects_picklists_picklist_name_picklist_value_name_put**](#objects_picklists_picklist_name_picklist_value_name_put) | **PUT** `/objects/picklists/{picklist_name}/{picklist_value_name}` | Update Picklist Value
[**objects_picklists_picklist_name_post**](#objects_picklists_picklist_name_post) | **POST** `/objects/picklists/{picklist_name}` | Create Picklist Values
[**objects_picklists_picklist_name_put**](#objects_picklists_picklist_name_put) | **PUT** `/objects/picklists/{picklist_name}` | Update Picklist Value Label
[**objects_sandbox_actions_buildproduction_post**](#objects_sandbox_actions_buildproduction_post) | **POST** `/objects/sandbox/actions/buildproduction` | Build Production Vault
[**objects_sandbox_actions_promoteproduction_post**](#objects_sandbox_actions_promoteproduction_post) | **POST** `/objects/sandbox/actions/promoteproduction` | Promote to Production
[**objects_sandbox_actions_recheckusage_post**](#objects_sandbox_actions_recheckusage_post) | **POST** `/objects/sandbox/actions/recheckusage` | Recheck Sandbox Usage Limit
[**objects_sandbox_batch_changesize_post**](#objects_sandbox_batch_changesize_post) | **POST** `/objects/sandbox/batch/changesize` | Change Sandbox Size
[**objects_sandbox_entitlements_set_post**](#objects_sandbox_entitlements_set_post) | **POST** `/objects/sandbox/entitlements/set` | Set Sandbox Entitlements
[**objects_sandbox_get**](#objects_sandbox_get) | **GET** `/objects/sandbox` | Retrieve Sandboxes
[**objects_sandbox_name_delete**](#objects_sandbox_name_delete) | **DELETE** `/objects/sandbox/{name}` | Delete Sandbox
[**objects_sandbox_post**](#objects_sandbox_post) | **POST** `/objects/sandbox` | Create or Refresh Sandbox
[**objects_sandbox_snapshot_api_name_actions_update_post**](#objects_sandbox_snapshot_api_name_actions_update_post) | **POST** `/objects/sandbox/snapshot/{api_name}/actions/update` | Update Sandbox Snapshot
[**objects_sandbox_snapshot_api_name_actions_upgrade_post**](#objects_sandbox_snapshot_api_name_actions_upgrade_post) | **POST** `/objects/sandbox/snapshot/{api_name}/actions/upgrade` | Upgrade Sandbox Snapshot
[**objects_sandbox_snapshot_api_name_delete**](#objects_sandbox_snapshot_api_name_delete) | **DELETE** `/objects/sandbox/snapshot/{api_name}` | Delete Sandbox Snapshot
[**objects_sandbox_snapshot_get**](#objects_sandbox_snapshot_get) | **GET** `/objects/sandbox/snapshot` | Retrieve Sandbox Snapshots
[**objects_sandbox_snapshot_post**](#objects_sandbox_snapshot_post) | **POST** `/objects/sandbox/snapshot` | Create Sandbox Snapshot
[**objects_sandbox_vault_id_actions_refresh_post**](#objects_sandbox_vault_id_actions_refresh_post) | **POST** `/objects/sandbox/{vault_id}/actions/refresh` | Refresh Sandbox from Snapshot
[**objects_sandbox_vault_id_get**](#objects_sandbox_vault_id_get) | **GET** `/objects/sandbox/{vault_id}` | Retrieve Sandbox Details by ID
[**objects_securitypolicies_get**](#objects_securitypolicies_get) | **GET** `/objects/securitypolicies` | Retrieve All Security Policies
[**objects_securitypolicies_security_policy_name_get**](#objects_securitypolicies_security_policy_name_get) | **GET** `/objects/securitypolicies/{security_policy_name}` | Retrieve Security Policy
[**objects_users_get**](#objects_users_get) | **GET** `/objects/users/` | Retrieve All Users
[**objects_users_id_get**](#objects_users_id_get) | **GET** `/objects/users/{id}` | Retrieve User
[**objects_users_id_permissions_get**](#objects_users_id_permissions_get) | **GET** `/objects/users/{id}/permissions` | Retrieve User Permissions
[**objects_users_id_put**](#objects_users_id_put) | **PUT** `/objects/users/{id}` | Update Single User
[**objects_users_me_get**](#objects_users_me_get) | **GET** `/objects/users/me` | Validate Session User
[**objects_users_me_password_post**](#objects_users_me_password_post) | **POST** `/objects/users/me/password` | Change My Password
[**objects_users_me_permissions_get**](#objects_users_me_permissions_get) | **GET** `/objects/users/me/permissions` | Retrieve My User Permissions
[**objects_users_me_put**](#objects_users_me_put) | **PUT** `/objects/users/me` | Update My User
[**objects_users_post**](#objects_users_post) | **POST** `/objects/users` | Create Single User
[**objects_users_put**](#objects_users_put) | **PUT** `/objects/users` | Update Multiple Users
[**objects_users_user_id_delete**](#objects_users_user_id_delete) | **DELETE** `/objects/users/{user_id}` | Disable User
[**objects_users_user_id_vault_membership_vault_id_put**](#objects_users_user_id_vault_membership_vault_id_put) | **PUT** `/objects/users/{user_id}/vault_membership/{vault_id}` | Update Vault Membership
[**objects_vault_actions_compare_post**](#objects_vault_actions_compare_post) | **POST** `/objects/vault/actions/compare` | Vault Compare
[**objects_vault_actions_configreport_post**](#objects_vault_actions_configreport_post) | **POST** `/objects/vault/actions/configreport` | Vault Configuration Report
[**query_components_post**](#query_components_post) | **POST** `/query/components` | Component Definition Query
[**query_next_page_post**](#query_next_page_post) | **POST** `/query/{next_page}` | Next Page URL
[**query_post**](#query_post) | **POST** `/query` | Submitting a Query
[**query_previous_page_post**](#query_previous_page_post) | **POST** `/query/{previous_page}` | Previous Page URL
[**scim_v2_me_get**](#scim_v2_me_get) | **GET** `/scim/v2/Me` | Retrieve Current User with SCIM
[**scim_v2_me_put**](#scim_v2_me_put) | **PUT** `/scim/v2/Me` | Update Current User with SCIM
[**scim_v2_resource_types_get**](#scim_v2_resource_types_get) | **GET** `/scim/v2/ResourceTypes` | Retrieve All SCIM Resource Types
[**scim_v2_resource_types_type_get**](#scim_v2_resource_types_type_get) | **GET** `/scim/v2/ResourceTypes/{type}` | Retrieve Single SCIM Resource Type
[**scim_v2_schemas_get**](#scim_v2_schemas_get) | **GET** `/scim/v2/Schemas` | Retrieve All SCIM Schema Information
[**scim_v2_schemas_id_get**](#scim_v2_schemas_id_get) | **GET** `/scim/v2/Schemas/{id}` | Retrieve Single SCIM Schema Information
[**scim_v2_service_provider_config_get**](#scim_v2_service_provider_config_get) | **GET** `/scim/v2/ServiceProviderConfig` | Retrieve SCIM Provider
[**scim_v2_type_get**](#scim_v2_type_get) | **GET** `/scim/v2/{type}` | Retrieve SCIM Resources
[**scim_v2_type_id_get**](#scim_v2_type_id_get) | **GET** `/scim/v2/{type}/{id}` | Retrieve Single SCIM Resource
[**scim_v2_users_get**](#scim_v2_users_get) | **GET** `/scim/v2/Users` | Retrieve All Users with SCIM
[**scim_v2_users_id_get**](#scim_v2_users_id_get) | **GET** `/scim/v2/Users/{id}` | Retrieve Single User with SCIM
[**scim_v2_users_id_put**](#scim_v2_users_id_put) | **PUT** `/scim/v2/Users/{id}` | Update User with SCIM
[**scim_v2_users_post**](#scim_v2_users_post) | **POST** `/scim/v2/Users` | Create User with SCIM
[**services_certificate_cert_id_get**](#services_certificate_cert_id_get) | **GET** `/services/certificate/{cert_id}` | Retrieve Signing Certificate
[**services_configuration_mode_actions_disable_post**](#services_configuration_mode_actions_disable_post) | **POST** `/services/configuration_mode/actions/disable` | Disable Configuration Mode
[**services_configuration_mode_actions_enable_post**](#services_configuration_mode_actions_enable_post) | **POST** `/services/configuration_mode/actions/enable` | Enable Configuration Mode
[**services_directdata_files_get**](#services_directdata_files_get) | **GET** `/services/directdata/files` | Retrieve Available Direct Data Files
[**services_directdata_files_name_get**](#services_directdata_files_name_get) | **GET** `/services/directdata/files/{name}` | Download Direct Data File
[**services_file_staging_items_content_item_get**](#services_file_staging_items_content_item_get) | **GET** `/services/file_staging/items/content/{item}` | Download Item Content
[**services_file_staging_items_item_delete**](#services_file_staging_items_item_delete) | **DELETE** `/services/file_staging/items/{item}` | Delete File or Folder
[**services_file_staging_items_item_get**](#services_file_staging_items_item_get) | **GET** `/services/file_staging/items/{item}` | List Items at a Path
[**services_file_staging_items_item_put**](#services_file_staging_items_item_put) | **PUT** `/services/file_staging/items/{item}` | Update Folder or File
[**services_file_staging_items_post**](#services_file_staging_items_post) | **POST** `/services/file_staging/items` | Create Folder or File
[**services_file_staging_upload_get**](#services_file_staging_upload_get) | **GET** `/services/file_staging/upload/` | List Upload Sessions
[**services_file_staging_upload_post**](#services_file_staging_upload_post) | **POST** `/services/file_staging/upload` | Create Resumable Upload Session
[**services_file_staging_upload_upload_session_id_delete**](#services_file_staging_upload_upload_session_id_delete) | **DELETE** `/services/file_staging/upload/{upload_session_id}` | Abort Upload Session
[**services_file_staging_upload_upload_session_id_get**](#services_file_staging_upload_upload_session_id_get) | **GET** `/services/file_staging/upload/{upload_session_id}` | Get Upload Session Details
[**services_file_staging_upload_upload_session_id_parts_get**](#services_file_staging_upload_upload_session_id_parts_get) | **GET** `/services/file_staging/upload/{upload_session_id}/parts` | List File Parts Uploaded to Session
[**services_file_staging_upload_upload_session_id_post**](#services_file_staging_upload_upload_session_id_post) | **POST** `/services/file_staging/upload/{upload_session_id}` | Commit Upload Session
[**services_file_staging_upload_upload_session_id_put**](#services_file_staging_upload_upload_session_id_put) | **PUT** `/services/file_staging/upload/{upload_session_id}` | Upload to a Session
[**services_jobs_histories_get**](#services_jobs_histories_get) | **GET** `/services/jobs/histories` | Retrieve Job Histories
[**services_jobs_job_id_errors_get**](#services_jobs_job_id_errors_get) | **GET** `/services/jobs/{job_id}/errors` | Retrieve Import Bulk Translation File Job Errors
[**services_jobs_job_id_get**](#services_jobs_job_id_get) | **GET** `/services/jobs/{job_id}` | Retrieve Job Status
[**services_jobs_job_id_summary_get**](#services_jobs_job_id_summary_get) | **GET** `/services/jobs/{job_id}/summary` | Retrieve Import Bulk Translation File Job Summary
[**services_jobs_job_id_tasks_get**](#services_jobs_job_id_tasks_get) | **GET** `/services/jobs/{job_id}/tasks` | Retrieve SDK Job Tasks
[**services_jobs_monitors_get**](#services_jobs_monitors_get) | **GET** `/services/jobs/monitors` | Retrieve Job Monitors
[**services_jobs_start_now_job_id_post**](#services_jobs_start_now_job_id_post) | **POST** `/services/jobs/start_now/{job_id}` | Start Job
[**services_loader_extract_post**](#services_loader_extract_post) | **POST** `/services/loader/extract` | Extract Data Files
[**services_loader_job_id_tasks_task_id_failurelog_get**](#services_loader_job_id_tasks_task_id_failurelog_get) | **GET** `/services/loader/{job_id}/tasks/{task_id}/failurelog` | Retrieve Load Failure Log Results
[**services_loader_job_id_tasks_task_id_results_get**](#services_loader_job_id_tasks_task_id_results_get) | **GET** `/services/loader/{job_id}/tasks/{task_id}/results` | Retrieve Loader Extract Results
[**services_loader_job_id_tasks_task_id_results_renditions_get**](#services_loader_job_id_tasks_task_id_results_renditions_get) | **GET** `/services/loader/{job_id}/tasks/{task_id}/results/renditions` | Retrieve Loader Extract Renditions Results
[**services_loader_job_id_tasks_task_id_successlog_get**](#services_loader_job_id_tasks_task_id_successlog_get) | **GET** `/services/loader/{job_id}/tasks/{task_id}/successlog` | Retrieve Load Success Log Results
[**services_loader_load_post**](#services_loader_load_post) | **POST** `/services/loader/load` | Load Data Objects
[**services_package_actions_validate_post**](#services_package_actions_validate_post) | **POST** `/services/package/actions/validate` | Validate Package
[**services_package_post**](#services_package_post) | **POST** `/services/package` | Export Package
[**services_package_put**](#services_package_put) | **PUT** `/services/package` | Import Package
[**services_queues_get**](#services_queues_get) | **GET** `/services/queues` | Retrieve All Queues
[**services_queues_queue_name_actions_disable_delivery_put**](#services_queues_queue_name_actions_disable_delivery_put) | **PUT** `/services/queues/{queue_name}/actions/disable_delivery` | Disable Delivery
[**services_queues_queue_name_actions_enable_delivery_put**](#services_queues_queue_name_actions_enable_delivery_put) | **PUT** `/services/queues/{queue_name}/actions/enable_delivery` | Enable Delivery
[**services_queues_queue_name_actions_reset_put**](#services_queues_queue_name_actions_reset_put) | **PUT** `/services/queues/{queue_name}/actions/reset` | Reset Queue
[**services_queues_queue_name_get**](#services_queues_queue_name_get) | **GET** `/services/queues/{queue_name}` | Retrieve Queue Status
[**services_vobject_vault_package_v_package_id_actions_validate_post**](#services_vobject_vault_package_v_package_id_actions_validate_post) | **POST** `/services/vobject/vault_package__v/{package_id}/actions/validate` | Validate Imported Package
[**session_delete**](#session_delete) | **DELETE** `/session` | End Session
[**uicode_distributions_distribution_name_code_get**](#uicode_distributions_distribution_name_code_get) | **GET** `/uicode/distributions/{distribution_name}/code` | Download Single Client Code Distribution
[**uicode_distributions_distribution_name_delete**](#uicode_distributions_distribution_name_delete) | **DELETE** `/uicode/distributions/{distribution_name}` | Delete Single Client Code Distribution
[**uicode_distributions_distribution_name_get**](#uicode_distributions_distribution_name_get) | **GET** `/uicode/distributions/{distribution_name}` | Retrieve Single Client Code Distribution Metadata
[**uicode_distributions_get**](#uicode_distributions_get) | **GET** `/uicode/distributions` | Retrieve All Client Code Distribution Metadata
[**uicode_distributions_post**](#uicode_distributions_post) | **POST** `/uicode/distributions` | Add or Replace Single Client Code Distribution
[**vobject_vault_package_v_package_id_actions_deploy_post**](#vobject_vault_package_v_package_id_actions_deploy_post) | **POST** `/vobject/vault_package__v/{package_id}/actions/deploy` | Deploy Package
[**vobject_vault_package_v_package_id_actions_deploy_results_get**](#vobject_vault_package_v_package_id_actions_deploy_results_get) | **GET** `/vobject/vault_package__v/{package_id}/actions/deploy/results` | Retrieve Package Deploy Results
[**vobjects_cascadedelete_results_object_name_job_status_job_id_get**](#vobjects_cascadedelete_results_object_name_job_status_job_id_get) | **GET** `/vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id}` | Retrieve Results of Cascade Delete Job
[**vobjects_deepcopy_results_object_name_job_status_job_id_get**](#vobjects_deepcopy_results_object_name_job_status_job_id_get) | **GET** `/vobjects/deepcopy/results/{object_name}/{job_status}/{job_id}` | Retrieve Results of Deep Copy Job
[**vobjects_edl_item_v_actions_createplaceholder_post**](#vobjects_edl_item_v_actions_createplaceholder_post) | **POST** `/vobjects/edl_item__v/actions/createplaceholder` | Create a Placeholder from an EDL Item
[**vobjects_merges_job_id_log_get**](#vobjects_merges_job_id_log_get) | **GET** `/vobjects/merges/{job_id}/log` | Download Merge Records Job Log
[**vobjects_merges_job_id_results_get**](#vobjects_merges_job_id_results_get) | **GET** `/vobjects/merges/{job_id}/results` | Retrieve Record Merge Results
[**vobjects_merges_job_id_status_get**](#vobjects_merges_job_id_status_get) | **GET** `/vobjects/merges/{job_id}/status` | Retrieve Record Merge Status
[**vobjects_object_name_actions_action_name_post**](#vobjects_object_name_actions_action_name_post) | **POST** `/vobjects/{object_name}/actions/{action_name}` | Initiate Object Action on Multiple Records
[**vobjects_object_name_actions_changetype_post**](#vobjects_object_name_actions_changetype_post) | **POST** `/vobjects/{object_name}/actions/changetype` | Change Object Type
[**vobjects_object_name_actions_merge_post**](#vobjects_object_name_actions_merge_post) | **POST** `/vobjects/{object_name}/actions/merge` | Initiate Record Merge
[**vobjects_object_name_actions_recalculaterollups_get**](#vobjects_object_name_actions_recalculaterollups_get) | **GET** `/vobjects/{object_name}/actions/recalculaterollups` | Retrieve Roll-up Field Recalculation Status
[**vobjects_object_name_actions_recalculaterollups_post**](#vobjects_object_name_actions_recalculaterollups_post) | **POST** `/vobjects/{object_name}/actions/recalculaterollups` | Recalculate Roll-up Fields
[**vobjects_object_name_actions_updatecorporatecurrency_put**](#vobjects_object_name_actions_updatecorporatecurrency_put) | **PUT** `/vobjects/{object_name}/actions/updatecorporatecurrency` | Update Corporate Currency Fields
[**vobjects_object_name_attachments_batch_delete**](#vobjects_object_name_attachments_batch_delete) | **DELETE** `/vobjects/{object_name}/attachments/batch` | Delete Multiple Object Record Attachments
[**vobjects_object_name_attachments_batch_post**](#vobjects_object_name_attachments_batch_post) | **POST** `/vobjects/{object_name}/attachments/batch` | Create Multiple Object Record Attachments
[**vobjects_object_name_attachments_batch_put**](#vobjects_object_name_attachments_batch_put) | **PUT** `/vobjects/{object_name}/attachments/batch` | Update Multiple Object Record Attachment Descriptions
[**vobjects_object_name_delete**](#vobjects_object_name_delete) | **DELETE** `/vobjects/{object_name}` | Delete Object Records
[**vobjects_object_name_id_roles_role_name_get**](#vobjects_object_name_id_roles_role_name_get) | **GET** `/vobjects/{object_name}/{id}/roles/{role_name}` | Retrieve Object Record Roles
[**vobjects_object_name_object_record_id_actions_action_name_get**](#vobjects_object_name_object_record_id_actions_action_name_get) | **GET** `/vobjects/{object_name}/{object_record_id}/actions/{action_name}` | Retrieve Object User Actions Details
[**vobjects_object_name_object_record_id_actions_action_name_post**](#vobjects_object_name_object_record_id_actions_action_name_post) | **POST** `/vobjects/{object_name}/{object_record_id}/actions/{action_name}` | Initiate Object Action on a Single Record
[**vobjects_object_name_object_record_id_actions_cascadedelete_post**](#vobjects_object_name_object_record_id_actions_cascadedelete_post) | **POST** `/vobjects/{object_name}/{object_record_id}/actions/cascadedelete` | Cascade Delete Object Record
[**vobjects_object_name_object_record_id_actions_deepcopy_post**](#vobjects_object_name_object_record_id_actions_deepcopy_post) | **POST** `/vobjects/{object_name}/{object_record_id}/actions/deepcopy` | Deep Copy Object Record
[**vobjects_object_name_object_record_id_actions_get**](#vobjects_object_name_object_record_id_actions_get) | **GET** `/vobjects/{object_name}/{object_record_id}/actions` | Retrieve Object Record User Actions
[**vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get**](#vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file` | Download Attachment Field File
[**vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post**](#vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post) | **POST** `/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file` | Update Attachment Field File
[**vobjects_object_name_object_record_id_attachment_fields_file_get**](#vobjects_object_name_object_record_id_attachment_fields_file_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachment_fields/file` | Download All Attachment Field Files
[**vobjects_object_name_object_record_id_attachments_attachment_id_delete**](#vobjects_object_name_object_record_id_attachments_attachment_id_delete) | **DELETE** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}` | Delete Object Record Attachment
[**vobjects_object_name_object_record_id_attachments_attachment_id_get**](#vobjects_object_name_object_record_id_attachments_attachment_id_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}` | Retrieve Object Record Attachment Metadata
[**vobjects_object_name_object_record_id_attachments_attachment_id_put**](#vobjects_object_name_object_record_id_attachments_attachment_id_put) | **PUT** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}` | Update Object Record Attachment Description
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete**](#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete) | **DELETE** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}` | Delete Object Record Attachment Version
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get**](#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file` | Download Object Record Attachment File
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get**](#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}` | Retrieve Object Record Attachment Version Metadata
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post**](#vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post) | **POST** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}` | Restore Object Record Attachment Version
[**vobjects_object_name_object_record_id_attachments_attachment_id_versions_get**](#vobjects_object_name_object_record_id_attachments_attachment_id_versions_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions` | Retrieve Object Record Attachment Versions
[**vobjects_object_name_object_record_id_attachments_file_get**](#vobjects_object_name_object_record_id_attachments_file_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachments/file` | Download All Object Record Attachment Files
[**vobjects_object_name_object_record_id_attachments_get**](#vobjects_object_name_object_record_id_attachments_get) | **GET** `/vobjects/{object_name}/{object_record_id}/attachments` | Retrieve Object Record Attachments
[**vobjects_object_name_object_record_id_attachments_post**](#vobjects_object_name_object_record_id_attachments_post) | **POST** `/vobjects/{object_name}/{object_record_id}/attachments` | Create Object Record Attachment
[**vobjects_object_name_object_record_id_audittrail_get**](#vobjects_object_name_object_record_id_audittrail_get) | **GET** `/vobjects/{object_name}/{object_record_id}/audittrail` | Retrieve Complete Audit History for a Single Object Record
[**vobjects_object_name_object_record_id_get**](#vobjects_object_name_object_record_id_get) | **GET** `/vobjects/{object_name}/{object_record_id}` | Retrieve Object Record
[**vobjects_object_name_post**](#vobjects_object_name_post) | **POST** `/vobjects/{object_name}` | Create &amp; Upsert Object Records
[**vobjects_object_name_put**](#vobjects_object_name_put) | **PUT** `/vobjects/{object_name}` | Update Object Records
[**vobjects_object_name_roles_delete**](#vobjects_object_name_roles_delete) | **DELETE** `/vobjects/{object_name}/roles` | Remove Users &amp; Groups from Roles on Object Records
[**vobjects_object_name_roles_post**](#vobjects_object_name_roles_post) | **POST** `/vobjects/{object_name}/roles` | Assign Users &amp; Groups to Roles on Object Records
[**vobjects_outbound_package_v_package_id_dependencies_get**](#vobjects_outbound_package_v_package_id_dependencies_get) | **GET** `/vobjects/outbound_package__v/{package_id}/dependencies` | Retrieve Outbound Package Dependencies

# **api_get**   { #api_get }
<a name="api_get"></a>

> `api_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve API Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.api_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "api_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **api_mdl_components_component_type_and_record_name_files_get**   { #api_mdl_components_component_type_and_record_name_files_get }
<a name="api_mdl_components_component_type_and_record_name_files_get"></a>

> `api_mdl_components_component_type_and_record_name_files_get(componentTypeAndRecordName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Content File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.api_mdl_components_component_type_and_record_name_files_get(
	# componentTypeAndRecordName: String = ""   Eg: componentTypeAndRecordName_example
	# The component type of the record followed by the name of the record from which to retrieve the content file. The format is `{Componenttype}.{record_name}`. For example, `Formattedoutput.my_formatted_output__c`.
	componentTypeAndRecordName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "api_mdl_components_component_type_and_record_name_files_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **api_mdl_components_component_type_and_record_name_get**   { #api_mdl_components_component_type_and_record_name_get }
<a name="api_mdl_components_component_type_and_record_name_get"></a>

> `api_mdl_components_component_type_and_record_name_get(componentTypeAndRecordName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Component Record (MDL)



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.api_mdl_components_component_type_and_record_name_get(
	# componentTypeAndRecordName: String = ""   Eg: componentTypeAndRecordName_example
	# The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
	componentTypeAndRecordName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "api_mdl_components_component_type_and_record_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **api_mdl_execute_async_job_id_results_get**   { #api_mdl_execute_async_job_id_results_get }
<a name="api_mdl_execute_async_job_id_results_get"></a>

> `api_mdl_execute_async_job_id_results_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Asynchronous MDL Script Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.api_mdl_execute_async_job_id_results_get(
	# jobId: String = ""   Eg: jobId_example
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "api_mdl_execute_async_job_id_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **api_mdl_execute_async_post**   { #api_mdl_execute_async_post }
<a name="api_mdl_execute_async_post"></a>

> `api_mdl_execute_async_post(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Execute MDL Script Asynchronously



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.api_mdl_execute_async_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "api_mdl_execute_async_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **api_mdl_execute_post**   { #api_mdl_execute_post }
<a name="api_mdl_execute_post"></a>

> `api_mdl_execute_post(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Execute MDL Script



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.api_mdl_execute_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "api_mdl_execute_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **api_mdl_files_post**   { #api_mdl_files_post }
<a name="api_mdl_files_post"></a>

> `api_mdl_files_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Upload Content File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.api_mdl_files_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "api_mdl_files_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **audittrail_audit_trail_type_get**   { #audittrail_audit_trail_type_get }
<a name="audittrail_audit_trail_type_get"></a>

> `audittrail_audit_trail_type_get(auditTrailType: String,startDate = "",endDate = "",allDates = "",formatResult = "",limit = "",offset = "",objects = "",events = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Audit Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.audittrail_audit_trail_type_get(
	# auditTrailType: String = ""   Eg: auditTrailType_example
	# The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time.
	auditTrailType,
	# startDate: String = ""   Eg: startDate_example
	# Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
	startDate,
	# endDate: String = ""   Eg: endDate_example
	# Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
	endDate,
	# allDates: String = ""   Eg: allDates_example
	# Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail.
	allDates,
	# formatResult: String = ""   Eg: formatResult_example
	# To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required.
	formatResult,
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
	limit,
	# offset: String = ""   Eg: offset_example
	# Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
	offset,
	# objects: String = ""   Eg: objects_example
	# This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects=product__v,country__v. If omitted, defaults to all objects.
	objects,
	# events: String = ""   Eg: events_example
	# This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events=Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events.
	events,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "audittrail_audit_trail_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **auth_discovery_post**   { #auth_discovery_post }
<a name="auth_discovery_post"></a>

> `auth_discovery_post(accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Authentication Type Discovery



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.auth_discovery_post(
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "auth_discovery_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **auth_oauth_session_oath_oidc_profile_id_post**   { #auth_oauth_session_oath_oidc_profile_id_post }
<a name="auth_oauth_session_oath_oidc_profile_id_post"></a>

> `auth_oauth_session_oath_oidc_profile_id_post(oathOidcProfileId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

OAuth 2.0 / OpenID Connect



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.auth_oauth_session_oath_oidc_profile_id_post(
	# oathOidcProfileId: String = ""   Eg: {{oath_oidc_profile_id}}
	oathOidcProfileId,
	# authorization: String = ""   Eg: Bearer {{access_token}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "auth_oauth_session_oath_oidc_profile_id_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **auth_post**   { #auth_post }
<a name="auth_post"></a>

> `auth_post(contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

User Name and Password



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.auth_post(
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "auth_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_class_name_delete**   { #code_class_name_delete }
<a name="code_class_name_delete"></a>

> `code_class_name_delete(className: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Source Code File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_class_name_delete(
	# className: String = ""   Eg: className_example
	# The fully qualified class name of your file.
	className,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_class_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_class_name_disable_put**   { #code_class_name_disable_put }
<a name="code_class_name_disable_put"></a>

> `code_class_name_disable_put(className: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Disable Vault Extension



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_class_name_disable_put(
	# className: String = ""   Eg: className_example
	# The fully qualified class name of your file.
	className,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_class_name_disable_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_class_name_enable_put**   { #code_class_name_enable_put }
<a name="code_class_name_enable_put"></a>

> `code_class_name_enable_put(className: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Enable Vault Extension



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_class_name_enable_put(
	# className: String = ""   Eg: className_example
	# The fully qualified class name of your file.
	className,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_class_name_enable_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_class_name_get**   { #code_class_name_get }
<a name="code_class_name_get"></a>

> `code_class_name_get(className: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Single Source Code File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_class_name_get(
	# className: String = ""   Eg: className_example
	# The fully qualified class name of your file.
	className,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_class_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_profiler_get**   { #code_profiler_get }
<a name="code_profiler_get"></a>

> `code_profiler_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Profiling Sessions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_profiler_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_profiler_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_profiler_post**   { #code_profiler_post }
<a name="code_profiler_post"></a>

> `code_profiler_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Profiling Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_profiler_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_profiler_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_profiler_session_name_actions_end_post**   { #code_profiler_session_name_actions_end_post }
<a name="code_profiler_session_name_actions_end_post"></a>

> `code_profiler_session_name_actions_end_post(sessionName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

End Profiling Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_profiler_session_name_actions_end_post(
	# sessionName: String = ""   Eg: sessionName_example
	# The name of the session, for example,  baseline__c.
	sessionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_profiler_session_name_actions_end_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_profiler_session_name_delete**   { #code_profiler_session_name_delete }
<a name="code_profiler_session_name_delete"></a>

> `code_profiler_session_name_delete(sessionName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Profiling Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_profiler_session_name_delete(
	# sessionName: String = ""   Eg: sessionName_example
	# The name of the session, for example,  baseline__c.
	sessionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_profiler_session_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_profiler_session_name_get**   { #code_profiler_session_name_get }
<a name="code_profiler_session_name_get"></a>

> `code_profiler_session_name_get(sessionName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Profiling Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_profiler_session_name_get(
	# sessionName: String = ""   Eg: sessionName_example
	# The name of the session, for example,  baseline__c.
	sessionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_profiler_session_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_profiler_session_name_results_get**   { #code_profiler_session_name_results_get }
<a name="code_profiler_session_name_results_get"></a>

> `code_profiler_session_name_results_get(sessionName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Profiling Session Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_profiler_session_name_results_get(
	# sessionName: String = ""   Eg: sessionName_example
	# The name of the session, for example,  baseline__c.
	sessionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_profiler_session_name_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **code_put**   { #code_put }
<a name="code_put"></a>

> `code_put(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Add or Replace Single Source Code File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.code_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "code_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **composites_trees_edl_hierarchy_or_template_actions_listnodes_post**   { #composites_trees_edl_hierarchy_or_template_actions_listnodes_post }
<a name="composites_trees_edl_hierarchy_or_template_actions_listnodes_post"></a>

> `composites_trees_edl_hierarchy_or_template_actions_listnodes_post(edlHierarchyOrTemplate: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Specific Root Nodes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.composites_trees_edl_hierarchy_or_template_actions_listnodes_post(
	# edlHierarchyOrTemplate: String = ""   Eg: edlHierarchyOrTemplate_example
	# Choose to retrieve either edl_hierarchy__v or edl_template__v
	edlHierarchyOrTemplate,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "composites_trees_edl_hierarchy_or_template_actions_listnodes_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **composites_trees_edl_hierarchy_or_template_get**   { #composites_trees_edl_hierarchy_or_template_get }
<a name="composites_trees_edl_hierarchy_or_template_get"></a>

> `composites_trees_edl_hierarchy_or_template_get(edlHierarchyOrTemplate: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Root Nodes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.composites_trees_edl_hierarchy_or_template_get(
	# edlHierarchyOrTemplate: String = ""   Eg: edlHierarchyOrTemplate_example
	edlHierarchyOrTemplate,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "composites_trees_edl_hierarchy_or_template_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **composites_trees_edl_hierarchy_v_parent_node_id_children_get**   { #composites_trees_edl_hierarchy_v_parent_node_id_children_get }
<a name="composites_trees_edl_hierarchy_v_parent_node_id_children_get"></a>

> `composites_trees_edl_hierarchy_v_parent_node_id_children_get(parentNodeId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve a Node's Children



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.composites_trees_edl_hierarchy_v_parent_node_id_children_get(
	# parentNodeId: String = ""   Eg: parentNodeId_example
	# The ID of a parent node in the hierarchy.
	parentNodeId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "composites_trees_edl_hierarchy_v_parent_node_id_children_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **composites_trees_edl_hierarchy_v_parent_node_id_children_put**   { #composites_trees_edl_hierarchy_v_parent_node_id_children_put }
<a name="composites_trees_edl_hierarchy_v_parent_node_id_children_put"></a>

> `composites_trees_edl_hierarchy_v_parent_node_id_children_put(parentNodeId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Node Order



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.composites_trees_edl_hierarchy_v_parent_node_id_children_put(
	# parentNodeId: String = ""   Eg: parentNodeId_example
	# The ID of a parent node in the hierarchy.
	parentNodeId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "composites_trees_edl_hierarchy_v_parent_node_id_children_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_component_type_and_record_name_get**   { #configuration_component_type_and_record_name_get }
<a name="configuration_component_type_and_record_name_get"></a>

> `configuration_component_type_and_record_name_get(componentTypeAndRecordName: String,loc = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Component Record (XML/JSON)



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_component_type_and_record_name_get(
	# componentTypeAndRecordName: String = ""   Eg: componentTypeAndRecordName_example
	# The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
	componentTypeAndRecordName,
	# loc: String = ""   Eg: loc_example
	# When localized (translated) strings are available, retrieve them by setting loc to true.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_component_type_and_record_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_component_type_get**   { #configuration_component_type_get }
<a name="configuration_component_type_get"></a>

> `configuration_component_type_get(componentType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Component Record Collection



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_component_type_get(
	# componentType: String = ""   Eg: componentType_example
	componentType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_component_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_object_name_and_object_type_get**   { #configuration_object_name_and_object_type_get }
<a name="configuration_object_name_and_object_type_get"></a>

> `configuration_object_name_and_object_type_get(objectNameAndObjectType: String,loc = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Details from a Specific Object



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_object_name_and_object_type_get(
	# objectNameAndObjectType: String = ""   Eg: objectNameAndObjectType_example
	# The object name followed by the object type in the format `Objecttype.{object_name}.{object_type}`. For example, `Objecttype.product__v.base__v`.
	objectNameAndObjectType,
	# loc: String = ""   Eg: loc_example
	# When localized (translated) strings are available, retrieve them by setting loc to true.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_object_name_and_object_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_objecttype_get**   { #configuration_objecttype_get }
<a name="configuration_objecttype_get"></a>

> `configuration_objecttype_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Details from All Object Types



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_objecttype_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_objecttype_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_role_assignment_rule_delete**   { #configuration_role_assignment_rule_delete }
<a name="configuration_role_assignment_rule_delete"></a>

> `configuration_role_assignment_rule_delete(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Lifecycle Role Assignment Override Rules



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_role_assignment_rule_delete(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_role_assignment_rule_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_role_assignment_rule_get**   { #configuration_role_assignment_rule_get }
<a name="configuration_role_assignment_rule_get"></a>

> `configuration_role_assignment_rule_get(lifecycleV = "",roleV = "",productV = "",countryV = "",studyV = "",studyCountryV = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Lifecycle Role Assignment Rules (Default & Override)



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_role_assignment_rule_get(
	# lifecycleV: String = ""   Eg: lifecycleV_example
	# Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v=general_lifecycle__c
	lifecycleV,
	# roleV: String = ""   Eg: roleV_example
	# Include the name of the role from which to retrieve information. For example: role__v=editor__c
	roleV,
	# productV: String = ""   Eg: productV_example
	# Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v=0PR0011001 or product__v.name__v=CholeCap
	productV,
	# countryV: String = ""   Eg: countryV_example
	# Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v=0CR0022002 or country__v.name__v=United States
	countryV,
	# studyV: String = ""   Eg: studyV_example
	# In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v=0ST0021J01 or study__v.name__v=CholeCap Study
	studyV,
	# studyCountryV: String = ""   Eg: studyCountryV_example
	# In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v=0SC0001001 or study_country__v.name__v=Germany
	studyCountryV,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_role_assignment_rule_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_role_assignment_rule_post**   { #configuration_role_assignment_rule_post }
<a name="configuration_role_assignment_rule_post"></a>

> `configuration_role_assignment_rule_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Lifecycle Role Assignment Override Rules



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_role_assignment_rule_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_role_assignment_rule_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **configuration_role_assignment_rule_put**   { #configuration_role_assignment_rule_put }
<a name="configuration_role_assignment_rule_put"></a>

> `configuration_role_assignment_rule_put(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Lifecycle Role Assignment Rules (Default & Override)



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.configuration_role_assignment_rule_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "configuration_role_assignment_rule_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delegation_login_post**   { #delegation_login_post }
<a name="delegation_login_post"></a>

> `delegation_login_post(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Delegated Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.delegation_login_post(
	# authorization: String = ""   Eg: {{sessionId}}
	# The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "delegation_login_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delegation_vaults_get**   { #delegation_vaults_get }
<a name="delegation_vaults_get"></a>

> `delegation_vaults_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Delegations



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.delegation_vaults_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "delegation_vaults_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **keep_alive_post**   { #keep_alive_post }
<a name="keep_alive_post"></a>

> `keep_alive_post(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Session Keep Alive



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.keep_alive_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "keep_alive_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **limits_get**   { #limits_get }
<a name="limits_get"></a>

> `limits_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Limits on Objects



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.limits_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "limits_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_api_usage_get**   { #logs_api_usage_get }
<a name="logs_api_usage_get"></a>

> `logs_api_usage_get(date = "",logFormat = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Daily API Usage



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_api_usage_get(
	# date: String = ""   Eg: date_example
	# The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
	date,
	# logFormat: String = ""   Eg: logFormat_example
	# Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
	logFormat,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_api_usage_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_code_debug_get**   { #logs_code_debug_get }
<a name="logs_code_debug_get"></a>

> `logs_code_debug_get(userId = "",includeInactive = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Debug Logs



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_code_debug_get(
	# userId: String = ""   Eg: userId_example
	# Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
	userId,
	# includeInactive: bool   Eg: true
	# Set to `true` to include debug log sessions with a status of `inactive__sys` in the response. If omitted, defaults to `false` and inactive sessions are not included in the response.
	includeInactive,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_code_debug_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_code_debug_id_actions_reset_delete**   { #logs_code_debug_id_actions_reset_delete }
<a name="logs_code_debug_id_actions_reset_delete"></a>

> `logs_code_debug_id_actions_reset_delete(id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Debug Log



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_code_debug_id_actions_reset_delete(
	# id: String = ""   Eg: id_example
	# The ID of the debug log to delete.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_code_debug_id_actions_reset_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_code_debug_id_actions_reset_post**   { #logs_code_debug_id_actions_reset_post }
<a name="logs_code_debug_id_actions_reset_post"></a>

> `logs_code_debug_id_actions_reset_post(id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Reset Debug Log



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_code_debug_id_actions_reset_post(
	# id: String = ""   Eg: id_example
	# The ID of the debug log to delete.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_code_debug_id_actions_reset_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_code_debug_id_files_get**   { #logs_code_debug_id_files_get }
<a name="logs_code_debug_id_files_get"></a>

> `logs_code_debug_id_files_get(id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Debug Log Files



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_code_debug_id_files_get(
	# id: String = ""   Eg: id_example
	# The ID of the debug log to download.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_code_debug_id_files_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_code_debug_id_get**   { #logs_code_debug_id_get }
<a name="logs_code_debug_id_get"></a>

> `logs_code_debug_id_get(id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Single Debug Log



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_code_debug_id_get(
	# id: String = ""   Eg: id_example
	# The ID of the debug log to retrieve.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_code_debug_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_code_debug_post**   { #logs_code_debug_post }
<a name="logs_code_debug_post"></a>

> `logs_code_debug_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Debug Log



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_code_debug_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_code_debug_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **logs_code_runtime_get**   { #logs_code_runtime_get }
<a name="logs_code_runtime_get"></a>

> `logs_code_runtime_get(date = "",logFormat = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download SDK Runtime Log



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.logs_code_runtime_get(
	# date: String = ""   Eg: YYYY-MM-DD
	date,
	# logFormat: String = ""   Eg: logFormat_example
	# Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
	logFormat,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "logs_code_runtime_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **messages_message_type_actions_import_post**   { #messages_message_type_actions_import_post }
<a name="messages_message_type_actions_import_post"></a>

> `messages_message_type_actions_import_post(messageType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Import Bulk Translation File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.messages_message_type_actions_import_post(
	# messageType: String = ""   Eg: messageType_example
	# The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
	messageType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "messages_message_type_actions_import_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **messages_message_type_language_lang_actions_export_post**   { #messages_message_type_language_lang_actions_export_post }
<a name="messages_message_type_language_lang_actions_export_post"></a>

> `messages_message_type_language_lang_actions_export_post(messageType: String,lang: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Bulk Translation File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.messages_message_type_language_lang_actions_export_post(
	# messageType: String = ""   Eg: messageType_example
	# The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
	messageType,
	# lang: String = ""   Eg: lang_example
	# A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid. 
	lang,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "messages_message_type_language_lang_actions_export_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_audittrail_audit_trail_type_get**   { #metadata_audittrail_audit_trail_type_get }
<a name="metadata_audittrail_audit_trail_type_get"></a>

> `metadata_audittrail_audit_trail_type_get(auditTrailType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Audit Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_audittrail_audit_trail_type_get(
	# auditTrailType: String = ""   Eg: auditTrailType_example
	# The name of the specified audit type (document_audit_trail, object_audit_trail, etc).
	auditTrailType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_audittrail_audit_trail_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_audittrail_get**   { #metadata_audittrail_get }
<a name="metadata_audittrail_get"></a>

> `metadata_audittrail_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Audit Types



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_audittrail_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_audittrail_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_components_component_type_get**   { #metadata_components_component_type_get }
<a name="metadata_components_component_type_get"></a>

> `metadata_components_component_type_get(componentType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Component Type Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_components_component_type_get(
	# componentType: String = ""   Eg: componentType_example
	# The component type name (Picklist, Docfield, Doctype, etc.).
	componentType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_components_component_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_components_get**   { #metadata_components_get }
<a name="metadata_components_get"></a>

> `metadata_components_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Component Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_components_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_components_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_binders_templates_bindernodes_get**   { #metadata_objects_binders_templates_bindernodes_get }
<a name="metadata_objects_binders_templates_bindernodes_get"></a>

> `metadata_objects_binders_templates_bindernodes_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Template Node Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_binders_templates_bindernodes_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_binders_templates_bindernodes_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_binders_templates_get**   { #metadata_objects_binders_templates_get }
<a name="metadata_objects_binders_templates_get"></a>

> `metadata_objects_binders_templates_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Template Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_binders_templates_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_binders_templates_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_annotations_placemarks_types_placemark_type_get**   { #metadata_objects_documents_annotations_placemarks_types_placemark_type_get }
<a name="metadata_objects_documents_annotations_placemarks_types_placemark_type_get"></a>

> `metadata_objects_documents_annotations_placemarks_types_placemark_type_get(placemarkType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Annotation Placemark Type Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_annotations_placemarks_types_placemark_type_get(
	# placemarkType: String = ""   Eg: placemarkType_example
	# The name of the placemark type. For example, sticky__sys.
	placemarkType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_annotations_placemarks_types_placemark_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_annotations_references_types_reference_type_get**   { #metadata_objects_documents_annotations_references_types_reference_type_get }
<a name="metadata_objects_documents_annotations_references_types_reference_type_get"></a>

> `metadata_objects_documents_annotations_references_types_reference_type_get(referenceType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Annotation Reference Type Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_annotations_references_types_reference_type_get(
	# referenceType: String = ""   Eg: referenceType_example
	referenceType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_annotations_references_types_reference_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_annotations_types_annotation_type_get**   { #metadata_objects_documents_annotations_types_annotation_type_get }
<a name="metadata_objects_documents_annotations_types_annotation_type_get"></a>

> `metadata_objects_documents_annotations_types_annotation_type_get(annotationType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Annotation Type Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_annotations_types_annotation_type_get(
	# annotationType: String = ""   Eg: annotationType_example
	# The name of the annotation type. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in Medical and PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys`
	annotationType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_annotations_types_annotation_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_events_event_type_types_event_subtype_get**   { #metadata_objects_documents_events_event_type_types_event_subtype_get }
<a name="metadata_objects_documents_events_event_type_types_event_subtype_get"></a>

> `metadata_objects_documents_events_event_type_types_event_subtype_get(eventType: String,eventSubtype: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Event SubType Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_events_event_type_types_event_subtype_get(
	# eventType: String = ""   Eg: eventType_example
	# The event type. For example, distribution__v.
	eventType,
	# eventSubtype: String = ""   Eg: eventSubtype_example
	# The event subtype. For example, approved_email__v.
	eventSubtype,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_events_event_type_types_event_subtype_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_events_get**   { #metadata_objects_documents_events_get }
<a name="metadata_objects_documents_events_get"></a>

> `metadata_objects_documents_events_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Event Types and Subtypes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_events_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_events_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_lock_get**   { #metadata_objects_documents_lock_get }
<a name="metadata_objects_documents_lock_get"></a>

> `metadata_objects_documents_lock_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Lock Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_lock_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_lock_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_properties_find_common_post**   { #metadata_objects_documents_properties_find_common_post }
<a name="metadata_objects_documents_properties_find_common_post"></a>

> `metadata_objects_documents_properties_find_common_post(contentType = "",accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Common Document Fields



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_properties_find_common_post(
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_properties_find_common_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_properties_get**   { #metadata_objects_documents_properties_get }
<a name="metadata_objects_documents_properties_get"></a>

> `metadata_objects_documents_properties_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Document Fields



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_properties_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_properties_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_templates_get**   { #metadata_objects_documents_templates_get }
<a name="metadata_objects_documents_templates_get"></a>

> `metadata_objects_documents_templates_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Template Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_templates_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_templates_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_types_get**   { #metadata_objects_documents_types_get }
<a name="metadata_objects_documents_types_get"></a>

> `metadata_objects_documents_types_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Document Types



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_types_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_types_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_types_type_get**   { #metadata_objects_documents_types_type_get }
<a name="metadata_objects_documents_types_type_get"></a>

> `metadata_objects_documents_types_type_get(type: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Type



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_types_type_get(
	# type: String = ""   Eg: type_example
	# The document type. See Retrieve Document Types.
	type,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_types_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_types_type_relationships_get**   { #metadata_objects_documents_types_type_relationships_get }
<a name="metadata_objects_documents_types_type_relationships_get"></a>

> `metadata_objects_documents_types_type_relationships_get(type: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Type Relationships



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_types_type_relationships_get(
	# type: String = ""   Eg: type_example
	# The document type. See Retrieve Document Types.
	type,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_types_type_relationships_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get**   { #metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get }
<a name="metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get"></a>

> `metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(type: String,subtype: String,classification: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Classification



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(
	# type: String = ""   Eg: type_example
	# The document type. See Retrieve Document Types.
	type,
	# subtype: String = ""   Eg: subtype_example
	# The document subtype. See Retrieve Document Types.
	subtype,
	# classification: String = ""   Eg: classification_example
	# The document classification. See Retrieve Document Types.
	classification,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_documents_types_type_subtypes_subtype_get**   { #metadata_objects_documents_types_type_subtypes_subtype_get }
<a name="metadata_objects_documents_types_type_subtypes_subtype_get"></a>

> `metadata_objects_documents_types_type_subtypes_subtype_get(type: String,subtype: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Subtype



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_documents_types_type_subtypes_subtype_get(
	# type: String = ""   Eg: type_example
	# The document type. See Retrieve Document Types.
	type,
	# subtype: String = ""   Eg: subtype_example
	# The document subtype. See Retrieve Document Types.
	subtype,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_documents_types_type_subtypes_subtype_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_groups_get**   { #metadata_objects_groups_get }
<a name="metadata_objects_groups_get"></a>

> `metadata_objects_groups_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Group Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_groups_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_groups_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_securitypolicies_get**   { #metadata_objects_securitypolicies_get }
<a name="metadata_objects_securitypolicies_get"></a>

> `metadata_objects_securitypolicies_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Security Policy Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_securitypolicies_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_securitypolicies_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_objects_users_get**   { #metadata_objects_users_get }
<a name="metadata_objects_users_get"></a>

> `metadata_objects_users_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve User Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_objects_users_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_objects_users_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_query_archived_documents_relationships_document_signature_sysr_get**   { #metadata_query_archived_documents_relationships_document_signature_sysr_get }
<a name="metadata_query_archived_documents_relationships_document_signature_sysr_get"></a>

> `metadata_query_archived_documents_relationships_document_signature_sysr_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Archived Document Signature Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_query_archived_documents_relationships_document_signature_sysr_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_query_archived_documents_relationships_document_signature_sysr_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_query_documents_relationships_document_signature_sysr_get**   { #metadata_query_documents_relationships_document_signature_sysr_get }
<a name="metadata_query_documents_relationships_document_signature_sysr_get"></a>

> `metadata_query_documents_relationships_document_signature_sysr_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Signature Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_query_documents_relationships_document_signature_sysr_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_query_documents_relationships_document_signature_sysr_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_vobjects_get**   { #metadata_vobjects_get }
<a name="metadata_vobjects_get"></a>

> `metadata_vobjects_get(loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Collection



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_vobjects_get(
	# loc: bool   Eg: true
	# To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_vobjects_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_vobjects_object_name_actions_canceldeployment_post**   { #metadata_vobjects_object_name_actions_canceldeployment_post }
<a name="metadata_vobjects_object_name_actions_canceldeployment_post"></a>

> `metadata_vobjects_object_name_actions_canceldeployment_post(objectName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Cancel Raw Object Deployment



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_vobjects_object_name_actions_canceldeployment_post(
	# objectName: String = ""   Eg: objectName_example
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_vobjects_object_name_actions_canceldeployment_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_vobjects_object_name_fields_object_field_name_get**   { #metadata_vobjects_object_name_fields_object_field_name_get }
<a name="metadata_vobjects_object_name_fields_object_field_name_get"></a>

> `metadata_vobjects_object_name_fields_object_field_name_get(objectName: String,objectFieldName: String,loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Field Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_vobjects_object_name_fields_object_field_name_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectFieldName: String = ""   Eg: objectFieldName_example
	# The object field name value (id, name__v, external_id__v, etc.).
	objectFieldName,
	# loc: bool   Eg: true
	# To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_vobjects_object_name_fields_object_field_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_vobjects_object_name_get**   { #metadata_vobjects_object_name_get }
<a name="metadata_vobjects_object_name_get"></a>

> `metadata_vobjects_object_name_get(objectName: String,loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_vobjects_object_name_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# loc: bool   Eg: true
	# To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_vobjects_object_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_vobjects_object_name_page_layouts_get**   { #metadata_vobjects_object_name_page_layouts_get }
<a name="metadata_vobjects_object_name_page_layouts_get"></a>

> `metadata_vobjects_object_name_page_layouts_get(objectName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Page Layouts



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_vobjects_object_name_page_layouts_get(
	# objectName: String = ""   Eg: objectName_example
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_vobjects_object_name_page_layouts_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metadata_vobjects_object_name_page_layouts_layout_name_get**   { #metadata_vobjects_object_name_page_layouts_layout_name_get }
<a name="metadata_vobjects_object_name_page_layouts_layout_name_get"></a>

> `metadata_vobjects_object_name_page_layouts_layout_name_get(objectName: String,layoutName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Page Layout Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.metadata_vobjects_object_name_page_layouts_layout_name_get(
	# objectName: String = ""   Eg: objectName_example
	# The name of the object from which to retrieve page layout metadata.
	objectName,
	# layoutName: String = ""   Eg: layoutName_example
	# The name of the page layout from which to retrieve metadata.
	layoutName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "metadata_vobjects_object_name_page_layouts_layout_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **notifications_histories_get**   { #notifications_histories_get }
<a name="notifications_histories_get"></a>

> `notifications_histories_get(startDate = "",endDate = "",allDates = null,formatResult = "",limit = "",offset = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Email Notification Histories



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.notifications_histories_get(
	# startDate: String = ""   Eg: YYYY-MM-DD
	# Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date.
	startDate,
	# endDate: String = ""   Eg: YYYY-MM-DD
	# Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date.
	endDate,
	# allDates: bool   Eg: true
	# Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours.
	allDates,
	# formatResult: String = ""   Eg: csv
	# To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv.
	formatResult,
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
	limit,
	# offset: String = ""   Eg: offset_example
	# Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0.
	offset,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "notifications_histories_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **object_workflow_actions_action_get**   { #object_workflow_actions_action_get }
<a name="object_workflow_actions_action_get"></a>

> `object_workflow_actions_action_get(action: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Bulk Workflow Action Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.object_workflow_actions_action_get(
	# action: String = ""   Eg: action_example
	action,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "object_workflow_actions_action_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **object_workflow_actions_action_post**   { #object_workflow_actions_action_post }
<a name="object_workflow_actions_action_post"></a>

> `object_workflow_actions_action_post(action: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Workflow Actions on Multiple Workflows



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.object_workflow_actions_action_post(
	# action: String = ""   Eg: action_example
	action,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "object_workflow_actions_action_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **object_workflow_actions_canceltasks_post**   { #object_workflow_actions_canceltasks_post }
<a name="object_workflow_actions_canceltasks_post"></a>

> `object_workflow_actions_canceltasks_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Cancel Workflow Tasks



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.object_workflow_actions_canceltasks_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "object_workflow_actions_canceltasks_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **object_workflow_actions_cancelworkflows_post**   { #object_workflow_actions_cancelworkflows_post }
<a name="object_workflow_actions_cancelworkflows_post"></a>

> `object_workflow_actions_cancelworkflows_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Cancel Workflows



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.object_workflow_actions_cancelworkflows_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "object_workflow_actions_cancelworkflows_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **object_workflow_actions_get**   { #object_workflow_actions_get }
<a name="object_workflow_actions_get"></a>

> `object_workflow_actions_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Bulk Workflow Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.object_workflow_actions_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "object_workflow_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **object_workflow_actions_reassigntasks_post**   { #object_workflow_actions_reassigntasks_post }
<a name="object_workflow_actions_reassigntasks_post"></a>

> `object_workflow_actions_reassigntasks_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Reassign Workflow Tasks



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.object_workflow_actions_reassigntasks_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "object_workflow_actions_reassigntasks_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **object_workflow_actions_replaceworkflowowner_post**   { #object_workflow_actions_replaceworkflowowner_post }
<a name="object_workflow_actions_replaceworkflowowner_post"></a>

> `object_workflow_actions_replaceworkflowowner_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Replace Workflow Owner



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.object_workflow_actions_replaceworkflowowner_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "object_workflow_actions_replaceworkflowowner_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_actions_export_job_id_results_get**   { #objects_binders_actions_export_job_id_results_get }
<a name="objects_binders_actions_export_job_id_results_get"></a>

> `objects_binders_actions_export_job_id_results_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Export Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_actions_export_job_id_results_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested export job. This is returned with the export binder requests above.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_actions_export_job_id_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_actions_export_post**   { #objects_binders_binder_id_actions_export_post }
<a name="objects_binders_binder_id_actions_export_post"></a>

> `objects_binders_binder_id_actions_export_post(binderId: String,source = null,renditiontype = "",docversion = "",attachments = "",export = "",docfield = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Binder (Latest Version)



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_actions_export_post(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# source: bool   Eg: true
	# to include source content or not
	source,
	# renditiontype: String = ""   Eg: viewable_rendition__v
	# to include viewable renditions
	renditiontype,
	# docversion: String = ""   Eg: major
	# to include all major versions
	docversion,
	# attachments: String = ""   Eg: all
	# to include all versions of attachments
	attachments,
	# export: String = ""   Eg: name__v,title__v,document_number__v
	# configurable filename metadata
	export,
	# docfield: bool   Eg: false
	# to exclude document metadata csv
	docfield,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_actions_export_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_actions_post**   { #objects_binders_binder_id_actions_post }
<a name="objects_binders_binder_id_actions_post"></a>

> `objects_binders_binder_id_actions_post(binderId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Refresh Binder Auto-Filing



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_actions_post(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_actions_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_binding_rule_put**   { #objects_binders_binder_id_binding_rule_put }
<a name="objects_binders_binder_id_binding_rule_put"></a>

> `objects_binders_binder_id_binding_rule_put(binderId: String,contentType = "",accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Binding Rule



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_binding_rule_put(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_binding_rule_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_delete**   { #objects_binders_binder_id_delete }
<a name="objects_binders_binder_id_delete"></a>

> `objects_binders_binder_id_delete(binderId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_delete(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_documents_node_id_binding_rule_put**   { #objects_binders_binder_id_documents_node_id_binding_rule_put }
<a name="objects_binders_binder_id_documents_node_id_binding_rule_put"></a>

> `objects_binders_binder_id_documents_node_id_binding_rule_put(binderId: String,nodeId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Binder Document Binding Rule



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_documents_node_id_binding_rule_put(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# nodeId: String = ""   Eg: nodeId_example
	# The binder node id field value.
	nodeId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_documents_node_id_binding_rule_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_documents_post**   { #objects_binders_binder_id_documents_post }
<a name="objects_binders_binder_id_documents_post"></a>

> `objects_binders_binder_id_documents_post(binderId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Add Document to Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_documents_post(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_documents_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_documents_section_id_delete**   { #objects_binders_binder_id_documents_section_id_delete }
<a name="objects_binders_binder_id_documents_section_id_delete"></a>

> `objects_binders_binder_id_documents_section_id_delete(binderId: String,sectionId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Remove Document from Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_documents_section_id_delete(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# sectionId: String = ""   Eg: sectionId_example
	# The binder node id field value.
	sectionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_documents_section_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_documents_section_id_put**   { #objects_binders_binder_id_documents_section_id_put }
<a name="objects_binders_binder_id_documents_section_id_put"></a>

> `objects_binders_binder_id_documents_section_id_put(binderId: String,sectionId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Move Document in Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_documents_section_id_put(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# sectionId: String = ""   Eg: sectionId_example
	# The binder node id field value.
	sectionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_documents_section_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_get**   { #objects_binders_binder_id_get }
<a name="objects_binders_binder_id_get"></a>

> `objects_binders_binder_id_get(binderId: String,depth = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_get(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# depth: String = ""   Eg: depth_example
	# To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
	depth,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_post**   { #objects_binders_binder_id_post }
<a name="objects_binders_binder_id_post"></a>

> `objects_binders_binder_id_post(binderId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Binder Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_post(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_put**   { #objects_binders_binder_id_put }
<a name="objects_binders_binder_id_put"></a>

> `objects_binders_binder_id_put(binderId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_put(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete**   { #objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete }
<a name="objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete"></a>

> `objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(binderId: String,roleNameAndUserOrGroup: String,id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Remove Users & Groups from Roles on a Single Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(
	# binderId: String = ""   Eg: binderId_example
	# The id value of the binder from which to remove roles.
	binderId,
	# roleNameAndUserOrGroup: String = ""   Eg: roleNameAndUserOrGroup_example
	# The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`.
	roleNameAndUserOrGroup,
	# id: String = ""   Eg: id_example
	# The id value of the user or group to remove from the role.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_sections_node_id_binding_rule_put**   { #objects_binders_binder_id_sections_node_id_binding_rule_put }
<a name="objects_binders_binder_id_sections_node_id_binding_rule_put"></a>

> `objects_binders_binder_id_sections_node_id_binding_rule_put(binderId: String,nodeId: String,contentType = "",accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Binder Section Binding Rule



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_sections_node_id_binding_rule_put(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# nodeId: String = ""   Eg: nodeId_example
	# The binder node id field value.
	nodeId,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_sections_node_id_binding_rule_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_sections_node_id_put**   { #objects_binders_binder_id_sections_node_id_put }
<a name="objects_binders_binder_id_sections_node_id_put"></a>

> `objects_binders_binder_id_sections_node_id_put(binderId: String,nodeId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Binder Section



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_sections_node_id_put(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# nodeId: String = ""   Eg: nodeId_example
	# The binder node id of the section.
	nodeId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_sections_node_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_sections_post**   { #objects_binders_binder_id_sections_post }
<a name="objects_binders_binder_id_sections_post"></a>

> `objects_binders_binder_id_sections_post(binderId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Binder Section



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_sections_post(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_sections_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_sections_section_id_delete**   { #objects_binders_binder_id_sections_section_id_delete }
<a name="objects_binders_binder_id_sections_section_id_delete"></a>

> `objects_binders_binder_id_sections_section_id_delete(binderId: String,sectionId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Binder Section



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_sections_section_id_delete(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# sectionId: String = ""   Eg: sectionId_example
	# The binder node id field value.
	sectionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_sections_section_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_sections_section_id_get**   { #objects_binders_binder_id_sections_section_id_get }
<a name="objects_binders_binder_id_sections_section_id_get"></a>

> `objects_binders_binder_id_sections_section_id_get(binderId: String,sectionId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Sections



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_sections_section_id_get(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# sectionId: String = ""   Eg: sectionId_example
	# The binder node id field value.
	sectionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_sections_section_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_get**   { #objects_binders_binder_id_versions_get }
<a name="objects_binders_binder_id_versions_get"></a>

> `objects_binders_binder_id_versions_get(binderId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Binder Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_get(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_actions_export_post**   { #objects_binders_binder_id_versions_major_version_minor_version_actions_export_post }
<a name="objects_binders_binder_id_versions_major_version_minor_version_actions_export_post"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(binderId: String,majorVersion: String,minorVersion: String,source = null,renditiontype = "",docversion = "",attachments = "",export = "",docfield = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Binder (Specific Version)



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# source: bool   Eg: true
	# to include source content or not
	source,
	# renditiontype: String = ""   Eg: viewable_rendition__v
	# to include viewable renditions
	renditiontype,
	# docversion: String = ""   Eg: major
	# to include all major versions
	docversion,
	# attachments: String = ""   Eg: all
	# to include all versions of attachments
	attachments,
	# export: String = ""   Eg: name__v,title__v,document_number__v
	# configurable filename metadata
	export,
	# docfield: bool   Eg: false
	# to exclude document metadata csv
	docfield,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_actions_export_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_delete**   { #objects_binders_binder_id_versions_major_version_minor_version_delete }
<a name="objects_binders_binder_id_versions_major_version_minor_version_delete"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_delete(binderId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Binder Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_delete(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_get**   { #objects_binders_binder_id_versions_major_version_minor_version_get }
<a name="objects_binders_binder_id_versions_major_version_minor_version_get"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_get(binderId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_get(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_put**   { #objects_binders_binder_id_versions_major_version_minor_version_put }
<a name="objects_binders_binder_id_versions_major_version_minor_version_put"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_put(binderId: String,majorVersion: String,minorVersion: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Binder Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_put(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_post**   { #objects_binders_binder_id_versions_major_version_minor_version_relationships_post }
<a name="objects_binders_binder_id_versions_major_version_minor_version_relationships_post"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_relationships_post(binderId: String,majorVersion: String,minorVersion: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Binder Relationship



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_relationships_post(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_relationships_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete**   { #objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete }
<a name="objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(binderId: String,majorVersion: String,minorVersion: String,relationshipId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Binder Relationship



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# relationshipId: String = ""   Eg: relationshipId_example
	# The binder relationship id field value.
	relationshipId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get**   { #objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get }
<a name="objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(binderId: String,majorVersion: String,minorVersion: String,relationshipId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Relationship



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# relationshipId: String = ""   Eg: relationshipId_example
	# The binder relationship id field value.
	relationshipId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get**   { #objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get }
<a name="objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get"></a>

> `objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(binderId: String,majorVersion: String,minorVersion: String,sectionId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Version Section



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(
	# binderId: String = ""   Eg: binderId_example
	# The binder id field value.
	binderId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The binder major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The binder minor_version_number__v field value.
	minorVersion,
	# sectionId: String = ""   Eg: sectionId_example
	# Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned.
	sectionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_id_roles_get**   { #objects_binders_id_roles_get }
<a name="objects_binders_id_roles_get"></a>

> `objects_binders_id_roles_get(id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Binder Roles



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_id_roles_get(
	# id: String = ""   Eg: id_example
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_id_roles_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_id_roles_post**   { #objects_binders_id_roles_post }
<a name="objects_binders_id_roles_post"></a>

> `objects_binders_id_roles_post(id: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Assign Users & Groups to Roles on a Single Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_id_roles_post(
	# id: String = ""   Eg: id_example
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_id_roles_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_id_roles_role_name_get**   { #objects_binders_id_roles_role_name_get }
<a name="objects_binders_id_roles_role_name_get"></a>

> `objects_binders_id_roles_role_name_get(id: String,roleName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Role



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_id_roles_role_name_get(
	# id: String = ""   Eg: id_example
	# The binder `id`.
	id,
	# roleName: String = ""   Eg: roleName_example
	# The name of the role to retrieve. For example, `owner__v`.
	roleName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_id_roles_role_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get**   { #objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get }
<a name="objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get"></a>

> `objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(id: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder User Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(
	# id: String = ""   Eg: id_example
	# The binder id field value from which to retrieve available user actions.
	id,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The major version number of the binder.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The minor version number of the binder.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**   { #objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get }
<a name="objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get"></a>

> `objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(id: String,majorVersion: String,minorVersion: String,nameV: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Entry Criteria



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(
	# id: String = ""   Eg: id_example
	# The binder id field value from which to retrieve available user actions.
	id,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The major version number of the binder.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The minor version number of the binder.
	minorVersion,
	# nameV: String = ""   Eg: nameV_example
	# The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
	nameV,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**   { #objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put }
<a name="objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put"></a>

> `objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(id: String,majorVersion: String,minorVersion: String,nameV: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Binder User Action



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(
	# id: String = ""   Eg: id_example
	# The binder id field value from which to retrieve available user actions.
	id,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The major version number of the binder.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The minor version number of the binder.
	minorVersion,
	# nameV: String = ""   Eg: nameV_example
	# The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
	nameV,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_lifecycle_actions_post**   { #objects_binders_lifecycle_actions_post }
<a name="objects_binders_lifecycle_actions_post"></a>

> `objects_binders_lifecycle_actions_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve User Actions on Multiple Binders



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_lifecycle_actions_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_lifecycle_actions_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_lifecycle_actions_user_action_name_put**   { #objects_binders_lifecycle_actions_user_action_name_put }
<a name="objects_binders_lifecycle_actions_user_action_name_put"></a>

> `objects_binders_lifecycle_actions_user_action_name_put(userActionName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Bulk Binder User Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_lifecycle_actions_user_action_name_put(
	# userActionName: String = ""   Eg: userActionName_example
	# The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint.
	userActionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_lifecycle_actions_user_action_name_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_post**   { #objects_binders_post }
<a name="objects_binders_post"></a>

> `objects_binders_post(async = null,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Binder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_post(
	# async: bool   Eg: true
	# When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async=true). This helps speed up the response time from Vault when processing large amounts of data. 
	async,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_get**   { #objects_binders_templates_get }
<a name="objects_binders_templates_get"></a>

> `objects_binders_templates_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Template Collection



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_post**   { #objects_binders_templates_post }
<a name="objects_binders_templates_post"></a>

> `objects_binders_templates_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Binder Template



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_put**   { #objects_binders_templates_put }
<a name="objects_binders_templates_put"></a>

> `objects_binders_templates_put(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Binder Template



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_template_name_bindernodes_get**   { #objects_binders_templates_template_name_bindernodes_get }
<a name="objects_binders_templates_template_name_bindernodes_get"></a>

> `objects_binders_templates_template_name_bindernodes_get(templateName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Template Node Attributes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_template_name_bindernodes_get(
	# templateName: String = ""   Eg: templateName_example
	# The binder template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_template_name_bindernodes_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_template_name_bindernodes_post**   { #objects_binders_templates_template_name_bindernodes_post }
<a name="objects_binders_templates_template_name_bindernodes_post"></a>

> `objects_binders_templates_template_name_bindernodes_post(templateName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Binder Template Node



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_template_name_bindernodes_post(
	# templateName: String = ""   Eg: templateName_example
	# The binder template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_template_name_bindernodes_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_template_name_bindernodes_put**   { #objects_binders_templates_template_name_bindernodes_put }
<a name="objects_binders_templates_template_name_bindernodes_put"></a>

> `objects_binders_templates_template_name_bindernodes_put(templateName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Replace Binder Template Nodes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_template_name_bindernodes_put(
	# templateName: String = ""   Eg: templateName_example
	# The binder template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_template_name_bindernodes_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_template_name_delete**   { #objects_binders_templates_template_name_delete }
<a name="objects_binders_templates_template_name_delete"></a>

> `objects_binders_templates_template_name_delete(templateName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Binder Template



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_template_name_delete(
	# templateName: String = ""   Eg: templateName_example
	# The binder template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_template_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_binders_templates_template_name_get**   { #objects_binders_templates_template_name_get }
<a name="objects_binders_templates_template_name_get"></a>

> `objects_binders_templates_template_name_get(templateName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Binder Template Attributes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_binders_templates_template_name_get(
	# templateName: String = ""   Eg: templateName_example
	# The binder template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_binders_templates_template_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_deletions_documents_get**   { #objects_deletions_documents_get }
<a name="objects_deletions_documents_get"></a>

> `objects_deletions_documents_get(startDate = "",endDate = "",authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Deleted Document IDs



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_deletions_documents_get(
	# startDate: String = ""   Eg: startDate_example
	# Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
	startDate,
	# endDate: String = ""   Eg: endDate_example
	# Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
	endDate,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_deletions_documents_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_deletions_vobjects_object_name_get**   { #objects_deletions_vobjects_object_name_get }
<a name="objects_deletions_vobjects_object_name_get"></a>

> `objects_deletions_vobjects_object_name_get(objectName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Deleted Object Record ID



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_deletions_vobjects_object_name_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_deletions_vobjects_object_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_actions_get**   { #objects_documents_actions_get }
<a name="objects_documents_actions_get"></a>

> `objects_documents_actions_get(loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Document Workflows



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_actions_get(
	# loc: bool   Eg: true
	# When localized (translated) strings are available, retrieve them by setting loc to true.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get**   { #objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get }
<a name="objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get"></a>

> `objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(lifecycleAndStateAndAction: String,jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Controlled Copy Job Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(
	# lifecycleAndStateAndAction: String = ""   Eg: lifecycleAndStateAndAction_example
	# The `name__v` values for the lifecycle, state, and action in the format `{lifecycle_name}.{state_name}.{action_name}`. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the `href` under the `artifacts` link.
	lifecycleAndStateAndAction,
	# jobId: String = ""   Eg: jobId_example
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_actions_workflow_name_get**   { #objects_documents_actions_workflow_name_get }
<a name="objects_documents_actions_workflow_name_get"></a>

> `objects_documents_actions_workflow_name_get(workflowName: String,loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Workflow Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_actions_workflow_name_get(
	# workflowName: String = ""   Eg: workflowName_example
	# The document workflow name value.
	workflowName,
	# loc: bool   Eg: true
	# When localized (translated) strings are available, retrieve them by setting loc to true.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_actions_workflow_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_actions_workflow_name_post**   { #objects_documents_actions_workflow_name_post }
<a name="objects_documents_actions_workflow_name_post"></a>

> `objects_documents_actions_workflow_name_post(workflowName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Document Workflow



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_actions_workflow_name_post(
	# workflowName: String = ""   Eg: workflowName_example
	# The document workflow name value.
	workflowName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_actions_workflow_name_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_annotations_batch_delete**   { #objects_documents_annotations_batch_delete }
<a name="objects_documents_annotations_batch_delete"></a>

> `objects_documents_annotations_batch_delete(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Annotations



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_annotations_batch_delete(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_annotations_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_annotations_batch_post**   { #objects_documents_annotations_batch_post }
<a name="objects_documents_annotations_batch_post"></a>

> `objects_documents_annotations_batch_post(authorization: String,contentType: String,accept: String,xVaultAPIClientID: String, on_success: Callable, on_failure: Callable)`

Create Multiple Annotations



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_annotations_batch_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_annotations_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_annotations_batch_put**   { #objects_documents_annotations_batch_put }
<a name="objects_documents_annotations_batch_put"></a>

> `objects_documents_annotations_batch_put(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Annotations



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_annotations_batch_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_annotations_batch_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_annotations_replies_batch_post**   { #objects_documents_annotations_replies_batch_post }
<a name="objects_documents_annotations_replies_batch_post"></a>

> `objects_documents_annotations_replies_batch_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Add Annotation Replies



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_annotations_replies_batch_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_annotations_replies_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_attachments_batch_delete**   { #objects_documents_attachments_batch_delete }
<a name="objects_documents_attachments_batch_delete"></a>

> `objects_documents_attachments_batch_delete(accept = "",authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Multiple Document Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_attachments_batch_delete(
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_attachments_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_attachments_batch_post**   { #objects_documents_attachments_batch_post }
<a name="objects_documents_attachments_batch_post"></a>

> `objects_documents_attachments_batch_post(accept = "",authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Multiple Document Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_attachments_batch_post(
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_attachments_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_attachments_batch_put**   { #objects_documents_attachments_batch_put }
<a name="objects_documents_attachments_batch_put"></a>

> `objects_documents_attachments_batch_put(accept = "",authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Multiple Document Attachment Descriptions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_attachments_batch_put(
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_attachments_batch_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_actions_fileextract_job_id_results_get**   { #objects_documents_batch_actions_fileextract_job_id_results_get }
<a name="objects_documents_batch_actions_fileextract_job_id_results_get"></a>

> `objects_documents_batch_actions_fileextract_job_id_results_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Export Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_actions_fileextract_job_id_results_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested export job. This is returned with the export document requests.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_actions_fileextract_job_id_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_actions_fileextract_post**   { #objects_documents_batch_actions_fileextract_post }
<a name="objects_documents_batch_actions_fileextract_post"></a>

> `objects_documents_batch_actions_fileextract_post(source = null,renditions = null,allversions = null,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_actions_fileextract_post(
	# source: bool   Eg: true
	# Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
	source,
	# renditions: bool   Eg: false
	# Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
	renditions,
	# allversions: bool   Eg: true
	# Optional: To include all versions or latest version, include a query parameter allversions=true. If omitted, defaults to false.
	allversions,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_actions_fileextract_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_actions_reclassify_put**   { #objects_documents_batch_actions_reclassify_put }
<a name="objects_documents_batch_actions_reclassify_put"></a>

> `objects_documents_batch_actions_reclassify_put(authorization = "",contentType = "",accept = "",xVaultAPIMigrationMode = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Reclassify Multiple Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_actions_reclassify_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIMigrationMode: bool   Eg: true
	# When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_actions_reclassify_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_actions_rerender_post**   { #objects_documents_batch_actions_rerender_post }
<a name="objects_documents_batch_actions_rerender_post"></a>

> `objects_documents_batch_actions_rerender_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Multiple Document Renditions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_actions_rerender_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_actions_rerender_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_delete**   { #objects_documents_batch_delete }
<a name="objects_documents_batch_delete"></a>

> `objects_documents_batch_delete(idParam = "",authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Multiple Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_delete(
	# idParam: String = ""   Eg: idParam_example
	# If you’re identifying documents in your input by their external ID
	idParam,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_lock_delete**   { #objects_documents_batch_lock_delete }
<a name="objects_documents_batch_lock_delete"></a>

> `objects_documents_batch_lock_delete(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Undo Collaborative Authoring Checkout



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_lock_delete(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_lock_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_post**   { #objects_documents_batch_post }
<a name="objects_documents_batch_post"></a>

> `objects_documents_batch_post(authorization = "",accept = "",contentType = "",xVaultAPIMigrationMode = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Multiple Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIMigrationMode: bool   Eg: true
	# When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_batch_put**   { #objects_documents_batch_put }
<a name="objects_documents_batch_put"></a>

> `objects_documents_batch_put(authorization = "",accept = "",contentType = "",xVaultAPIMigrationMode = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Multiple Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_batch_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIMigrationMode: bool   Eg: true
	# When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_batch_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_anchors_get**   { #objects_documents_doc_id_anchors_get }
<a name="objects_documents_doc_id_anchors_get"></a>

> `objects_documents_doc_id_anchors_get(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Anchor IDs



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_anchors_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_anchors_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_annotations_file_get**   { #objects_documents_doc_id_annotations_file_get }
<a name="objects_documents_doc_id_annotations_file_get"></a>

> `objects_documents_doc_id_annotations_file_get(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Document Annotations to PDF



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_annotations_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_annotations_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_annotations_file_post**   { #objects_documents_doc_id_annotations_file_post }
<a name="objects_documents_doc_id_annotations_file_post"></a>

> `objects_documents_doc_id_annotations_file_post(docId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Import Document Annotations from PDF



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_annotations_file_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_annotations_file_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_delete**   { #objects_documents_doc_id_attachments_attachment_id_delete }
<a name="objects_documents_doc_id_attachments_attachment_id_delete"></a>

> `objects_documents_doc_id_attachments_attachment_id_delete(docId: String,attachmentId: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Document Attachment



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_file_get**   { #objects_documents_doc_id_attachments_attachment_id_file_get }
<a name="objects_documents_doc_id_attachments_attachment_id_file_get"></a>

> `objects_documents_doc_id_attachments_attachment_id_file_get(docId: String,attachmentId: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Attachment



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_get**   { #objects_documents_doc_id_attachments_attachment_id_get }
<a name="objects_documents_doc_id_attachments_attachment_id_get"></a>

> `objects_documents_doc_id_attachments_attachment_id_get(docId: String,attachmentId: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Attachment Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_put**   { #objects_documents_doc_id_attachments_attachment_id_put }
<a name="objects_documents_doc_id_attachments_attachment_id_put"></a>

> `objects_documents_doc_id_attachments_attachment_id_put(docId: String,attachmentId: String,accept = "",authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Document Attachment Description



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_put(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete**   { #objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete }
<a name="objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete"></a>

> `objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(docId: String,attachmentId: String,attachmentVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Document Attachment Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The attachment version__v field value.
	attachmentVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get**   { #objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get }
<a name="objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get"></a>

> `objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(docId: String,attachmentId: String,attachmentVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Attachment Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The attachment version__v field value.
	attachmentVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get**   { #objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get }
<a name="objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get"></a>

> `objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(docId: String,attachmentId: String,attachmentVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Attachment Version Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The attachment version__v field value.
	attachmentVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post**   { #objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post }
<a name="objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post"></a>

> `objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(docId: String,attachmentId: String,attachmentVersion: String,restore = null,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Restore Document Attachment Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The attachment version__v field value.
	attachmentVersion,
	# restore: bool   Eg: true
	# The parameter restore must be set to true. 
	restore,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_attachment_id_versions_get**   { #objects_documents_doc_id_attachments_attachment_id_versions_get }
<a name="objects_documents_doc_id_attachments_attachment_id_versions_get"></a>

> `objects_documents_doc_id_attachments_attachment_id_versions_get(docId: String,attachmentId: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Attachment Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_attachment_id_versions_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_attachment_id_versions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_file_get**   { #objects_documents_doc_id_attachments_file_get }
<a name="objects_documents_doc_id_attachments_file_get"></a>

> `objects_documents_doc_id_attachments_file_get(docId: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download All Document Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_get**   { #objects_documents_doc_id_attachments_get }
<a name="objects_documents_doc_id_attachments_get"></a>

> `objects_documents_doc_id_attachments_get(docId: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_attachments_post**   { #objects_documents_doc_id_attachments_post }
<a name="objects_documents_doc_id_attachments_post"></a>

> `objects_documents_doc_id_attachments_post(docId: String,accept = "",authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Document Attachment



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_attachments_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_attachments_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_audittrail_get**   { #objects_documents_doc_id_audittrail_get }
<a name="objects_documents_doc_id_audittrail_get"></a>

> `objects_documents_doc_id_audittrail_get(docId: String,startDate = "",endDate = "",formatResult = "",limit = "",offset = "",events = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Complete Audit History for a Single Document



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_audittrail_get(
	# docId: String = ""   Eg: docId_example
	# The document ID for which to retrieve audit history.
	docId,
	# startDate: String = ""   Eg: startDate_example
	# Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date. 
	startDate,
	# endDate: String = ""   Eg: endDate_example
	# Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
	endDate,
	# formatResult: String = ""   Eg: formatResult_example
	# To request a CSV file of your audit history, use csv. 
	formatResult,
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
	limit,
	# offset: String = ""   Eg: offset_example
	# Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
	offset,
	# events: String = ""   Eg: events_example
	# Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events=WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events.
	events,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_audittrail_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_delete**   { #objects_documents_doc_id_delete }
<a name="objects_documents_doc_id_delete"></a>

> `objects_documents_doc_id_delete(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Document



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_events_get**   { #objects_documents_doc_id_events_get }
<a name="objects_documents_doc_id_events_get"></a>

> `objects_documents_doc_id_events_get(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Events



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_events_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_events_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_file_get**   { #objects_documents_doc_id_file_get }
<a name="objects_documents_doc_id_file_get"></a>

> `objects_documents_doc_id_file_get(docId: String,lockDocument = null,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# lockDocument: bool   Eg: false
	# Set to true to Check Out this document before retrieval. If omitted, defaults to false.
	lockDocument,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_get**   { #objects_documents_doc_id_get }
<a name="objects_documents_doc_id_get"></a>

> `objects_documents_doc_id_get(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_lock_delete**   { #objects_documents_doc_id_lock_delete }
<a name="objects_documents_doc_id_lock_delete"></a>

> `objects_documents_doc_id_lock_delete(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Document Lock



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_lock_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_lock_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_lock_get**   { #objects_documents_doc_id_lock_get }
<a name="objects_documents_doc_id_lock_get"></a>

> `objects_documents_doc_id_lock_get(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Lock



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_lock_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_lock_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_lock_post**   { #objects_documents_doc_id_lock_post }
<a name="objects_documents_doc_id_lock_post"></a>

> `objects_documents_doc_id_lock_post(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Document Lock



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_lock_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_lock_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_major_version_minor_version_attachments_file_get**   { #objects_documents_doc_id_major_version_minor_version_attachments_file_get }
<a name="objects_documents_doc_id_major_version_minor_version_attachments_file_get"></a>

> `objects_documents_doc_id_major_version_minor_version_attachments_file_get(docId: String,majorVersion: String,minorVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download All Document Version Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_major_version_minor_version_attachments_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_major_version_minor_version_attachments_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_post**   { #objects_documents_doc_id_post }
<a name="objects_documents_doc_id_post"></a>

> `objects_documents_doc_id_post(docId: String,suppressRendition = "",authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Single Document Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# suppressRendition: String = ""   Eg: suppressRendition_example
	# Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
	suppressRendition,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_put**   { #objects_documents_doc_id_put }
<a name="objects_documents_doc_id_put"></a>

> `objects_documents_doc_id_put(docId: String,authorization = "",contentType = "",accept = "",xVaultAPIMigrationMode = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Single Document



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_put(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIMigrationMode: bool   Eg: true
	# When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_renditions_get**   { #objects_documents_doc_id_renditions_get }
<a name="objects_documents_doc_id_renditions_get"></a>

> `objects_documents_doc_id_renditions_get(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Renditions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_renditions_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_renditions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_renditions_rendition_type_delete**   { #objects_documents_doc_id_renditions_rendition_type_delete }
<a name="objects_documents_doc_id_renditions_rendition_type_delete"></a>

> `objects_documents_doc_id_renditions_rendition_type_delete(docId: String,renditionType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Document Rendition



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_renditions_rendition_type_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_renditions_rendition_type_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_renditions_rendition_type_get**   { #objects_documents_doc_id_renditions_rendition_type_get }
<a name="objects_documents_doc_id_renditions_rendition_type_get"></a>

> `objects_documents_doc_id_renditions_rendition_type_get(docId: String,renditionType: String,steadyState = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Rendition File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_renditions_rendition_type_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# steadyState: String = ""   Eg: steadyState_example
	# Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
	steadyState,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_renditions_rendition_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_renditions_rendition_type_post**   { #objects_documents_doc_id_renditions_rendition_type_post }
<a name="objects_documents_doc_id_renditions_rendition_type_post"></a>

> `objects_documents_doc_id_renditions_rendition_type_post(docId: String,renditionType: String,authorization = "",accept = "",content Type = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Add Single Document Rendition



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_renditions_rendition_type_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# content Type: String = ""   Eg: multipart/form-data
	content Type,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_renditions_rendition_type_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_renditions_rendition_type_put**   { #objects_documents_doc_id_renditions_rendition_type_put }
<a name="objects_documents_doc_id_renditions_rendition_type_put"></a>

> `objects_documents_doc_id_renditions_rendition_type_put(docId: String,renditionType: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Replace Document Rendition



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_renditions_rendition_type_put(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_renditions_rendition_type_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete**   { #objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete }
<a name="objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete"></a>

> `objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(docId: String,roleNameAndUserOrGroup: String,id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Remove Users & Groups from Roles on a Single Document



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(
	# docId: String = ""   Eg: docId_example
	# The id value of the document from which to remove roles.
	docId,
	# roleNameAndUserOrGroup: String = ""   Eg: roleNameAndUserOrGroup_example
	# The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`.
	roleNameAndUserOrGroup,
	# id: String = ""   Eg: id_example
	# The id value of the user or group to remove from the role.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_version_major_version_minor_version_attachments_get**   { #objects_documents_doc_id_version_major_version_minor_version_attachments_get }
<a name="objects_documents_doc_id_version_major_version_minor_version_attachments_get"></a>

> `objects_documents_doc_id_version_major_version_minor_version_attachments_get(docId: String,majorVersion: String,minorVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Version Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_version_major_version_minor_version_attachments_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_version_major_version_minor_version_attachments_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_get**   { #objects_documents_doc_id_versions_get }
<a name="objects_documents_doc_id_versions_get"></a>

> `objects_documents_doc_id_versions_get(docId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get**   { #objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(docId: String,majorVersion: String,minorVersion: String,annotationId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Read Annotations by ID



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# annotationId: String = ""   Eg: annotationId_example
	# The annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
	annotationId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get**   { #objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(docId: String,majorVersion: String,minorVersion: String,annotationId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Read Replies of Parent Annotation



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# annotationId: String = ""   Eg: annotationId_example
	# The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
	annotationId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get**   { #objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Document Version Annotations to PDF



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post**   { #objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post }
<a name="objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Import Document Version Annotations from PDF



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_annotations_get**   { #objects_documents_doc_id_versions_major_version_minor_version_annotations_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_annotations_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_annotations_get(docId: String,majorVersion: String,minorVersion: String,limit = "",offset = "",annotationTypes = "",paginationId = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Read Annotations by Document Version and Type



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_annotations_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored.
	limit,
	# offset: String = ""   Eg: offset_example
	# This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset=201.
	offset,
	# annotationTypes: String = ""   Eg: annotationTypes_example
	# The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys` 
	annotationTypes,
	# paginationId: String = ""   Eg: paginationId_example
	# A unique identifier used to load requests with paginated results.
	paginationId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_annotations_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get**   { #objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(docId: String,majorVersion: String,minorVersion: String,attachmentId: String,attachmentVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Version Attachment Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The id field value of the attachment.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The version of the attachment.
	attachmentVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get**   { #objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(docId: String,majorVersion: String,minorVersion: String,attachmentId: String,attachmentVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Version Attachment Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The id of the document attachment to retrieve.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment.
	attachmentVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_delete**   { #objects_documents_doc_id_versions_major_version_minor_version_delete }
<a name="objects_documents_doc_id_versions_major_version_minor_version_delete"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_delete(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Document Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get**   { #objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Version Notes as CSV



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_events_post**   { #objects_documents_doc_id_versions_major_version_minor_version_events_post }
<a name="objects_documents_doc_id_versions_major_version_minor_version_events_post"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_events_post(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Document Event



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_events_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_events_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get**   { #objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Video Annotations



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(
	# docId: String = ""   Eg: docId_example
	# The video document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The video document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The video document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	# This `Accept` header only changes the format of the response in the case of an error. On `SUCCESS`, the HTTP Response Header `Content-Type` is set to `text/plain;charset=UnicodeLittle`.
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_file_get**   { #objects_documents_doc_id_versions_major_version_minor_version_file_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_file_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_file_get(docId: String,majorVersion: String,minorVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Version File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_file_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_get**   { #objects_documents_doc_id_versions_major_version_minor_version_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_get(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_put**   { #objects_documents_doc_id_versions_major_version_minor_version_put }
<a name="objects_documents_doc_id_versions_major_version_minor_version_put"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_put(docId: String,majorVersion: String,minorVersion: String,authorization = "",contentType = "",accept = "",xVaultAPIMigrationMode = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Document Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_put(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIMigrationMode: bool   Eg: true
	# When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_get**   { #objects_documents_doc_id_versions_major_version_minor_version_relationships_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_relationships_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_relationships_get(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Relationships



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_relationships_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_relationships_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_post**   { #objects_documents_doc_id_versions_major_version_minor_version_relationships_post }
<a name="objects_documents_doc_id_versions_major_version_minor_version_relationships_post"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_relationships_post(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Single Document Relationship



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_relationships_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_relationships_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete**   { #objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete }
<a name="objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(docId: String,majorVersion: String,minorVersion: String,relationshipId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Document Relationship



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# relationshipId: String = ""   Eg: relationshipId_example
	# The relationship id field value. See Retrieve Document Relationships.
	relationshipId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get**   { #objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(docId: String,majorVersion: String,minorVersion: String,relationshipId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Relationship



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# relationshipId: String = ""   Eg: relationshipId_example
	# The relationship id field value. See Retrieve Document Relationships.
	relationshipId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_get**   { #objects_documents_doc_id_versions_major_version_minor_version_renditions_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_renditions_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_renditions_get(docId: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Version Renditions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_renditions_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_renditions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete**   { #objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete }
<a name="objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(docId: String,majorVersion: String,minorVersion: String,renditionType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Document Version Rendition



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get**   { #objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(docId: String,majorVersion: String,minorVersion: String,renditionType: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Version Rendition File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post**   { #objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post }
<a name="objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(docId: String,majorVersion: String,minorVersion: String,renditionType: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Upload Document Version Rendition



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put**   { #objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put }
<a name="objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(docId: String,majorVersion: String,minorVersion: String,renditionType: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Replace Document Version Rendition



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# renditionType: String = ""   Eg: renditionType_example
	# The document rendition type.
	renditionType,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get**   { #objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get }
<a name="objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get"></a>

> `objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(docId: String,majorVersion: String,minorVersion: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Version Thumbnail File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(
	# docId: String = ""   Eg: docId_example
	# The document id field value.
	docId,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The document major_version_number__v field value.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The document minor_version_number__v field value.
	minorVersion,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_get**   { #objects_documents_get }
<a name="objects_documents_get"></a>

> `objects_documents_get(namedFilter = "",scope = "",versionscope = "",search = "",limit = "",sort = "",start = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_get(
	# namedFilter: String = ""   Eg: My Documents
	# Retrieves only documents which you have created.
	namedFilter,
	# scope: String = ""   Eg: contents
	# Searches only within the document content.
	scope,
	# versionscope: String = ""   Eg: all
	# Retrieves all document versions, rather than only the latest version.
	versionscope,
	# search: String = ""   Eg: {keyword}
	# Search for documents based on a {keyword} in searchable document fields.
	search,
	# limit: String = ""   Eg: limit_example
	# See VQL documentation for more information.
	limit,
	# sort: String = ""   Eg: sort_example
	# See VQL documentation for more information.
	sort,
	# start: String = ""   Eg: start_example
	# See VQL documentation for more information.
	start,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_id_roles_get**   { #objects_documents_id_roles_get }
<a name="objects_documents_id_roles_get"></a>

> `objects_documents_id_roles_get(id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Document Roles



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_id_roles_get(
	# id: String = ""   Eg: id_example
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_id_roles_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_id_roles_post**   { #objects_documents_id_roles_post }
<a name="objects_documents_id_roles_post"></a>

> `objects_documents_id_roles_post(id: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Assign Users & Groups to Roles on a Single Document



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_id_roles_post(
	# id: String = ""   Eg: id_example
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_id_roles_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_id_roles_role_name_get**   { #objects_documents_id_roles_role_name_get }
<a name="objects_documents_id_roles_role_name_get"></a>

> `objects_documents_id_roles_role_name_get(id: String,roleName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Role



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_id_roles_role_name_get(
	# id: String = ""   Eg: id_example
	# The document `id`.
	id,
	# roleName: String = ""   Eg: roleName_example
	# The name of the role to retrieve. For example, `owner__v`.
	roleName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_id_roles_role_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get**   { #objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get }
<a name="objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get"></a>

> `objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(id: String,majorVersion: String,minorVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document User Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(
	# id: String = ""   Eg: id_example
	# The document id field value from which to retrieve available user actions.
	id,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The major version number of the document.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The minor version number of the document.
	minorVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get**   { #objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get }
<a name="objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get"></a>

> `objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(id: String,majorVersion: String,minorVersion: String,nameV: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Entry Criteria



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(
	# id: String = ""   Eg: id_example
	# The document id field value from which to retrieve available user actions.
	id,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The major version number of the document.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The minor version number of the document.
	minorVersion,
	# nameV: String = ""   Eg: nameV_example
	# The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
	nameV,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put**   { #objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put }
<a name="objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put"></a>

> `objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(id: String,majorVersion: String,minorVersion: String,nameV: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Document User Action



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(
	# id: String = ""   Eg: id_example
	# The document id field value from which to retrieve available user actions.
	id,
	# majorVersion: String = ""   Eg: majorVersion_example
	# The major version number of the document.
	majorVersion,
	# minorVersion: String = ""   Eg: minorVersion_example
	# The minor version number of the document.
	minorVersion,
	# nameV: String = ""   Eg: nameV_example
	# The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
	nameV,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_lifecycle_actions_post**   { #objects_documents_lifecycle_actions_post }
<a name="objects_documents_lifecycle_actions_post"></a>

> `objects_documents_lifecycle_actions_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve User Actions on Multiple Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_lifecycle_actions_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_lifecycle_actions_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_lifecycle_actions_user_action_name_put**   { #objects_documents_lifecycle_actions_user_action_name_put }
<a name="objects_documents_lifecycle_actions_user_action_name_put"></a>

> `objects_documents_lifecycle_actions_user_action_name_put(userActionName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Bulk Document User Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_lifecycle_actions_user_action_name_put(
	# userActionName: String = ""   Eg: userActionName_example
	# The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint.
	userActionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_lifecycle_actions_user_action_name_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_post**   { #objects_documents_post }
<a name="objects_documents_post"></a>

> `objects_documents_post(authorization = "",accept = "",xVaultAPIMigrationMode = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Single Document



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIMigrationMode: bool   Eg: true
	# When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_relationships_batch_delete**   { #objects_documents_relationships_batch_delete }
<a name="objects_documents_relationships_batch_delete"></a>

> `objects_documents_relationships_batch_delete(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Multiple Document Relationships



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_relationships_batch_delete(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_relationships_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_relationships_batch_post**   { #objects_documents_relationships_batch_post }
<a name="objects_documents_relationships_batch_post"></a>

> `objects_documents_relationships_batch_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Multiple Document Relationships



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_relationships_batch_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_relationships_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_renditions_batch_delete**   { #objects_documents_renditions_batch_delete }
<a name="objects_documents_renditions_batch_delete"></a>

> `objects_documents_renditions_batch_delete(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Multiple Document Renditions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_renditions_batch_delete(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_renditions_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_renditions_batch_post**   { #objects_documents_renditions_batch_post }
<a name="objects_documents_renditions_batch_post"></a>

> `objects_documents_renditions_batch_post(idParam = "",largeSizeAsset = "",authorization = "",accept = "",contentType = "",xVaultAPIMigrationMode = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Add Multiple Document Renditions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_renditions_batch_post(
	# idParam: String = ""   Eg: idParam_example
	# If you’re identifying documents in your input by their external ID
	idParam,
	# largeSizeAsset: String = ""   Eg: largeSizeAsset_example
	# If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
	largeSizeAsset,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIMigrationMode: bool   Eg: true
	# Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_renditions_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_roles_batch_delete**   { #objects_documents_roles_batch_delete }
<a name="objects_documents_roles_batch_delete"></a>

> `objects_documents_roles_batch_delete(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Remove Users and Groups from Roles on Multiple Documents & Binders



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_roles_batch_delete(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_roles_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_roles_batch_post**   { #objects_documents_roles_batch_post }
<a name="objects_documents_roles_batch_post"></a>

> `objects_documents_roles_batch_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Assign Users & Groups to Roles on Multiple Documents & Binders



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_roles_batch_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_roles_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_templates_get**   { #objects_documents_templates_get }
<a name="objects_documents_templates_get"></a>

> `objects_documents_templates_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Template Collection



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_templates_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_templates_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_templates_post**   { #objects_documents_templates_post }
<a name="objects_documents_templates_post"></a>

> `objects_documents_templates_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Single Document Template



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_templates_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_templates_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_templates_put**   { #objects_documents_templates_put }
<a name="objects_documents_templates_put"></a>

> `objects_documents_templates_put(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Multiple Document Templates



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_templates_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_templates_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_templates_template_name_delete**   { #objects_documents_templates_template_name_delete }
<a name="objects_documents_templates_template_name_delete"></a>

> `objects_documents_templates_template_name_delete(templateName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Basic Document Template



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_templates_template_name_delete(
	# templateName: String = ""   Eg: templateName_example
	# The document template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_templates_template_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_templates_template_name_file_get**   { #objects_documents_templates_template_name_file_get }
<a name="objects_documents_templates_template_name_file_get"></a>

> `objects_documents_templates_template_name_file_get(templateName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Document Template File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_templates_template_name_file_get(
	# templateName: String = ""   Eg: templateName_example
	# The document template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_templates_template_name_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_templates_template_name_get**   { #objects_documents_templates_template_name_get }
<a name="objects_documents_templates_template_name_get"></a>

> `objects_documents_templates_template_name_get(templateName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Document Template Attributes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_templates_template_name_get(
	# templateName: String = ""   Eg: templateName_example
	# The document template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_templates_template_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_templates_template_name_put**   { #objects_documents_templates_template_name_put }
<a name="objects_documents_templates_template_name_put"></a>

> `objects_documents_templates_template_name_put(templateName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Single Document Template



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_templates_template_name_put(
	# templateName: String = ""   Eg: templateName_example
	# The document template name__v field value.
	templateName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_templates_template_name_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_tokens_post**   { #objects_documents_tokens_post }
<a name="objects_documents_tokens_post"></a>

> `objects_documents_tokens_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Document Tokens



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_tokens_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_tokens_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_versions_batch_actions_fileextract_post**   { #objects_documents_versions_batch_actions_fileextract_post }
<a name="objects_documents_versions_batch_actions_fileextract_post"></a>

> `objects_documents_versions_batch_actions_fileextract_post(source = null,renditions = null,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Document Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_versions_batch_actions_fileextract_post(
	# source: bool   Eg: true
	# Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
	source,
	# renditions: bool   Eg: false
	# Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
	renditions,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_versions_batch_actions_fileextract_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_versions_batch_delete**   { #objects_documents_versions_batch_delete }
<a name="objects_documents_versions_batch_delete"></a>

> `objects_documents_versions_batch_delete(idParam = "",authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Multiple Document Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_versions_batch_delete(
	# idParam: String = ""   Eg: idParam_example
	# If you’re identifying documents in your input by their external ID
	idParam,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_versions_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_documents_versions_batch_post**   { #objects_documents_versions_batch_post }
<a name="objects_documents_versions_batch_post"></a>

> `objects_documents_versions_batch_post(idParam = "",authorization = "",accept = "",contentType = "",xVaultAPIMigrationMode = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Multiple Document Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_documents_versions_batch_post(
	# idParam: String = ""   Eg: external_id__v
	# If you’re identifying documents in your input by their external ID
	idParam,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIMigrationMode: String = ""   Eg: xVaultAPIMigrationMode_example
	# Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the `status__v` field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
	xVaultAPIMigrationMode,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_documents_versions_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_domain_get**   { #objects_domain_get }
<a name="objects_domain_get"></a>

> `objects_domain_get(includeApplication = null,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Domain Information



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_domain_get(
	# includeApplication: bool   Eg: true
	# To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
	includeApplication,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_domain_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_domains_get**   { #objects_domains_get }
<a name="objects_domains_get"></a>

> `objects_domains_get(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Domains



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_domains_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_domains_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_edl_matched_documents_batch_actions_add_post**   { #objects_edl_matched_documents_batch_actions_add_post }
<a name="objects_edl_matched_documents_batch_actions_add_post"></a>

> `objects_edl_matched_documents_batch_actions_add_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Add EDL Matched Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_edl_matched_documents_batch_actions_add_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_edl_matched_documents_batch_actions_add_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_edl_matched_documents_batch_actions_remove_post**   { #objects_edl_matched_documents_batch_actions_remove_post }
<a name="objects_edl_matched_documents_batch_actions_remove_post"></a>

> `objects_edl_matched_documents_batch_actions_remove_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Remove EDL Matched Documents



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_edl_matched_documents_batch_actions_remove_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_edl_matched_documents_batch_actions_remove_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_groups_auto_get**   { #objects_groups_auto_get }
<a name="objects_groups_auto_get"></a>

> `objects_groups_auto_get(limit = "",offset = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Auto Managed Groups



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_groups_auto_get(
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
	limit,
	# offset: String = ""   Eg: offset_example
	# Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
	offset,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_groups_auto_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_groups_get**   { #objects_groups_get }
<a name="objects_groups_get"></a>

> `objects_groups_get(includeImplied = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Groups



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_groups_get(
	# includeImplied: String = ""   Eg: includeImplied_example
	# When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
	includeImplied,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_groups_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_groups_group_id_delete**   { #objects_groups_group_id_delete }
<a name="objects_groups_group_id_delete"></a>

> `objects_groups_group_id_delete(groupId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Group



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_groups_group_id_delete(
	# groupId: String = ""   Eg: groupId_example
	# The group id field value.
	groupId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_groups_group_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_groups_group_id_get**   { #objects_groups_group_id_get }
<a name="objects_groups_group_id_get"></a>

> `objects_groups_group_id_get(groupId: String,includeImplied = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Group



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_groups_group_id_get(
	# groupId: String = ""   Eg: groupId_example
	# The group id field value.
	groupId,
	# includeImplied: bool   Eg: true
	# When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
	includeImplied,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_groups_group_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_groups_group_id_put**   { #objects_groups_group_id_put }
<a name="objects_groups_group_id_put"></a>

> `objects_groups_group_id_put(groupId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Group



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_groups_group_id_put(
	# groupId: String = ""   Eg: groupId_example
	# The group id field value.
	groupId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_groups_group_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_groups_post**   { #objects_groups_post }
<a name="objects_groups_post"></a>

> `objects_groups_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Group 



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_groups_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_groups_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_licenses_get**   { #objects_licenses_get }
<a name="objects_licenses_get"></a>

> `objects_licenses_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Application License Usage



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_licenses_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_licenses_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_actions_get**   { #objects_objectworkflows_actions_get }
<a name="objects_objectworkflows_actions_get"></a>

> `objects_objectworkflows_actions_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Multi-Record Workflows



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_actions_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_actions_workflow_name_get**   { #objects_objectworkflows_actions_workflow_name_get }
<a name="objects_objectworkflows_actions_workflow_name_get"></a>

> `objects_objectworkflows_actions_workflow_name_get(workflowName: String,authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Multi-Record Workflow Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_actions_workflow_name_get(
	# workflowName: String = ""   Eg: workflowName_example
	workflowName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_actions_workflow_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_actions_workflow_name_post**   { #objects_objectworkflows_actions_workflow_name_post }
<a name="objects_objectworkflows_actions_workflow_name_post"></a>

> `objects_objectworkflows_actions_workflow_name_post(workflowName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Multi-Record Workflow



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_actions_workflow_name_post(
	# workflowName: String = ""   Eg: workflowName_example
	workflowName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_actions_workflow_name_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_get**   { #objects_objectworkflows_get }
<a name="objects_objectworkflows_get"></a>

> `objects_objectworkflows_get(objectV = "",recordIdV = "",participant = "",statusV = "",offset = "",pageSize = "",loc = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflows



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_get(
	# objectV: String = ""   Eg: objectV_example
	# To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. 
	objectV,
	# recordIdV: String = ""   Eg: recordIdV_example
	# To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. 
	recordIdV,
	# participant: String = ""   Eg: participant_example
	# To retrieve all workflows available to a particular user, include the user id field value as ?participant={id}. To retrieve your own workflows, set this value to ?participant=me. This parameter is required when the object__v and record_id__v parameters are not used. 
	participant,
	# statusV: String = ""   Eg: statusV_example
	# To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v=active__v, status__v=active__v,completed__v. Workflows with `status__v=active__v` are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v
	statusV,
	# offset: String = ""   Eg: offset_example
	# This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. 
	offset,
	# pageSize: String = ""   Eg: pageSize_example
	# This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. 
	pageSize,
	# loc: String = ""   Eg: loc_example
	# When localized (translated) strings are available, retrieve them by including ?loc=true. 
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_get**   { #objects_objectworkflows_tasks_get }
<a name="objects_objectworkflows_tasks_get"></a>

> `objects_objectworkflows_tasks_get(objectV = "",recordIdV = "",assigneeV = "",statusV = "",offset = "",pageSize = "",loc = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflow Tasks



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_get(
	# objectV: String = ""   Eg: objectV_example
	# To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used.
	objectV,
	# recordIdV: String = ""   Eg: recordIdV_example
	# To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used.
	recordIdV,
	# assigneeV: String = ""   Eg: assigneeV_example
	# To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v={id}. To retrieve your own workflow tasks, set this value to ?assignee__v=me. This parameter is required when the object__v and record_id__v parameters are not used. 
	assigneeV,
	# statusV: String = ""   Eg: statusV_example
	# To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v=available__v or ?status__v=available__v,completed__v. 
	statusV,
	# offset: String = ""   Eg: offset_example
	# This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. 
	offset,
	# pageSize: String = ""   Eg: pageSize_example
	# This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. 
	pageSize,
	# loc: String = ""   Eg: loc_example
	# When localized (translated) strings are available, retrieve them by including ?loc=true. 
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_accept_post**   { #objects_objectworkflows_tasks_task_id_actions_accept_post }
<a name="objects_objectworkflows_tasks_task_id_actions_accept_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_accept_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Accept Single Record Workflow Task



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_accept_post(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_accept_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_cancel_post**   { #objects_objectworkflows_tasks_task_id_actions_cancel_post }
<a name="objects_objectworkflows_tasks_task_id_actions_cancel_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_cancel_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Cancel Workflow Task



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_cancel_post(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_cancel_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_complete_post**   { #objects_objectworkflows_tasks_task_id_actions_complete_post }
<a name="objects_objectworkflows_tasks_task_id_actions_complete_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_complete_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Complete Single Record Workflow Task



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_complete_post(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_complete_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_get**   { #objects_objectworkflows_tasks_task_id_actions_get }
<a name="objects_objectworkflows_tasks_task_id_actions_get"></a>

> `objects_objectworkflows_tasks_task_id_actions_get(taskId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflow Task Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_get(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_mdwaccept_post**   { #objects_objectworkflows_tasks_task_id_actions_mdwaccept_post }
<a name="objects_objectworkflows_tasks_task_id_actions_mdwaccept_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Accept Multi-item Workflow Task



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_mdwaccept_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post**   { #objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post }
<a name="objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Complete Multi-item Workflow Task



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post**   { #objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post }
<a name="objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Manage Multi-Item Workflow Content



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_mdwreassign_post**   { #objects_objectworkflows_tasks_task_id_actions_mdwreassign_post }
<a name="objects_objectworkflows_tasks_task_id_actions_mdwreassign_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Reassign Multi-item Workflow Task



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(
	# taskId: String = ""   Eg: taskId_example
	# The id of the task to reassign.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_mdwreassign_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_reassign_post**   { #objects_objectworkflows_tasks_task_id_actions_reassign_post }
<a name="objects_objectworkflows_tasks_task_id_actions_reassign_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_reassign_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Reassign Single Record Workflow Task



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_reassign_post(
	# taskId: String = ""   Eg: taskId_example
	# The id of the task to reassign.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_reassign_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_task_action_get**   { #objects_objectworkflows_tasks_task_id_actions_task_action_get }
<a name="objects_objectworkflows_tasks_task_id_actions_task_action_get"></a>

> `objects_objectworkflows_tasks_task_id_actions_task_action_get(taskId: String,taskAction: String,loc = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflow Task Action Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_task_action_get(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# taskAction: String = ""   Eg: taskAction_example
	# The name of the task action retrieved from Retrieve Workflow Task Actions.
	taskAction,
	# loc: String = ""   Eg: loc_example
	# When localized (translated) strings are available, retrieve them by including loc=true. 
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_task_action_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_undoaccept_post**   { #objects_objectworkflows_tasks_task_id_actions_undoaccept_post }
<a name="objects_objectworkflows_tasks_task_id_actions_undoaccept_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_undoaccept_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Undo Workflow Task Acceptance



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_undoaccept_post(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_undoaccept_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_actions_updateduedate_post**   { #objects_objectworkflows_tasks_task_id_actions_updateduedate_post }
<a name="objects_objectworkflows_tasks_task_id_actions_updateduedate_post"></a>

> `objects_objectworkflows_tasks_task_id_actions_updateduedate_post(taskId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Workflow Task Due Date



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_actions_updateduedate_post(
	# taskId: String = ""   Eg: taskId_example
	# The id of the task.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_actions_updateduedate_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_tasks_task_id_get**   { #objects_objectworkflows_tasks_task_id_get }
<a name="objects_objectworkflows_tasks_task_id_get"></a>

> `objects_objectworkflows_tasks_task_id_get(taskId: String,loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflow Task Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_tasks_task_id_get(
	# taskId: String = ""   Eg: taskId_example
	# The task id field value.
	taskId,
	# loc: bool   Eg: true
	# When localized (translated) strings are available, retrieve them by including loc=true.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_tasks_task_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_workflow_id_actions_get**   { #objects_objectworkflows_workflow_id_actions_get }
<a name="objects_objectworkflows_workflow_id_actions_get"></a>

> `objects_objectworkflows_workflow_id_actions_get(workflowId: String,loc = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflow Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_workflow_id_actions_get(
	# workflowId: String = ""   Eg: workflowId_example
	# The workflow id field value.
	workflowId,
	# loc: String = ""   Eg: loc_example
	# When localized (translated) strings are available, retrieve them by including loc=true. 
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_workflow_id_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_workflow_id_actions_workflow_action_get**   { #objects_objectworkflows_workflow_id_actions_workflow_action_get }
<a name="objects_objectworkflows_workflow_id_actions_workflow_action_get"></a>

> `objects_objectworkflows_workflow_id_actions_workflow_action_get(workflowId: String,workflowAction: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflow Action Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_workflow_id_actions_workflow_action_get(
	# workflowId: String = ""   Eg: workflowId_example
	# The workflow id field value.
	workflowId,
	# workflowAction: String = ""   Eg: workflowAction_example
	# The workflow action name retrieved from Retrieve Workflow Actions.
	workflowAction,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_workflow_id_actions_workflow_action_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_workflow_id_actions_workflow_action_post**   { #objects_objectworkflows_workflow_id_actions_workflow_action_post }
<a name="objects_objectworkflows_workflow_id_actions_workflow_action_post"></a>

> `objects_objectworkflows_workflow_id_actions_workflow_action_post(workflowId: String,workflowAction: String,documentsSys = "",authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Workflow Action



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_workflow_id_actions_workflow_action_post(
	# workflowId: String = ""   Eg: workflowId_example
	# The workflow id field value.
	workflowId,
	# workflowAction: String = ""   Eg: workflowAction_example
	# The workflow action name retrieved from Retrieve Workflow Actions.
	workflowAction,
	# documentsSys: String = ""   Eg: documentsSys_example
	# Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
	documentsSys,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_workflow_id_actions_workflow_action_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_objectworkflows_workflow_id_get**   { #objects_objectworkflows_workflow_id_get }
<a name="objects_objectworkflows_workflow_id_get"></a>

> `objects_objectworkflows_workflow_id_get(workflowId: String,loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Workflow Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_objectworkflows_workflow_id_get(
	# workflowId: String = ""   Eg: workflowId_example
	# The workflow id field value.
	workflowId,
	# loc: bool   Eg: true
	# When localized (translated) strings are available, retrieve them by including loc=true.
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_objectworkflows_workflow_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_picklists_get**   { #objects_picklists_get }
<a name="objects_picklists_get"></a>

> `objects_picklists_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Picklists



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_picklists_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_picklists_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_picklists_picklist_name_get**   { #objects_picklists_picklist_name_get }
<a name="objects_picklists_picklist_name_get"></a>

> `objects_picklists_picklist_name_get(picklistName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Picklist Values



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_picklists_picklist_name_get(
	# picklistName: String = ""   Eg: picklistName_example
	# The picklist name field value (license_type__v, product_family__c, region__c, etc.)
	picklistName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_picklists_picklist_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_picklists_picklist_name_picklist_value_name_delete**   { #objects_picklists_picklist_name_picklist_value_name_delete }
<a name="objects_picklists_picklist_name_picklist_value_name_delete"></a>

> `objects_picklists_picklist_name_picklist_value_name_delete(picklistName: String,picklistValueName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Inactivate Picklist Value



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_picklists_picklist_name_picklist_value_name_delete(
	# picklistName: String = ""   Eg: picklistName_example
	# The picklist name field value (license_type__v, product_family__c, region__c, etc.)
	picklistName,
	# picklistValueName: String = ""   Eg: picklistValueName_example
	# The picklist value name field value (north_america__c, south_america__c, etc.)
	picklistValueName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_picklists_picklist_name_picklist_value_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_picklists_picklist_name_picklist_value_name_put**   { #objects_picklists_picklist_name_picklist_value_name_put }
<a name="objects_picklists_picklist_name_picklist_value_name_put"></a>

> `objects_picklists_picklist_name_picklist_value_name_put(picklistName: String,picklistValueName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Picklist Value



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_picklists_picklist_name_picklist_value_name_put(
	# picklistName: String = ""   Eg: picklistName_example
	# The picklist name field value (license_type__v, product_family__c, region__c, etc.)
	picklistName,
	# picklistValueName: String = ""   Eg: picklistValueName_example
	# The picklist value name field value (north_america__c, south_america__c, etc.)
	picklistValueName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_picklists_picklist_name_picklist_value_name_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_picklists_picklist_name_post**   { #objects_picklists_picklist_name_post }
<a name="objects_picklists_picklist_name_post"></a>

> `objects_picklists_picklist_name_post(picklistName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Picklist Values



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_picklists_picklist_name_post(
	# picklistName: String = ""   Eg: picklistName_example
	# The picklist name field value (license_type__v, product_family__c, region__c, etc.)
	picklistName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_picklists_picklist_name_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_picklists_picklist_name_put**   { #objects_picklists_picklist_name_put }
<a name="objects_picklists_picklist_name_put"></a>

> `objects_picklists_picklist_name_put(picklistName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Picklist Value Label



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_picklists_picklist_name_put(
	# picklistName: String = ""   Eg: picklistName_example
	# The picklist name field value (license_type__v, product_family__c, region__c, etc.)
	picklistName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_picklists_picklist_name_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_actions_buildproduction_post**   { #objects_sandbox_actions_buildproduction_post }
<a name="objects_sandbox_actions_buildproduction_post"></a>

> `objects_sandbox_actions_buildproduction_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Build Production Vault



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_actions_buildproduction_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_actions_buildproduction_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_actions_promoteproduction_post**   { #objects_sandbox_actions_promoteproduction_post }
<a name="objects_sandbox_actions_promoteproduction_post"></a>

> `objects_sandbox_actions_promoteproduction_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Promote to Production



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_actions_promoteproduction_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_actions_promoteproduction_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_actions_recheckusage_post**   { #objects_sandbox_actions_recheckusage_post }
<a name="objects_sandbox_actions_recheckusage_post"></a>

> `objects_sandbox_actions_recheckusage_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Recheck Sandbox Usage Limit



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_actions_recheckusage_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_actions_recheckusage_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_batch_changesize_post**   { #objects_sandbox_batch_changesize_post }
<a name="objects_sandbox_batch_changesize_post"></a>

> `objects_sandbox_batch_changesize_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Change Sandbox Size



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_batch_changesize_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_batch_changesize_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_entitlements_set_post**   { #objects_sandbox_entitlements_set_post }
<a name="objects_sandbox_entitlements_set_post"></a>

> `objects_sandbox_entitlements_set_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Set Sandbox Entitlements



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_entitlements_set_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_entitlements_set_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_get**   { #objects_sandbox_get }
<a name="objects_sandbox_get"></a>

> `objects_sandbox_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Sandboxes



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_name_delete**   { #objects_sandbox_name_delete }
<a name="objects_sandbox_name_delete"></a>

> `objects_sandbox_name_delete(name: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Sandbox



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_name_delete(
	# name: String = ""   Eg: name_example
	# The name of the sandbox vault to delete. This is the name which appears on the My Vaults page.
	name,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_post**   { #objects_sandbox_post }
<a name="objects_sandbox_post"></a>

> `objects_sandbox_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create or Refresh Sandbox



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_snapshot_api_name_actions_update_post**   { #objects_sandbox_snapshot_api_name_actions_update_post }
<a name="objects_sandbox_snapshot_api_name_actions_update_post"></a>

> `objects_sandbox_snapshot_api_name_actions_update_post(apiName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Sandbox Snapshot



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_snapshot_api_name_actions_update_post(
	# apiName: String = ""   Eg: apiName_example
	# The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
	apiName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_snapshot_api_name_actions_update_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_snapshot_api_name_actions_upgrade_post**   { #objects_sandbox_snapshot_api_name_actions_upgrade_post }
<a name="objects_sandbox_snapshot_api_name_actions_upgrade_post"></a>

> `objects_sandbox_snapshot_api_name_actions_upgrade_post(apiName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Upgrade Sandbox Snapshot



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_snapshot_api_name_actions_upgrade_post(
	# apiName: String = ""   Eg: apiName_example
	# The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
	apiName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_snapshot_api_name_actions_upgrade_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_snapshot_api_name_delete**   { #objects_sandbox_snapshot_api_name_delete }
<a name="objects_sandbox_snapshot_api_name_delete"></a>

> `objects_sandbox_snapshot_api_name_delete(apiName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Sandbox Snapshot



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_snapshot_api_name_delete(
	# apiName: String = ""   Eg: apiName_example
	# The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
	apiName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_snapshot_api_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_snapshot_get**   { #objects_sandbox_snapshot_get }
<a name="objects_sandbox_snapshot_get"></a>

> `objects_sandbox_snapshot_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Sandbox Snapshots



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_snapshot_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_snapshot_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_snapshot_post**   { #objects_sandbox_snapshot_post }
<a name="objects_sandbox_snapshot_post"></a>

> `objects_sandbox_snapshot_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Sandbox Snapshot



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_snapshot_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_snapshot_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_vault_id_actions_refresh_post**   { #objects_sandbox_vault_id_actions_refresh_post }
<a name="objects_sandbox_vault_id_actions_refresh_post"></a>

> `objects_sandbox_vault_id_actions_refresh_post(vaultId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Refresh Sandbox from Snapshot



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_vault_id_actions_refresh_post(
	# vaultId: String = ""   Eg: vaultId_example
	# The Vault ID of the sandbox to be refreshed.
	vaultId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_vault_id_actions_refresh_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_sandbox_vault_id_get**   { #objects_sandbox_vault_id_get }
<a name="objects_sandbox_vault_id_get"></a>

> `objects_sandbox_vault_id_get(vaultId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Sandbox Details by ID



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_sandbox_vault_id_get(
	# vaultId: String = ""   Eg: vaultId_example
	vaultId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_sandbox_vault_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_securitypolicies_get**   { #objects_securitypolicies_get }
<a name="objects_securitypolicies_get"></a>

> `objects_securitypolicies_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Security Policies



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_securitypolicies_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_securitypolicies_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_securitypolicies_security_policy_name_get**   { #objects_securitypolicies_security_policy_name_get }
<a name="objects_securitypolicies_security_policy_name_get"></a>

> `objects_securitypolicies_security_policy_name_get(securityPolicyName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Security Policy



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_securitypolicies_security_policy_name_get(
	# securityPolicyName: String = ""   Eg: securityPolicyName_example
	# Security policy name__v field value (retrieved from previous request). This is typically a numeric value.
	securityPolicyName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_securitypolicies_security_policy_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_get**   { #objects_users_get }
<a name="objects_users_get"></a>

> `objects_users_get(vaults = "",excludeVaultMembership = "",excludeAppLicensing = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Users



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_get(
	# vaults: String = ""   Eg: all
	# Retrieve all users assigned to all Vaults in your domain.
	vaults,
	# excludeVaultMembership: String = ""   Eg: excludeVaultMembership_example
	# Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
	excludeVaultMembership,
	# excludeAppLicensing: String = ""   Eg: excludeAppLicensing_example
	# Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
	excludeAppLicensing,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_id_get**   { #objects_users_id_get }
<a name="objects_users_id_get"></a>

> `objects_users_id_get(id: String,excludeVaultMembership = "",excludeAppLicensing = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve User



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_id_get(
	# id: String = ""   Eg: id_example
	# The user id field value. Use the value me to get information for the currently authenticated user.
	id,
	# excludeVaultMembership: String = ""   Eg: excludeVaultMembership_example
	# Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
	excludeVaultMembership,
	# excludeAppLicensing: String = ""   Eg: excludeAppLicensing_example
	# Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
	excludeAppLicensing,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_id_permissions_get**   { #objects_users_id_permissions_get }
<a name="objects_users_id_permissions_get"></a>

> `objects_users_id_permissions_get(id: String,filter = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve User Permissions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_id_permissions_get(
	# id: String = ""   Eg: id_example
	# The ID of the user. Use the value me to retrieve information for the currently authenticated user.
	id,
	# filter: String = ""   Eg: filter_example
	# Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
	filter,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_id_permissions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_id_put**   { #objects_users_id_put }
<a name="objects_users_id_put"></a>

> `objects_users_id_put(id: String,authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Single User



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_id_put(
	# id: String = ""   Eg: id_example
	# The user id field value. Use the value me to get information for the currently authenticated user.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_me_get**   { #objects_users_me_get }
<a name="objects_users_me_get"></a>

> `objects_users_me_get(excludeVaultMembership = "",excludeAppLicensing = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Validate Session User



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_me_get(
	# excludeVaultMembership: String = ""   Eg: excludeVaultMembership_example
	# Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
	excludeVaultMembership,
	# excludeAppLicensing: String = ""   Eg: excludeAppLicensing_example
	# Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
	excludeAppLicensing,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_me_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_me_password_post**   { #objects_users_me_password_post }
<a name="objects_users_me_password_post"></a>

> `objects_users_me_password_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Change My Password



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_me_password_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_me_password_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_me_permissions_get**   { #objects_users_me_permissions_get }
<a name="objects_users_me_permissions_get"></a>

> `objects_users_me_permissions_get(filter = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve My User Permissions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_me_permissions_get(
	# filter: String = ""   Eg: filter_example
	# Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
	filter,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_me_permissions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_me_put**   { #objects_users_me_put }
<a name="objects_users_me_put"></a>

> `objects_users_me_put(authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update My User



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_me_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_me_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_post**   { #objects_users_post }
<a name="objects_users_post"></a>

> `objects_users_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Single User



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_put**   { #objects_users_put }
<a name="objects_users_put"></a>

> `objects_users_put(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Multiple Users



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_user_id_delete**   { #objects_users_user_id_delete }
<a name="objects_users_user_id_delete"></a>

> `objects_users_user_id_delete(userId: String,domain = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Disable User



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_user_id_delete(
	# userId: String = ""   Eg: userId_example
	# The user id field value. 
	userId,
	# domain: bool   Eg: true
	# When true, this disables the user account in all vaults in the domain.
	domain,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_user_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_users_user_id_vault_membership_vault_id_put**   { #objects_users_user_id_vault_membership_vault_id_put }
<a name="objects_users_user_id_vault_membership_vault_id_put"></a>

> `objects_users_user_id_vault_membership_vault_id_put(userId: String,vaultId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Vault Membership



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_users_user_id_vault_membership_vault_id_put(
	# userId: String = ""   Eg: userId_example
	# The user id field value.
	userId,
	# vaultId: String = ""   Eg: vaultId_example
	# The system-managed id field value assigned to each vault in the domain.
	vaultId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_users_user_id_vault_membership_vault_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_vault_actions_compare_post**   { #objects_vault_actions_compare_post }
<a name="objects_vault_actions_compare_post"></a>

> `objects_vault_actions_compare_post(authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Vault Compare



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_vault_actions_compare_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_vault_actions_compare_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **objects_vault_actions_configreport_post**   { #objects_vault_actions_configreport_post }
<a name="objects_vault_actions_configreport_post"></a>

> `objects_vault_actions_configreport_post(authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Vault Configuration Report



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.objects_vault_actions_configreport_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "objects_vault_actions_configreport_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **query_components_post**   { #query_components_post }
<a name="query_components_post"></a>

> `query_components_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Component Definition Query



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.query_components_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "query_components_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **query_next_page_post**   { #query_next_page_post }
<a name="query_next_page_post"></a>

> `query_next_page_post(nextPage: String,authorization = "",accept = "",xVaultAPIDescribeQuery = null,contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Next Page URL



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.query_next_page_post(
	# nextPage: String = ""   Eg: nextPage_example
	nextPage,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIDescribeQuery: bool   Eg: true
	xVaultAPIDescribeQuery,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "query_next_page_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **query_post**   { #query_post }
<a name="query_post"></a>

> `query_post(authorization = "",accept = "",xVaultAPIDescribeQuery = null,contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Submitting a Query



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.query_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIDescribeQuery: bool   Eg: true
	xVaultAPIDescribeQuery,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "query_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **query_previous_page_post**   { #query_previous_page_post }
<a name="query_previous_page_post"></a>

> `query_previous_page_post(previousPage: String,authorization = "",accept = "",xVaultAPIDescribeQuery = null,contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Previous Page URL



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.query_previous_page_post(
	# previousPage: String = ""   Eg: previousPage_example
	previousPage,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIDescribeQuery: bool   Eg: true
	xVaultAPIDescribeQuery,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "query_previous_page_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_me_get**   { #scim_v2_me_get }
<a name="scim_v2_me_get"></a>

> `scim_v2_me_get(attributes = "",excludedAttributes = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Current User with SCIM



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_me_get(
	# attributes: String = ""   Eg: attributes_example
	# Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
	attributes,
	# excludedAttributes: String = ""   Eg: excludedAttributes_example
	# Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
	excludedAttributes,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_me_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_me_put**   { #scim_v2_me_put }
<a name="scim_v2_me_put"></a>

> `scim_v2_me_put(attributes = "",excludedAttributes = "",authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Current User with SCIM



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_me_put(
	# attributes: String = ""   Eg: attributes_example
	# Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
	attributes,
	# excludedAttributes: String = ""   Eg: excludedAttributes_example
	# Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
	excludedAttributes,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# contentType: String = ""   Eg: application/scim+json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_me_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_resource_types_get**   { #scim_v2_resource_types_get }
<a name="scim_v2_resource_types_get"></a>

> `scim_v2_resource_types_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All SCIM Resource Types



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_resource_types_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_resource_types_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_resource_types_type_get**   { #scim_v2_resource_types_type_get }
<a name="scim_v2_resource_types_type_get"></a>

> `scim_v2_resource_types_type_get(type: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Single SCIM Resource Type



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_resource_types_type_get(
	# type: String = ""   Eg: type_example
	# A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value.
	type,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_resource_types_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_schemas_get**   { #scim_v2_schemas_get }
<a name="scim_v2_schemas_get"></a>

> `scim_v2_schemas_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All SCIM Schema Information



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_schemas_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_schemas_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_schemas_id_get**   { #scim_v2_schemas_id_get }
<a name="scim_v2_schemas_id_get"></a>

> `scim_v2_schemas_id_get(id: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Single SCIM Schema Information



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_schemas_id_get(
	# id: String = ""   Eg: id_example
	# The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_schemas_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_service_provider_config_get**   { #scim_v2_service_provider_config_get }
<a name="scim_v2_service_provider_config_get"></a>

> `scim_v2_service_provider_config_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve SCIM Provider



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_service_provider_config_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_service_provider_config_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_type_get**   { #scim_v2_type_get }
<a name="scim_v2_type_get"></a>

> `scim_v2_type_get(type: String,filter = "",attributes = "",excludedAttributes = "",sortBy = "",sortOrder = "",startIndex = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve SCIM Resources



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_type_get(
	# type: String = ""   Eg: type_example
	# The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
	type,
	# filter: String = ""   Eg: filter_example
	# Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
	filter,
	# attributes: String = ""   Eg: attributes_example
	# Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
	attributes,
	# excludedAttributes: String = ""   Eg: excludedAttributes_example
	# Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
	excludedAttributes,
	# sortBy: String = ""   Eg: sortBy_example
	# Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
	sortBy,
	# sortOrder: String = ""   Eg: sortOrder_example
	# Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
	sortOrder,
	# startIndex: String = ""   Eg: startIndex_example
	# Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
	startIndex,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_type_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_type_id_get**   { #scim_v2_type_id_get }
<a name="scim_v2_type_id_get"></a>

> `scim_v2_type_id_get(type: String,id: String,attributes = "",excludedAttributes = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Single SCIM Resource



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_type_id_get(
	# type: String = ""   Eg: type_example
	# The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
	type,
	# id: String = ""   Eg: id_example
	# The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v.
	id,
	# attributes: String = ""   Eg: attributes_example
	# Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
	attributes,
	# excludedAttributes: String = ""   Eg: excludedAttributes_example
	# Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
	excludedAttributes,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_type_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_users_get**   { #scim_v2_users_get }
<a name="scim_v2_users_get"></a>

> `scim_v2_users_get(filter = "",attributes = "",excludedAttributes = "",sortBy = "",sortOrder = "",count = "",startIndex = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Users with SCIM



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_users_get(
	# filter: String = ""   Eg: filter_example
	# Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
	filter,
	# attributes: String = ""   Eg: attributes_example
	# Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
	attributes,
	# excludedAttributes: String = ""   Eg: excludedAttributes_example
	# Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
	excludedAttributes,
	# sortBy: String = ""   Eg: sortBy_example
	# Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
	sortBy,
	# sortOrder: String = ""   Eg: sortOrder_example
	# Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending.
	sortOrder,
	# count: String = ""   Eg: count_example
	# Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
	count,
	# startIndex: String = ""   Eg: startIndex_example
	# Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
	startIndex,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_users_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_users_id_get**   { #scim_v2_users_id_get }
<a name="scim_v2_users_id_get"></a>

> `scim_v2_users_id_get(id: String,filter = "",attributes = "",excludedAttributes = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Single User with SCIM



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_users_id_get(
	# id: String = ""   Eg: id_example
	# The id of the user you wish to update.
	id,
	# filter: String = ""   Eg: filter_example
	# Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
	filter,
	# attributes: String = ""   Eg: attributes_example
	# Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
	attributes,
	# excludedAttributes: String = ""   Eg: excludedAttributes_example
	# Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
	excludedAttributes,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_users_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_users_id_put**   { #scim_v2_users_id_put }
<a name="scim_v2_users_id_put"></a>

> `scim_v2_users_id_put(id: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update User with SCIM



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_users_id_put(
	# id: String = ""   Eg: id_example
	# The id of the user you wish to update.
	id,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# contentType: String = ""   Eg: application/scim+json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_users_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **scim_v2_users_post**   { #scim_v2_users_post }
<a name="scim_v2_users_post"></a>

> `scim_v2_users_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create User with SCIM



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.scim_v2_users_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/scim+json
	accept,
	# contentType: String = ""   Eg: application/scim+json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "scim_v2_users_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_certificate_cert_id_get**   { #services_certificate_cert_id_get }
<a name="services_certificate_cert_id_get"></a>

> `services_certificate_cert_id_get(certId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Signing Certificate



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_certificate_cert_id_get(
	# certId: String = ""   Eg: certId_example
	# The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header.
	certId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_certificate_cert_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_configuration_mode_actions_disable_post**   { #services_configuration_mode_actions_disable_post }
<a name="services_configuration_mode_actions_disable_post"></a>

> `services_configuration_mode_actions_disable_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Disable Configuration Mode



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_configuration_mode_actions_disable_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: contentType_example
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_configuration_mode_actions_disable_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_configuration_mode_actions_enable_post**   { #services_configuration_mode_actions_enable_post }
<a name="services_configuration_mode_actions_enable_post"></a>

> `services_configuration_mode_actions_enable_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Enable Configuration Mode



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_configuration_mode_actions_enable_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: contentType_example
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_configuration_mode_actions_enable_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_directdata_files_get**   { #services_directdata_files_get }
<a name="services_directdata_files_get"></a>

> `services_directdata_files_get(extractType = "",startTime = null,stopTime = null,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Available Direct Data Files



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_directdata_files_get(
	# extractType: String = ""   Eg: incremental_directdata
	# The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
	extractType,
	# startTime: int   Eg: 2023-12-07T00:00Z
	# Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
	startTime,
	# stopTime: int   Eg: 2023-12-08T00:00Z
	# Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
	stopTime,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_directdata_files_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_directdata_files_name_get**   { #services_directdata_files_name_get }
<a name="services_directdata_files_name_get"></a>

> `services_directdata_files_name_get(name: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Direct Data File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_directdata_files_name_get(
	# name: String = ""   Eg: name_example
	# The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001.
	name,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_directdata_files_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_items_content_item_get**   { #services_file_staging_items_content_item_get }
<a name="services_file_staging_items_content_item_get"></a>

> `services_file_staging_items_content_item_get(item: String,authorization = "",accept = "",some_range = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Item Content



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_items_content_item_get(
	# item: String = ""   Eg: item_example
	# The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
	item,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# some_range: String = ""   Eg: some_range_example
	# Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format `bytes={min}-{max}`. For example, `bytes=0-1000`.
	some_range,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_items_content_item_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_items_item_delete**   { #services_file_staging_items_item_delete }
<a name="services_file_staging_items_item_delete"></a>

> `services_file_staging_items_item_delete(item: String,recursive = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete File or Folder



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_items_item_delete(
	# item: String = ""   Eg: item_example
	# The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
	item,
	# recursive: String = ""   Eg: recursive_example
	# Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
	recursive,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_items_item_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_items_item_get**   { #services_file_staging_items_item_get }
<a name="services_file_staging_items_item_get"></a>

> `services_file_staging_items_item_get(item: String,recursive = "",limit = "",formatResult = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

List Items at a Path



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_items_item_get(
	# item: String = ""   Eg: item_example
	# The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
	item,
	# recursive: String = ""   Eg: recursive_example
	# If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
	recursive,
	# limit: String = ""   Eg: limit_example
	# Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
	limit,
	# formatResult: String = ""   Eg: formatResult_example
	# If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
	formatResult,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_items_item_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_items_item_put**   { #services_file_staging_items_item_put }
<a name="services_file_staging_items_item_put"></a>

> `services_file_staging_items_item_put(item: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Folder or File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_items_item_put(
	# item: String = ""   Eg: item_example
	# The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
	item,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_items_item_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_items_post**   { #services_file_staging_items_post }
<a name="services_file_staging_items_post"></a>

> `services_file_staging_items_post(authorization = "",accept = "",contentMD5 = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Folder or File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_items_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentMD5: String = ""   Eg: contentMD5_example
	# Optional: The MD5 checksum of the file being uploaded.
	contentMD5,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_items_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_upload_get**   { #services_file_staging_upload_get }
<a name="services_file_staging_upload_get"></a>

> `services_file_staging_upload_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

List Upload Sessions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_upload_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_upload_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_upload_post**   { #services_file_staging_upload_post }
<a name="services_file_staging_upload_post"></a>

> `services_file_staging_upload_post(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Resumable Upload Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_upload_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_upload_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_upload_upload_session_id_delete**   { #services_file_staging_upload_upload_session_id_delete }
<a name="services_file_staging_upload_upload_session_id_delete"></a>

> `services_file_staging_upload_upload_session_id_delete(uploadSessionId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Abort Upload Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_upload_upload_session_id_delete(
	# uploadSessionId: String = ""   Eg: uploadSessionId_example
	uploadSessionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_upload_upload_session_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_upload_upload_session_id_get**   { #services_file_staging_upload_upload_session_id_get }
<a name="services_file_staging_upload_upload_session_id_get"></a>

> `services_file_staging_upload_upload_session_id_get(uploadSessionId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Get Upload Session Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_upload_upload_session_id_get(
	# uploadSessionId: String = ""   Eg: uploadSessionId_example
	uploadSessionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_upload_upload_session_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_upload_upload_session_id_parts_get**   { #services_file_staging_upload_upload_session_id_parts_get }
<a name="services_file_staging_upload_upload_session_id_parts_get"></a>

> `services_file_staging_upload_upload_session_id_parts_get(uploadSessionId: String,limit = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

List File Parts Uploaded to Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_upload_upload_session_id_parts_get(
	# uploadSessionId: String = ""   Eg: uploadSessionId_example
	uploadSessionId,
	# limit: String = ""   Eg: limit_example
	# Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
	limit,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_upload_upload_session_id_parts_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_upload_upload_session_id_post**   { #services_file_staging_upload_upload_session_id_post }
<a name="services_file_staging_upload_upload_session_id_post"></a>

> `services_file_staging_upload_upload_session_id_post(uploadSessionId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Commit Upload Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_upload_upload_session_id_post(
	# uploadSessionId: String = ""   Eg: uploadSessionId_example
	uploadSessionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_upload_upload_session_id_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_file_staging_upload_upload_session_id_put**   { #services_file_staging_upload_upload_session_id_put }
<a name="services_file_staging_upload_upload_session_id_put"></a>

> `services_file_staging_upload_upload_session_id_put(uploadSessionId: String,authorization = "",accept = "",contentType = "",xVaultAPIFilePartNumber = "",contentMD5 = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Upload to a Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_file_staging_upload_upload_session_id_put(
	# uploadSessionId: String = ""   Eg: uploadSessionId_example
	uploadSessionId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/octet-stream
	contentType,
	# xVaultAPIFilePartNumber: String = ""   Eg: xVaultAPIFilePartNumber_example
	# The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
	xVaultAPIFilePartNumber,
	# contentMD5: String = ""   Eg: contentMD5_example
	# Optional: The MD5 checksum of the file part being uploaded.
	contentMD5,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_file_staging_upload_upload_session_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_jobs_histories_get**   { #services_jobs_histories_get }
<a name="services_jobs_histories_get"></a>

> `services_jobs_histories_get(startDate = "",endDate = "",status = "",limit = "",offset = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Job Histories



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_jobs_histories_get(
	# startDate: String = ""   Eg: startDate_example
	# Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
	startDate,
	# endDate: String = ""   Eg: endDate_example
	# Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
	endDate,
	# status: String = ""   Eg: status_example
	# Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses.
	status,
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
	limit,
	# offset: String = ""   Eg: offset_example
	# Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51.
	offset,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_jobs_histories_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_jobs_job_id_errors_get**   { #services_jobs_job_id_errors_get }
<a name="services_jobs_job_id_errors_get"></a>

> `services_jobs_job_id_errors_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Import Bulk Translation File Job Errors



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_jobs_job_id_errors_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested import job. This was returned from the Import Bulk Translation File request.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_jobs_job_id_errors_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_jobs_job_id_get**   { #services_jobs_job_id_get }
<a name="services_jobs_job_id_get"></a>

> `services_jobs_job_id_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Job Status



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_jobs_job_id_get(
	# jobId: String = ""   Eg: jobId_example
	# The ID of the job, returned from the original job request.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_jobs_job_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_jobs_job_id_summary_get**   { #services_jobs_job_id_summary_get }
<a name="services_jobs_job_id_summary_get"></a>

> `services_jobs_job_id_summary_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Import Bulk Translation File Job Summary



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_jobs_job_id_summary_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested import job. This was returned from the Import Bulk Translation File request.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_jobs_job_id_summary_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_jobs_job_id_tasks_get**   { #services_jobs_job_id_tasks_get }
<a name="services_jobs_job_id_tasks_get"></a>

> `services_jobs_job_id_tasks_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve SDK Job Tasks



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_jobs_job_id_tasks_get(
	# jobId: String = ""   Eg: jobId_example
	# The ID of the SDK job, returned from the original job request.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_jobs_job_id_tasks_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_jobs_monitors_get**   { #services_jobs_monitors_get }
<a name="services_jobs_monitors_get"></a>

> `services_jobs_monitors_get(startDate = "",endDate = "",status = "",limit = "",offset = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Job Monitors



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_jobs_monitors_get(
	# startDate: String = ""   Eg: startDate_example
	# Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
	startDate,
	# endDate: String = ""   Eg: endDate_example
	# Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
	endDate,
	# status: String = ""   Eg: status_example
	# Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses.
	status,
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
	limit,
	# offset: String = ""   Eg: offset_example
	# Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51.
	offset,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_jobs_monitors_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_jobs_start_now_job_id_post**   { #services_jobs_start_now_job_id_post }
<a name="services_jobs_start_now_job_id_post"></a>

> `services_jobs_start_now_job_id_post(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Start Job



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_jobs_start_now_job_id_post(
	# jobId: String = ""   Eg: jobId_example
	# The ID of the scheduled job instance to start.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_jobs_start_now_job_id_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_loader_extract_post**   { #services_loader_extract_post }
<a name="services_loader_extract_post"></a>

> `services_loader_extract_post(authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Extract Data Files



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_loader_extract_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_loader_extract_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_loader_job_id_tasks_task_id_failurelog_get**   { #services_loader_job_id_tasks_task_id_failurelog_get }
<a name="services_loader_job_id_tasks_task_id_failurelog_get"></a>

> `services_loader_job_id_tasks_task_id_failurelog_get(jobId: String,taskId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Load Failure Log Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_loader_job_id_tasks_task_id_failurelog_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested extract job.
	jobId,
	# taskId: String = ""   Eg: taskId_example
	# The id value of the requested extract task.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_loader_job_id_tasks_task_id_failurelog_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_loader_job_id_tasks_task_id_results_get**   { #services_loader_job_id_tasks_task_id_results_get }
<a name="services_loader_job_id_tasks_task_id_results_get"></a>

> `services_loader_job_id_tasks_task_id_results_get(jobId: String,taskId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Loader Extract Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_loader_job_id_tasks_task_id_results_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested extract job.
	jobId,
	# taskId: String = ""   Eg: taskId_example
	# The id value of the requested extract task.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_loader_job_id_tasks_task_id_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_loader_job_id_tasks_task_id_results_renditions_get**   { #services_loader_job_id_tasks_task_id_results_renditions_get }
<a name="services_loader_job_id_tasks_task_id_results_renditions_get"></a>

> `services_loader_job_id_tasks_task_id_results_renditions_get(jobId: String,taskId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Loader Extract Renditions Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_loader_job_id_tasks_task_id_results_renditions_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested extract job.
	jobId,
	# taskId: String = ""   Eg: taskId_example
	# The id value of the requested extract task.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_loader_job_id_tasks_task_id_results_renditions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_loader_job_id_tasks_task_id_successlog_get**   { #services_loader_job_id_tasks_task_id_successlog_get }
<a name="services_loader_job_id_tasks_task_id_successlog_get"></a>

> `services_loader_job_id_tasks_task_id_successlog_get(jobId: String,taskId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Load Success Log Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_loader_job_id_tasks_task_id_successlog_get(
	# jobId: String = ""   Eg: jobId_example
	# The id value of the requested extract job.
	jobId,
	# taskId: String = ""   Eg: taskId_example
	# The id value of the requested extract task.
	taskId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_loader_job_id_tasks_task_id_successlog_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_loader_load_post**   { #services_loader_load_post }
<a name="services_loader_load_post"></a>

> `services_loader_load_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Load Data Objects



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_loader_load_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_loader_load_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_package_actions_validate_post**   { #services_package_actions_validate_post }
<a name="services_package_actions_validate_post"></a>

> `services_package_actions_validate_post(authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Validate Package



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_package_actions_validate_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_package_actions_validate_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_package_post**   { #services_package_post }
<a name="services_package_post"></a>

> `services_package_post(authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Export Package



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_package_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_package_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_package_put**   { #services_package_put }
<a name="services_package_put"></a>

> `services_package_put(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Import Package



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_package_put(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_package_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_queues_get**   { #services_queues_get }
<a name="services_queues_get"></a>

> `services_queues_get(authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Queues



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_queues_get(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_queues_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_queues_queue_name_actions_disable_delivery_put**   { #services_queues_queue_name_actions_disable_delivery_put }
<a name="services_queues_queue_name_actions_disable_delivery_put"></a>

> `services_queues_queue_name_actions_disable_delivery_put(queueName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Disable Delivery



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_queues_queue_name_actions_disable_delivery_put(
	# queueName: String = ""   Eg: queueName_example
	# The name of a specific Queue.
	queueName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_queues_queue_name_actions_disable_delivery_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_queues_queue_name_actions_enable_delivery_put**   { #services_queues_queue_name_actions_enable_delivery_put }
<a name="services_queues_queue_name_actions_enable_delivery_put"></a>

> `services_queues_queue_name_actions_enable_delivery_put(queueName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Enable Delivery



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_queues_queue_name_actions_enable_delivery_put(
	# queueName: String = ""   Eg: queueName_example
	# The name of a specific Queue.
	queueName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_queues_queue_name_actions_enable_delivery_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_queues_queue_name_actions_reset_put**   { #services_queues_queue_name_actions_reset_put }
<a name="services_queues_queue_name_actions_reset_put"></a>

> `services_queues_queue_name_actions_reset_put(queueName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Reset Queue



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_queues_queue_name_actions_reset_put(
	# queueName: String = ""   Eg: queueName_example
	# The name of a specific Queue.
	queueName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_queues_queue_name_actions_reset_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_queues_queue_name_get**   { #services_queues_queue_name_get }
<a name="services_queues_queue_name_get"></a>

> `services_queues_queue_name_get(queueName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Queue Status



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_queues_queue_name_get(
	# queueName: String = ""   Eg: queueName_example
	# The name of a specific queue. For example, queue__c.
	queueName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_queues_queue_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **services_vobject_vault_package_v_package_id_actions_validate_post**   { #services_vobject_vault_package_v_package_id_actions_validate_post }
<a name="services_vobject_vault_package_v_package_id_actions_validate_post"></a>

> `services_vobject_vault_package_v_package_id_actions_validate_post(packageId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Validate Imported Package



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.services_vobject_vault_package_v_package_id_actions_validate_post(
	# packageId: String = ""   Eg: packageId_example
	# The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI.
	packageId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "services_vobject_vault_package_v_package_id_actions_validate_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **session_delete**   { #session_delete }
<a name="session_delete"></a>

> `session_delete(accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

End Session



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.session_delete(
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	# The Vault sessionId to end.
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "session_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **uicode_distributions_distribution_name_code_get**   { #uicode_distributions_distribution_name_code_get }
<a name="uicode_distributions_distribution_name_code_get"></a>

> `uicode_distributions_distribution_name_code_get(distributionName: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Single Client Code Distribution



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.uicode_distributions_distribution_name_code_get(
	# distributionName: String = ""   Eg: distributionName_example
	# The name attribute of the client code distribution to download.
	distributionName,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "uicode_distributions_distribution_name_code_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **uicode_distributions_distribution_name_delete**   { #uicode_distributions_distribution_name_delete }
<a name="uicode_distributions_distribution_name_delete"></a>

> `uicode_distributions_distribution_name_delete(distributionName: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Single Client Code Distribution



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.uicode_distributions_distribution_name_delete(
	# distributionName: String = ""   Eg: distributionName_example
	# The name attribute of the client code distribution to delete.
	distributionName,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "uicode_distributions_distribution_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **uicode_distributions_distribution_name_get**   { #uicode_distributions_distribution_name_get }
<a name="uicode_distributions_distribution_name_get"></a>

> `uicode_distributions_distribution_name_get(distributionName: String,accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Single Client Code Distribution Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.uicode_distributions_distribution_name_get(
	# distributionName: String = ""   Eg: distributionName_example
	# The name attribute of the client code distribution to delete.
	distributionName,
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "uicode_distributions_distribution_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **uicode_distributions_get**   { #uicode_distributions_get }
<a name="uicode_distributions_get"></a>

> `uicode_distributions_get(accept = "",authorization = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve All Client Code Distribution Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.uicode_distributions_get(
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "uicode_distributions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **uicode_distributions_post**   { #uicode_distributions_post }
<a name="uicode_distributions_post"></a>

> `uicode_distributions_post(accept = "",authorization = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Add or Replace Single Client Code Distribution



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.uicode_distributions_post(
	# accept: String = ""   Eg: application/json
	accept,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: multipart/form-data
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "uicode_distributions_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobject_vault_package_v_package_id_actions_deploy_post**   { #vobject_vault_package_v_package_id_actions_deploy_post }
<a name="vobject_vault_package_v_package_id_actions_deploy_post"></a>

> `vobject_vault_package_v_package_id_actions_deploy_post(packageId: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Deploy Package



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobject_vault_package_v_package_id_actions_deploy_post(
	# packageId: String = ""   Eg: packageId_example
	# The id field value of the vault_package__v object record used for deployment. See Import Package.
	packageId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobject_vault_package_v_package_id_actions_deploy_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobject_vault_package_v_package_id_actions_deploy_results_get**   { #vobject_vault_package_v_package_id_actions_deploy_results_get }
<a name="vobject_vault_package_v_package_id_actions_deploy_results_get"></a>

> `vobject_vault_package_v_package_id_actions_deploy_results_get(packageId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Package Deploy Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobject_vault_package_v_package_id_actions_deploy_results_get(
	# packageId: String = ""   Eg: packageId_example
	# The id field value of the vault_package__v object record used for deployment. See Deploy Package.
	packageId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobject_vault_package_v_package_id_actions_deploy_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_cascadedelete_results_object_name_job_status_job_id_get**   { #vobjects_cascadedelete_results_object_name_job_status_job_id_get }
<a name="vobjects_cascadedelete_results_object_name_job_status_job_id_get"></a>

> `vobjects_cascadedelete_results_object_name_job_status_job_id_get(objectName: String,jobStatus: String,jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Results of Cascade Delete Job



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_cascadedelete_results_object_name_job_status_job_id_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# jobStatus: String = ""   Eg: jobStatus_example
	jobStatus,
	# jobId: String = ""   Eg: jobId_example
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: text/csv
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_cascadedelete_results_object_name_job_status_job_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_deepcopy_results_object_name_job_status_job_id_get**   { #vobjects_deepcopy_results_object_name_job_status_job_id_get }
<a name="vobjects_deepcopy_results_object_name_job_status_job_id_get"></a>

> `vobjects_deepcopy_results_object_name_job_status_job_id_get(objectName: String,jobStatus: String,jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Results of Deep Copy Job



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_deepcopy_results_object_name_job_status_job_id_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# jobStatus: String = ""   Eg: jobStatus_example
	# The ID of the job, retrieved from the response of the job request.
	jobStatus,
	# jobId: String = ""   Eg: jobId_example
	# Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_deepcopy_results_object_name_job_status_job_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_edl_item_v_actions_createplaceholder_post**   { #vobjects_edl_item_v_actions_createplaceholder_post }
<a name="vobjects_edl_item_v_actions_createplaceholder_post"></a>

> `vobjects_edl_item_v_actions_createplaceholder_post(authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create a Placeholder from an EDL Item



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_edl_item_v_actions_createplaceholder_post(
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_edl_item_v_actions_createplaceholder_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_merges_job_id_log_get**   { #vobjects_merges_job_id_log_get }
<a name="vobjects_merges_job_id_log_get"></a>

> `vobjects_merges_job_id_log_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Merge Records Job Log



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_merges_job_id_log_get(
	# jobId: String = ""   Eg: jobId_example
	# The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_merges_job_id_log_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_merges_job_id_results_get**   { #vobjects_merges_job_id_results_get }
<a name="vobjects_merges_job_id_results_get"></a>

> `vobjects_merges_job_id_results_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Record Merge Results



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_merges_job_id_results_get(
	# jobId: String = ""   Eg: jobId_example
	# The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_merges_job_id_results_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_merges_job_id_status_get**   { #vobjects_merges_job_id_status_get }
<a name="vobjects_merges_job_id_status_get"></a>

> `vobjects_merges_job_id_status_get(jobId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Record Merge Status



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_merges_job_id_status_get(
	# jobId: String = ""   Eg: jobId_example
	# The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
	jobId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_merges_job_id_status_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_actions_action_name_post**   { #vobjects_object_name_actions_action_name_post }
<a name="vobjects_object_name_actions_action_name_post"></a>

> `vobjects_object_name_actions_action_name_post(objectName: String,actionName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Object Action on Multiple Records



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_actions_action_name_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value.
	objectName,
	# actionName: String = ""   Eg: actionName_example
	# Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
	actionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_actions_action_name_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_actions_changetype_post**   { #vobjects_object_name_actions_changetype_post }
<a name="vobjects_object_name_actions_changetype_post"></a>

> `vobjects_object_name_actions_changetype_post(objectName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Change Object Type



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_actions_changetype_post(
	# objectName: String = ""   Eg: objectName_example
	# The name of the object.
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_actions_changetype_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_actions_merge_post**   { #vobjects_object_name_actions_merge_post }
<a name="vobjects_object_name_actions_merge_post"></a>

> `vobjects_object_name_actions_merge_post(objectName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "",vobjectsObjectNameActionsMergePostRequestInner = null, on_success: Callable, on_failure: Callable)`

Initiate Record Merge



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_actions_merge_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value. For example, account__v. This object must have Enable Merges configured.
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/json
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# vobjectsObjectNameActionsMergePostRequestInner: Array
	vobjectsObjectNameActionsMergePostRequestInner,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_actions_merge_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_actions_recalculaterollups_get**   { #vobjects_object_name_actions_recalculaterollups_get }
<a name="vobjects_object_name_actions_recalculaterollups_get"></a>

> `vobjects_object_name_actions_recalculaterollups_get(objectName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Roll-up Field Recalculation Status



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_actions_recalculaterollups_get(
	# objectName: String = ""   Eg: objectName_example
	# The name of the object for which to check the status of a Roll-up field recalculation.
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_actions_recalculaterollups_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_actions_recalculaterollups_post**   { #vobjects_object_name_actions_recalculaterollups_post }
<a name="vobjects_object_name_actions_recalculaterollups_post"></a>

> `vobjects_object_name_actions_recalculaterollups_post(objectName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Recalculate Roll-up Fields



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_actions_recalculaterollups_post(
	# objectName: String = ""   Eg: objectName_example
	# The name of the object for which to check the status of a Roll-up field recalculation.
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_actions_recalculaterollups_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_actions_updatecorporatecurrency_put**   { #vobjects_object_name_actions_updatecorporatecurrency_put }
<a name="vobjects_object_name_actions_updatecorporatecurrency_put"></a>

> `vobjects_object_name_actions_updatecorporatecurrency_put(objectName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Corporate Currency Fields



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_actions_updatecorporatecurrency_put(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_actions_updatecorporatecurrency_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_attachments_batch_delete**   { #vobjects_object_name_attachments_batch_delete }
<a name="vobjects_object_name_attachments_batch_delete"></a>

> `vobjects_object_name_attachments_batch_delete(objectName: String,idParam = "",authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Multiple Object Record Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_attachments_batch_delete(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# idParam: String = ""   Eg: If you’re identifying attachments in your input by external id, add idParam=external_id__v to the request endpoint.
	idParam,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_attachments_batch_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_attachments_batch_post**   { #vobjects_object_name_attachments_batch_post }
<a name="vobjects_object_name_attachments_batch_post"></a>

> `vobjects_object_name_attachments_batch_post(objectName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Multiple Object Record Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_attachments_batch_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_attachments_batch_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_attachments_batch_put**   { #vobjects_object_name_attachments_batch_put }
<a name="vobjects_object_name_attachments_batch_put"></a>

> `vobjects_object_name_attachments_batch_put(objectName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Multiple Object Record Attachment Descriptions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_attachments_batch_put(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_attachments_batch_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_delete**   { #vobjects_object_name_delete }
<a name="vobjects_object_name_delete"></a>

> `vobjects_object_name_delete(objectName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Object Records



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_delete(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	# Can be text/csv or application/json
	contentType,
	# accept: String = ""   Eg: application/json
	# Can be text/csv or application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_id_roles_role_name_get**   { #vobjects_object_name_id_roles_role_name_get }
<a name="vobjects_object_name_id_roles_role_name_get"></a>

> `vobjects_object_name_id_roles_role_name_get(objectName: String,id: String,roleName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Record Roles



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_id_roles_role_name_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name.
	objectName,
	# id: String = ""   Eg: id_example
	# The id of the document, binder, or object record.
	id,
	# roleName: String = ""   Eg: roleName_example
	# Optional: Include a role name to filter for a specific role. For example, owner__v.
	roleName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_id_roles_role_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_actions_action_name_get**   { #vobjects_object_name_object_record_id_actions_action_name_get }
<a name="vobjects_object_name_object_record_id_actions_action_name_get"></a>

> `vobjects_object_name_object_record_id_actions_action_name_get(objectName: String,objectRecordId: String,actionName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object User Actions Details



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_actions_action_name_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value.
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value from which to retrieve user actions.
	objectRecordId,
	# actionName: String = ""   Eg: actionName_example
	# The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
	actionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_actions_action_name_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_actions_action_name_post**   { #vobjects_object_name_object_record_id_actions_action_name_post }
<a name="vobjects_object_name_object_record_id_actions_action_name_post"></a>

> `vobjects_object_name_object_record_id_actions_action_name_post(objectName: String,objectRecordId: String,actionName: String,authorization = "",contentType = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Initiate Object Action on a Single Record



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_actions_action_name_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value.
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value from which to retrieve user actions.
	objectRecordId,
	# actionName: String = ""   Eg: actionName_example
	# The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
	actionName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: application/x-www-form-urlencoded
	contentType,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_actions_action_name_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_actions_cascadedelete_post**   { #vobjects_object_name_object_record_id_actions_cascadedelete_post }
<a name="vobjects_object_name_object_record_id_actions_cascadedelete_post"></a>

> `vobjects_object_name_object_record_id_actions_cascadedelete_post(objectName: String,objectRecordId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Cascade Delete Object Record



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_actions_cascadedelete_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_actions_cascadedelete_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_actions_deepcopy_post**   { #vobjects_object_name_object_record_id_actions_deepcopy_post }
<a name="vobjects_object_name_object_record_id_actions_deepcopy_post"></a>

> `vobjects_object_name_object_record_id_actions_deepcopy_post(objectName: String,objectRecordId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Deep Copy Object Record



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_actions_deepcopy_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_actions_deepcopy_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_actions_get**   { #vobjects_object_name_object_record_id_actions_get }
<a name="vobjects_object_name_object_record_id_actions_get"></a>

> `vobjects_object_name_object_record_id_actions_get(objectName: String,objectRecordId: String,loc = null,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Record User Actions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_actions_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value.
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# loc: bool   Eg: true
	# Optional: When true, retrieves localized (translated) strings for the label. 
	loc,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_actions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get**   { #vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get }
<a name="vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get"></a>

> `vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(objectName: String,objectRecordId: String,attachmentFieldName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Attachment Field File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value. For example, product__v.
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentFieldName: String = ""   Eg: attachmentFieldName_example
	# The name of the Attachment field to update.
	attachmentFieldName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post**   { #vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post }
<a name="vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post"></a>

> `vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(objectName: String,objectRecordId: String,attachmentFieldName: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Attachment Field File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value. For example, product__v.
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentFieldName: String = ""   Eg: attachmentFieldName_example
	# The name of the Attachment field to update.
	attachmentFieldName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachment_fields_file_get**   { #vobjects_object_name_object_record_id_attachment_fields_file_get }
<a name="vobjects_object_name_object_record_id_attachment_fields_file_get"></a>

> `vobjects_object_name_object_record_id_attachment_fields_file_get(objectName: String,objectRecordId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download All Attachment Field Files



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachment_fields_file_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value. For example, product__v.
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachment_fields_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_delete**   { #vobjects_object_name_object_record_id_attachments_attachment_id_delete }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_delete"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_delete(objectName: String,objectRecordId: String,attachmentId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Object Record Attachment



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_delete(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_get**   { #vobjects_object_name_object_record_id_attachments_attachment_id_get }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_get"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_get(objectName: String,objectRecordId: String,attachmentId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Record Attachment Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_put**   { #vobjects_object_name_object_record_id_attachments_attachment_id_put }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_put"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_put(objectName: String,objectRecordId: String,attachmentId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Object Record Attachment Description



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_put(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete**   { #vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(objectName: String,objectRecordId: String,attachmentId: String,attachmentVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Delete Object Record Attachment Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The attachment version__v field value.
	attachmentVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get**   { #vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(objectName: String,objectRecordId: String,attachmentId: String,attachmentVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download Object Record Attachment File



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	attachmentVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get**   { #vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(objectName: String,objectRecordId: String,attachmentId: String,attachmentVersion: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Record Attachment Version Metadata



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The attachment version__v field value.
	attachmentVersion,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post**   { #vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(objectName: String,objectRecordId: String,attachmentId: String,attachmentVersion: String,restore = null,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Restore Object Record Attachment Version



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# attachmentVersion: String = ""   Eg: attachmentVersion_example
	# The attachment version__v field value.
	attachmentVersion,
	# restore: bool   Eg: true
	restore,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_attachment_id_versions_get**   { #vobjects_object_name_object_record_id_attachments_attachment_id_versions_get }
<a name="vobjects_object_name_object_record_id_attachments_attachment_id_versions_get"></a>

> `vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(objectName: String,objectRecordId: String,attachmentId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Record Attachment Versions



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# attachmentId: String = ""   Eg: attachmentId_example
	# The attachment id field value.
	attachmentId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_attachment_id_versions_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_file_get**   { #vobjects_object_name_object_record_id_attachments_file_get }
<a name="vobjects_object_name_object_record_id_attachments_file_get"></a>

> `vobjects_object_name_object_record_id_attachments_file_get(objectName: String,objectRecordId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Download All Object Record Attachment Files



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_file_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_file_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_get**   { #vobjects_object_name_object_record_id_attachments_get }
<a name="vobjects_object_name_object_record_id_attachments_get"></a>

> `vobjects_object_name_object_record_id_attachments_get(objectName: String,objectRecordId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Record Attachments



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_attachments_post**   { #vobjects_object_name_object_record_id_attachments_post }
<a name="vobjects_object_name_object_record_id_attachments_post"></a>

> `vobjects_object_name_object_record_id_attachments_post(objectName: String,objectRecordId: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create Object Record Attachment



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_attachments_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: application/json
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_attachments_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_audittrail_get**   { #vobjects_object_name_object_record_id_audittrail_get }
<a name="vobjects_object_name_object_record_id_audittrail_get"></a>

> `vobjects_object_name_object_record_id_audittrail_get(objectName: String,objectRecordId: String,startDate = "",endDate = "",formatResult = "",limit = "",offset = "",events = "",authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Complete Audit History for a Single Object Record



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_audittrail_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value.
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value from which to retrieve user actions.
	objectRecordId,
	# startDate: String = ""   Eg: startDate_example
	# Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date. 
	startDate,
	# endDate: String = ""   Eg: endDate_example
	# Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
	endDate,
	# formatResult: String = ""   Eg: formatResult_example
	# To request a CSV file of your audit history, use csv. 
	formatResult,
	# limit: String = ""   Eg: limit_example
	# Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
	limit,
	# offset: String = ""   Eg: offset_example
	# Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
	offset,
	# events: String = ""   Eg: events_example
	# Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events=Copy,Edit,Delete. If omitted, defaults to all audit events.
	events,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_audittrail_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_object_record_id_get**   { #vobjects_object_name_object_record_id_get }
<a name="vobjects_object_name_object_record_id_get"></a>

> `vobjects_object_name_object_record_id_get(objectName: String,objectRecordId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Object Record



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_object_record_id_get(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# objectRecordId: String = ""   Eg: objectRecordId_example
	# The object record id field value.
	objectRecordId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_object_record_id_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_post**   { #vobjects_object_name_post }
<a name="vobjects_object_name_post"></a>

> `vobjects_object_name_post(objectName: String,idParam = "",authorization = "",contentType = "",accept = "",xVaultAPIMigrationMode = null,xVaultAPINoTriggers = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Create & Upsert Object Records



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_post(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# idParam: String = ""   Eg: idParam_example
	# To upsert object records, add `idParam={field_name}` to the request endpoint. You can use any object field which has `unique` set to `true` in the object metadata. For example, `idParam=external_id__v`.
	idParam,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	# Can be text/csv or application/json
	contentType,
	# accept: String = ""   Eg: application/json
	# Can be text/csv or application/json
	accept,
	# xVaultAPIMigrationMode: bool   Eg: true
	# If set to `true`, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
	xVaultAPIMigrationMode,
	# xVaultAPINoTriggers: bool   Eg: true
	# If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
	xVaultAPINoTriggers,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_put**   { #vobjects_object_name_put }
<a name="vobjects_object_name_put"></a>

> `vobjects_object_name_put(objectName: String,authorization = "",contentType = "",accept = "",xVaultAPIMigrationMode = null,xVaultAPINoTriggers = null,xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Update Object Records



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_put(
	# objectName: String = ""   Eg: objectName_example
	# The object name__v field value (product__v, country__v, custom_object__c, etc.).
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# contentType: String = ""   Eg: text/csv
	# Can be text/csv or application/json
	contentType,
	# accept: String = ""   Eg: application/json
	# Can be text/csv or application/json
	accept,
	# xVaultAPIMigrationMode: bool   Eg: true
	# If set to `true`, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
	xVaultAPIMigrationMode,
	# xVaultAPINoTriggers: bool   Eg: true
	# If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
	xVaultAPINoTriggers,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_put", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_roles_delete**   { #vobjects_object_name_roles_delete }
<a name="vobjects_object_name_roles_delete"></a>

> `vobjects_object_name_roles_delete(objectName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Remove Users & Groups from Roles on Object Records



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_roles_delete(
	# objectName: String = ""   Eg: objectName_example
	# The name of the object where you want to remove roles.
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_roles_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_object_name_roles_post**   { #vobjects_object_name_roles_post }
<a name="vobjects_object_name_roles_post"></a>

> `vobjects_object_name_roles_post(objectName: String,authorization = "",accept = "",contentType = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Assign Users & Groups to Roles on Object Records



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_object_name_roles_post(
	# objectName: String = ""   Eg: objectName_example
	# The name of the object where you want to remove roles.
	objectName,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# contentType: String = ""   Eg: text/csv
	contentType,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_object_name_roles_post", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **vobjects_outbound_package_v_package_id_dependencies_get**   { #vobjects_outbound_package_v_package_id_dependencies_get }
<a name="vobjects_outbound_package_v_package_id_dependencies_get"></a>

> `vobjects_outbound_package_v_package_id_dependencies_get(packageId: String,authorization = "",accept = "",xVaultAPIClientID = "", on_success: Callable, on_failure: Callable)`

Retrieve Outbound Package Dependencies



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.vobjects_outbound_package_v_package_id_dependencies_get(
	# packageId: String = ""   Eg: packageId_example
	# The ID of the outbound_package__v record from which to retrieve dependencies.
	packageId,
	# authorization: String = ""   Eg: {{sessionId}}
	authorization,
	# accept: String = ""   Eg: application/json
	accept,
	# xVaultAPIClientID: String = ""   Eg: {{clientId}}
	# Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
	xVaultAPIClientID,
	# On Success
	func(response):
		prints("Success!", "vobjects_outbound_package_v_package_id_dependencies_get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

